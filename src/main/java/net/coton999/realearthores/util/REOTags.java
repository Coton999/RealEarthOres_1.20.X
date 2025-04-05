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
            public static final TagKey<Block> MINEABLE_WITH_REO_SHEARS = reoTag("mineable_with_reo_shears");
            public static final TagKey<Block> MINEABLE_WITH_SICKLE = reoTag("mineable_with_sickle");
            public static final TagKey<Block> MINEABLE_WITH_PAXEL = reoTag("mineable_with_paxel");

        // Wood
        public static final TagKey<Block> LOGS_BALSA = reoTag("wood/logs/balsa");
        public static final TagKey<Block> LOGS_BAOBAB = reoTag("wood/logs/baobab");
        public static final TagKey<Block> LOGS_HILL_CHERRY = reoTag("wood/logs/hill_cherry");
        public static final TagKey<Block> LOGS_CHESTNUT = reoTag("wood/logs/chestnut");
        public static final TagKey<Block> LOGS_CITRUS = reoTag("wood/logs/citrus");
        public static final TagKey<Block> LOGS_EBONY = reoTag("wood/logs/ebony");
        public static final TagKey<Block> LOGS_LARCH = reoTag("wood/logs/larch");
        public static final TagKey<Block> LOGS_LIME = reoTag("wood/logs/lime");
        public static final TagKey<Block> LOGS_MAHOGANY = reoTag("wood/logs/mahogany");
        public static final TagKey<Block> LOGS_MAPLE = reoTag("wood/logs/maple");
        public static final TagKey<Block> LOGS_PALM = reoTag("wood/logs/palm");
        public static final TagKey<Block> LOGS_PAPAYA = reoTag("wood/logs/papaya");
        public static final TagKey<Block> LOGS_PINE = reoTag("wood/logs/pine");
        public static final TagKey<Block> LOGS_PLUM = reoTag("wood/logs/plum");
        public static final TagKey<Block> LOGS_POPLAR = reoTag("wood/logs/poplar");
        public static final TagKey<Block> LOGS_REDWOOD = reoTag("wood/logs/redwood");
        public static final TagKey<Block> LOGS_RUBBER = reoTag("wood/logs/rubber");
        public static final TagKey<Block> LOGS_TEAK = reoTag("wood/logs/teak");
        public static final TagKey<Block> LOGS_WALNUT = reoTag("wood/logs/walnut");
        public static final TagKey<Block> LOGS_WILLOW = reoTag("wood/logs/willow");
        public static final TagKey<Block> LOGS_VANILLA_RESISTANT = reoTag("wood/logs/vanilla_resistant");

        // Ores
        public static final TagKey<Block> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Block> ORES_LEAD = forgeTag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = forgeTag("ores/nickel");
        public static final TagKey<Block> ORES_PLATINUM = forgeTag("ores/platinum");
        public static final TagKey<Block> ORES_SILVER = forgeTag("ores/silver");
        public static final TagKey<Block> ORES_TIN = forgeTag("ores/tin");
        public static final TagKey<Block> ORES_URANIUM = forgeTag("ores/uranium");
        public static final TagKey<Block> ORES_ZINC = forgeTag("ores/zinc");


        private static TagKey<Block> reoTag(String name) {
            return BlockTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GEARS_TIER_GEM = reoTag("gears_tier_gem");

        // Gears
        public static final TagKey<Item> GEARS_ALUMINUM = forgeTag("gears/aluminum");
        public static final TagKey<Item> GEARS_AMETHYST = forgeTag("gears/amethyst");
        public static final TagKey<Item> GEARS_BRASS = forgeTag("gears/brass");
        public static final TagKey<Item> GEARS_BRONZE = forgeTag("gears/bronze");
        public static final TagKey<Item> GEARS_COPPER = forgeTag("gears/copper");
        public static final TagKey<Item> GEARS_DIAMOND = forgeTag("gears/diamond");
        public static final TagKey<Item> GEARS_ELECTRTUM = forgeTag("gears/electrum");
        public static final TagKey<Item> GEARS_EMERALD = forgeTag("gears/emerald");
        public static final TagKey<Item> GEARS_ENDERITE = forgeTag("gears/enderite");
        public static final TagKey<Item> GEARS_GOLD = forgeTag("gears/gold");
        public static final TagKey<Item> GEARS_IRON = forgeTag("gears/iron");
        public static final TagKey<Item> GEARS_LEAD = forgeTag("gears/lead");
        public static final TagKey<Item> GEARS_NICKEL = forgeTag("gears/nickel");
        public static final TagKey<Item> GEARS_PERIDOT = forgeTag("gears/peridot");
        public static final TagKey<Item> GEARS_PLATINUM = forgeTag("gears/platinum");
        public static final TagKey<Item> GEARS_RUBY = forgeTag("gears/ruby");
        public static final TagKey<Item> GEARS_SAPPHIRE = forgeTag("gears/sapphire");
        public static final TagKey<Item> GEARS_SILVER = forgeTag("gears/silver");
        public static final TagKey<Item> GEARS_STEEL = forgeTag("gears/steel");
        public static final TagKey<Item> GEARS_TIN = forgeTag("gears/tin");
        public static final TagKey<Item> GEARS_ZINC = forgeTag("gears/zinc");

        // Wood
        public static final TagKey<Item> BALSA_LOGS = reoTag("wood/logs/balsa");
        public static final TagKey<Item> BAOBAB_LOGS = reoTag("wood/logs/baobab");
        public static final TagKey<Item> HILL_CHERRY_LOGS = reoTag("wood/logs/hill_cherry");
        public static final TagKey<Item> CHESTNUT_LOGS = reoTag("wood/logs/chestnut");
        public static final TagKey<Item> CITRUS_LOGS = reoTag("wood/logs/citrus");
        public static final TagKey<Item> EBONY_LOGS = reoTag("wood/logs/ebony");
        public static final TagKey<Item> LARCH_LOGS = reoTag("wood/logs/larch");
        public static final TagKey<Item> LIME_LOGS = reoTag("wood/logs/lime");
        public static final TagKey<Item> MAHOGANY_LOGS = reoTag("wood/logs/mahogany");
        public static final TagKey<Item> MAPLE_LOGS = reoTag("wood/logs/maple");
        public static final TagKey<Item> PALM_LOGS = reoTag("wood/logs/palm");
        public static final TagKey<Item> PAPAYA_LOGS = reoTag("wood/logs/papaya");
        public static final TagKey<Item> PINE_LOGS = reoTag("wood/logs/pine");
        public static final TagKey<Item> PLUM_LOGS = reoTag("wood/logs/plum");
        public static final TagKey<Item> POPLAR_LOGS = reoTag("wood/logs/poplar");
        public static final TagKey<Item> REDWOOD_LOGS = reoTag("wood/logs/redwood");
        public static final TagKey<Item> RUBBER_LOGS = reoTag("wood/logs/rubber");
        public static final TagKey<Item> TEAK_LOGS = reoTag("wood/logs/teak");
        public static final TagKey<Item> WALNUT_LOGS = reoTag("wood/logs/walnut");
        public static final TagKey<Item> WILLOW_LOGS = reoTag("wood/logs/willow");
        public static final TagKey<Item> VANILLA_RESISTANT_LOGS = reoTag("wood/logs/vanilla_resistant");

        // Ores
        public static final TagKey<Item> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Item> ORES_LEAD = forgeTag("ores/lead");
        public static final TagKey<Item> ORES_NICKEL = forgeTag("ores/nickel");
        public static final TagKey<Item> ORES_PLATINUM = forgeTag("ores/platinum");
        public static final TagKey<Item> ORES_SILVER = forgeTag("ores/silver");
        public static final TagKey<Item> ORES_TIN = forgeTag("ores/tin");
        public static final TagKey<Item> ORES_URANIUM = forgeTag("ores/uranium");
        public static final TagKey<Item> ORES_ZINC = forgeTag("ores/zinc");

        // Raw Materials
        public static final TagKey<Item> RAW_MATERIALS_ALUMINUM = forgeTag("raw_materials/aluminum");
        public static final TagKey<Item> RAW_MATERIALS_LEAD = forgeTag("raw_materials/lead");
        public static final TagKey<Item> RAW_MATERIALS_NICKEL = forgeTag("raw_materials/nickel");
        public static final TagKey<Item> RAW_MATERIALS_PLATINUM = forgeTag("raw_materials/platinum");
        public static final TagKey<Item> RAW_MATERIALS_SILVER = forgeTag("raw_materials/silver");
        public static final TagKey<Item> RAW_MATERIALS_TIN = forgeTag("raw_materials/tin");
        public static final TagKey<Item> RAW_MATERIALS_URANIUM = forgeTag("raw_materials/uranium");
        public static final TagKey<Item> RAW_MATERIALS_ZINC = forgeTag("raw_materials/zinc");

        // Ingots
        public static final TagKey<Item> INGOTS_ALUMINUM = forgeTag("ingots/aluminum");
        public static final TagKey<Item> INGOTS_BRASS = forgeTag("ingots/brass");
        public static final TagKey<Item> INGOTS_BRONZE = forgeTag("ingots/bronze");
        public static final TagKey<Item> INGOTS_ELECTRUM = forgeTag("ingots/electrum");
        public static final TagKey<Item> INGOTS_ENDERITE = forgeTag("ingots/enderite");
        public static final TagKey<Item> INGOTS_LEAD = forgeTag("ingots/lead");
        public static final TagKey<Item> INGOTS_NICKEL = forgeTag("ingots/nickel");
        public static final TagKey<Item> INGOTS_OBSIDIAN = forgeTag("ingots/obsidian");
        public static final TagKey<Item> INGOTS_PLATINUM = forgeTag("ingots/platinum");
        public static final TagKey<Item> INGOTS_SILVER = forgeTag("ingots/silver");
        public static final TagKey<Item> INGOTS_STEEL = forgeTag("ingots/steel");
        public static final TagKey<Item> INGOTS_TIN = forgeTag("ingots/tin");
        public static final TagKey<Item> INGOTS_URANIUM = forgeTag("ingots/uranium");
        public static final TagKey<Item> INGOTS_ZINC = forgeTag("ingots/zinc");

        // Dirty
        public static final TagKey<Item> DIRTY_ALUMINUM = reoTag("dirty_dusts/aluminum");
        public static final TagKey<Item> DIRTY_AMETHYST = reoTag("dirty_dusts/amethyst");
        public static final TagKey<Item> DIRTY_BRASS = reoTag("dirty_dusts/brass");
        public static final TagKey<Item> DIRTY_BRONZE = reoTag("dirty_dusts/bronze");
        public static final TagKey<Item> DIRTY_COPPER = reoTag("dirty_dusts/copper");
        public static final TagKey<Item> DIRTY_DIAMOND = reoTag("dirty_dusts/diamond");
        public static final TagKey<Item> DIRTY_ELECTRTUM = reoTag("dirty_dusts/electrum");
        public static final TagKey<Item> DIRTY_EMERALD = reoTag("dirty_dusts/emerald");
        public static final TagKey<Item> DIRTY_ENDERITE = reoTag("dirty_dusts/enderite");
        public static final TagKey<Item> DIRTY_GOLD = reoTag("dirty_dusts/gold");
        public static final TagKey<Item> DIRTY_IRON = reoTag("dirty_dusts/iron");
        public static final TagKey<Item> DIRTY_LEAD = reoTag("dirty_dusts/lead");
        public static final TagKey<Item> DIRTY_NETHERITE = reoTag("dirty_dusts/netherite");
        public static final TagKey<Item> DIRTY_NICKEL = reoTag("dirty_dusts/nickel");
        public static final TagKey<Item> DIRTY_OBSIDIAN = reoTag("dirty_dusts/obsidian");
        public static final TagKey<Item> DIRTY_PERIDOT = reoTag("dirty_dusts/peridot");
        public static final TagKey<Item> DIRTY_PLATINUM = reoTag("dirty_dusts/platinum");
        public static final TagKey<Item> DIRTY_RUBY = reoTag("dirty_dusts/ruby");
        public static final TagKey<Item> DIRTY_SAPPHIRE = reoTag("dirty_dusts/sapphire");
        public static final TagKey<Item> DIRTY_SILVER = reoTag("dirty_dusts/silver");
        public static final TagKey<Item> DIRTY_STEEL = reoTag("dirty_dusts/steel");
        public static final TagKey<Item> DIRTY_TIN = reoTag("dirty_dusts/tin");
        public static final TagKey<Item> DIRTY_URANIUM = reoTag("dirty_dusts/uranium");
        public static final TagKey<Item> DIRTY_ZINC = reoTag("dirty_dusts/zinc");

        // Dusts
        public static final TagKey<Item> DUSTS_ALUMINUM = forgeTag("dusts/aluminum");
        public static final TagKey<Item> DUSTS_AMETHYST = forgeTag("dusts/amethyst");
        public static final TagKey<Item> DUSTS_BRASS = forgeTag("dusts/brass");
        public static final TagKey<Item> DUSTS_BRONZE = forgeTag("dusts/bronze");
        public static final TagKey<Item> DUSTS_COPPER = forgeTag("dusts/copper");
        public static final TagKey<Item> DUSTS_DIAMOND = forgeTag("dusts/diamond");
        public static final TagKey<Item> DUSTS_ELECTRTUM = forgeTag("dusts/electrum");
        public static final TagKey<Item> DUSTS_EMERALD = forgeTag("dusts/emerald");
        public static final TagKey<Item> DUSTS_ENDERITE = forgeTag("dusts/enderite");
        public static final TagKey<Item> DUSTS_GOLD = forgeTag("dusts/gold");
        public static final TagKey<Item> DUSTS_IRON = forgeTag("dusts/iron");
        public static final TagKey<Item> DUSTS_LEAD = forgeTag("dusts/lead");
        public static final TagKey<Item> DUSTS_NETHERITE = forgeTag("dusts/netherite");
        public static final TagKey<Item> DUSTS_NICKEL = forgeTag("dusts/nickel");
        public static final TagKey<Item> DUSTS_OBSIDIAN = forgeTag("dusts/obsidian");
        public static final TagKey<Item> DUSTS_PERIDOT = forgeTag("dusts/peridot");
        public static final TagKey<Item> DUSTS_PLATINUM = forgeTag("dusts/platinum");
        public static final TagKey<Item> DUSTS_RUBY = forgeTag("dusts/ruby");
        public static final TagKey<Item> DUSTS_SAPPHIRE = forgeTag("dusts/sapphire");
        public static final TagKey<Item> DUSTS_SILVER = forgeTag("dusts/silver");
        public static final TagKey<Item> DUSTS_STEEL = forgeTag("dusts/steel");
        public static final TagKey<Item> DUSTS_TIN = forgeTag("dusts/tin");
        public static final TagKey<Item> DUSTS_URANIUM = forgeTag("dusts/uranium");
        public static final TagKey<Item> DUSTS_ZINC = forgeTag("dusts/zinc");

        // Tools & Armor
        public static final TagKey<Item> TOOLS_AND_ARMOR_ALUMINUM = reoTag("tools_and_armor/aluminum");
        public static final TagKey<Item> TOOLS_AND_ARMOR_AMETHYST = reoTag("tools_and_armor/amethyst");
        public static final TagKey<Item> TOOLS_AND_ARMOR_BRONZE = reoTag("tools_and_armor/bronze");
        public static final TagKey<Item> TOOLS_AND_ARMOR_DIAMOND = reoTag("tools_and_armor/diamond");
        public static final TagKey<Item> TOOLS_AND_ARMOR_ENDERITE = reoTag("tools_and_armor/enderite");
        public static final TagKey<Item> TOOLS_AND_ARMOR_GOLD = reoTag("tools_and_armor/gold");
        public static final TagKey<Item> TOOLS_AND_ARMOR_IRON = reoTag("tools_and_armor/iron");
        public static final TagKey<Item> TOOLS_AND_ARMOR_NETHERITE = reoTag("tools_and_armor/netherite");
        public static final TagKey<Item> TOOLS_AND_ARMOR_PERIDOT = reoTag("tools_and_armor/peridot");
        public static final TagKey<Item> TOOLS_AND_ARMOR_PLATINUM = reoTag("tools_and_armor/platinum");
        public static final TagKey<Item> TOOLS_AND_ARMOR_RUBY = reoTag("tools_and_armor/ruby");
        public static final TagKey<Item> TOOLS_AND_ARMOR_SAPPHIRE = reoTag("tools_and_armor/sapphire");
        public static final TagKey<Item> TOOLS_AND_ARMOR_SILVER = reoTag("tools_and_armor/silver");
        public static final TagKey<Item> TOOLS_AND_ARMOR_STEEL = reoTag("tools_and_armor/steel");

        private static TagKey<Item> reoTag(String name) {
            return ItemTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}