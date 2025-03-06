package net.coton999.realearthores.worldgen.tree;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.worldgen.tree.trunk.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class REOTrunkPlacers {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, RealEarthOres.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<BaobabTrunkPlacer>> BAOBAB_TRUNK_PLACER =
            TRUNK_PLACER.register("baobab_trunk_placer", () -> new TrunkPlacerType<>(BaobabTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<EbonyTrunkPlacer>> EBONY_TRUNK_PLACER =
            TRUNK_PLACER.register("ebony_trunk_placer", () -> new TrunkPlacerType<>(EbonyTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<PalmTrunkPlacer>> PALM_TRUNK_PLACER =
            TRUNK_PLACER.register("palm_trunk_placer", () -> new TrunkPlacerType<>(PalmTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<RedwoodMegaTrunkPlacer>> REDWOOD_MEGA_TRUNK_PLACER =
            TRUNK_PLACER.register("redwood_mega_trunk_placer", () -> new TrunkPlacerType<>(RedwoodMegaTrunkPlacer.CODEC));
    public static final RegistryObject<TrunkPlacerType<RedwoodTrunkPlacer>> REDWOOD_TRUNK_PLACER =
            TRUNK_PLACER.register("redwood_trunk_placer", () -> new TrunkPlacerType<>(RedwoodTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}