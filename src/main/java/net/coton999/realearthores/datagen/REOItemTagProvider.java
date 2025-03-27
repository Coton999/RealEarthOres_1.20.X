package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
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
                .add(REOBlocks.MARBLE_COBBLE.get().asItem())
                .add(REOBlocks.LIMESTONE_COBBLE.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(REOBlocks.PLANKS_BALSA.get().asItem(), REOBlocks.PLANKS_BAOBAB.get().asItem(), REOBlocks.PLANKS_HILL_CHERRY.get().asItem(),
                        REOBlocks.PLANKS_CHESTNUT.get().asItem(), REOBlocks.PLANKS_CITRUS.get().asItem(), REOBlocks.PLANKS_EBONY.get().asItem(),
                        REOBlocks.PLANKS_LARCH.get().asItem(), REOBlocks.PLANKS_LIME.get().asItem(), REOBlocks.PLANKS_MAHOGANY.get().asItem(),
                        REOBlocks.PLANKS_MAPLE.get().asItem(), REOBlocks.PLANKS_PALM.get().asItem(), REOBlocks.PLANKS_PAPAYA.get().asItem(),
                        REOBlocks.PLANKS_PINE.get().asItem(), REOBlocks.PLANKS_PLUM.get().asItem(), REOBlocks.PLANKS_POPLAR.get().asItem(),
                        REOBlocks.PLANKS_REDWOOD.get().asItem(), REOBlocks.PLANKS_RUBBER.get().asItem(), REOBlocks.PLANKS_TEAK.get().asItem(),
                        REOBlocks.PLANKS_WALNUT.get().asItem(), REOBlocks.PLANKS_WILLOW.get().asItem());

        this.tag(ItemTags.WOODEN_SLABS)
                .add(REOBlocks.SLAB_BALSA.get().asItem(), REOBlocks.SLAB_BAOBAB.get().asItem(), REOBlocks.SLAB_HILL_CHERRY.get().asItem(),
                        REOBlocks.SLAB_CHESTNUT.get().asItem(), REOBlocks.SLAB_CITRUS.get().asItem(), REOBlocks.SLAB_EBONY.get().asItem(),
                        REOBlocks.SLAB_LARCH.get().asItem(), REOBlocks.SLAB_LIME.get().asItem(), REOBlocks.SLAB_MAHOGANY.get().asItem(),
                        REOBlocks.SLAB_MAPLE.get().asItem(), REOBlocks.SLAB_PALM.get().asItem(), REOBlocks.SLAB_PAPAYA.get().asItem(),
                        REOBlocks.SLAB_PINE.get().asItem(), REOBlocks.SLAB_PLUM.get().asItem(), REOBlocks.SLAB_POPLAR.get().asItem(),
                        REOBlocks.SLAB_REDWOOD.get().asItem(), REOBlocks.SLAB_RUBBER.get().asItem(), REOBlocks.SLAB_TEAK.get().asItem(),
                        REOBlocks.SLAB_WALNUT.get().asItem(), REOBlocks.SLAB_WILLOW.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(REOBlocks.SAPLING_BALSA.get().asItem(), REOBlocks.SAPLING_BAOBAB.get().asItem(), REOBlocks.SAPLING_HILL_CHERRY.get().asItem(),
                        REOBlocks.SAPLING_CHESTNUT.get().asItem(), REOBlocks.SAPLING_CITRUS.get().asItem(), REOBlocks.SAPLING_EBONY.get().asItem(),
                        REOBlocks.SAPLING_LARCH.get().asItem(), REOBlocks.SAPLING_LIME.get().asItem(), REOBlocks.SAPLING_MAHOGANY.get().asItem(),
                        REOBlocks.SAPLING_MAPLE.get().asItem(), REOBlocks.SAPLING_PALM.get().asItem(), REOBlocks.SAPLING_PAPAYA.get().asItem(),
                        REOBlocks.SAPLING_PINE.get().asItem(), REOBlocks.SAPLING_PLUM.get().asItem(), REOBlocks.SAPLING_POPLAR.get().asItem(),
                        REOBlocks.SAPLING_REDWOOD.get().asItem(), REOBlocks.SAPLING_RUBBER.get().asItem(), REOBlocks.SAPLING_TEAK.get().asItem(),
                        REOBlocks.SAPLING_WALNUT.get().asItem(), REOBlocks.SAPLING_WILLOW.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(REOBlocks.LEAVES_BALSA.get().asItem(), REOBlocks.LEAVES_BAOBAB.get().asItem(), REOBlocks.LEAVES_HILL_CHERRY.get().asItem(),
                        REOBlocks.LEAVES_CHESTNUT.get().asItem(), REOBlocks.LEAVES_CITRUS.get().asItem(), REOBlocks.LEAVES_EBONY.get().asItem(),
                        REOBlocks.LEAVES_LARCH.get().asItem(), REOBlocks.LEAVES_LIME.get().asItem(), REOBlocks.LEAVES_MAHOGANY.get().asItem(),
                        REOBlocks.LEAVES_MAPLE.get().asItem(), REOBlocks.LEAVES_PALM.get().asItem(), REOBlocks.LEAVES_PAPAYA.get().asItem(),
                        REOBlocks.LEAVES_PINE.get().asItem(), REOBlocks.LEAVES_PLUM.get().asItem(), REOBlocks.LEAVES_POPLAR.get().asItem(),
                        REOBlocks.LEAVES_REDWOOD.get().asItem(), REOBlocks.LEAVES_RUBBER.get().asItem(), REOBlocks.LEAVES_TEAK.get().asItem(),
                        REOBlocks.LEAVES_WALNUT.get().asItem(), REOBlocks.LEAVES_WILLOW.get().asItem());

        this.tag(ItemTags.WOODEN_STAIRS)
                .add(REOBlocks.STAIRS_BALSA.get().asItem(), REOBlocks.STAIRS_BAOBAB.get().asItem(), REOBlocks.STAIRS_HILL_CHERRY.get().asItem(),
                        REOBlocks.STAIRS_CHESTNUT.get().asItem(), REOBlocks.STAIRS_CITRUS.get().asItem(), REOBlocks.STAIRS_EBONY.get().asItem(),
                        REOBlocks.STAIRS_LARCH.get().asItem(), REOBlocks.STAIRS_LIME.get().asItem(), REOBlocks.STAIRS_MAHOGANY.get().asItem(),
                        REOBlocks.STAIRS_MAPLE.get().asItem(), REOBlocks.STAIRS_PALM.get().asItem(), REOBlocks.STAIRS_PAPAYA.get().asItem(),
                        REOBlocks.STAIRS_PINE.get().asItem(), REOBlocks.STAIRS_PLUM.get().asItem(), REOBlocks.STAIRS_POPLAR.get().asItem(),
                        REOBlocks.STAIRS_REDWOOD.get().asItem(), REOBlocks.STAIRS_RUBBER.get().asItem(), REOBlocks.STAIRS_TEAK.get().asItem(),
                        REOBlocks.STAIRS_WALNUT.get().asItem(), REOBlocks.STAIRS_WILLOW.get().asItem());


        this.tag(ItemTags.FENCES)
                .add(REOBlocks.FENCE_BALSA.get().asItem(), REOBlocks.FENCE_BAOBAB.get().asItem(), REOBlocks.FENCE_HILL_CHERRY.get().asItem(),
                        REOBlocks.FENCE_CHESTNUT.get().asItem(), REOBlocks.FENCE_CITRUS.get().asItem(), REOBlocks.FENCE_EBONY.get().asItem(),
                        REOBlocks.FENCE_LARCH.get().asItem(), REOBlocks.FENCE_LIME.get().asItem(), REOBlocks.FENCE_MAHOGANY.get().asItem(),
                        REOBlocks.FENCE_MAPLE.get().asItem(), REOBlocks.FENCE_PALM.get().asItem(), REOBlocks.FENCE_PAPAYA.get().asItem(),
                        REOBlocks.FENCE_PINE.get().asItem(), REOBlocks.FENCE_PLUM.get().asItem(), REOBlocks.FENCE_POPLAR.get().asItem(),
                        REOBlocks.FENCE_REDWOOD.get().asItem(), REOBlocks.FENCE_RUBBER.get().asItem(), REOBlocks.FENCE_TEAK.get().asItem(),
                        REOBlocks.FENCE_WALNUT.get().asItem(), REOBlocks.FENCE_WILLOW.get().asItem());

        this.tag(ItemTags.FENCE_GATES)
                .add(REOBlocks.FENCE_GATE_BALSA.get().asItem(), REOBlocks.FENCE_GATE_BAOBAB.get().asItem(), REOBlocks.FENCE_GATE_HILL_CHERRY.get().asItem(),
                        REOBlocks.FENCE_GATE_CHESTNUT.get().asItem(), REOBlocks.FENCE_GATE_CITRUS.get().asItem(), REOBlocks.FENCE_GATE_EBONY.get().asItem(),
                        REOBlocks.FENCE_GATE_LARCH.get().asItem(), REOBlocks.FENCE_GATE_LIME.get().asItem(), REOBlocks.FENCE_GATE_MAHOGANY.get().asItem(),
                        REOBlocks.FENCE_GATE_MAPLE.get().asItem(), REOBlocks.FENCE_GATE_PALM.get().asItem(), REOBlocks.FENCE_GATE_PAPAYA.get().asItem(),
                        REOBlocks.FENCE_GATE_PINE.get().asItem(), REOBlocks.FENCE_GATE_PLUM.get().asItem(), REOBlocks.FENCE_GATE_POPLAR.get().asItem(),
                        REOBlocks.FENCE_GATE_REDWOOD.get().asItem(), REOBlocks.FENCE_GATE_RUBBER.get().asItem(), REOBlocks.FENCE_GATE_TEAK.get().asItem(),
                        REOBlocks.FENCE_GATE_WALNUT.get().asItem(), REOBlocks.FENCE_GATE_WILLOW.get().asItem());

        this.tag(ItemTags.WOODEN_BUTTONS)
                .add(REOBlocks.BUTTON_BALSA.get().asItem(), REOBlocks.BUTTON_BAOBAB.get().asItem(), REOBlocks.BUTTON_HILL_CHERRY.get().asItem(),
                        REOBlocks.BUTTON_CHESTNUT.get().asItem(), REOBlocks.BUTTON_CITRUS.get().asItem(), REOBlocks.BUTTON_EBONY.get().asItem(),
                        REOBlocks.BUTTON_LARCH.get().asItem(), REOBlocks.BUTTON_LIME.get().asItem(), REOBlocks.BUTTON_MAHOGANY.get().asItem(),
                        REOBlocks.BUTTON_MAPLE.get().asItem(), REOBlocks.BUTTON_PALM.get().asItem(), REOBlocks.BUTTON_PAPAYA.get().asItem(),
                        REOBlocks.BUTTON_PINE.get().asItem(), REOBlocks.BUTTON_PLUM.get().asItem(), REOBlocks.BUTTON_POPLAR.get().asItem(),
                        REOBlocks.BUTTON_REDWOOD.get().asItem(), REOBlocks.BUTTON_RUBBER.get().asItem(), REOBlocks.BUTTON_TEAK.get().asItem(),
                        REOBlocks.BUTTON_WALNUT.get().asItem(), REOBlocks.BUTTON_WILLOW.get().asItem());

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(REOBlocks.PRESSURE_PLATE_BALSA.get().asItem(), REOBlocks.PRESSURE_PLATE_BAOBAB.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get().asItem(), REOBlocks.PRESSURE_PLATE_CHESTNUT.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_CITRUS.get().asItem(), REOBlocks.PRESSURE_PLATE_EBONY.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_LARCH.get().asItem(), REOBlocks.PRESSURE_PLATE_LIME.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_MAHOGANY.get().asItem(), REOBlocks.PRESSURE_PLATE_MAPLE.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_PALM.get().asItem(), REOBlocks.PRESSURE_PLATE_PAPAYA.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_PINE.get().asItem(), REOBlocks.PRESSURE_PLATE_PLUM.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_POPLAR.get().asItem(), REOBlocks.PRESSURE_PLATE_REDWOOD.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_RUBBER.get().asItem(), REOBlocks.PRESSURE_PLATE_TEAK.get().asItem(),
                        REOBlocks.PRESSURE_PLATE_WALNUT.get().asItem(), REOBlocks.PRESSURE_PLATE_WILLOW.get().asItem());

        this.tag(ItemTags.WOODEN_DOORS)
                .add(REOBlocks.DOOR_BALSA.get().asItem(), REOBlocks.DOOR_BAOBAB.get().asItem(), REOBlocks.DOOR_HILL_CHERRY.get().asItem(),
                        REOBlocks.DOOR_CHESTNUT.get().asItem(), REOBlocks.DOOR_CITRUS.get().asItem(), REOBlocks.DOOR_EBONY.get().asItem(),
                        REOBlocks.DOOR_LARCH.get().asItem(), REOBlocks.DOOR_LIME.get().asItem(), REOBlocks.DOOR_MAHOGANY.get().asItem(),
                        REOBlocks.DOOR_MAPLE.get().asItem(), REOBlocks.DOOR_PALM.get().asItem(), REOBlocks.DOOR_PAPAYA.get().asItem(),
                        REOBlocks.DOOR_PINE.get().asItem(), REOBlocks.DOOR_PLUM.get().asItem(), REOBlocks.DOOR_POPLAR.get().asItem(),
                        REOBlocks.DOOR_REDWOOD.get().asItem(), REOBlocks.DOOR_RUBBER.get().asItem(), REOBlocks.DOOR_TEAK.get().asItem(),
                        REOBlocks.DOOR_WALNUT.get().asItem(), REOBlocks.DOOR_WILLOW.get().asItem());


        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(REOBlocks.LOG_BALSA.get().asItem(), REOBlocks.LOG_BALSA_STRIPPED.get().asItem(),
                        REOBlocks.LOG_BAOBAB.get().asItem(), REOBlocks.LOG_BAOBAB_STRIPPED.get().asItem(),
                        REOBlocks.LOG_HILL_CHERRY.get().asItem(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_CHESTNUT.get().asItem(), REOBlocks.LOG_CHESTNUT_STRIPPED.get().asItem(),
                        REOBlocks.LOG_CITRUS.get().asItem(), REOBlocks.LOG_CITRUS_STRIPPED.get().asItem(),
                        REOBlocks.LOG_EBONY.get().asItem(), REOBlocks.LOG_EBONY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_LARCH.get().asItem(), REOBlocks.LOG_LARCH_STRIPPED.get().asItem(),
                        REOBlocks.LOG_LIME.get().asItem(), REOBlocks.LOG_LIME_STRIPPED.get().asItem(),
                        REOBlocks.LOG_MAHOGANY.get().asItem(), REOBlocks.LOG_MAHOGANY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_MAPLE.get().asItem(), REOBlocks.LOG_MAPLE_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PALM.get().asItem(), REOBlocks.LOG_PALM_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PAPAYA.get().asItem(), REOBlocks.LOG_PAPAYA_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PINE.get().asItem(), REOBlocks.LOG_PINE_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PLUM.get().asItem(), REOBlocks.LOG_PLUM_STRIPPED.get().asItem(),
                        REOBlocks.LOG_POPLAR.get().asItem(), REOBlocks.LOG_POPLAR_STRIPPED.get().asItem(),
                        REOBlocks.LOG_REDWOOD.get().asItem(), REOBlocks.LOG_REDWOOD_STRIPPED.get().asItem(),
                        REOBlocks.LOG_RUBBER.get().asItem(), REOBlocks.LOG_RUBBER_STRIPPED.get().asItem(),
                        REOBlocks.LOG_TEAK.get().asItem(), REOBlocks.LOG_TEAK_STRIPPED.get().asItem(),
                        REOBlocks.LOG_WALNUT.get().asItem(), REOBlocks.LOG_WALNUT_STRIPPED.get().asItem(),
                        REOBlocks.LOG_WILLOW.get().asItem(), REOBlocks.LOG_WILLOW_STRIPPED.get().asItem(),

                        REOBlocks.WOOD_BALSA.get().asItem(), REOBlocks.WOOD_BALSA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_BAOBAB.get().asItem(), REOBlocks.WOOD_BAOBAB_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_HILL_CHERRY.get().asItem(), REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CHESTNUT.get().asItem(), REOBlocks.WOOD_CHESTNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CITRUS.get().asItem(), REOBlocks.WOOD_CITRUS_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_EBONY.get().asItem(), REOBlocks.WOOD_EBONY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_LARCH.get().asItem(), REOBlocks.WOOD_LARCH_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_LIME.get().asItem(), REOBlocks.WOOD_LIME_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAHOGANY.get().asItem(), REOBlocks.WOOD_MAHOGANY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAPLE.get().asItem(), REOBlocks.WOOD_MAPLE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PALM.get().asItem(), REOBlocks.WOOD_PALM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PAPAYA.get().asItem(), REOBlocks.WOOD_PAPAYA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PINE.get().asItem(), REOBlocks.WOOD_PINE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PLUM.get().asItem(), REOBlocks.WOOD_PLUM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_POPLAR.get().asItem(), REOBlocks.WOOD_POPLAR_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_REDWOOD.get().asItem(), REOBlocks.WOOD_REDWOOD_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_RUBBER.get().asItem(), REOBlocks.WOOD_RUBBER_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_TEAK.get().asItem(), REOBlocks.WOOD_TEAK_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WALNUT.get().asItem(), REOBlocks.WOOD_WALNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WILLOW.get().asItem(), REOBlocks.WOOD_WILLOW_STRIPPED.get().asItem());

        this.tag(REOTags.Items.BALSA_LOGS)
                .add(REOBlocks.LOG_BALSA.get().asItem(),REOBlocks.LOG_BALSA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_BALSA.get().asItem(),REOBlocks.WOOD_BALSA_STRIPPED.get().asItem());

        this.tag(REOTags.Items.BAOBAB_LOGS)
                .add(REOBlocks.LOG_BAOBAB.get().asItem(),REOBlocks.LOG_BAOBAB_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_BAOBAB.get().asItem(),REOBlocks.WOOD_BAOBAB_STRIPPED.get().asItem());

        this.tag(REOTags.Items.HILL_CHERRY_LOGS)
                .add(REOBlocks.LOG_HILL_CHERRY.get().asItem(),REOBlocks.LOG_HILL_CHERRY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_HILL_CHERRY.get().asItem(),REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get().asItem());

        this.tag(REOTags.Items.CHESTNUT_LOGS)
                .add(REOBlocks.LOG_CHESTNUT.get().asItem(),REOBlocks.LOG_CHESTNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CHESTNUT.get().asItem(),REOBlocks.WOOD_CHESTNUT_STRIPPED.get().asItem());

        this.tag(REOTags.Items.CITRUS_LOGS)
                .add(REOBlocks.LOG_CITRUS.get().asItem(),REOBlocks.LOG_CITRUS_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CITRUS.get().asItem(),REOBlocks.WOOD_CITRUS_STRIPPED.get().asItem());

        this.tag(REOTags.Items.EBONY_LOGS)
                .add(REOBlocks.LOG_EBONY.get().asItem(),REOBlocks.LOG_EBONY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_EBONY.get().asItem(),REOBlocks.WOOD_EBONY_STRIPPED.get().asItem());

        this.tag(REOTags.Items.LARCH_LOGS)
                .add(REOBlocks.LOG_LARCH.get().asItem(),REOBlocks.LOG_LARCH_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_LARCH.get().asItem(),REOBlocks.WOOD_LARCH_STRIPPED.get().asItem());

        this.tag(REOTags.Items.LIME_LOGS)
                .add(REOBlocks.LOG_LIME.get().asItem(),REOBlocks.LOG_LIME_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_LIME.get().asItem(),REOBlocks.WOOD_LIME_STRIPPED.get().asItem());

        this.tag(REOTags.Items.MAHOGANY_LOGS)
                .add(REOBlocks.LOG_MAHOGANY.get().asItem(),REOBlocks.LOG_MAHOGANY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAHOGANY.get().asItem(),REOBlocks.WOOD_MAHOGANY_STRIPPED.get().asItem());

        this.tag(REOTags.Items.MAPLE_LOGS)
                .add(REOBlocks.LOG_MAPLE.get().asItem(),REOBlocks.LOG_MAPLE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAPLE.get().asItem(),REOBlocks.WOOD_MAPLE_STRIPPED.get().asItem());

        this.tag(REOTags.Items.PALM_LOGS)
                .add(REOBlocks.LOG_PALM.get().asItem(),REOBlocks.LOG_PALM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PALM.get().asItem(),REOBlocks.WOOD_PALM_STRIPPED.get().asItem());

        this.tag(REOTags.Items.PAPAYA_LOGS)
                .add(REOBlocks.LOG_PAPAYA.get().asItem(),REOBlocks.LOG_PAPAYA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PAPAYA.get().asItem(),REOBlocks.WOOD_PAPAYA_STRIPPED.get().asItem());

        this.tag(REOTags.Items.PINE_LOGS)
                .add(REOBlocks.LOG_PINE.get().asItem(),REOBlocks.LOG_PINE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PINE.get().asItem(),REOBlocks.WOOD_PINE_STRIPPED.get().asItem());

        this.tag(REOTags.Items.PLUM_LOGS)
                .add(REOBlocks.LOG_PLUM.get().asItem(),REOBlocks.LOG_PLUM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PLUM.get().asItem(),REOBlocks.WOOD_PLUM_STRIPPED.get().asItem());

        this.tag(REOTags.Items.POPLAR_LOGS)
                .add(REOBlocks.LOG_POPLAR.get().asItem(),REOBlocks.LOG_POPLAR_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_POPLAR.get().asItem(),REOBlocks.WOOD_POPLAR_STRIPPED.get().asItem());

        this.tag(REOTags.Items.REDWOOD_LOGS)
                .add(REOBlocks.LOG_REDWOOD.get().asItem(),REOBlocks.LOG_REDWOOD_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_REDWOOD.get().asItem(),REOBlocks.WOOD_REDWOOD_STRIPPED.get().asItem());

        this.tag(REOTags.Items.RUBBER_LOGS)
                .add(REOBlocks.LOG_RUBBER.get().asItem(),REOBlocks.LOG_RUBBER_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_RUBBER.get().asItem(),REOBlocks.WOOD_RUBBER_STRIPPED.get().asItem());

        this.tag(REOTags.Items.TEAK_LOGS)
                .add(REOBlocks.LOG_TEAK.get().asItem(),REOBlocks.LOG_TEAK_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_TEAK.get().asItem(),REOBlocks.WOOD_TEAK_STRIPPED.get().asItem());

        this.tag(REOTags.Items.WALNUT_LOGS)
                .add(REOBlocks.LOG_WALNUT.get().asItem(),REOBlocks.LOG_WALNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WALNUT.get().asItem(),REOBlocks.WOOD_WALNUT_STRIPPED.get().asItem());

        this.tag(REOTags.Items.WILLOW_LOGS)
                .add(REOBlocks.LOG_WILLOW.get().asItem(),REOBlocks.LOG_WILLOW_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WILLOW.get().asItem(),REOBlocks.WOOD_WILLOW_STRIPPED.get().asItem());

        this.tag(REOTags.Items.VANILLA_RESISTANT_LOGS)
                .add(REOBlocks.LOG_OAK_RESISTANT.get().asItem(),REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_OAK_RESISTANT.get().asItem(),REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_SPRUCE_RESISTANT.get().asItem(),REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_SPRUCE_RESISTANT.get().asItem(),REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_BIRCH_RESISTANT.get().asItem(),REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_BIRCH_RESISTANT.get().asItem(),REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_JUNGLE_RESISTANT.get().asItem(),REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_JUNGLE_RESISTANT.get().asItem(),REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_ACACIA_RESISTANT.get().asItem(),REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_ACACIA_RESISTANT.get().asItem(),REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_DARK_OAK_RESISTANT.get().asItem(),REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_DARK_OAK_RESISTANT.get().asItem(),REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_MANGROVE_RESISTANT.get().asItem(),REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_MANGROVE_RESISTANT.get().asItem(),REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.LOG_CHERRY_RESISTANT.get().asItem(),REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_CHERRY_RESISTANT.get().asItem(),REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get().asItem());

        this.tag(ItemTags.LOGS)
                .addTag(REOTags.Items.BALSA_LOGS).addTag(REOTags.Items.BAOBAB_LOGS).addTag(REOTags.Items.HILL_CHERRY_LOGS)
                .addTag(REOTags.Items.CHESTNUT_LOGS).addTag(REOTags.Items.CITRUS_LOGS).addTag(REOTags.Items.EBONY_LOGS)
                .addTag(REOTags.Items.LARCH_LOGS).addTag(REOTags.Items.LIME_LOGS).addTag(REOTags.Items.MAHOGANY_LOGS)
                .addTag(REOTags.Items.MAPLE_LOGS).addTag(REOTags.Items.PALM_LOGS).addTag(REOTags.Items.PAPAYA_LOGS)
                .addTag(REOTags.Items.PINE_LOGS).addTag(REOTags.Items.PLUM_LOGS).addTag(REOTags.Items.POPLAR_LOGS)
                .addTag(REOTags.Items.REDWOOD_LOGS).addTag(REOTags.Items.RUBBER_LOGS).addTag(REOTags.Items.TEAK_LOGS)
                .addTag(REOTags.Items.WALNUT_LOGS).addTag(REOTags.Items.WILLOW_LOGS)
                .addTag(REOTags.Items.VANILLA_RESISTANT_LOGS);

        // Vanilla
        this.tag(ItemTags.GOLD_ORES)
                .add(REOBlocks.GRAVEL_ORE_GOLD.get().asItem());
        this.tag(ItemTags.IRON_ORES)
                .add(REOBlocks.GRAVEL_ORE_IRON.get().asItem()).add(REOBlocks.NETHER_IRON.get().asItem());
        this.tag(ItemTags.DIAMOND_ORES)
                .add(REOBlocks.GRAVEL_ORE_DIAMOND.get().asItem()).add(REOBlocks.NETHER_DIAMOND.get().asItem());
        this.tag(ItemTags.REDSTONE_ORES)
                .add(REOBlocks.GRAVEL_ORE_REDSTONE.get().asItem()).add(REOBlocks.NETHER_REDSTONE.get().asItem());
        this.tag(ItemTags.LAPIS_ORES)
                .add(REOBlocks.GRAVEL_ORE_LAPIS.get().asItem()).add(REOBlocks.NETHER_LAPIS.get().asItem());
        this.tag(ItemTags.COAL_ORES)
                .add(REOBlocks.GRAVEL_ORE_COAL.get().asItem()).add(REOBlocks.NETHER_COAL.get().asItem());
        this.tag(ItemTags.EMERALD_ORES)
                .add(REOBlocks.GRAVEL_ORE_EMERALD.get().asItem()).add(REOBlocks.NETHER_EMERALD.get().asItem());
        this.tag(ItemTags.COPPER_ORES)
                .add(REOBlocks.GRAVEL_ORE_COPPER.get().asItem()).add(REOBlocks.NETHER_COPPER.get().asItem());

        // Modded
        this.tag(REOTags.Items.ALUMINIUM_ORES)
                .add(REOBlocks.ORE_ALUMINIUM.get().asItem()).add(REOBlocks.DEEPSLATE_ALUMINIUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get().asItem()).add(REOBlocks.NETHER_ALUMINIUM.get().asItem());
        this.tag(REOTags.Items.LEAD_ORES)
                .add(REOBlocks.ORE_LEAD.get().asItem()).add(REOBlocks.DEEPSLATE_LEAD.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_LEAD.get().asItem()).add(REOBlocks.NETHER_LEAD.get().asItem());
        this.tag(REOTags.Items.NICKEL_ORES)
                .add(REOBlocks.ORE_NICKEL.get().asItem()).add(REOBlocks.DEEPSLATE_NICKEL.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_NICKEL.get().asItem()).add(REOBlocks.NETHER_NICKEL.get().asItem());
        this.tag(REOTags.Items.PLATINUM_ORES)
                .add(REOBlocks.ORE_PLATINUM.get().asItem()).add(REOBlocks.DEEPSLATE_PLATINUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_PLATINUM.get().asItem()).add(REOBlocks.NETHER_PLATINUM.get().asItem());
        this.tag(REOTags.Items.SILVER_ORES)
                .add(REOBlocks.ORE_SILVER.get().asItem()).add(REOBlocks.DEEPSLATE_SILVER.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_SILVER.get().asItem()).add(REOBlocks.NETHER_SILVER.get().asItem());
        this.tag(REOTags.Items.TIN_ORES)
                .add(REOBlocks.ORE_TIN.get().asItem()).add(REOBlocks.GRAVEL_ORE_TIN.get().asItem())
                .add(REOBlocks.NETHER_TIN.get().asItem());
        this.tag(REOTags.Items.URANIUM_ORES)
                .add(REOBlocks.ORE_URANIUM.get().asItem()).add(REOBlocks.DEEPSLATE_URANIUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_URANIUM.get().asItem()).add(REOBlocks.NETHER_URANIUM.get().asItem());
        this.tag(REOTags.Items.ZINC_ORES)
                .add(REOBlocks.ORE_ZINC.get().asItem()).add(REOBlocks.DEEPSLATE_ZINC.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_ZINC.get().asItem()).add(REOBlocks.NETHER_ZINC.get().asItem());


        // Tech //
        // Gear
        this.tag(REOTags.Items.GEM_GEAR_TIER)
                .add(REOItems.GEAR_DIAMOND.get(), REOItems.GEAR_EMERALD.get(), REOItems.GEAR_AMETHYST.get(),
                        REOItems.GEAR_PERIDOT.get(), REOItems.GEAR_RUBY.get(), REOItems.GEAR_SAPPHIRE.get());

        // Dust
        this.tag(REOTags.Items.ALUMINIUM_DUSTS)
                .add(REOItems.DUST_ALUMINIUM.get(), REOItems.DIRTY_ALUMINIUM.get());
        this.tag(REOTags.Items.AMETHYST_DUSTS)
                .add(REOItems.DUST_AMETHYST.get(), REOItems.DIRTY_AMETHYST.get());
        this.tag(REOTags.Items.BRASS_DUSTS)
                .add(REOItems.DUST_BRASS.get(), REOItems.DIRTY_BRASS.get());
        this.tag(REOTags.Items.BRONZE_DUSTS)
                .add(REOItems.DUST_BRONZE.get(), REOItems.DIRTY_BRONZE.get());
        this.tag(REOTags.Items.COPPER_DUSTS)
                .add(REOItems.DUST_COPPER.get(), REOItems.DIRTY_COPPER.get());
        this.tag(REOTags.Items.DIAMOND_DUSTS)
                .add(REOItems.DUST_DIAMOND.get(), REOItems.DIRTY_DIAMOND.get());
        this.tag(REOTags.Items.ELECTRUM_DUSTS)
                .add(REOItems.DUST_ELECTRUM.get(), REOItems.DIRTY_ELECTRUM.get());
        this.tag(REOTags.Items.EMERALD_DUSTS)
                .add(REOItems.DUST_EMERALD.get(), REOItems.DIRTY_EMERALD.get());
        this.tag(REOTags.Items.ENDERITE_DUSTS)
                .add(REOItems.DUST_ENDERITE.get(), REOItems.DIRTY_ENDERITE.get());
        this.tag(REOTags.Items.GOLD_DUSTS)
                .add(REOItems.DUST_GOLD.get(), REOItems.DIRTY_GOLD.get());
        this.tag(REOTags.Items.IRON_DUSTS)
                .add(REOItems.DUST_IRON.get(), REOItems.DIRTY_IRON.get());
        this.tag(REOTags.Items.LEAD_DUSTS)
                .add(REOItems.DUST_LEAD.get(), REOItems.DIRTY_LEAD.get());
        this.tag(REOTags.Items.NETHERITE_DUSTS)
                .add(REOItems.DUST_NETHERITE.get(), REOItems.DIRTY_NETHERITE.get());
        this.tag(REOTags.Items.NICKEL_DUSTS)
                .add(REOItems.DUST_NICKEL.get(), REOItems.DIRTY_NICKEL.get());
        this.tag(REOTags.Items.OBSIDIAN_DUSTS)
                .add(REOItems.DUST_OBSIDIAN.get(), REOItems.DIRTY_OBSIDIAN.get());
        this.tag(REOTags.Items.PERIDOT_DUSTS)
                .add(REOItems.DUST_PERIDOT.get(), REOItems.DIRTY_PERIDOT.get());
        this.tag(REOTags.Items.PLATINUM_DUSTS)
                .add(REOItems.DUST_PLATINUM.get(), REOItems.DIRTY_PLATINUM.get());
        this.tag(REOTags.Items.RUBY_DUSTS)
                .add(REOItems.DUST_RUBY.get(), REOItems.DIRTY_RUBY.get());
        this.tag(REOTags.Items.SAPPHIRE_DUSTS)
                .add(REOItems.DUST_SAPPHIRE.get(), REOItems.DIRTY_SAPPHIRE.get());
        this.tag(REOTags.Items.SILVER_DUSTS)
                .add(REOItems.DUST_SILVER.get(), REOItems.DIRTY_SILVER.get());
        this.tag(REOTags.Items.STEEL_DUSTS)
                .add(REOItems.DUST_STEEL.get(), REOItems.DIRTY_STEEL.get());
        this.tag(REOTags.Items.TIN_DUSTS)
                .add(REOItems.DUST_TIN.get(), REOItems.DIRTY_TIN.get());
        this.tag(REOTags.Items.URANIUM_DUSTS)
                .add(REOItems.DUST_URANIUM.get(), REOItems.DIRTY_URANIUM.get());
        this.tag(REOTags.Items.ZINC_DUSTS)
                .add(REOItems.DUST_ZINC.get(), REOItems.DIRTY_ZINC.get());

        this.tag(REOTags.Items.ALUMINIUM_TOOLS_AND_ARMOR)
                .add(REOItems.ALUMINIUM_AXE.get(), REOItems.ALUMINIUM_BOW.get(), REOItems.ALUMINIUM_EXCAVATOR.get(),
                        REOItems.ALUMINIUM_HAMMER.get(), REOItems.ALUMINIUM_HATCHET.get(), REOItems.ALUMINIUM_HOE.get(),
                        REOItems.ALUMINIUM_PAXEL.get(), REOItems.ALUMINIUM_PICKAXE.get(), REOItems.ALUMINIUM_SHEARS.get(),
                        REOItems.ALUMINIUM_SHOVEL.get(), REOItems.ALUMINIUM_SICKLE.get(), REOItems.ALUMINIUM_SWORD.get(),
                        REOItems.ALUMINIUM_HELMET.get(), REOItems.ALUMINIUM_CHESTPLATE.get(), REOItems.ALUMINIUM_LEGGINGS.get(),
                        REOItems.ALUMINIUM_BOOTS.get());

        this.tag(REOTags.Items.AMETHYST_TOOLS_AND_ARMOR)
                .add(REOItems.AMETHYST_AXE.get(), REOItems.AMETHYST_BOW.get(), REOItems.AMETHYST_EXCAVATOR.get(),
                        REOItems.AMETHYST_HAMMER.get(), REOItems.AMETHYST_HATCHET.get(), REOItems.AMETHYST_HOE.get(),
                        REOItems.AMETHYST_PAXEL.get(), REOItems.AMETHYST_PICKAXE.get(), REOItems.AMETHYST_SHEARS.get(),
                        REOItems.AMETHYST_SHOVEL.get(), REOItems.AMETHYST_SICKLE.get(), REOItems.AMETHYST_SWORD.get(),
                        REOItems.AMETHYST_HELMET.get(), REOItems.AMETHYST_CHESTPLATE.get(), REOItems.AMETHYST_LEGGINGS.get(),
                        REOItems.AMETHYST_BOOTS.get());

        this.tag(REOTags.Items.BRONZE_TOOLS_AND_ARMOR)
                .add(REOItems.BRONZE_AXE.get(), REOItems.BRONZE_BOW.get(), REOItems.BRONZE_EXCAVATOR.get(),
                        REOItems.BRONZE_HAMMER.get(), REOItems.BRONZE_HATCHET.get(), REOItems.BRONZE_HOE.get(),
                        REOItems.BRONZE_PAXEL.get(), REOItems.BRONZE_PICKAXE.get(), REOItems.BRONZE_SHEARS.get(),
                        REOItems.BRONZE_SHOVEL.get(), REOItems.BRONZE_SICKLE.get(), REOItems.BRONZE_SWORD.get(),
                        REOItems.BRONZE_HELMET.get(), REOItems.BRONZE_CHESTPLATE.get(), REOItems.BRONZE_LEGGINGS.get(),
                        REOItems.BRONZE_BOOTS.get());

        this.tag(REOTags.Items.DIAMOND_TOOLS_AND_ARMOR)
                .add(Items.DIAMOND_AXE, REOItems.DIAMOND_BOW.get(), REOItems.DIAMOND_EXCAVATOR.get(),
                        REOItems.DIAMOND_HAMMER.get(), REOItems.DIAMOND_HATCHET.get(), Items.DIAMOND_HOE,
                        REOItems.DIAMOND_PAXEL.get(), Items.DIAMOND_PICKAXE, REOItems.DIAMOND_SHEARS.get(),
                        Items.DIAMOND_SHOVEL, REOItems.DIAMOND_SICKLE.get(), Items.DIAMOND_SWORD,
                        Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS,
                        Items.DIAMOND_BOOTS);

        this.tag(REOTags.Items.ENDERITE_TOOLS_AND_ARMOR)
                .add(REOItems.ENDERITE_AXE.get(), REOItems.ENDERITE_BOW.get(), REOItems.ENDERITE_EXCAVATOR.get(),
                        REOItems.ENDERITE_HAMMER.get(), REOItems.ENDERITE_HATCHET.get(), REOItems.ENDERITE_HOE.get(),
                        REOItems.ENDERITE_PAXEL.get(), REOItems.ENDERITE_PICKAXE.get(), REOItems.ENDERITE_SHEARS.get(),
                        REOItems.ENDERITE_SHOVEL.get(), REOItems.ENDERITE_SICKLE.get(), REOItems.ENDERITE_SWORD.get(),
                        REOItems.ENDERITE_HELMET.get(), REOItems.ENDERITE_CHESTPLATE.get(), REOItems.ENDERITE_LEGGINGS.get(),
                        REOItems.ENDERITE_BOOTS.get());

        this.tag(REOTags.Items.GOLD_TOOLS_AND_ARMOR)
                .add(Items.GOLDEN_AXE, REOItems.GOLDEN_BOW.get(), REOItems.GOLDEN_EXCAVATOR.get(),
                        REOItems.GOLDEN_HAMMER.get(), REOItems.GOLDEN_HATCHET.get(), Items.GOLDEN_HOE,
                        REOItems.GOLDEN_PAXEL.get(), Items.GOLDEN_PICKAXE, REOItems.GOLDEN_SHEARS.get(),
                        Items.GOLDEN_SHOVEL, REOItems.GOLDEN_SICKLE.get(), Items.GOLDEN_SWORD,
                        Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS,
                        Items.GOLDEN_BOOTS);

        this.tag(REOTags.Items.IRON_TOOLS_AND_ARMOR)
                .add(Items.IRON_AXE, REOItems.IRON_BOW.get(), REOItems.IRON_EXCAVATOR.get(),
                        REOItems.IRON_HAMMER.get(), REOItems.IRON_HATCHET.get(), Items.IRON_HOE,
                        REOItems.IRON_PAXEL.get(), Items.IRON_PICKAXE, Items.SHEARS,
                        Items.IRON_SHOVEL, REOItems.IRON_SICKLE.get(), Items.IRON_SWORD,
                        Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                        Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS);

        this.tag(REOTags.Items.NETHERITE_TOOLS_AND_ARMOR)
                .add(Items.NETHERITE_AXE, REOItems.NETHERITE_BOW.get(), REOItems.NETHERITE_EXCAVATOR.get(),
                        REOItems.NETHERITE_HAMMER.get(), REOItems.NETHERITE_HATCHET.get(), Items.NETHERITE_HOE,
                        REOItems.NETHERITE_PAXEL.get(), Items.NETHERITE_PICKAXE, REOItems.NETHERITE_SHEARS.get(),
                        Items.NETHERITE_SHOVEL, REOItems.NETHERITE_SICKLE.get(), Items.NETHERITE_SWORD,
                        Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS,
                        Items.NETHERITE_BOOTS);

        this.tag(REOTags.Items.PERIDOT_TOOLS_AND_ARMOR)
                .add(REOItems.PERIDOT_AXE.get(), REOItems.PERIDOT_BOW.get(), REOItems.PERIDOT_EXCAVATOR.get(),
                        REOItems.PERIDOT_HAMMER.get(), REOItems.PERIDOT_HATCHET.get(), REOItems.PERIDOT_HOE.get(),
                        REOItems.PERIDOT_PAXEL.get(), REOItems.PERIDOT_PICKAXE.get(), REOItems.PERIDOT_SHEARS.get(),
                        REOItems.PERIDOT_SHOVEL.get(), REOItems.PERIDOT_SICKLE.get(), REOItems.PERIDOT_SWORD.get(),
                        REOItems.PERIDOT_HELMET.get(), REOItems.PERIDOT_CHESTPLATE.get(), REOItems.PERIDOT_LEGGINGS.get(),
                        REOItems.PERIDOT_BOOTS.get());

        this.tag(REOTags.Items.PLATINUM_TOOLS_AND_ARMOR)
                .add(REOItems.PLATINUM_AXE.get(), REOItems.PLATINUM_BOW.get(), REOItems.PLATINUM_EXCAVATOR.get(),
                        REOItems.PLATINUM_HAMMER.get(), REOItems.PLATINUM_HATCHET.get(), REOItems.PLATINUM_HOE.get(),
                        REOItems.PLATINUM_PAXEL.get(), REOItems.PLATINUM_PICKAXE.get(), REOItems.PLATINUM_SHEARS.get(),
                        REOItems.PLATINUM_SHOVEL.get(), REOItems.PLATINUM_SICKLE.get(), REOItems.PLATINUM_SWORD.get(),
                        REOItems.PLATINUM_HELMET.get(), REOItems.PLATINUM_CHESTPLATE.get(), REOItems.PLATINUM_LEGGINGS.get(),
                        REOItems.PLATINUM_BOOTS.get());

        this.tag(REOTags.Items.RUBY_TOOLS_AND_ARMOR)
                .add(REOItems.RUBY_AXE.get(), REOItems.RUBY_BOW.get(), REOItems.RUBY_EXCAVATOR.get(),
                        REOItems.RUBY_HAMMER.get(), REOItems.RUBY_HATCHET.get(), REOItems.RUBY_HOE.get(),
                        REOItems.RUBY_PAXEL.get(), REOItems.RUBY_PICKAXE.get(), REOItems.RUBY_SHEARS.get(),
                        REOItems.RUBY_SHOVEL.get(), REOItems.RUBY_SICKLE.get(), REOItems.RUBY_SWORD.get(),
                        REOItems.RUBY_HELMET.get(), REOItems.RUBY_CHESTPLATE.get(), REOItems.RUBY_LEGGINGS.get(),
                        REOItems.RUBY_BOOTS.get());

        this.tag(REOTags.Items.SAPPHIRE_TOOLS_AND_ARMOR)
                .add(REOItems.SAPPHIRE_AXE.get(), REOItems.SAPPHIRE_BOW.get(), REOItems.SAPPHIRE_EXCAVATOR.get(),
                        REOItems.SAPPHIRE_HAMMER.get(), REOItems.SAPPHIRE_HATCHET.get(), REOItems.SAPPHIRE_HOE.get(),
                        REOItems.SAPPHIRE_PAXEL.get(), REOItems.SAPPHIRE_PICKAXE.get(), REOItems.SAPPHIRE_SHEARS.get(),
                        REOItems.SAPPHIRE_SHOVEL.get(), REOItems.SAPPHIRE_SICKLE.get(), REOItems.SAPPHIRE_SWORD.get(),
                        REOItems.SAPPHIRE_HELMET.get(), REOItems.SAPPHIRE_CHESTPLATE.get(), REOItems.SAPPHIRE_LEGGINGS.get(),
                        REOItems.SAPPHIRE_BOOTS.get());

        this.tag(REOTags.Items.SILVER_TOOLS_AND_ARMOR)
                .add(REOItems.SILVER_AXE.get(), REOItems.SILVER_BOW.get(), REOItems.SILVER_EXCAVATOR.get(),
                        REOItems.SILVER_HAMMER.get(), REOItems.SILVER_HATCHET.get(), REOItems.SILVER_HOE.get(),
                        REOItems.SILVER_PAXEL.get(), REOItems.SILVER_PICKAXE.get(), REOItems.SILVER_SHEARS.get(),
                        REOItems.SILVER_SHOVEL.get(), REOItems.SILVER_SICKLE.get(), REOItems.SILVER_SWORD.get(),
                        REOItems.SILVER_HELMET.get(), REOItems.SILVER_CHESTPLATE.get(), REOItems.SILVER_LEGGINGS.get(),
                        REOItems.SILVER_BOOTS.get());

        this.tag(REOTags.Items.STEEL_TOOLS_AND_ARMOR)
                .add(REOItems.STEEL_AXE.get(), REOItems.STEEL_BOW.get(), REOItems.STEEL_EXCAVATOR.get(),
                        REOItems.STEEL_HAMMER.get(), REOItems.STEEL_HATCHET.get(), REOItems.STEEL_HOE.get(),
                        REOItems.STEEL_PAXEL.get(), REOItems.STEEL_PICKAXE.get(), REOItems.STEEL_SHEARS.get(),
                        REOItems.STEEL_SHOVEL.get(), REOItems.STEEL_SICKLE.get(), REOItems.STEEL_SWORD.get(),
                        REOItems.STEEL_HELMET.get(), REOItems.STEEL_CHESTPLATE.get(), REOItems.STEEL_LEGGINGS.get(),
                        REOItems.STEEL_BOOTS.get());

    }
}