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
                    .icon(() -> new ItemStack(REOBlocks.URANIUM_BLOCK.get()))
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
                        pOutput.accept(REOBlocks.BLACK_LAMP.get());
                        pOutput.accept(REOBlocks.RED_LAMP.get());
                        pOutput.accept(REOBlocks.GREEN_LAMP.get());
                        pOutput.accept(REOBlocks.BROWN_LAMP.get());
                        pOutput.accept(REOBlocks.PURPLE_LAMP.get());
                        pOutput.accept(REOBlocks.CYAN_LAMP.get());
                        pOutput.accept(REOBlocks.LIGHT_GRAY_LAMP.get());
                        pOutput.accept(REOBlocks.GRAY_LAMP.get());
                        pOutput.accept(REOBlocks.PINK_LAMP.get());
                        pOutput.accept(REOBlocks.LIME_LAMP.get());
                        pOutput.accept(REOBlocks.YELLOW_LAMP.get());
                        pOutput.accept(REOBlocks.BLUE_LAMP.get());
                        pOutput.accept(REOBlocks.LIGHT_BLUE_LAMP.get());
                        pOutput.accept(REOBlocks.MAGENTA_LAMP.get());
                        pOutput.accept(REOBlocks.ORANGE_LAMP.get());
                        pOutput.accept(REOBlocks.WHITE_LAMP.get());

                        // Tree //
                        // Wood
                        // Oak
                        pOutput.accept(REOBlocks.RESISTANT_OAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_OAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_OAK_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_OAK_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_OAK_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_OAK_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_OAK_FENCE_GATE.get());

                        // Spruce
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get());

                        // Birch
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get());

                        // Jungle
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get());

                        // Acacia
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get());

                        // Dark Oak
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get());

                        // Mangrove
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get());

                        // Cherry
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_PLANKS.get());

                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHERRY_FENCE_GATE.get());

                        // Modded
                        // Balsa
                        pOutput.accept(REOBlocks.BALSA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_LOG.get());
                        pOutput.accept(REOBlocks.BALSA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_BALSA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_BALSA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get());
                        pOutput.accept(REOBlocks.BALSA_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_PLANKS.get());

                        pOutput.accept(REOBlocks.BALSA_SAPLING.get());
                        pOutput.accept(REOBlocks.BALSA_LEAVES.get());

                        pOutput.accept(REOBlocks.BALSA_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_STAIRS.get());
                        pOutput.accept(REOBlocks.BALSA_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_SLAB.get());
                        pOutput.accept(REOBlocks.BALSA_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_FENCE.get());
                        pOutput.accept(REOBlocks.BALSA_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_BALSA_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.BALSA_BUTTON.get());
                        pOutput.accept(REOBlocks.BALSA_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.BALSA_SIGN.get());
                        pOutput.accept(REOBlocks.BALSA_HANGING_SIGN.get());
                        pOutput.accept(REOItems.BALSA_BOAT.get());
                        pOutput.accept(REOItems.BALSA_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.BALSA_DOOR.get());
                        pOutput.accept(REOBlocks.BALSA_TRAPDOOR.get());

                        // Baobab
                        pOutput.accept(REOBlocks.BAOBAB_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_LOG.get());
                        pOutput.accept(REOBlocks.BAOBAB_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_BAOBAB_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_BAOBAB_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get());
                        pOutput.accept(REOBlocks.BAOBAB_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_PLANKS.get());

                        pOutput.accept(REOBlocks.BAOBAB_SAPLING.get());
                        pOutput.accept(REOBlocks.BAOBAB_LEAVES.get());

                        pOutput.accept(REOBlocks.BAOBAB_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_STAIRS.get());
                        pOutput.accept(REOBlocks.BAOBAB_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_SLAB.get());
                        pOutput.accept(REOBlocks.BAOBAB_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_FENCE.get());
                        pOutput.accept(REOBlocks.BAOBAB_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.BAOBAB_BUTTON.get());
                        pOutput.accept(REOBlocks.BAOBAB_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.BAOBAB_SIGN.get());
                        pOutput.accept(REOBlocks.BAOBAB_HANGING_SIGN.get());

                        pOutput.accept(REOItems.BAOBAB_BOAT.get());
                        pOutput.accept(REOItems.BAOBAB_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.BAOBAB_DOOR.get());
                        pOutput.accept(REOBlocks.BAOBAB_TRAPDOOR.get());

                        // Hill Cherry
                        pOutput.accept(REOBlocks.HILL_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_HILL_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get());

                        pOutput.accept(REOBlocks.HILL_CHERRY_SAPLING.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_LEAVES.get());

                        pOutput.accept(REOBlocks.HILL_CHERRY_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.HILL_CHERRY_BUTTON.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.HILL_CHERRY_SIGN.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_HANGING_SIGN.get());

                        pOutput.accept(REOItems.HILL_CHERRY_BOAT.get());
                        pOutput.accept(REOItems.HILL_CHERRY_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.HILL_CHERRY_DOOR.get());
                        pOutput.accept(REOBlocks.HILL_CHERRY_TRAPDOOR.get());

                        // Chestnut
                        pOutput.accept(REOBlocks.CHESTNUT_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_LOG.get());
                        pOutput.accept(REOBlocks.CHESTNUT_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_CHESTNUT_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_CHESTNUT_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get());
                        pOutput.accept(REOBlocks.CHESTNUT_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_PLANKS.get());

                        pOutput.accept(REOBlocks.CHESTNUT_SAPLING.get());
                        pOutput.accept(REOBlocks.CHESTNUT_LEAVES.get());

                        pOutput.accept(REOBlocks.CHESTNUT_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_STAIRS.get());
                        pOutput.accept(REOBlocks.CHESTNUT_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_SLAB.get());
                        pOutput.accept(REOBlocks.CHESTNUT_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_FENCE.get());
                        pOutput.accept(REOBlocks.CHESTNUT_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.CHESTNUT_BUTTON.get());
                        pOutput.accept(REOBlocks.CHESTNUT_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.CHESTNUT_SIGN.get());
                        pOutput.accept(REOBlocks.CHESTNUT_HANGING_SIGN.get());

                        pOutput.accept(REOItems.BOAT_CHESTNUT.get());
                        pOutput.accept(REOItems.CHESTNUT_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.CHESTNUT_DOOR.get());
                        pOutput.accept(REOBlocks.CHESTNUT_TRAPDOOR.get());

                        // Citrus
                        pOutput.accept(REOBlocks.CITRUS_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_LOG.get());
                        pOutput.accept(REOBlocks.CITRUS_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_CITRUS_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_CITRUS_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get());
                        pOutput.accept(REOBlocks.CITRUS_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_PLANKS.get());

                        pOutput.accept(REOBlocks.CITRUS_SAPLING.get());
                        pOutput.accept(REOBlocks.CITRUS_LEAVES.get());

                        pOutput.accept(REOBlocks.CITRUS_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_STAIRS.get());
                        pOutput.accept(REOBlocks.CITRUS_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_SLAB.get());
                        pOutput.accept(REOBlocks.CITRUS_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_FENCE.get());
                        pOutput.accept(REOBlocks.CITRUS_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.CITRUS_BUTTON.get());
                        pOutput.accept(REOBlocks.CITRUS_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.CITRUS_SIGN.get());
                        pOutput.accept(REOBlocks.CITRUS_HANGING_SIGN.get());

                        pOutput.accept(REOItems.CITRUS_BOAT.get());
                        pOutput.accept(REOItems.CITRUS_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.CITRUS_DOOR.get());
                        pOutput.accept(REOBlocks.CITRUS_TRAPDOOR.get());

                        // Ebony
                        pOutput.accept(REOBlocks.EBONY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_LOG.get());
                        pOutput.accept(REOBlocks.EBONY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_EBONY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_EBONY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get());
                        pOutput.accept(REOBlocks.EBONY_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_PLANKS.get());

                        pOutput.accept(REOBlocks.EBONY_SAPLING.get());
                        pOutput.accept(REOBlocks.EBONY_LEAVES.get());

                        pOutput.accept(REOBlocks.EBONY_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_STAIRS.get());
                        pOutput.accept(REOBlocks.EBONY_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_SLAB.get());
                        pOutput.accept(REOBlocks.EBONY_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_FENCE.get());
                        pOutput.accept(REOBlocks.EBONY_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_EBONY_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.EBONY_BUTTON.get());
                        pOutput.accept(REOBlocks.EBONY_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.EBONY_SIGN.get());
                        pOutput.accept(REOBlocks.EBONY_HANGING_SIGN.get());

                        pOutput.accept(REOItems.EBONY_BOAT.get());
                        pOutput.accept(REOItems.EBONY_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.EBONY_DOOR.get());
                        pOutput.accept(REOBlocks.EBONY_TRAPDOOR.get());

                        // Larch
                        pOutput.accept(REOBlocks.LARCH_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_LOG.get());
                        pOutput.accept(REOBlocks.LARCH_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_LARCH_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_LARCH_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get());
                        pOutput.accept(REOBlocks.LARCH_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_PLANKS.get());

                        pOutput.accept(REOBlocks.LARCH_SAPLING.get());
                        pOutput.accept(REOBlocks.LARCH_LEAVES.get());

                        pOutput.accept(REOBlocks.LARCH_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_STAIRS.get());
                        pOutput.accept(REOBlocks.LARCH_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_SLAB.get());
                        pOutput.accept(REOBlocks.LARCH_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_FENCE.get());
                        pOutput.accept(REOBlocks.LARCH_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_LARCH_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.LARCH_BUTTON.get());
                        pOutput.accept(REOBlocks.LARCH_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.LARCH_SIGN.get());
                        pOutput.accept(REOBlocks.LARCH_HANGING_SIGN.get());

                        pOutput.accept(REOItems.LARCH_BOAT.get());
                        pOutput.accept(REOItems.LARCH_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.LARCH_DOOR.get());
                        pOutput.accept(REOBlocks.LARCH_TRAPDOOR.get());

                        // Lime
                        pOutput.accept(REOBlocks.LIME_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_LOG.get());
                        pOutput.accept(REOBlocks.LIME_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_LIME_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_LIME_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get());
                        pOutput.accept(REOBlocks.LIME_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_PLANKS.get());

                        pOutput.accept(REOBlocks.LIME_SAPLING.get());
                        pOutput.accept(REOBlocks.LIME_LEAVES.get());

                        pOutput.accept(REOBlocks.LIME_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_STAIRS.get());
                        pOutput.accept(REOBlocks.LIME_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_SLAB.get());
                        pOutput.accept(REOBlocks.LIME_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_FENCE.get());
                        pOutput.accept(REOBlocks.LIME_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_LIME_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.LIME_BUTTON.get());
                        pOutput.accept(REOBlocks.LIME_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.LIME_SIGN.get());
                        pOutput.accept(REOBlocks.LIME_HANGING_SIGN.get());

                        pOutput.accept(REOItems.LIME_BOAT.get());
                        pOutput.accept(REOItems.LIME_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.LIME_DOOR.get());
                        pOutput.accept(REOBlocks.LIME_TRAPDOOR.get());

                        // Mahogany
                        pOutput.accept(REOBlocks.MAHOGANY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_LOG.get());
                        pOutput.accept(REOBlocks.MAHOGANY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_MAHOGANY_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_MAHOGANY_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get());
                        pOutput.accept(REOBlocks.MAHOGANY_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_PLANKS.get());

                        pOutput.accept(REOBlocks.MAHOGANY_SAPLING.get());
                        pOutput.accept(REOBlocks.MAHOGANY_LEAVES.get());

                        pOutput.accept(REOBlocks.MAHOGANY_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_STAIRS.get());
                        pOutput.accept(REOBlocks.MAHOGANY_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_SLAB.get());
                        pOutput.accept(REOBlocks.MAHOGANY_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_FENCE.get());
                        pOutput.accept(REOBlocks.MAHOGANY_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.MAHOGANY_BUTTON.get());
                        pOutput.accept(REOBlocks.MAHOGANY_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.MAHOGANY_SIGN.get());
                        pOutput.accept(REOBlocks.MAHOGANY_HANGING_SIGN.get());

                        pOutput.accept(REOItems.MAHOGANY_BOAT.get());
                        pOutput.accept(REOItems.MAHOGANY_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.MAHOGANY_DOOR.get());
                        pOutput.accept(REOBlocks.MAHOGANY_TRAPDOOR.get());

                        // Maple
                        pOutput.accept(REOBlocks.MAPLE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_LOG.get());
                        pOutput.accept(REOBlocks.MAPLE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get());
                        pOutput.accept(REOBlocks.MAPLE_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_PLANKS.get());

                        pOutput.accept(REOBlocks.MAPLE_SAPLING.get());
                        pOutput.accept(REOBlocks.MAPLE_LEAVES.get());

                        pOutput.accept(REOBlocks.MAPLE_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_STAIRS.get());
                        pOutput.accept(REOBlocks.MAPLE_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_SLAB.get());
                        pOutput.accept(REOBlocks.MAPLE_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_FENCE.get());
                        pOutput.accept(REOBlocks.MAPLE_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.MAPLE_BUTTON.get());
                        pOutput.accept(REOBlocks.MAPLE_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.MAPLE_SIGN.get());
                        pOutput.accept(REOBlocks.MAPLE_HANGING_SIGN.get());

                        pOutput.accept(REOItems.MAPLE_BOAT.get());
                        pOutput.accept(REOItems.MAPLE_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.MAPLE_DOOR.get());
                        pOutput.accept(REOBlocks.MAPLE_TRAPDOOR.get());

                        // Palm
                        pOutput.accept(REOBlocks.PALM_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_LOG.get());
                        pOutput.accept(REOBlocks.PALM_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_PALM_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_PALM_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get());
                        pOutput.accept(REOBlocks.PALM_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_PLANKS.get());

                        pOutput.accept(REOBlocks.PALM_SAPLING.get());
                        pOutput.accept(REOBlocks.PALM_LEAVES.get());

                        pOutput.accept(REOBlocks.PALM_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_STAIRS.get());
                        pOutput.accept(REOBlocks.PALM_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_SLAB.get());
                        pOutput.accept(REOBlocks.PALM_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_FENCE.get());
                        pOutput.accept(REOBlocks.PALM_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PALM_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.PALM_BUTTON.get());
                        pOutput.accept(REOBlocks.PALM_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.PALM_SIGN.get());
                        pOutput.accept(REOBlocks.PALM_HANGING_SIGN.get());

                        pOutput.accept(REOItems.PALM_BOAT.get());
                        pOutput.accept(REOItems.PALM_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.PALM_DOOR.get());
                        pOutput.accept(REOBlocks.PALM_TRAPDOOR.get());

                        // Papaya
                        pOutput.accept(REOBlocks.PAPAYA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_LOG.get());
                        pOutput.accept(REOBlocks.PAPAYA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_PAPAYA_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_PAPAYA_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get());
                        pOutput.accept(REOBlocks.PAPAYA_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_PLANKS.get());

                        pOutput.accept(REOBlocks.PAPAYA_SAPLING.get());
                        pOutput.accept(REOBlocks.PAPAYA_LEAVES.get());

                        pOutput.accept(REOBlocks.PAPAYA_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_STAIRS.get());
                        pOutput.accept(REOBlocks.PAPAYA_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_SLAB.get());
                        pOutput.accept(REOBlocks.PAPAYA_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_FENCE.get());
                        pOutput.accept(REOBlocks.PAPAYA_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.PAPAYA_BUTTON.get());
                        pOutput.accept(REOBlocks.PAPAYA_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.PAPAYA_SIGN.get());
                        pOutput.accept(REOBlocks.PAPAYA_HANGING_SIGN.get());

                        pOutput.accept(REOItems.PAPAYA_BOAT.get());
                        pOutput.accept(REOItems.PAPAYA_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.PAPAYA_DOOR.get());
                        pOutput.accept(REOBlocks.PAPAYA_TRAPDOOR.get());

                        // Pine
                        pOutput.accept(REOBlocks.PINE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_LOG.get());
                        pOutput.accept(REOBlocks.PINE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_PINE_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_PINE_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get());
                        pOutput.accept(REOBlocks.PINE_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_PLANKS.get());

                        pOutput.accept(REOBlocks.PINE_SAPLING.get());
                        pOutput.accept(REOBlocks.PINE_LEAVES.get());

                        pOutput.accept(REOBlocks.PINE_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_STAIRS.get());
                        pOutput.accept(REOBlocks.PINE_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_SLAB.get());
                        pOutput.accept(REOBlocks.PINE_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_FENCE.get());
                        pOutput.accept(REOBlocks.PINE_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PINE_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.PINE_BUTTON.get());
                        pOutput.accept(REOBlocks.PINE_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.PINE_SIGN.get());
                        pOutput.accept(REOBlocks.PINE_HANGING_SIGN.get());

                        pOutput.accept(REOItems.PINE_BOAT.get());
                        pOutput.accept(REOItems.PINE_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.PINE_DOOR.get());
                        pOutput.accept(REOBlocks.PINE_TRAPDOOR.get());

                        // Plum
                        pOutput.accept(REOBlocks.PLUM_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_LOG.get());
                        pOutput.accept(REOBlocks.PLUM_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_PLUM_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_PLUM_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get());
                        pOutput.accept(REOBlocks.PLUM_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_PLANKS.get());

                        pOutput.accept(REOBlocks.PLUM_SAPLING.get());
                        pOutput.accept(REOBlocks.PLUM_LEAVES.get());

                        pOutput.accept(REOBlocks.PLUM_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_STAIRS.get());
                        pOutput.accept(REOBlocks.PLUM_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_SLAB.get());
                        pOutput.accept(REOBlocks.PLUM_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_FENCE.get());
                        pOutput.accept(REOBlocks.PLUM_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_PLUM_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.PLUM_BUTTON.get());
                        pOutput.accept(REOBlocks.PLUM_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.PLUM_SIGN.get());
                        pOutput.accept(REOBlocks.PLUM_HANGING_SIGN.get());

                        pOutput.accept(REOItems.PLUM_BOAT.get());
                        pOutput.accept(REOItems.PLUM_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.PLUM_DOOR.get());
                        pOutput.accept(REOBlocks.PLUM_TRAPDOOR.get());

                        // Poplar
                        pOutput.accept(REOBlocks.POPLAR_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_LOG.get());
                        pOutput.accept(REOBlocks.POPLAR_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_POPLAR_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_POPLAR_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get());
                        pOutput.accept(REOBlocks.POPLAR_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_PLANKS.get());

                        pOutput.accept(REOBlocks.POPLAR_SAPLING.get());
                        pOutput.accept(REOBlocks.POPLAR_LEAVES.get());

                        pOutput.accept(REOBlocks.POPLAR_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_STAIRS.get());
                        pOutput.accept(REOBlocks.POPLAR_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_SLAB.get());
                        pOutput.accept(REOBlocks.POPLAR_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_FENCE.get());
                        pOutput.accept(REOBlocks.POPLAR_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.POPLAR_BUTTON.get());
                        pOutput.accept(REOBlocks.POPLAR_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.POPLAR_SIGN.get());
                        pOutput.accept(REOBlocks.POPLAR_HANGING_SIGN.get());

                        pOutput.accept(REOItems.POPLAR_BOAT.get());
                        pOutput.accept(REOItems.POPLAR_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.POPLAR_DOOR.get());
                        pOutput.accept(REOBlocks.POPLAR_TRAPDOOR.get());

                        // Redwood
                        pOutput.accept(REOBlocks.REDWOOD_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_LOG.get());
                        pOutput.accept(REOBlocks.REDWOOD_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_REDWOOD_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_REDWOOD_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get());
                        pOutput.accept(REOBlocks.REDWOOD_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_PLANKS.get());

                        pOutput.accept(REOBlocks.REDWOOD_SAPLING.get());
                        pOutput.accept(REOBlocks.REDWOOD_LEAVES.get());

                        pOutput.accept(REOBlocks.REDWOOD_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_STAIRS.get());
                        pOutput.accept(REOBlocks.REDWOOD_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_SLAB.get());
                        pOutput.accept(REOBlocks.REDWOOD_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_FENCE.get());
                        pOutput.accept(REOBlocks.REDWOOD_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.REDWOOD_BUTTON.get());
                        pOutput.accept(REOBlocks.REDWOOD_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.REDWOOD_SIGN.get());
                        pOutput.accept(REOBlocks.REDWOOD_HANGING_SIGN.get());

                        pOutput.accept(REOItems.REDWOOD_BOAT.get());
                        pOutput.accept(REOItems.REDWOOD_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.REDWOOD_DOOR.get());
                        pOutput.accept(REOBlocks.REDWOOD_TRAPDOOR.get());

                        // Rubber
                        pOutput.accept(REOBlocks.RUBBER_LOG.get());
                        pOutput.accept(REOBlocks.RUBBER_LOG_SAP.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_LOG.get());
                        pOutput.accept(REOBlocks.RUBBER_WOOD.get());
                        pOutput.accept(REOBlocks.RUBBER_WOOD_SAP.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_RUBBER_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_RUBBER_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get());
                        pOutput.accept(REOBlocks.RUBBER_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_PLANKS.get());

                        pOutput.accept(REOBlocks.RUBBER_SAPLING.get());
                        pOutput.accept(REOBlocks.RUBBER_LEAVES.get());

                        pOutput.accept(REOBlocks.RUBBER_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_STAIRS.get());
                        pOutput.accept(REOBlocks.RUBBER_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_SLAB.get());
                        pOutput.accept(REOBlocks.RUBBER_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_FENCE.get());
                        pOutput.accept(REOBlocks.RUBBER_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.RUBBER_BUTTON.get());
                        pOutput.accept(REOBlocks.RUBBER_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.RUBBER_SIGN.get());
                        pOutput.accept(REOBlocks.RUBBER_HANGING_SIGN.get());

                        pOutput.accept(REOItems.RUBBER_BOAT.get());
                        pOutput.accept(REOItems.RUBBER_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.RUBBER_DOOR.get());
                        pOutput.accept(REOBlocks.RUBBER_TRAPDOOR.get());

                        // Teak
                        pOutput.accept(REOBlocks.TEAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_LOG.get());
                        pOutput.accept(REOBlocks.TEAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_TEAK_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_TEAK_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get());
                        pOutput.accept(REOBlocks.TEAK_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_PLANKS.get());

                        pOutput.accept(REOBlocks.TEAK_SAPLING.get());
                        pOutput.accept(REOBlocks.TEAK_LEAVES.get());

                        pOutput.accept(REOBlocks.TEAK_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_STAIRS.get());
                        pOutput.accept(REOBlocks.TEAK_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_SLAB.get());
                        pOutput.accept(REOBlocks.TEAK_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_FENCE.get());
                        pOutput.accept(REOBlocks.TEAK_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_TEAK_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.TEAK_BUTTON.get());
                        pOutput.accept(REOBlocks.TEAK_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.TEAK_SIGN.get());
                        pOutput.accept(REOBlocks.TEAK_HANGING_SIGN.get());

                        pOutput.accept(REOItems.TEAK_BOAT.get());
                        pOutput.accept(REOItems.TEAK_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.TEAK_DOOR.get());
                        pOutput.accept(REOBlocks.TEAK_TRAPDOOR.get());

                        // Walnut
                        pOutput.accept(REOBlocks.WALNUT_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_LOG.get());
                        pOutput.accept(REOBlocks.WALNUT_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_WALNUT_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_WALNUT_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get());
                        pOutput.accept(REOBlocks.WALNUT_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_PLANKS.get());

                        pOutput.accept(REOBlocks.WALNUT_SAPLING.get());
                        pOutput.accept(REOBlocks.WALNUT_LEAVES.get());

                        pOutput.accept(REOBlocks.WALNUT_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_STAIRS.get());
                        pOutput.accept(REOBlocks.WALNUT_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_SLAB.get());
                        pOutput.accept(REOBlocks.WALNUT_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_FENCE.get());
                        pOutput.accept(REOBlocks.WALNUT_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.WALNUT_BUTTON.get());
                        pOutput.accept(REOBlocks.WALNUT_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.WALNUT_SIGN.get());
                        pOutput.accept(REOBlocks.WALNUT_HANGING_SIGN.get());

                        pOutput.accept(REOItems.WALNUT_BOAT.get());
                        pOutput.accept(REOItems.WALNUT_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.WALNUT_DOOR.get());
                        pOutput.accept(REOBlocks.WALNUT_TRAPDOOR.get());

                        // Willow
                        pOutput.accept(REOBlocks.WILLOW_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_LOG.get());
                        pOutput.accept(REOBlocks.WILLOW_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_WOOD.get());
                        pOutput.accept(REOBlocks.STRIPPED_WILLOW_LOG.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get());
                        pOutput.accept(REOBlocks.STRIPPED_WILLOW_WOOD.get());
                        pOutput.accept(REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get());
                        pOutput.accept(REOBlocks.WILLOW_PLANKS.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_PLANKS.get());

                        pOutput.accept(REOBlocks.WILLOW_SAPLING.get());
                        pOutput.accept(REOBlocks.WILLOW_LEAVES.get());

                        pOutput.accept(REOBlocks.WILLOW_STAIRS.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_STAIRS.get());
                        pOutput.accept(REOBlocks.WILLOW_SLAB.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_SLAB.get());
                        pOutput.accept(REOBlocks.WILLOW_FENCE.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_FENCE.get());
                        pOutput.accept(REOBlocks.WILLOW_FENCE_GATE.get());
                        pOutput.accept(REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get());

                        pOutput.accept(REOBlocks.WILLOW_BUTTON.get());
                        pOutput.accept(REOBlocks.WILLOW_PRESSURE_PLATE.get());

                        pOutput.accept(REOBlocks.WILLOW_SIGN.get());
                        pOutput.accept(REOBlocks.WILLOW_HANGING_SIGN.get());

                        pOutput.accept(REOItems.WILLOW_BOAT.get());
                        pOutput.accept(REOItems.WILLOW_CHEST_BOAT.get());

                        pOutput.accept(REOBlocks.WILLOW_DOOR.get());
                        pOutput.accept(REOBlocks.WILLOW_TRAPDOOR.get());


                        // Ores //
                        // Overworld Ore
                        pOutput.accept(REOBlocks.ALUMINUM_ORE.get());
                        pOutput.accept(REOBlocks.LEAD_ORE.get());
                        pOutput.accept(REOBlocks.NICKEL_ORE.get());
                        pOutput.accept(REOBlocks.PLATINUM_ORE.get());
                        pOutput.accept(REOBlocks.SILVER_ORE.get());
                        pOutput.accept(REOBlocks.TIN_ORE.get());
                        pOutput.accept(REOBlocks.URANIUM_ORE.get());
                        pOutput.accept(REOBlocks.ZINC_ORE.get());

                        // Cluster
                        pOutput.accept(REOBlocks.PERIDOT_CLUSTER.get());
                        pOutput.accept(REOBlocks.LARGE_PERIDOT_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_PERIDOT_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_PERIDOT_BUD.get());

                        pOutput.accept(REOBlocks.RUBY_CLUSTER.get());
                        pOutput.accept(REOBlocks.LARGE_RUBY_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_RUBY_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_RUBY_BUD.get());

                        pOutput.accept(REOBlocks.SAPPHIRE_CLUSTER.get());
                        pOutput.accept(REOBlocks.LARGE_SAPPHIRE_BUD.get());
                        pOutput.accept(REOBlocks.MEDIUM_SAPPHIRE_BUD.get());
                        pOutput.accept(REOBlocks.SMALL_SAPPHIRE_BUD.get());

                        // Gravel Ore
                        pOutput.accept(REOBlocks.ALUMINUM_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.COAL_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.COPPER_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.DIAMOND_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.EMERALD_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.GOLD_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.IRON_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.LAPIS_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.LEAD_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.NICKEL_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.PLATINUM_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.REDSTONE_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.SILVER_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.TIN_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.URANIUM_GRAVEL_ORE.get());
                        pOutput.accept(REOBlocks.ZINC_GRAVEL_ORE.get());

                        // Deepslate Ore
                        pOutput.accept(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_LEAD_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_NICKEL_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_URANIUM_ORE.get());
                        pOutput.accept(REOBlocks.DEEPSLATE_ZINC_ORE.get());

                        // Nether Ore
                        pOutput.accept(REOBlocks.NETHER_ALUMINIUM_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_COAL_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_COPPER_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_DIAMOND_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_EMERALD_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_IRON_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_LAPIS_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_LEAD_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_NICKEL_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_PLATINUM_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_REDSTONE_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_SILVER_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_TIN_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_URANIUM_ORE.get());
                        pOutput.accept(REOBlocks.NETHER_ZINC_ORE.get());

                        // Nether Ore
                        pOutput.accept(REOBlocks.ENDERITE_ORE.get());

                        // Storage //
                        // Ingot Storage
                        pOutput.accept(REOBlocks.ALUMINUM_BLOCK.get());
                        pOutput.accept(REOBlocks.BRASS_BLOCK.get());
                        pOutput.accept(REOBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(REOBlocks.ELECTRUM_BLOCK.get());
                        pOutput.accept(REOBlocks.ENDERITE_BLOCK.get());
                        pOutput.accept(REOBlocks.LEAD_BLOCK.get());
                        pOutput.accept(REOBlocks.NICKEL_BLOCK.get());
                        pOutput.accept(REOBlocks.PERIDOT_BLOCK.get());
                        pOutput.accept(REOBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(REOBlocks.RUBY_BLOCK.get());
                        pOutput.accept(REOBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(REOBlocks.SILVER_BLOCK.get());
                        pOutput.accept(REOBlocks.STEEL_BLOCK.get());
                        pOutput.accept(REOBlocks.TIN_BLOCK.get());
                        pOutput.accept(REOBlocks.URANIUM_BLOCK.get());
                        pOutput.accept(REOBlocks.ZINC_BLOCK.get());

                        // Raw Storage
                        pOutput.accept(REOBlocks.RAW_ALUMINIUM_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_ENDERITE_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_LEAD_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_NICKEL_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_SILVER_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_TIN_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_URANIUM_BLOCK.get());
                        pOutput.accept(REOBlocks.RAW_ZINC_BLOCK.get());

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