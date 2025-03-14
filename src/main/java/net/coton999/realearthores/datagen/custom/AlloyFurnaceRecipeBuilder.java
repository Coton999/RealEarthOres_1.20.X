package net.coton999.realearthores.datagen.custom;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.recipe.machines.AlloyFurnaceRecipe;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class AlloyFurnaceRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final NonNullList<Ingredient> ingredient;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();
    private  final  String name;

    public AlloyFurnaceRecipeBuilder(NonNullList<Ingredient> ingredient, ItemLike result, int count, String name) {
        this.ingredient = ingredient;
        this.result = result.asItem();
        this.count = count;
        this.name = name;
    }

    @Override
    public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
        this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String pGroupName) {
        return this;
    }

    @Override
    public Item getResult() {
        return result;
    }

    @Override
    public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
                .rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);

        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.count, this.ingredient,
                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/"
                + pRecipeId.getPath()), this.name));

    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final NonNullList<Ingredient> ingredient;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;
        private  final  String name;

        public Result(ResourceLocation pId, Item pResult, int pCount, NonNullList<Ingredient> ingredient, Advancement.Builder pAdvancement,
                      ResourceLocation pAdvancementId, String pName) {
            this.id = pId;
            this.result = pResult;
            this.count = pCount;
            this.ingredient = ingredient;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
            this.name = pName;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonarray = new JsonArray();
            for (int i = 0; i < ingredient.size(); i++) {
                jsonarray.add(ingredient.get(i).toJson());
            }

            pJson.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }

            pJson.add("output", jsonobject);
        }

        @Override
        public ResourceLocation getId() {
            return new ResourceLocation(RealEarthOres.MOD_ID,
                    ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_alloying" + name);
        }

        @Override
        public RecipeSerializer<?> getType() {
            return AlloyFurnaceRecipe.Serializer.INSTANCE;
        }

        @javax.annotation.Nullable
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @javax.annotation.Nullable
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}