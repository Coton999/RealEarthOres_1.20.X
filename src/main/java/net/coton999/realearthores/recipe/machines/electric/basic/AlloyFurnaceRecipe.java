package net.coton999.realearthores.recipe.machines.electric.basic;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.coton999.realearthores.RealEarthOres;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class AlloyFurnaceRecipe implements Recipe<SimpleContainer> {

    private final NonNullList<Ingredient> input;
    private final ItemStack result;
    private final ResourceLocation id;

    public AlloyFurnaceRecipe(ResourceLocation pID, ItemStack pResult, NonNullList<Ingredient> pInput) {
        this.id = pID;
        this.result = pResult;
        this.input = pInput;
    }
    public int getCookingTime() {
        int cookingTime = 200;
        return cookingTime;
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

        return this.input;
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
            ItemStack pResult = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));

            JsonArray pIngredient = GsonHelper.getAsJsonArray(pJson, "ingredients");
            NonNullList<Ingredient> pInput = NonNullList.withSize(2, Ingredient.EMPTY);

            for (int i = 0; i < pInput.size(); i++) {
                pInput.set(i, Ingredient.fromJson(pIngredient.get(i)));
            }

            return new AlloyFurnaceRecipe(pRecipeId, pResult, pInput);
        }

        @Override
        public AlloyFurnaceRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> pInput = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < pInput.size(); i++) {
                pInput.set(i, Ingredient.fromNetwork(pBuffer));
            }

            ItemStack pResult = pBuffer.readItem();
            return new AlloyFurnaceRecipe(pRecipeId, pResult, pInput);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, AlloyFurnaceRecipe pRecipe) {
            pBuffer.writeInt(pRecipe.getIngredients().size());

            for (Ingredient ing : pRecipe.getIngredients()) {
                ing.toNetwork(pBuffer);
            }
            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);
        }
    }
}