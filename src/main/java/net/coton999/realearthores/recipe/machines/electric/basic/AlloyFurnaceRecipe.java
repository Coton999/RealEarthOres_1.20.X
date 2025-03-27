package net.coton999.realearthores.recipe.machines.electric.basic;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.util.CountedIngredient;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class AlloyFurnaceRecipe implements Recipe<SimpleContainer> {

    private final List<CountedIngredient> input;
    private final ItemStack result;
    private final ResourceLocation id;

    public AlloyFurnaceRecipe(ResourceLocation pID, ItemStack pResult, List<CountedIngredient> pInput) {
        this.id = pID;
        this.result = pResult;
        this.input = pInput;
    }

    public int getCookingTime() {
        return 200;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        return input.get(0).test(pContainer.getItem(1)) && input.get(1).test(pContainer.getItem(2));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {

        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {

        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {

        return result.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {

        return NonNullList.of(Ingredient.EMPTY, input.stream().map(CountedIngredient::ingredient).toArray(Ingredient[]::new));
    }

    @Override
    public ResourceLocation getId() {

        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {

        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {

        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlloyFurnaceRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "alloying";
    }

    public static class Serializer implements RecipeSerializer<AlloyFurnaceRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID =
                new ResourceLocation(RealEarthOres.MOD_ID,"alloying");

        @Override
        public AlloyFurnaceRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {

            JsonArray pIngredient = GsonHelper.getAsJsonArray(pJson, "ingredients");
            List<CountedIngredient> pInput = new ArrayList<>(pIngredient.size());

            for (int i = 0; i < pIngredient.size(); i++) {
                pInput.add(i, CountedIngredient.fromJson(pIngredient.get(i).getAsJsonObject()));
            }


            ItemStack pResult = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));

            return new AlloyFurnaceRecipe(pRecipeId, pResult, pInput);
        }

        @Override
        public AlloyFurnaceRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            List<CountedIngredient> pInput = pBuffer.readList(CountedIngredient::fromNetwork);

            ItemStack pResult = pBuffer.readItem();
            return new AlloyFurnaceRecipe(pRecipeId, pResult, pInput);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, AlloyFurnaceRecipe pRecipe) {
            pBuffer.writeCollection(pRecipe.input, (buf, ing) -> ing.toNetwork(buf));

            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);
        }
    }
}