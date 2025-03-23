package net.coton999.realearthores.compat.recipe.electric.basic;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.recipe.machines.electric.basic.ExtractorRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ExtractorRecipeCategory implements IRecipeCategory<ExtractorRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(RealEarthOres.MOD_ID, "extractor");
    public static final ResourceLocation TEXTURE = new ResourceLocation(RealEarthOres.MOD_ID,
            "textures/gui/container/machine/electric/machine.png");

    public static final RecipeType<ExtractorRecipe> EXTRACTOR_TYPE =
            new RecipeType<>(UID, ExtractorRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;
    private final int regularCookTime;
    private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;

    public ExtractorRecipeCategory(IGuiHelper guiHelper, int regularCookTime) {
        this.background = guiHelper.createDrawable(TEXTURE, 55, 16, 82, 54);
        this.staticFlame = guiHelper.createDrawable(TEXTURE, 176, 17, 9, 15);
        this.animatedFlame = guiHelper.createAnimatedDrawable(this.staticFlame, 40, IDrawableAnimated.StartDirection.BOTTOM, true);
        this.regularCookTime = regularCookTime;
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(REOBlocks.ELECTRIC_EXTRACTOR.get()));
        this.cachedArrows = CacheBuilder.newBuilder().maximumSize(25L).build(new CacheLoader<Integer, IDrawableAnimated>() {

            public IDrawableAnimated load(Integer cookTime) {
                return guiHelper.drawableBuilder(TEXTURE, 176, 0, 23, 17).buildAnimated(cookTime, IDrawableAnimated.StartDirection.LEFT, false);
            }
        });
       }


    @Override
    public RecipeType<ExtractorRecipe> getRecipeType() {
        return EXTRACTOR_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Extracting");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    protected IDrawableAnimated getArrow(ExtractorRecipe recipe) {
        int cookTime = recipe.getCookingTime();
        if (cookTime <= 0) {
            cookTime = this.regularCookTime;
        }

        return (IDrawableAnimated)this.cachedArrows.getUnchecked(cookTime);
    }

    public void draw(ExtractorRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        this.animatedFlame.draw(guiGraphics, 4, 19);
        IDrawableAnimated arrow = this.getArrow(recipe);
        arrow.draw(guiGraphics, 24, 18);
        this.drawCookTime(recipe, guiGraphics, 45);
    }


    protected void drawCookTime(ExtractorRecipe recipe, GuiGraphics guiGraphics, int y) {
        int cookTime = recipe.getCookingTime();
        if (cookTime > 0) {
            int cookTimeSeconds = cookTime / 20;
            Component timeString = Component.translatable("gui.jei.category.smelting.time.seconds", new Object[]{cookTimeSeconds});
            Minecraft minecraft = Minecraft.getInstance();
            Font fontRenderer = minecraft.font;
            int stringWidth = fontRenderer.width(timeString);
            guiGraphics.drawString(fontRenderer, timeString, this.getWidth() - stringWidth, y, -8355712, false);
        }

    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ExtractorRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 61, 19).addItemStack(recipe.getResultItem(null));
    }
}