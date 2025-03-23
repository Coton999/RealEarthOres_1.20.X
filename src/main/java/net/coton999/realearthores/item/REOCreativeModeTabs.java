package net.coton999.realearthores.item;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class REOCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RealEarthOres.MOD_ID);

public static RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("realearthores_items",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(REOItems.RAW_URANIUM.get()))
                .title(Component.translatable("tabs.realearthores_items"))
                .displayItems((pParameters, pOutput) -> {

                    // Items //
                    // Raw Ore
                    pOutput.accept(REOItems.RAW_ALUMINIUM.get());
                    pOutput.accept(REOItems.RAW_ENDERITE.get());
                    pOutput.accept(REOItems.RAW_LEAD.get());
                    pOutput.accept(REOItems.RAW_NICKEL.get());
                    pOutput.accept(REOItems.RAW_PLATINUM.get());
                    pOutput.accept(REOItems.RAW_SILVER.get());
                    pOutput.accept(REOItems.RAW_TIN.get());
                    pOutput.accept(REOItems.RAW_URANIUM.get());
                    pOutput.accept(REOItems.RAW_ZINC.get());

                    // Ingot
                    pOutput.accept(REOItems.INGOT_ALUMINIUM.get());
                    pOutput.accept(REOItems.INGOT_BRASS.get());
                    pOutput.accept(REOItems.INGOT_BRONZE.get());
                    pOutput.accept(REOItems.INGOT_ELECTRUM.get());
                    pOutput.accept(REOItems.INGOT_ENDERITE.get());
                    pOutput.accept(REOItems.INGOT_LEAD.get());
                    pOutput.accept(REOItems.INGOT_NICKEL.get());
                    pOutput.accept(REOItems.INGOT_PLATINUM.get());
                    pOutput.accept(REOItems.INGOT_SILVER.get());
                    pOutput.accept(REOItems.INGOT_STEEL.get());
                    pOutput.accept(REOItems.INGOT_TIN.get());
                    pOutput.accept(REOItems.INGOT_URANIUM.get());
                    pOutput.accept(REOItems.INGOT_ZINC.get());

                    // Gem
                    pOutput.accept(REOItems.GEM_AMETHYST.get());
                    pOutput.accept(REOItems.GEM_PERIDOT.get());
                    pOutput.accept(REOItems.GEM_RUBY.get());
                    pOutput.accept(REOItems.GEM_SAPPHIRE.get());

                    // Gem Shards
                    pOutput.accept(REOItems.SHARD_PERIDOT.get());
                    pOutput.accept(REOItems.SHARD_RUBY.get());
                    pOutput.accept(REOItems.SHARD_SAPPHIRE.get());

                    // Nugget
                    pOutput.accept(REOItems.NUGGET_ALUMINIUM.get());
                    pOutput.accept(REOItems.NUGGET_AMETHYST.get());
                    pOutput.accept(REOItems.NUGGET_BRASS.get());
                    pOutput.accept(REOItems.NUGGET_BRONZE.get());
                    pOutput.accept(REOItems.NUGGET_COPPER.get());
                    pOutput.accept(REOItems.NUGGET_DIAMOND.get());
                    pOutput.accept(REOItems.NUGGET_ELECTRUM.get());
                    pOutput.accept(REOItems.NUGGET_EMERALD.get());
                    pOutput.accept(REOItems.NUGGET_ENDERITE.get());
                    pOutput.accept(REOItems.NUGGET_LEAD.get());
                    pOutput.accept(REOItems.NUGGET_NETHERITE.get());
                    pOutput.accept(REOItems.NUGGET_NICKEL.get());
                    pOutput.accept(REOItems.NUGGET_PERIDOT.get());
                    pOutput.accept(REOItems.NUGGET_PLATINUM.get());
                    pOutput.accept(REOItems.NUGGET_RUBY.get());
                    pOutput.accept(REOItems.NUGGET_SAPPHIRE.get());
                    pOutput.accept(REOItems.NUGGET_SILVER.get());
                    pOutput.accept(REOItems.NUGGET_STEEL.get());
                    pOutput.accept(REOItems.NUGGET_TIN.get());
                    pOutput.accept(REOItems.NUGGET_ZINC.get());

                    // Dust
                    pOutput.accept(REOItems.DUST_ALUMINIUM.get());
                    pOutput.accept(REOItems.DUST_AMETHYST.get());
                    pOutput.accept(REOItems.DUST_BRASS.get());
                    pOutput.accept(REOItems.DUST_BRONZE.get());
                    pOutput.accept(REOItems.DUST_CHARCOAL.get());
                    pOutput.accept(REOItems.DUST_COAL.get());
                    pOutput.accept(REOItems.DUST_COPPER.get());
                    pOutput.accept(REOItems.DUST_DIAMOND.get());
                    pOutput.accept(REOItems.DUST_ELECTRUM.get());
                    pOutput.accept(REOItems.DUST_EMERALD.get());
                    pOutput.accept(REOItems.DUST_ENDERITE.get());
                    pOutput.accept(REOItems.DUST_GOLD.get());
                    pOutput.accept(REOItems.DUST_IRON.get());
                    pOutput.accept(REOItems.DUST_LEAD.get());
                    pOutput.accept(REOItems.DUST_NICKEL.get());
                    pOutput.accept(REOItems.DUST_OBSIDIAN.get());
                    pOutput.accept(REOItems.DUST_PERIDOT.get());
                    pOutput.accept(REOItems.DUST_PLATINUM.get());
                    pOutput.accept(REOItems.DUST_RUBY.get());
                    pOutput.accept(REOItems.DUST_SAPPHIRE.get());
                    pOutput.accept(REOItems.DUST_SILVER.get());
                    pOutput.accept(REOItems.DUST_STEEL.get());
                    pOutput.accept(REOItems.DUST_TIN.get());
                    pOutput.accept(REOItems.DUST_URANIUM.get());
                    pOutput.accept(REOItems.DUST_ZINC.get());

                    // Dirty Dust
                    pOutput.accept(REOItems.DIRTY_ALUMINIUM.get());
                    pOutput.accept(REOItems.DIRTY_AMETHYST.get());
                    pOutput.accept(REOItems.DIRTY_BRASS.get());
                    pOutput.accept(REOItems.DIRTY_BRONZE.get());
                    pOutput.accept(REOItems.DIRTY_COPPER.get());
                    pOutput.accept(REOItems.DIRTY_DIAMOND.get());
                    pOutput.accept(REOItems.DIRTY_ELECTRUM.get());
                    pOutput.accept(REOItems.DIRTY_EMERALD.get());
                    pOutput.accept(REOItems.DIRTY_ENDERITE.get());
                    pOutput.accept(REOItems.DIRTY_GOLD.get());
                    pOutput.accept(REOItems.DIRTY_IRON.get());
                    pOutput.accept(REOItems.DIRTY_LEAD.get());
                    pOutput.accept(REOItems.DIRTY_NICKEL.get());
                    pOutput.accept(REOItems.DIRTY_OBSIDIAN.get());
                    pOutput.accept(REOItems.DIRTY_PERIDOT.get());
                    pOutput.accept(REOItems.DIRTY_PLATINUM.get());
                    pOutput.accept(REOItems.DIRTY_RUBY.get());
                    pOutput.accept(REOItems.DIRTY_SAPPHIRE.get());
                    pOutput.accept(REOItems.DIRTY_SILVER.get());
                    pOutput.accept(REOItems.DIRTY_STEEL.get());
                    pOutput.accept(REOItems.DIRTY_TIN.get());
                    pOutput.accept(REOItems.DIRTY_URANIUM.get());
                    pOutput.accept(REOItems.DIRTY_ZINC.get());

                    // Bucket
                    pOutput.accept(REOItems.BUCKET_MOLTEN_ALUMINIUM.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_AMETHYST.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_BRASS.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_BRONZE.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_COAL.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_COPPER.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_DIAMOND.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_ELECTRUM.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_EMERALD.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_ENDERITE.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_GOLD.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_IRON.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_LAPIS.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_LEAD.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_NICKEL.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_PERIDOT.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_PLATINUM.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_REDSTONE.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_RUBY.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_SAPPHIRE.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_SILVER.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_STEEL.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_TIN.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_URANIUM.get());
                    pOutput.accept(REOItems.BUCKET_MOLTEN_ZINC.get());

                    // Luminous Powder
                    pOutput.accept(REOItems.LUMINOUS_BLACK.get());
                    pOutput.accept(REOItems.LUMINOUS_BLUE.get());
                    pOutput.accept(REOItems.LUMINOUS_BROWN.get());
                    pOutput.accept(REOItems.LUMINOUS_CYAN.get());
                    pOutput.accept(REOItems.LUMINOUS_GRAY.get());
                    pOutput.accept(REOItems.LUMINOUS_GREEN.get());
                    pOutput.accept(REOItems.LUMINOUS_LIGHTBLUE.get());
                    pOutput.accept(REOItems.LUMINOUS_LIGHTGRAY.get());
                    pOutput.accept(REOItems.LUMINOUS_LIME.get());
                    pOutput.accept(REOItems.LUMINOUS_MAGENTA.get());
                    pOutput.accept(REOItems.LUMINOUS_ORANGE.get());
                    pOutput.accept(REOItems.LUMINOUS_PINK.get());
                    pOutput.accept(REOItems.LUMINOUS_PURPLE.get());
                    pOutput.accept(REOItems.LUMINOUS_RED.get());
                    pOutput.accept(REOItems.LUMINOUS_WHITE.get());
                    pOutput.accept(REOItems.LUMINOUS_YELLOW.get());

                    // Tech //
                    // Misc
                    pOutput.accept(REOItems.SAP.get());
                    pOutput.accept(REOItems.RESIN.get());
                    pOutput.accept(REOItems.RUBBER.get());

                    // Gear
                    pOutput.accept(REOItems.GEAR_ALUMINIUM.get());
                    pOutput.accept(REOItems.GEAR_AMETHYST.get());
                    pOutput.accept(REOItems.GEAR_BRASS.get());
                    pOutput.accept(REOItems.GEAR_BRONZE.get());
                    pOutput.accept(REOItems.GEAR_COPPER.get());
                    pOutput.accept(REOItems.GEAR_DIAMOND.get());
                    pOutput.accept(REOItems.GEAR_ELECTRUM.get());
                    pOutput.accept(REOItems.GEAR_EMERALD.get());
                    pOutput.accept(REOItems.GEAR_ENDERITE.get());
                    pOutput.accept(REOItems.GEAR_GOLDEN.get());
                    pOutput.accept(REOItems.GEAR_IRON.get());
                    pOutput.accept(REOItems.GEAR_LEAD.get());
                    pOutput.accept(REOItems.GEAR_NICKEL.get());
                    pOutput.accept(REOItems.GEAR_PLATINUM.get());
                    pOutput.accept(REOItems.GEAR_PERIDOT.get());
                    pOutput.accept(REOItems.GEAR_RUBY.get());
                    pOutput.accept(REOItems.GEAR_SAPPHIRE.get());
                    pOutput.accept(REOItems.GEAR_SILVER.get());
                    pOutput.accept(REOItems.GEAR_STEEL.get());
                    pOutput.accept(REOItems.GEAR_STONE.get());
                    pOutput.accept(REOItems.GEAR_TIN.get());
                    pOutput.accept(REOItems.GEAR_WOODEN.get());
                    pOutput.accept(REOItems.GEAR_ZINC.get());

                    // Plate
                    pOutput.accept(REOItems.PLATE_ALUMINIUM.get());
                    pOutput.accept(REOItems.PLATE_AMETHYST.get());
                    pOutput.accept(REOItems.PLATE_BRASS.get());
                    pOutput.accept(REOItems.PLATE_BRONZE.get());
                    pOutput.accept(REOItems.PLATE_COPPER.get());
                    pOutput.accept(REOItems.PLATE_DIAMOND.get());
                    pOutput.accept(REOItems.PLATE_ELECTRUM.get());
                    pOutput.accept(REOItems.PLATE_EMERALD.get());
                    pOutput.accept(REOItems.PLATE_ENDERITE.get());
                    pOutput.accept(REOItems.PLATE_GOLDEN.get());
                    pOutput.accept(REOItems.PLATE_IRON.get());
                    pOutput.accept(REOItems.PLATE_LEAD.get());
                    pOutput.accept(REOItems.PLATE_NICKEL.get());
                    pOutput.accept(REOItems.PLATE_PLATINUM.get());
                    pOutput.accept(REOItems.PLATE_PERIDOT.get());
                    pOutput.accept(REOItems.PLATE_RUBY.get());
                    pOutput.accept(REOItems.PLATE_SAPPHIRE.get());
                    pOutput.accept(REOItems.PLATE_SILVER.get());
                    pOutput.accept(REOItems.PLATE_STEEL.get());
                    pOutput.accept(REOItems.PLATE_TIN.get());
                    pOutput.accept(REOItems.PLATE_ZINC.get());


                })
                .build());

    public static RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("realearthores_blocks",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.ITEMS_TAB.getKey())
                    .icon(() -> new ItemStack(REOBlocks.BLOCK_URANIUM.get()))
                    .title(Component.translatable("tabs.realearthores_blocks"))
                    .displayItems((pParameters, pOutput) -> {

                        // Blocks //
                        // Building Blocks //
                        // Marble
                        pOutput.accept(REOBlocks.MARBLE.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_MOSSY.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK_MOSSY.get());
                        pOutput.accept(REOBlocks.MARBLE_CHISELED.get());
                        pOutput.accept(REOBlocks.MARBLE_CRACKED.get());

                        pOutput.accept(REOBlocks.MARBLE_STAIRS.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_STAIRS.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS.get());

                        pOutput.accept(REOBlocks.MARBLE_SLAB.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK_SLAB.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_SLAB.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_MOSSY_SLAB.get());

                        pOutput.accept(REOBlocks.MARBLE_WALL.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK_WALL.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_WALL.get());
                        pOutput.accept(REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get());

                        // Limestone
                        pOutput.accept(REOBlocks.LIMESTONE.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_MOSSY.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_MOSSY.get());
                        pOutput.accept(REOBlocks.LIMESTONE_CHISELED.get());
                        pOutput.accept(REOBlocks.LIMESTONE_CRACKED.get());

                        pOutput.accept(REOBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_STAIRS.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_STAIRS.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS.get());

                        pOutput.accept(REOBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_SLAB.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_SLAB.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB.get());

                        pOutput.accept(REOBlocks.LIMESTONE_WALL.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_WALL.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_WALL.get());
                        pOutput.accept(REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get());

                        // Calcite
                        pOutput.accept(REOBlocks.CALCITE_STAIRS.get());
                        pOutput.accept(REOBlocks.CALCITE_SLAB.get());
                        pOutput.accept(REOBlocks.CALCITE_WALL.get());

                        // Netherrack
                        pOutput.accept(REOBlocks.NETHERRACK_STAIRS.get());
                        pOutput.accept(REOBlocks.NETHERRACK_SLAB.get());
                        pOutput.accept(REOBlocks.NETHERRACK_WALL.get());

                        // Decorative //
                        // Lamp
                        pOutput.accept(REOBlocks.LAMP_BLACK.get());
                        pOutput.accept(REOBlocks.LAMP_RED.get());
                        pOutput.accept(REOBlocks.LAMP_GREEN.get());
                        pOutput.accept(REOBlocks.LAMP_BROWN.get());
                        pOutput.accept(REOBlocks.LAMP_PURPLE.get());
                        pOutput.accept(REOBlocks.LAMP_CYAN.get());
                        pOutput.accept(REOBlocks.LAMP_LIGHTGRAY.get());
                        pOutput.accept(REOBlocks.LAMP_GRAY.get());
                        pOutput.accept(REOBlocks.LAMP_PINK.get());
                        pOutput.accept(REOBlocks.LAMP_LIME.get());
                        pOutput.accept(REOBlocks.LAMP_YELLOW.get());
                        pOutput.accept(REOBlocks.LAMP_BLUE.get());
                        pOutput.accept(REOBlocks.LAMP_LIGHTBLUE.get());
                        pOutput.accept(REOBlocks.LAMP_MAGENTA.get());
                        pOutput.accept(REOBlocks.LAMP_ORANGE.get());
                        pOutput.accept(REOBlocks.LAMP_WHITE.get());

                        // Tree //
                        // Wood
                        // Oak
                        pOutput.accept(REOBlocks.LOG_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_OAK_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_OAK_RESISTANT.get());

                        // Spruce
                        pOutput.accept(REOBlocks.LOG_SPRUCE_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_SPRUCE_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_SPRUCE_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_SPRUCE_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_SPRUCE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_SPRUCE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_SPRUCE_RESISTANT.get());

                        // Birch
                        pOutput.accept(REOBlocks.LOG_BIRCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BIRCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_BIRCH_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_BIRCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_BIRCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_BIRCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_BIRCH_RESISTANT.get());

                        // Jungle
                        pOutput.accept(REOBlocks.LOG_JUNGLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_JUNGLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_JUNGLE_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_JUNGLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_JUNGLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_JUNGLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_JUNGLE_RESISTANT.get());

                        // Acacia
                        pOutput.accept(REOBlocks.LOG_ACACIA_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_ACACIA_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_ACACIA_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_ACACIA_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_ACACIA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_ACACIA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_ACACIA_RESISTANT.get());

                        // Dark Oak
                        pOutput.accept(REOBlocks.LOG_DARK_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_DARK_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_DARK_OAK_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_DARK_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_DARK_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_DARK_OAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT.get());

                        // Mangrove
                        pOutput.accept(REOBlocks.LOG_MANGROVE_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MANGROVE_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_MANGROVE_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_MANGROVE_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_MANGROVE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_MANGROVE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_MANGROVE_RESISTANT.get());

                        // Cherry
                        pOutput.accept(REOBlocks.LOG_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_CHERRY_RESISTANT.get());

                        pOutput.accept(REOBlocks.STAIRS_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_CHERRY_RESISTANT.get());

                        // Modded
                        // Balsa
                        pOutput.accept(REOBlocks.LOG_BALSA.get());
                        pOutput.accept(REOBlocks.LOG_BALSA_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BALSA.get());
                        pOutput.accept(REOBlocks.WOOD_BALSA_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_BALSA_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BALSA_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_BALSA.get());
                        pOutput.accept(REOBlocks.PLANKS_BALSA_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_BALSA.get());
                        pOutput.accept(REOBlocks.LEAVES_BALSA.get());

                        pOutput.accept(REOBlocks.STAIRS_BALSA.get());
                        pOutput.accept(REOBlocks.STAIRS_BALSA_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_BALSA.get());
                        pOutput.accept(REOBlocks.SLAB_BALSA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_BALSA.get());
                        pOutput.accept(REOBlocks.FENCE_BALSA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_BALSA.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_BALSA_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_BALSA.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_BALSA.get());

                        pOutput.accept(REOBlocks.SIGN_BALSA.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_BALSA.get());
                        pOutput.accept(REOItems.BOAT_BALSA.get());
                        pOutput.accept(REOItems.BOAT_BALSA_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_BALSA.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_BALSA.get());

                        // Baobab
                        pOutput.accept(REOBlocks.LOG_BAOBAB.get());
                        pOutput.accept(REOBlocks.LOG_BAOBAB_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BAOBAB.get());
                        pOutput.accept(REOBlocks.WOOD_BAOBAB_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_BAOBAB_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_BAOBAB_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_BAOBAB.get());
                        pOutput.accept(REOBlocks.PLANKS_BAOBAB_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_BAOBAB.get());
                        pOutput.accept(REOBlocks.LEAVES_BAOBAB.get());

                        pOutput.accept(REOBlocks.STAIRS_BAOBAB.get());
                        pOutput.accept(REOBlocks.STAIRS_BAOBAB_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_BAOBAB.get());
                        pOutput.accept(REOBlocks.SLAB_BAOBAB_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_BAOBAB.get());
                        pOutput.accept(REOBlocks.FENCE_BAOBAB_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_BAOBAB.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_BAOBAB_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_BAOBAB.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_BAOBAB.get());

                        pOutput.accept(REOBlocks.SIGN_BAOBAB.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_BAOBAB.get());

                        pOutput.accept(REOItems.BOAT_BAOBAB.get());
                        pOutput.accept(REOItems.BOAT_BAOBAB_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_BAOBAB.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_BAOBAB.get());

                        // Hill Cherry
                        pOutput.accept(REOBlocks.LOG_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.LOG_HILL_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.LEAVES_HILL_CHERRY.get());

                        pOutput.accept(REOBlocks.STAIRS_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.STAIRS_HILL_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.FENCE_HILL_CHERRY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get());

                        pOutput.accept(REOBlocks.SIGN_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_HILL_CHERRY.get());

                        pOutput.accept(REOItems.BOAT_HILL_CHERRY.get());
                        pOutput.accept(REOItems.BOAT_HILL_CHERRY_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_HILL_CHERRY.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_HILL_CHERRY.get());

                        // Chestnut
                        pOutput.accept(REOBlocks.LOG_CHESTNUT.get());
                        pOutput.accept(REOBlocks.LOG_CHESTNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CHESTNUT.get());
                        pOutput.accept(REOBlocks.WOOD_CHESTNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_CHESTNUT_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CHESTNUT_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_CHESTNUT.get());
                        pOutput.accept(REOBlocks.PLANKS_CHESTNUT_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_CHESTNUT.get());
                        pOutput.accept(REOBlocks.LEAVES_CHESTNUT.get());

                        pOutput.accept(REOBlocks.STAIRS_CHESTNUT.get());
                        pOutput.accept(REOBlocks.STAIRS_CHESTNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_CHESTNUT.get());
                        pOutput.accept(REOBlocks.SLAB_CHESTNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_CHESTNUT.get());
                        pOutput.accept(REOBlocks.FENCE_CHESTNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_CHESTNUT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_CHESTNUT.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_CHESTNUT.get());

                        pOutput.accept(REOBlocks.SIGN_CHESTNUT.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_CHESTNUT.get());

                        pOutput.accept(REOItems.BOAT_CHESTNUT.get());
                        pOutput.accept(REOItems.BOAT_CHESTNUT_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_CHESTNUT.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_CHESTNUT.get());

                        // Citrus
                        pOutput.accept(REOBlocks.LOG_CITRUS.get());
                        pOutput.accept(REOBlocks.LOG_CITRUS_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CITRUS.get());
                        pOutput.accept(REOBlocks.WOOD_CITRUS_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_CITRUS_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_CITRUS_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_CITRUS.get());
                        pOutput.accept(REOBlocks.PLANKS_CITRUS_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_CITRUS.get());
                        pOutput.accept(REOBlocks.LEAVES_CITRUS.get());

                        pOutput.accept(REOBlocks.STAIRS_CITRUS.get());
                        pOutput.accept(REOBlocks.STAIRS_CITRUS_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_CITRUS.get());
                        pOutput.accept(REOBlocks.SLAB_CITRUS_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_CITRUS.get());
                        pOutput.accept(REOBlocks.FENCE_CITRUS_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_CITRUS.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_CITRUS_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_CITRUS.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_CITRUS.get());

                        pOutput.accept(REOBlocks.SIGN_CITRUS.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_CITRUS.get());

                        pOutput.accept(REOItems.BOAT_CITRUS.get());
                        pOutput.accept(REOItems.BOAT_CITRUS_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_CITRUS.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_CITRUS.get());

                        // Ebony
                        pOutput.accept(REOBlocks.LOG_EBONY.get());
                        pOutput.accept(REOBlocks.LOG_EBONY_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_EBONY.get());
                        pOutput.accept(REOBlocks.WOOD_EBONY_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_EBONY_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_EBONY_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_EBONY.get());
                        pOutput.accept(REOBlocks.PLANKS_EBONY_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_EBONY.get());
                        pOutput.accept(REOBlocks.LEAVES_EBONY.get());

                        pOutput.accept(REOBlocks.STAIRS_EBONY.get());
                        pOutput.accept(REOBlocks.STAIRS_EBONY_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_EBONY.get());
                        pOutput.accept(REOBlocks.SLAB_EBONY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_EBONY.get());
                        pOutput.accept(REOBlocks.FENCE_EBONY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_EBONY.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_EBONY_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_EBONY.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_EBONY.get());

                        pOutput.accept(REOBlocks.SIGN_EBONY.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_EBONY.get());

                        pOutput.accept(REOItems.BOAT_EBONY.get());
                        pOutput.accept(REOItems.BOAT_EBONY_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_EBONY.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_EBONY.get());

                        // Larch
                        pOutput.accept(REOBlocks.LOG_LARCH.get());
                        pOutput.accept(REOBlocks.LOG_LARCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_LARCH.get());
                        pOutput.accept(REOBlocks.WOOD_LARCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_LARCH_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_LARCH_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_LARCH.get());
                        pOutput.accept(REOBlocks.PLANKS_LARCH_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_LARCH.get());
                        pOutput.accept(REOBlocks.LEAVES_LARCH.get());

                        pOutput.accept(REOBlocks.STAIRS_LARCH.get());
                        pOutput.accept(REOBlocks.STAIRS_LARCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_LARCH.get());
                        pOutput.accept(REOBlocks.SLAB_LARCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_LARCH.get());
                        pOutput.accept(REOBlocks.FENCE_LARCH_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_LARCH.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_LARCH_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_LARCH.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_LARCH.get());

                        pOutput.accept(REOBlocks.SIGN_LARCH.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_LARCH.get());

                        pOutput.accept(REOItems.BOAT_LARCH.get());
                        pOutput.accept(REOItems.BOAT_LARCH_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_LARCH.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_LARCH.get());

                        // Lime
                        pOutput.accept(REOBlocks.LOG_LIME.get());
                        pOutput.accept(REOBlocks.LOG_LIME_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_LIME.get());
                        pOutput.accept(REOBlocks.WOOD_LIME_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_LIME_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_LIME_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_LIME.get());
                        pOutput.accept(REOBlocks.PLANKS_LIME_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_LIME.get());
                        pOutput.accept(REOBlocks.LEAVES_LIME.get());

                        pOutput.accept(REOBlocks.STAIRS_LIME.get());
                        pOutput.accept(REOBlocks.STAIRS_LIME_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_LIME.get());
                        pOutput.accept(REOBlocks.SLAB_LIME_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_LIME.get());
                        pOutput.accept(REOBlocks.FENCE_LIME_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_LIME.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_LIME_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_LIME.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_LIME.get());

                        pOutput.accept(REOBlocks.SIGN_LIME.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_LIME.get());

                        pOutput.accept(REOItems.BOAT_LIME.get());
                        pOutput.accept(REOItems.BOAT_LIME_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_LIME.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_LIME.get());

                        // Mahogany
                        pOutput.accept(REOBlocks.LOG_MAHOGANY.get());
                        pOutput.accept(REOBlocks.LOG_MAHOGANY_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MAHOGANY.get());
                        pOutput.accept(REOBlocks.WOOD_MAHOGANY_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_MAHOGANY_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MAHOGANY_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_MAHOGANY.get());
                        pOutput.accept(REOBlocks.PLANKS_MAHOGANY_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_MAHOGANY.get());
                        pOutput.accept(REOBlocks.LEAVES_MAHOGANY.get());

                        pOutput.accept(REOBlocks.STAIRS_MAHOGANY.get());
                        pOutput.accept(REOBlocks.STAIRS_MAHOGANY_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_MAHOGANY.get());
                        pOutput.accept(REOBlocks.SLAB_MAHOGANY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_MAHOGANY.get());
                        pOutput.accept(REOBlocks.FENCE_MAHOGANY_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_MAHOGANY.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_MAHOGANY.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_MAHOGANY.get());

                        pOutput.accept(REOBlocks.SIGN_MAHOGANY.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_MAHOGANY.get());

                        pOutput.accept(REOItems.BOAT_MAHOGANY.get());
                        pOutput.accept(REOItems.BOAT_MAHOGANY_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_MAHOGANY.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_MAHOGANY.get());

                        // Maple
                        pOutput.accept(REOBlocks.LOG_MAPLE.get());
                        pOutput.accept(REOBlocks.LOG_MAPLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MAPLE.get());
                        pOutput.accept(REOBlocks.WOOD_MAPLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_MAPLE_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_MAPLE_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_MAPLE.get());
                        pOutput.accept(REOBlocks.PLANKS_MAPLE_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_MAPLE.get());
                        pOutput.accept(REOBlocks.LEAVES_MAPLE.get());

                        pOutput.accept(REOBlocks.STAIRS_MAPLE.get());
                        pOutput.accept(REOBlocks.STAIRS_MAPLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_MAPLE.get());
                        pOutput.accept(REOBlocks.SLAB_MAPLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_MAPLE.get());
                        pOutput.accept(REOBlocks.FENCE_MAPLE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_MAPLE.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_MAPLE_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_MAPLE.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_MAPLE.get());

                        pOutput.accept(REOBlocks.SIGN_MAPLE.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_MAPLE.get());

                        pOutput.accept(REOItems.BOAT_MAPLE.get());
                        pOutput.accept(REOItems.BOAT_MAPLE_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_MAPLE.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_MAPLE.get());

                        // Palm
                        pOutput.accept(REOBlocks.LOG_PALM.get());
                        pOutput.accept(REOBlocks.LOG_PALM_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PALM.get());
                        pOutput.accept(REOBlocks.WOOD_PALM_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_PALM_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PALM_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_PALM.get());
                        pOutput.accept(REOBlocks.PLANKS_PALM_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_PALM.get());
                        pOutput.accept(REOBlocks.LEAVES_PALM.get());

                        pOutput.accept(REOBlocks.STAIRS_PALM.get());
                        pOutput.accept(REOBlocks.STAIRS_PALM_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_PALM.get());
                        pOutput.accept(REOBlocks.SLAB_PALM_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_PALM.get());
                        pOutput.accept(REOBlocks.FENCE_PALM_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PALM.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PALM_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_PALM.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_PALM.get());

                        pOutput.accept(REOBlocks.SIGN_PALM.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_PALM.get());

                        pOutput.accept(REOItems.BOAT_PALM.get());
                        pOutput.accept(REOItems.BOAT_PALM_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_PALM.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_PALM.get());

                        // Papaya
                        pOutput.accept(REOBlocks.LOG_PAPAYA.get());
                        pOutput.accept(REOBlocks.LOG_PAPAYA_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PAPAYA.get());
                        pOutput.accept(REOBlocks.WOOD_PAPAYA_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_PAPAYA_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PAPAYA_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_PAPAYA.get());
                        pOutput.accept(REOBlocks.PLANKS_PAPAYA_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_PAPAYA.get());
                        pOutput.accept(REOBlocks.LEAVES_PAPAYA.get());

                        pOutput.accept(REOBlocks.STAIRS_PAPAYA.get());
                        pOutput.accept(REOBlocks.STAIRS_PAPAYA_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_PAPAYA.get());
                        pOutput.accept(REOBlocks.SLAB_PAPAYA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_PAPAYA.get());
                        pOutput.accept(REOBlocks.FENCE_PAPAYA_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PAPAYA.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PAPAYA_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_PAPAYA.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_PAPAYA.get());

                        pOutput.accept(REOBlocks.SIGN_PAPAYA.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_PAPAYA.get());

                        pOutput.accept(REOItems.BOAT_PAPAYA.get());
                        pOutput.accept(REOItems.BOAT_PAPAYA_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_PAPAYA.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_PAPAYA.get());

                        // Pine
                        pOutput.accept(REOBlocks.LOG_PINE.get());
                        pOutput.accept(REOBlocks.LOG_PINE_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PINE.get());
                        pOutput.accept(REOBlocks.WOOD_PINE_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_PINE_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PINE_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_PINE.get());
                        pOutput.accept(REOBlocks.PLANKS_PINE_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_PINE.get());
                        pOutput.accept(REOBlocks.LEAVES_PINE.get());

                        pOutput.accept(REOBlocks.STAIRS_PINE.get());
                        pOutput.accept(REOBlocks.STAIRS_PINE_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_PINE.get());
                        pOutput.accept(REOBlocks.SLAB_PINE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_PINE.get());
                        pOutput.accept(REOBlocks.FENCE_PINE_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PINE.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PINE_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_PINE.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_PINE.get());

                        pOutput.accept(REOBlocks.SIGN_PINE.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_PINE.get());

                        pOutput.accept(REOItems.BOAT_PINE.get());
                        pOutput.accept(REOItems.BOAT_PINE_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_PINE.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_PINE.get());

                        // Plum
                        pOutput.accept(REOBlocks.LOG_PLUM.get());
                        pOutput.accept(REOBlocks.LOG_PLUM_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PLUM.get());
                        pOutput.accept(REOBlocks.WOOD_PLUM_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_PLUM_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_PLUM_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_PLUM.get());
                        pOutput.accept(REOBlocks.PLANKS_PLUM_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_PLUM.get());
                        pOutput.accept(REOBlocks.LEAVES_PLUM.get());

                        pOutput.accept(REOBlocks.STAIRS_PLUM.get());
                        pOutput.accept(REOBlocks.STAIRS_PLUM_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_PLUM.get());
                        pOutput.accept(REOBlocks.SLAB_PLUM_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_PLUM.get());
                        pOutput.accept(REOBlocks.FENCE_PLUM_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PLUM.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_PLUM_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_PLUM.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_PLUM.get());

                        pOutput.accept(REOBlocks.SIGN_PLUM.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_PLUM.get());

                        pOutput.accept(REOItems.BOAT_PLUM.get());
                        pOutput.accept(REOItems.BOAT_PLUM_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_PLUM.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_PLUM.get());

                        // Poplar
                        pOutput.accept(REOBlocks.LOG_POPLAR.get());
                        pOutput.accept(REOBlocks.LOG_POPLAR_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_POPLAR.get());
                        pOutput.accept(REOBlocks.WOOD_POPLAR_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_POPLAR_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_POPLAR_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_POPLAR.get());
                        pOutput.accept(REOBlocks.PLANKS_POPLAR_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_POPLAR.get());
                        pOutput.accept(REOBlocks.LEAVES_POPLAR.get());

                        pOutput.accept(REOBlocks.STAIRS_POPLAR.get());
                        pOutput.accept(REOBlocks.STAIRS_POPLAR_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_POPLAR.get());
                        pOutput.accept(REOBlocks.SLAB_POPLAR_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_POPLAR.get());
                        pOutput.accept(REOBlocks.FENCE_POPLAR_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_POPLAR.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_POPLAR_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_POPLAR.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_POPLAR.get());

                        pOutput.accept(REOBlocks.SIGN_POPLAR.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_POPLAR.get());

                        pOutput.accept(REOItems.BOAT_POPLAR.get());
                        pOutput.accept(REOItems.BOAT_POPLAR_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_POPLAR.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_POPLAR.get());

                        // Redwood
                        pOutput.accept(REOBlocks.LOG_REDWOOD.get());
                        pOutput.accept(REOBlocks.LOG_REDWOOD_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_REDWOOD.get());
                        pOutput.accept(REOBlocks.WOOD_REDWOOD_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_REDWOOD_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_REDWOOD_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_REDWOOD.get());
                        pOutput.accept(REOBlocks.PLANKS_REDWOOD_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_REDWOOD.get());
                        pOutput.accept(REOBlocks.LEAVES_REDWOOD.get());

                        pOutput.accept(REOBlocks.STAIRS_REDWOOD.get());
                        pOutput.accept(REOBlocks.STAIRS_REDWOOD_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_REDWOOD.get());
                        pOutput.accept(REOBlocks.SLAB_REDWOOD_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_REDWOOD.get());
                        pOutput.accept(REOBlocks.FENCE_REDWOOD_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_REDWOOD.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_REDWOOD_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_REDWOOD.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_REDWOOD.get());

                        pOutput.accept(REOBlocks.SIGN_REDWOOD.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_REDWOOD.get());

                        pOutput.accept(REOItems.BOAT_REDWOOD.get());
                        pOutput.accept(REOItems.BOAT_REDWOOD_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_REDWOOD.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_REDWOOD.get());

                        // Rubber
                        pOutput.accept(REOBlocks.LOG_RUBBER.get());
                        pOutput.accept(REOBlocks.LOG_RUBBER_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_RUBBER.get());
                        pOutput.accept(REOBlocks.WOOD_RUBBER_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_RUBBER_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_RUBBER_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_RUBBER.get());
                        pOutput.accept(REOBlocks.PLANKS_RUBBER_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_RUBBER.get());
                        pOutput.accept(REOBlocks.LEAVES_RUBBER.get());

                        pOutput.accept(REOBlocks.STAIRS_RUBBER.get());
                        pOutput.accept(REOBlocks.STAIRS_RUBBER_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_RUBBER.get());
                        pOutput.accept(REOBlocks.SLAB_RUBBER_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_RUBBER.get());
                        pOutput.accept(REOBlocks.FENCE_RUBBER_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_RUBBER.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_RUBBER_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_RUBBER.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_RUBBER.get());

                        pOutput.accept(REOBlocks.SIGN_RUBBER.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_RUBBER.get());

                        pOutput.accept(REOItems.BOAT_RUBBER.get());
                        pOutput.accept(REOItems.BOAT_RUBBER_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_RUBBER.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_RUBBER.get());

                        // Teak
                        pOutput.accept(REOBlocks.LOG_TEAK.get());
                        pOutput.accept(REOBlocks.LOG_TEAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_TEAK.get());
                        pOutput.accept(REOBlocks.WOOD_TEAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_TEAK_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_TEAK_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_TEAK.get());
                        pOutput.accept(REOBlocks.PLANKS_TEAK_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_TEAK.get());
                        pOutput.accept(REOBlocks.LEAVES_TEAK.get());

                        pOutput.accept(REOBlocks.STAIRS_TEAK.get());
                        pOutput.accept(REOBlocks.STAIRS_TEAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_TEAK.get());
                        pOutput.accept(REOBlocks.SLAB_TEAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_TEAK.get());
                        pOutput.accept(REOBlocks.FENCE_TEAK_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_TEAK.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_TEAK_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_TEAK.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_TEAK.get());

                        pOutput.accept(REOBlocks.SIGN_TEAK.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_TEAK.get());

                        pOutput.accept(REOItems.BOAT_TEAK.get());
                        pOutput.accept(REOItems.BOAT_TEAK_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_TEAK.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_TEAK.get());

                        // Walnut
                        pOutput.accept(REOBlocks.LOG_WALNUT.get());
                        pOutput.accept(REOBlocks.LOG_WALNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_WALNUT.get());
                        pOutput.accept(REOBlocks.WOOD_WALNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_WALNUT_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_WALNUT_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_WALNUT.get());
                        pOutput.accept(REOBlocks.PLANKS_WALNUT_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_WALNUT.get());
                        pOutput.accept(REOBlocks.LEAVES_WALNUT.get());

                        pOutput.accept(REOBlocks.STAIRS_WALNUT.get());
                        pOutput.accept(REOBlocks.STAIRS_WALNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_WALNUT.get());
                        pOutput.accept(REOBlocks.SLAB_WALNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_WALNUT.get());
                        pOutput.accept(REOBlocks.FENCE_WALNUT_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_WALNUT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_WALNUT_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_WALNUT.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_WALNUT.get());

                        pOutput.accept(REOBlocks.SIGN_WALNUT.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_WALNUT.get());

                        pOutput.accept(REOItems.BOAT_WALNUT.get());
                        pOutput.accept(REOItems.BOAT_WALNUT_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_WALNUT.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_WALNUT.get());

                        // Willow
                        pOutput.accept(REOBlocks.LOG_WILLOW.get());
                        pOutput.accept(REOBlocks.LOG_WILLOW_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_WILLOW.get());
                        pOutput.accept(REOBlocks.WOOD_WILLOW_RESISTANT.get());
                        pOutput.accept(REOBlocks.LOG_WILLOW_STRIPPED.get());
                        pOutput.accept(REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.WOOD_WILLOW_STRIPPED.get());
                        pOutput.accept(REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get());
                        pOutput.accept(REOBlocks.PLANKS_WILLOW.get());
                        pOutput.accept(REOBlocks.PLANKS_WILLOW_RESISTANT.get());

                        pOutput.accept(REOBlocks.SAPLING_WILLOW.get());
                        pOutput.accept(REOBlocks.LEAVES_WILLOW.get());

                        pOutput.accept(REOBlocks.STAIRS_WILLOW.get());
                        pOutput.accept(REOBlocks.STAIRS_WILLOW_RESISTANT.get());
                        pOutput.accept(REOBlocks.SLAB_WILLOW.get());
                        pOutput.accept(REOBlocks.SLAB_WILLOW_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_WILLOW.get());
                        pOutput.accept(REOBlocks.FENCE_WILLOW_RESISTANT.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_WILLOW.get());
                        pOutput.accept(REOBlocks.FENCE_GATE_WILLOW_RESISTANT.get());

                        pOutput.accept(REOBlocks.BUTTON_WILLOW.get());
                        pOutput.accept(REOBlocks.PRESSURE_PLATE_WILLOW.get());

                        pOutput.accept(REOBlocks.SIGN_WILLOW.get());
                        pOutput.accept(REOBlocks.SIGN_HANGING_WILLOW.get());

                        pOutput.accept(REOItems.BOAT_WILLOW.get());
                        pOutput.accept(REOItems.BOAT_WILLOW_CHEST.get());

                        pOutput.accept(REOBlocks.DOOR_WILLOW.get());
                        pOutput.accept(REOBlocks.TRAPDOOR_WILLOW.get());


                        // Ores //
                        // Overworld Ore
                        pOutput.accept(REOBlocks.ORE_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.ORE_LEAD.get());
                        pOutput.accept(REOBlocks.ORE_NICKEL.get());
                        pOutput.accept(REOBlocks.ORE_PLATINUM.get());
                        pOutput.accept(REOBlocks.ORE_SILVER.get());
                        pOutput.accept(REOBlocks.ORE_TIN.get());
                        pOutput.accept(REOBlocks.ORE_URANIUM.get());
                        pOutput.accept(REOBlocks.ORE_ZINC.get());

                        // Cluster
                        pOutput.accept(REOBlocks.CLUSTER_PERIDOT.get());
                        pOutput.accept(REOBlocks.LARGE_PERIDOT_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_PERIDOT_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_PERIDOT_BUD.get());

                        pOutput.accept(REOBlocks.CLUSTER_RUBY.get());
                        pOutput.accept(REOBlocks.LARGE_RUBY_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_RUBY_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_RUBY_BUD.get());

                        pOutput.accept(REOBlocks.CLUSTER_SAPPHIRE.get());
                        pOutput.accept(REOBlocks.LARGE_SAPPHIRE_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_SAPPHIRE_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_SAPPHIRE_BUD.get());

                        // Gravel Ore
                        pOutput.accept(REOBlocks.GRAVEL_ORE_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_COAL.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_COPPER.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_DIAMOND.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_EMERALD.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_GOLD.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_IRON.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_LAPIS.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_LEAD.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_NICKEL.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_PLATINUM.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_REDSTONE.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_SILVER.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_TIN.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_URANIUM.get());
                        pOutput.accept(REOBlocks.GRAVEL_ORE_ZINC.get());

                        // Deepslate Ore
                        pOutput.accept(REOBlocks.DEEPSLATE_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_LEAD.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_NICKEL.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_PLATINUM.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_SILVER.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_URANIUM.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_ZINC.get());

                        // Nether Ore
                        pOutput.accept(REOBlocks.NETHER_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.NETHER_COAL.get());
                        pOutput.accept(REOBlocks.NETHER_COPPER.get());
                        pOutput.accept(REOBlocks.NETHER_DIAMOND.get());
                        pOutput.accept(REOBlocks.NETHER_EMERALD.get());
                        pOutput.accept(REOBlocks.NETHER_IRON.get());
                        pOutput.accept(REOBlocks.NETHER_LAPIS.get());
                        pOutput.accept(REOBlocks.NETHER_LEAD.get());
                        pOutput.accept(REOBlocks.NETHER_NICKEL.get());
                        pOutput.accept(REOBlocks.NETHER_PLATINUM.get());
                        pOutput.accept(REOBlocks.NETHER_REDSTONE.get());
                        pOutput.accept(REOBlocks.NETHER_SILVER.get());
                        pOutput.accept(REOBlocks.NETHER_TIN.get());
                        pOutput.accept(REOBlocks.NETHER_URANIUM.get());
                        pOutput.accept(REOBlocks.NETHER_ZINC.get());

                        // Nether Ore
                        pOutput.accept(REOBlocks.ORE_ENDERITE.get());

                        // Storage //
                        // Ingot Storage
                        pOutput.accept(REOBlocks.BLOCK_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.BLOCK_BRASS.get());
                        pOutput.accept(REOBlocks.BLOCK_BRONZE.get());
                        pOutput.accept(REOBlocks.BLOCK_ELECTRUM.get());
                        pOutput.accept(REOBlocks.BLOCK_ENDERITE.get());
                        pOutput.accept(REOBlocks.BLOCK_LEAD.get());
                        pOutput.accept(REOBlocks.BLOCK_NICKEL.get());
                        pOutput.accept(REOBlocks.BLOCK_PERIDOT.get());
                        pOutput.accept(REOBlocks.BLOCK_PLATINUM.get());
                        pOutput.accept(REOBlocks.BLOCK_RUBY.get());
                        pOutput.accept(REOBlocks.BLOCK_SAPPHIRE.get());
                        pOutput.accept(REOBlocks.BLOCK_SILVER.get());
                        pOutput.accept(REOBlocks.BLOCK_STEEL.get());
                        pOutput.accept(REOBlocks.BLOCK_TIN.get());
                        pOutput.accept(REOBlocks.BLOCK_URANIUM.get());
                        pOutput.accept(REOBlocks.BLOCK_ZINC.get());

                        // Raw Storage
                        pOutput.accept(REOBlocks.BLOCK_RAW_ALUMINIUM.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_ENDERITE.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_LEAD.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_NICKEL.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_PLATINUM.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_SILVER.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_TIN.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_URANIUM.get());
                        pOutput.accept(REOBlocks.BLOCK_RAW_ZINC.get());

                        // Budding
                        pOutput.accept(REOBlocks.BUDDING_PERIDOT.get());
                        pOutput.accept(REOBlocks.BUDDING_RUBY.get());
                        pOutput.accept(REOBlocks.BUDDING_SAPPHIRE.get());

                        // Food
                        pOutput.accept(REOBlocks.WILD_BARLEY.get());
                        pOutput.accept(REOBlocks.WILD_COTTON.get());
                        pOutput.accept(REOBlocks.WILD_RICE.get());
                        pOutput.accept(REOBlocks.WILD_TOMATO.get());


                    })
                    .build());

    public static RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("realearthores_tools",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.BLOCKS_TAB.getKey())
                    .icon(() -> new ItemStack(REOItems.NETHERITE_PAXEL.get()))
                    .title(Component.translatable("tabs.realearthores_tools"))
                    .displayItems((pParameters, pOutput) -> {

                        // Tools //
                        // Aluminium
                        pOutput.accept(REOItems.ALUMINIUM_SHOVEL.get());
                        pOutput.accept(REOItems.ALUMINIUM_PICKAXE.get());
                        pOutput.accept(REOItems.ALUMINIUM_AXE.get());
                        pOutput.accept(REOItems.ALUMINIUM_HOE.get());
                        pOutput.accept(REOItems.ALUMINIUM_SWORD.get());
                        pOutput.accept(REOItems.ALUMINIUM_HAMMER.get());
                        pOutput.accept(REOItems.ALUMINIUM_EXCAVATOR.get());
                        pOutput.accept(REOItems.ALUMINIUM_HATCHET.get());
                        pOutput.accept(REOItems.ALUMINIUM_SICKLE.get());
                        pOutput.accept(REOItems.ALUMINIUM_PAXEL.get());
                        pOutput.accept(REOItems.ALUMINIUM_SHEARS.get());
                        pOutput.accept(REOItems.ALUMINIUM_BOW.get());

                        // Amethyst
                        pOutput.accept(REOItems.AMETHYST_SHOVEL.get());
                        pOutput.accept(REOItems.AMETHYST_PICKAXE.get());
                        pOutput.accept(REOItems.AMETHYST_AXE.get());
                        pOutput.accept(REOItems.AMETHYST_HOE.get());
                        pOutput.accept(REOItems.AMETHYST_SWORD.get());
                        pOutput.accept(REOItems.AMETHYST_HAMMER.get());
                        pOutput.accept(REOItems.AMETHYST_EXCAVATOR.get());
                        pOutput.accept(REOItems.AMETHYST_HATCHET.get());
                        pOutput.accept(REOItems.AMETHYST_SICKLE.get());
                        pOutput.accept(REOItems.AMETHYST_PAXEL.get());
                        pOutput.accept(REOItems.AMETHYST_SHEARS.get());
                        pOutput.accept(REOItems.AMETHYST_BOW.get());
                        pOutput.accept(REOItems.AMETHYST_SHIELD.get());

                        // Bronze
                        pOutput.accept(REOItems.BRONZE_SHOVEL.get());
                        pOutput.accept(REOItems.BRONZE_PICKAXE.get());
                        pOutput.accept(REOItems.BRONZE_AXE.get());
                        pOutput.accept(REOItems.BRONZE_HOE.get());
                        pOutput.accept(REOItems.BRONZE_SWORD.get());
                        pOutput.accept(REOItems.BRONZE_HAMMER.get());
                        pOutput.accept(REOItems.BRONZE_EXCAVATOR.get());
                        pOutput.accept(REOItems.BRONZE_HATCHET.get());
                        pOutput.accept(REOItems.BRONZE_SICKLE.get());
                        pOutput.accept(REOItems.BRONZE_PAXEL.get());
                        pOutput.accept(REOItems.BRONZE_SHEARS.get());
                        pOutput.accept(REOItems.BRONZE_BOW.get());

                        // Diamond
                        pOutput.accept(REOItems.DIAMOND_HAMMER.get());
                        pOutput.accept(REOItems.DIAMOND_EXCAVATOR.get());
                        pOutput.accept(REOItems.DIAMOND_HATCHET.get());
                        pOutput.accept(REOItems.DIAMOND_SICKLE.get());
                        pOutput.accept(REOItems.DIAMOND_PAXEL.get());
                        pOutput.accept(REOItems.DIAMOND_SHEARS.get());
                        pOutput.accept(REOItems.DIAMOND_BOW.get());

                        // Enderite
                        pOutput.accept(REOItems.ENDERITE_SHOVEL.get());
                        pOutput.accept(REOItems.ENDERITE_PICKAXE.get());
                        pOutput.accept(REOItems.ENDERITE_AXE.get());
                        pOutput.accept(REOItems.ENDERITE_HOE.get());
                        pOutput.accept(REOItems.ENDERITE_SWORD.get());
                        pOutput.accept(REOItems.ENDERITE_HAMMER.get());
                        pOutput.accept(REOItems.ENDERITE_EXCAVATOR.get());
                        pOutput.accept(REOItems.ENDERITE_HATCHET.get());
                        pOutput.accept(REOItems.ENDERITE_SICKLE.get());
                        pOutput.accept(REOItems.ENDERITE_PAXEL.get());
                        pOutput.accept(REOItems.ENDERITE_SHEARS.get());
                        pOutput.accept(REOItems.ENDERITE_BOW.get());

                        // Gold
                        pOutput.accept(REOItems.GOLDEN_HAMMER.get());
                        pOutput.accept(REOItems.GOLDEN_EXCAVATOR.get());
                        pOutput.accept(REOItems.GOLDEN_HATCHET.get());
                        pOutput.accept(REOItems.GOLDEN_SICKLE.get());
                        pOutput.accept(REOItems.GOLDEN_PAXEL.get());
                        pOutput.accept(REOItems.GOLDEN_SHEARS.get());
                        pOutput.accept(REOItems.GOLDEN_BOW.get());

                        // Netherite
                        pOutput.accept(REOItems.NETHERITE_HAMMER.get());
                        pOutput.accept(REOItems.NETHERITE_EXCAVATOR.get());
                        pOutput.accept(REOItems.NETHERITE_HATCHET.get());
                        pOutput.accept(REOItems.NETHERITE_SICKLE.get());
                        pOutput.accept(REOItems.NETHERITE_PAXEL.get());
                        pOutput.accept(REOItems.NETHERITE_SHEARS.get());
                        pOutput.accept(REOItems.NETHERITE_BOW.get());

                        // Iron
                        pOutput.accept(REOItems.IRON_HAMMER.get());
                        pOutput.accept(REOItems.IRON_EXCAVATOR.get());
                        pOutput.accept(REOItems.IRON_HATCHET.get());
                        pOutput.accept(REOItems.IRON_SICKLE.get());
                        pOutput.accept(REOItems.IRON_PAXEL.get());
                        pOutput.accept(REOItems.IRON_BOW.get());

                        // Peridot
                        pOutput.accept(REOItems.PERIDOT_SHOVEL.get());
                        pOutput.accept(REOItems.PERIDOT_PICKAXE.get());
                        pOutput.accept(REOItems.PERIDOT_AXE.get());
                        pOutput.accept(REOItems.PERIDOT_HOE.get());
                        pOutput.accept(REOItems.PERIDOT_SWORD.get());
                        pOutput.accept(REOItems.PERIDOT_HAMMER.get());
                        pOutput.accept(REOItems.PERIDOT_EXCAVATOR.get());
                        pOutput.accept(REOItems.PERIDOT_HATCHET.get());
                        pOutput.accept(REOItems.PERIDOT_SICKLE.get());
                        pOutput.accept(REOItems.PERIDOT_PAXEL.get());
                        pOutput.accept(REOItems.PERIDOT_SHEARS.get());
                        pOutput.accept(REOItems.PERIDOT_BOW.get());

                        // Platinum
                        pOutput.accept(REOItems.PLATINUM_SHOVEL.get());
                        pOutput.accept(REOItems.PLATINUM_PICKAXE.get());
                        pOutput.accept(REOItems.PLATINUM_AXE.get());
                        pOutput.accept(REOItems.PLATINUM_HOE.get());
                        pOutput.accept(REOItems.PLATINUM_SWORD.get());
                        pOutput.accept(REOItems.PLATINUM_HAMMER.get());
                        pOutput.accept(REOItems.PLATINUM_EXCAVATOR.get());
                        pOutput.accept(REOItems.PLATINUM_HATCHET.get());
                        pOutput.accept(REOItems.PLATINUM_SICKLE.get());
                        pOutput.accept(REOItems.PLATINUM_PAXEL.get());
                        pOutput.accept(REOItems.PLATINUM_SHEARS.get());
                        pOutput.accept(REOItems.PLATINUM_BOW.get());

                        // Ruby
                        pOutput.accept(REOItems.RUBY_SHOVEL.get());
                        pOutput.accept(REOItems.RUBY_PICKAXE.get());
                        pOutput.accept(REOItems.RUBY_AXE.get());
                        pOutput.accept(REOItems.RUBY_HOE.get());
                        pOutput.accept(REOItems.RUBY_SWORD.get());
                        pOutput.accept(REOItems.RUBY_HAMMER.get());
                        pOutput.accept(REOItems.RUBY_EXCAVATOR.get());
                        pOutput.accept(REOItems.RUBY_HATCHET.get());
                        pOutput.accept(REOItems.RUBY_SICKLE.get());
                        pOutput.accept(REOItems.RUBY_PAXEL.get());
                        pOutput.accept(REOItems.RUBY_SHEARS.get());
                        pOutput.accept(REOItems.RUBY_BOW.get());

                        // Sapphire
                        pOutput.accept(REOItems.SAPPHIRE_SHOVEL.get());
                        pOutput.accept(REOItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(REOItems.SAPPHIRE_AXE.get());
                        pOutput.accept(REOItems.SAPPHIRE_HOE.get());
                        pOutput.accept(REOItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(REOItems.SAPPHIRE_HAMMER.get());
                        pOutput.accept(REOItems.SAPPHIRE_EXCAVATOR.get());
                        pOutput.accept(REOItems.SAPPHIRE_HATCHET.get());
                        pOutput.accept(REOItems.SAPPHIRE_SICKLE.get());
                        pOutput.accept(REOItems.SAPPHIRE_PAXEL.get());
                        pOutput.accept(REOItems.SAPPHIRE_SHEARS.get());
                        pOutput.accept(REOItems.SAPPHIRE_BOW.get());

                        // Silver
                        pOutput.accept(REOItems.SILVER_SHOVEL.get());
                        pOutput.accept(REOItems.SILVER_PICKAXE.get());
                        pOutput.accept(REOItems.SILVER_AXE.get());
                        pOutput.accept(REOItems.SILVER_HOE.get());
                        pOutput.accept(REOItems.SILVER_SWORD.get());
                        pOutput.accept(REOItems.SILVER_HAMMER.get());
                        pOutput.accept(REOItems.SILVER_EXCAVATOR.get());
                        pOutput.accept(REOItems.SILVER_HATCHET.get());
                        pOutput.accept(REOItems.SILVER_SICKLE.get());
                        pOutput.accept(REOItems.SILVER_PAXEL.get());
                        pOutput.accept(REOItems.SILVER_SHEARS.get());
                        pOutput.accept(REOItems.SILVER_BOW.get());

                        // Steel
                        pOutput.accept(REOItems.STEEL_SHOVEL.get());
                        pOutput.accept(REOItems.STEEL_PICKAXE.get());
                        pOutput.accept(REOItems.STEEL_AXE.get());
                        pOutput.accept(REOItems.STEEL_HOE.get());
                        pOutput.accept(REOItems.STEEL_SWORD.get());
                        pOutput.accept(REOItems.STEEL_HAMMER.get());
                        pOutput.accept(REOItems.STEEL_EXCAVATOR.get());
                        pOutput.accept(REOItems.STEEL_HATCHET.get());
                        pOutput.accept(REOItems.STEEL_SICKLE.get());
                        pOutput.accept(REOItems.STEEL_PAXEL.get());
                        pOutput.accept(REOItems.STEEL_SHEARS.get());
                        pOutput.accept(REOItems.STEEL_BOW.get());

                        // Stone
                        pOutput.accept(REOItems.STONE_HAMMER.get());
                        pOutput.accept(REOItems.STONE_EXCAVATOR.get());
                        pOutput.accept(REOItems.STONE_HATCHET.get());
                        pOutput.accept(REOItems.STONE_SICKLE.get());
                        pOutput.accept(REOItems.STONE_PAXEL.get());
                        pOutput.accept(REOItems.STONE_SHEARS.get());
                        pOutput.accept(REOItems.STONE_BOW.get());

                        // Wood
                        pOutput.accept(REOItems.WOODEN_HAMMER.get());
                        pOutput.accept(REOItems.WOODEN_EXCAVATOR.get());
                        pOutput.accept(REOItems.WOODEN_HATCHET.get());
                        pOutput.accept(REOItems.WOODEN_SICKLE.get());
                        pOutput.accept(REOItems.WOODEN_PAXEL.get());
                        pOutput.accept(REOItems.WOODEN_SHEARS.get());


                        // Armour //
                        // Aluminium
                        pOutput.accept(REOItems.ALUMINIUM_HELMET.get());
                        pOutput.accept(REOItems.ALUMINIUM_CHESTPLATE.get());
                        pOutput.accept(REOItems.ALUMINIUM_LEGGINGS.get());
                        pOutput.accept(REOItems.ALUMINIUM_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_ALUMINIUM.get());

                        // Amethyst
                        pOutput.accept(REOItems.AMETHYST_HELMET.get());
                        pOutput.accept(REOItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(REOItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(REOItems.AMETHYST_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_AMETHYST.get());

                        // Bronze
                        pOutput.accept(REOItems.BRONZE_HELMET.get());
                        pOutput.accept(REOItems.BRONZE_CHESTPLATE.get());
                        pOutput.accept(REOItems.BRONZE_LEGGINGS.get());
                        pOutput.accept(REOItems.BRONZE_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_BRONZE.get());

                        // Chain
                        //pOutput.accept(REOItems.HORSE_ARMOR_CHAIN.get());

                        // Enderite
                        pOutput.accept(REOItems.ENDERITE_HELMET.get());
                        pOutput.accept(REOItems.ENDERITE_CHESTPLATE.get());
                        pOutput.accept(REOItems.ENDERITE_LEGGINGS.get());
                        pOutput.accept(REOItems.ENDERITE_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_ENDERITE.get());

                        // Netherite
                        //pOutput.accept(REOItems.HORSE_ARMOR_NETHERITE.get());

                        // Platinum
                        pOutput.accept(REOItems.PLATINUM_HELMET.get());
                        pOutput.accept(REOItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(REOItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(REOItems.PLATINUM_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_PLATINUM.get());

                        // Peridot
                        pOutput.accept(REOItems.PERIDOT_HELMET.get());
                        pOutput.accept(REOItems.PERIDOT_CHESTPLATE.get());
                        pOutput.accept(REOItems.PERIDOT_LEGGINGS.get());
                        pOutput.accept(REOItems.PERIDOT_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_PERIDOT.get());

                        // Ruby
                        pOutput.accept(REOItems.RUBY_HELMET.get());
                        pOutput.accept(REOItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(REOItems.RUBY_LEGGINGS.get());
                        pOutput.accept(REOItems.RUBY_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_RUBY.get());

                        // Sapphire
                        pOutput.accept(REOItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(REOItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(REOItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(REOItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_SAPPHIRE.get());

                        // Silver
                        pOutput.accept(REOItems.SILVER_HELMET.get());
                        pOutput.accept(REOItems.SILVER_CHESTPLATE.get());
                        pOutput.accept(REOItems.SILVER_LEGGINGS.get());
                        pOutput.accept(REOItems.SILVER_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_SILVER.get());

                        // Steel
                        pOutput.accept(REOItems.STEEL_HELMET.get());
                        pOutput.accept(REOItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(REOItems.STEEL_LEGGINGS.get());
                        pOutput.accept(REOItems.STEEL_BOOTS.get());

                        pOutput.accept(REOItems.HORSE_ARMOR_STEEL.get());

                    })
                    .build());



    public static RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("realearthores_food",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.TOOLS_TAB.getKey())
                    .icon(() -> new ItemStack(REOItems.FOOD_ONION.get()))
                    .title(Component.translatable("tabs.realearthores_food"))
                    .displayItems((pParameters, pOutput) -> {

                        // Seeds
                        pOutput.accept(REOItems.SEED_BARLEY.get());
                        pOutput.accept(REOItems.SEED_CAULIFLOWER.get());
                        pOutput.accept(REOItems.SEED_COTTON.get());
                        pOutput.accept(REOItems.SEED_RICE.get());
                        pOutput.accept(REOItems.SEED_STRAWBERRY.get());
                        pOutput.accept(REOItems.SEED_TOMATO.get());

                        // Plants
                        pOutput.accept(REOItems.PLANT_BARLEY.get());
                        pOutput.accept(REOItems.PLANT_COTTON.get());
                        pOutput.accept(REOItems.PLANT_RICE.get());

                        // Flour
                        pOutput.accept(REOItems.FLOUR_BARLEY.get());
                        pOutput.accept(REOItems.FLOUR_WHEAT.get());

                        // Fruit
                        pOutput.accept(REOItems.FOOD_CHERRY.get());
                        pOutput.accept(REOItems.FOOD_CHESTNUT.get());
                        pOutput.accept(REOItems.FOOD_DATES.get());
                        pOutput.accept(REOItems.FOOD_LEMON.get());
                        pOutput.accept(REOItems.FOOD_LIME.get());
                        pOutput.accept(REOItems.FOOD_PAPAYA.get());
                        pOutput.accept(REOItems.FOOD_PEACH.get());
                        pOutput.accept(REOItems.FOOD_PLUM.get());
                        pOutput.accept(REOItems.FOOD_WALNUT.get());

                        // Veg
                        pOutput.accept(REOItems.FOOD_CAULIFLOWER.get());
                        pOutput.accept(REOItems.FOOD_ONION.get());
                        pOutput.accept(REOItems.FOOD_RICE.get());
                        pOutput.accept(REOItems.FOOD_TOMATO.get());
                        pOutput.accept(REOItems.FOOD_TOMATO_ROTTEN.get());

                        // Berries
                        pOutput.accept(REOItems.FOOD_BLACKBERRY.get());
                        pOutput.accept(REOItems.FOOD_BLUEBERRY.get());
                        pOutput.accept(REOItems.FOOD_RASPBERRY.get());
                        pOutput.accept(REOItems.FOOD_STRAWBERRY.get());

                        // Ore Seeds
                        //pOutput.accept(REOItems.SEED_ALUMINIUM.get());


                    })
                    .build());

    public static RegistryObject<CreativeModeTab> MACHINE_TAB = CREATIVE_MODE_TABS.register("realearthores_machines",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.FOOD_TAB.getKey())
                    .icon(() -> new ItemStack(REOBlocks.CRUSHER.get()))
                    .title(Component.translatable("tabs.realearthores_machines"))
                    .displayItems((pParameters, pOutput) -> {

                        // Tech //
                        // Machines
                        // Coal
                        pOutput.accept(REOBlocks.KILN.get());
                        pOutput.accept(REOBlocks.CRUSHER.get());
                        pOutput.accept(REOBlocks.EXTRACTOR.get());
                        pOutput.accept(REOBlocks.COMPRESSOR.get());

                        // Electric
                        pOutput.accept(REOBlocks.ELECTRIC_FURNACE.get());
                        pOutput.accept(REOBlocks.ELECTRIC_CRUSHER.get());
                        pOutput.accept(REOBlocks.ELECTRIC_PURIFIER.get());
                        pOutput.accept(REOBlocks.ELECTRIC_ALLOY_FURNACE.get());
                        pOutput.accept(REOBlocks.ELECTRIC_SAWMILL.get());
                        pOutput.accept(REOBlocks.ELECTRIC_EXTRACTOR.get());
                        pOutput.accept(REOBlocks.ELECTRIC_COMPRESSOR.get());
                        pOutput.accept(REOBlocks.ELECTRIC_CENTRIFUGE.get());
                        pOutput.accept(REOBlocks.ELECTRIC_INDUCTION_FURNACE.get());
                        pOutput.accept(REOBlocks.ELECTRIC_TRANSFUSER.get());


                    })
                    .build());

    public static RegistryObject<CreativeModeTab> TRANSPORTATION_TAB = CREATIVE_MODE_TABS.register("realearthores_transportation",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.MACHINE_TAB.getKey())
                    .icon(() -> new ItemStack(REOItems.NETHERITE_PAXEL.get()))
                    .title(Component.translatable("tabs.realearthores_transportation"))
                    .displayItems((pParameters, pOutput) -> {


                    })
                    .build());


    public static void register(IEventBus evnentBus) {

        CREATIVE_MODE_TABS.register(evnentBus);
    }
}