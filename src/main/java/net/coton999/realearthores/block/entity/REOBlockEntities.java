package net.coton999.realearthores.block.entity;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.entity.machines.coal.*;
import net.coton999.realearthores.block.entity.machines.electric.*;
import net.coton999.realearthores.block.entity.signs.REOHangingSignBlockEntity;
import net.coton999.realearthores.block.entity.signs.REOSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class REOBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RealEarthOres.MOD_ID);

    // Tech //
    // Machines
    // Coal
    public static final RegistryObject<BlockEntityType<KilnBlockEntity>> KILN_BE =
            BLOCK_ENTITIES.register("kiln_block_entity", () ->
                    BlockEntityType.Builder.of(KilnBlockEntity::new,
                            REOBlocks.KILN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicCrusherBlockEntity>> BASIC_CRUSHER_BE =
            BLOCK_ENTITIES.register("basic_crusher_block_entity", () ->
                    BlockEntityType.Builder.of(BasicCrusherBlockEntity::new,
                            REOBlocks.CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicExtractorBlockEntity>> BASIC_EXTRACTOR_BE =
            BLOCK_ENTITIES.register("basic_extractor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicExtractorBlockEntity::new,
                            REOBlocks.EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<BasicCompressorBlockEntity>> BASIC_COMPRESSOR_BE =
            BLOCK_ENTITIES.register("basic_compressor_block_entity", () ->
                    BlockEntityType.Builder.of(BasicCompressorBlockEntity::new,
                            REOBlocks.COMPRESSOR.get()).build(null));

    // Electric
    public static final RegistryObject<BlockEntityType<ElectricFurnaceBlockEntity>> ELECTRIC_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(ElectricFurnaceBlockEntity::new,
                            REOBlocks.ELECTRIC_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrusherBlockEntity>> ELECTRIC_CRUSHER_BE =
            BLOCK_ENTITIES.register("electric_crusher_block_entity", () ->
                    BlockEntityType.Builder.of(CrusherBlockEntity::new,
                            REOBlocks.ELECTRIC_CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<PurifierBlockEntity>> ELECTRIC_PURIFIER_BE =
            BLOCK_ENTITIES.register("electric_purifier_block_entity", () ->
                    BlockEntityType.Builder.of(PurifierBlockEntity::new,
                            REOBlocks.ELECTRIC_PURIFIER.get()).build(null));

    public static final RegistryObject<BlockEntityType<AlloyFurnaceBlockEntity>> ELECTRIC_ALLOY_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_alloy_furance_block_entity", () ->
                    BlockEntityType.Builder.of(AlloyFurnaceBlockEntity::new,
                            REOBlocks.ELECTRIC_ALLOY_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<SawmillBlockEntity>> ELECTRIC_SAWMILL_BE =
            BLOCK_ENTITIES.register("electric_sawmill_block_entity", () ->
                    BlockEntityType.Builder.of(SawmillBlockEntity::new,
                            REOBlocks.ELECTRIC_SAWMILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtractorBlockEntity>> ELECTRIC_EXTRACTOR_BE =
            BLOCK_ENTITIES.register("electric_extractor_block_entity", () ->
                    BlockEntityType.Builder.of(ExtractorBlockEntity::new,
                            REOBlocks.ELECTRIC_EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CompressorBlockEntity>> ELECTRIC_COMPRESSOR_BE =
            BLOCK_ENTITIES.register("electric_compressor_block_entity", () ->
                    BlockEntityType.Builder.of(CompressorBlockEntity::new,
                            REOBlocks.ELECTRIC_COMPRESSOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CentrifugeBlockEntity>> ELECTRIC_CENTRIFUGE_BE =
            BLOCK_ENTITIES.register("electric_centrifuge_block_entity", () ->
                    BlockEntityType.Builder.of(CentrifugeBlockEntity::new,
                            REOBlocks.ELECTRIC_CENTRIFUGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<InductionFurnaceBlockEntity>> ELECTRIC_INDUCTION_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_induction_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(InductionFurnaceBlockEntity::new,
                            REOBlocks.ELECTRIC_INDUCTION_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<TransfuserBlockEntity>> ELECTRIC_TRANSFUSER_BE =
            BLOCK_ENTITIES.register("electric_transfuser_block_entity", () ->
                    BlockEntityType.Builder.of(TransfuserBlockEntity::new,
                            REOBlocks.ELECTRIC_TRANSFUSER.get()).build(null));


    // Signs
    public static final RegistryObject<BlockEntityType<REOSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(REOSignBlockEntity::new,
                            REOBlocks.SIGN_BALSA.get(), REOBlocks.SIGN_BALSA_WALL.get(),
                                    REOBlocks.SIGN_BAOBAB.get(), REOBlocks.SIGN_BAOBAB_WALL.get(),
                                    REOBlocks.SIGN_HILL_CHERRY.get(), REOBlocks.SIGN_HILL_CHERRY_WALL.get(),
                                    REOBlocks.SIGN_CHESTNUT.get(), REOBlocks.SIGN_CHESTNUT_WALL.get(),
                                    REOBlocks.SIGN_CITRUS.get(), REOBlocks.SIGN_CITRUS_WALL.get(),
                                    REOBlocks.SIGN_EBONY.get(), REOBlocks.SIGN_EBONY_WALL.get(),
                                    REOBlocks.SIGN_LARCH.get(), REOBlocks.SIGN_LARCH_WALL.get(),
                                    REOBlocks.SIGN_LIME.get(), REOBlocks.SIGN_LIME_WALL.get(),
                                    REOBlocks.SIGN_MAHOGANY.get(), REOBlocks.SIGN_MAHOGANY_WALL.get(),
                                    REOBlocks.SIGN_MAPLE.get(), REOBlocks.SIGN_MAPLE_WALL.get(),
                                    REOBlocks.SIGN_PALM.get(), REOBlocks.SIGN_PALM_WALL.get(),
                                    REOBlocks.SIGN_PAPAYA.get(), REOBlocks.SIGN_PAPAYA_WALL.get(),
                                    REOBlocks.SIGN_PINE.get(), REOBlocks.SIGN_PINE_WALL.get(),
                                    REOBlocks.SIGN_PLUM.get(), REOBlocks.SIGN_PLUM_WALL.get(),
                                    REOBlocks.SIGN_POPLAR.get(), REOBlocks.SIGN_POPLAR_WALL.get(),
                                    REOBlocks.SIGN_REDWOOD.get(), REOBlocks.SIGN_REDWOOD_WALL.get(),
                                    REOBlocks.SIGN_RUBBER.get(), REOBlocks.SIGN_RUBBER_WALL.get(),
                                    REOBlocks.SIGN_TEAK.get(), REOBlocks.SIGN_TEAK_WALL.get(),
                                    REOBlocks.SIGN_WALNUT.get(), REOBlocks.SIGN_WALNUT_WALL.get(),
                                    REOBlocks.SIGN_WILLOW.get(), REOBlocks.SIGN_WILLOW_WALL.get())
                            .build(null));

    // Hanging Signs
    public static final RegistryObject<BlockEntityType<REOHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(REOHangingSignBlockEntity::new,
                                    REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.SIGN_HANGING_BALSA_WALL.get(),
                                    REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.SIGN_HANGING_BAOBAB_WALL.get(),
                                    REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.SIGN_HANGING_HILL_CHERRY_WALL.get(),
                                    REOBlocks.SIGN_HANGING_CHESTNUT.get(), REOBlocks.SIGN_HANGING_CHESTNUT_WALL.get(),
                                    REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.SIGN_HANGING_CITRUS_WALL.get(),
                                    REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.SIGN_HANGING_EBONY_WALL.get(),
                                    REOBlocks.SIGN_HANGING_LARCH.get(), REOBlocks.SIGN_HANGING_LARCH_WALL.get(),
                                    REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.SIGN_HANGING_LIME_WALL.get(),
                                    REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.SIGN_HANGING_MAHOGANY_WALL.get(),
                                    REOBlocks.SIGN_HANGING_MAPLE.get(), REOBlocks.SIGN_HANGING_MAPLE_WALL.get(),
                                    REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.SIGN_HANGING_PALM_WALL.get(),
                                    REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.SIGN_HANGING_PAPAYA_WALL.get(),
                                    REOBlocks.SIGN_HANGING_PINE.get(), REOBlocks.SIGN_HANGING_PINE_WALL.get(),
                                    REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.SIGN_HANGING_PLUM_WALL.get(),
                                    REOBlocks.SIGN_HANGING_POPLAR.get(), REOBlocks.SIGN_HANGING_POPLAR_WALL.get(),
                                    REOBlocks.SIGN_HANGING_REDWOOD.get(), REOBlocks.SIGN_HANGING_REDWOOD_WALL.get(),
                                    REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.SIGN_HANGING_RUBBER_WALL.get(),
                                    REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.SIGN_HANGING_TEAK_WALL.get(),
                                    REOBlocks.SIGN_HANGING_WALNUT.get(), REOBlocks.SIGN_HANGING_WALNUT_WALL.get(),
                                    REOBlocks.SIGN_HANGING_WILLOW.get(), REOBlocks.SIGN_HANGING_WILLOW_WALL.get())
                            .build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}