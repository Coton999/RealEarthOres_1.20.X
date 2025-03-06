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
                        REOBlocks.LOG_BALSA_RESISTANT.get().asItem(),REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_BALSA.get().asItem(),REOBlocks.WOOD_BALSA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_BALSA_RESISTANT.get().asItem(),REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.BAOBAB_LOGS)
                .add(REOBlocks.LOG_BAOBAB.get().asItem(),REOBlocks.LOG_BAOBAB_STRIPPED.get().asItem(),
                        REOBlocks.LOG_BAOBAB_RESISTANT.get().asItem(),REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_BAOBAB.get().asItem(),REOBlocks.WOOD_BAOBAB_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_BAOBAB_RESISTANT.get().asItem(),REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.HILL_CHERRY_LOGS)
                .add(REOBlocks.LOG_HILL_CHERRY.get().asItem(),REOBlocks.LOG_HILL_CHERRY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_HILL_CHERRY_RESISTANT.get().asItem(),REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_HILL_CHERRY.get().asItem(),REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get().asItem(),REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.CHESTNUT_LOGS)
                .add(REOBlocks.LOG_CHESTNUT.get().asItem(),REOBlocks.LOG_CHESTNUT_STRIPPED.get().asItem(),
                        REOBlocks.LOG_CHESTNUT_RESISTANT.get().asItem(),REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_CHESTNUT.get().asItem(),REOBlocks.WOOD_CHESTNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CHESTNUT_RESISTANT.get().asItem(),REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.CITRUS_LOGS)
                .add(REOBlocks.LOG_CITRUS.get().asItem(),REOBlocks.LOG_CITRUS_STRIPPED.get().asItem(),
                        REOBlocks.LOG_CITRUS_RESISTANT.get().asItem(),REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_CITRUS.get().asItem(),REOBlocks.WOOD_CITRUS_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_CITRUS_RESISTANT.get().asItem(),REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.EBONY_LOGS)
                .add(REOBlocks.LOG_EBONY.get().asItem(),REOBlocks.LOG_EBONY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_EBONY_RESISTANT.get().asItem(),REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_EBONY.get().asItem(),REOBlocks.WOOD_EBONY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_EBONY_RESISTANT.get().asItem(),REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.LARCH_LOGS)
                .add(REOBlocks.LOG_LARCH.get().asItem(),REOBlocks.LOG_LARCH_STRIPPED.get().asItem(),
                        REOBlocks.LOG_LARCH_RESISTANT.get().asItem(),REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_LARCH.get().asItem(),REOBlocks.WOOD_LARCH_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_LARCH_RESISTANT.get().asItem(),REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.MAHOGANY_LOGS)
                .add(REOBlocks.LOG_MAHOGANY.get().asItem(),REOBlocks.LOG_MAHOGANY_STRIPPED.get().asItem(),
                        REOBlocks.LOG_MAHOGANY_RESISTANT.get().asItem(),REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_MAHOGANY.get().asItem(),REOBlocks.WOOD_MAHOGANY_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAHOGANY_RESISTANT.get().asItem(),REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.MAPLE_LOGS)
                .add(REOBlocks.LOG_MAPLE.get().asItem(),REOBlocks.LOG_MAPLE_STRIPPED.get().asItem(),
                        REOBlocks.LOG_MAPLE_RESISTANT.get().asItem(),REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_MAPLE.get().asItem(),REOBlocks.WOOD_MAPLE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_MAPLE_RESISTANT.get().asItem(),REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.PALM_LOGS)
                .add(REOBlocks.LOG_PALM.get().asItem(),REOBlocks.LOG_PALM_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PALM_RESISTANT.get().asItem(),REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_PALM.get().asItem(),REOBlocks.WOOD_PALM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PALM_RESISTANT.get().asItem(),REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.PAPAYA_LOGS)
                .add(REOBlocks.LOG_PAPAYA.get().asItem(),REOBlocks.LOG_PAPAYA_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PAPAYA_RESISTANT.get().asItem(),REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_PAPAYA.get().asItem(),REOBlocks.WOOD_PAPAYA_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PAPAYA_RESISTANT.get().asItem(),REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.PINE_LOGS)
                .add(REOBlocks.LOG_PINE.get().asItem(),REOBlocks.LOG_PINE_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PINE_RESISTANT.get().asItem(),REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_PINE.get().asItem(),REOBlocks.WOOD_PINE_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PINE_RESISTANT.get().asItem(),REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.PLUM_LOGS)
                .add(REOBlocks.LOG_PLUM.get().asItem(),REOBlocks.LOG_PLUM_STRIPPED.get().asItem(),
                        REOBlocks.LOG_PLUM_RESISTANT.get().asItem(),REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_PLUM.get().asItem(),REOBlocks.WOOD_PLUM_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_PLUM_RESISTANT.get().asItem(),REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.POPLAR_LOGS)
                .add(REOBlocks.LOG_POPLAR.get().asItem(),REOBlocks.LOG_POPLAR_STRIPPED.get().asItem(),
                        REOBlocks.LOG_POPLAR_RESISTANT.get().asItem(),REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_POPLAR.get().asItem(),REOBlocks.WOOD_POPLAR_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_POPLAR_RESISTANT.get().asItem(),REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.REDWOOD_LOGS)
                .add(REOBlocks.LOG_REDWOOD.get().asItem(),REOBlocks.LOG_REDWOOD_STRIPPED.get().asItem(),
                        REOBlocks.LOG_REDWOOD_RESISTANT.get().asItem(),REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_REDWOOD.get().asItem(),REOBlocks.WOOD_REDWOOD_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_REDWOOD_RESISTANT.get().asItem(),REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.RUBBER_LOGS)
                .add(REOBlocks.LOG_RUBBER.get().asItem(),REOBlocks.LOG_RUBBER_STRIPPED.get().asItem(),
                        REOBlocks.LOG_RUBBER_RESISTANT.get().asItem(),REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_RUBBER.get().asItem(),REOBlocks.WOOD_RUBBER_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_RUBBER_RESISTANT.get().asItem(),REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.TEAK_LOGS)
                .add(REOBlocks.LOG_TEAK.get().asItem(),REOBlocks.LOG_TEAK_STRIPPED.get().asItem(),
                        REOBlocks.LOG_TEAK_RESISTANT.get().asItem(),REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_TEAK.get().asItem(),REOBlocks.WOOD_TEAK_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_TEAK_RESISTANT.get().asItem(),REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.WALNUT_LOGS)
                .add(REOBlocks.LOG_WALNUT.get().asItem(),REOBlocks.LOG_WALNUT_STRIPPED.get().asItem(),
                        REOBlocks.LOG_WALNUT_RESISTANT.get().asItem(),REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_WALNUT.get().asItem(),REOBlocks.WOOD_WALNUT_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WALNUT_RESISTANT.get().asItem(),REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get().asItem());

        this.tag(REOTags.Items.WILLOW_LOGS)
                .add(REOBlocks.LOG_WILLOW.get().asItem(),REOBlocks.LOG_WILLOW_STRIPPED.get().asItem(),
                        REOBlocks.LOG_WILLOW_RESISTANT.get().asItem(),REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get().asItem(),
                        REOBlocks.WOOD_WILLOW.get().asItem(),REOBlocks.WOOD_WILLOW_STRIPPED.get().asItem(),
                        REOBlocks.WOOD_WILLOW_RESISTANT.get().asItem(),REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get().asItem());

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
                .addTag(REOTags.Items.LARCH_LOGS).addTag(REOTags.Items.MAHOGANY_LOGS).addTag(REOTags.Items.MAPLE_LOGS)
                .addTag(REOTags.Items.PALM_LOGS).addTag(REOTags.Items.PAPAYA_LOGS).addTag(REOTags.Items.PINE_LOGS)
                .addTag(REOTags.Items.PLUM_LOGS).addTag(REOTags.Items.POPLAR_LOGS).addTag(REOTags.Items.REDWOOD_LOGS)
                .addTag(REOTags.Items.RUBBER_LOGS).addTag(REOTags.Items.TEAK_LOGS).addTag(REOTags.Items.WALNUT_LOGS)
                .addTag(REOTags.Items.WILLOW_LOGS).addTag(REOTags.Items.VANILLA_RESISTANT_LOGS);


        // Tech //
        // Gear
        this.tag(REOTags.Items.GEM_GEAR_TIER)
                .add(REOItems.GEAR_DIAMOND.get(), REOItems.GEAR_EMERALD.get(), REOItems.GEAR_AMETHYST.get(),
                        REOItems.GEAR_PERIDOT.get(), REOItems.GEAR_RUBY.get(), REOItems.GEAR_SAPPHIRE.get());
    }
}