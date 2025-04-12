package net.coton999.realearthores.block.entity;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.entity.machines.coal.BasicCrusherBlockEntity;
import net.coton999.realearthores.block.entity.machines.coal.BasicExtractorBlockEntity;
import net.coton999.realearthores.block.entity.machines.coal.BasicPurifierBlockEntity;
import net.coton999.realearthores.block.entity.machines.coal.KilnBlockEntity;
import net.coton999.realearthores.block.entity.machines.electric.*;
import net.coton999.realearthores.block.entity.machines.generator.CoalGenBE;
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

    public static final RegistryObject<BlockEntityType<BasicPurifierBlockEntity>> BASIC_PURIFIER_BE =
            BLOCK_ENTITIES.register("basic_putifier_block_entity", () ->
                    BlockEntityType.Builder.of(BasicPurifierBlockEntity::new,
                            REOBlocks.PURIFIER.get()).build(null));

    // Electric
    // Basic
    public static final RegistryObject<BlockEntityType<ElectricFurnaceBE>> ELECTRIC_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(ElectricFurnaceBE::new,
                            REOBlocks.ELECTRIC_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CrusherBE>> ELECTRIC_CRUSHER_BE =
            BLOCK_ENTITIES.register("electric_crusher_block_entity", () ->
                    BlockEntityType.Builder.of(CrusherBE::new,
                            REOBlocks.ELECTRIC_CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<PurifierBE>> ELECTRIC_PURIFIER_BE =
            BLOCK_ENTITIES.register("electric_purifier_block_entity", () ->
                    BlockEntityType.Builder.of(PurifierBE::new,
                            REOBlocks.ELECTRIC_PURIFIER.get()).build(null));

    public static final RegistryObject<BlockEntityType<AlloyFurnaceBE>> ELECTRIC_ALLOY_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_alloy_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(AlloyFurnaceBE::new,
                            REOBlocks.ELECTRIC_ALLOY_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<SawmillBE>> ELECTRIC_SAWMILL_BE =
            BLOCK_ENTITIES.register("electric_sawmill_block_entity", () ->
                    BlockEntityType.Builder.of(SawmillBE::new,
                            REOBlocks.ELECTRIC_SAWMILL.get()).build(null));

    public static final RegistryObject<BlockEntityType<ExtractorBE>> ELECTRIC_EXTRACTOR_BE =
            BLOCK_ENTITIES.register("electric_extractor_block_entity", () ->
                    BlockEntityType.Builder.of(ExtractorBE::new,
                            REOBlocks.ELECTRIC_EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CompressorBE>> ELECTRIC_COMPRESSOR_BE =
            BLOCK_ENTITIES.register("electric_compressor_block_entity", () ->
                    BlockEntityType.Builder.of(CompressorBE::new,
                            REOBlocks.ELECTRIC_COMPRESSOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<CentrifugeBE>> ELECTRIC_CENTRIFUGE_BE =
            BLOCK_ENTITIES.register("electric_centrifuge_block_entity", () ->
                    BlockEntityType.Builder.of(CentrifugeBE::new,
                            REOBlocks.ELECTRIC_CENTRIFUGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<InductionFurnaceBE>> ELECTRIC_INDUCTION_FURNACE_BE =
            BLOCK_ENTITIES.register("electric_induction_furnace_block_entity", () ->
                    BlockEntityType.Builder.of(InductionFurnaceBE::new,
                            REOBlocks.ELECTRIC_INDUCTION_FURNACE.get()).build(null));

    public static final RegistryObject<BlockEntityType<TransfuserBE>> ELECTRIC_TRANSFUSER_BE =
            BLOCK_ENTITIES.register("electric_transfuser_block_entity", () ->
                    BlockEntityType.Builder.of(TransfuserBE::new,
                            REOBlocks.ELECTRIC_TRANSFUSER.get()).build(null));

    // Generators

    public static final RegistryObject<BlockEntityType<CoalGenBE>> COAL_GENERATOR_BE =
            BLOCK_ENTITIES.register("coal_generator", () ->
                    BlockEntityType.Builder.of(CoalGenBE::new,
                            REOBlocks.COAL_GENERATOR.get()).build(null));


    // Signs
    public static final RegistryObject<BlockEntityType<REOSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(REOSignBlockEntity::new,
                            REOBlocks.BALSA_SIGN.get(), REOBlocks.BALSA_WALL_SIGN.get(),
                                    REOBlocks.BAOBAB_SIGN.get(), REOBlocks.BAOBAB_WALL_SIGN.get(),
                                    REOBlocks.HILL_CHERRY_SIGN.get(), REOBlocks.HILL_CHERRY_WALL_SIGN.get(),
                                    REOBlocks.CHESTNUT_SIGN.get(), REOBlocks.CHESTNUT_WALL_SIGN.get(),
                                    REOBlocks.CITRUS_SIGN.get(), REOBlocks.CITRUS_WALL_SIGN.get(),
                                    REOBlocks.EBONY_SIGN.get(), REOBlocks.EBONY_WALL_SIGN.get(),
                                    REOBlocks.LARCH_SIGN.get(), REOBlocks.LARCH_WALL_SIGN.get(),
                                    REOBlocks.LIME_SIGN.get(), REOBlocks.LIME_WALL_SIGN.get(),
                                    REOBlocks.MAHOGANY_SIGN.get(), REOBlocks.MAHOGANY_WALL_SIGN.get(),
                                    REOBlocks.MAPLE_SIGN.get(), REOBlocks.MAPLE_WALL_SIGN.get(),
                                    REOBlocks.PALM_SIGN.get(), REOBlocks.PALM_WALL_SIGN.get(),
                                    REOBlocks.PAPAYA_SIGN.get(), REOBlocks.PAPAYA_WALL_SIGN.get(),
                                    REOBlocks.PINE_SIGN.get(), REOBlocks.PINE_WALL_SIGN.get(),
                                    REOBlocks.PLUM_SIGN.get(), REOBlocks.PLUM_WALL_SIGN.get(),
                                    REOBlocks.POPLAR_SIGN.get(), REOBlocks.POPLAR_WALL_SIGN.get(),
                                    REOBlocks.REDWOOD_SIGN.get(), REOBlocks.REDWOOD_WALL_SIGN.get(),
                                    REOBlocks.RUBBER_SIGN.get(), REOBlocks.RUBBER_WALL_SIGN.get(),
                                    REOBlocks.TEAK_SIGN.get(), REOBlocks.TEAK_WALL_SIGN.get(),
                                    REOBlocks.WALNUT_SIGN.get(), REOBlocks.WALNUT_WALL_SIGN.get(),
                                    REOBlocks.WILLOW_SIGN.get(), REOBlocks.WILLOW_WALL_SIGN.get())
                            .build(null));

    // Hanging Signs
    public static final RegistryObject<BlockEntityType<REOHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(REOHangingSignBlockEntity::new,
                                    REOBlocks.BALSA_HANGING_SIGN.get(), REOBlocks.BALSA_WALL_HANGING_SIGN.get(),
                                    REOBlocks.BAOBAB_HANGING_SIGN.get(), REOBlocks.BAOBAB_WALL_HANGING_SIGN.get(),
                                    REOBlocks.HILL_CHERRY_HANGING_SIGN.get(), REOBlocks.HILL_CHERRY_WALL_HANGING_SIGN.get(),
                                    REOBlocks.CHESTNUT_HANGING_SIGN.get(), REOBlocks.CHESTNUT_WALL_HANGING_SIGN.get(),
                                    REOBlocks.CITRUS_HANGING_SIGN.get(), REOBlocks.CITRUS_WALL_HANGING_SIGN.get(),
                                    REOBlocks.EBONY_HANGING_SIGN.get(), REOBlocks.EBONY_WALL_HANGING_SIGN.get(),
                                    REOBlocks.LARCH_HANGING_SIGN.get(), REOBlocks.LARCH_WALL_HANGING_SIGN.get(),
                                    REOBlocks.LIME_HANGING_SIGN.get(), REOBlocks.LIME_WALL_HANGING_SIGN.get(),
                                    REOBlocks.MAHOGANY_HANGING_SIGN.get(), REOBlocks.MAHOGANY_WALL_HANGING_SIGN.get(),
                                    REOBlocks.MAPLE_HANGING_SIGN.get(), REOBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                                    REOBlocks.PALM_HANGING_SIGN.get(), REOBlocks.PALM_WALL_HANGING_SIGN.get(),
                                    REOBlocks.PAPAYA_HANGING_SIGN.get(), REOBlocks.PAPAYA_WALL_HANGING_SIGN.get(),
                                    REOBlocks.PINE_HANGING_SIGN.get(), REOBlocks.PINE_WALL_HANGING_SIGN.get(),
                                    REOBlocks.PLUM_HANGING_SIGN.get(), REOBlocks.PLUM_WALL_HANGING_SIGN.get(),
                                    REOBlocks.POPLAR_HANGING_SIGN.get(), REOBlocks.POPLAR_WALL_HANGING_SIGN.get(),
                                    REOBlocks.REDWOOD_HANGING_SIGN.get(), REOBlocks.REDWOOD_WALL_HANGING_SIGN.get(),
                                    REOBlocks.RUBBER_HANGING_SIGN.get(), REOBlocks.RUBBER_WALL_HANGING_SIGN.get(),
                                    REOBlocks.TEAK_HANGING_SIGN.get(), REOBlocks.TEAK_WALL_HANGING_SIGN.get(),
                                    REOBlocks.WALNUT_HANGING_SIGN.get(), REOBlocks.WALNUT_WALL_HANGING_SIGN.get(),
                                    REOBlocks.WILLOW_HANGING_SIGN.get(), REOBlocks.WILLOW_WALL_HANGING_SIGN.get())
                            .build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}