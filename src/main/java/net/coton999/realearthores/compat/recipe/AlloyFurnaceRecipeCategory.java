package net.coton999.realearthores.compat.recipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.recipe.machines.AlloyFurnaceRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class AlloyFurnaceRecipeCategory implements IRecipeCategory<AlloyFurnaceRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(RealEarthOres.MOD_ID, "alloy_furnace");
    public static final ResourceLocation TEXTURE = new ResourceLocation(RealEarthOres.MOD_ID,
            "textures/gui/container/machine/coal/alloy_furnace.png");

    public static final RecipeType<AlloyFurnaceRecipe> ALLOY_FURNACE_TYPE =
            new RecipeType<>(UID, AlloyFurnaceRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public AlloyFurnaceRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 23, 14, 116, 58);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(REOBlocks.ALLOY_FURNACE.get()));
    }


    @Override
    public RecipeType<AlloyFurnaceRecipe> getRecipeType() {
        return ALLOY_FURNACE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Alloy Furnace");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, AlloyFurnaceRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 3).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 29, 3).addIngredients(recipe.getIngredients().get(1));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 112, 58).addItemStack(recipe.getResultItem(null));
    }
}