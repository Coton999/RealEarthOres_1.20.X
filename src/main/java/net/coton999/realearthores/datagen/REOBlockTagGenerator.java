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
                .add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                        REOBlocks.GRAVEL_ORE_COAL.get(), REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.GRAVEL_ORE_DIAMOND.get(),
                        REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.GRAVEL_ORE_GOLD.get(), REOBlocks.GRAVEL_ORE_IRON.get(),
                        REOBlocks.GRAVEL_ORE_LAPIS.get(), REOBlocks.GRAVEL_ORE_LEAD.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(),
                        REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_REDSTONE.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),
                        REOBlocks.GRAVEL_ORE_TIN.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(), REOBlocks.GRAVEL_ORE_ZINC.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(REOTags.Blocks.REO_ORES) .addTag(REOTags.Blocks.REO_DEEPSLATE_ORES) .addTag(REOTags.Blocks.REO_NETHER_ORES)
                .addTag(REOTags.Blocks.REO_END_ORES) .addTag(REOTags.Blocks.STORAGE_BLOCKS) .addTag(REOTags.Blocks.RAW_STORAGE_BLOCKS)
                .addTag(REOTags.Blocks.MARBLE_BLOCKS) .addTag(REOTags.Blocks.LIMESTONE_BLOCKS) .addTag(REOTags.Blocks.CALCITE_BLOCKS)
                .addTag(REOTags.Blocks.NETHERRACK_BLOCKS) .addTag(REOTags.Blocks.COAL_MACHINES) .addTag(REOTags.Blocks.ELECTRIC_MACHINES);


        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.ORE_SILVER.get(),

                        REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.GRAVEL_ORE_EMERALD.get(),
                        REOBlocks.GRAVEL_ORE_REDSTONE.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),

                        REOBlocks.DEEPSLATE_SILVER.get(),

                        REOBlocks.NETHER_ALUMINIUM.get(), REOBlocks.NETHER_DIAMOND.get(), REOBlocks.NETHER_EMERALD.get(),
                        REOBlocks.NETHER_REDSTONE.get(), REOBlocks.NETHER_SILVER.get(),


                        REOBlocks.BLOCK_ALUMINIUM.get(), REOBlocks.BLOCK_PERIDOT.get(), REOBlocks.BLOCK_RUBY.get(),
                        REOBlocks.BLOCK_SAPPHIRE.get(), REOBlocks.BLOCK_SILVER.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(REOBlocks.ORE_PLATINUM.get(), REOBlocks.ORE_URANIUM.get(),

                        REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(),

                        REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(),

                        REOBlocks.NETHER_PLATINUM.get(), REOBlocks.NETHER_URANIUM.get(),

                        REOBlocks.ORE_ENDERITE.get(),

                        REOBlocks.BLOCK_ENDERITE.get(), REOBlocks.BLOCK_PLATINUM.get(), REOBlocks.BLOCK_URANIUM.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(REOBlocks.ORE_NICKEL.get(), REOBlocks.ORE_TIN.get(), REOBlocks.ORE_ZINC.get(),

                        REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.GRAVEL_ORE_LAPIS.get(),
                        REOBlocks.GRAVEL_ORE_NICKEL.get(), REOBlocks.GRAVEL_ORE_TIN.get(), REOBlocks.GRAVEL_ORE_ZINC.get(),

                        REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.DEEPSLATE_ZINC.get(),

                        REOBlocks.NETHER_COPPER.get(), REOBlocks.NETHER_IRON.get(), REOBlocks.NETHER_LAPIS.get(),
                        REOBlocks.NETHER_NICKEL.get(), REOBlocks.NETHER_TIN.get(), REOBlocks.NETHER_ZINC.get(),

                        REOBlocks.BLOCK_ALUMINIUM.get(), REOBlocks.BLOCK_NICKEL.get(),
                        REOBlocks.BLOCK_TIN.get(), REOBlocks.BLOCK_ZINC.get(),

                        REOBlocks.BLOCK_RAW_ALUMINIUM.get(), REOBlocks.BLOCK_RAW_ENDERITE.get(), REOBlocks.BLOCK_RAW_LEAD.get(),
                        REOBlocks.BLOCK_RAW_NICKEL.get(), REOBlocks.BLOCK_RAW_PLATINUM.get(), REOBlocks.BLOCK_RAW_SILVER.get(),
                        REOBlocks.BLOCK_RAW_TIN.get(), REOBlocks.BLOCK_RAW_URANIUM.get(), REOBlocks.BLOCK_RAW_ZINC.get());

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

        this.tag(BlockTags.CROPS)
                .add(REOBlocks.CROP_BARLEY.get(), REOBlocks.CROP_CAULIFLOWER.get(),
                REOBlocks.CROP_ONIONS.get(), REOBlocks.CROP_RICE.get(), REOBlocks.CROP_TOMATO.get());


        this.tag(BlockTags.WALLS)
                .add(REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get(),
                        REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get(),
                        REOBlocks.CALCITE_WALL.get(), REOBlocks.NETHERRACK_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(REOBlocks.LOG_BALSA.get(), REOBlocks.WOOD_BALSA.get(), REOBlocks.LOG_BALSA_STRIPPED.get(),
                        REOBlocks.WOOD_BALSA_STRIPPED.get(), REOBlocks.PLANKS_BALSA.get(), REOBlocks.STAIRS_BALSA.get(),
                        REOBlocks.SLAB_BALSA.get(), REOBlocks.FENCE_BALSA.get(), REOBlocks.FENCE_GATE_BALSA.get(),

                        REOBlocks.LOG_BAOBAB.get(), REOBlocks.WOOD_BAOBAB.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get(),
                        REOBlocks.WOOD_BAOBAB_STRIPPED.get(), REOBlocks.PLANKS_BAOBAB.get(), REOBlocks.STAIRS_BAOBAB.get(),
                        REOBlocks.SLAB_BAOBAB.get(), REOBlocks.FENCE_BAOBAB.get(), REOBlocks.FENCE_GATE_BAOBAB.get(),

                        REOBlocks.LOG_HILL_CHERRY.get(), REOBlocks.WOOD_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get(),
                        REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get(), REOBlocks.PLANKS_HILL_CHERRY.get(), REOBlocks.STAIRS_HILL_CHERRY.get(),
                        REOBlocks.SLAB_HILL_CHERRY.get(), REOBlocks.FENCE_HILL_CHERRY.get(), REOBlocks.FENCE_GATE_HILL_CHERRY.get(),

                        REOBlocks.LOG_CHESTNUT.get(), REOBlocks.WOOD_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get(),
                        REOBlocks.WOOD_CHESTNUT_STRIPPED.get(), REOBlocks.PLANKS_CHESTNUT.get(), REOBlocks.STAIRS_CHESTNUT.get(),
                        REOBlocks.SLAB_CHESTNUT.get(), REOBlocks.FENCE_CHESTNUT.get(), REOBlocks.FENCE_GATE_CHESTNUT.get(),

                        REOBlocks.LOG_CITRUS.get(), REOBlocks.WOOD_CITRUS.get(), REOBlocks.LOG_CITRUS_STRIPPED.get(),
                        REOBlocks.WOOD_CITRUS_STRIPPED.get(), REOBlocks.PLANKS_CITRUS.get(), REOBlocks.STAIRS_CITRUS.get(),
                        REOBlocks.SLAB_CITRUS.get(), REOBlocks.FENCE_CITRUS.get(), REOBlocks.FENCE_GATE_CITRUS.get(),

                        REOBlocks.LOG_EBONY.get(), REOBlocks.WOOD_EBONY.get(), REOBlocks.LOG_EBONY_STRIPPED.get(),
                        REOBlocks.WOOD_EBONY_STRIPPED.get(), REOBlocks.PLANKS_EBONY.get(), REOBlocks.STAIRS_EBONY.get(),
                        REOBlocks.SLAB_EBONY.get(), REOBlocks.FENCE_EBONY.get(), REOBlocks.FENCE_GATE_EBONY.get(),

                        REOBlocks.LOG_LARCH.get(), REOBlocks.WOOD_LARCH.get(), REOBlocks.LOG_LARCH_STRIPPED.get(),
                        REOBlocks.WOOD_LARCH_STRIPPED.get(), REOBlocks.PLANKS_LARCH.get(), REOBlocks.STAIRS_LARCH.get(),
                        REOBlocks.SLAB_LARCH.get(), REOBlocks.FENCE_LARCH.get(), REOBlocks.FENCE_GATE_LARCH.get(),

                        REOBlocks.LOG_LIME.get(), REOBlocks.WOOD_LIME.get(), REOBlocks.LOG_LIME_STRIPPED.get(),
                        REOBlocks.WOOD_LIME_STRIPPED.get(), REOBlocks.PLANKS_LIME.get(), REOBlocks.STAIRS_LIME.get(),
                        REOBlocks.SLAB_LIME.get(), REOBlocks.FENCE_LIME.get(), REOBlocks.FENCE_GATE_LIME.get(),

                        REOBlocks.LOG_MAHOGANY.get(), REOBlocks.WOOD_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get(),
                        REOBlocks.WOOD_MAHOGANY_STRIPPED.get(), REOBlocks.PLANKS_MAHOGANY.get(), REOBlocks.STAIRS_MAHOGANY.get(),
                        REOBlocks.SLAB_MAHOGANY.get(), REOBlocks.FENCE_MAHOGANY.get(), REOBlocks.FENCE_GATE_MAHOGANY.get(),

                        REOBlocks.LOG_MAPLE.get(), REOBlocks.WOOD_MAPLE.get(), REOBlocks.LOG_MAPLE_STRIPPED.get(),
                        REOBlocks.WOOD_MAPLE_STRIPPED.get(), REOBlocks.PLANKS_MAPLE.get(), REOBlocks.STAIRS_MAPLE.get(),
                        REOBlocks.SLAB_MAPLE.get(), REOBlocks.FENCE_MAPLE.get(), REOBlocks.FENCE_GATE_MAPLE.get(),

                        REOBlocks.LOG_PALM.get(), REOBlocks.WOOD_PALM.get(), REOBlocks.LOG_PALM_STRIPPED.get(),
                        REOBlocks.WOOD_PALM_STRIPPED.get(), REOBlocks.PLANKS_PALM.get(), REOBlocks.STAIRS_PALM.get(),
                        REOBlocks.SLAB_PALM.get(), REOBlocks.FENCE_PALM.get(), REOBlocks.FENCE_GATE_PALM.get(),

                        REOBlocks.LOG_PAPAYA.get(), REOBlocks.WOOD_PAPAYA.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get(),
                        REOBlocks.WOOD_PAPAYA_STRIPPED.get(), REOBlocks.PLANKS_PAPAYA.get(), REOBlocks.STAIRS_PAPAYA.get(),
                        REOBlocks.SLAB_PAPAYA.get(), REOBlocks.FENCE_PAPAYA.get(), REOBlocks.FENCE_GATE_PAPAYA.get(),

                        REOBlocks.LOG_PINE.get(), REOBlocks.WOOD_PINE.get(), REOBlocks.LOG_PINE_STRIPPED.get(),
                        REOBlocks.WOOD_PINE_STRIPPED.get(), REOBlocks.PLANKS_PINE.get(), REOBlocks.STAIRS_PINE.get(),
                        REOBlocks.SLAB_PINE.get(), REOBlocks.FENCE_PINE.get(), REOBlocks.FENCE_GATE_PINE.get(),

                        REOBlocks.LOG_PLUM.get(), REOBlocks.WOOD_PLUM.get(), REOBlocks.LOG_PLUM_STRIPPED.get(),
                        REOBlocks.WOOD_PLUM_STRIPPED.get(), REOBlocks.PLANKS_PLUM.get(), REOBlocks.STAIRS_PLUM.get(),
                        REOBlocks.SLAB_PLUM.get(), REOBlocks.FENCE_PLUM.get(), REOBlocks.FENCE_GATE_PLUM.get(),

                        REOBlocks.LOG_POPLAR.get(), REOBlocks.WOOD_POPLAR.get(), REOBlocks.LOG_POPLAR_STRIPPED.get(),
                        REOBlocks.WOOD_POPLAR_STRIPPED.get(), REOBlocks.PLANKS_POPLAR.get(), REOBlocks.STAIRS_POPLAR.get(),
                        REOBlocks.SLAB_POPLAR.get(), REOBlocks.FENCE_POPLAR.get(), REOBlocks.FENCE_GATE_POPLAR.get(),

                        REOBlocks.LOG_REDWOOD.get(), REOBlocks.WOOD_REDWOOD.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get(),
                        REOBlocks.WOOD_REDWOOD_STRIPPED.get(), REOBlocks.PLANKS_REDWOOD.get(), REOBlocks.STAIRS_REDWOOD.get(),
                        REOBlocks.SLAB_REDWOOD.get(), REOBlocks.FENCE_REDWOOD.get(), REOBlocks.FENCE_GATE_REDWOOD.get(),

                        REOBlocks.LOG_RUBBER.get(), REOBlocks.WOOD_RUBBER.get(), REOBlocks.LOG_RUBBER_STRIPPED.get(),
                        REOBlocks.WOOD_RUBBER_STRIPPED.get(), REOBlocks.PLANKS_RUBBER.get(), REOBlocks.STAIRS_RUBBER.get(),
                        REOBlocks.SLAB_RUBBER.get(), REOBlocks.FENCE_RUBBER.get(), REOBlocks.FENCE_GATE_RUBBER.get(),

                        REOBlocks.LOG_WALNUT.get(), REOBlocks.WOOD_WALNUT.get(), REOBlocks.LOG_WALNUT_STRIPPED.get(),
                        REOBlocks.WOOD_WALNUT_STRIPPED.get(), REOBlocks.PLANKS_WALNUT.get(), REOBlocks.STAIRS_WALNUT.get(),
                        REOBlocks.SLAB_WALNUT.get(), REOBlocks.FENCE_WALNUT.get(), REOBlocks.FENCE_GATE_WALNUT.get(),

                        REOBlocks.LOG_WILLOW.get(), REOBlocks.WOOD_WILLOW.get(), REOBlocks.LOG_WILLOW_STRIPPED.get(),
                        REOBlocks.WOOD_WILLOW_STRIPPED.get(), REOBlocks.PLANKS_WILLOW.get(), REOBlocks.STAIRS_WILLOW.get(),
                        REOBlocks.SLAB_WILLOW.get(), REOBlocks.FENCE_WILLOW.get(), REOBlocks.FENCE_GATE_WILLOW.get());

        this.tag(BlockTags.PLANKS)
                .add(REOBlocks.PLANKS_BALSA.get(), REOBlocks.PLANKS_BAOBAB.get(), REOBlocks.PLANKS_HILL_CHERRY.get(), REOBlocks.PLANKS_CHESTNUT.get(),
                        REOBlocks.PLANKS_CITRUS.get(), REOBlocks.PLANKS_EBONY.get(), REOBlocks.PLANKS_LARCH.get(), REOBlocks.PLANKS_LIME.get(),
                        REOBlocks.PLANKS_MAHOGANY.get(), REOBlocks.PLANKS_MAPLE.get(), REOBlocks.PLANKS_PALM.get(), REOBlocks.PLANKS_PAPAYA.get(),
                        REOBlocks.PLANKS_PINE.get(), REOBlocks.PLANKS_PLUM.get(), REOBlocks.PLANKS_POPLAR.get(), REOBlocks.PLANKS_REDWOOD.get(),
                        REOBlocks.PLANKS_RUBBER.get(), REOBlocks.PLANKS_TEAK.get(), REOBlocks.PLANKS_WALNUT.get(), REOBlocks.PLANKS_WILLOW.get(),

                        REOBlocks.PLANKS_BALSA_RESISTANT.get(), REOBlocks.PLANKS_BAOBAB_RESISTANT.get(), REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get(),
                        REOBlocks.PLANKS_CHESTNUT_RESISTANT.get(), REOBlocks.PLANKS_CITRUS_RESISTANT.get(), REOBlocks.PLANKS_EBONY_RESISTANT.get(),
                        REOBlocks.PLANKS_LARCH_RESISTANT.get(), REOBlocks.PLANKS_LIME_RESISTANT.get(), REOBlocks.PLANKS_MAHOGANY_RESISTANT.get(),
                        REOBlocks.PLANKS_MAPLE_RESISTANT.get(), REOBlocks.PLANKS_PALM_RESISTANT.get(), REOBlocks.PLANKS_PAPAYA_RESISTANT.get(),
                        REOBlocks.PLANKS_PINE_RESISTANT.get(), REOBlocks.PLANKS_PLUM_RESISTANT.get(), REOBlocks.PLANKS_POPLAR_RESISTANT.get(),
                        REOBlocks.PLANKS_REDWOOD_RESISTANT.get(), REOBlocks.PLANKS_RUBBER_RESISTANT.get(), REOBlocks.PLANKS_TEAK_RESISTANT.get(),
                        REOBlocks.PLANKS_WALNUT_RESISTANT.get(), REOBlocks.PLANKS_WILLOW_RESISTANT.get(),

                        REOBlocks.PLANKS_OAK_RESISTANT.get(), REOBlocks.PLANKS_SPRUCE_RESISTANT.get(), REOBlocks.PLANKS_BIRCH_RESISTANT.get(),
                        REOBlocks.PLANKS_JUNGLE_RESISTANT.get(), REOBlocks.PLANKS_ACACIA_RESISTANT.get(), REOBlocks.PLANKS_DARK_OAK_RESISTANT.get(),
                        REOBlocks.PLANKS_MANGROVE_RESISTANT.get(), REOBlocks.PLANKS_CHESTNUT.get()

                );

        this.tag(BlockTags.WOODEN_SLABS)
                .add(REOBlocks.SLAB_BALSA.get(), REOBlocks.SLAB_BAOBAB.get(), REOBlocks.SLAB_HILL_CHERRY.get(), REOBlocks.SLAB_CHESTNUT.get(),
                        REOBlocks.SLAB_CITRUS.get(), REOBlocks.SLAB_EBONY.get(), REOBlocks.SLAB_LARCH.get(), REOBlocks.SLAB_LIME.get(),
                        REOBlocks.SLAB_MAHOGANY.get(), REOBlocks.SLAB_MAPLE.get(), REOBlocks.SLAB_PALM.get(), REOBlocks.SLAB_PAPAYA.get(),
                        REOBlocks.SLAB_PINE.get(), REOBlocks.SLAB_PLUM.get(), REOBlocks.SLAB_POPLAR.get(), REOBlocks.SLAB_REDWOOD.get(),
                        REOBlocks.SLAB_RUBBER.get(), REOBlocks.SLAB_TEAK.get(), REOBlocks.SLAB_WALNUT.get(), REOBlocks.SLAB_WILLOW.get(),

                        REOBlocks.SLAB_BALSA_RESISTANT.get(), REOBlocks.SLAB_BAOBAB_RESISTANT.get(), REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get(),
                        REOBlocks.SLAB_CHESTNUT_RESISTANT.get(), REOBlocks.SLAB_CITRUS_RESISTANT.get(), REOBlocks.SLAB_EBONY_RESISTANT.get(),
                        REOBlocks.SLAB_LARCH_RESISTANT.get(), REOBlocks.SLAB_LIME_RESISTANT.get(), REOBlocks.SLAB_MAHOGANY_RESISTANT.get(),
                        REOBlocks.SLAB_MAPLE_RESISTANT.get(), REOBlocks.SLAB_PALM_RESISTANT.get(), REOBlocks.SLAB_PAPAYA_RESISTANT.get(),
                        REOBlocks.SLAB_PINE_RESISTANT.get(), REOBlocks.SLAB_PLUM_RESISTANT.get(), REOBlocks.SLAB_POPLAR_RESISTANT.get(),
                        REOBlocks.SLAB_REDWOOD_RESISTANT.get(), REOBlocks.SLAB_RUBBER_RESISTANT.get(), REOBlocks.SLAB_TEAK_RESISTANT.get(),
                        REOBlocks.SLAB_WALNUT_RESISTANT.get(), REOBlocks.SLAB_WILLOW_RESISTANT.get(),
                        REOBlocks.SLAB_OAK_RESISTANT.get(), REOBlocks.SLAB_SPRUCE_RESISTANT.get(), REOBlocks.SLAB_BIRCH_RESISTANT.get(),
                        REOBlocks.SLAB_JUNGLE_RESISTANT.get(), REOBlocks.SLAB_ACACIA_RESISTANT.get(), REOBlocks.SLAB_DARK_OAK_RESISTANT.get(),
                        REOBlocks.SLAB_MANGROVE_RESISTANT.get(), REOBlocks.SLAB_CHESTNUT.get()

                );

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(REOBlocks.STAIRS_BALSA.get(), REOBlocks.STAIRS_BAOBAB.get(), REOBlocks.STAIRS_HILL_CHERRY.get(), REOBlocks.STAIRS_CHESTNUT.get(),
                        REOBlocks.STAIRS_CITRUS.get(), REOBlocks.STAIRS_EBONY.get(), REOBlocks.STAIRS_LARCH.get(), REOBlocks.STAIRS_LIME.get(),
                        REOBlocks.STAIRS_MAHOGANY.get(), REOBlocks.STAIRS_MAPLE.get(), REOBlocks.STAIRS_PALM.get(), REOBlocks.STAIRS_PAPAYA.get(),
                        REOBlocks.STAIRS_PINE.get(), REOBlocks.STAIRS_PLUM.get(), REOBlocks.STAIRS_POPLAR.get(), REOBlocks.STAIRS_REDWOOD.get(),
                        REOBlocks.STAIRS_RUBBER.get(), REOBlocks.STAIRS_TEAK.get(), REOBlocks.STAIRS_WALNUT.get(), REOBlocks.STAIRS_WILLOW.get(),

                        REOBlocks.STAIRS_BALSA_RESISTANT.get(), REOBlocks.STAIRS_BAOBAB_RESISTANT.get(), REOBlocks.STAIRS_HILL_CHERRY_RESISTANT.get(),
                        REOBlocks.STAIRS_CHESTNUT_RESISTANT.get(), REOBlocks.STAIRS_CITRUS_RESISTANT.get(), REOBlocks.STAIRS_EBONY_RESISTANT.get(),
                        REOBlocks.STAIRS_LARCH_RESISTANT.get(), REOBlocks.STAIRS_LIME_RESISTANT.get(), REOBlocks.STAIRS_MAHOGANY_RESISTANT.get(),
                        REOBlocks.STAIRS_MAPLE_RESISTANT.get(), REOBlocks.STAIRS_PALM_RESISTANT.get(), REOBlocks.STAIRS_PAPAYA_RESISTANT.get(),
                        REOBlocks.STAIRS_PINE_RESISTANT.get(), REOBlocks.STAIRS_PLUM_RESISTANT.get(), REOBlocks.STAIRS_POPLAR_RESISTANT.get(),
                        REOBlocks.STAIRS_REDWOOD_RESISTANT.get(), REOBlocks.STAIRS_RUBBER_RESISTANT.get(), REOBlocks.STAIRS_TEAK_RESISTANT.get(),
                        REOBlocks.STAIRS_WALNUT_RESISTANT.get(), REOBlocks.STAIRS_WILLOW_RESISTANT.get(),
                        REOBlocks.STAIRS_OAK_RESISTANT.get(), REOBlocks.STAIRS_SPRUCE_RESISTANT.get(), REOBlocks.STAIRS_BIRCH_RESISTANT.get(),
                        REOBlocks.STAIRS_JUNGLE_RESISTANT.get(), REOBlocks.STAIRS_ACACIA_RESISTANT.get(), REOBlocks.STAIRS_DARK_OAK_RESISTANT.get(),
                        REOBlocks.STAIRS_MANGROVE_RESISTANT.get(), REOBlocks.STAIRS_CHESTNUT.get()

                );

        this.tag(BlockTags.ALL_SIGNS)
                .add(REOBlocks.SIGN_BALSA.get(), REOBlocks.SIGN_BAOBAB.get(),  REOBlocks.SIGN_HILL_CHERRY.get(), REOBlocks.SIGN_CHESTNUT.get(),
                        REOBlocks.SIGN_CITRUS.get(), REOBlocks.SIGN_EBONY.get(), REOBlocks.SIGN_LARCH.get(),
                        REOBlocks.SIGN_LIME.get(), REOBlocks.SIGN_MAHOGANY.get(), REOBlocks.SIGN_MAPLE.get(),
                        REOBlocks.SIGN_PALM.get(), REOBlocks.SIGN_PAPAYA.get(), REOBlocks.SIGN_PINE.get(),
                        REOBlocks.SIGN_PLUM.get(), REOBlocks.SIGN_POPLAR.get(), REOBlocks.SIGN_REDWOOD.get(),
                        REOBlocks.SIGN_RUBBER.get(), REOBlocks.SIGN_TEAK.get(), REOBlocks.SIGN_WALNUT.get(),
                        REOBlocks.SIGN_WILLOW.get());

        this.tag(BlockTags.ALL_HANGING_SIGNS)
                .add(REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.SIGN_HANGING_CHESTNUT.get(),
                        REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.SIGN_HANGING_LARCH.get(),
                        REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.SIGN_HANGING_MAPLE.get(),
                        REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.SIGN_HANGING_PINE.get(),
                        REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.SIGN_HANGING_POPLAR.get(), REOBlocks.SIGN_HANGING_REDWOOD.get(),
                        REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.SIGN_HANGING_WALNUT.get(),
                        REOBlocks.SIGN_HANGING_WILLOW.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(REOBlocks.BUTTON_BALSA.get(), REOBlocks.BUTTON_BAOBAB.get(), REOBlocks.BUTTON_HILL_CHERRY.get(), REOBlocks.BUTTON_CHESTNUT.get(),
                        REOBlocks.BUTTON_CITRUS.get(), REOBlocks.BUTTON_EBONY.get(), REOBlocks.BUTTON_LARCH.get(),
                        REOBlocks.BUTTON_LIME.get(), REOBlocks.BUTTON_MAHOGANY.get(), REOBlocks.BUTTON_MAPLE.get(),
                        REOBlocks.BUTTON_PALM.get(), REOBlocks.BUTTON_PAPAYA.get(), REOBlocks.BUTTON_PINE.get(),
                        REOBlocks.BUTTON_PLUM.get(), REOBlocks.BUTTON_POPLAR.get(), REOBlocks.BUTTON_REDWOOD.get(),
                        REOBlocks.BUTTON_RUBBER.get(), REOBlocks.BUTTON_TEAK.get(), REOBlocks.BUTTON_WALNUT.get(),
                        REOBlocks.BUTTON_WILLOW.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(REOBlocks.TRAPDOOR_BALSA.get(), REOBlocks.TRAPDOOR_BAOBAB.get(), REOBlocks.TRAPDOOR_HILL_CHERRY.get(), REOBlocks.TRAPDOOR_CHESTNUT.get(),
                        REOBlocks.TRAPDOOR_CITRUS.get(), REOBlocks.TRAPDOOR_EBONY.get(), REOBlocks.TRAPDOOR_LARCH.get(),
                        REOBlocks.TRAPDOOR_LIME.get(), REOBlocks.TRAPDOOR_MAHOGANY.get(), REOBlocks.TRAPDOOR_MAPLE.get(),
                        REOBlocks.TRAPDOOR_PALM.get(), REOBlocks.TRAPDOOR_PAPAYA.get(), REOBlocks.TRAPDOOR_PINE.get(),
                        REOBlocks.TRAPDOOR_PLUM.get(), REOBlocks.TRAPDOOR_POPLAR.get(), REOBlocks.TRAPDOOR_REDWOOD.get(),
                        REOBlocks.TRAPDOOR_RUBBER.get(), REOBlocks.TRAPDOOR_TEAK.get(), REOBlocks.TRAPDOOR_WALNUT.get(),
                        REOBlocks.TRAPDOOR_WILLOW.get());


        this.tag(BlockTags.WOODEN_DOORS)
                .add(REOBlocks.DOOR_BALSA.get(), REOBlocks.DOOR_BAOBAB.get(), REOBlocks.DOOR_HILL_CHERRY.get(), REOBlocks.DOOR_CHESTNUT.get(),
                        REOBlocks.DOOR_CITRUS.get(), REOBlocks.DOOR_EBONY.get(), REOBlocks.DOOR_LARCH.get(),
                        REOBlocks.DOOR_LIME.get(), REOBlocks.DOOR_MAHOGANY.get(), REOBlocks.DOOR_MAPLE.get(),
                        REOBlocks.DOOR_PALM.get(), REOBlocks.DOOR_PAPAYA.get(), REOBlocks.DOOR_PINE.get(),
                        REOBlocks.DOOR_PLUM.get(), REOBlocks.DOOR_POPLAR.get(), REOBlocks.DOOR_REDWOOD.get(),
                        REOBlocks.DOOR_RUBBER.get(), REOBlocks.DOOR_TEAK.get(), REOBlocks.DOOR_WALNUT.get(),
                        REOBlocks.DOOR_WILLOW.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(REOBlocks.PRESSURE_PLATE_BALSA.get(), REOBlocks.PRESSURE_PLATE_BAOBAB.get(), REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get(),
                        REOBlocks.PRESSURE_PLATE_CHESTNUT.get(), REOBlocks.PRESSURE_PLATE_CITRUS.get(), REOBlocks.PRESSURE_PLATE_EBONY.get(),
                        REOBlocks.PRESSURE_PLATE_LARCH.get(), REOBlocks.PRESSURE_PLATE_LIME.get(), REOBlocks.PRESSURE_PLATE_MAHOGANY.get(),
                        REOBlocks.PRESSURE_PLATE_MAPLE.get(), REOBlocks.PRESSURE_PLATE_PALM.get(), REOBlocks.PRESSURE_PLATE_PAPAYA.get(),
                        REOBlocks.PRESSURE_PLATE_PINE.get(), REOBlocks.PRESSURE_PLATE_PLUM.get(), REOBlocks.PRESSURE_PLATE_POPLAR.get(),
                        REOBlocks.PRESSURE_PLATE_REDWOOD.get(), REOBlocks.PRESSURE_PLATE_RUBBER.get(), REOBlocks.PRESSURE_PLATE_TEAK.get(),
                        REOBlocks.PRESSURE_PLATE_WALNUT.get(), REOBlocks.PRESSURE_PLATE_WILLOW.get());


        this.tag(BlockTags.WOODEN_FENCES)
                .add(REOBlocks.FENCE_BALSA.get(), REOBlocks.FENCE_BAOBAB.get(), REOBlocks.FENCE_HILL_CHERRY.get(), REOBlocks.FENCE_CHESTNUT.get(),
                        REOBlocks.FENCE_CITRUS.get(), REOBlocks.FENCE_EBONY.get(), REOBlocks.FENCE_LARCH.get(), REOBlocks.FENCE_LIME.get(),
                        REOBlocks.FENCE_MAHOGANY.get(), REOBlocks.FENCE_MAPLE.get(), REOBlocks.FENCE_PALM.get(), REOBlocks.FENCE_PAPAYA.get(),
                        REOBlocks.FENCE_PINE.get(), REOBlocks.FENCE_PLUM.get(), REOBlocks.FENCE_POPLAR.get(), REOBlocks.FENCE_REDWOOD.get(),
                        REOBlocks.FENCE_RUBBER.get(), REOBlocks.FENCE_TEAK.get(), REOBlocks.FENCE_WALNUT.get(), REOBlocks.FENCE_WILLOW.get(),

                        REOBlocks.FENCE_BALSA_RESISTANT.get(), REOBlocks.FENCE_BAOBAB_RESISTANT.get(), REOBlocks.FENCE_HILL_CHERRY_RESISTANT.get(),
                        REOBlocks.FENCE_CHESTNUT_RESISTANT.get(), REOBlocks.FENCE_CITRUS_RESISTANT.get(), REOBlocks.FENCE_EBONY_RESISTANT.get(),
                        REOBlocks.FENCE_LARCH_RESISTANT.get(), REOBlocks.FENCE_LIME_RESISTANT.get(), REOBlocks.FENCE_MAHOGANY_RESISTANT.get(),
                        REOBlocks.FENCE_MAPLE_RESISTANT.get(), REOBlocks.FENCE_PALM_RESISTANT.get(), REOBlocks.FENCE_PAPAYA_RESISTANT.get(),
                        REOBlocks.FENCE_PINE_RESISTANT.get(), REOBlocks.FENCE_PLUM_RESISTANT.get(), REOBlocks.FENCE_POPLAR_RESISTANT.get(),
                        REOBlocks.FENCE_REDWOOD_RESISTANT.get(), REOBlocks.FENCE_RUBBER_RESISTANT.get(), REOBlocks.FENCE_TEAK_RESISTANT.get(),
                        REOBlocks.FENCE_WALNUT_RESISTANT.get(), REOBlocks.FENCE_WILLOW_RESISTANT.get(),
                        REOBlocks.FENCE_OAK_RESISTANT.get(), REOBlocks.FENCE_SPRUCE_RESISTANT.get(), REOBlocks.FENCE_BIRCH_RESISTANT.get(),
                        REOBlocks.FENCE_JUNGLE_RESISTANT.get(), REOBlocks.FENCE_ACACIA_RESISTANT.get(), REOBlocks.FENCE_DARK_OAK_RESISTANT.get(),
                        REOBlocks.FENCE_MANGROVE_RESISTANT.get(), REOBlocks.FENCE_CHERRY_RESISTANT.get()

                );

        this.tag(BlockTags.FENCE_GATES)
                .add(REOBlocks.FENCE_GATE_BALSA.get(), REOBlocks.FENCE_GATE_BAOBAB.get(), REOBlocks.FENCE_GATE_HILL_CHERRY.get(), REOBlocks.FENCE_GATE_CHESTNUT.get(),
                        REOBlocks.FENCE_GATE_CITRUS.get(), REOBlocks.FENCE_GATE_EBONY.get(), REOBlocks.FENCE_GATE_LARCH.get(), REOBlocks.FENCE_GATE_LIME.get(),
                        REOBlocks.FENCE_GATE_MAHOGANY.get(), REOBlocks.FENCE_GATE_MAPLE.get(),
                        REOBlocks.FENCE_GATE_PALM.get(), REOBlocks.FENCE_GATE_PAPAYA.get(), REOBlocks.FENCE_GATE_PINE.get(),
                        REOBlocks.FENCE_GATE_PLUM.get(), REOBlocks.FENCE_GATE_POPLAR.get(), REOBlocks.FENCE_GATE_REDWOOD.get(),
                        REOBlocks.FENCE_GATE_RUBBER.get(), REOBlocks.FENCE_GATE_TEAK.get(), REOBlocks.FENCE_GATE_WALNUT.get(),
                        REOBlocks.FENCE_GATE_WILLOW.get(),
                        REOBlocks.FENCE_GATE_BALSA_RESISTANT.get(), REOBlocks.FENCE_GATE_BAOBAB_RESISTANT.get(), REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT.get(), REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_CITRUS_RESISTANT.get(), REOBlocks.FENCE_GATE_EBONY_RESISTANT.get(), REOBlocks.FENCE_GATE_LARCH_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_LIME_RESISTANT.get(), REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT.get(), REOBlocks.FENCE_GATE_MAPLE_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_PALM_RESISTANT.get(), REOBlocks.FENCE_GATE_PAPAYA_RESISTANT.get(), REOBlocks.FENCE_GATE_PINE_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_PLUM_RESISTANT.get(), REOBlocks.FENCE_GATE_POPLAR_RESISTANT.get(), REOBlocks.FENCE_GATE_REDWOOD_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_RUBBER_RESISTANT.get(), REOBlocks.FENCE_GATE_TEAK_RESISTANT.get(), REOBlocks.FENCE_GATE_WALNUT_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_WILLOW_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_OAK_RESISTANT.get(), REOBlocks.FENCE_GATE_SPRUCE_RESISTANT.get(), REOBlocks.FENCE_GATE_BIRCH_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_JUNGLE_RESISTANT.get(), REOBlocks.FENCE_GATE_ACACIA_RESISTANT.get(), REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT.get(),
                        REOBlocks.FENCE_GATE_MANGROVE_RESISTANT.get(), REOBlocks.FENCE_GATE_CHERRY_RESISTANT.get()

                );

        this.tag(BlockTags.SAPLINGS)
                .add(REOBlocks.SAPLING_BALSA.get(), REOBlocks.SAPLING_BAOBAB.get(), REOBlocks.SAPLING_HILL_CHERRY.get(), REOBlocks.SAPLING_CHESTNUT.get(),
                        REOBlocks.SAPLING_CITRUS.get(), REOBlocks.SAPLING_EBONY.get(), REOBlocks.SAPLING_LARCH.get(),
                        REOBlocks.SAPLING_LIME.get(), REOBlocks.SAPLING_MAHOGANY.get(), REOBlocks.SAPLING_MAPLE.get(),
                        REOBlocks.SAPLING_PALM.get(), REOBlocks.SAPLING_PAPAYA.get(), REOBlocks.SAPLING_PINE.get(),
                        REOBlocks.SAPLING_PLUM.get(), REOBlocks.SAPLING_POPLAR.get(), REOBlocks.SAPLING_REDWOOD.get(),
                        REOBlocks.SAPLING_RUBBER.get(), REOBlocks.SAPLING_TEAK.get(), REOBlocks.SAPLING_WALNUT.get(),
                        REOBlocks.SAPLING_WILLOW.get());

        this.tag(BlockTags.LEAVES)
                .add(REOBlocks.LEAVES_BALSA.get(), REOBlocks.LEAVES_BAOBAB.get(), REOBlocks.LEAVES_HILL_CHERRY.get(),
                        REOBlocks.LEAVES_CHESTNUT.get(), REOBlocks.LEAVES_CHESTNUT_FRUIT.get(),
                        REOBlocks.LEAVES_CITRUS.get(), REOBlocks.LEAVES_CITRUS_FRUIT.get(),
                        REOBlocks.LEAVES_EBONY.get(), REOBlocks.LEAVES_LARCH.get(),
                        REOBlocks.LEAVES_LIME.get(), REOBlocks.LEAVES_LIME_FRUIT.get(),
                        REOBlocks.LEAVES_MAHOGANY.get(), REOBlocks.LEAVES_MAPLE.get(),
                        REOBlocks.LEAVES_PALM.get(),
                        REOBlocks.LEAVES_PAPAYA.get(), REOBlocks.LEAVES_PAPAYA_FRUIT.get(),
                        REOBlocks.LEAVES_PINE.get(),
                        REOBlocks.LEAVES_PLUM.get(), REOBlocks.LEAVES_PLUM_FRUIT.get(),
                        REOBlocks.LEAVES_POPLAR.get(), REOBlocks.LEAVES_REDWOOD.get(),
                        REOBlocks.LEAVES_RUBBER.get(), REOBlocks.LEAVES_TEAK.get(),
                        REOBlocks.LEAVES_WALNUT.get(), REOBlocks.LEAVES_WALNUT_FRUIT.get(),
                        REOBlocks.LEAVES_WILLOW.get());

        this.tag(REOTags.Blocks.LOGS_BALSA)
                .add(REOBlocks.LOG_BALSA.get(),REOBlocks.LOG_BALSA_STRIPPED.get(),REOBlocks.LOG_BALSA_RESISTANT.get(),REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_BALSA.get(),REOBlocks.WOOD_BALSA_STRIPPED.get(),REOBlocks.WOOD_BALSA_RESISTANT.get(),REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_BAOBAB)
                .add(REOBlocks.LOG_BAOBAB.get(),REOBlocks.LOG_BAOBAB_STRIPPED.get(),REOBlocks.LOG_BAOBAB_RESISTANT.get(),REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_BAOBAB.get(),REOBlocks.WOOD_BAOBAB_STRIPPED.get(),REOBlocks.WOOD_BAOBAB_RESISTANT.get(),REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_HILL_CHERRY)
                .add(REOBlocks.LOG_HILL_CHERRY.get(),REOBlocks.LOG_HILL_CHERRY_STRIPPED.get(),REOBlocks.LOG_HILL_CHERRY_RESISTANT.get(),REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_HILL_CHERRY.get(),REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get(),REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get(),REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_CHESTNUT)
                .add(REOBlocks.LOG_CHESTNUT.get(),REOBlocks.LOG_CHESTNUT_STRIPPED.get(),REOBlocks.LOG_CHESTNUT_RESISTANT.get(),REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_CHESTNUT.get(),REOBlocks.WOOD_CHESTNUT_STRIPPED.get(),REOBlocks.WOOD_CHESTNUT_RESISTANT.get(),REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_CITRUS)
                .add(REOBlocks.LOG_CITRUS.get(),REOBlocks.LOG_CITRUS_STRIPPED.get(),REOBlocks.LOG_CITRUS_RESISTANT.get(),REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_CITRUS.get(),REOBlocks.WOOD_CITRUS_STRIPPED.get(),REOBlocks.WOOD_CITRUS_RESISTANT.get(),REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_EBONY)
                .add(REOBlocks.LOG_EBONY.get(),REOBlocks.LOG_EBONY_STRIPPED.get(),REOBlocks.LOG_EBONY_RESISTANT.get(),REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_EBONY.get(),REOBlocks.WOOD_EBONY_STRIPPED.get(),REOBlocks.WOOD_EBONY_RESISTANT.get(),REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_LARCH)
                .add(REOBlocks.LOG_LARCH.get(),REOBlocks.LOG_LARCH_STRIPPED.get(),REOBlocks.LOG_LARCH_RESISTANT.get(),REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_LARCH.get(),REOBlocks.WOOD_LARCH_STRIPPED.get(),REOBlocks.WOOD_LARCH_RESISTANT.get(),REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_LIME)
                .add(REOBlocks.LOG_LIME.get(),REOBlocks.LOG_LIME_STRIPPED.get(),REOBlocks.LOG_LIME_RESISTANT.get(),REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_LIME.get(),REOBlocks.WOOD_LIME_STRIPPED.get(),REOBlocks.WOOD_LIME_RESISTANT.get(),REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_MAHOGANY)
                .add(REOBlocks.LOG_MAHOGANY.get(),REOBlocks.LOG_MAHOGANY_STRIPPED.get(),REOBlocks.LOG_MAHOGANY_RESISTANT.get(),REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_MAHOGANY.get(),REOBlocks.WOOD_MAHOGANY_STRIPPED.get(),REOBlocks.WOOD_MAHOGANY_RESISTANT.get(),REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_MAPLE)
                .add(REOBlocks.LOG_MAPLE.get(),REOBlocks.LOG_MAPLE_STRIPPED.get(),REOBlocks.LOG_MAPLE_RESISTANT.get(),REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_MAPLE.get(),REOBlocks.WOOD_MAPLE_STRIPPED.get(),REOBlocks.WOOD_MAPLE_RESISTANT.get(),REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_PALM)
                .add(REOBlocks.LOG_PALM.get(),REOBlocks.LOG_PALM_STRIPPED.get(),REOBlocks.LOG_PALM_RESISTANT.get(),REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_PALM.get(),REOBlocks.WOOD_PALM_STRIPPED.get(),REOBlocks.WOOD_PALM_RESISTANT.get(),REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_PAPAYA)
                .add(REOBlocks.LOG_PAPAYA.get(),REOBlocks.LOG_PAPAYA_STRIPPED.get(),REOBlocks.LOG_PAPAYA_RESISTANT.get(),REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_PAPAYA.get(),REOBlocks.WOOD_PAPAYA_STRIPPED.get(),REOBlocks.WOOD_PAPAYA_RESISTANT.get(),REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_PINE)
                .add(REOBlocks.LOG_PINE.get(),REOBlocks.LOG_PINE_STRIPPED.get(),REOBlocks.LOG_PINE_RESISTANT.get(),REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_PINE.get(),REOBlocks.WOOD_PINE_STRIPPED.get(),REOBlocks.WOOD_PINE_RESISTANT.get(),REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_PLUM)
                .add(REOBlocks.LOG_PLUM.get(),REOBlocks.LOG_PLUM_STRIPPED.get(),REOBlocks.LOG_PLUM_RESISTANT.get(),REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_PLUM.get(),REOBlocks.WOOD_PLUM_STRIPPED.get(),REOBlocks.WOOD_PLUM_RESISTANT.get(),REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_POPLAR)
                .add(REOBlocks.LOG_POPLAR.get(),REOBlocks.LOG_POPLAR_STRIPPED.get(),REOBlocks.LOG_POPLAR_RESISTANT.get(),REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_POPLAR.get(),REOBlocks.WOOD_POPLAR_STRIPPED.get(),REOBlocks.WOOD_POPLAR_RESISTANT.get(),REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_REDWOOD)
                .add(REOBlocks.LOG_REDWOOD.get(),REOBlocks.LOG_REDWOOD_STRIPPED.get(),REOBlocks.LOG_REDWOOD_RESISTANT.get(),REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_REDWOOD.get(),REOBlocks.WOOD_REDWOOD_STRIPPED.get(),REOBlocks.WOOD_REDWOOD_RESISTANT.get(),REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_RUBBER)
                .add(REOBlocks.LOG_RUBBER.get(),REOBlocks.LOG_RUBBER_STRIPPED.get(),REOBlocks.LOG_RUBBER_RESISTANT.get(),REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_RUBBER.get(),REOBlocks.WOOD_RUBBER_STRIPPED.get(),REOBlocks.WOOD_RUBBER_RESISTANT.get(),REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_TEAK)
                .add(REOBlocks.LOG_TEAK.get(),REOBlocks.LOG_TEAK_STRIPPED.get(),REOBlocks.LOG_TEAK_RESISTANT.get(),REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_TEAK.get(),REOBlocks.WOOD_TEAK_STRIPPED.get(),REOBlocks.WOOD_TEAK_RESISTANT.get(),REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_WALNUT)
                .add(REOBlocks.LOG_WALNUT.get(),REOBlocks.LOG_WALNUT_STRIPPED.get(),REOBlocks.LOG_WALNUT_RESISTANT.get(),REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_WALNUT.get(),REOBlocks.WOOD_WALNUT_STRIPPED.get(),REOBlocks.WOOD_WALNUT_RESISTANT.get(),REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_WILLOW)
                .add(REOBlocks.LOG_WILLOW.get(),REOBlocks.LOG_WILLOW_STRIPPED.get(),REOBlocks.LOG_WILLOW_RESISTANT.get(),REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_WILLOW.get(),REOBlocks.WOOD_WILLOW_STRIPPED.get(),REOBlocks.WOOD_WILLOW_RESISTANT.get(),REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get());

        this.tag(REOTags.Blocks.LOGS_VANILLA_RESISTANT)
                .add(REOBlocks.LOG_OAK_RESISTANT.get(),REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_OAK_RESISTANT.get(),REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_SPRUCE_RESISTANT.get(),REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_SPRUCE_RESISTANT.get(),REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_BIRCH_RESISTANT.get(),REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_BIRCH_RESISTANT.get(),REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_JUNGLE_RESISTANT.get(),REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_JUNGLE_RESISTANT.get(),REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_ACACIA_RESISTANT.get(),REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_ACACIA_RESISTANT.get(),REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_DARK_OAK_RESISTANT.get(),REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_DARK_OAK_RESISTANT.get(),REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_MANGROVE_RESISTANT.get(),REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_MANGROVE_RESISTANT.get(),REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get(),
                        REOBlocks.LOG_CHERRY_RESISTANT.get(),REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get(),
                        REOBlocks.WOOD_CHERRY_RESISTANT.get(),REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get());

        this.tag(BlockTags.LOGS)
                .addTag(REOTags.Blocks.LOGS_BALSA).addTag(REOTags.Blocks.LOGS_BAOBAB).addTag(REOTags.Blocks.LOGS_HILL_CHERRY)
                .addTag(REOTags.Blocks.LOGS_CHESTNUT).addTag(REOTags.Blocks.LOGS_CITRUS).addTag(REOTags.Blocks.LOGS_EBONY)
                .addTag(REOTags.Blocks.LOGS_LARCH).addTag(REOTags.Blocks.LOGS_MAHOGANY).addTag(REOTags.Blocks.LOGS_MAPLE)
                .addTag(REOTags.Blocks.LOGS_PALM).addTag(REOTags.Blocks.LOGS_PAPAYA).addTag(REOTags.Blocks.LOGS_PINE)
                .addTag(REOTags.Blocks.LOGS_PLUM).addTag(REOTags.Blocks.LOGS_POPLAR).addTag(REOTags.Blocks.LOGS_REDWOOD)
                .addTag(REOTags.Blocks.LOGS_RUBBER).addTag(REOTags.Blocks.LOGS_TEAK).addTag(REOTags.Blocks.LOGS_WALNUT)
                .addTag(REOTags.Blocks.LOGS_WILLOW).addTag(REOTags.Blocks.LOGS_VANILLA_RESISTANT);

        this.tag(BlockTags.OVERWORLD_NATURAL_LOGS)
                .addTag(REOTags.Blocks.LOGS_BALSA).addTag(REOTags.Blocks.LOGS_BAOBAB).addTag(REOTags.Blocks.LOGS_HILL_CHERRY)
                .addTag(REOTags.Blocks.LOGS_CHESTNUT).addTag(REOTags.Blocks.LOGS_CITRUS).addTag(REOTags.Blocks.LOGS_EBONY)
                .addTag(REOTags.Blocks.LOGS_LARCH).addTag(REOTags.Blocks.LOGS_MAHOGANY).addTag(REOTags.Blocks.LOGS_MAPLE)
                .addTag(REOTags.Blocks.LOGS_PALM).addTag(REOTags.Blocks.LOGS_PAPAYA).addTag(REOTags.Blocks.LOGS_PINE)
                .addTag(REOTags.Blocks.LOGS_PLUM).addTag(REOTags.Blocks.LOGS_POPLAR).addTag(REOTags.Blocks.LOGS_REDWOOD)
                .addTag(REOTags.Blocks.LOGS_RUBBER).addTag(REOTags.Blocks.LOGS_TEAK).addTag(REOTags.Blocks.LOGS_WALNUT)
                .addTag(REOTags.Blocks.LOGS_WILLOW).addTag(REOTags.Blocks.LOGS_VANILLA_RESISTANT);

        // Ores
        this.tag(REOTags.Blocks.REO_ORES).add(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.ORE_LEAD.get(),
                REOBlocks.ORE_NICKEL.get(), REOBlocks.ORE_PLATINUM.get(), REOBlocks.ORE_SILVER.get(),
                REOBlocks.ORE_TIN.get(), REOBlocks.ORE_URANIUM.get(), REOBlocks.ORE_ZINC.get());

        this.tag(REOTags.Blocks.REO_DEEPSLATE_ORES).add(REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_LEAD.get(),
                REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.DEEPSLATE_PLATINUM.get(),
                REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.DEEPSLATE_ZINC.get());

        this.tag(REOTags.Blocks.REO_GRAVEL_ORES).add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_LEAD.get(),
                REOBlocks.GRAVEL_ORE_NICKEL.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                REOBlocks.GRAVEL_ORE_SILVER.get(), REOBlocks.GRAVEL_ORE_TIN.get(),
                REOBlocks.GRAVEL_ORE_URANIUM.get(), REOBlocks.GRAVEL_ORE_ZINC.get());

        this.tag(REOTags.Blocks.REO_NETHER_ORES).add(REOBlocks.NETHER_ALUMINIUM.get(), REOBlocks.NETHER_LEAD.get(),
                REOBlocks.NETHER_NICKEL.get(), REOBlocks.NETHER_PLATINUM.get(),
                REOBlocks.NETHER_SILVER.get(), REOBlocks.NETHER_TIN.get(),
                REOBlocks.NETHER_URANIUM.get(), REOBlocks.NETHER_ZINC.get());

        this.tag(REOTags.Blocks.REO_END_ORES).add(REOBlocks.ORE_ENDERITE.get());

        // Vanilla
        this.tag(BlockTags.GOLD_ORES).add(REOBlocks.GRAVEL_ORE_GOLD.get());
        this.tag(BlockTags.IRON_ORES).add(REOBlocks.GRAVEL_ORE_IRON.get()).add(REOBlocks.NETHER_IRON.get());
        this.tag(BlockTags.DIAMOND_ORES).add(REOBlocks.GRAVEL_ORE_DIAMOND.get()).add(REOBlocks.NETHER_DIAMOND.get());
        this.tag(BlockTags.REDSTONE_ORES).add(REOBlocks.GRAVEL_ORE_REDSTONE.get()).add(REOBlocks.NETHER_REDSTONE.get());
        this.tag(BlockTags.LAPIS_ORES).add(REOBlocks.GRAVEL_ORE_LAPIS.get()).add(REOBlocks.NETHER_LAPIS.get());
        this.tag(BlockTags.COAL_ORES).add(REOBlocks.GRAVEL_ORE_COAL.get()).add(REOBlocks.NETHER_COAL.get());
        this.tag(BlockTags.EMERALD_ORES).add(REOBlocks.GRAVEL_ORE_EMERALD.get()).add(REOBlocks.NETHER_EMERALD.get());
        this.tag(BlockTags.COPPER_ORES).add(REOBlocks.GRAVEL_ORE_COPPER.get()).add(REOBlocks.NETHER_COPPER.get());

        // Modded
        this.tag(REOTags.Blocks.ORES_ALUMINUM)
                .add(REOBlocks.ORE_ALUMINIUM.get()).add(REOBlocks.DEEPSLATE_ALUMINIUM.get())
                .add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get()).add(REOBlocks.NETHER_ALUMINIUM.get());
        this.tag(REOTags.Blocks.ORES_LEAD)
                .add(REOBlocks.ORE_LEAD.get()).add(REOBlocks.DEEPSLATE_LEAD.get())
                .add(REOBlocks.GRAVEL_ORE_LEAD.get()).add(REOBlocks.NETHER_LEAD.get());
        this.tag(REOTags.Blocks.ORES_NICKEL)
                .add(REOBlocks.ORE_NICKEL.get()).add(REOBlocks.DEEPSLATE_NICKEL.get())
                .add(REOBlocks.GRAVEL_ORE_NICKEL.get()).add(REOBlocks.NETHER_NICKEL.get());
        this.tag(REOTags.Blocks.ORES_PLATINUM)
                .add(REOBlocks.ORE_PLATINUM.get()).add(REOBlocks.DEEPSLATE_PLATINUM.get())
                .add(REOBlocks.GRAVEL_ORE_PLATINUM.get()).add(REOBlocks.NETHER_PLATINUM.get());
        this.tag(REOTags.Blocks.ORES_SILVER)
                .add(REOBlocks.ORE_SILVER.get()).add(REOBlocks.DEEPSLATE_SILVER.get())
                .add(REOBlocks.GRAVEL_ORE_SILVER.get()).add(REOBlocks.NETHER_SILVER.get());
        this.tag(REOTags.Blocks.ORES_TIN)
                .add(REOBlocks.ORE_TIN.get()).add(REOBlocks.GRAVEL_ORE_TIN.get())
                .add(REOBlocks.NETHER_TIN.get());
        this.tag(REOTags.Blocks.ORES_URANIUM)
                .add(REOBlocks.ORE_URANIUM.get()).add(REOBlocks.DEEPSLATE_URANIUM.get())
                .add(REOBlocks.GRAVEL_ORE_URANIUM.get()).add(REOBlocks.NETHER_URANIUM.get());
        this.tag(REOTags.Blocks.ORES_ZINC)
                .add(REOBlocks.ORE_ZINC.get()).add(REOBlocks.DEEPSLATE_ZINC.get())
                .add(REOBlocks.GRAVEL_ORE_ZINC.get()).add(REOBlocks.NETHER_ZINC.get());

        // Storage Blocks //
        // Block
        this.tag(REOTags.Blocks.STORAGE_BLOCKS).add(REOBlocks.BLOCK_ALUMINIUM.get(), REOBlocks.BLOCK_BRASS.get(),
                REOBlocks.BLOCK_BRONZE.get(), REOBlocks.BLOCK_ELECTRUM.get(), REOBlocks.BLOCK_ENDERITE.get(),
                REOBlocks.BLOCK_LEAD.get(), REOBlocks.BLOCK_NICKEL.get(), REOBlocks.BLOCK_PERIDOT.get(),
                REOBlocks.BLOCK_PLATINUM.get(), REOBlocks.BLOCK_RUBY.get(), REOBlocks.BLOCK_SAPPHIRE.get(),
                REOBlocks.BLOCK_SILVER.get(), REOBlocks.BLOCK_STEEL.get(), REOBlocks.BLOCK_TIN.get(),
                REOBlocks.BLOCK_URANIUM.get(), REOBlocks.BLOCK_ZINC.get());

        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ALUMINUM).add(REOBlocks.BLOCK_ALUMINIUM.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_BRASS).add(REOBlocks.BLOCK_BRASS.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_BRONZE).add(REOBlocks.BLOCK_BRONZE.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ELECTRUM).add(REOBlocks.BLOCK_ELECTRUM.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ENDERITE).add(REOBlocks.BLOCK_ENDERITE.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_LEAD).add(REOBlocks.BLOCK_LEAD.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_NICKEL).add(REOBlocks.BLOCK_NICKEL.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_PERIDOT).add(REOBlocks.BLOCK_PERIDOT.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_PLATINUM).add(REOBlocks.BLOCK_PLATINUM.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_RUBY).add(REOBlocks.BLOCK_RUBY.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_SAPPHIRE).add(REOBlocks.BLOCK_SAPPHIRE.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_SILVER).add(REOBlocks.BLOCK_SILVER.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_STEEL).add(REOBlocks.BLOCK_STEEL.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_TIN).add(REOBlocks.BLOCK_TIN.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_URANIUM).add(REOBlocks.BLOCK_URANIUM.get());
        this.tag(REOTags.Blocks.STORAGE_BLOCKS_ZINC).add(REOBlocks.BLOCK_ZINC.get());

        // Raw
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS).add(REOBlocks.BLOCK_RAW_ALUMINIUM.get(), REOBlocks.BLOCK_RAW_ENDERITE.get(),
                REOBlocks.BLOCK_RAW_LEAD.get(), REOBlocks.BLOCK_RAW_NICKEL.get(), REOBlocks.BLOCK_RAW_PLATINUM.get(),
                REOBlocks.BLOCK_RAW_SILVER.get(), REOBlocks.BLOCK_RAW_TIN.get(), REOBlocks.BLOCK_RAW_URANIUM.get(),
                REOBlocks.BLOCK_RAW_ZINC.get());

        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ALUMINUM).add(REOBlocks.BLOCK_RAW_ALUMINIUM.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ENDERITE).add(REOBlocks.BLOCK_RAW_ENDERITE.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_LEAD).add(REOBlocks.BLOCK_RAW_LEAD.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_NICKEL).add(REOBlocks.BLOCK_RAW_NICKEL.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_PLATINUM).add(REOBlocks.BLOCK_RAW_PLATINUM.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_SILVER).add(REOBlocks.BLOCK_RAW_SILVER.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_TIN).add(REOBlocks.BLOCK_RAW_TIN.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_URANIUM).add(REOBlocks.BLOCK_RAW_URANIUM.get());
        this.tag(REOTags.Blocks.RAW_STORAGE_BLOCKS_ZINC).add(REOBlocks.BLOCK_RAW_ZINC.get());

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

    }
}