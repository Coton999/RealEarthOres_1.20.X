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

        // Mineables
        public static final TagKey<Block> MINEABLE_WITH_REO_SHEARS = forgeTag("mineable/shears");
        public static final TagKey<Block> MINEABLE_WITH_SICKLE = forgeTag("mineable/sickle");
        public static final TagKey<Block> MINEABLE_WITH_PAXEL = forgeTag("mineable/paxel");

        // Machines
        public static final TagKey<Block> COAL_MACHINES = reoTag("machines/coal_machines");
        public static final TagKey<Block> ELECTRIC_MACHINES = reoTag("machines/electric_machines");
        public static final TagKey<Block> GENERATORS = reoTag("machines/generators");

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
        public static final TagKey<Block> REO_ORES = forgeTag("ores_in_ground/stone");
        public static final TagKey<Block> REO_DEEPSLATE_ORES = forgeTag("ores_in_ground/deepslate");
        public static final TagKey<Block> REO_GRAVEL_ORES = forgeTag("ores_in_ground/gravel");
        public static final TagKey<Block> REO_NETHER_ORES = forgeTag("ores_in_ground/netherrack");
        public static final TagKey<Block> REO_END_ORES = forgeTag("ores_in_ground/endstone");

        public static final TagKey<Block> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Block> ORES_LEAD = forgeTag("ores/lead");
        public static final TagKey<Block> ORES_NICKEL = forgeTag("ores/nickel");
        public static final TagKey<Block> ORES_PLATINUM = forgeTag("ores/platinum");
        public static final TagKey<Block> ORES_SILVER = forgeTag("ores/silver");
        public static final TagKey<Block> ORES_TIN = forgeTag("ores/tin");
        public static final TagKey<Block> ORES_URANIUM = forgeTag("ores/uranium");
        public static final TagKey<Block> ORES_ZINC = forgeTag("ores/zinc");

        // Storage Blocks
        public static final TagKey<Block> STORAGE_BLOCKS= reoTag("storage_blocks");
        public static final TagKey<Block> STORAGE_BLOCKS_ALUMINUM = forgeTag("storage_blocks/aluminum");
        public static final TagKey<Block> STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/lead");
        public static final TagKey<Block> STORAGE_BLOCKS_BRASS = forgeTag("storage_blocks/brass");
        public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = forgeTag("storage_blocks/bronze");
        public static final TagKey<Block> STORAGE_BLOCKS_ELECTRUM = forgeTag("storage_blocks/electrum");
        public static final TagKey<Block> STORAGE_BLOCKS_ENDERITE = forgeTag("storage_blocks/enderite");
        public static final TagKey<Block> STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/nickel");
        public static final TagKey<Block> STORAGE_BLOCKS_PERIDOT = forgeTag("storage_blocks/peridot");
        public static final TagKey<Block> STORAGE_BLOCKS_PLATINUM = forgeTag("storage_blocks/platinum");
        public static final TagKey<Block> STORAGE_BLOCKS_RUBY = forgeTag("storage_blocks/ruby");
        public static final TagKey<Block> STORAGE_BLOCKS_SAPPHIRE = forgeTag("storage_blocks/sapphire");
        public static final TagKey<Block> STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/silver");
        public static final TagKey<Block> STORAGE_BLOCKS_STEEL = forgeTag("storage_blocks/steel");
        public static final TagKey<Block> STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/tin");
        public static final TagKey<Block> STORAGE_BLOCKS_URANIUM = forgeTag("storage_blocks/uranium");
        public static final TagKey<Block> STORAGE_BLOCKS_ZINC = forgeTag("storage_blocks/zinc");

        // Raw
        public static final TagKey<Block> RAW_STORAGE_BLOCKS= reoTag("raw_storage_blocks");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_ALUMINUM = forgeTag("storage_blocks/raw_aluminum");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_ENDERITE = forgeTag("storage_blocks/raw_enderite");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_LEAD = forgeTag("storage_blocks/raw_lead");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_NICKEL = forgeTag("storage_blocks/raw_nickel");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_PLATINUM = forgeTag("storage_blocks/raw_platinum");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_SILVER = forgeTag("storage_blocks/raw_silver");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_TIN = forgeTag("storage_blocks/raw_tin");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_URANIUM = forgeTag("storage_blocks/raw_uranium");
        public static final TagKey<Block> RAW_STORAGE_BLOCKS_ZINC = forgeTag("storage_blocks/raw_zinc");

        // Building Blocks //
        public static final TagKey<Block> MARBLE_BLOCKS= reoTag("marble");
        public static final TagKey<Block> LIMESTONE_BLOCKS= reoTag("limestone");
        public static final TagKey<Block> CALCITE_BLOCKS= reoTag("calcite");
        public static final TagKey<Block> NETHERRACK_BLOCKS= reoTag("netherrack");



        private static TagKey<Block> reoTag(String name) {
            return BlockTags.create(new ResourceLocation(RealEarthOres.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        // Gears
        public static final TagKey<Item> GEARS_TIER_GEM = reoTag("gears/tier_gem");

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

        // Tools //
        // Axe
        public static final TagKey<Item> AXES_ALUMINUM = forgeTag("tools/axes/aluminum");
        public static final TagKey<Item> AXES_AMETHYST = forgeTag("tools/axes/amethyst");
        public static final TagKey<Item> AXES_BRONZE = forgeTag("tools/axes/bronze");
        public static final TagKey<Item> AXES_ENDERITE = forgeTag("tools/axes/enderite");
        public static final TagKey<Item> AXES_PERIDOT = forgeTag("tools/axes/peridot");
        public static final TagKey<Item> AXES_PLATINUM = forgeTag("tools/axes/platinum");
        public static final TagKey<Item> AXES_RUBY = forgeTag("tools/axes/ruby");
        public static final TagKey<Item> AXES_SAPPHIRE = forgeTag("tools/axes/sapphire");
        public static final TagKey<Item> AXES_SILVER = forgeTag("tools/axes/silver");
        public static final TagKey<Item> AXES_STEEL = forgeTag("tools/axes/steel");

        // Bow
        public static final TagKey<Item> BOWS = forgeTag("tools/bows");

        public static final TagKey<Item> BOWS_STONE = forgeTag("tools/bows/stone");
        public static final TagKey<Item> BOWS_GOLD = forgeTag("tools/bows/gold");
        public static final TagKey<Item> BOWS_IRON = forgeTag("tools/bows/iron");
        public static final TagKey<Item> BOWS_DIAMOND = forgeTag("tools/bows/diamond");
        public static final TagKey<Item> BOWS_NETHERITE = forgeTag("tools/bows/netherite");

        public static final TagKey<Item> BOWS_ALUMINUM = forgeTag("tools/bows/aluminum");
        public static final TagKey<Item> BOWS_AMETHYST = forgeTag("tools/bows/amethyst");
        public static final TagKey<Item> BOWS_BRONZE = forgeTag("tools/bows/bronze");
        public static final TagKey<Item> BOWS_ENDERITE = forgeTag("tools/bows/enderite");
        public static final TagKey<Item> BOWS_PERIDOT = forgeTag("tools/bows/peridot");
        public static final TagKey<Item> BOWS_PLATINUM = forgeTag("tools/bows/platinum");
        public static final TagKey<Item> BOWS_RUBY = forgeTag("tools/bows/ruby");
        public static final TagKey<Item> BOWS_SAPPHIRE = forgeTag("tools/bows/sapphire");
        public static final TagKey<Item> BOWS_SILVER = forgeTag("tools/bows/silver");
        public static final TagKey<Item> BOWS_STEEL = forgeTag("tools/bows/steel");

        // Excavator
        public static final TagKey<Item> EXCAVATORS = forgeTag("tools/excavators");

        public static final TagKey<Item> EXCAVATORS_WOOD = forgeTag("tools/excavators/wood");
        public static final TagKey<Item> EXCAVATORS_STONE = forgeTag("tools/excavators/stone");
        public static final TagKey<Item> EXCAVATORS_GOLD = forgeTag("tools/excavators/gold");
        public static final TagKey<Item> EXCAVATORS_IRON = forgeTag("tools/excavators/iron");
        public static final TagKey<Item> EXCAVATORS_DIAMOND = forgeTag("tools/excavators/diamond");
        public static final TagKey<Item> EXCAVATORS_NETHERITE = forgeTag("tools/excavators/netherite");

        public static final TagKey<Item> EXCAVATORS_ALUMINUM = forgeTag("tools/excavators/aluminum");
        public static final TagKey<Item> EXCAVATORS_AMETHYST = forgeTag("tools/excavators/amethyst");
        public static final TagKey<Item> EXCAVATORS_BRONZE = forgeTag("tools/excavators/bronze");
        public static final TagKey<Item> EXCAVATORS_ENDERITE = forgeTag("tools/excavators/enderite");
        public static final TagKey<Item> EXCAVATORS_PERIDOT = forgeTag("tools/excavators/peridot");
        public static final TagKey<Item> EXCAVATORS_PLATINUM = forgeTag("tools/excavators/platinum");
        public static final TagKey<Item> EXCAVATORS_RUBY = forgeTag("tools/excavators/ruby");
        public static final TagKey<Item> EXCAVATORS_SAPPHIRE = forgeTag("tools/excavators/sapphire");
        public static final TagKey<Item> EXCAVATORS_SILVER = forgeTag("tools/excavators/silver");
        public static final TagKey<Item> EXCAVATORS_STEEL = forgeTag("tools/excavators/steel");

        // Hammer
        public static final TagKey<Item> HAMMERS = forgeTag("tools/hammers");

        public static final TagKey<Item> HAMMERS_WOOD = forgeTag("tools/hammers/wood");
        public static final TagKey<Item> HAMMERS_STONE = forgeTag("tools/hammers/stone");
        public static final TagKey<Item> HAMMERS_GOLD = forgeTag("tools/hammers/gold");
        public static final TagKey<Item> HAMMERS_IRON = forgeTag("tools/hammers/iron");
        public static final TagKey<Item> HAMMERS_DIAMOND = forgeTag("tools/hammers/diamond");
        public static final TagKey<Item> HAMMERS_NETHERITE = forgeTag("tools/hammers/netherite");

        public static final TagKey<Item> HAMMERS_ALUMINUM = forgeTag("tools/hammers/aluminum");
        public static final TagKey<Item> HAMMERS_AMETHYST = forgeTag("tools/hammers/amethyst");
        public static final TagKey<Item> HAMMERS_BRONZE = forgeTag("tools/hammers/bronze");
        public static final TagKey<Item> HAMMERS_ENDERITE = forgeTag("tools/hammers/enderite");
        public static final TagKey<Item> HAMMERS_PERIDOT = forgeTag("tools/hammers/peridot");
        public static final TagKey<Item> HAMMERS_PLATINUM = forgeTag("tools/hammers/platinum");
        public static final TagKey<Item> HAMMERS_RUBY = forgeTag("tools/hammers/ruby");
        public static final TagKey<Item> HAMMERS_SAPPHIRE = forgeTag("tools/hammers/sapphire");
        public static final TagKey<Item> HAMMERS_SILVER = forgeTag("tools/hammers/silver");
        public static final TagKey<Item> HAMMERS_STEEL = forgeTag("tools/hammers/steel");

        // Hatchet
        public static final TagKey<Item> HATCHETS = forgeTag("tools/hatchets");

        public static final TagKey<Item> HATCHETS_WOOD = forgeTag("tools/hatchets/wood");
        public static final TagKey<Item> HATCHETS_STONE = forgeTag("tools/hatchets/stone");
        public static final TagKey<Item> HATCHETS_GOLD = forgeTag("tools/hatchets/gold");
        public static final TagKey<Item> HATCHETS_IRON = forgeTag("tools/hatchets/iron");
        public static final TagKey<Item> HATCHETS_DIAMOND = forgeTag("tools/hatchets/diamond");
        public static final TagKey<Item> HATCHETS_NETHERITE = forgeTag("tools/hatchets/netherite");

        public static final TagKey<Item> HATCHETS_ALUMINUM = forgeTag("tools/hatchets/aluminum");
        public static final TagKey<Item> HATCHETS_AMETHYST = forgeTag("tools/hatchets/amethyst");
        public static final TagKey<Item> HATCHETS_BRONZE = forgeTag("tools/hatchets/bronze");
        public static final TagKey<Item> HATCHETS_ENDERITE = forgeTag("tools/hatchets/enderite");
        public static final TagKey<Item> HATCHETS_PERIDOT = forgeTag("tools/hatchets/peridot");
        public static final TagKey<Item> HATCHETS_PLATINUM = forgeTag("tools/hatchets/platinum");
        public static final TagKey<Item> HATCHETS_RUBY = forgeTag("tools/hatchets/ruby");
        public static final TagKey<Item> HATCHETS_SAPPHIRE = forgeTag("tools/hatchets/sapphire");
        public static final TagKey<Item> HATCHETS_SILVER = forgeTag("tools/hatchets/silver");
        public static final TagKey<Item> HATCHETS_STEEL = forgeTag("tools/hatchets/steel");

        // Hoe
        public static final TagKey<Item> HOES_ALUMINUM = forgeTag("tools/hoes/aluminum");
        public static final TagKey<Item> HOES_AMETHYST = forgeTag("tools/hoes/amethyst");
        public static final TagKey<Item> HOES_BRONZE = forgeTag("tools/hoes/bronze");
        public static final TagKey<Item> HOES_ENDERITE = forgeTag("tools/hoes/enderite");
        public static final TagKey<Item> HOES_PERIDOT = forgeTag("tools/hoes/peridot");
        public static final TagKey<Item> HOES_PLATINUM = forgeTag("tools/hoes/platinum");
        public static final TagKey<Item> HOES_RUBY = forgeTag("tools/hoes/ruby");
        public static final TagKey<Item> HOES_SAPPHIRE = forgeTag("tools/hoes/sapphire");
        public static final TagKey<Item> HOES_SILVER = forgeTag("tools/hoes/silver");
        public static final TagKey<Item> HOES_STEEL = forgeTag("tools/hoes/steel");

        // Paxel
        public static final TagKey<Item> PAXELS = forgeTag("tools/paxels");

        public static final TagKey<Item> PAXELS_WOOD = forgeTag("tools/paxels/wood");
        public static final TagKey<Item> PAXELS_STONE = forgeTag("tools/paxels/stone");
        public static final TagKey<Item> PAXELS_GOLD = forgeTag("tools/paxels/gold");
        public static final TagKey<Item> PAXELS_IRON = forgeTag("tools/paxels/iron");
        public static final TagKey<Item> PAXELS_DIAMOND = forgeTag("tools/paxels/diamond");
        public static final TagKey<Item> PAXELS_NETHERITE = forgeTag("tools/paxels/netherite");

        public static final TagKey<Item> PAXELS_ALUMINUM = forgeTag("tools/paxels/aluminum");
        public static final TagKey<Item> PAXELS_AMETHYST = forgeTag("tools/paxels/amethyst");
        public static final TagKey<Item> PAXELS_BRONZE = forgeTag("tools/paxels/bronze");
        public static final TagKey<Item> PAXELS_ENDERITE = forgeTag("tools/paxels/enderite");
        public static final TagKey<Item> PAXELS_PERIDOT = forgeTag("tools/paxels/peridot");
        public static final TagKey<Item> PAXELS_PLATINUM = forgeTag("tools/paxels/platinum");
        public static final TagKey<Item> PAXELS_RUBY = forgeTag("tools/paxels/ruby");
        public static final TagKey<Item> PAXELS_SAPPHIRE = forgeTag("tools/paxels/sapphire");
        public static final TagKey<Item> PAXELS_SILVER = forgeTag("tools/paxels/silver");
        public static final TagKey<Item> PAXELS_STEEL = forgeTag("tools/paxels/steel");

        // Pickaxe
        public static final TagKey<Item> PICKAXES_ALUMINUM = forgeTag("tools/pickaxes/aluminum");
        public static final TagKey<Item> PICKAXES_AMETHYST = forgeTag("tools/pickaxes/amethyst");
        public static final TagKey<Item> PICKAXES_BRONZE = forgeTag("tools/pickaxes/bronze");
        public static final TagKey<Item> PICKAXES_ENDERITE = forgeTag("tools/pickaxes/enderite");
        public static final TagKey<Item> PICKAXES_PERIDOT = forgeTag("tools/pickaxes/peridot");
        public static final TagKey<Item> PICKAXES_PLATINUM = forgeTag("tools/pickaxes/platinum");
        public static final TagKey<Item> PICKAXES_RUBY = forgeTag("tools/pickaxes/ruby");
        public static final TagKey<Item> PICKAXES_SAPPHIRE = forgeTag("tools/pickaxes/sapphire");
        public static final TagKey<Item> PICKAXES_SILVER = forgeTag("tools/pickaxes/silver");
        public static final TagKey<Item> PICKAXES_STEEL = forgeTag("tools/pickaxes/steel");

        // Shears
        public static final TagKey<Item> SHEARS = forgeTag("tools/shears");

        public static final TagKey<Item> SHEARS_WOOD = forgeTag("tools/shears/wood");
        public static final TagKey<Item> SHEARS_STONE = forgeTag("tools/shears/stone");
        public static final TagKey<Item> SHEARS_GOLD = forgeTag("tools/shears/gold");
        public static final TagKey<Item> SHEARS_DIAMOND = forgeTag("tools/shears/diamond");
        public static final TagKey<Item> SHEARS_NETHERITE = forgeTag("tools/shears/netherite");

        public static final TagKey<Item> SHEARS_ALUMINUM = forgeTag("tools/shears/aluminum");
        public static final TagKey<Item> SHEARS_AMETHYST = forgeTag("tools/shears/amethyst");
        public static final TagKey<Item> SHEARS_BRONZE = forgeTag("tools/shears/bronze");
        public static final TagKey<Item> SHEARS_ENDERITE = forgeTag("tools/shears/enderite");
        public static final TagKey<Item> SHEARS_PERIDOT = forgeTag("tools/shears/peridot");
        public static final TagKey<Item> SHEARS_PLATINUM = forgeTag("tools/shears/platinum");
        public static final TagKey<Item> SHEARS_RUBY = forgeTag("tools/shears/ruby");
        public static final TagKey<Item> SHEARS_SAPPHIRE = forgeTag("tools/shears/sapphire");
        public static final TagKey<Item> SHEARS_SILVER = forgeTag("tools/shears/silver");
        public static final TagKey<Item> SHEARS_STEEL = forgeTag("tools/shears/steel");

        // Shovel
        public static final TagKey<Item> SHOVELS_ALUMINUM = forgeTag("tools/shovel/aluminum");
        public static final TagKey<Item> SHOVELS_AMETHYST = forgeTag("tools/shovel/amethyst");
        public static final TagKey<Item> SHOVELS_BRONZE = forgeTag("tools/shovel/bronze");
        public static final TagKey<Item> SHOVELS_ENDERITE = forgeTag("tools/shovel/enderite");
        public static final TagKey<Item> SHOVELS_PERIDOT = forgeTag("tools/shovel/peridot");
        public static final TagKey<Item> SHOVELS_PLATINUM = forgeTag("tools/shovel/platinum");
        public static final TagKey<Item> SHOVELS_RUBY = forgeTag("tools/shovel/ruby");
        public static final TagKey<Item> SHOVELS_SAPPHIRE = forgeTag("tools/shovel/sapphire");
        public static final TagKey<Item> SHOVELS_SILVER = forgeTag("tools/shovel/silver");
        public static final TagKey<Item> SHOVELS_STEEL = forgeTag("tools/shovel/steel");

        // Sickle
        public static final TagKey<Item> SICKLES = forgeTag("tools/sickles");

        public static final TagKey<Item> SICKLES_WOOD = forgeTag("tools/sickles/wood");
        public static final TagKey<Item> SICKLES_STONE = forgeTag("tools/sickles/stone");
        public static final TagKey<Item> SICKLES_GOLD = forgeTag("tools/sickles/gold");
        public static final TagKey<Item> SICKLES_IRON = forgeTag("tools/sickles/iron");
        public static final TagKey<Item> SICKLES_DIAMOND = forgeTag("tools/sickles/diamond");
        public static final TagKey<Item> SICKLES_NETHERITE = forgeTag("tools/sickles/netherite");

        public static final TagKey<Item> SICKLES_ALUMINUM = forgeTag("tools/sickles/aluminum");
        public static final TagKey<Item> SICKLES_AMETHYST = forgeTag("tools/sickles/amethyst");
        public static final TagKey<Item> SICKLES_BRONZE = forgeTag("tools/sickles/bronze");
        public static final TagKey<Item> SICKLES_ENDERITE = forgeTag("tools/sickles/enderite");
        public static final TagKey<Item> SICKLES_PERIDOT = forgeTag("tools/sickles/peridot");
        public static final TagKey<Item> SICKLES_PLATINUM = forgeTag("tools/sickles/platinum");
        public static final TagKey<Item> SICKLES_RUBY = forgeTag("tools/sickles/ruby");
        public static final TagKey<Item> SICKLES_SAPPHIRE = forgeTag("tools/sickles/sapphire");
        public static final TagKey<Item> SICKLES_SILVER = forgeTag("tools/sickles/silver");
        public static final TagKey<Item> SICKLES_STEEL = forgeTag("tools/sickles/steel");

        // Sword
        public static final TagKey<Item> SWORDS_ALUMINUM = forgeTag("tools/swords/aluminum");
        public static final TagKey<Item> SWORDS_AMETHYST = forgeTag("tools/swords/amethyst");
        public static final TagKey<Item> SWORDS_BRONZE = forgeTag("tools/swords/bronze");
        public static final TagKey<Item> SWORDS_ENDERITE = forgeTag("tools/swords/enderite");
        public static final TagKey<Item> SWORDS_PERIDOT = forgeTag("tools/swords/peridot");
        public static final TagKey<Item> SWORDS_PLATINUM = forgeTag("tools/swords/platinum");
        public static final TagKey<Item> SWORDS_RUBY = forgeTag("tools/swords/ruby");
        public static final TagKey<Item> SWORDS_SAPPHIRE = forgeTag("tools/swords/sapphire");
        public static final TagKey<Item> SWORDS_SILVER = forgeTag("tools/swords/silver");
        public static final TagKey<Item> SWORDS_STEEL = forgeTag("tools/swords/steel");

        // Armor
        // Helmet
        public static final TagKey<Item> HELMETS = forgeTag("armors/helmets");

        public static final TagKey<Item> HELMETS_ALUMINUM = forgeTag("armors/helmets/aluminum");
        public static final TagKey<Item> HELMETS_AMETHYST = forgeTag("armors/helmets/amethyst");
        public static final TagKey<Item> HELMETS_BRONZE = forgeTag("armors/helmets/bronze");
        public static final TagKey<Item> HELMETS_ENDERITE = forgeTag("armors/helmets/enderite");
        public static final TagKey<Item> HELMETS_PERIDOT = forgeTag("armors/helmets/peridot");
        public static final TagKey<Item> HELMETS_PLATINUM = forgeTag("armors/helmets/platinum");
        public static final TagKey<Item> HELMETS_RUBY = forgeTag("armors/helmets/ruby");
        public static final TagKey<Item> HELMETS_SAPPHIRE = forgeTag("armors/helmets/sapphire");
        public static final TagKey<Item> HELMETS_SILVER = forgeTag("armors/helmets/silver");
        public static final TagKey<Item> HELMETS_STEEL = forgeTag("armors/helmets/steel");

        // Chestplate
        public static final TagKey<Item> CHESTPLATES = forgeTag("armors/chestplates");

        public static final TagKey<Item> CHESTPLATES_ALUMINUM = forgeTag("armors/chestplates/aluminum");
        public static final TagKey<Item> CHESTPLATES_AMETHYST = forgeTag("armors/chestplates/amethyst");
        public static final TagKey<Item> CHESTPLATES_BRONZE = forgeTag("armors/chestplates/bronze");
        public static final TagKey<Item> CHESTPLATES_ENDERITE = forgeTag("armors/chestplates/enderite");
        public static final TagKey<Item> CHESTPLATES_PERIDOT = forgeTag("armors/chestplates/peridot");
        public static final TagKey<Item> CHESTPLATES_PLATINUM = forgeTag("armors/chestplates/platinum");
        public static final TagKey<Item> CHESTPLATES_RUBY = forgeTag("armors/chestplates/ruby");
        public static final TagKey<Item> CHESTPLATES_SAPPHIRE = forgeTag("armors/chestplates/sapphire");
        public static final TagKey<Item> CHESTPLATES_SILVER = forgeTag("armors/chestplates/silver");
        public static final TagKey<Item> CHESTPLATES_STEEL = forgeTag("armors/chestplates/steel");

        // Leggings
        public static final TagKey<Item> LEGGINGS = forgeTag("armors/leggings");

        public static final TagKey<Item> LEGGINGS_ALUMINUM = forgeTag("armors/leggings/aluminum");
        public static final TagKey<Item> LEGGINGS_AMETHYST = forgeTag("armors/leggings/amethyst");
        public static final TagKey<Item> LEGGINGS_BRONZE = forgeTag("armors/leggings/bronze");
        public static final TagKey<Item> LEGGINGS_ENDERITE = forgeTag("armors/leggings/enderite");
        public static final TagKey<Item> LEGGINGS_PERIDOT = forgeTag("armors/leggings/peridot");
        public static final TagKey<Item> LEGGINGS_PLATINUM = forgeTag("armors/leggings/platinum");
        public static final TagKey<Item> LEGGINGS_RUBY = forgeTag("armors/leggings/ruby");
        public static final TagKey<Item> LEGGINGS_SAPPHIRE = forgeTag("armors/leggings/sapphire");
        public static final TagKey<Item> LEGGINGS_SILVER = forgeTag("armors/leggings/silver");
        public static final TagKey<Item> LEGGINGS_STEEL = forgeTag("armors/leggings/steel");

        // Boots
        public static final TagKey<Item> BOOTS = forgeTag("armors/boots");

        public static final TagKey<Item> BOOTS_ALUMINUM = forgeTag("armors/boots/aluminum");
        public static final TagKey<Item> BOOTS_AMETHYST = forgeTag("armors/boots/amethyst");
        public static final TagKey<Item> BOOTS_BRONZE = forgeTag("armors/boots/bronze");
        public static final TagKey<Item> BOOTS_ENDERITE = forgeTag("armors/boots/enderite");
        public static final TagKey<Item> BOOTS_PERIDOT = forgeTag("armors/boots/peridot");
        public static final TagKey<Item> BOOTS_PLATINUM = forgeTag("armors/boots/platinum");
        public static final TagKey<Item> BOOTS_RUBY = forgeTag("armors/boots/ruby");
        public static final TagKey<Item> BOOTS_SAPPHIRE = forgeTag("armors/boots/sapphire");
        public static final TagKey<Item> BOOTS_SILVER = forgeTag("armors/boots/silver");
        public static final TagKey<Item> BOOTS_STEEL = forgeTag("armors/boots/steel");

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
        public static final TagKey<Item> REO_ORES = forgeTag("ores_in_ground/stone");
        public static final TagKey<Item> REO_DEEPSLATE_ORES = forgeTag("ores/ores_in_ground/deepslate");
        public static final TagKey<Item> REO_GRAVEL_ORES = forgeTag("ores/ores_in_ground/gravel");
        public static final TagKey<Item> REO_NETHER_ORES = forgeTag("ores/ores_in_ground/netherrack");
        public static final TagKey<Item> REO_END_ORES = forgeTag("ores/ores_in_ground/endstone");

        public static final TagKey<Item> ORES_ALUMINUM = forgeTag("ores/aluminum");
        public static final TagKey<Item> ORES_ENDERITE = forgeTag("ores/enderite");
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
        public static final TagKey<Item> INGOTS_CHAIN = forgeTag("ingots/chain");
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

        // Gems
        public static final TagKey<Item> GEMS_AMETHYST = reoTag("gems/amethyst");
        public static final TagKey<Item> GEMS_PERIDOT = forgeTag("gems/peridot");
        public static final TagKey<Item> GEMS_RUBY = forgeTag("gems/ruby");
        public static final TagKey<Item> GEMS_SAPPHIRE = forgeTag("gems/sapphire");

        // Nuggets
        public static final TagKey<Item> NUGGETS_ALUMINUM = forgeTag("nuggets/aluminum");
        public static final TagKey<Item> NUGGETS_AMETHYST = forgeTag("nuggets/amethyst");
        public static final TagKey<Item> NUGGETS_BRASS = forgeTag("nuggets/brass");
        public static final TagKey<Item> NUGGETS_BRONZE = forgeTag("nuggets/bronze");
        public static final TagKey<Item> NUGGETS_COPPER = forgeTag("nuggets/copper");
        public static final TagKey<Item> NUGGETS_DIAMOND = forgeTag("nuggets/diamond");
        public static final TagKey<Item> NUGGETS_ELECTRTUM = forgeTag("nuggets/electrum");
        public static final TagKey<Item> NUGGETS_EMERALD = forgeTag("nuggets/emerald");
        public static final TagKey<Item> NUGGETS_ENDERITE = forgeTag("nuggets/enderite");
        public static final TagKey<Item> NUGGETS_LEAD = forgeTag("nuggets/lead");
        public static final TagKey<Item> NUGGETS_NETHERITE = forgeTag("nuggets/netherite");
        public static final TagKey<Item> NUGGETS_NICKEL = forgeTag("nuggets/nickel");
        public static final TagKey<Item> NUGGETS_PERIDOT = forgeTag("nuggets/peridot");
        public static final TagKey<Item> NUGGETS_PLATINUM = forgeTag("nuggets/platinum");
        public static final TagKey<Item> NUGGETS_RUBY = forgeTag("nuggets/ruby");
        public static final TagKey<Item> NUGGETS_SAPPHIRE = forgeTag("nuggets/sapphire");
        public static final TagKey<Item> NUGGETS_SILVER = forgeTag("nuggets/silver");
        public static final TagKey<Item> NUGGETS_STEEL = forgeTag("nuggets/steel");
        public static final TagKey<Item> NUGGETS_TIN = forgeTag("nuggets/tin");
        public static final TagKey<Item> NUGGETS_ZINC = forgeTag("nuggets/zinc");

        // Dirty
        public static final TagKey<Item> DIRTY_ALUMINUM = reoTag("dirty_dusts/aluminum");
        public static final TagKey<Item> DIRTY_AMETHYST = reoTag("dirty_dusts/amethyst");
        public static final TagKey<Item> DIRTY_BRASS = reoTag("dirty_dusts/brass");
        public static final TagKey<Item> DIRTY_BRONZE = reoTag("dirty_dusts/bronze");
        public static final TagKey<Item> DIRTY_COPPER = reoTag("dirty_dusts/copper");
        public static final TagKey<Item> DIRTY_DIAMOND = reoTag("dirty_dusts/diamond");
        public static final TagKey<Item> DIRTY_ELECTRUM = reoTag("dirty_dusts/electrum");
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