package net.coton999.realearthores.recipe.machines.coal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.coton999.realearthores.block.REOBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class BasicCrusherRecipe extends AbstractCookingRecipe {
    public BasicCrusherRecipe(ResourceLocation pId, String pGroup,
                              CookingBookCategory pCategory, Ingredient pIngredient, ItemStack pResult, float pExperience, int pCookingTime) {
        super(Type.INSTANCE, pId, pGroup, pCategory, pIngredient, pResult, pExperience, pCookingTime);
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(REOBlocks.CRUSHER.get());
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    public static class Type implements RecipeType<BasicCrusherRecipe> {
        public static final Type INSTANCE = new Type();
    }

    public static class Serializer implements RecipeSerializer<BasicCrusherRecipe> {
        private final int defaultCookingTime;
        public static final BasicCrusherRecipe.Serializer INSTANCE = new Serializer(50);

        public Serializer(int defaultCookingTime) {
            this.defaultCookingTime = defaultCookingTime;
        }

        public BasicCrusherRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
            String pString = GsonHelper.getAsString(pJson, "group", "");
            CookingBookCategory pCookingBookCategory = CookingBookCategory.CODEC.byName(GsonHelper.getAsString(pJson, "category", (String)null), CookingBookCategory.MISC);
            JsonElement jsonelement = (JsonElement)(GsonHelper.isArrayNode(pJson, "ingredient") ? GsonHelper.getAsJsonArray(pJson, "ingredient") : GsonHelper.getAsJsonObject(pJson, "ingredient"));
            Ingredient pIngredient = Ingredient.fromJson(jsonelement, false);
            //Forge: Check if primitive string to keep vanilla or a object which can contain a count field.
            if (!pJson.has("result")) throw new com.google.gson.JsonSyntaxException("Missing result, expected to find a string or object");
            ItemStack pItemStack;
            if (pJson.get("result").isJsonObject()) pItemStack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));
            else {
                String s1 = GsonHelper.getAsString(pJson, "result");
                ResourceLocation resourcelocation = new ResourceLocation(s1);
                pItemStack = new ItemStack(BuiltInRegistries.ITEM.getOptional(resourcelocation).orElseThrow(() -> {
                    return new IllegalStateException("Item: " + s1 + " does not exist");
                }));
            }
            float pExperience = GsonHelper.getAsFloat(pJson, "experience", 0.0F);
            int pCookingTime = GsonHelper.getAsInt(pJson, "cookingtime", this.defaultCookingTime);
            return new BasicCrusherRecipe(pRecipeId, pString, pCookingBookCategory, pIngredient, pItemStack, pExperience, pCookingTime);
        }

        public BasicCrusherRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            String pString = pBuffer.readUtf();
            CookingBookCategory pCookingBookCategory = pBuffer.readEnum(CookingBookCategory.class);
            Ingredient pIngredient = Ingredient.fromNetwork(pBuffer);
            ItemStack pResult = pBuffer.readItem();
            float pExperience = pBuffer.readFloat();
            int pCookingTime = pBuffer.readVarInt();
            return new BasicCrusherRecipe(pRecipeId, pString, pCookingBookCategory, pIngredient, pResult, pExperience, pCookingTime);
        }

        public void toNetwork(FriendlyByteBuf pBuffer, BasicCrusherRecipe pRecipe) {
            pBuffer.writeUtf(pRecipe.group);
            pBuffer.writeEnum(pRecipe.category());
            pRecipe.ingredient.toNetwork(pBuffer);
            pBuffer.writeItem(pRecipe.result);
            pBuffer.writeFloat(pRecipe.experience);
            pBuffer.writeVarInt(pRecipe.cookingTime);
        }
    }
}