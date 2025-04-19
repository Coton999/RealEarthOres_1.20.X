package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class REOItemTagProvider extends ItemTagsProvider {
    public REOItemTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> holderLookup,
                              CompletableFuture<TagLookup<Block>> tagLookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, holderLookup, tagLookup, RealEarthOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(REOItems.ALUMINIUM_HELMET.get(), REOItems.ALUMINIUM_CHESTPLATE.get(),
                        REOItems.ALUMINIUM_LEGGINGS.get(), REOItems.ALUMINIUM_BOOTS.get(),

                        REOItems.AMETHYST_HELMET.get(), REOItems.AMETHYST_CHESTPLATE.get(),
                        REOItems.AMETHYST_LEGGINGS.get(), REOItems.AMETHYST_BOOTS.get(),

                        REOItems.BRONZE_HELMET.get(), REOItems.BRONZE_CHESTPLATE.get(),
                        REOItems.BRONZE_LEGGINGS.get(), REOItems.BRONZE_BOOTS.get(),

                        REOItems.ENDERITE_HELMET.get(), REOItems.ENDERITE_CHESTPLATE.get(),
                        REOItems.ENDERITE_LEGGINGS.get(), REOItems.ENDERITE_BOOTS.get(),

                        REOItems.PERIDOT_HELMET.get(), REOItems.PERIDOT_CHESTPLATE.get(),
                        REOItems.PERIDOT_LEGGINGS.get(), REOItems.PERIDOT_BOOTS.get(),

                        REOItems.PLATINUM_HELMET.get(), REOItems.PLATINUM_CHESTPLATE.get(),
                        REOItems.PLATINUM_LEGGINGS.get(), REOItems.PLATINUM_BOOTS.get(),

                        REOItems.RUBY_HELMET.get(), REOItems.RUBY_CHESTPLATE.get(),
                        REOItems.RUBY_LEGGINGS.get(), REOItems.RUBY_BOOTS.get(),

                        REOItems.SAPPHIRE_HELMET.get(), REOItems.SAPPHIRE_CHESTPLATE.get(),
                        REOItems.SAPPHIRE_LEGGINGS.get(), REOItems.SAPPHIRE_BOOTS.get(),

                        REOItems.SILVER_HELMET.get(), REOItems.SILVER_CHESTPLATE.get(),
                        REOItems.SILVER_LEGGINGS.get(), REOItems.SILVER_BOOTS.get(),

                        REOItems.STEEL_HELMET.get(), REOItems.STEEL_CHESTPLATE.get(),
                        REOItems.STEEL_LEGGINGS.get(), REOItems.STEEL_BOOTS.get());

        this.tag(ItemTags.STONE_TOOL_MATERIALS)
                .add(REOBlocks.MARBLE_COBBLE.get().asItem(), REOBlocks.LIMESTONE_COBBLE.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(REOBlocks.BALSA_PLANKS.get().asItem(), REOBlocks.BAOBAB_PLANKS.get().asItem(), REOBlocks.HILL_CHERRY_PLANKS.get().asItem(),
                        REOBlocks.CHESTNUT_PLANKS.get().asItem(), REOBlocks.CITRUS_PLANKS.get().asItem(), REOBlocks.EBONY_PLANKS.get().asItem(),
                        REOBlocks.LARCH_PLANKS.get().asItem(), REOBlocks.LIME_PLANKS.get().asItem(), REOBlocks.MAHOGANY_PLANKS.get().asItem(),
                        REOBlocks.MAPLE_PLANKS.get().asItem(), REOBlocks.PALM_PLANKS.get().asItem(), REOBlocks.PAPAYA_PLANKS.get().asItem(),
                        REOBlocks.PINE_PLANKS.get().asItem(), REOBlocks.PLUM_PLANKS.get().asItem(), REOBlocks.POPLAR_PLANKS.get().asItem(),
                        REOBlocks.REDWOOD_PLANKS.get().asItem(), REOBlocks.RUBBER_PLANKS.get().asItem(), REOBlocks.TEAK_PLANKS.get().asItem(),
                        REOBlocks.WALNUT_PLANKS.get().asItem(), REOBlocks.WILLOW_PLANKS.get().asItem(),

                        REOBlocks.RESISTANT_BALSA_PLANKS.get().asItem(), REOBlocks.RESISTANT_BAOBAB_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get().asItem(), REOBlocks.RESISTANT_CHESTNUT_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_PLANKS.get().asItem(), REOBlocks.RESISTANT_EBONY_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_PLANKS.get().asItem(), REOBlocks.RESISTANT_LIME_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_PLANKS.get().asItem(), REOBlocks.RESISTANT_MAPLE_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_PALM_PLANKS.get().asItem(), REOBlocks.RESISTANT_PAPAYA_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_PINE_PLANKS.get().asItem(), REOBlocks.RESISTANT_PLUM_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_PLANKS.get().asItem(), REOBlocks.RESISTANT_REDWOOD_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_PLANKS.get().asItem(), REOBlocks.RESISTANT_TEAK_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_PLANKS.get().asItem(), REOBlocks.RESISTANT_WILLOW_PLANKS.get().asItem(),

                        REOBlocks.RESISTANT_OAK_PLANKS.get().asItem(), REOBlocks.RESISTANT_SPRUCE_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_PLANKS.get().asItem(), REOBlocks.RESISTANT_JUNGLE_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_PLANKS.get().asItem(), REOBlocks.RESISTANT_DARK_OAK_PLANKS.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_PLANKS.get().asItem(), REOBlocks.CHESTNUT_PLANKS.get().asItem()

                );

        this.tag(ItemTags.WOODEN_SLABS)
                .add(REOBlocks.BALSA_SLAB.get().asItem(), REOBlocks.BAOBAB_SLAB.get().asItem(),
                        REOBlocks.HILL_CHERRY_SLAB.get().asItem(), REOBlocks.CHESTNUT_SLAB.get().asItem(),
                        REOBlocks.CITRUS_SLAB.get().asItem(), REOBlocks.EBONY_SLAB.get().asItem(),
                        REOBlocks.LARCH_SLAB.get().asItem(), REOBlocks.LIME_SLAB.get().asItem(),
                        REOBlocks.MAHOGANY_SLAB.get().asItem(), REOBlocks.MAPLE_SLAB.get().asItem(),
                        REOBlocks.PALM_SLAB.get().asItem(), REOBlocks.PAPAYA_SLAB.get().asItem(),
                        REOBlocks.PINE_SLAB.get().asItem(), REOBlocks.PLUM_SLAB.get().asItem(),
                        REOBlocks.POPLAR_SLAB.get().asItem(), REOBlocks.REDWOOD_SLAB.get().asItem(),
                        REOBlocks.RUBBER_SLAB.get().asItem(), REOBlocks.TEAK_SLAB.get().asItem(),
                        REOBlocks.WALNUT_SLAB.get().asItem(), REOBlocks.WILLOW_SLAB.get().asItem(),

                        REOBlocks.RESISTANT_BALSA_SLAB.get().asItem(), REOBlocks.RESISTANT_BAOBAB_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get().asItem(), REOBlocks.RESISTANT_CHESTNUT_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_SLAB.get().asItem(), REOBlocks.RESISTANT_EBONY_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_SLAB.get().asItem(), REOBlocks.RESISTANT_LIME_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_SLAB.get().asItem(), REOBlocks.RESISTANT_MAPLE_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_PALM_SLAB.get().asItem(), REOBlocks.RESISTANT_PAPAYA_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_PINE_SLAB.get().asItem(), REOBlocks.RESISTANT_PLUM_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_SLAB.get().asItem(), REOBlocks.RESISTANT_REDWOOD_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_SLAB.get().asItem(), REOBlocks.RESISTANT_TEAK_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_SLAB.get().asItem(), REOBlocks.RESISTANT_WILLOW_SLAB.get().asItem(),

                        REOBlocks.RESISTANT_OAK_SLAB.get().asItem(), REOBlocks.RESISTANT_SPRUCE_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_SLAB.get().asItem(), REOBlocks.RESISTANT_JUNGLE_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_SLAB.get().asItem(), REOBlocks.RESISTANT_DARK_OAK_SLAB.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_SLAB.get().asItem(), REOBlocks.CHESTNUT_SLAB.get().asItem()

                );

        this.tag(ItemTags.WOODEN_STAIRS)
                .add(REOBlocks.BALSA_STAIRS.get().asItem(), REOBlocks.BAOBAB_STAIRS.get().asItem(),
                        REOBlocks.HILL_CHERRY_STAIRS.get().asItem(), REOBlocks.CHESTNUT_STAIRS.get().asItem(),
                        REOBlocks.CITRUS_STAIRS.get().asItem(), REOBlocks.EBONY_STAIRS.get().asItem(),
                        REOBlocks.LARCH_STAIRS.get().asItem(), REOBlocks.LIME_STAIRS.get().asItem(),
                        REOBlocks.MAHOGANY_STAIRS.get().asItem(), REOBlocks.MAPLE_STAIRS.get().asItem(),
                        REOBlocks.PALM_STAIRS.get().asItem(), REOBlocks.PAPAYA_STAIRS.get().asItem(),
                        REOBlocks.PINE_STAIRS.get().asItem(), REOBlocks.PLUM_STAIRS.get().asItem(),
                        REOBlocks.POPLAR_STAIRS.get().asItem(), REOBlocks.REDWOOD_STAIRS.get().asItem(),
                        REOBlocks.RUBBER_STAIRS.get().asItem(), REOBlocks.TEAK_STAIRS.get().asItem(),
                        REOBlocks.WALNUT_STAIRS.get().asItem(), REOBlocks.WILLOW_STAIRS.get().asItem(),

                        REOBlocks.RESISTANT_BALSA_STAIRS.get().asItem(), REOBlocks.RESISTANT_BAOBAB_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get().asItem(), REOBlocks.RESISTANT_CHESTNUT_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_STAIRS.get().asItem(), REOBlocks.RESISTANT_EBONY_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_STAIRS.get().asItem(), REOBlocks.RESISTANT_LIME_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_STAIRS.get().asItem(), REOBlocks.RESISTANT_MAPLE_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_PALM_STAIRS.get().asItem(), REOBlocks.RESISTANT_PAPAYA_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_PINE_STAIRS.get().asItem(), REOBlocks.RESISTANT_PLUM_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_STAIRS.get().asItem(), REOBlocks.RESISTANT_REDWOOD_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_STAIRS.get().asItem(), REOBlocks.RESISTANT_TEAK_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_STAIRS.get().asItem(), REOBlocks.RESISTANT_WILLOW_STAIRS.get().asItem(),

                        REOBlocks.RESISTANT_OAK_STAIRS.get().asItem(), REOBlocks.RESISTANT_SPRUCE_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_STAIRS.get().asItem(), REOBlocks.RESISTANT_JUNGLE_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_STAIRS.get().asItem(), REOBlocks.RESISTANT_DARK_OAK_STAIRS.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_STAIRS.get().asItem(), REOBlocks.CHESTNUT_STAIRS.get().asItem()

                );

        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(REOBlocks.BALSA_BUTTON.get().asItem(), REOBlocks.BAOBAB_BUTTON.get().asItem(),
                        REOBlocks.HILL_CHERRY_BUTTON.get().asItem(), REOBlocks.CHESTNUT_BUTTON.get().asItem(),
                        REOBlocks.CITRUS_BUTTON.get().asItem(), REOBlocks.EBONY_BUTTON.get().asItem(),
                        REOBlocks.LARCH_BUTTON.get().asItem(), REOBlocks.LIME_BUTTON.get().asItem(),
                        REOBlocks.MAHOGANY_BUTTON.get().asItem(), REOBlocks.MAPLE_BUTTON.get().asItem(),
                        REOBlocks.PALM_BUTTON.get().asItem(), REOBlocks.PAPAYA_BUTTON.get().asItem(),
                        REOBlocks.PINE_BUTTON.get().asItem(), REOBlocks.PLUM_BUTTON.get().asItem(),
                        REOBlocks.POPLAR_BUTTON.get().asItem(), REOBlocks.REDWOOD_BUTTON.get().asItem(),
                        REOBlocks.RUBBER_BUTTON.get().asItem(), REOBlocks.TEAK_BUTTON.get().asItem(),
                        REOBlocks.WALNUT_BUTTON.get().asItem(), REOBlocks.WILLOW_BUTTON.get().asItem());

        this.tag(ItemTags.WOODEN_TRAPDOORS)
                .add(REOBlocks.BALSA_TRAPDOOR.get().asItem(), REOBlocks.BAOBAB_TRAPDOOR.get().asItem(),
                        REOBlocks.HILL_CHERRY_TRAPDOOR.get().asItem(), REOBlocks.CHESTNUT_TRAPDOOR.get().asItem(),
                        REOBlocks.CITRUS_TRAPDOOR.get().asItem(), REOBlocks.EBONY_TRAPDOOR.get().asItem(),
                        REOBlocks.LARCH_TRAPDOOR.get().asItem(), REOBlocks.LIME_TRAPDOOR.get().asItem(),
                        REOBlocks.MAHOGANY_TRAPDOOR.get().asItem(), REOBlocks.MAPLE_TRAPDOOR.get().asItem(),
                        REOBlocks.PALM_TRAPDOOR.get().asItem(), REOBlocks.PAPAYA_TRAPDOOR.get().asItem(),
                        REOBlocks.PINE_TRAPDOOR.get().asItem(), REOBlocks.PLUM_TRAPDOOR.get().asItem(),
                        REOBlocks.POPLAR_TRAPDOOR.get().asItem(), REOBlocks.REDWOOD_TRAPDOOR.get().asItem(),
                        REOBlocks.RUBBER_TRAPDOOR.get().asItem(), REOBlocks.TEAK_TRAPDOOR.get().asItem(),
                        REOBlocks.WALNUT_TRAPDOOR.get().asItem(), REOBlocks.WILLOW_TRAPDOOR.get().asItem());


        this.tag(ItemTags.WOODEN_DOORS)
                .add(REOBlocks.BALSA_DOOR.get().asItem(), REOBlocks.BAOBAB_DOOR.get().asItem(),
                        REOBlocks.HILL_CHERRY_DOOR.get().asItem(), REOBlocks.CHESTNUT_DOOR.get().asItem(),
                        REOBlocks.CITRUS_DOOR.get().asItem(), REOBlocks.EBONY_DOOR.get().asItem(),
                        REOBlocks.LARCH_DOOR.get().asItem(), REOBlocks.LIME_DOOR.get().asItem(),
                        REOBlocks.MAHOGANY_DOOR.get().asItem(), REOBlocks.MAPLE_DOOR.get().asItem(),
                        REOBlocks.PALM_DOOR.get().asItem(), REOBlocks.PAPAYA_DOOR.get().asItem(),
                        REOBlocks.PINE_DOOR.get().asItem(), REOBlocks.PLUM_DOOR.get().asItem(),
                        REOBlocks.POPLAR_DOOR.get().asItem(), REOBlocks.REDWOOD_DOOR.get().asItem(),
                        REOBlocks.RUBBER_DOOR.get().asItem(), REOBlocks.TEAK_DOOR.get().asItem(),
                        REOBlocks.WALNUT_DOOR.get().asItem(), REOBlocks.WILLOW_DOOR.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(REOBlocks.BALSA_PRESSURE_PLATE.get().asItem(), REOBlocks.BAOBAB_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get().asItem(), REOBlocks.CHESTNUT_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.CITRUS_PRESSURE_PLATE.get().asItem(), REOBlocks.EBONY_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.LARCH_PRESSURE_PLATE.get().asItem(), REOBlocks.LIME_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.MAHOGANY_PRESSURE_PLATE.get().asItem(), REOBlocks.MAPLE_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.PALM_PRESSURE_PLATE.get().asItem(), REOBlocks.PAPAYA_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.PINE_PRESSURE_PLATE.get().asItem(), REOBlocks.PLUM_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.POPLAR_PRESSURE_PLATE.get().asItem(), REOBlocks.REDWOOD_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.RUBBER_PRESSURE_PLATE.get().asItem(), REOBlocks.TEAK_PRESSURE_PLATE.get().asItem(),
                        REOBlocks.WALNUT_PRESSURE_PLATE.get().asItem(), REOBlocks.WILLOW_PRESSURE_PLATE.get().asItem());


        this.tag(ItemTags.WOODEN_FENCES)
                .add(REOBlocks.BALSA_FENCE.get().asItem(), REOBlocks.BAOBAB_FENCE.get().asItem(),
                        REOBlocks.HILL_CHERRY_FENCE.get().asItem(), REOBlocks.CHESTNUT_FENCE.get().asItem(),
                        REOBlocks.CITRUS_FENCE.get().asItem(), REOBlocks.EBONY_FENCE.get().asItem(),
                        REOBlocks.LARCH_FENCE.get().asItem(), REOBlocks.LIME_FENCE.get().asItem(),
                        REOBlocks.MAHOGANY_FENCE.get().asItem(), REOBlocks.MAPLE_FENCE.get().asItem(),
                        REOBlocks.PALM_FENCE.get().asItem(), REOBlocks.PAPAYA_FENCE.get().asItem(),
                        REOBlocks.PINE_FENCE.get().asItem(), REOBlocks.PLUM_FENCE.get().asItem(),
                        REOBlocks.POPLAR_FENCE.get().asItem(), REOBlocks.REDWOOD_FENCE.get().asItem(),
                        REOBlocks.RUBBER_FENCE.get().asItem(), REOBlocks.TEAK_FENCE.get().asItem(),
                        REOBlocks.WALNUT_FENCE.get().asItem(), REOBlocks.WILLOW_FENCE.get().asItem(),

                        REOBlocks.RESISTANT_BALSA_FENCE.get().asItem(), REOBlocks.RESISTANT_BAOBAB_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get().asItem(), REOBlocks.RESISTANT_CHESTNUT_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_FENCE.get().asItem(), REOBlocks.RESISTANT_EBONY_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_FENCE.get().asItem(), REOBlocks.RESISTANT_LIME_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_FENCE.get().asItem(), REOBlocks.RESISTANT_MAPLE_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_PALM_FENCE.get().asItem(), REOBlocks.RESISTANT_PAPAYA_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_PINE_FENCE.get().asItem(), REOBlocks.RESISTANT_PLUM_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_FENCE.get().asItem(), REOBlocks.RESISTANT_REDWOOD_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_FENCE.get().asItem(), REOBlocks.RESISTANT_TEAK_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_FENCE.get().asItem(), REOBlocks.RESISTANT_WILLOW_FENCE.get().asItem(),

                        REOBlocks.RESISTANT_OAK_FENCE.get().asItem(), REOBlocks.RESISTANT_SPRUCE_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_FENCE.get().asItem(), REOBlocks.RESISTANT_JUNGLE_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_FENCE.get().asItem(), REOBlocks.RESISTANT_DARK_OAK_FENCE.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_FENCE.get().asItem(), REOBlocks.CHESTNUT_FENCE.get().asItem()

                );

        this.tag(ItemTags.FENCE_GATES)
                .add(REOBlocks.BALSA_FENCE_GATE.get().asItem(), REOBlocks.BAOBAB_FENCE_GATE.get().asItem(),
                        REOBlocks.HILL_CHERRY_FENCE_GATE.get().asItem(), REOBlocks.CHESTNUT_FENCE_GATE.get().asItem(),
                        REOBlocks.CITRUS_FENCE_GATE.get().asItem(), REOBlocks.EBONY_FENCE_GATE.get().asItem(),
                        REOBlocks.LARCH_FENCE_GATE.get().asItem(), REOBlocks.LIME_FENCE_GATE.get().asItem(),
                        REOBlocks.MAHOGANY_FENCE_GATE.get().asItem(), REOBlocks.MAPLE_FENCE_GATE.get().asItem(),
                        REOBlocks.PALM_FENCE_GATE.get().asItem(), REOBlocks.PAPAYA_FENCE_GATE.get().asItem(),
                        REOBlocks.PINE_FENCE_GATE.get().asItem(), REOBlocks.PLUM_FENCE_GATE.get().asItem(),
                        REOBlocks.POPLAR_FENCE_GATE.get().asItem(), REOBlocks.REDWOOD_FENCE_GATE.get().asItem(),
                        REOBlocks.RUBBER_FENCE_GATE.get().asItem(), REOBlocks.TEAK_FENCE_GATE.get().asItem(),
                        REOBlocks.WALNUT_FENCE_GATE.get().asItem(), REOBlocks.WILLOW_FENCE_GATE.get().asItem(),

                        REOBlocks.RESISTANT_BALSA_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_EBONY_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_LIME_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_PALM_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_PINE_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_PLUM_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_TEAK_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get().asItem(),

                        REOBlocks.RESISTANT_OAK_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get().asItem(), REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get().asItem(), REOBlocks.CHESTNUT_FENCE_GATE.get().asItem()

                );

        this.tag(ItemTags.SAPLINGS)
                .add(REOBlocks.BALSA_SAPLING.get().asItem(), REOBlocks.BAOBAB_SAPLING.get().asItem(),
                        REOBlocks.HILL_CHERRY_SAPLING.get().asItem(), REOBlocks.CHESTNUT_SAPLING.get().asItem(),
                        REOBlocks.CITRUS_SAPLING.get().asItem(), REOBlocks.EBONY_SAPLING.get().asItem(),
                        REOBlocks.LARCH_SAPLING.get().asItem(), REOBlocks.LIME_SAPLING.get().asItem(),
                        REOBlocks.MAHOGANY_SAPLING.get().asItem(), REOBlocks.MAPLE_SAPLING.get().asItem(),
                        REOBlocks.PALM_SAPLING.get().asItem(), REOBlocks.PAPAYA_SAPLING.get().asItem(),
                        REOBlocks.PINE_SAPLING.get().asItem(), REOBlocks.PLUM_SAPLING.get().asItem(),
                        REOBlocks.POPLAR_SAPLING.get().asItem(), REOBlocks.REDWOOD_SAPLING.get().asItem(),
                        REOBlocks.RUBBER_SAPLING.get().asItem(), REOBlocks.TEAK_SAPLING.get().asItem(),
                        REOBlocks.WALNUT_SAPLING.get().asItem(), REOBlocks.WILLOW_SAPLING.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(REOBlocks.BALSA_LEAVES.get().asItem(), REOBlocks.BAOBAB_LEAVES.get().asItem(), REOBlocks.HILL_CHERRY_LEAVES.get().asItem(),
                        REOBlocks.CHESTNUT_LEAVES.get().asItem(), REOBlocks.CHESTNUT_FRUIT_LEAVES.get().asItem(),
                        REOBlocks.CITRUS_LEAVES.get().asItem(), REOBlocks.CITRUS_FRUIT_LEAVES.get().asItem(),
                        REOBlocks.EBONY_LEAVES.get().asItem(), REOBlocks.LARCH_LEAVES.get().asItem(),
                        REOBlocks.LIME_LEAVES.get().asItem(), REOBlocks.LIME_FRUIT_LEAVES.get().asItem(),
                        REOBlocks.MAHOGANY_LEAVES.get().asItem(), REOBlocks.MAPLE_LEAVES.get().asItem(), REOBlocks.PALM_LEAVES.get().asItem(),
                        REOBlocks.PAPAYA_LEAVES.get().asItem(), REOBlocks.PAPAYA_FRUIT_LEAVES.get().asItem(),
                        REOBlocks.PINE_LEAVES.get().asItem(), REOBlocks.PLUM_LEAVES.get().asItem(), REOBlocks.PLUM_FRUIT_LEAVES.get().asItem(),
                        REOBlocks.POPLAR_LEAVES.get().asItem(), REOBlocks.REDWOOD_LEAVES.get().asItem(),
                        REOBlocks.RUBBER_LEAVES.get().asItem(), REOBlocks.TEAK_LEAVES.get().asItem(),
                        REOBlocks.WALNUT_LEAVES.get().asItem(), REOBlocks.WALNUT_FRUIT_LEAVES.get().asItem(), REOBlocks.WILLOW_LEAVES.get().asItem());

        this.tag(REOTags.Items.BALSA_LOGS)
                .add(REOBlocks.BALSA_LOG.get().asItem(), REOBlocks.STRIPPED_BALSA_LOG.get().asItem(),
                        REOBlocks.RESISTANT_BALSA_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get().asItem(),
                        REOBlocks.BALSA_WOOD.get().asItem(), REOBlocks.STRIPPED_BALSA_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_BALSA_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get().asItem());

        this.tag(REOTags.Items.BAOBAB_LOGS)
                .add(REOBlocks.BAOBAB_LOG.get().asItem(), REOBlocks.STRIPPED_BAOBAB_LOG.get().asItem(),
                        REOBlocks.RESISTANT_BAOBAB_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get().asItem(),
                        REOBlocks.BAOBAB_WOOD.get().asItem(), REOBlocks.STRIPPED_BAOBAB_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_BAOBAB_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get().asItem());

        this.tag(REOTags.Items.HILL_CHERRY_LOGS)
                .add(REOBlocks.HILL_CHERRY_LOG.get().asItem(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get().asItem(),
                        REOBlocks.HILL_CHERRY_WOOD.get().asItem(), REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get().asItem());

        this.tag(REOTags.Items.CHESTNUT_LOGS)
                .add(REOBlocks.CHESTNUT_LOG.get().asItem(), REOBlocks.STRIPPED_CHESTNUT_LOG.get().asItem(),
                        REOBlocks.RESISTANT_CHESTNUT_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get().asItem(),
                        REOBlocks.CHESTNUT_WOOD.get().asItem(), REOBlocks.STRIPPED_CHESTNUT_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_CHESTNUT_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get().asItem());

        this.tag(REOTags.Items.CITRUS_LOGS)
                .add(REOBlocks.CITRUS_LOG.get().asItem(), REOBlocks.STRIPPED_CITRUS_LOG.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get().asItem(),
                        REOBlocks.CITRUS_WOOD.get().asItem(), REOBlocks.STRIPPED_CITRUS_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_CITRUS_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get().asItem());

        this.tag(REOTags.Items.EBONY_LOGS)
                .add(REOBlocks.EBONY_LOG.get().asItem(), REOBlocks.STRIPPED_EBONY_LOG.get().asItem(),
                        REOBlocks.RESISTANT_EBONY_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get().asItem(),
                        REOBlocks.EBONY_WOOD.get().asItem(), REOBlocks.STRIPPED_EBONY_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_EBONY_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get().asItem());

        this.tag(REOTags.Items.LARCH_LOGS)
                .add(REOBlocks.LARCH_LOG.get().asItem(), REOBlocks.STRIPPED_LARCH_LOG.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get().asItem(),
                        REOBlocks.LARCH_WOOD.get().asItem(), REOBlocks.STRIPPED_LARCH_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_LARCH_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get().asItem());

        this.tag(REOTags.Items.LIME_LOGS)
                .add(REOBlocks.LIME_LOG.get().asItem(), REOBlocks.STRIPPED_LIME_LOG.get().asItem(),
                        REOBlocks.RESISTANT_LIME_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get().asItem(),
                        REOBlocks.LIME_WOOD.get().asItem(), REOBlocks.STRIPPED_LIME_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_LIME_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get().asItem());

        this.tag(REOTags.Items.MAHOGANY_LOGS)
                .add(REOBlocks.MAHOGANY_LOG.get().asItem(), REOBlocks.STRIPPED_MAHOGANY_LOG.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get().asItem(),
                        REOBlocks.MAHOGANY_WOOD.get().asItem(), REOBlocks.STRIPPED_MAHOGANY_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_MAHOGANY_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get().asItem());

        this.tag(REOTags.Items.MAPLE_LOGS)
                .add(REOBlocks.MAPLE_LOG.get().asItem(), REOBlocks.STRIPPED_MAPLE_LOG.get().asItem(),
                        REOBlocks.RESISTANT_MAPLE_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get().asItem(),
                        REOBlocks.MAPLE_WOOD.get().asItem(), REOBlocks.STRIPPED_MAPLE_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_MAPLE_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get().asItem());

        this.tag(REOTags.Items.PALM_LOGS)
                .add(REOBlocks.PALM_LOG.get().asItem(), REOBlocks.STRIPPED_PALM_LOG.get().asItem(),
                        REOBlocks.RESISTANT_PALM_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get().asItem(),
                        REOBlocks.PALM_WOOD.get().asItem(), REOBlocks.STRIPPED_PALM_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_PALM_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get().asItem());

        this.tag(REOTags.Items.PAPAYA_LOGS)
                .add(REOBlocks.PAPAYA_LOG.get().asItem(), REOBlocks.STRIPPED_PAPAYA_LOG.get().asItem(),
                        REOBlocks.RESISTANT_PAPAYA_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get().asItem(),
                        REOBlocks.PAPAYA_WOOD.get().asItem(), REOBlocks.STRIPPED_PAPAYA_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_PAPAYA_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get().asItem());

        this.tag(REOTags.Items.PINE_LOGS)
                .add(REOBlocks.PINE_LOG.get().asItem(), REOBlocks.STRIPPED_PINE_LOG.get().asItem(),
                        REOBlocks.RESISTANT_PINE_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get().asItem(),
                        REOBlocks.PINE_WOOD.get().asItem(), REOBlocks.STRIPPED_PINE_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_PINE_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get().asItem());

        this.tag(REOTags.Items.PLUM_LOGS)
                .add(REOBlocks.PLUM_LOG.get().asItem(), REOBlocks.STRIPPED_PLUM_LOG.get().asItem(),
                        REOBlocks.RESISTANT_PLUM_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get().asItem(),
                        REOBlocks.PLUM_WOOD.get().asItem(), REOBlocks.STRIPPED_PLUM_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_PLUM_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get().asItem());

        this.tag(REOTags.Items.POPLAR_LOGS)
                .add(REOBlocks.POPLAR_LOG.get().asItem(), REOBlocks.STRIPPED_POPLAR_LOG.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get().asItem(),
                        REOBlocks.POPLAR_WOOD.get().asItem(), REOBlocks.STRIPPED_POPLAR_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_POPLAR_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get().asItem());

        this.tag(REOTags.Items.REDWOOD_LOGS)
                .add(REOBlocks.REDWOOD_LOG.get().asItem(), REOBlocks.STRIPPED_REDWOOD_LOG.get().asItem(),
                        REOBlocks.RESISTANT_REDWOOD_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get().asItem(),
                        REOBlocks.REDWOOD_WOOD.get().asItem(), REOBlocks.STRIPPED_REDWOOD_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_REDWOOD_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get().asItem());

        this.tag(REOTags.Items.RUBBER_LOGS)
                .add(REOBlocks.RUBBER_LOG.get().asItem(),REOBlocks.RUBBER_LOG_SAP.get().asItem(), REOBlocks.STRIPPED_RUBBER_LOG.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get().asItem(),
                        REOBlocks.RUBBER_WOOD.get().asItem(), REOBlocks.RUBBER_WOOD_SAP.get().asItem(), REOBlocks.STRIPPED_RUBBER_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_RUBBER_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get().asItem());

        this.tag(REOTags.Items.TEAK_LOGS)
                .add(REOBlocks.TEAK_LOG.get().asItem(), REOBlocks.STRIPPED_TEAK_LOG.get().asItem(),
                        REOBlocks.RESISTANT_TEAK_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get().asItem(),
                        REOBlocks.TEAK_WOOD.get().asItem(), REOBlocks.STRIPPED_TEAK_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_TEAK_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get().asItem());

        this.tag(REOTags.Items.WALNUT_LOGS)
                .add(REOBlocks.WALNUT_LOG.get().asItem(), REOBlocks.STRIPPED_WALNUT_LOG.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get().asItem(),
                        REOBlocks.WALNUT_WOOD.get().asItem(), REOBlocks.STRIPPED_WALNUT_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_WALNUT_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get().asItem());

        this.tag(REOTags.Items.WILLOW_LOGS)
                .add(REOBlocks.WILLOW_LOG.get().asItem(), REOBlocks.STRIPPED_WILLOW_LOG.get().asItem(),
                        REOBlocks.RESISTANT_WILLOW_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get().asItem(),
                        REOBlocks.WILLOW_WOOD.get().asItem(), REOBlocks.STRIPPED_WILLOW_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_WILLOW_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get().asItem());

        this.tag(REOTags.Items.VANILLA_RESISTANT_LOGS)
                .add(REOBlocks.RESISTANT_OAK_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get().asItem(),
                        REOBlocks.RESISTANT_OAK_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_SPRUCE_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get().asItem(),
                        REOBlocks.RESISTANT_SPRUCE_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get().asItem(),
                        REOBlocks.RESISTANT_BIRCH_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_JUNGLE_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get().asItem(),
                        REOBlocks.RESISTANT_JUNGLE_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get().asItem(),
                        REOBlocks.RESISTANT_ACACIA_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_DARK_OAK_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get().asItem(),
                        REOBlocks.RESISTANT_DARK_OAK_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get().asItem(),
                        REOBlocks.RESISTANT_MANGROVE_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get().asItem(),
                        REOBlocks.RESISTANT_CHERRY_LOG.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get().asItem(),
                        REOBlocks.RESISTANT_CHERRY_WOOD.get().asItem(), REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get().asItem());

        this.tag(ItemTags.LOGS)
                .addTag(REOTags.Items.BALSA_LOGS).addTag(REOTags.Items.BAOBAB_LOGS).addTag(REOTags.Items.HILL_CHERRY_LOGS)
                .addTag(REOTags.Items.CHESTNUT_LOGS).addTag(REOTags.Items.CITRUS_LOGS).addTag(REOTags.Items.EBONY_LOGS)
                .addTag(REOTags.Items.LARCH_LOGS).addTag(REOTags.Items.LIME_LOGS).addTag(REOTags.Items.MAHOGANY_LOGS)
                .addTag(REOTags.Items.MAPLE_LOGS).addTag(REOTags.Items.PALM_LOGS).addTag(REOTags.Items.PAPAYA_LOGS)
                .addTag(REOTags.Items.PINE_LOGS).addTag(REOTags.Items.PLUM_LOGS).addTag(REOTags.Items.POPLAR_LOGS)
                .addTag(REOTags.Items.REDWOOD_LOGS).addTag(REOTags.Items.RUBBER_LOGS).addTag(REOTags.Items.TEAK_LOGS)
                .addTag(REOTags.Items.WALNUT_LOGS).addTag(REOTags.Items.WILLOW_LOGS)
                .addTag(REOTags.Items.VANILLA_RESISTANT_LOGS);

        // Ores
        this.tag(REOTags.Items.REO_ORES).add(REOBlocks.ALUMINUM_ORE.get().asItem(), REOBlocks.LEAD_ORE.get().asItem(),
                REOBlocks.NICKEL_ORE.get().asItem(), REOBlocks.PLATINUM_ORE.get().asItem(), REOBlocks.SILVER_ORE.get().asItem(),
                REOBlocks.TIN_ORE.get().asItem(), REOBlocks.URANIUM_ORE.get().asItem(), REOBlocks.ZINC_ORE.get().asItem());

        this.tag(REOTags.Items.REO_DEEPSLATE_ORES).add(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get().asItem(), REOBlocks.DEEPSLATE_LEAD_ORE.get().asItem(),
                REOBlocks.DEEPSLATE_NICKEL_ORE.get().asItem(), REOBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem(),
                REOBlocks.DEEPSLATE_SILVER_ORE.get().asItem(), REOBlocks.DEEPSLATE_URANIUM_ORE.get().asItem(), REOBlocks.DEEPSLATE_ZINC_ORE.get().asItem());

        this.tag(REOTags.Items.REO_GRAVEL_ORES).add(REOBlocks.ALUMINUM_GRAVEL_ORE.get().asItem(), REOBlocks.LEAD_GRAVEL_ORE.get().asItem(),
                REOBlocks.NICKEL_GRAVEL_ORE.get().asItem(), REOBlocks.PLATINUM_GRAVEL_ORE.get().asItem(),
                REOBlocks.SILVER_GRAVEL_ORE.get().asItem(), REOBlocks.TIN_GRAVEL_ORE.get().asItem(),
                REOBlocks.URANIUM_GRAVEL_ORE.get().asItem(), REOBlocks.ZINC_GRAVEL_ORE.get().asItem());

        this.tag(REOTags.Items.REO_NETHER_ORES).add(REOBlocks.NETHER_ALUMINIUM_ORE.get().asItem(), REOBlocks.NETHER_LEAD_ORE.get().asItem(),
                REOBlocks.NETHER_NICKEL_ORE.get().asItem(), REOBlocks.NETHER_PLATINUM_ORE.get().asItem(),
                REOBlocks.NETHER_SILVER_ORE.get().asItem(), REOBlocks.NETHER_TIN_ORE.get().asItem(),
                REOBlocks.NETHER_URANIUM_ORE.get().asItem(), REOBlocks.NETHER_ZINC_ORE.get().asItem());

        this.tag(REOTags.Items.REO_END_ORES).add(REOBlocks.ENDERITE_ORE.get().asItem());

        // Vanilla
        this.tag(ItemTags.GOLD_ORES)
                .add(REOBlocks.GOLD_GRAVEL_ORE.get().asItem());
        this.tag(ItemTags.IRON_ORES)
                .add(REOBlocks.IRON_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_IRON_ORE.get().asItem());
        this.tag(ItemTags.DIAMOND_ORES)
                .add(REOBlocks.DIAMOND_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_DIAMOND_ORE.get().asItem());
        this.tag(ItemTags.REDSTONE_ORES)
                .add(REOBlocks.REDSTONE_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_REDSTONE_ORE.get().asItem());
        this.tag(ItemTags.LAPIS_ORES)
                .add(REOBlocks.LAPIS_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_LAPIS_ORE.get().asItem());
        this.tag(ItemTags.COAL_ORES)
                .add(REOBlocks.COAL_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_COAL_ORE.get().asItem());
        this.tag(ItemTags.EMERALD_ORES)
                .add(REOBlocks.EMERALD_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_EMERALD_ORE.get().asItem());
        this.tag(ItemTags.COPPER_ORES)
                .add(REOBlocks.COPPER_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_COPPER_ORE.get().asItem());

        // Modded
        this.tag(REOTags.Items.ORES_ALUMINUM)
                .add(REOBlocks.ALUMINUM_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get().asItem())
                .add(REOBlocks.ALUMINUM_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_ALUMINIUM_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_AMETHYST)
                .add(Blocks.AMETHYST_CLUSTER.asItem());
        this.tag(REOTags.Items.ORES_ENDERITE)
                .add(REOBlocks.ENDERITE_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_LEAD)
                .add(REOBlocks.LEAD_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_LEAD_ORE.get().asItem())
                .add(REOBlocks.LEAD_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_LEAD_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_NICKEL)
                .add(REOBlocks.NICKEL_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_NICKEL_ORE.get().asItem())
                .add(REOBlocks.NICKEL_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_NICKEL_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_PERIDOT)
                .add(REOBlocks.PERIDOT_CLUSTER.get().asItem());
        this.tag(REOTags.Items.ORES_PLATINUM)
                .add(REOBlocks.PLATINUM_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem())
                .add(REOBlocks.PLATINUM_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_PLATINUM_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_RUBY)
                .add(REOBlocks.RUBY_CLUSTER.get().asItem());
        this.tag(REOTags.Items.ORES_SAPPHIRE)
                .add(REOBlocks.SAPPHIRE_CLUSTER.get().asItem());
        this.tag(REOTags.Items.ORES_SILVER)
                .add(REOBlocks.SILVER_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_SILVER_ORE.get().asItem())
                .add(REOBlocks.SILVER_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_SILVER_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_TIN)
                .add(REOBlocks.TIN_ORE.get().asItem()).add(REOBlocks.TIN_GRAVEL_ORE.get().asItem())
                .add(REOBlocks.NETHER_TIN_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_URANIUM)
                .add(REOBlocks.URANIUM_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_URANIUM_ORE.get().asItem())
                .add(REOBlocks.URANIUM_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_URANIUM_ORE.get().asItem());
        this.tag(REOTags.Items.ORES_ZINC)
                .add(REOBlocks.ZINC_ORE.get().asItem()).add(REOBlocks.DEEPSLATE_ZINC_ORE.get().asItem())
                .add(REOBlocks.ZINC_GRAVEL_ORE.get().asItem()).add(REOBlocks.NETHER_ZINC_ORE.get().asItem());

        // Raw Materials
        this.tag(REOTags.Items.RAW_MATERIALS_ALUMINUM)
                .add(REOItems.RAW_ALUMINIUM.get());
        this.tag(REOTags.Items.RAW_MATERIALS_LEAD)
                .add(REOItems.RAW_LEAD.get());
        this.tag(REOTags.Items.RAW_MATERIALS_NICKEL)
                .add(REOItems.RAW_NICKEL.get());
        this.tag(REOTags.Items.RAW_MATERIALS_PLATINUM)
                .add(REOItems.RAW_PLATINUM.get());
        this.tag(REOTags.Items.RAW_MATERIALS_SILVER)
                .add(REOItems.RAW_SILVER.get());
        this.tag(REOTags.Items.RAW_MATERIALS_TIN)
                .add(REOItems.RAW_TIN.get());
        this.tag(REOTags.Items.RAW_MATERIALS_URANIUM)
                .add(REOItems.RAW_URANIUM.get());
        this.tag(REOTags.Items.RAW_MATERIALS_ZINC)
                .add(REOItems.RAW_ZINC.get());


        // Tech //
        // Gears
        this.tag(REOTags.Items.GEARS_TIER_1)
                .add(REOItems.IRON_GEAR.get(), REOItems.ALUMINUM_GEAR.get(), REOItems.COPPER_GEAR.get(),
                        REOItems.LEAD_GEAR.get(), REOItems.NICKEL_GEAR.get(), REOItems.SILVER_GEAR.get(),
                        REOItems.TIN_GEAR.get(), REOItems.ZINC_GEAR.get());
        this.tag(REOTags.Items.GEARS_TIER_2)
                .add(REOItems.BRASS_GEAR.get(), REOItems.BRONZE_GEAR.get(), REOItems.ELECTRUM_GEAR.get(),
                        REOItems.GOLD_GERAR.get(), REOItems.STEEL_GEAR.get());
        this.tag(REOTags.Items.GEARS_TIER_3)
                .add(REOItems.AMETHYST_GEAR.get(), REOItems.PERIDOT_GEAR.get(), REOItems.RUBY_GEAR.get(),
                        REOItems.SAPPHIRE_GEAR.get());
        this.tag(REOTags.Items.GEARS_TIER_4)
                .add(REOItems.DIAMOND_GEAR.get(), REOItems.EMERALD_GEAR.get());
        this.tag(REOTags.Items.GEARS_TIER_5)
                .add(REOItems.ENDERITE_GEAR.get(), REOItems.PLATINUM_GEAR.get());

        this.tag(REOTags.Items.GEARS_ALUMINUM).add(REOItems.ALUMINUM_GEAR.get());
        this.tag(REOTags.Items.GEARS_AMETHYST).add(REOItems.AMETHYST_GEAR.get());
        this.tag(REOTags.Items.GEARS_BRASS).add(REOItems.BRASS_GEAR.get());
        this.tag(REOTags.Items.GEARS_BRONZE).add(REOItems.BRONZE_GEAR.get());
        this.tag(REOTags.Items.GEARS_COPPER).add(REOItems.COPPER_GEAR.get());
        this.tag(REOTags.Items.GEARS_DIAMOND).add(REOItems.DIAMOND_GEAR.get());
        this.tag(REOTags.Items.GEARS_ELECTRTUM).add(REOItems.ELECTRUM_GEAR.get());
        this.tag(REOTags.Items.GEARS_EMERALD).add(REOItems.EMERALD_GEAR.get());
        this.tag(REOTags.Items.GEARS_ENDERITE).add(REOItems.ENDERITE_GEAR.get());
        this.tag(REOTags.Items.GEARS_GOLD).add(REOItems.GOLD_GERAR.get());
        this.tag(REOTags.Items.GEARS_IRON).add(REOItems.IRON_GEAR.get());
        this.tag(REOTags.Items.GEARS_LEAD).add(REOItems.LEAD_GEAR.get());
        this.tag(REOTags.Items.GEARS_NICKEL).add(REOItems.NICKEL_GEAR.get());
        this.tag(REOTags.Items.GEARS_PERIDOT).add(REOItems.PERIDOT_GEAR.get());
        this.tag(REOTags.Items.GEARS_PLATINUM).add(REOItems.PLATINUM_GEAR.get());
        this.tag(REOTags.Items.GEARS_RUBY).add(REOItems.RUBY_GEAR.get());
        this.tag(REOTags.Items.GEARS_SAPPHIRE).add(REOItems.SAPPHIRE_GEAR.get());
        this.tag(REOTags.Items.GEARS_SILVER).add(REOItems.SILVER_GEAR.get());
        this.tag(REOTags.Items.GEARS_STEEL).add(REOItems.STEEL_GEAR.get());
        this.tag(REOTags.Items.GEARS_TIN).add(REOItems.TIN_GEAR.get());
        this.tag(REOTags.Items.GEARS_ZINC).add(REOItems.ZINC_GEAR.get());

        // Tools
        this.tag(ItemTags.AXES).add(REOItems.ALUMINIUM_AXE.get(), REOItems.AMETHYST_AXE.get(),
                REOItems.BRONZE_AXE.get(), REOItems.ENDERITE_AXE.get(), REOItems.PERIDOT_AXE.get(),
                REOItems.PLATINUM_AXE.get(), REOItems.RUBY_AXE.get(), REOItems.SAPPHIRE_AXE.get(),
                REOItems.SILVER_AXE.get(), REOItems.STEEL_AXE.get());

        this.tag(REOTags.Items.AXES_ALUMINUM).add(REOItems.ALUMINIUM_AXE.get());
        this.tag(REOTags.Items.AXES_AMETHYST).add(REOItems.AMETHYST_AXE.get());
        this.tag(REOTags.Items.AXES_BRONZE).add(REOItems.BRONZE_AXE.get());
        this.tag(REOTags.Items.AXES_ENDERITE).add(REOItems.ENDERITE_AXE.get());
        this.tag(REOTags.Items.AXES_PERIDOT).add(REOItems.PERIDOT_AXE.get());
        this.tag(REOTags.Items.AXES_PLATINUM).add(REOItems.PLATINUM_AXE.get());
        this.tag(REOTags.Items.AXES_RUBY).add(REOItems.RUBY_AXE.get());
        this.tag(REOTags.Items.AXES_SAPPHIRE).add(REOItems.SAPPHIRE_AXE.get());
        this.tag(REOTags.Items.AXES_SILVER).add(REOItems.SILVER_AXE.get());
        this.tag(REOTags.Items.AXES_STEEL).add(REOItems.STEEL_AXE.get());

        this.tag(REOTags.Items.BOWS).add(REOItems.STONE_BOW.get(), REOItems.GOLDEN_BOW.get(), REOItems.IRON_BOW.get(),
                REOItems.DIAMOND_BOW.get(), REOItems.NETHERITE_BOW.get(), REOItems.ALUMINIUM_BOW.get(),
                REOItems.AMETHYST_BOW.get(), REOItems.BRONZE_BOW.get(), REOItems.ENDERITE_BOW.get(),
                REOItems.PERIDOT_BOW.get(), REOItems.PLATINUM_BOW.get(), REOItems.RUBY_BOW.get(),
                REOItems.SAPPHIRE_BOW.get(), REOItems.SILVER_BOW.get(), REOItems.STEEL_BOW.get());

        this.tag(REOTags.Items.BOWS_STONE).add(REOItems.STONE_BOW.get());
        this.tag(REOTags.Items.BOWS_GOLD).add(REOItems.GOLDEN_BOW.get());
        this.tag(REOTags.Items.BOWS_IRON).add(REOItems.IRON_BOW.get());
        this.tag(REOTags.Items.BOWS_DIAMOND).add(REOItems.DIAMOND_BOW.get());
        this.tag(REOTags.Items.BOWS_NETHERITE).add(REOItems.NETHERITE_BOW.get());

        this.tag(REOTags.Items.BOWS_ALUMINUM).add(REOItems.ALUMINIUM_BOW.get());
        this.tag(REOTags.Items.BOWS_AMETHYST).add(REOItems.AMETHYST_BOW.get());
        this.tag(REOTags.Items.BOWS_BRONZE).add(REOItems.BRONZE_BOW.get());
        this.tag(REOTags.Items.BOWS_ENDERITE).add(REOItems.ENDERITE_BOW.get());
        this.tag(REOTags.Items.BOWS_PERIDOT).add(REOItems.PERIDOT_BOW.get());
        this.tag(REOTags.Items.BOWS_PLATINUM).add(REOItems.PLATINUM_BOW.get());
        this.tag(REOTags.Items.BOWS_RUBY).add(REOItems.RUBY_BOW.get());
        this.tag(REOTags.Items.BOWS_SAPPHIRE).add(REOItems.SAPPHIRE_BOW.get());
        this.tag(REOTags.Items.BOWS_SILVER).add(REOItems.SILVER_BOW.get());
        this.tag(REOTags.Items.BOWS_STEEL).add(REOItems.STEEL_BOW.get());

        this.tag(REOTags.Items.EXCAVATORS).add(REOItems.WOODEN_EXCAVATOR.get(), REOItems.STONE_EXCAVATOR.get(), REOItems.GOLDEN_EXCAVATOR.get(),
                REOItems.IRON_EXCAVATOR.get(), REOItems.DIAMOND_EXCAVATOR.get(), REOItems.NETHERITE_EXCAVATOR.get(),
                REOItems.ALUMINIUM_EXCAVATOR.get(), REOItems.AMETHYST_EXCAVATOR.get(), REOItems.BRONZE_EXCAVATOR.get(),
                REOItems.ENDERITE_EXCAVATOR.get(), REOItems.PERIDOT_EXCAVATOR.get(), REOItems.PLATINUM_EXCAVATOR.get(),
                REOItems.RUBY_EXCAVATOR.get(), REOItems.SAPPHIRE_EXCAVATOR.get(), REOItems.SILVER_EXCAVATOR.get(),
                REOItems.STEEL_EXCAVATOR.get());

        this.tag(REOTags.Items.EXCAVATORS_WOOD).add(REOItems.WOODEN_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_STONE).add(REOItems.STONE_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_GOLD).add(REOItems.GOLDEN_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_IRON).add(REOItems.IRON_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_DIAMOND).add(REOItems.DIAMOND_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_NETHERITE).add(REOItems.NETHERITE_EXCAVATOR.get());

        this.tag(REOTags.Items.EXCAVATORS_ALUMINUM).add(REOItems.ALUMINIUM_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_AMETHYST).add(REOItems.AMETHYST_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_BRONZE).add(REOItems.BRONZE_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_ENDERITE).add(REOItems.ENDERITE_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_PERIDOT).add(REOItems.PERIDOT_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_PLATINUM).add(REOItems.PLATINUM_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_RUBY).add(REOItems.RUBY_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_SAPPHIRE).add(REOItems.SAPPHIRE_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_SILVER).add(REOItems.SILVER_EXCAVATOR.get());
        this.tag(REOTags.Items.EXCAVATORS_STEEL).add(REOItems.STEEL_EXCAVATOR.get());

        this.tag(REOTags.Items.HAMMERS).add(REOItems.WOODEN_HAMMER.get(), REOItems.STONE_HAMMER.get(), REOItems.GOLDEN_HAMMER.get(),
                REOItems.IRON_HAMMER.get(), REOItems.DIAMOND_HAMMER.get(), REOItems.NETHERITE_HAMMER.get(),
                REOItems.ALUMINIUM_HAMMER.get(), REOItems.AMETHYST_HAMMER.get(), REOItems.BRONZE_HAMMER.get(),
                REOItems.ENDERITE_HAMMER.get(), REOItems.PERIDOT_HAMMER.get(), REOItems.PLATINUM_HAMMER.get(),
                REOItems.RUBY_HAMMER.get(), REOItems.SAPPHIRE_HAMMER.get(), REOItems.SILVER_HAMMER.get(),
                REOItems.STEEL_HAMMER.get());

        this.tag(REOTags.Items.HAMMERS_WOOD).add(REOItems.WOODEN_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_STONE).add(REOItems.STONE_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_GOLD).add(REOItems.GOLDEN_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_IRON).add(REOItems.IRON_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_DIAMOND).add(REOItems.DIAMOND_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_NETHERITE).add(REOItems.NETHERITE_HAMMER.get());

        this.tag(REOTags.Items.HAMMERS_ALUMINUM).add(REOItems.ALUMINIUM_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_AMETHYST).add(REOItems.AMETHYST_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_BRONZE).add(REOItems.BRONZE_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_ENDERITE).add(REOItems.ENDERITE_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_PERIDOT).add(REOItems.PERIDOT_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_PLATINUM).add(REOItems.PLATINUM_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_RUBY).add(REOItems.RUBY_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_SAPPHIRE).add(REOItems.SAPPHIRE_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_SILVER).add(REOItems.SILVER_HAMMER.get());
        this.tag(REOTags.Items.HAMMERS_STEEL).add(REOItems.STEEL_HAMMER.get());

        this.tag(REOTags.Items.HATCHETS).add(REOItems.WOODEN_HATCHET.get(), REOItems.STONE_HATCHET.get(), REOItems.GOLDEN_HATCHET.get(),
                REOItems.IRON_HATCHET.get(), REOItems.DIAMOND_HATCHET.get(), REOItems.NETHERITE_HATCHET.get(),
                REOItems.ALUMINIUM_HATCHET.get(), REOItems.AMETHYST_HATCHET.get(), REOItems.BRONZE_HATCHET.get(),
                REOItems.ENDERITE_HATCHET.get(), REOItems.PERIDOT_HATCHET.get(), REOItems.PLATINUM_HATCHET.get(),
                REOItems.RUBY_HATCHET.get(), REOItems.SAPPHIRE_HATCHET.get(), REOItems.SILVER_HATCHET.get(),
                REOItems.STEEL_HATCHET.get());

        this.tag(REOTags.Items.HATCHETS_WOOD).add(REOItems.WOODEN_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_STONE).add(REOItems.STONE_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_GOLD).add(REOItems.GOLDEN_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_IRON).add(REOItems.IRON_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_DIAMOND).add(REOItems.DIAMOND_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_NETHERITE).add(REOItems.NETHERITE_HATCHET.get());

        this.tag(REOTags.Items.HATCHETS_ALUMINUM).add(REOItems.ALUMINIUM_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_AMETHYST).add(REOItems.AMETHYST_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_BRONZE).add(REOItems.BRONZE_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_ENDERITE).add(REOItems.ENDERITE_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_PERIDOT).add(REOItems.PERIDOT_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_PLATINUM).add(REOItems.PLATINUM_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_RUBY).add(REOItems.RUBY_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_SAPPHIRE).add(REOItems.SAPPHIRE_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_SILVER).add(REOItems.SILVER_HATCHET.get());
        this.tag(REOTags.Items.HATCHETS_STEEL).add(REOItems.STEEL_HATCHET.get());

        this.tag(ItemTags.HOES).add(REOItems.ALUMINIUM_HOE.get(), REOItems.AMETHYST_HOE.get(),
                REOItems.BRONZE_HOE.get(), REOItems.ENDERITE_HOE.get(), REOItems.PERIDOT_HOE.get(),
                REOItems.PLATINUM_HOE.get(), REOItems.RUBY_HOE.get(), REOItems.SAPPHIRE_HOE.get(),
                REOItems.SILVER_HOE.get(), REOItems.STEEL_HOE.get());

        this.tag(REOTags.Items.HOES_ALUMINUM).add(REOItems.ALUMINIUM_HOE.get());
        this.tag(REOTags.Items.HOES_AMETHYST).add(REOItems.AMETHYST_HOE.get());
        this.tag(REOTags.Items.HOES_BRONZE).add(REOItems.BRONZE_HOE.get());
        this.tag(REOTags.Items.HOES_ENDERITE).add(REOItems.ENDERITE_HOE.get());
        this.tag(REOTags.Items.HOES_PERIDOT).add(REOItems.PERIDOT_HOE.get());
        this.tag(REOTags.Items.HOES_PLATINUM).add(REOItems.PLATINUM_HOE.get());
        this.tag(REOTags.Items.HOES_RUBY).add(REOItems.RUBY_HOE.get());
        this.tag(REOTags.Items.HOES_SAPPHIRE).add(REOItems.SAPPHIRE_HOE.get());
        this.tag(REOTags.Items.HOES_SILVER).add(REOItems.SILVER_HOE.get());
        this.tag(REOTags.Items.HOES_STEEL).add(REOItems.STEEL_HOE.get());

        this.tag(REOTags.Items.PAXELS).add(REOItems.WOODEN_PAXEL.get(), REOItems.STONE_PAXEL.get(),
                REOItems.GOLDEN_PAXEL.get(), REOItems.IRON_PAXEL.get(), REOItems.DIAMOND_PAXEL.get(),
                REOItems.NETHERITE_PAXEL.get(), REOItems.ALUMINIUM_PAXEL.get(), REOItems.AMETHYST_PAXEL.get(),
                REOItems.BRONZE_PAXEL.get(), REOItems.ENDERITE_PAXEL.get(), REOItems.PERIDOT_PAXEL.get(),
                REOItems.PLATINUM_PAXEL.get(), REOItems.RUBY_PAXEL.get(), REOItems.SAPPHIRE_PAXEL.get(),
                REOItems.SILVER_PAXEL.get(), REOItems.STEEL_PAXEL.get());

        this.tag(REOTags.Items.PAXELS_WOOD).add(REOItems.WOODEN_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_STONE).add(REOItems.STONE_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_GOLD).add(REOItems.GOLDEN_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_IRON).add(REOItems.IRON_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_DIAMOND).add(REOItems.DIAMOND_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_NETHERITE).add(REOItems.NETHERITE_PAXEL.get());

        this.tag(REOTags.Items.PAXELS_ALUMINUM).add(REOItems.ALUMINIUM_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_AMETHYST).add(REOItems.AMETHYST_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_BRONZE).add(REOItems.BRONZE_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_ENDERITE).add(REOItems.ENDERITE_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_PERIDOT).add(REOItems.PERIDOT_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_PLATINUM).add(REOItems.PLATINUM_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_RUBY).add(REOItems.RUBY_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_SAPPHIRE).add(REOItems.SAPPHIRE_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_SILVER).add(REOItems.SILVER_PAXEL.get());
        this.tag(REOTags.Items.PAXELS_STEEL).add(REOItems.STEEL_PAXEL.get());

        this.tag(ItemTags.PICKAXES).add(REOItems.ALUMINIUM_PICKAXE.get(), REOItems.AMETHYST_PICKAXE.get(),
                REOItems.BRONZE_PICKAXE.get(), REOItems.ENDERITE_PICKAXE.get(), REOItems.PERIDOT_PICKAXE.get(),
                REOItems.PLATINUM_PICKAXE.get(), REOItems.RUBY_PICKAXE.get(), REOItems.SAPPHIRE_PICKAXE.get(),
                REOItems.SILVER_PICKAXE.get(), REOItems.STEEL_PICKAXE.get());

        this.tag(REOTags.Items.PICKAXES_ALUMINUM).add(REOItems.ALUMINIUM_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_AMETHYST).add(REOItems.AMETHYST_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_BRONZE).add(REOItems.BRONZE_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_ENDERITE).add(REOItems.ENDERITE_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_PERIDOT).add(REOItems.PERIDOT_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_PLATINUM).add(REOItems.PLATINUM_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_RUBY).add(REOItems.RUBY_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_SAPPHIRE).add(REOItems.SAPPHIRE_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_SILVER).add(REOItems.SILVER_PICKAXE.get());
        this.tag(REOTags.Items.PICKAXES_STEEL).add(REOItems.STEEL_PICKAXE.get());

        this.tag(REOTags.Items.SHEARS).add(REOItems.WOODEN_SHEARS.get(), REOItems.STONE_SHEARS.get(), REOItems.GOLDEN_SHEARS.get(),
                REOItems.DIAMOND_SHEARS.get(), REOItems.NETHERITE_SHEARS.get(), REOItems.ALUMINIUM_SHEARS.get(),
                REOItems.AMETHYST_SHEARS.get(), REOItems.BRONZE_SHEARS.get(), REOItems.ENDERITE_SHEARS.get(),
                REOItems.PERIDOT_SHEARS.get(), REOItems.PLATINUM_SHEARS.get(), REOItems.RUBY_SHEARS.get(),
                REOItems.SAPPHIRE_SHEARS.get(), REOItems.SILVER_SHEARS.get(), REOItems.STEEL_SHEARS.get());

        this.tag(REOTags.Items.SHEARS_WOOD).add(REOItems.WOODEN_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_STONE).add(REOItems.STONE_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_GOLD).add(REOItems.GOLDEN_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_DIAMOND).add(REOItems.DIAMOND_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_NETHERITE).add(REOItems.NETHERITE_SHEARS.get());

        this.tag(REOTags.Items.SHEARS_ALUMINUM).add(REOItems.ALUMINIUM_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_AMETHYST).add(REOItems.AMETHYST_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_BRONZE).add(REOItems.BRONZE_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_ENDERITE).add(REOItems.ENDERITE_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_PERIDOT).add(REOItems.PERIDOT_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_PLATINUM).add(REOItems.PLATINUM_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_RUBY).add(REOItems.RUBY_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_SAPPHIRE).add(REOItems.SAPPHIRE_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_SILVER).add(REOItems.SILVER_SHEARS.get());
        this.tag(REOTags.Items.SHEARS_STEEL).add(REOItems.STEEL_SHEARS.get());

        this.tag(ItemTags.SHOVELS).add(REOItems.ALUMINIUM_SHOVEL.get(), REOItems.AMETHYST_SHOVEL.get(),
                REOItems.BRONZE_SHOVEL.get(), REOItems.ENDERITE_SHOVEL.get(), REOItems.PERIDOT_SHOVEL.get(),
                REOItems.PLATINUM_SHOVEL.get(), REOItems.RUBY_SHOVEL.get(), REOItems.SAPPHIRE_SHOVEL.get(),
                REOItems.SILVER_SHOVEL.get(), REOItems.STEEL_SHOVEL.get());

        this.tag(REOTags.Items.SHOVELS_ALUMINUM).add(REOItems.ALUMINIUM_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_AMETHYST).add(REOItems.AMETHYST_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_BRONZE).add(REOItems.BRONZE_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_ENDERITE).add(REOItems.ENDERITE_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_PERIDOT).add(REOItems.PERIDOT_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_PLATINUM).add(REOItems.PLATINUM_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_RUBY).add(REOItems.RUBY_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_SAPPHIRE).add(REOItems.SAPPHIRE_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_SILVER).add(REOItems.SILVER_SHOVEL.get());
        this.tag(REOTags.Items.SHOVELS_STEEL).add(REOItems.STEEL_SHOVEL.get());

        this.tag(REOTags.Items.SICKLES).add(REOItems.WOODEN_SICKLE.get(), REOItems.STONE_SICKLE.get(), REOItems.GOLDEN_SICKLE.get(),
                REOItems.IRON_SICKLE.get(), REOItems.DIAMOND_SICKLE.get(), REOItems.NETHERITE_SICKLE.get(),
                REOItems.ALUMINIUM_SICKLE.get(), REOItems.AMETHYST_SICKLE.get(), REOItems.BRONZE_SICKLE.get(),
                REOItems.ENDERITE_SICKLE.get(), REOItems.PERIDOT_SICKLE.get(), REOItems.PLATINUM_SICKLE.get(),
                REOItems.RUBY_SICKLE.get(), REOItems.SAPPHIRE_SICKLE.get(), REOItems.SILVER_SICKLE.get(),
                REOItems.STEEL_SICKLE.get());

        this.tag(REOTags.Items.SICKLES_WOOD).add(REOItems.WOODEN_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_STONE).add(REOItems.STONE_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_GOLD).add(REOItems.GOLDEN_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_IRON).add(REOItems.IRON_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_DIAMOND).add(REOItems.DIAMOND_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_NETHERITE).add(REOItems.NETHERITE_SICKLE.get());

        this.tag(REOTags.Items.SICKLES_ALUMINUM).add(REOItems.ALUMINIUM_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_AMETHYST).add(REOItems.AMETHYST_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_BRONZE).add(REOItems.BRONZE_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_ENDERITE).add(REOItems.ENDERITE_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_PERIDOT).add(REOItems.PERIDOT_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_PLATINUM).add(REOItems.PLATINUM_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_RUBY).add(REOItems.RUBY_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_SAPPHIRE).add(REOItems.SAPPHIRE_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_SILVER).add(REOItems.SILVER_SICKLE.get());
        this.tag(REOTags.Items.SICKLES_STEEL).add(REOItems.STEEL_SICKLE.get());

        this.tag(ItemTags.SWORDS).add(REOItems.ALUMINIUM_SWORD.get(), REOItems.AMETHYST_SWORD.get(),
                REOItems.BRONZE_SWORD.get(), REOItems.ENDERITE_SWORD.get(), REOItems.PERIDOT_SWORD.get(),
                REOItems.PLATINUM_SWORD.get(), REOItems.RUBY_SWORD.get(), REOItems.SAPPHIRE_SWORD.get(),
                REOItems.SILVER_SWORD.get(), REOItems.STEEL_SWORD.get());

        this.tag(REOTags.Items.SWORDS_ALUMINUM).add(REOItems.ALUMINIUM_SWORD.get());
        this.tag(REOTags.Items.SWORDS_AMETHYST).add(REOItems.AMETHYST_SWORD.get());
        this.tag(REOTags.Items.SWORDS_BRONZE).add(REOItems.BRONZE_SWORD.get());
        this.tag(REOTags.Items.SWORDS_ENDERITE).add(REOItems.ENDERITE_SWORD.get());
        this.tag(REOTags.Items.SWORDS_PERIDOT).add(REOItems.PERIDOT_SWORD.get());
        this.tag(REOTags.Items.SWORDS_PLATINUM).add(REOItems.PLATINUM_SWORD.get());
        this.tag(REOTags.Items.SWORDS_RUBY).add(REOItems.RUBY_SWORD.get());
        this.tag(REOTags.Items.SWORDS_SAPPHIRE).add(REOItems.SAPPHIRE_SWORD.get());
        this.tag(REOTags.Items.SWORDS_SILVER).add(REOItems.SILVER_SWORD.get());
        this.tag(REOTags.Items.SWORDS_STEEL).add(REOItems.STEEL_SWORD.get());

        // Armor
        // Helmet
        this.tag(REOTags.Items.HELMETS).add(REOItems.ALUMINIUM_HELMET.get(), REOItems.AMETHYST_HELMET.get(),
                REOItems.BRONZE_HELMET.get(), REOItems.ENDERITE_HELMET.get(), REOItems.PERIDOT_HELMET.get(),
                REOItems.PLATINUM_HELMET.get(), REOItems.RUBY_HELMET.get(), REOItems.SAPPHIRE_HELMET.get(),
                REOItems.SILVER_HELMET.get(), REOItems.STEEL_HELMET.get());

        this.tag(REOTags.Items.HELMETS_ALUMINUM).add(REOItems.ALUMINIUM_HELMET.get());
        this.tag(REOTags.Items.HELMETS_AMETHYST).add(REOItems.AMETHYST_HELMET.get());
        this.tag(REOTags.Items.HELMETS_BRONZE).add(REOItems.BRONZE_HELMET.get());
        this.tag(REOTags.Items.HELMETS_ENDERITE).add(REOItems.ENDERITE_HELMET.get());
        this.tag(REOTags.Items.HELMETS_PERIDOT).add(REOItems.PERIDOT_HELMET.get());
        this.tag(REOTags.Items.HELMETS_PLATINUM).add(REOItems.PLATINUM_HELMET.get());
        this.tag(REOTags.Items.HELMETS_RUBY).add(REOItems.RUBY_HELMET.get());
        this.tag(REOTags.Items.HELMETS_SAPPHIRE).add(REOItems.SAPPHIRE_HELMET.get());
        this.tag(REOTags.Items.HELMETS_SILVER).add(REOItems.SILVER_HELMET.get());
        this.tag(REOTags.Items.HELMETS_STEEL).add(REOItems.STEEL_HELMET.get());

        // Chestplate
        this.tag(REOTags.Items.CHESTPLATES).add(REOItems.ALUMINIUM_CHESTPLATE.get(), REOItems.AMETHYST_CHESTPLATE.get(),
                REOItems.BRONZE_CHESTPLATE.get(), REOItems.ENDERITE_CHESTPLATE.get(), REOItems.PERIDOT_CHESTPLATE.get(),
                REOItems.PLATINUM_CHESTPLATE.get(), REOItems.RUBY_CHESTPLATE.get(), REOItems.SAPPHIRE_CHESTPLATE.get(),
                REOItems.SILVER_CHESTPLATE.get(), REOItems.STEEL_CHESTPLATE.get());

        this.tag(REOTags.Items.CHESTPLATES_ALUMINUM).add(REOItems.ALUMINIUM_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_AMETHYST).add(REOItems.AMETHYST_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_BRONZE).add(REOItems.BRONZE_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_ENDERITE).add(REOItems.ENDERITE_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_PERIDOT).add(REOItems.PERIDOT_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_PLATINUM).add(REOItems.PLATINUM_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_RUBY).add(REOItems.RUBY_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_SAPPHIRE).add(REOItems.SAPPHIRE_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_SILVER).add(REOItems.SILVER_CHESTPLATE.get());
        this.tag(REOTags.Items.CHESTPLATES_STEEL).add(REOItems.STEEL_CHESTPLATE.get());

        // Leggings
        this.tag(REOTags.Items.LEGGINGS).add(REOItems.ALUMINIUM_LEGGINGS.get(), REOItems.AMETHYST_LEGGINGS.get(),
                REOItems.BRONZE_LEGGINGS.get(), REOItems.ENDERITE_LEGGINGS.get(), REOItems.PERIDOT_LEGGINGS.get(),
                REOItems.PLATINUM_LEGGINGS.get(), REOItems.RUBY_LEGGINGS.get(), REOItems.SAPPHIRE_LEGGINGS.get(),
                REOItems.SILVER_LEGGINGS.get(), REOItems.STEEL_LEGGINGS.get());

        this.tag(REOTags.Items.LEGGINGS_ALUMINUM).add(REOItems.ALUMINIUM_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_AMETHYST).add(REOItems.AMETHYST_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_BRONZE).add(REOItems.BRONZE_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_ENDERITE).add(REOItems.ENDERITE_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_PERIDOT).add(REOItems.PERIDOT_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_PLATINUM).add(REOItems.PLATINUM_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_RUBY).add(REOItems.RUBY_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_SAPPHIRE).add(REOItems.SAPPHIRE_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_SILVER).add(REOItems.SILVER_LEGGINGS.get());
        this.tag(REOTags.Items.LEGGINGS_STEEL).add(REOItems.STEEL_LEGGINGS.get());

        // Boots
        this.tag(REOTags.Items.BOOTS).add(REOItems.ALUMINIUM_BOOTS.get(), REOItems.AMETHYST_BOOTS.get(),
                REOItems.BRONZE_BOOTS.get(), REOItems.ENDERITE_BOOTS.get(), REOItems.PERIDOT_BOOTS.get(),
                REOItems.PLATINUM_BOOTS.get(), REOItems.RUBY_BOOTS.get(), REOItems.SAPPHIRE_BOOTS.get(),
                REOItems.SILVER_BOOTS.get(), REOItems.STEEL_BOOTS.get());

        this.tag(REOTags.Items.BOOTS_ALUMINUM).add(REOItems.ALUMINIUM_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_AMETHYST).add(REOItems.AMETHYST_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_BRONZE).add(REOItems.BRONZE_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_ENDERITE).add(REOItems.ENDERITE_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_PERIDOT).add(REOItems.PERIDOT_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_PLATINUM).add(REOItems.PLATINUM_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_RUBY).add(REOItems.RUBY_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_SAPPHIRE).add(REOItems.SAPPHIRE_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_SILVER).add(REOItems.SILVER_BOOTS.get());
        this.tag(REOTags.Items.BOOTS_STEEL).add(REOItems.STEEL_BOOTS.get());

        // Ingots
        this.tag(REOTags.Items.INGOTS_ALUMINUM).add(REOItems.ALUMINUM_INGOT.get());
        this.tag(REOTags.Items.INGOTS_BRASS).add(REOItems.BRASS_INGOT.get());
        this.tag(REOTags.Items.INGOTS_BRONZE).add(REOItems.BRONZE_INGOT.get());
        this.tag(REOTags.Items.INGOTS_CHAIN).add(Items.CHAIN);
        this.tag(REOTags.Items.INGOTS_ELECTRUM).add(REOItems.ELECTRUM_INGOT.get());
        this.tag(REOTags.Items.INGOTS_ENDERITE).add(REOItems.ENDERITE_INGOT.get());
        this.tag(REOTags.Items.INGOTS_LEAD).add(REOItems.LEAD_INGOT.get());
        this.tag(REOTags.Items.INGOTS_NICKEL).add(REOItems.NICKEL_INGOT.get());
        this.tag(REOTags.Items.INGOTS_OBSIDIAN).add(REOItems.OBSIDIAN_INGOT.get());
        this.tag(REOTags.Items.INGOTS_PLATINUM).add(REOItems.PLATINUM_INGOT.get());
        this.tag(REOTags.Items.INGOTS_SILVER).add(REOItems.SILVER_INGOT.get());
        this.tag(REOTags.Items.INGOTS_STEEL).add(REOItems.STEEL_INGOT.get());
        this.tag(REOTags.Items.INGOTS_TIN).add(REOItems.TIN_INGOT.get());
        this.tag(REOTags.Items.INGOTS_URANIUM).add(REOItems.URANIUM_INGOT.get());
        this.tag(REOTags.Items.INGOTS_ZINC).add(REOItems.ZINC_INGOT.get());

        // Gems
        this.tag(REOTags.Items.GEMS_AMETHYST).add(REOItems.AMETHYST.get());
        this.tag(REOTags.Items.GEMS_PERIDOT).add(REOItems.PERIDOT.get());
        this.tag(REOTags.Items.GEMS_RUBY).add(REOItems.RUBY.get());
        this.tag(REOTags.Items.GEMS_SAPPHIRE).add(REOItems.SAPPHIRE.get());

        // Nuggets
        this.tag(REOTags.Items.NUGGETS_ALUMINUM).add(REOItems.ALUMINUM_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_AMETHYST).add(REOItems.AMETHYST_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_BRASS).add(REOItems.BRASS_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_BRONZE).add(REOItems.BRONZE_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_COPPER).add(REOItems.COPPER_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_DIAMOND).add(REOItems.DIAMOND_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_ELECTRTUM).add(REOItems.ELECTRUM_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_EMERALD).add(REOItems.EMERALD_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_ENDERITE).add(REOItems.ENDERITE_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_LEAD).add(REOItems.LEAD_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_NETHERITE).add(REOItems.NETHERITE_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_NICKEL).add(REOItems.NICKEL_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_PERIDOT).add(REOItems.PERIDOT_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_PLATINUM).add(REOItems.PLATINUM_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_RUBY).add(REOItems.RUBY_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_SAPPHIRE).add(REOItems.SAPPHIRE_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_SILVER).add(REOItems.SILVER_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_STEEL).add(REOItems.STEEL_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_TIN).add(REOItems.TIN_NUGGET.get());
        this.tag(REOTags.Items.NUGGETS_ZINC).add(REOItems.ZINC_NUGGET.get());

        // Dirty Dusts
        this.tag(REOTags.Items.DIRTY_ALUMINUM).add(REOItems.ALUMINUM_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_AMETHYST).add(REOItems.AMETHYST_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_BRASS).add(REOItems.BRASS_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_BRONZE).add(REOItems.BRONZE_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_COPPER).add(REOItems.COPPER_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_DIAMOND).add(REOItems.DIAMOND_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_ELECTRUM).add(REOItems.ELECTRUM_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_EMERALD).add(REOItems.EMERALD_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_ENDERITE).add(REOItems.ENDERITE_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_GOLD).add(REOItems.GOLD_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_IRON).add(REOItems.IRON_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_LEAD).add(REOItems.LEAD_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_NETHERITE).add(REOItems.NETHERITE_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_NICKEL).add(REOItems.NICKEL_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_OBSIDIAN).add(REOItems.OBSIDIAN_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_PERIDOT).add(REOItems.PERIDOT_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_PLATINUM).add(REOItems.PLATINUM_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_RUBY).add(REOItems.RUBY_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_SAPPHIRE).add(REOItems.SAPPHIRE_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_SILVER).add(REOItems.SILVER_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_STEEL).add(REOItems.STEEL_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_TIN).add(REOItems.TIN_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_URANIUM).add(REOItems.URANIUM_DIRTY.get());
        this.tag(REOTags.Items.DIRTY_ZINC).add(REOItems.ZINC_DIRTY.get());

        // Dusts
        this.tag(REOTags.Items.DUSTS_ALUMINUM).add(REOItems.ALUMINUM_DUST.get());
        this.tag(REOTags.Items.DUSTS_AMETHYST).add(REOItems.AMETHYST_DUST.get());
        this.tag(REOTags.Items.DUSTS_BRASS).add(REOItems.BRASS_DUST.get());
        this.tag(REOTags.Items.DUSTS_BRONZE).add(REOItems.BRONZE_DUST.get());
        this.tag(REOTags.Items.DUSTS_COPPER).add(REOItems.COPPER_DUST.get());
        this.tag(REOTags.Items.DUSTS_DIAMOND).add(REOItems.DIAMOND_DUST.get());
        this.tag(REOTags.Items.DUSTS_ELECTRTUM).add(REOItems.ELECTRUM_DUST.get());
        this.tag(REOTags.Items.DUSTS_EMERALD).add(REOItems.EMERALD_DUST.get());
        this.tag(REOTags.Items.DUSTS_ENDERITE).add(REOItems.ENDERITE_DUST.get());
        this.tag(REOTags.Items.DUSTS_GOLD).add(REOItems.GOLD_DUST.get());
        this.tag(REOTags.Items.DUSTS_IRON).add(REOItems.IRON_DUST.get());
        this.tag(REOTags.Items.DUSTS_LEAD).add(REOItems.LEAD_DUST.get());
        this.tag(REOTags.Items.DUSTS_NETHERITE).add(REOItems.NETHERITE_DUST.get());
        this.tag(REOTags.Items.DUSTS_NICKEL).add(REOItems.NICKEL_DUST.get());
        this.tag(REOTags.Items.DUSTS_OBSIDIAN).add(REOItems.OBSIDIAN_DUST.get());
        this.tag(REOTags.Items.DUSTS_PERIDOT).add(REOItems.PERIDOT_DUST.get());
        this.tag(REOTags.Items.DUSTS_PLATINUM).add(REOItems.PLATINUM_DUST.get());
        this.tag(REOTags.Items.DUSTS_RUBY).add(REOItems.RUBY_DUST.get());
        this.tag(REOTags.Items.DUSTS_SAPPHIRE).add(REOItems.SAPPHIRE_DUST.get());
        this.tag(REOTags.Items.DUSTS_SILVER).add(REOItems.SILVER_DUST.get());
        this.tag(REOTags.Items.DUSTS_STEEL).add(REOItems.STEEL_DUST.get());
        this.tag(REOTags.Items.DUSTS_TIN).add(REOItems.TIN_DUST.get());
        this.tag(REOTags.Items.DUSTS_URANIUM).add(REOItems.URANIUM_DUST.get());
        this.tag(REOTags.Items.DUSTS_ZINC).add(REOItems.ZINC_DUST.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_ALUMINUM)
                .add(REOItems.ALUMINIUM_AXE.get(), REOItems.ALUMINIUM_BOW.get(), REOItems.ALUMINIUM_EXCAVATOR.get(),
                        REOItems.ALUMINIUM_HAMMER.get(), REOItems.ALUMINIUM_HATCHET.get(), REOItems.ALUMINIUM_HOE.get(),
                        REOItems.ALUMINIUM_PAXEL.get(), REOItems.ALUMINIUM_PICKAXE.get(), REOItems.ALUMINIUM_SHEARS.get(),
                        REOItems.ALUMINIUM_SHOVEL.get(), REOItems.ALUMINIUM_SICKLE.get(), REOItems.ALUMINIUM_SWORD.get(),
                        REOItems.ALUMINIUM_HELMET.get(), REOItems.ALUMINIUM_CHESTPLATE.get(), REOItems.ALUMINIUM_LEGGINGS.get(),
                        REOItems.ALUMINIUM_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_AMETHYST)
                .add(REOItems.AMETHYST_AXE.get(), REOItems.AMETHYST_BOW.get(), REOItems.AMETHYST_EXCAVATOR.get(),
                        REOItems.AMETHYST_HAMMER.get(), REOItems.AMETHYST_HATCHET.get(), REOItems.AMETHYST_HOE.get(),
                        REOItems.AMETHYST_PAXEL.get(), REOItems.AMETHYST_PICKAXE.get(), REOItems.AMETHYST_SHEARS.get(),
                        REOItems.AMETHYST_SHOVEL.get(), REOItems.AMETHYST_SICKLE.get(), REOItems.AMETHYST_SWORD.get(),
                        REOItems.AMETHYST_HELMET.get(), REOItems.AMETHYST_CHESTPLATE.get(), REOItems.AMETHYST_LEGGINGS.get(),
                        REOItems.AMETHYST_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_BRONZE)
                .add(REOItems.BRONZE_AXE.get(), REOItems.BRONZE_BOW.get(), REOItems.BRONZE_EXCAVATOR.get(),
                        REOItems.BRONZE_HAMMER.get(), REOItems.BRONZE_HATCHET.get(), REOItems.BRONZE_HOE.get(),
                        REOItems.BRONZE_PAXEL.get(), REOItems.BRONZE_PICKAXE.get(), REOItems.BRONZE_SHEARS.get(),
                        REOItems.BRONZE_SHOVEL.get(), REOItems.BRONZE_SICKLE.get(), REOItems.BRONZE_SWORD.get(),
                        REOItems.BRONZE_HELMET.get(), REOItems.BRONZE_CHESTPLATE.get(), REOItems.BRONZE_LEGGINGS.get(),
                        REOItems.BRONZE_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND)
                .add(Items.DIAMOND_AXE, REOItems.DIAMOND_BOW.get(), REOItems.DIAMOND_EXCAVATOR.get(),
                        REOItems.DIAMOND_HAMMER.get(), REOItems.DIAMOND_HATCHET.get(), Items.DIAMOND_HOE,
                        REOItems.DIAMOND_PAXEL.get(), Items.DIAMOND_PICKAXE, REOItems.DIAMOND_SHEARS.get(),
                        Items.DIAMOND_SHOVEL, REOItems.DIAMOND_SICKLE.get(), Items.DIAMOND_SWORD,
                        Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS);

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_ENDERITE)
                .add(REOItems.ENDERITE_AXE.get(), REOItems.ENDERITE_BOW.get(), REOItems.ENDERITE_EXCAVATOR.get(),
                        REOItems.ENDERITE_HAMMER.get(), REOItems.ENDERITE_HATCHET.get(), REOItems.ENDERITE_HOE.get(),
                        REOItems.ENDERITE_PAXEL.get(), REOItems.ENDERITE_PICKAXE.get(), REOItems.ENDERITE_SHEARS.get(),
                        REOItems.ENDERITE_SHOVEL.get(), REOItems.ENDERITE_SICKLE.get(), REOItems.ENDERITE_SWORD.get(),
                        REOItems.ENDERITE_HELMET.get(), REOItems.ENDERITE_CHESTPLATE.get(), REOItems.ENDERITE_LEGGINGS.get(),
                        REOItems.ENDERITE_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_GOLD)
                .add(Items.GOLDEN_AXE, REOItems.GOLDEN_BOW.get(), REOItems.GOLDEN_EXCAVATOR.get(),
                        REOItems.GOLDEN_HAMMER.get(), REOItems.GOLDEN_HATCHET.get(), Items.GOLDEN_HOE,
                        REOItems.GOLDEN_PAXEL.get(), Items.GOLDEN_PICKAXE, REOItems.GOLDEN_SHEARS.get(),
                        Items.GOLDEN_SHOVEL, REOItems.GOLDEN_SICKLE.get(), Items.GOLDEN_SWORD,
                        Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS,
                        Items.GOLDEN_BOOTS);

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_IRON)
                .add(Items.IRON_AXE, REOItems.IRON_BOW.get(), REOItems.IRON_EXCAVATOR.get(),
                        REOItems.IRON_HAMMER.get(), REOItems.IRON_HATCHET.get(), Items.IRON_HOE,
                        REOItems.IRON_PAXEL.get(), Items.IRON_PICKAXE, Items.SHEARS,
                        Items.IRON_SHOVEL, REOItems.IRON_SICKLE.get(), Items.IRON_SWORD,
                        Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                        Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS);

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE)
                .add(Items.NETHERITE_AXE, REOItems.NETHERITE_BOW.get(), REOItems.NETHERITE_EXCAVATOR.get(),
                        REOItems.NETHERITE_HAMMER.get(), REOItems.NETHERITE_HATCHET.get(), Items.NETHERITE_HOE,
                        REOItems.NETHERITE_PAXEL.get(), Items.NETHERITE_PICKAXE, REOItems.NETHERITE_SHEARS.get(),
                        Items.NETHERITE_SHOVEL, REOItems.NETHERITE_SICKLE.get(), Items.NETHERITE_SWORD,
                        Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS,
                        Items.NETHERITE_BOOTS);

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_PERIDOT)
                .add(REOItems.PERIDOT_AXE.get(), REOItems.PERIDOT_BOW.get(), REOItems.PERIDOT_EXCAVATOR.get(),
                        REOItems.PERIDOT_HAMMER.get(), REOItems.PERIDOT_HATCHET.get(), REOItems.PERIDOT_HOE.get(),
                        REOItems.PERIDOT_PAXEL.get(), REOItems.PERIDOT_PICKAXE.get(), REOItems.PERIDOT_SHEARS.get(),
                        REOItems.PERIDOT_SHOVEL.get(), REOItems.PERIDOT_SICKLE.get(), REOItems.PERIDOT_SWORD.get(),
                        REOItems.PERIDOT_HELMET.get(), REOItems.PERIDOT_CHESTPLATE.get(), REOItems.PERIDOT_LEGGINGS.get(),
                        REOItems.PERIDOT_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_PLATINUM)
                .add(REOItems.PLATINUM_AXE.get(), REOItems.PLATINUM_BOW.get(), REOItems.PLATINUM_EXCAVATOR.get(),
                        REOItems.PLATINUM_HAMMER.get(), REOItems.PLATINUM_HATCHET.get(), REOItems.PLATINUM_HOE.get(),
                        REOItems.PLATINUM_PAXEL.get(), REOItems.PLATINUM_PICKAXE.get(), REOItems.PLATINUM_SHEARS.get(),
                        REOItems.PLATINUM_SHOVEL.get(), REOItems.PLATINUM_SICKLE.get(), REOItems.PLATINUM_SWORD.get(),
                        REOItems.PLATINUM_HELMET.get(), REOItems.PLATINUM_CHESTPLATE.get(), REOItems.PLATINUM_LEGGINGS.get(),
                        REOItems.PLATINUM_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_RUBY)
                .add(REOItems.RUBY_AXE.get(), REOItems.RUBY_BOW.get(), REOItems.RUBY_EXCAVATOR.get(),
                        REOItems.RUBY_HAMMER.get(), REOItems.RUBY_HATCHET.get(), REOItems.RUBY_HOE.get(),
                        REOItems.RUBY_PAXEL.get(), REOItems.RUBY_PICKAXE.get(), REOItems.RUBY_SHEARS.get(),
                        REOItems.RUBY_SHOVEL.get(), REOItems.RUBY_SICKLE.get(), REOItems.RUBY_SWORD.get(),
                        REOItems.RUBY_HELMET.get(), REOItems.RUBY_CHESTPLATE.get(), REOItems.RUBY_LEGGINGS.get(),
                        REOItems.RUBY_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_SAPPHIRE)
                .add(REOItems.SAPPHIRE_AXE.get(), REOItems.SAPPHIRE_BOW.get(), REOItems.SAPPHIRE_EXCAVATOR.get(),
                        REOItems.SAPPHIRE_HAMMER.get(), REOItems.SAPPHIRE_HATCHET.get(), REOItems.SAPPHIRE_HOE.get(),
                        REOItems.SAPPHIRE_PAXEL.get(), REOItems.SAPPHIRE_PICKAXE.get(), REOItems.SAPPHIRE_SHEARS.get(),
                        REOItems.SAPPHIRE_SHOVEL.get(), REOItems.SAPPHIRE_SICKLE.get(), REOItems.SAPPHIRE_SWORD.get(),
                        REOItems.SAPPHIRE_HELMET.get(), REOItems.SAPPHIRE_CHESTPLATE.get(), REOItems.SAPPHIRE_LEGGINGS.get(),
                        REOItems.SAPPHIRE_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_SILVER)
                .add(REOItems.SILVER_AXE.get(), REOItems.SILVER_BOW.get(), REOItems.SILVER_EXCAVATOR.get(),
                        REOItems.SILVER_HAMMER.get(), REOItems.SILVER_HATCHET.get(), REOItems.SILVER_HOE.get(),
                        REOItems.SILVER_PAXEL.get(), REOItems.SILVER_PICKAXE.get(), REOItems.SILVER_SHEARS.get(),
                        REOItems.SILVER_SHOVEL.get(), REOItems.SILVER_SICKLE.get(), REOItems.SILVER_SWORD.get(),
                        REOItems.SILVER_HELMET.get(), REOItems.SILVER_CHESTPLATE.get(), REOItems.SILVER_LEGGINGS.get(),
                        REOItems.SILVER_BOOTS.get());

        this.tag(REOTags.Items.TOOLS_AND_ARMOR_STEEL)
                .add(REOItems.STEEL_AXE.get(), REOItems.STEEL_BOW.get(), REOItems.STEEL_EXCAVATOR.get(),
                        REOItems.STEEL_HAMMER.get(), REOItems.STEEL_HATCHET.get(), REOItems.STEEL_HOE.get(),
                        REOItems.STEEL_PAXEL.get(), REOItems.STEEL_PICKAXE.get(), REOItems.STEEL_SHEARS.get(),
                        REOItems.STEEL_SHOVEL.get(), REOItems.STEEL_SICKLE.get(), REOItems.STEEL_SWORD.get(),
                        REOItems.STEEL_HELMET.get(), REOItems.STEEL_CHESTPLATE.get(), REOItems.STEEL_LEGGINGS.get(),
                        REOItems.STEEL_BOOTS.get());

    }
}