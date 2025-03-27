package net.coton999.realearthores.util;

import net.coton999.realearthores.RealEarthOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class REOTags {
    public static class Blocks {
            public static final TagKey<Block> MINEABLE_WITH_REO_SHEARS = tag("mineable_with_reo_shears");
            public static final TagKey<Block> MINEABLE_WITH_SICKLE = tag("mineable_with_sickle");
            public static final TagKey<Block> MINEABLE_WITH_PAXEL = tag("mineable_with_paxel");

            // Wood
            public static final TagKey<Block> BALSA_LOGS = tag("balsa_logs");
            public static final TagKey<Block> BAOBAB_LOGS = tag("baobab_logs");
            public static final TagKey<Block> HILL_CHERRY_LOGS = tag("hill_cherry_logs");
            public static final TagKey<Block> CHESTNUT_LOGS = tag("chestnut_logs");
            public static final TagKey<Block> CITRUS_LOGS = tag("citrus_logs");
            public static final TagKey<Block> EBONY_LOGS = tag("ebony_logs");
            public static final TagKey<Block> LARCH_LOGS = tag("larch_logs");
            public static final TagKey<Block> MAHOGANY_LOGS = tag("mahogany_logs");
            public static final TagKey<Block> MAPLE_LOGS = tag("maple_logs");
            public static final TagKey<Block> PALM_LOGS = tag("palm_logs");
            public static final TagKey<Block> PAPAYA_LOGS = tag("papaya_logs");
            public static final TagKey<Block> PINE_LOGS = tag("pine_logs");
            public static final TagKey<Block> PLUM_LOGS = tag("plum_logs");
            public static final TagKey<Block> POPLAR_LOGS = tag("poplar_logs");
            public static final TagKey<Block> REDWOOD_LOGS = tag("redwood_logs");
            public static final TagKey<Block> RUBBER_LOGS = tag("rubber_logs");
            public static final TagKey<Block> TEAK_LOGS = tag("teak_logs");
            public static final TagKey<Block> WALNUT_LOGS = tag("walnut_logs");
            public static final TagKey<Block> WILLOW_LOGS = tag("willow_logs");
            public static final TagKey<Block> VANILLA_RESISTANT_LOGS = tag("vanilla_resistant_logs");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));

        }
    }

    public static class Items {
        public static final TagKey<Item> GEM_GEAR_TIER = tag("gem_gear_tier");

        // Wood
        public static final TagKey<Item> BALSA_LOGS = tag("balsa_logs");
        public static final TagKey<Item> BAOBAB_LOGS = tag("baobab_logs");
        public static final TagKey<Item> HILL_CHERRY_LOGS = tag("hill_cherry_logs");
        public static final TagKey<Item> CHESTNUT_LOGS = tag("chestnut_logs");
        public static final TagKey<Item> CITRUS_LOGS = tag("citrus_logs");
        public static final TagKey<Item> EBONY_LOGS = tag("ebony_logs");
        public static final TagKey<Item> LARCH_LOGS = tag("larch_logs");
        public static final TagKey<Item> LIME_LOGS = tag("lime_logs");
        public static final TagKey<Item> MAHOGANY_LOGS = tag("mahogany_logs");
        public static final TagKey<Item> MAPLE_LOGS = tag("maple_logs");
        public static final TagKey<Item> PALM_LOGS = tag("palm_logs");
        public static final TagKey<Item> PAPAYA_LOGS = tag("papaya_logs");
        public static final TagKey<Item> PINE_LOGS = tag("pine_logs");
        public static final TagKey<Item> PLUM_LOGS = tag("plum_logs");
        public static final TagKey<Item> POPLAR_LOGS = tag("poplar_logs");
        public static final TagKey<Item> REDWOOD_LOGS = tag("redwood_logs");
        public static final TagKey<Item> RUBBER_LOGS = tag("rubber_logs");
        public static final TagKey<Item> TEAK_LOGS = tag("teak_logs");
        public static final TagKey<Item> WALNUT_LOGS = tag("walnut_logs");
        public static final TagKey<Item> WILLOW_LOGS = tag("willow_logs");
        public static final TagKey<Item> VANILLA_RESISTANT_LOGS = tag("vanilla_resistant_logs");

        // Ores
        public static final TagKey<Item> ALUMINIUM_ORES = tag("aluminium_ores");
        public static final TagKey<Item> LEAD_ORES = tag("lead_ores");
        public static final TagKey<Item> NICKEL_ORES = tag("nickel_ores");
        public static final TagKey<Item> PLATINUM_ORES = tag("platinum_ores");
        public static final TagKey<Item> SILVER_ORES = tag("silver_ores");
        public static final TagKey<Item> TIN_ORES = tag("tin_ores");
        public static final TagKey<Item> URANIUM_ORES = tag("uranium_ores");
        public static final TagKey<Item> ZINC_ORES = tag("zinc_ores");

        // Dusts
        public static final TagKey<Item> ALUMINIUM_DUSTS = tag("aluminium_dusts");
        public static final TagKey<Item> AMETHYST_DUSTS = tag("amethyst_dusts");
        public static final TagKey<Item> BRASS_DUSTS = tag("brass_dusts");
        public static final TagKey<Item> BRONZE_DUSTS = tag("bronze_dusts");
        public static final TagKey<Item> COPPER_DUSTS = tag("copper_dusts");
        public static final TagKey<Item> DIAMOND_DUSTS = tag("diamond_dusts");
        public static final TagKey<Item> ELECTRUM_DUSTS = tag("electrum_dusts");
        public static final TagKey<Item> EMERALD_DUSTS = tag("emerald_dusts");
        public static final TagKey<Item> ENDERITE_DUSTS = tag("enderite_dusts");
        public static final TagKey<Item> GOLD_DUSTS = tag("gold_dusts");
        public static final TagKey<Item> IRON_DUSTS = tag("iron_dusts");
        public static final TagKey<Item> LEAD_DUSTS = tag("lead_dusts");
        public static final TagKey<Item> NETHERITE_DUSTS = tag("netherite_dusts");
        public static final TagKey<Item> NICKEL_DUSTS = tag("nickel_dusts");
        public static final TagKey<Item> OBSIDIAN_DUSTS = tag("obsidian_dusts");
        public static final TagKey<Item> PERIDOT_DUSTS = tag("peridot_dusts");
        public static final TagKey<Item> PLATINUM_DUSTS = tag("platinum_dusts");
        public static final TagKey<Item> RUBY_DUSTS = tag("ruby_dusts");
        public static final TagKey<Item> SAPPHIRE_DUSTS = tag("sapphire_dusts");
        public static final TagKey<Item> SILVER_DUSTS = tag("silver_dusts");
        public static final TagKey<Item> STEEL_DUSTS = tag("steel_dusts");
        public static final TagKey<Item> TIN_DUSTS = tag("tin_dusts");
        public static final TagKey<Item> URANIUM_DUSTS = tag("uranium_dusts");
        public static final TagKey<Item> ZINC_DUSTS = tag("zinc_dusts");

        // Tools & Armor
        public static final TagKey<Item> ALUMINIUM_TOOLS_AND_ARMOR = tag("aluminium_tools_and_armor");
        public static final TagKey<Item> AMETHYST_TOOLS_AND_ARMOR = tag("amethyst_tools_and_armor");
        public static final TagKey<Item> BRONZE_TOOLS_AND_ARMOR = tag("bronze_tools_and_armor");
        public static final TagKey<Item> DIAMOND_TOOLS_AND_ARMOR = tag("daimond_tools_and_armor");
        public static final TagKey<Item> ENDERITE_TOOLS_AND_ARMOR = tag("enderite_tools_and_armor");
        public static final TagKey<Item> GOLD_TOOLS_AND_ARMOR = tag("gold_tools_and_armor");
        public static final TagKey<Item> IRON_TOOLS_AND_ARMOR = tag("iron_tools_and_armor");
        public static final TagKey<Item> NETHERITE_TOOLS_AND_ARMOR = tag("netherite_tools_and_armor");
        public static final TagKey<Item> PERIDOT_TOOLS_AND_ARMOR = tag("peridot_tools_and_armor");
        public static final TagKey<Item> PLATINUM_TOOLS_AND_ARMOR = tag("platinum_tools_and_armor");
        public static final TagKey<Item> RUBY_TOOLS_AND_ARMOR = tag("ruby_tools_and_armor");
        public static final TagKey<Item> SAPPHIRE_TOOLS_AND_ARMOR = tag("sapphire_tools_and_armor");
        public static final TagKey<Item> SILVER_TOOLS_AND_ARMOR = tag("silver_tools_and_armor");
        public static final TagKey<Item> STEEL_TOOLS_AND_ARMOR = tag("steel_tools_and_armor");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));
        }
    }
}