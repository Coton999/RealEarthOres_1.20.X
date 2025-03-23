package net.coton999.realearthores.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.compat.recipe.coal.*;
import net.coton999.realearthores.compat.recipe.electric.basic.*;
import net.coton999.realearthores.recipe.machines.coal.*;
import net.coton999.realearthores.recipe.machines.electric.basic.*;
import net.coton999.realearthores.screen.machines.coal.*;
import net.coton999.realearthores.screen.machines.electric.basic.*;
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
        // Coal //
        registration.addRecipeCategories(new KilnRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 100));
        registration.addRecipeCategories(new BasicCrusherRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new BasicCompressorRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 400));
        registration.addRecipeCategories(new BasicExtractorRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 400));

        // Electric //
        // Basic
        registration.addRecipeCategories(new ElectricFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new CrusherRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new ExtractorRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new CompressorRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new SawmillRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
        registration.addRecipeCategories(new AlloyFurnaceRecipeCategory(
                registration.getJeiHelpers().getGuiHelper(), 200));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        // Coal //
        List<KilnRecipe> kilnRecipes = recipeManager.getAllRecipesFor(KilnRecipe.Type.INSTANCE);
        registration.addRecipes(KilnRecipeCategory.KILN_TYPE, kilnRecipes);
        List<BasicCrusherRecipe> basicCrusherRecipes = recipeManager.getAllRecipesFor(BasicCrusherRecipe.Type.INSTANCE);
        registration.addRecipes(BasicCrusherRecipeCategory.BASIC_CRUSHER_TYPE, basicCrusherRecipes);
        List<BasicCompressorRecipe> basicCompressorRecipes = recipeManager.getAllRecipesFor(BasicCompressorRecipe.Type.INSTANCE);
        registration.addRecipes(BasicCompressorRecipeCategory.BASIC_COMPRESSOR_TYPE, basicCompressorRecipes);
        List<BasicExtractorRecipe> basicExtractorRecipes = recipeManager.getAllRecipesFor(BasicExtractorRecipe.Type.INSTANCE);
        registration.addRecipes(BasicExtractorRecipeCategory.BASIC_EXTRACTOR_TYPE, basicExtractorRecipes);

        // Electric //
        // Basic
        List<ElectricFurnaceRecipe> electricFurnaceRecipes = recipeManager.getAllRecipesFor(ElectricFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(ElectricFurnaceRecipeCategory.ELECTRIC_FURNACE_TYPE, electricFurnaceRecipes);
        List<CrusherRecipe> crusherRecipes = recipeManager.getAllRecipesFor(CrusherRecipe.Type.INSTANCE);
        registration.addRecipes(CrusherRecipeCategory.CRUSHER_TYPE, crusherRecipes);
        List<ExtractorRecipe> extractorRecipes = recipeManager.getAllRecipesFor(ExtractorRecipe.Type.INSTANCE);
        registration.addRecipes(ExtractorRecipeCategory.EXTRACTOR_TYPE, extractorRecipes);
        List<CompressorRecipe> compressorRecipes = recipeManager.getAllRecipesFor(CompressorRecipe.Type.INSTANCE);
        registration.addRecipes(CompressorRecipeCategory.COMPRESSOR_TYPE, compressorRecipes);
        List<SawmillRecipe> sawmillRecipes = recipeManager.getAllRecipesFor(SawmillRecipe.Type.INSTANCE);
        registration.addRecipes(SawmillRecipeCategory.SAWMILL_TYPE, sawmillRecipes);
        List<AlloyFurnaceRecipe> alloyfurnaceRecipes = recipeManager.getAllRecipesFor(AlloyFurnaceRecipe.Type.INSTANCE);
        registration.addRecipes(AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE, alloyfurnaceRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        // Coal //
        registration.addRecipeClickArea(KilnScreen.class, 78, 33, 26, 19,
                KilnRecipeCategory.KILN_TYPE);
        registration.addRecipeClickArea(BasicCrusherScreen.class, 78, 33, 26, 19,
                BasicCrusherRecipeCategory.BASIC_CRUSHER_TYPE);
        registration.addRecipeClickArea(BasicCompressorScreen.class, 78, 33, 26, 19,
                BasicCompressorRecipeCategory.BASIC_COMPRESSOR_TYPE);
        registration.addRecipeClickArea(BasicExtractorScreen.class, 78, 33, 26, 19,
                BasicExtractorRecipeCategory.BASIC_EXTRACTOR_TYPE);

        // Electric //
        // Basic
        registration.addRecipeClickArea(ElectricFurnaceScreen.class, 78, 33, 26, 19,
                ElectricFurnaceRecipeCategory.ELECTRIC_FURNACE_TYPE);
        registration.addRecipeClickArea(CrusherScreen.class, 78, 33, 26, 19,
                CrusherRecipeCategory.CRUSHER_TYPE);
        registration.addRecipeClickArea(ExtractorScreen.class, 78, 33, 26, 19,
                ExtractorRecipeCategory.EXTRACTOR_TYPE);
        registration.addRecipeClickArea(CompressorScreen.class, 78, 33, 26, 19,
                CompressorRecipeCategory.COMPRESSOR_TYPE);
        registration.addRecipeClickArea(SawmillScreen.class, 78, 33, 26, 19,
                SawmillRecipeCategory.SAWMILL_TYPE);
        registration.addRecipeClickArea(AlloyFurnaceScreen.class, 78, 33, 26, 19,
                AlloyFurnaceRecipeCategory.ALLOY_FURNACE_TYPE);
    }
}