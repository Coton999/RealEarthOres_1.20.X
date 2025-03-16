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
import net.coton999.realearthores.recipe.machines.electric.SawmillRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class SawmillRecipeCategory implements IRecipeCategory<SawmillRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(RealEarthOres.MOD_ID, "sawmill");
    public static final ResourceLocation TEXTURE = new ResourceLocation(RealEarthOres.MOD_ID,
            "textures/gui/container/machine/coal/sawmill.png");

    public static final RecipeType<SawmillRecipe> SAWMILL_TYPE =
            new RecipeType<>(UID, SawmillRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public SawmillRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 53, 14, 86, 58);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(REOBlocks.SAWMILL.get()));
    }


    @Override
    public RecipeType<SawmillRecipe> getRecipeType() {
        return SAWMILL_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Sawmill");
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
    public void setRecipe(IRecipeLayoutBuilder builder, SawmillRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 3, 3).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 63, 21).addItemStack(recipe.getResultItem(null));
    }
}