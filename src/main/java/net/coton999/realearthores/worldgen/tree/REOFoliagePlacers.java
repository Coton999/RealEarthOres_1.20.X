package net.coton999.realearthores.worldgen.tree;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.worldgen.tree.foliage.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class REOFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, RealEarthOres.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<BaobabFoliagePlacer>> BAOBAB_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("baobab_foliage_placer", () -> new FoliagePlacerType<>(BaobabFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<EbonyFoliagePlacer>> EBONY_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("ebony_foliage_placer", () -> new FoliagePlacerType<>(EbonyFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<PalmFoliagePlacer>> PALM_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("palm_foliage_placer", () -> new FoliagePlacerType<>(PalmFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<REOPineFoliagePlacer>> MOD_PINE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("mod_pine_foliage_placer", () -> new FoliagePlacerType<>(REOPineFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<PoplarFoliagePlacer>> POPLAR_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("poplar_foliage_placer", () -> new FoliagePlacerType<>(PoplarFoliagePlacer.CODEC));
    public static final RegistryObject<FoliagePlacerType<RubberFoliagePlacer>> RUBBER_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("rubber_foliage_placer", () -> new FoliagePlacerType<>(RubberFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}
