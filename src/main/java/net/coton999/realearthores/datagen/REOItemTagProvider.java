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

        // Ores
        this.tag(REOTags.Items.REO_ORES).add(REOBlocks.ORE_ALUMINIUM.get().asItem(), REOBlocks.ORE_LEAD.get().asItem(),
                REOBlocks.ORE_NICKEL.get().asItem(), REOBlocks.ORE_PLATINUM.get().asItem(), REOBlocks.ORE_SILVER.get().asItem(),
                REOBlocks.ORE_TIN.get().asItem(), REOBlocks.ORE_URANIUM.get().asItem(), REOBlocks.ORE_ZINC.get().asItem());

        this.tag(REOTags.Items.REO_DEEPSLATE_ORES).add(REOBlocks.DEEPSLATE_ALUMINIUM.get().asItem(), REOBlocks.DEEPSLATE_LEAD.get().asItem(),
                REOBlocks.DEEPSLATE_NICKEL.get().asItem(), REOBlocks.DEEPSLATE_PLATINUM.get().asItem(),
                REOBlocks.DEEPSLATE_SILVER.get().asItem(), REOBlocks.DEEPSLATE_URANIUM.get().asItem(), REOBlocks.DEEPSLATE_ZINC.get().asItem());

        this.tag(REOTags.Items.REO_GRAVEL_ORES).add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get().asItem(), REOBlocks.GRAVEL_ORE_LEAD.get().asItem(),
                REOBlocks.GRAVEL_ORE_NICKEL.get().asItem(), REOBlocks.GRAVEL_ORE_PLATINUM.get().asItem(),
                REOBlocks.GRAVEL_ORE_SILVER.get().asItem(), REOBlocks.GRAVEL_ORE_TIN.get().asItem(),
                REOBlocks.GRAVEL_ORE_URANIUM.get().asItem(), REOBlocks.GRAVEL_ORE_ZINC.get().asItem());

        this.tag(REOTags.Items.REO_NETHER_ORES).add(REOBlocks.NETHER_ALUMINIUM.get().asItem(), REOBlocks.NETHER_LEAD.get().asItem(),
                REOBlocks.NETHER_NICKEL.get().asItem(), REOBlocks.NETHER_PLATINUM.get().asItem(),
                REOBlocks.NETHER_SILVER.get().asItem(), REOBlocks.NETHER_TIN.get().asItem(),
                REOBlocks.NETHER_URANIUM.get().asItem(), REOBlocks.NETHER_ZINC.get().asItem());

        this.tag(REOTags.Items.REO_END_ORES).add(REOBlocks.ORE_ENDERITE.get().asItem());

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
        this.tag(REOTags.Items.ORES_ALUMINUM)
                .add(REOBlocks.ORE_ALUMINIUM.get().asItem()).add(REOBlocks.DEEPSLATE_ALUMINIUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get().asItem()).add(REOBlocks.NETHER_ALUMINIUM.get().asItem());
        this.tag(REOTags.Items.ORES_LEAD)
                .add(REOBlocks.ORE_LEAD.get().asItem()).add(REOBlocks.DEEPSLATE_LEAD.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_LEAD.get().asItem()).add(REOBlocks.NETHER_LEAD.get().asItem());
        this.tag(REOTags.Items.ORES_NICKEL)
                .add(REOBlocks.ORE_NICKEL.get().asItem()).add(REOBlocks.DEEPSLATE_NICKEL.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_NICKEL.get().asItem()).add(REOBlocks.NETHER_NICKEL.get().asItem());
        this.tag(REOTags.Items.ORES_PLATINUM)
                .add(REOBlocks.ORE_PLATINUM.get().asItem()).add(REOBlocks.DEEPSLATE_PLATINUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_PLATINUM.get().asItem()).add(REOBlocks.NETHER_PLATINUM.get().asItem());
        this.tag(REOTags.Items.ORES_SILVER)
                .add(REOBlocks.ORE_SILVER.get().asItem()).add(REOBlocks.DEEPSLATE_SILVER.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_SILVER.get().asItem()).add(REOBlocks.NETHER_SILVER.get().asItem());
        this.tag(REOTags.Items.ORES_TIN)
                .add(REOBlocks.ORE_TIN.get().asItem()).add(REOBlocks.GRAVEL_ORE_TIN.get().asItem())
                .add(REOBlocks.NETHER_TIN.get().asItem());
        this.tag(REOTags.Items.ORES_URANIUM)
                .add(REOBlocks.ORE_URANIUM.get().asItem()).add(REOBlocks.DEEPSLATE_URANIUM.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_URANIUM.get().asItem()).add(REOBlocks.NETHER_URANIUM.get().asItem());
        this.tag(REOTags.Items.ORES_ZINC)
                .add(REOBlocks.ORE_ZINC.get().asItem()).add(REOBlocks.DEEPSLATE_ZINC.get().asItem())
                .add(REOBlocks.GRAVEL_ORE_ZINC.get().asItem()).add(REOBlocks.NETHER_ZINC.get().asItem());

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
        this.tag(REOTags.Items.GEARS_TIER_GEM)
                .add(REOItems.DIAMOND_GEAR.get(), REOItems.EMERALD_GEAR.get(), REOItems.AMETHYST_GEAR.get(),
                        REOItems.PERIDOT_GEAR.get(), REOItems.RUBY_GEAR.get(), REOItems.SAPPHIRE_GEAR.get());

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
                REOItems.BRONZE_AXE.get(), REOItems.ENDERITE_AXE.get(),REOItems.PERIDOT_AXE.get(),
                REOItems.PLATINUM_AXE.get(),REOItems.RUBY_AXE.get(),REOItems.SAPPHIRE_AXE.get(),
                REOItems.SILVER_AXE.get(),REOItems.STEEL_AXE.get());

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
                REOItems.BRONZE_HOE.get(), REOItems.ENDERITE_HOE.get(),REOItems.PERIDOT_HOE.get(),
                REOItems.PLATINUM_HOE.get(),REOItems.RUBY_HOE.get(),REOItems.SAPPHIRE_HOE.get(),
                REOItems.SILVER_HOE.get(),REOItems.STEEL_HOE.get());

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
                REOItems.BRONZE_PICKAXE.get(), REOItems.ENDERITE_PICKAXE.get(),REOItems.PERIDOT_PICKAXE.get(),
                REOItems.PLATINUM_PICKAXE.get(),REOItems.RUBY_PICKAXE.get(),REOItems.SAPPHIRE_PICKAXE.get(),
                REOItems.SILVER_PICKAXE.get(),REOItems.STEEL_PICKAXE.get());

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
                REOItems.BRONZE_SHOVEL.get(), REOItems.ENDERITE_SHOVEL.get(),REOItems.PERIDOT_SHOVEL.get(),
                REOItems.PLATINUM_SHOVEL.get(),REOItems.RUBY_SHOVEL.get(),REOItems.SAPPHIRE_SHOVEL.get(),
                REOItems.SILVER_SHOVEL.get(),REOItems.STEEL_SHOVEL.get());

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
                REOItems.BRONZE_SWORD.get(), REOItems.ENDERITE_SWORD.get(),REOItems.PERIDOT_SWORD.get(),
                REOItems.PLATINUM_SWORD.get(),REOItems.RUBY_SWORD.get(),REOItems.SAPPHIRE_SWORD.get(),
                REOItems.SILVER_SWORD.get(),REOItems.STEEL_SWORD.get());

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