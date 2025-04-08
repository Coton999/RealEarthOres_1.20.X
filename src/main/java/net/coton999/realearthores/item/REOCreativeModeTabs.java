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
                    pOutput.accept(REOItems.ALUMINUM_INGOT.get());
                    pOutput.accept(REOItems.BRASS_INGOT.get());
                    pOutput.accept(REOItems.BRONZE_INGOT.get());
                    pOutput.accept(REOItems.ELECTRUM_INGOT.get());
                    pOutput.accept(REOItems.ENDERITE_INGOT.get());
                    pOutput.accept(REOItems.LEAD_INGOT.get());
                    pOutput.accept(REOItems.NICKEL_INGOT.get());
                    pOutput.accept(REOItems.OBSIDIAN_INGOT.get());
                    pOutput.accept(REOItems.PLATINUM_INGOT.get());
                    pOutput.accept(REOItems.SILVER_INGOT.get());
                    pOutput.accept(REOItems.STEEL_INGOT.get());
                    pOutput.accept(REOItems.TIN_INGOT.get());
                    pOutput.accept(REOItems.URANIUM_INGOT.get());
                    pOutput.accept(REOItems.ZINC_INGOT.get());

                    // Gem
                    pOutput.accept(REOItems.AMETHYST.get());
                    pOutput.accept(REOItems.PERIDOT.get());
                    pOutput.accept(REOItems.RUBY.get());
                    pOutput.accept(REOItems.SAPPHIRE.get());

                    // Gem Shards
                    pOutput.accept(REOItems.PERIDOT_SHARD.get());
                    pOutput.accept(REOItems.RUBY_SHARD.get());
                    pOutput.accept(REOItems.SAPPHIRE_SHARD.get());

                    // Nugget
                    pOutput.accept(REOItems.ALUMINUM_NUGGET.get());
                    pOutput.accept(REOItems.AMETHYST_NUGGET.get());
                    pOutput.accept(REOItems.BRASS_NUGGET.get());
                    pOutput.accept(REOItems.BRONZE_NUGGET.get());
                    pOutput.accept(REOItems.COPPER_NUGGET.get());
                    pOutput.accept(REOItems.DIAMOND_NUGGET.get());
                    pOutput.accept(REOItems.ELECTRUM_NUGGET.get());
                    pOutput.accept(REOItems.EMERALD_NUGGET.get());
                    pOutput.accept(REOItems.ENDERITE_NUGGET.get());
                    pOutput.accept(REOItems.LEAD_NUGGET.get());
                    pOutput.accept(REOItems.NETHERITE_NUGGET.get());
                    pOutput.accept(REOItems.NICKEL_NUGGET.get());
                    pOutput.accept(REOItems.PERIDOT_NUGGET.get());
                    pOutput.accept(REOItems.PLATINUM_NUGGET.get());
                    pOutput.accept(REOItems.RUBY_NUGGET.get());
                    pOutput.accept(REOItems.SAPPHIRE_NUGGET.get());
                    pOutput.accept(REOItems.SILVER_NUGGET.get());
                    pOutput.accept(REOItems.STEEL_NUGGET.get());
                    pOutput.accept(REOItems.TIN_NUGGET.get());
                    pOutput.accept(REOItems.ZINC_NUGGET.get());

                    // Dust
                    pOutput.accept(REOItems.ALUMINUM_DUST.get());
                    pOutput.accept(REOItems.AMETHYST_DUST.get());
                    pOutput.accept(REOItems.BRASS_DUST.get());
                    pOutput.accept(REOItems.BRONZE_DUST.get());
                    pOutput.accept(REOItems.CHARCOAL_DUST.get());
                    pOutput.accept(REOItems.COAL_DUST.get());
                    pOutput.accept(REOItems.COPPER_DUST.get());
                    pOutput.accept(REOItems.DIAMOND_DUST.get());
                    pOutput.accept(REOItems.ELECTRUM_DUST.get());
                    pOutput.accept(REOItems.EMERALD_DUST.get());
                    pOutput.accept(REOItems.ENDERITE_DUST.get());
                    pOutput.accept(REOItems.GOLD_DUST.get());
                    pOutput.accept(REOItems.IRON_DUST.get());
                    pOutput.accept(REOItems.LEAD_DUST.get());
                    pOutput.accept(REOItems.NETHERITE_DUST.get());
                    pOutput.accept(REOItems.NICKEL_DUST.get());
                    pOutput.accept(REOItems.OBSIDIAN_DUST.get());
                    pOutput.accept(REOItems.PERIDOT_DUST.get());
                    pOutput.accept(REOItems.PLATINUM_DUST.get());
                    pOutput.accept(REOItems.RUBY_DUST.get());
                    pOutput.accept(REOItems.SAPPHIRE_DUST.get());
                    pOutput.accept(REOItems.SILVER_DUST.get());
                    pOutput.accept(REOItems.STEEL_DUST.get());
                    pOutput.accept(REOItems.TIN_DUST.get());
                    pOutput.accept(REOItems.URANIUM_DUST.get());
                    pOutput.accept(REOItems.ZINC_DUST.get());

                    // Dirty Dust
                    pOutput.accept(REOItems.ALUMINUM_DIRTY.get());
                    pOutput.accept(REOItems.AMETHYST_DIRTY.get());
                    pOutput.accept(REOItems.BRASS_DIRTY.get());
                    pOutput.accept(REOItems.BRONZE_DIRTY.get());
                    pOutput.accept(REOItems.COPPER_DIRTY.get());
                    pOutput.accept(REOItems.DIAMOND_DIRTY.get());
                    pOutput.accept(REOItems.ELECTRUM_DIRTY.get());
                    pOutput.accept(REOItems.EMERALD_DIRTY.get());
                    pOutput.accept(REOItems.ENDERITE_DIRTY.get());
                    pOutput.accept(REOItems.GOLD_DIRTY.get());
                    pOutput.accept(REOItems.IRON_DIRTY.get());
                    pOutput.accept(REOItems.LEAD_DIRTY.get());
                    pOutput.accept(REOItems.NETHERITE_DIRTY.get());
                    pOutput.accept(REOItems.NICKEL_DIRTY.get());
                    pOutput.accept(REOItems.OBSIDIAN_DIRTY.get());
                    pOutput.accept(REOItems.PERIDOT_DIRTY.get());
                    pOutput.accept(REOItems.PLATINUM_DIRTY.get());
                    pOutput.accept(REOItems.RUBY_DIRTY.get());
                    pOutput.accept(REOItems.SAPPHIRE_DIRTY.get());
                    pOutput.accept(REOItems.SILVER_DIRTY.get());
                    pOutput.accept(REOItems.STEEL_DIRTY.get());
                    pOutput.accept(REOItems.TIN_DIRTY.get());
                    pOutput.accept(REOItems.URANIUM_DIRTY.get());
                    pOutput.accept(REOItems.ZINC_DIRTY.get());

                    // Bucket
                    pOutput.accept(REOItems.ALUMINUM_BUCKET.get());
                    pOutput.accept(REOItems.AMETHYST_BUCKET.get());
                    pOutput.accept(REOItems.BRASS_BUCKET.get());
                    pOutput.accept(REOItems.BRONZE_BUCKET.get());
                    pOutput.accept(REOItems.COAL_BUCKET.get());
                    pOutput.accept(REOItems.COPPER_BUCKET.get());
                    pOutput.accept(REOItems.DIAMOND_BUCKET.get());
                    pOutput.accept(REOItems.ELECTRUM_BUCKET.get());
                    pOutput.accept(REOItems.EMERALD_BUCKET.get());
                    pOutput.accept(REOItems.ENDERITE_BUCKET.get());
                    pOutput.accept(REOItems.GOLD_BUCKET.get());
                    pOutput.accept(REOItems.IRON_BUCKET.get());
                    pOutput.accept(REOItems.LAPIS_BUCKET.get());
                    pOutput.accept(REOItems.LEAD_BUCKET.get());
                    pOutput.accept(REOItems.NICKEL_BUCKET.get());
                    pOutput.accept(REOItems.PERIDOT_BUCKET.get());
                    pOutput.accept(REOItems.PLATINUM_BUCKET.get());
                    pOutput.accept(REOItems.REDSTONE_BUCKET.get());
                    pOutput.accept(REOItems.RUBY_BUCKET.get());
                    pOutput.accept(REOItems.SAPPHIRE_BUCKET.get());
                    pOutput.accept(REOItems.SILVER_BUCKET.get());
                    pOutput.accept(REOItems.STEEL_BUCKET.get());
                    pOutput.accept(REOItems.TIN_BUCKET.get());
                    pOutput.accept(REOItems.URANIUM_BUCKET.get());
                    pOutput.accept(REOItems.ZINC_BUCKET.get());

                    // Luminous Powder
                    pOutput.accept(REOItems.BLACK_LUMINOUS.get());
                    pOutput.accept(REOItems.BLUE_LUMINOUS.get());
                    pOutput.accept(REOItems.BROWN_LUMINOUS.get());
                    pOutput.accept(REOItems.CYAN_LUMINOUS.get());
                    pOutput.accept(REOItems.GRAY_LUMINOUS.get());
                    pOutput.accept(REOItems.GREEN_LUMINOUS.get());
                    pOutput.accept(REOItems.LIGHT_BLUE_LUMINOUS.get());
                    pOutput.accept(REOItems.LIGHT_GRAY_LUMINOUS.get());
                    pOutput.accept(REOItems.LIME_LUMINOUS.get());
                    pOutput.accept(REOItems.MAGENTA_LUMINOUS.get());
                    pOutput.accept(REOItems.ORANGE_LUMINOUS.get());
                    pOutput.accept(REOItems.PINK_LUMINOUS.get());
                    pOutput.accept(REOItems.PURPLE_LUMINOUS.get());
                    pOutput.accept(REOItems.RED_LUMINOUS.get());
                    pOutput.accept(REOItems.WHITE_LUMINOUS.get());
                    pOutput.accept(REOItems.YELLOW_LUMINOUS.get());

                    // Tech //
                    // Misc
                    pOutput.accept(REOItems.SAP.get());
                    pOutput.accept(REOItems.RESIN.get());
                    pOutput.accept(REOItems.RUBBER.get());

                    // Gear
                    pOutput.accept(REOItems.ALUMINUM_GEAR.get());
                    pOutput.accept(REOItems.AMETHYST_GEAR.get());
                    pOutput.accept(REOItems.BRASS_GEAR.get());
                    pOutput.accept(REOItems.BRONZE_GEAR.get());
                    pOutput.accept(REOItems.COPPER_GEAR.get());
                    pOutput.accept(REOItems.DIAMOND_GEAR.get());
                    pOutput.accept(REOItems.ELECTRUM_GEAR.get());
                    pOutput.accept(REOItems.EMERALD_GEAR.get());
                    pOutput.accept(REOItems.ENDERITE_GEAR.get());
                    pOutput.accept(REOItems.GOLD_GERAR.get());
                    pOutput.accept(REOItems.IRON_GEAR.get());
                    pOutput.accept(REOItems.LEAD_GEAR.get());
                    pOutput.accept(REOItems.NICKEL_GEAR.get());
                    pOutput.accept(REOItems.PLATINUM_GEAR.get());
                    pOutput.accept(REOItems.PERIDOT_GEAR.get());
                    pOutput.accept(REOItems.RUBY_GEAR.get());
                    pOutput.accept(REOItems.SAPPHIRE_GEAR.get());
                    pOutput.accept(REOItems.SILVER_GEAR.get());
                    pOutput.accept(REOItems.STEEL_GEAR.get());
                    pOutput.accept(REOItems.STONE_GEAR.get());
                    pOutput.accept(REOItems.TIN_GEAR.get());
                    pOutput.accept(REOItems.WOOD_GEAR.get());
                    pOutput.accept(REOItems.ZINC_GEAR.get());

                    // Plate
                    pOutput.accept(REOItems.ALUMINUM_PLATE.get());
                    pOutput.accept(REOItems.AMETHYST_PLATE.get());
                    pOutput.accept(REOItems.BRASS_PALTE.get());
                    pOutput.accept(REOItems.BRONZE_PLATE.get());
                    pOutput.accept(REOItems.COPPER_PALTE.get());
                    pOutput.accept(REOItems.DIAMOND_PLATE.get());
                    pOutput.accept(REOItems.ELECTRUM_PLATE.get());
                    pOutput.accept(REOItems.EMERALD_PLATE.get());
                    pOutput.accept(REOItems.ENDERITE_PLATE.get());
                    pOutput.accept(REOItems.GOLD_PLATE.get());
                    pOutput.accept(REOItems.IRON_PLATE.get());
                    pOutput.accept(REOItems.LEAD_PLATE.get());
                    pOutput.accept(REOItems.NICKEL_PLATE.get());
                    pOutput.accept(REOItems.PLATINUM_PLATE.get());
                    pOutput.accept(REOItems.PERIDOT_PLATE.get());
                    pOutput.accept(REOItems.RUBY_PLATE.get());
                    pOutput.accept(REOItems.SAPPHIRE_PLATE.get());
                    pOutput.accept(REOItems.SILVER_PLATE.get());
                    pOutput.accept(REOItems.STEEL_PLATE.get());
                    pOutput.accept(REOItems.TIN_PLATE.get());
                    pOutput.accept(REOItems.ZINC_PLATE.get());

                    // Capcitor
                    pOutput.accept(REOItems.BASIC_CAPACITOR.get());
                    pOutput.accept(REOItems.ADVANCED_CAPACITOR.get());
                    pOutput.accept(REOItems.ULTIMATE_CAPACITOR.get());


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
                        pOutput.accept(REOBlocks.MARBLE_BRICK_CHISELED.get());
                        pOutput.accept(REOBlocks.MARBLE_BRICK_CRACKED.get());

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
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_CHISELED.get());
                        pOutput.accept(REOBlocks.LIMESTONE_BRICK_CRACKED.get());

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
                        pOutput.accept(REOItems.BALSA_BOAT.get());
                        pOutput.accept(REOItems.BALSA_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.BAOBAB_BOAT.get());
                        pOutput.accept(REOItems.BAOBAB_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.HILL_CHERRY_BOAT.get());
                        pOutput.accept(REOItems.HILL_CHERRY_CHEST_BOAT.get());

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
                        pOutput.accept(REOItems.CHESTNUT_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.CITRUS_BOAT.get());
                        pOutput.accept(REOItems.CITRUS_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.EBONY_BOAT.get());
                        pOutput.accept(REOItems.EBONY_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.LARCH_BOAT.get());
                        pOutput.accept(REOItems.LARCH_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.LIME_BOAT.get());
                        pOutput.accept(REOItems.LIME_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.MAHOGANY_BOAT.get());
                        pOutput.accept(REOItems.MAHOGANY_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.MAPLE_BOAT.get());
                        pOutput.accept(REOItems.MAPLE_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.PALM_BOAT.get());
                        pOutput.accept(REOItems.PALM_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.PAPAYA_BOAT.get());
                        pOutput.accept(REOItems.PAPAYA_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.PINE_BOAT.get());
                        pOutput.accept(REOItems.PINE_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.PLUM_BOAT.get());
                        pOutput.accept(REOItems.PLUM_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.POPLAR_BOAT.get());
                        pOutput.accept(REOItems.POPLAR_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.REDWOOD_BOAT.get());
                        pOutput.accept(REOItems.REDWOOD_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.RUBBER_BOAT.get());
                        pOutput.accept(REOItems.RUBBER_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.TEAK_BOAT.get());
                        pOutput.accept(REOItems.TEAK_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.WALNUT_BOAT.get());
                        pOutput.accept(REOItems.WALNUT_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.WILLOW_BOAT.get());
                        pOutput.accept(REOItems.WILLOW_CHEST_BOAT.get());

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

                        pOutput.accept(REOItems.ALUMINIUM_HORSE_ARMOR.get());

                        // Amethyst
                        pOutput.accept(REOItems.AMETHYST_HELMET.get());
                        pOutput.accept(REOItems.AMETHYST_CHESTPLATE.get());
                        pOutput.accept(REOItems.AMETHYST_LEGGINGS.get());
                        pOutput.accept(REOItems.AMETHYST_BOOTS.get());

                        pOutput.accept(REOItems.AMETHYST_HORSE_ARMOR.get());

                        // Bronze
                        pOutput.accept(REOItems.BRONZE_HELMET.get());
                        pOutput.accept(REOItems.BRONZE_CHESTPLATE.get());
                        pOutput.accept(REOItems.BRONZE_LEGGINGS.get());
                        pOutput.accept(REOItems.BRONZE_BOOTS.get());

                        pOutput.accept(REOItems.BRONZE_HORSE_ARMOR.get());

                        // Chain
                        //pOutput.accept(REOItems.HORSE_ARMOR_CHAIN.get());

                        // Enderite
                        pOutput.accept(REOItems.ENDERITE_HELMET.get());
                        pOutput.accept(REOItems.ENDERITE_CHESTPLATE.get());
                        pOutput.accept(REOItems.ENDERITE_LEGGINGS.get());
                        pOutput.accept(REOItems.ENDERITE_BOOTS.get());

                        pOutput.accept(REOItems.ENDERITE_HORSE_ARMOR.get());

                        // Netherite
                        //pOutput.accept(REOItems.HORSE_ARMOR_NETHERITE.get());

                        // Platinum
                        pOutput.accept(REOItems.PLATINUM_HELMET.get());
                        pOutput.accept(REOItems.PLATINUM_CHESTPLATE.get());
                        pOutput.accept(REOItems.PLATINUM_LEGGINGS.get());
                        pOutput.accept(REOItems.PLATINUM_BOOTS.get());

                        pOutput.accept(REOItems.PLATINUM_HORSE_ARMOR.get());

                        // Peridot
                        pOutput.accept(REOItems.PERIDOT_HELMET.get());
                        pOutput.accept(REOItems.PERIDOT_CHESTPLATE.get());
                        pOutput.accept(REOItems.PERIDOT_LEGGINGS.get());
                        pOutput.accept(REOItems.PERIDOT_BOOTS.get());

                        pOutput.accept(REOItems.PERIDOT_HORSE_ARMOR.get());

                        // Ruby
                        pOutput.accept(REOItems.RUBY_HELMET.get());
                        pOutput.accept(REOItems.RUBY_CHESTPLATE.get());
                        pOutput.accept(REOItems.RUBY_LEGGINGS.get());
                        pOutput.accept(REOItems.RUBY_BOOTS.get());

                        pOutput.accept(REOItems.RUBY_HORSE_ARMOR.get());

                        // Sapphire
                        pOutput.accept(REOItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(REOItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(REOItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(REOItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(REOItems.SAPPHIRE_HORSE_ARMOR.get());

                        // Silver
                        pOutput.accept(REOItems.SILVER_HELMET.get());
                        pOutput.accept(REOItems.SILVER_CHESTPLATE.get());
                        pOutput.accept(REOItems.SILVER_LEGGINGS.get());
                        pOutput.accept(REOItems.SILVER_BOOTS.get());

                        pOutput.accept(REOItems.SILVER_HORSE_ARMOR.get());

                        // Steel
                        pOutput.accept(REOItems.STEEL_HELMET.get());
                        pOutput.accept(REOItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(REOItems.STEEL_LEGGINGS.get());
                        pOutput.accept(REOItems.STEEL_BOOTS.get());

                        pOutput.accept(REOItems.STEEL_HORSE_ARMOR.get());

                    })
                    .build());



    public static RegistryObject<CreativeModeTab> FOOD_TAB = CREATIVE_MODE_TABS.register("realearthores_food",
            () -> CreativeModeTab.builder().withTabsBefore(REOCreativeModeTabs.TOOLS_TAB.getKey())
                    .icon(() -> new ItemStack(REOItems.ONION.get()))
                    .title(Component.translatable("tabs.realearthores_food"))
                    .displayItems((pParameters, pOutput) -> {

                        // Seeds
                        pOutput.accept(REOItems.BARLEY_SEED.get());
                        pOutput.accept(REOItems.CAULIFLOWER_SEED.get());
                        pOutput.accept(REOItems.COTTON_SEED.get());
                        pOutput.accept(REOItems.ENDER_LILLY_SEED.get());
                        pOutput.accept(REOItems.RICE_SEED.get());
                        pOutput.accept(REOItems.STRAWBERRY_SEED.get());
                        pOutput.accept(REOItems.TOMATO_SEED.get());

                        // Plants
                        pOutput.accept(REOItems.BARLEY_PLANT.get());
                        pOutput.accept(REOItems.COTTON_PLANT.get());
                        pOutput.accept(REOItems.RICE_PLANT.get());

                        // Flour
                        pOutput.accept(REOItems.BARLEY_FLOUR.get());
                        pOutput.accept(REOItems.WHEAT_FLOUR.get());

                        // Fruit
                        pOutput.accept(REOItems.CHERRY.get());
                        pOutput.accept(REOItems.CHESTNUT.get());
                        pOutput.accept(REOItems.DATES.get());
                        pOutput.accept(REOItems.LEMON.get());
                        pOutput.accept(REOItems.LIME.get());
                        pOutput.accept(REOItems.PAPAYA.get());
                        pOutput.accept(REOItems.PEACH.get());
                        pOutput.accept(REOItems.PLUM.get());
                        pOutput.accept(REOItems.WALNUT.get());

                        // Veg
                        pOutput.accept(REOItems.CAULIFLOWER.get());
                        pOutput.accept(REOItems.ONION.get());
                        pOutput.accept(REOItems.RICE.get());
                        pOutput.accept(REOItems.TOMATO.get());
                        pOutput.accept(REOItems.TOMATO_ROTTEN.get());

                        // Berries
                        pOutput.accept(REOItems.BLACKBERRY.get());
                        pOutput.accept(REOItems.BLUEBERRY.get());
                        pOutput.accept(REOItems.RASPBERRY.get());
                        pOutput.accept(REOItems.STRAWBERRY.get());

                        // Ore Seeds
                        //pOutput.accept(REOItems.ALUMINIUM_SEED.get());


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
                        pOutput.accept(REOBlocks.PURIFIER.get());

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

                        // Generator

                        pOutput.accept(REOBlocks.COAL_GENERATOR.get());


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