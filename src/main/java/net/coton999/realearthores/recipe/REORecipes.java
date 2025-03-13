package net.coton999.realearthores.recipe;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.recipe.machines.*;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class REORecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, RealEarthOres.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KilnRecipe>> KILN_SERIALIZER =
            SERIALIZERS.register("firing", () -> KilnRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CrusherRecipe>> CRUSHER_SERIALIZER =
            SERIALIZERS.register("crushing", () -> CrusherRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<PurifierRecipe>> PURIFIER_SERIALIZER =
            SERIALIZERS.register("purifying", () -> PurifierRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<AlloyFurnaceRecipe>> ALLOY_FURANCE_SERIALIZER =
            SERIALIZERS.register("alloying", () -> AlloyFurnaceRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<SawmillRecipe>> SAWMILL_SERIALIZER =
            SERIALIZERS.register("milling", () -> SawmillRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<ExtractorRecipe>> EXTRACTOR_SERIALIZER =
            SERIALIZERS.register("extracting", () -> ExtractorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CompressorRecipe>> COMPRESSOR_SERIALIZER =
            SERIALIZERS.register("compressing", () -> CompressorRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CentrifugeRecipe>> CENTRIFUGE_SERIALIZER =
            SERIALIZERS.register("spinning", () -> CentrifugeRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<InductionFurnaceRecipe>> INDUCTION_FURNACE_SERIALIZER =
            SERIALIZERS.register("inducting", () -> InductionFurnaceRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<TransfuserRecipe>> TRANSFUSER_SERIALIZER =
            SERIALIZERS.register("transfusing", () -> TransfuserRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}