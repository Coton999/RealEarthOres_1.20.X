package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class REOBlockTagGenerator extends BlockTagsProvider {
    public REOBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RealEarthOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        //this.tag(BlockTags.MINEABLE_WITH_HOE)

        //this.tag(BlockTags.MINEABLE_WITH_AXE);


        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(REOTags.Blocks.REO_GRAVEL_ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(REOTags.Blocks.REO_ORES) .addTag(REOTags.Blocks.REO_DEEPSLATE_ORES) .addTag(REOTags.Blocks.REO_NETHER_ORES)
                .addTag(REOTags.Blocks.REO_END_ORES) .addTag(REOTags.Blocks.STORAGE_BLOCKS) .addTag(REOTags.Blocks.RAW_STORAGE_BLOCKS)
                .addTag(REOTags.Blocks.MARBLE_BLOCKS) .addTag(REOTags.Blocks.LIMESTONE_BLOCKS) .addTag(REOTags.Blocks.CALCITE_BLOCKS)
                .addTag(REOTags.Blocks.NETHERRACK_BLOCKS) .addTag(REOTags.Blocks.COAL_MACHINES) .addTag(REOTags.Blocks.ELECTRIC_MACHINES)
                .addTag(REOTags.Blocks.GENERATORS);


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(REOBlocks.ALUMINUM_ORE.get(), REOBlocks.SILVER_ORE.get(),

                        REOBlocks.ALUMINUM_GRAVEL_ORE.get(), REOBlocks.DIAMOND_GRAVEL_ORE.get(), REOBlocks.EMERALD_GRAVEL_ORE.get(),
                        REOBlocks.REDSTONE_GRAVEL_ORE.get(), REOBlocks.SILVER_GRAVEL_ORE.get(),

                        REOBlocks.DEEPSLATE_SILVER_ORE.get(),

                        REOBlocks.NETHER_ALUMINIUM_ORE.get(), REOBlocks.NETHER_DIAMOND_ORE.get(), REOBlocks.NETHER_EMERALD_ORE.get(),
                        REOBlocks.NETHER_REDSTONE_ORE.get(), REOBlocks.NETHER_SILVER_ORE.get(),


                        REOBlocks.ALUMINUM_BLOCK.get(), REOBlocks.PERIDOT_BLOCK.get(), REOBlocks.RUBY_BLOCK.get(),
                        REOBlocks.SAPPHIRE_BLOCK.get(), REOBlocks.SILVER_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(REOBlocks.PLATINUM_ORE.get(), REOBlocks.URANIUM_ORE.get(),

                        REOBlocks.PLATINUM_GRAVEL_ORE.get(), REOBlocks.URANIUM_GRAVEL_ORE.get(),

                        REOBlocks.DEEPSLATE_PLATINUM_ORE.get(), REOBlocks.DEEPSLATE_URANIUM_ORE.get(),

                        REOBlocks.NETHER_PLATINUM_ORE.get(), REOBlocks.NETHER_URANIUM_ORE.get(),

                        REOBlocks.ENDERITE_ORE.get(),

                        REOBlocks.ENDERITE_BLOCK.get(), REOBlocks.PLATINUM_BLOCK.get(), REOBlocks.URANIUM_BLOCK.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(REOBlocks.NICKEL_ORE.get(), REOBlocks.TIN_ORE.get(), REOBlocks.ZINC_ORE.get(),

                        REOBlocks.COPPER_GRAVEL_ORE.get(), REOBlocks.IRON_GRAVEL_ORE.get(), REOBlocks.LAPIS_GRAVEL_ORE.get(),
                        REOBlocks.NICKEL_GRAVEL_ORE.get(), REOBlocks.TIN_GRAVEL_ORE.get(), REOBlocks.ZINC_GRAVEL_ORE.get(),

                        REOBlocks.DEEPSLATE_NICKEL_ORE.get(), REOBlocks.DEEPSLATE_ZINC_ORE.get(),

                        REOBlocks.NETHER_COPPER_ORE.get(), REOBlocks.NETHER_IRON_ORE.get(), REOBlocks.NETHER_LAPIS_ORE.get(),
                        REOBlocks.NETHER_NICKEL_ORE.get(), REOBlocks.NETHER_TIN_ORE.get(), REOBlocks.NETHER_ZINC_ORE.get(),

                        REOBlocks.ALUMINUM_BLOCK.get(), REOBlocks.NICKEL_BLOCK.get(),
                        REOBlocks.TIN_BLOCK.get(), REOBlocks.ZINC_BLOCK.get(),

                        REOBlocks.RAW_ALUMINIUM_BLOCK.get(), REOBlocks.RAW_ENDERITE_BLOCK.get(), REOBlocks.RAW_LEAD_BLOCK.get(),
                        REOBlocks.RAW_NICKEL_BLOCK.get(), REOBlocks.RAW_PLATINUM_BLOCK.get(), REOBlocks.RAW_SILVER_BLOCK.get(),
                        REOBlocks.RAW_TIN_BLOCK.get(), REOBlocks.RAW_URANIUM_BLOCK.get(), REOBlocks.RAW_ZINC_BLOCK.get());

        //this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
        //        .add(ModBlocks..get());

        this.tag(REOTags.Blocks.MINEABLE_WITH_SICKLE)
                .addTag(BlockTags.MINEABLE_WITH_HOE).addTag(BlockTags.CROPS).addTag(BlockTags.SAPLINGS)
                .addTag(BlockTags.CORALS).addTag(BlockTags.FLOWERS).addTag(BlockTags.SWORD_EFFICIENT)
                .addTag(BlockTags.LEAVES);

        this.tag(REOTags.Blocks.MINEABLE_WITH_REO_SHEARS)
                .addTag(BlockTags.LEAVES);

        this.tag(REOTags.Blocks.MINEABLE_WITH_PAXEL)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL).addTag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(REOTags.Blocks.COAL_MACHINES).add(REOBlocks.KILN.get(), REOBlocks.CRUSHER.get(), REOBlocks.EXTRACTOR.get(), REOBlocks.PURIFIER.get());

        this.tag(REOTags.Blocks.ELECTRIC_MACHINES).add(REOBlocks.ELECTRIC_FURNACE.get(), REOBlocks.ELECTRIC_CRUSHER.get(), REOBlocks.ELECTRIC_PURIFIER.get(),
                REOBlocks.ELECTRIC_ALLOY_FURNACE.get(), REOBlocks.ELECTRIC_SAWMILL.get(), REOBlocks.ELECTRIC_EXTRACTOR.get(),
                REOBlocks.ELECTRIC_COMPRESSOR.get(), REOBlocks.ELECTRIC_CENTRIFUGE.get(), REOBlocks.ELECTRIC_INDUCTION_FURNACE.get(),
                REOBlocks.ELECTRIC_TRANSFUSER.get());

        this.tag(REOTags.Blocks.GENERATORS).add(REOBlocks.COAL_GENERATOR.get());

        this.tag(BlockTags.CROPS)
                .add(REOBlocks.BARLEY_CROP.get(), REOBlocks.CAULIFLOWER_CROP.get(),
                REOBlocks.ONIONS_CROP.get(), REOBlocks.RICE_CROP.get(), REOBlocks.TOMATO_CROP.get());


        this.tag(BlockTags.WALLS)
                .add(REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get(),
                        REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get(),
                        REOBlocks.CALCITE_WALL.get(), REOBlocks.NETHERRACK_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(REOBlocks.BALSA_LOG.get(), REOBlocks.BALSA_WOOD.get(), REOBlocks.STRIPPED_BALSA_LOG.get(),
                        REOBlocks.STRIPPED_BALSA_WOOD.get(), REOBlocks.BALSA_PLANKS.get(), REOBlocks.BALSA_STAIRS.get(),
                        REOBlocks.BALSA_SLAB.get(), REOBlocks.BALSA_FENCE.get(), REOBlocks.BALSA_FENCE_GATE.get(),

                        REOBlocks.BAOBAB_LOG.get(), REOBlocks.BAOBAB_WOOD.get(), REOBlocks.STRIPPED_BAOBAB_LOG.get(),
                        REOBlocks.STRIPPED_BAOBAB_WOOD.get(), REOBlocks.BAOBAB_PLANKS.get(), REOBlocks.BAOBAB_STAIRS.get(),
                        REOBlocks.BAOBAB_SLAB.get(), REOBlocks.BAOBAB_FENCE.get(), REOBlocks.BAOBAB_FENCE_GATE.get(),

                        REOBlocks.HILL_CHERRY_LOG.get(), REOBlocks.HILL_CHERRY_WOOD.get(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get(),
                        REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get(), REOBlocks.HILL_CHERRY_PLANKS.get(), REOBlocks.HILL_CHERRY_STAIRS.get(),
                        REOBlocks.HILL_CHERRY_SLAB.get(), REOBlocks.HILL_CHERRY_FENCE.get(), REOBlocks.HILL_CHERRY_FENCE_GATE.get(),

                        REOBlocks.CHESTNUT_LOG.get(), REOBlocks.CHESTNUT_WOOD.get(), REOBlocks.STRIPPED_CHESTNUT_LOG.get(),
                        REOBlocks.STRIPPED_CHESTNUT_WOOD.get(), REOBlocks.CHESTNUT_PLANKS.get(), REOBlocks.CHESTNUT_STAIRS.get(),
                        REOBlocks.CHESTNUT_SLAB.get(), REOBlocks.CHESTNUT_FENCE.get(), REOBlocks.CHESTNUT_FENCE_GATE.get(),

                        REOBlocks.CITRUS_LOG.get(), REOBlocks.CITRUS_WOOD.get(), REOBlocks.STRIPPED_CITRUS_LOG.get(),
                        REOBlocks.STRIPPED_CITRUS_WOOD.get(), REOBlocks.CITRUS_PLANKS.get(), REOBlocks.CITRUS_STAIRS.get(),
                        REOBlocks.CITRUS_SLAB.get(), REOBlocks.CITRUS_FENCE.get(), REOBlocks.CITRUS_FENCE_GATE.get(),

                        REOBlocks.EBONY_LOG.get(), REOBlocks.EBONY_WOOD.get(), REOBlocks.STRIPPED_EBONY_LOG.get(),
                        REOBlocks.STRIPPED_EBONY_WOOD.get(), REOBlocks.EBONY_PLANKS.get(), REOBlocks.EBONY_STAIRS.get(),
                        REOBlocks.EBONY_SLAB.get(), REOBlocks.EBONY_FENCE.get(), REOBlocks.EBONY_FENCE_GATE.get(),

                        REOBlocks.LARCH_LOG.get(), REOBlocks.LARCH_WOOD.get(), REOBlocks.STRIPPED_LARCH_LOG.get(),
                        REOBlocks.STRIPPED_LARCH_WOOD.get(), REOBlocks.LARCH_PLANKS.get(), REOBlocks.LARCH_STAIRS.get(),
                        REOBlocks.LARCH_SLAB.get(), REOBlocks.LARCH_FENCE.get(), REOBlocks.LARCH_FENCE_GATE.get(),

                        REOBlocks.LIME_LOG.get(), REOBlocks.LIME_WOOD.get(), REOBlocks.STRIPPED_LIME_LOG.get(),
                        REOBlocks.STRIPPED_LIME_WOOD.get(), REOBlocks.LIME_PLANKS.get(), REOBlocks.LIME_STAIRS.get(),
                        REOBlocks.LIME_SLAB.get(), REOBlocks.LIME_FENCE.get(), REOBlocks.LIME_FENCE_GATE.get(),

                        REOBlocks.MAHOGANY_LOG.get(), REOBlocks.MAHOGANY_WOOD.get(), REOBlocks.STRIPPED_MAHOGANY_LOG.get(),
                        REOBlocks.STRIPPED_MAHOGANY_WOOD.get(), REOBlocks.MAHOGANY_PLANKS.get(), REOBlocks.MAHOGANY_STAIRS.get(),
                        REOBlocks.MAHOGANY_SLAB.get(), REOBlocks.MAHOGANY_FENCE.get(), REOBlocks.MAHOGANY_FENCE_GATE.get(),

                        REOBlocks.MAPLE_LOG.get(), REOBlocks.MAPLE_WOOD.get(), REOBlocks.STRIPPED_MAPLE_LOG.get(),
                        REOBlocks.STRIPPED_MAPLE_WOOD.get(), REOBlocks.MAPLE_PLANKS.get(), REOBlocks.MAPLE_STAIRS.get(),
                        REOBlocks.MAPLE_SLAB.get(), REOBlocks.MAPLE_FENCE.get(), REOBlocks.MAPLE_FENCE_GATE.get(),

                        REOBlocks.PALM_LOG.get(), REOBlocks.PALM_WOOD.get(), REOBlocks.STRIPPED_PALM_LOG.get(),
                        REOBlocks.STRIPPED_PALM_WOOD.get(), REOBlocks.PALM_PLANKS.get(), REOBlocks.PALM_STAIRS.get(),
                        REOBlocks.PALM_SLAB.get(), REOBlocks.PALM_FENCE.get(), REOBlocks.PALM_FENCE_GATE.get(),

                        REOBlocks.PAPAYA_LOG.get(), REOBlocks.PAPAYA_WOOD.get(), REOBlocks.STRIPPED_PAPAYA_LOG.get(),
                        REOBlocks.STRIPPED_PAPAYA_WOOD.get(), REOBlocks.PAPAYA_PLANKS.get(), REOBlocks.PAPAYA_STAIRS.get(),
                        REOBlocks.PAPAYA_SLAB.get(), REOBlocks.PAPAYA_FENCE.get(), REOBlocks.PAPAYA_FENCE_GATE.get(),

                        REOBlocks.PINE_LOG.get(), REOBlocks.PINE_WOOD.get(), REOBlocks.STRIPPED_PINE_LOG.get(),
                        REOBlocks.STRIPPED_PINE_WOOD.get(), REOBlocks.PINE_PLANKS.get(), REOBlocks.PINE_STAIRS.get(),
                        REOBlocks.PINE_SLAB.get(), REOBlocks.PINE_FENCE.get(), REOBlocks.PINE_FENCE_GATE.get(),

                        REOBlocks.PLUM_LOG.get(), REOBlocks.PLUM_WOOD.get(), REOBlocks.STRIPPED_PLUM_LOG.get(),
                        REOBlocks.STRIPPED_PLUM_WOOD.get(), REOBlocks.PLUM_PLANKS.get(), REOBlocks.PLUM_STAIRS.get(),
                        REOBlocks.PLUM_SLAB.get(), REOBlocks.PLUM_FENCE.get(), REOBlocks.PLUM_FENCE_GATE.get(),

                        REOBlocks.POPLAR_LOG.get(), REOBlocks.POPLAR_WOOD.get(), REOBlocks.STRIPPED_POPLAR_LOG.get(),
                        REOBlocks.STRIPPED_POPLAR_WOOD.get(), REOBlocks.POPLAR_PLANKS.get(), REOBlocks.POPLAR_STAIRS.get(),
                        REOBlocks.POPLAR_SLAB.get(), REOBlocks.POPLAR_FENCE.get(), REOBlocks.POPLAR_FENCE_GATE.get(),

                        REOBlocks.REDWOOD_LOG.get(), REOBlocks.REDWOOD_WOOD.get(), REOBlocks.STRIPPED_REDWOOD_LOG.get(),
                        REOBlocks.STRIPPED_REDWOOD_WOOD.get(), REOBlocks.REDWOOD_PLANKS.get(), REOBlocks.REDWOOD_STAIRS.get(),
                        REOBlocks.REDWOOD_SLAB.get(), REOBlocks.REDWOOD_FENCE.get(), REOBlocks.REDWOOD_FENCE_GATE.get(),

                        REOBlocks.RUBBER_LOG.get(), REOBlocks.RUBBER_LOG_SAP.get(), REOBlocks.RUBBER_WOOD.get(),
                        REOBlocks.RUBBER_WOOD_SAP.get(), REOBlocks.STRIPPED_RUBBER_LOG.get(),
                        REOBlocks.STRIPPED_RUBBER_WOOD.get(), REOBlocks.RUBBER_PLANKS.get(), REOBlocks.RUBBER_STAIRS.get(),
                        REOBlocks.RUBBER_SLAB.get(), REOBlocks.RUBBER_FENCE.get(), REOBlocks.RUBBER_FENCE_GATE.get(),

                        REOBlocks.TEAK_LOG.get(), REOBlocks.TEAK_WOOD.get(), REOBlocks.STRIPPED_TEAK_LOG.get(),
                        REOBlocks.STRIPPED_TEAK_WOOD.get(), REOBlocks.TEAK_PLANKS.get(), REOBlocks.TEAK_STAIRS.get(),
                        REOBlocks.TEAK_SLAB.get(), REOBlocks.TEAK_FENCE.get(), REOBlocks.TEAK_FENCE_GATE.get(),

                        REOBlocks.WALNUT_LOG.get(), REOBlocks.WALNUT_WOOD.get(), REOBlocks.STRIPPED_WALNUT_LOG.get(),
                        REOBlocks.STRIPPED_WALNUT_WOOD.get(), REOBlocks.WALNUT_PLANKS.get(), REOBlocks.WALNUT_STAIRS.get(),
                        REOBlocks.WALNUT_SLAB.get(), REOBlocks.WALNUT_FENCE.get(), REOBlocks.WALNUT_FENCE_GATE.get(),

                        REOBlocks.WILLOW_LOG.get(), REOBlocks.WILLOW_WOOD.get(), REOBlocks.STRIPPED_WILLOW_LOG.get(),
                        REOBlocks.STRIPPED_WILLOW_WOOD.get(), REOBlocks.WILLOW_PLANKS.get(), REOBlocks.WILLOW_STAIRS.get(),
                        REOBlocks.WILLOW_SLAB.get(), REOBlocks.WILLOW_FENCE.get(), REOBlocks.WILLOW_FENCE_GATE.get());

        this.tag(BlockTags.PLANKS)
                .add(REOBlocks.BALSA_PLANKS.get(), REOBlocks.BAOBAB_PLANKS.get(), REOBlocks.HILL_CHERRY_PLANKS.get(), REOBlocks.CHESTNUT_PLANKS.get(),
                        REOBlocks.CITRUS_PLANKS.get(), REOBlocks.EBONY_PLANKS.get(), REOBlocks.LARCH_PLANKS.get(), REOBlocks.LIME_PLANKS.get(),
                        REOBlocks.MAHOGANY_PLANKS.get(), REOBlocks.MAPLE_PLANKS.get(), REOBlocks.PALM_PLANKS.get(), REOBlocks.PAPAYA_PLANKS.get(),
                        REOBlocks.PINE_PLANKS.get(), REOBlocks.PLUM_PLANKS.get(), REOBlocks.POPLAR_PLANKS.get(), REOBlocks.REDWOOD_PLANKS.get(),
                        REOBlocks.RUBBER_PLANKS.get(), REOBlocks.TEAK_PLANKS.get(), REOBlocks.WALNUT_PLANKS.get(), REOBlocks.WILLOW_PLANKS.get(),

                        REOBlocks.RESISTANT_BALSA_PLANKS.get(), REOBlocks.RESISTANT_BAOBAB_PLANKS.get(), REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get(),
                        REOBlocks.RESISTANT_CHESTNUT_PLANKS.get(), REOBlocks.RESISTANT_CITRUS_PLANKS.get(), REOBlocks.RESISTANT_EBONY_PLANKS.get(),
                        REOBlocks.RESISTANT_LARCH_PLANKS.get(), REOBlocks.RESISTANT_LIME_PLANKS.get(), REOBlocks.RESISTANT_MAHOGANY_PLANKS.get(),
                        REOBlocks.RESISTANT_MAPLE_PLANKS.get(), REOBlocks.RESISTANT_PALM_PLANKS.get(), REOBlocks.RESISTANT_PAPAYA_PLANKS.get(),
                        REOBlocks.RESISTANT_PINE_PLANKS.get(), REOBlocks.RESISTANT_PLUM_PLANKS.get(), REOBlocks.RESISTANT_POPLAR_PLANKS.get(),
                        REOBlocks.RESISTANT_REDWOOD_PLANKS.get(), REOBlocks.RESISTANT_RUBBER_PLANKS.get(), REOBlocks.RESISTANT_TEAK_PLANKS.get(),
                        REOBlocks.RESISTANT_WALNUT_PLANKS.get(), REOBlocks.RESISTANT_WILLOW_PLANKS.get(),

                        REOBlocks.RESISTANT_OAK_PLANKS.get(), REOBlocks.RESISTANT_SPRUCE_PLANKS.get(), REOBlocks.RESISTANT_BIRCH_PLANKS.get(),
                        REOBlocks.RESISTANT_JUNGLE_PLANKS.get(), REOBlocks.RESISTANT_ACACIA_PLANKS.get(), REOBlocks.RESISTANT_DARK_OAK_PLANKS.get(),
                        REOBlocks.RESISTANT_MANGROVE_PLANKS.get(), REOBlocks.CHESTNUT_PLANKS.get()

                );

        this.tag(BlockTags.WOODEN_SLABS)
                .add(REOBlocks.BALSA_SLAB.get(), REOBlocks.BAOBAB_SLAB.get(), REOBlocks.HILL_CHERRY_SLAB.get(), REOBlocks.CHESTNUT_SLAB.get(),
                        REOBlocks.CITRUS_SLAB.get(), REOBlocks.EBONY_SLAB.get(), REOBlocks.LARCH_SLAB.get(), REOBlocks.LIME_SLAB.get(),
                        REOBlocks.MAHOGANY_SLAB.get(), REOBlocks.MAPLE_SLAB.get(), REOBlocks.PALM_SLAB.get(), REOBlocks.PAPAYA_SLAB.get(),
                        REOBlocks.PINE_SLAB.get(), REOBlocks.PLUM_SLAB.get(), REOBlocks.POPLAR_SLAB.get(), REOBlocks.REDWOOD_SLAB.get(),
                        REOBlocks.RUBBER_SLAB.get(), REOBlocks.TEAK_SLAB.get(), REOBlocks.WALNUT_SLAB.get(), REOBlocks.WILLOW_SLAB.get(),

                        REOBlocks.RESISTANT_BALSA_SLAB.get(), REOBlocks.RESISTANT_BAOBAB_SLAB.get(), REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get(),
                        REOBlocks.RESISTANT_CHESTNUT_SLAB.get(), REOBlocks.RESISTANT_CITRUS_SLAB.get(), REOBlocks.RESISTANT_EBONY_SLAB.get(),
                        REOBlocks.RESISTANT_LARCH_SLAB.get(), REOBlocks.RESISTANT_LIME_SLAB.get(), REOBlocks.RESISTANT_MAHOGANY_SLAB.get(),
                        REOBlocks.RESISTANT_MAPLE_SLAB.get(), REOBlocks.RESISTANT_PALM_SLAB.get(), REOBlocks.RESISTANT_PAPAYA_SLAB.get(),
                        REOBlocks.RESISTANT_PINE_SLAB.get(), REOBlocks.RESISTANT_PLUM_SLAB.get(), REOBlocks.RESISTANT_POPLAR_SLAB.get(),
                        REOBlocks.RESISTANT_REDWOOD_SLAB.get(), REOBlocks.RESISTANT_RUBBER_SLAB.get(), REOBlocks.RESISTANT_TEAK_SLAB.get(),
                        REOBlocks.RESISTANT_WALNUT_SLAB.get(), REOBlocks.RESISTANT_WILLOW_SLAB.get(),

                        REOBlocks.RESISTANT_OAK_SLAB.get(), REOBlocks.RESISTANT_SPRUCE_SLAB.get(), REOBlocks.RESISTANT_BIRCH_SLAB.get(),
                        REOBlocks.RESISTANT_JUNGLE_SLAB.get(), REOBlocks.RESISTANT_ACACIA_SLAB.get(), REOBlocks.RESISTANT_DARK_OAK_SLAB.get(),
                        REOBlocks.RESISTANT_MANGROVE_SLAB.get(), REOBlocks.CHESTNUT_SLAB.get()

                );

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(REOBlocks.BALSA_STAIRS.get(), REOBlocks.BAOBAB_STAIRS.get(), REOBlocks.HILL_CHERRY_STAIRS.get(), REOBlocks.CHESTNUT_STAIRS.get(),
                        REOBlocks.CITRUS_STAIRS.get(), REOBlocks.EBONY_STAIRS.get(), REOBlocks.LARCH_STAIRS.get(), REOBlocks.LIME_STAIRS.get(),
                        REOBlocks.MAHOGANY_STAIRS.get(), REOBlocks.MAPLE_STAIRS.get(), REOBlocks.PALM_STAIRS.get(), REOBlocks.PAPAYA_STAIRS.get(),
                        REOBlocks.PINE_STAIRS.get(), REOBlocks.PLUM_STAIRS.get(), REOBlocks.POPLAR_STAIRS.get(), REOBlocks.REDWOOD_STAIRS.get(),
                        REOBlocks.RUBBER_STAIRS.get(), REOBlocks.TEAK_STAIRS.get(), REOBlocks.WALNUT_STAIRS.get(), REOBlocks.WILLOW_STAIRS.get(),

                        REOBlocks.RESISTANT_BALSA_STAIRS.get(), REOBlocks.RESISTANT_BAOBAB_STAIRS.get(), REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get(),
                        REOBlocks.RESISTANT_CHESTNUT_STAIRS.get(), REOBlocks.RESISTANT_CITRUS_STAIRS.get(), REOBlocks.RESISTANT_EBONY_STAIRS.get(),
                        REOBlocks.RESISTANT_LARCH_STAIRS.get(), REOBlocks.RESISTANT_LIME_STAIRS.get(), REOBlocks.RESISTANT_MAHOGANY_STAIRS.get(),
                        REOBlocks.RESISTANT_MAPLE_STAIRS.get(), REOBlocks.RESISTANT_PALM_STAIRS.get(), REOBlocks.RESISTANT_PAPAYA_STAIRS.get(),
                        REOBlocks.RESISTANT_PINE_STAIRS.get(), REOBlocks.RESISTANT_PLUM_STAIRS.get(), REOBlocks.RESISTANT_POPLAR_STAIRS.get(),
                        REOBlocks.RESISTANT_REDWOOD_STAIRS.get(), REOBlocks.RESISTANT_RUBBER_STAIRS.get(), REOBlocks.RESISTANT_TEAK_STAIRS.get(),
                        REOBlocks.RESISTANT_WALNUT_STAIRS.get(), REOBlocks.RESISTANT_WILLOW_STAIRS.get(),

                        REOBlocks.RESISTANT_OAK_STAIRS.get(), REOBlocks.RESISTANT_SPRUCE_STAIRS.get(), REOBlocks.RESISTANT_BIRCH_STAIRS.get(),
                        REOBlocks.RESISTANT_JUNGLE_STAIRS.get(), REOBlocks.RESISTANT_ACACIA_STAIRS.get(), REOBlocks.RESISTANT_DARK_OAK_STAIRS.get(),
                        REOBlocks.RESISTANT_MANGROVE_STAIRS.get(), REOBlocks.CHESTNUT_STAIRS.get()

                );

        this.tag(BlockTags.ALL_SIGNS)
                .add(REOBlocks.BALSA_SIGN.get(), REOBlocks.BAOBAB_SIGN.get(), REOBlocks.HILL_CHERRY_SIGN.get(), REOBlocks.CHESTNUT_SIGN.get(),
                        REOBlocks.CITRUS_SIGN.get(), REOBlocks.EBONY_SIGN.get(), REOBlocks.LARCH_SIGN.get(), REOBlocks.LIME_SIGN.get(),
                        REOBlocks.MAHOGANY_SIGN.get(), REOBlocks.MAPLE_SIGN.get(), REOBlocks.PALM_SIGN.get(), REOBlocks.PAPAYA_SIGN.get(),
                        REOBlocks.PINE_SIGN.get(), REOBlocks.PLUM_SIGN.get(), REOBlocks.POPLAR_SIGN.get(), REOBlocks.REDWOOD_SIGN.get(),
                        REOBlocks.RUBBER_SIGN.get(), REOBlocks.TEAK_SIGN.get(), REOBlocks.WALNUT_SIGN.get(), REOBlocks.WILLOW_SIGN.get());

        this.tag(BlockTags.ALL_HANGING_SIGNS)
                .add(REOBlocks.BALSA_HANGING_SIGN.get(), REOBlocks.BAOBAB_HANGING_SIGN.get(), REOBlocks.HILL_CHERRY_HANGING_SIGN.get(),
                        REOBlocks.CHESTNUT_HANGING_SIGN.get(), REOBlocks.CITRUS_HANGING_SIGN.get(), REOBlocks.EBONY_HANGING_SIGN.get(),
                        REOBlocks.LARCH_HANGING_SIGN.get(), REOBlocks.LIME_HANGING_SIGN.get(), REOBlocks.MAHOGANY_HANGING_SIGN.get(),
                        REOBlocks.MAPLE_HANGING_SIGN.get(), REOBlocks.PALM_HANGING_SIGN.get(), REOBlocks.PAPAYA_HANGING_SIGN.get(),
                        REOBlocks.PINE_HANGING_SIGN.get(), REOBlocks.PLUM_HANGING_SIGN.get(), REOBlocks.POPLAR_HANGING_SIGN.get(),
                        REOBlocks.REDWOOD_HANGING_SIGN.get(), REOBlocks.RUBBER_HANGING_SIGN.get(), REOBlocks.TEAK_HANGING_SIGN.get(),
                        REOBlocks.WALNUT_HANGING_SIGN.get(), REOBlocks.WILLOW_HANGING_SIGN.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(REOBlocks.BALSA_BUTTON.get(), REOBlocks.BAOBAB_BUTTON.get(), REOBlocks.HILL_CHERRY_BUTTON.get(), REOBlocks.CHESTNUT_BUTTON.get(),
                        REOBlocks.CITRUS_BUTTON.get(), REOBlocks.EBONY_BUTTON.get(), REOBlocks.LARCH_BUTTON.get(), REOBlocks.LIME_BUTTON.get(),
                        REOBlocks.MAHOGANY_BUTTON.get(), REOBlocks.MAPLE_BUTTON.get(), REOBlocks.PALM_BUTTON.get(), REOBlocks.PAPAYA_BUTTON.get(),
                        REOBlocks.PINE_BUTTON.get(), REOBlocks.PLUM_BUTTON.get(), REOBlocks.POPLAR_BUTTON.get(), REOBlocks.REDWOOD_BUTTON.get(),
                        REOBlocks.RUBBER_BUTTON.get(), REOBlocks.TEAK_BUTTON.get(), REOBlocks.WALNUT_BUTTON.get(), REOBlocks.WILLOW_BUTTON.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(REOBlocks.BALSA_TRAPDOOR.get(), REOBlocks.BAOBAB_TRAPDOOR.get(), REOBlocks.HILL_CHERRY_TRAPDOOR.get(), REOBlocks.CHESTNUT_TRAPDOOR.get(),
                        REOBlocks.CITRUS_TRAPDOOR.get(), REOBlocks.EBONY_TRAPDOOR.get(), REOBlocks.LARCH_TRAPDOOR.get(), REOBlocks.LIME_TRAPDOOR.get(),
                        REOBlocks.MAHOGANY_TRAPDOOR.get(), REOBlocks.MAPLE_TRAPDOOR.get(), REOBlocks.PALM_TRAPDOOR.get(), REOBlocks.PAPAYA_TRAPDOOR.get(),
                        REOBlocks.PINE_TRAPDOOR.get(), REOBlocks.PLUM_TRAPDOOR.get(), REOBlocks.POPLAR_TRAPDOOR.get(), REOBlocks.REDWOOD_TRAPDOOR.get(),
                        REOBlocks.RUBBER_TRAPDOOR.get(), REOBlocks.TEAK_TRAPDOOR.get(), REOBlocks.WALNUT_TRAPDOOR.get(), REOBlocks.WILLOW_TRAPDOOR.get());


        this.tag(BlockTags.WOODEN_DOORS)
                .add(REOBlocks.BALSA_DOOR.get(), REOBlocks.BAOBAB_DOOR.get(), REOBlocks.HILL_CHERRY_DOOR.get(), REOBlocks.CHESTNUT_DOOR.get(),
                        REOBlocks.CITRUS_DOOR.get(), REOBlocks.EBONY_DOOR.get(), REOBlocks.LARCH_DOOR.get(), REOBlocks.LIME_DOOR.get(),
                        REOBlocks.MAHOGANY_DOOR.get(), REOBlocks.MAPLE_DOOR.get(), REOBlocks.PALM_DOOR.get(), REOBlocks.PAPAYA_DOOR.get(),
                        REOBlocks.PINE_DOOR.get(), REOBlocks.PLUM_DOOR.get(), REOBlocks.POPLAR_DOOR.get(), REOBlocks.REDWOOD_DOOR.get(),
                        REOBlocks.RUBBER_DOOR.get(), REOBlocks.TEAK_DOOR.get(), REOBlocks.WALNUT_DOOR.get(), REOBlocks.WILLOW_DOOR.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(REOBlocks.BALSA_PRESSURE_PLATE.get(), REOBlocks.BAOBAB_PRESSURE_PLATE.get(), REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get(), REOBlocks.CHESTNUT_PRESSURE_PLATE.get(),
                        REOBlocks.CITRUS_PRESSURE_PLATE.get(), REOBlocks.EBONY_PRESSURE_PLATE.get(), REOBlocks.LARCH_PRESSURE_PLATE.get(), REOBlocks.LIME_PRESSURE_PLATE.get(),
                        REOBlocks.MAHOGANY_PRESSURE_PLATE.get(), REOBlocks.MAPLE_PRESSURE_PLATE.get(), REOBlocks.PALM_PRESSURE_PLATE.get(), REOBlocks.PAPAYA_PRESSURE_PLATE.get(),
                        REOBlocks.PINE_PRESSURE_PLATE.get(), REOBlocks.PLUM_PRESSURE_PLATE.get(), REOBlocks.POPLAR_PRESSURE_PLATE.get(), REOBlocks.REDWOOD_PRESSURE_PLATE.get(),
                        REOBlocks.RUBBER_PRESSURE_PLATE.get(), REOBlocks.TEAK_PRESSURE_PLATE.get(), REOBlocks.WALNUT_PRESSURE_PLATE.get(), REOBlocks.WILLOW_PRESSURE_PLATE.get());


        this.tag(BlockTags.WOODEN_FENCES)
                .add(REOBlocks.BALSA_FENCE.get(), REOBlocks.BAOBAB_FENCE.get(), REOBlocks.HILL_CHERRY_FENCE.get(), REOBlocks.CHESTNUT_FENCE.get(),
                        REOBlocks.CITRUS_FENCE.get(), REOBlocks.EBONY_FENCE.get(), REOBlocks.LARCH_FENCE.get(), REOBlocks.LIME_FENCE.get(),
                        REOBlocks.MAHOGANY_FENCE.get(), REOBlocks.MAPLE_FENCE.get(), REOBlocks.PALM_FENCE.get(), REOBlocks.PAPAYA_FENCE.get(),
                        REOBlocks.PINE_FENCE.get(), REOBlocks.PLUM_FENCE.get(), REOBlocks.POPLAR_FENCE.get(), REOBlocks.REDWOOD_FENCE.get(),
                        REOBlocks.RUBBER_FENCE.get(), REOBlocks.TEAK_FENCE.get(), REOBlocks.WALNUT_FENCE.get(), REOBlocks.WILLOW_FENCE.get(),

                        REOBlocks.RESISTANT_BALSA_FENCE.get(), REOBlocks.RESISTANT_BAOBAB_FENCE.get(), REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get(),
                        REOBlocks.RESISTANT_CHESTNUT_FENCE.get(), REOBlocks.RESISTANT_CITRUS_FENCE.get(), REOBlocks.RESISTANT_EBONY_FENCE.get(),
                        REOBlocks.RESISTANT_LARCH_FENCE.get(), REOBlocks.RESISTANT_LIME_FENCE.get(), REOBlocks.RESISTANT_MAHOGANY_FENCE.get(),
                        REOBlocks.RESISTANT_MAPLE_FENCE.get(), REOBlocks.RESISTANT_PALM_FENCE.get(), REOBlocks.RESISTANT_PAPAYA_FENCE.get(),
                        REOBlocks.RESISTANT_PINE_FENCE.get(), REOBlocks.RESISTANT_PLUM_FENCE.get(), REOBlocks.RESISTANT_POPLAR_FENCE.get(),
                        REOBlocks.RESISTANT_REDWOOD_FENCE.get(), REOBlocks.RESISTANT_RUBBER_FENCE.get(), REOBlocks.RESISTANT_TEAK_FENCE.get(),
                        REOBlocks.RESISTANT_WALNUT_FENCE.get(), REOBlocks.RESISTANT_WILLOW_FENCE.get(),

                        REOBlocks.RESISTANT_OAK_FENCE.get(), REOBlocks.RESISTANT_SPRUCE_FENCE.get(), REOBlocks.RESISTANT_BIRCH_FENCE.get(),
                        REOBlocks.RESISTANT_JUNGLE_FENCE.get(), REOBlocks.RESISTANT_ACACIA_FENCE.get(), REOBlocks.RESISTANT_DARK_OAK_FENCE.get(),
                        REOBlocks.RESISTANT_MANGROVE_FENCE.get(), REOBlocks.CHESTNUT_FENCE.get()

                );

        this.tag(BlockTags.FENCE_GATES)
                .add(REOBlocks.BALSA_FENCE_GATE.get(), REOBlocks.BAOBAB_FENCE_GATE.get(), REOBlocks.HILL_CHERRY_FENCE_GATE.get(), REOBlocks.CHESTNUT_FENCE_GATE.get(),
                        REOBlocks.CITRUS_FENCE_GATE.get(), REOBlocks.EBONY_FENCE_GATE.get(), REOBlocks.LARCH_FENCE_GATE.get(), REOBlocks.LIME_FENCE_GATE.get(),
                        REOBlocks.MAHOGANY_FENCE_GATE.get(), REOBlocks.MAPLE_FENCE_GATE.get(), REOBlocks.PALM_FENCE_GATE.get(), REOBlocks.PAPAYA_FENCE_GATE.get(),
                        REOBlocks.PINE_FENCE_GATE.get(), REOBlocks.PLUM_FENCE_GATE.get(), REOBlocks.POPLAR_FENCE_GATE.get(), REOBlocks.REDWOOD_FENCE_GATE.get(),
                        REOBlocks.RUBBER_FENCE_GATE.get(), REOBlocks.TEAK_FENCE_GATE.get(), REOBlocks.WALNUT_FENCE_GATE.get(), REOBlocks.WILLOW_FENCE_GATE.get(),

                        REOBlocks.RESISTANT_BALSA_FENCE_GATE.get(), REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get(), REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get(), REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get(), REOBlocks.RESISTANT_EBONY_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_LARCH_FENCE_GATE.get(), REOBlocks.RESISTANT_LIME_FENCE_GATE.get(), REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get(), REOBlocks.RESISTANT_PALM_FENCE_GATE.get(), REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_PINE_FENCE_GATE.get(), REOBlocks.RESISTANT_PLUM_FENCE_GATE.get(), REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get(), REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get(), REOBlocks.RESISTANT_TEAK_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get(), REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get(),

                        REOBlocks.RESISTANT_OAK_FENCE_GATE.get(), REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get(), REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get(), REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get(), REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get(),
                        REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get(), REOBlocks.CHESTNUT_FENCE_GATE.get()

                );

        this.tag(BlockTags.SAPLINGS)
                .add(REOBlocks.BALSA_SAPLING.get(), REOBlocks.BAOBAB_SAPLING.get(), REOBlocks.HILL_CHERRY_SAPLING.get(), REOBlocks.CHESTNUT_SAPLING.get(),
                        REOBlocks.CITRUS_SAPLING.get(), REOBlocks.EBONY_SAPLING.get(), REOBlocks.LARCH_SAPLING.get(), REOBlocks.LIME_SAPLING.get(),
                        REOBlocks.MAHOGANY_SAPLING.get(), REOBlocks.MAPLE_SAPLING.get(), REOBlocks.PALM_SAPLING.get(), REOBlocks.PAPAYA_SAPLING.get(),
                        REOBlocks.PINE_SAPLING.get(), REOBlocks.PLUM_SAPLING.get(), REOBlocks.POPLAR_SAPLING.get(), REOBlocks.REDWOOD_SAPLING.get(),
                        REOBlocks.RUBBER_SAPLING.get(), REOBlocks.TEAK_SAPLING.get(), REOBlocks.WALNUT_SAPLING.get(), REOBlocks.WILLOW_SAPLING.get());

        this.tag(BlockTags.LEAVES)
                .add(REOBlocks.BALSA_LEAVES.get(), REOBlocks.BAOBAB_LEAVES.get(), REOBlocks.HILL_CHERRY_LEAVES.get(),
                        REOBlocks.CHESTNUT_LEAVES.get(), REOBlocks.CHESTNUT_FRUIT_LEAVES.get(),
                        REOBlocks.CITRUS_LEAVES.get(), REOBlocks.CITRUS_FRUIT_LEAVES.get(),
                        REOBlocks.EBONY_LEAVES.get(), REOBlocks.LARCH_LEAVES.get(),
                        REOBlocks.LIME_LEAVES.get(), REOBlocks.LIME_FRUIT_LEAVES.get(),
                        REOBlocks.MAHOGANY_LEAVES.get(), REOBlocks.MAPLE_LEAVES.get(), REOBlocks.PALM_LEAVES.get(),
                        REOBlocks.PAPAYA_LEAVES.get(), REOBlocks.PAPAYA_FRUIT_LEAVES.get(),
                        REOBlocks.PINE_LEAVES.get(), REOBlocks.PLUM_LEAVES.get(), REOBlocks.PLUM_FRUIT_LEAVES.get(),
                        REOBlocks.POPLAR_LEAVES.get(), REOBlocks.REDWOOD_LEAVES.get(),
                        REOBlocks.RUBBER_LEAVES.get(), REOBlocks.TEAK_LEAVES.get(),
                        REOBlocks.WALNUT_LEAVES.get(), REOBlocks.WALNUT_FRUIT_LEAVES.get(), REOBlocks.WILLOW_LEAVES.get());

        this.tag(REOTags.Blocks.BALSA_LOGS)
                .add(REOBlocks.BALSA_LOG.get(), REOBlocks.STRIPPED_BALSA_LOG.get(), REOBlocks.RESISTANT_BALSA_LOG.get(),
                        REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get(), REOBlocks.BALSA_WOOD.get(),
                        REOBlocks.STRIPPED_BALSA_WOOD.get(), REOBlocks.RESISTANT_BALSA_WOOD.get(),
                        REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get());

        this.tag(REOTags.Blocks.BAOBAB_LOGS)
                .add(REOBlocks.BAOBAB_LOG.get(), REOBlocks.STRIPPED_BAOBAB_LOG.get(), REOBlocks.RESISTANT_BAOBAB_LOG.get(),
                        REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get(), REOBlocks.BAOBAB_WOOD.get(), REOBlocks.STRIPPED_BAOBAB_WOOD.get(),
                        REOBlocks.RESISTANT_BAOBAB_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get());

        this.tag(REOTags.Blocks.HILL_CHERRY_LOGS)
                .add(REOBlocks.HILL_CHERRY_LOG.get(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get(),
                        REOBlocks.RESISTANT_HILL_CHERRY_LOG.get(), REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get(),
                        REOBlocks.HILL_CHERRY_WOOD.get(), REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get(),
                        REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get());

        this.tag(REOTags.Blocks.CHESTNUT_LOGS)
                .add(REOBlocks.CHESTNUT_LOG.get(), REOBlocks.STRIPPED_CHESTNUT_LOG.get(),
                        REOBlocks.RESISTANT_CHESTNUT_LOG.get(), REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get(),
                        REOBlocks.CHESTNUT_WOOD.get(), REOBlocks.STRIPPED_CHESTNUT_WOOD.get(),
                        REOBlocks.RESISTANT_CHESTNUT_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get());

        this.tag(REOTags.Blocks.CITRUS_LOGS)
                .add(REOBlocks.CITRUS_LOG.get(), REOBlocks.STRIPPED_CITRUS_LOG.get(),
                        REOBlocks.RESISTANT_CITRUS_LOG.get(), REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get(),
                        REOBlocks.CITRUS_WOOD.get(), REOBlocks.STRIPPED_CITRUS_WOOD.get(),
                        REOBlocks.RESISTANT_CITRUS_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get());

        this.tag(REOTags.Blocks.EBONY_LOGS)
                .add(REOBlocks.EBONY_LOG.get(), REOBlocks.STRIPPED_EBONY_LOG.get(),
                        REOBlocks.RESISTANT_EBONY_LOG.get(), REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get(),
                        REOBlocks.EBONY_WOOD.get(), REOBlocks.STRIPPED_EBONY_WOOD.get(),
                        REOBlocks.RESISTANT_EBONY_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get());

        this.tag(REOTags.Blocks.LARCH_LOGS)
                .add(REOBlocks.LARCH_LOG.get(), REOBlocks.STRIPPED_LARCH_LOG.get(),
                        REOBlocks.RESISTANT_LARCH_LOG.get(), REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get(),
                        REOBlocks.LARCH_WOOD.get(), REOBlocks.STRIPPED_LARCH_WOOD.get(),
                        REOBlocks.RESISTANT_LARCH_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get());

        this.tag(REOTags.Blocks.LIME_LOGS)
                .add(REOBlocks.LIME_LOG.get(), REOBlocks.STRIPPED_LIME_LOG.get(),
                        REOBlocks.RESISTANT_LIME_LOG.get(), REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get(),
                        REOBlocks.LIME_WOOD.get(), REOBlocks.STRIPPED_LIME_WOOD.get(),
                        REOBlocks.RESISTANT_LIME_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get());

        this.tag(REOTags.Blocks.MAHOGANY_LOGS)
                .add(REOBlocks.MAHOGANY_LOG.get(), REOBlocks.STRIPPED_MAHOGANY_LOG.get(),
                        REOBlocks.RESISTANT_MAHOGANY_LOG.get(), REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get(),
                        REOBlocks.MAHOGANY_WOOD.get(), REOBlocks.STRIPPED_MAHOGANY_WOOD.get(),
                        REOBlocks.RESISTANT_MAHOGANY_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get());

        this.tag(REOTags.Blocks.MAPLE_LOGS)
                .add(REOBlocks.MAPLE_LOG.get(), REOBlocks.STRIPPED_MAPLE_LOG.get(),
                        REOBlocks.RESISTANT_MAPLE_LOG.get(), REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get(),
                        REOBlocks.MAPLE_WOOD.get(), REOBlocks.STRIPPED_MAPLE_WOOD.get(),
                        REOBlocks.RESISTANT_MAPLE_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get());

        this.tag(REOTags.Blocks.PALM_LOGS)
                .add(REOBlocks.PALM_LOG.get(), REOBlocks.STRIPPED_PALM_LOG.get(),
                        REOBlocks.RESISTANT_PALM_LOG.get(), REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get(),
                        REOBlocks.PALM_WOOD.get(), REOBlocks.STRIPPED_PALM_WOOD.get(),
                        REOBlocks.RESISTANT_PALM_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get());

        this.tag(REOTags.Blocks.PAPAYA_LOGS)
                .add(REOBlocks.PAPAYA_LOG.get(), REOBlocks.STRIPPED_PAPAYA_LOG.get(),
                        REOBlocks.RESISTANT_PAPAYA_LOG.get(), REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get(),
                        REOBlocks.PAPAYA_WOOD.get(), REOBlocks.STRIPPED_PAPAYA_WOOD.get(),
                        REOBlocks.RESISTANT_PAPAYA_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get());

        this.tag(REOTags.Blocks.PINE_LOGS)
                .add(REOBlocks.PINE_LOG.get(), REOBlocks.STRIPPED_PINE_LOG.get(),
                        REOBlocks.RESISTANT_PINE_LOG.get(), REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get(),
                        REOBlocks.PINE_WOOD.get(), REOBlocks.STRIPPED_PINE_WOOD.get(),
                        REOBlocks.RESISTANT_PINE_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get());

        this.tag(REOTags.Blocks.PLUM_LOGS)
                .add(REOBlocks.PLUM_LOG.get(), REOBlocks.STRIPPED_PLUM_LOG.get(),
                        REOBlocks.RESISTANT_PLUM_LOG.get(), REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get(),
                        REOBlocks.PLUM_WOOD.get(), REOBlocks.STRIPPED_PLUM_WOOD.get(),
                        REOBlocks.RESISTANT_PLUM_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get());

        this.tag(REOTags.Blocks.POPLAR_LOGS)
                .add(REOBlocks.POPLAR_LOG.get(), REOBlocks.STRIPPED_POPLAR_LOG.get(),
                        REOBlocks.RESISTANT_POPLAR_LOG.get(), REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get(),
                        REOBlocks.POPLAR_WOOD.get(), REOBlocks.STRIPPED_POPLAR_WOOD.get(),
                        REOBlocks.RESISTANT_POPLAR_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get());

        this.tag(REOTags.Blocks.REDWOOD_LOGS)
                .add(REOBlocks.REDWOOD_LOG.get(), REOBlocks.STRIPPED_REDWOOD_LOG.get(),
                        REOBlocks.RESISTANT_REDWOOD_LOG.get(), REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get(),
                        REOBlocks.REDWOOD_WOOD.get(), REOBlocks.STRIPPED_REDWOOD_WOOD.get(),
                        REOBlocks.RESISTANT_REDWOOD_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get());

        this.tag(REOTags.Blocks.RUBBER_LOGS)
                .add(REOBlocks.RUBBER_LOG.get(), REOBlocks.RUBBER_LOG_SAP.get(), REOBlocks.STRIPPED_RUBBER_LOG.get(),
                        REOBlocks.RESISTANT_RUBBER_LOG.get(), REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get(),
                        REOBlocks.RUBBER_WOOD.get(), REOBlocks.RUBBER_WOOD_SAP.get(), REOBlocks.STRIPPED_RUBBER_WOOD.get(),
                        REOBlocks.RESISTANT_RUBBER_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get());

        this.tag(REOTags.Blocks.TEAK_LOGS)
                .add(REOBlocks.TEAK_LOG.get(), REOBlocks.STRIPPED_TEAK_LOG.get(),
                        REOBlocks.RESISTANT_TEAK_LOG.get(), REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get(),
                        REOBlocks.TEAK_WOOD.get(), REOBlocks.STRIPPED_TEAK_WOOD.get(),
                        REOBlocks.RESISTANT_TEAK_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get());

        this.tag(REOTags.Blocks.WALNUT_LOGS)
                .add(REOBlocks.WALNUT_LOG.get(), REOBlocks.STRIPPED_WALNUT_LOG.get(),
                        REOBlocks.RESISTANT_WALNUT_LOG.get(), REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get(),
                        REOBlocks.WALNUT_WOOD.get(), REOBlocks.STRIPPED_WALNUT_WOOD.get(),
                        REOBlocks.RESISTANT_WALNUT_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get());

        this.tag(REOTags.Blocks.WILLOW_LOGS)
                .add(REOBlocks.WILLOW_LOG.get(), REOBlocks.STRIPPED_WILLOW_LOG.get(),
                        REOBlocks.RESISTANT_WILLOW_LOG.get(), REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get(),
                        REOBlocks.WILLOW_WOOD.get(), REOBlocks.STRIPPED_WILLOW_WOOD.get(),
                        REOBlocks.RESISTANT_WILLOW_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get());


        this.tag(REOTags.Blocks.VANILLA_RESISTANT_LOGS)
                .add(REOBlocks.RESISTANT_OAK_LOG.get(), REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get(),
                        REOBlocks.RESISTANT_OAK_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get(),
                        REOBlocks.RESISTANT_SPRUCE_LOG.get(), REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get(),
                        REOBlocks.RESISTANT_SPRUCE_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get(),
                        REOBlocks.RESISTANT_BIRCH_LOG.get(), REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get(),
                        REOBlocks.RESISTANT_BIRCH_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get(),
                        REOBlocks.RESISTANT_JUNGLE_LOG.get(), REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get(),
                        REOBlocks.RESISTANT_JUNGLE_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get(),
                        REOBlocks.RESISTANT_ACACIA_LOG.get(), REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get(),
                        REOBlocks.RESISTANT_ACACIA_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get(),
                        REOBlocks.RESISTANT_DARK_OAK_LOG.get(), REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get(),
                        REOBlocks.RESISTANT_DARK_OAK_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get(),
                        REOBlocks.RESISTANT_MANGROVE_LOG.get(), REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get(),
                        REOBlocks.RESISTANT_MANGROVE_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get(),
                        REOBlocks.RESISTANT_CHERRY_LOG.get(), REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get(),
                        REOBlocks.RESISTANT_CHERRY_WOOD.get(), REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get());

        this.tag(BlockTags.LOGS)
                .addTag(REOTags.Blocks.BALSA_LOGS).addTag(REOTags.Blocks.BAOBAB_LOGS).addTag(REOTags.Blocks.HILL_CHERRY_LOGS)
                .addTag(REOTags.Blocks.CHESTNUT_LOGS).addTag(REOTags.Blocks.CITRUS_LOGS).addTag(REOTags.Blocks.EBONY_LOGS)
                .addTag(REOTags.Blocks.LARCH_LOGS).addTag(REOTags.Blocks.MAHOGANY_LOGS).addTag(REOTags.Blocks.MAPLE_LOGS)
                .addTag(REOTags.Blocks.PALM_LOGS).addTag(REOTags.Blocks.PAPAYA_LOGS).addTag(REOTags.Blocks.PINE_LOGS)
                .addTag(REOTags.Blocks.PLUM_LOGS).addTag(REOTags.Blocks.POPLAR_LOGS).addTag(REOTags.Blocks.REDWOOD_LOGS)
                .addTag(REOTags.Blocks.RUBBER_LOGS).addTag(REOTags.Blocks.TEAK_LOGS).addTag(REOTags.Blocks.WALNUT_LOGS)
                .addTag(REOTags.Blocks.WILLOW_LOGS).addTag(REOTags.Blocks.VANILLA_RESISTANT_LOGS);

        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .addTag(REOTags.Blocks.BALSA_LOGS).addTag(REOTags.Blocks.BAOBAB_LOGS).addTag(REOTags.Blocks.HILL_CHERRY_LOGS)
                .addTag(REOTags.Blocks.CHESTNUT_LOGS).addTag(REOTags.Blocks.CITRUS_LOGS).addTag(REOTags.Blocks.EBONY_LOGS)
                .addTag(REOTags.Blocks.LARCH_LOGS).addTag(REOTags.Blocks.MAHOGANY_LOGS).addTag(REOTags.Blocks.MAPLE_LOGS)
                .addTag(REOTags.Blocks.PALM_LOGS).addTag(REOTags.Blocks.PAPAYA_LOGS).addTag(REOTags.Blocks.PINE_LOGS)
                .addTag(REOTags.Blocks.PLUM_LOGS).addTag(REOTags.Blocks.POPLAR_LOGS).addTag(REOTags.Blocks.REDWOOD_LOGS)
                .addTag(REOTags.Blocks.RUBBER_LOGS).addTag(REOTags.Blocks.TEAK_LOGS).addTag(REOTags.Blocks.WALNUT_LOGS)
                .addTag(REOTags.Blocks.WILLOW_LOGS).addTag(REOTags.Blocks.VANILLA_RESISTANT_LOGS);

        // Ores
        this.tag(REOTags.Blocks.REO_ORES).add(REOBlocks.ALUMINUM_ORE.get(), REOBlocks.LEAD_ORE.get(),
                REOBlocks.NICKEL_ORE.get(), REOBlocks.PLATINUM_ORE.get(), REOBlocks.SILVER_ORE.get(),
                REOBlocks.TIN_ORE.get(), REOBlocks.URANIUM_ORE.get(), REOBlocks.ZINC_ORE.get());

        this.tag(REOTags.Blocks.REO_DEEPSLATE_ORES).add(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), REOBlocks.DEEPSLATE_LEAD_ORE.get(),
                REOBlocks.DEEPSLATE_NICKEL_ORE.get(), REOBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                REOBlocks.DEEPSLATE_SILVER_ORE.get(), REOBlocks.DEEPSLATE_URANIUM_ORE.get(), REOBlocks.DEEPSLATE_ZINC_ORE.get());

        this.tag(REOTags.Blocks.REO_GRAVEL_ORES).add(REOBlocks.ALUMINUM_GRAVEL_ORE.get(), REOBlocks.LEAD_GRAVEL_ORE.get(),
                REOBlocks.NICKEL_GRAVEL_ORE.get(), REOBlocks.PLATINUM_GRAVEL_ORE.get(),
                REOBlocks.SILVER_GRAVEL_ORE.get(), REOBlocks.TIN_GRAVEL_ORE.get(),
                REOBlocks.URANIUM_GRAVEL_ORE.get(), REOBlocks.ZINC_GRAVEL_ORE.get());

        this.tag(REOTags.Blocks.REO_NETHER_ORES).add(REOBlocks.NETHER_ALUMINIUM_ORE.get(), REOBlocks.NETHER_LEAD_ORE.get(),
                REOBlocks.NETHER_NICKEL_ORE.get(), REOBlocks.NETHER_PLATINUM_ORE.get(),
                REOBlocks.NETHER_SILVER_ORE.get(), REOBlocks.NETHER_TIN_ORE.get(),
                REOBlocks.NETHER_URANIUM_ORE.get(), REOBlocks.NETHER_ZINC_ORE.get());

        this.tag(REOTags.Blocks.REO_END_ORES).add(REOBlocks.ENDERITE_ORE.get());

        // Vanilla
        this.tag(BlockTags.GOLD_ORES).add(REOBlocks.GOLD_GRAVEL_ORE.get());
        this.tag(BlockTags.IRON_ORES).add(REOBlocks.IRON_GRAVEL_ORE.get()).add(REOBlocks.NETHER_IRON_ORE.get());
        this.tag(BlockTags.DIAMOND_ORES).add(REOBlocks.DIAMOND_GRAVEL_ORE.get()).add(REOBlocks.NETHER_DIAMOND_ORE.get());
        this.tag(BlockTags.REDSTONE_ORES).add(REOBlocks.REDSTONE_GRAVEL_ORE.get()).add(REOBlocks.NETHER_REDSTONE_ORE.get());
        this.tag(BlockTags.LAPIS_ORES).add(REOBlocks.LAPIS_GRAVEL_ORE.get()).add(REOBlocks.NETHER_LAPIS_ORE.get());
        this.tag(BlockTags.COAL_ORES).add(REOBlocks.COAL_GRAVEL_ORE.get()).add(REOBlocks.NETHER_COAL_ORE.get());
        this.tag(BlockTags.EMERALD_ORES).add(REOBlocks.EMERALD_GRAVEL_ORE.get()).add(REOBlocks.NETHER_EMERALD_ORE.get());
        this.tag(BlockTags.COPPER_ORES).add(REOBlocks.COPPER_GRAVEL_ORE.get()).add(REOBlocks.NETHER_COPPER_ORE.get());

        // Modded
        this.tag(REOTags.Blocks.ORES_ALUMINUM)
                .add(REOBlocks.ALUMINUM_ORE.get()).add(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get())
                .add(REOBlocks.ALUMINUM_GRAVEL_ORE.get()).add(REOBlocks.NETHER_ALUMINIUM_ORE.get());
        this.tag(REOTags.Blocks.ORES_LEAD)
                .add(REOBlocks.LEAD_ORE.get()).add(REOBlocks.DEEPSLATE_LEAD_ORE.get())
                .add(REOBlocks.LEAD_GRAVEL_ORE.get()).add(REOBlocks.NETHER_LEAD_ORE.get());
        this.tag(REOTags.Blocks.ORES_NICKEL)
                .add(REOBlocks.NICKEL_ORE.get()).add(REOBlocks.DEEPSLATE_NICKEL_ORE.get())
                .add(REOBlocks.NICKEL_GRAVEL_ORE.get()).add(REOBlocks.NETHER_NICKEL_ORE.get());
        this.tag(REOTags.Blocks.ORES_PLATINUM)
                .add(REOBlocks.PLATINUM_ORE.get()).add(REOBlocks.DEEPSLATE_PLATINUM_ORE.get())
                .add(REOBlocks.PLATINUM_GRAVEL_ORE.get()).add(REOBlocks.NETHER_PLATINUM_ORE.get());
        this.tag(REOTags.Blocks.ORES_SILVER)
                .add(REOBlocks.SILVER_ORE.get()).add(REOBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(REOBlocks.SILVER_GRAVEL_ORE.get()).add(REOBlocks.NETHER_SILVER_ORE.get());
        this.tag(REOTags.Blocks.ORES_TIN)
                .add(REOBlocks.TIN_ORE.get()).add(REOBlocks.TIN_GRAVEL_ORE.get())
                .add(REOBlocks.NETHER_TIN_ORE.get());
        this.tag(REOTags.Blocks.ORES_URANIUM)
                .add(REOBlocks.URANIUM_ORE.get()).add(REOBlocks.DEEPSLATE_URANIUM_ORE.get())
                .add(REOBlocks.URANIUM_GRAVEL_ORE.get()).add(REOBlocks.NETHER_URANIUM_ORE.get());
        this.tag(REOTags.Blocks.ORES_ZINC)
                .add(REOBlocks.ZINC_ORE.get()).add(REOBlocks.DEEPSLATE_ZINC_ORE.get())
                .add(REOBlocks.ZINC_GRAVEL_ORE.get()).add(REOBlocks.NETHER_ZINC_ORE.get());

        // Storage Blocks //
        // Block
        this.tag(REOTags.Blocks.STORAGE_BLOCKS).add(REOBlocks.ALUMINUM_BLOCK.get(), REOBlocks.BRASS_BLOCK.get(),
                REOBlocks.BRONZE_BLOCK.get(), REOBlocks.ELECTRUM_BLOCK.get(), REOBlocks.ENDERITE_BLOCK.get(),
                REOBlocks.LEAD_BLOCK.get(), REOBlocks.NICKEL_BLOCK.get(), REOBlocks.PERIDOT_BLOCK.get(),
                REOBlocks.PLATINUM_BLOCK.get(), REOBlocks.RUBY_BLOCK.get(), REOBlocks.SAPPHIRE_BLOCK.get(),
                REOBlocks.SILVER_BLOCK.get(), REOBlocks.STEEL_BLOCK.get(), REOBlocks.TIN_BLOCK.get(),
                REOBlocks.URANIUM_BLOCK.get(), REOBlocks.ZINC_BLOCK.get());

        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(REOBlocks.ALUMINUM_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_BRASS).add(REOBlocks.BRASS_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_BRONZE).add(REOBlocks.BRONZE_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ELECTRUM).add(REOBlocks.ELECTRUM_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ENDERITE).add(REOBlocks.ENDERITE_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_LEAD).add(REOBlocks.LEAD_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_NICKEL).add(REOBlocks.NICKEL_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_PERIDOT).add(REOBlocks.PERIDOT_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_PLATINUM).add(REOBlocks.PLATINUM_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_RUBY).add(REOBlocks.RUBY_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(REOBlocks.SAPPHIRE_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_SILVER).add(REOBlocks.SILVER_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_STEEL).add(REOBlocks.STEEL_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_TIN).add(REOBlocks.TIN_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_URANIUM).add(REOBlocks.URANIUM_BLOCK.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ZINC).add(REOBlocks.ZINC_BLOCK.get());

        // Raw
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS).add(REOBlocks.RAW_ALUMINIUM_BLOCK.get(), REOBlocks.RAW_ENDERITE_BLOCK.get(),
                REOBlocks.RAW_LEAD_BLOCK.get(), REOBlocks.RAW_NICKEL_BLOCK.get(), REOBlocks.RAW_PLATINUM_BLOCK.get(),
                REOBlocks.RAW_SILVER_BLOCK.get(), REOBlocks.RAW_TIN_BLOCK.get(), REOBlocks.RAW_URANIUM_BLOCK.get(),
                REOBlocks.RAW_ZINC_BLOCK.get());

        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ALUMINUM).add(REOBlocks.RAW_ALUMINIUM_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ENDERITE).add(REOBlocks.RAW_ENDERITE_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_LEAD).add(REOBlocks.RAW_LEAD_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_NICKEL).add(REOBlocks.RAW_NICKEL_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_PLATINUM).add(REOBlocks.RAW_PLATINUM_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_SILVER).add(REOBlocks.RAW_SILVER_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_TIN).add(REOBlocks.RAW_TIN_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_URANIUM).add(REOBlocks.RAW_URANIUM_BLOCK.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ZINC).add(REOBlocks.RAW_ZINC_BLOCK.get());

        this.tag(REOTags.Blocks.MARBLE_BLOCKS).add(REOBlocks.MARBLE.get(), REOBlocks.MARBLE_COBBLE.get(),
                REOBlocks.MARBLE_COBBLE_MOSSY.get(), REOBlocks.MARBLE_BRICK.get(), REOBlocks.MARBLE_BRICK_MOSSY.get(),
                REOBlocks.MARBLE_BRICK_CHISELED.get(), REOBlocks.MARBLE_BRICK_CRACKED.get(),

                REOBlocks.MARBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS.get(),
                REOBlocks.MARBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE_MOSSY_SLAB.get(),
                REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get());

        this.tag(REOTags.Blocks.LIMESTONE_BLOCKS).add(REOBlocks.LIMESTONE.get(), REOBlocks.LIMESTONE_COBBLE.get(),
                REOBlocks.LIMESTONE_COBBLE_MOSSY.get(), REOBlocks.LIMESTONE_BRICK.get(), REOBlocks.LIMESTONE_BRICK_MOSSY.get(),
                REOBlocks.LIMESTONE_BRICK_CHISELED.get(), REOBlocks.LIMESTONE_BRICK_CRACKED.get(),

                REOBlocks.LIMESTONE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS.get(),
                REOBlocks.LIMESTONE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB.get(),
                REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get());

        this.tag(REOTags.Blocks.CALCITE_BLOCKS).add(REOBlocks.CALCITE_STAIRS.get(), REOBlocks.CALCITE_SLAB.get(), REOBlocks.CALCITE_WALL.get());

        this.tag(REOTags.Blocks.NETHERRACK_BLOCKS).add(REOBlocks.NETHERRACK_STAIRS.get(), REOBlocks.NETHERRACK_SLAB.get(), REOBlocks.NETHERRACK_WALL.get());

        this.tag(REOTags.Blocks.REO_CROPS).add(REOBlocks.BARLEY_CROP.get(), REOBlocks.CAULIFLOWER_CROP.get(), REOBlocks.COTTON_CROP.get(),
                REOBlocks.ONIONS_CROP.get(), REOBlocks.RICE_CROP.get(), REOBlocks.TOMATO_CROP.get());

        this.tag(REOTags.Blocks.REO_FRUITS).add(REOBlocks.CITRUS_FRUIT.get(), REOBlocks.LIME_FRUIT.get(), REOBlocks.PAPAYA_FRUIT.get(),
                REOBlocks.PEAR_FRUIT.get(), REOBlocks.PLUM_FRUIT.get(), REOBlocks.WALNUT_FRUIT.get());

        this.tag(BlockTags.BEE_GROWABLES).addTag(REOTags.Blocks.REO_CROPS).addTag(REOTags.Blocks.REO_FRUITS);

    }
}