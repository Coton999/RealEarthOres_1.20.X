package net.coton999.realearthores.compat.recipe.coal;

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
import net.coton999.realearthores.recipe.machines.coal.BasicPurifierRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class BasicPurifierRecipeCategory implements IRecipeCategory<BasicPurifierRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(RealEarthOres.MOD_ID, "basic_purifier");
    public static final ResourceLocation TEXTURE = new ResourceLocation("jei", "textures/jei/gui/gui_vanilla.png");

    public static final RecipeType<BasicPurifierRecipe> BASIC_PURIFIER_TYPE =
            new RecipeType<>(UID, BasicPurifierRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;
    private final int regularCookTime;
    private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;

    public BasicPurifierRecipeCategory(IGuiHelper guiHelper, int regularCookTime) {
        this.background = guiHelper.createDrawable(TEXTURE, 0, 114, 82, 54);
        this.staticFlame = guiHelper.createDrawable(TEXTURE, 82, 114, 14, 14);
        this.animatedFlame = guiHelper.createAnimatedDrawable(this.staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
        this.regularCookTime = regularCookTime;
        this.icon = guiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(REOBlocks.PURIFIER.get()));
        this.cachedArrows = CacheBuilder.newBuilder().maximumSize(25L).build(new CacheLoader<Integer, IDrawableAnimated>() {

            public IDrawableAnimated load(Integer cookTime) {
                return guiHelper.drawableBuilder(TEXTURE, 82, 128, 24, 17).buildAnimated(cookTime, IDrawableAnimated.StartDirection.LEFT, false);
            }
        });
    }

    @Override
    public mezz.jei.api.recipe.RecipeType<BasicPurifierRecipe> getRecipeType() {
        return BASIC_PURIFIER_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Coal Purifying");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    protected IDrawableAnimated getArrow(BasicPurifierRecipe recipe) {
        int cookTime = recipe.getCookingTime();
        if (cookTime <= 0) {
            cookTime = this.regularCookTime;
        }

        return (IDrawableAnimated)this.cachedArrows.getUnchecked(cookTime);
    }

    @Override
    public void draw(BasicPurifierRecipe pRecipe, IRecipeSlotsView pREcipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        this.animatedFlame.draw(guiGraphics, 1, 20);
        IDrawableAnimated arrow = this.getArrow(pRecipe);
        arrow.draw(guiGraphics, 24, 18);
        this.drawExperience(pRecipe, guiGraphics, 0);
        this.drawCookTime(pRecipe, guiGraphics, 45);
    }

    protected void drawExperience(BasicPurifierRecipe pRecipe, GuiGraphics guiGraphics, int y) {
        float experience = pRecipe.getExperience();
        if (experience > 0.0F) {
            Component experienceString = Component.translatable("gui.jei.category.smelting.experience", new Object[]{experience});
            Minecraft minecraft = Minecraft.getInstance();
            Font fontRenderer = minecraft.font;
            int stringWidth = fontRenderer.width(experienceString);
            guiGraphics.drawString(fontRenderer, experienceString, this.getWidth() - stringWidth, y, -8355712, false);
        }

    }

    protected void drawCookTime(BasicPurifierRecipe pRecipe, GuiGraphics guiGraphics, int y) {
        int cookTime = pRecipe.getCookingTime();
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
    public void setRecipe(IRecipeLayoutBuilder builder, BasicPurifierRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 1, 1).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 61, 19).addItemStack(recipe.getResultItem(null));
    }
}