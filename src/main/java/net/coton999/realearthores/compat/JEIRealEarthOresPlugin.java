package net.coton999.realearthores.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.compat.recipe.AlloyFurnaceRecipeCategory;
import net.coton999.realearthores.compat.recipe.CrushingRecipeCategory;
import net.coton999.realearthores.compat.recipe.KilnRecipeCategory;
import net.coton999.realearthores.compat.recipe.SawmillRecipeCategory;
import net.coton999.realearthores.recipe.machines.coal.KilnRecipe;
import net.coton999.realearthores.recipe.machines.electric.AlloyFurnaceRecipe;
import net.coton999.realearthores.recipe.machines.electric.CrusherRecipe;
import net.coton999.realearthores.recipe.machines.electric.SawmillRecipe;
import net.coton999.realearthores.screen.machines.coal.KilnScreen;
import net.coton999.realearthores.screen.machines.electric.AlloyFurnaceScreen;
import net.coton999.realearthores.screen.machines.electric.CrusherScreen;
import net.coton999.realearthores.screen.machines.electric.SawmillScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIRealEarthOresPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(RealEarthOres.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new KilnRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CrushingRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new SawmillRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new AlloyFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<KilnRecipe> kilnRecipes = recipeManager.getAllRecipesFor(KilnRecipe.Type.INSTANCE);
        registration.addRecipes(KilnRecipeCategory.KILN_TYPE, kilnRecipes);

        List<CrusherRecipe> crusherRecipes = recipeManager.getAllRecipesFor(CrusherRecipe.Type.INSTANCE);
        registration.addRecipes(CrushingRecipeCategory.CRUSHER_TYPE, crusherRecipes);

        List<SawmillRecipe> sawmillRecipes = recipeManager.getAllRecipesFor(SawmillRecipe.Type.INSTANCE);
        registration.addRecipes(SawmillRecipeCategory.SAWMILL_TYPE, sawmillRecipes);

        List<AlloyFurnaceRecipe> alloyfurnaceRecipes = recipeManager.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE, alloyfurnaceRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(KilnScreen.class, 78, 33, 26, 19,
                KilnRecipeCategory.KILN_TYPE);
        registration.addRecipeClickArea(CrusherScreen.class, 78, 33, 26, 19,
                CrushingRecipeCategory.CRUSHER_TYPE);
        registration.addRecipeClickArea(SawmillScreen.class, 78, 33, 26, 19,
                SawmillRecipeCategory.SAWMILL_TYPE);
        registration.addRecipeClickArea(AlloyFurnaceScreen.class, 78, 33, 26, 19,
                AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
    }
}