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