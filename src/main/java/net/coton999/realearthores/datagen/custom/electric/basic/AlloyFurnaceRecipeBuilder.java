package net.coton999.realearthores.datagen.custom.electric.basic;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.coton999.realearthores.RealEarthOres;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.StrictNBTIngredient;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class AlloyFurnaceRecipeBuilder implements RecipeBuilder {
    private final Item result;
    private final StrictNBTIngredient ingredient1;
    private final StrictNBTIngredient ingredient2;
    private final int count;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();

    public AlloyFurnaceRecipeBuilder(ItemLike pResult, StrictNBTIngredient pIngredient1, StrictNBTIngredient pIngredient2, int pCount) {
        this.ingredient1 = pIngredient1;
        this.ingredient2 = pIngredient2;
        this.result = pResult.asItem();
        this.count = pCount;
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

        pFinishedRecipeConsumer.accept(new Result(pRecipeId, this.result, this.count, this.ingredient1, this.ingredient2,
                this.advancement, new ResourceLocation(pRecipeId.getNamespace(), "recipes/"
                + pRecipeId.getPath())));

    }

    public static class Result implements FinishedRecipe {
        private final ResourceLocation id;
        private final Item result;
        private final Ingredient ingredient1;
        private final Ingredient ingredient2;
        private final int count;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation pId, Item pResult, int pCount, Ingredient pIngredient1, Ingredient pIngredient2, Advancement.Builder pAdvancement,
                      ResourceLocation pAdvancementId) {
            this.id = pId;
            this.result = pResult;
            this.count = pCount;
            this.ingredient1 = pIngredient1;
            this.ingredient2 = pIngredient2;
            this.advancement = pAdvancement;
            this.advancementId = pAdvancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject pJson) {
            JsonArray jsonarray = new JsonArray();
            jsonarray.add(ingredient1.toJson());
            jsonarray.add(ingredient2.toJson());

            pJson.add("ingredients", jsonarray);
            JsonObject jsonobject = new JsonObject();
            jsonobject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
            if (this.count > 1) {
                jsonobject.addProperty("count", this.count);
            }

            pJson.add("result", jsonobject);
        }

        @Override
        public ResourceLocation getId() {
            return new ResourceLocation(RealEarthOres.MOD_ID,
                    ForgeRegistries.ITEMS.getKey(this.result).getPath() + "_from_alloy_smelting");
        }

        @Override
        public RecipeSerializer<?> getType() {
            return net.coton999.realearthores.recipe.machines.electric.basic.AlloyFurnaceRecipe.Serializer.INSTANCE;
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