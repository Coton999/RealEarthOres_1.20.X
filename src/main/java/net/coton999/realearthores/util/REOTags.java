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

        public static final TagKey<Item> BALSA_LOGS = tag("balsa_logs");
        public static final TagKey<Item> BAOBAB_LOGS = tag("baobab_logs");
        public static final TagKey<Item> HILL_CHERRY_LOGS = tag("hill_cherry_logs");
        public static final TagKey<Item> CHESTNUT_LOGS = tag("chestnut_logs");
        public static final TagKey<Item> CITRUS_LOGS = tag("citrus_logs");
        public static final TagKey<Item> EBONY_LOGS = tag("ebony_logs");
        public static final TagKey<Item> LARCH_LOGS = tag("larch_logs");
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

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));
        }
    }
}