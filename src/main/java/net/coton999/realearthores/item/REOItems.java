package net.coton999.realearthores.item;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.entity.custom.REOBoatEntity;
import net.coton999.realearthores.fluid.REOFluids;
import net.coton999.realearthores.item.custom.*;
import net.coton999.realearthores.item.custom.tool.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class REOItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RealEarthOres.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    // Raw Ore
    public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ENDERITE = ITEMS.register("raw_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            () -> new FuelItem(new Item.Properties(), 2400));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));


    // Ingot
    public static final RegistryObject<Item> INGOT_ALUMINIUM = ITEMS.register("ingot_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BRASS = ITEMS.register("ingot_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_BRONZE = ITEMS.register("ingot_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ELECTRUM = ITEMS.register("ingot_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ENDERITE = ITEMS.register("ingot_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_LEAD = ITEMS.register("ingot_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_NICKEL = ITEMS.register("ingot_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_PLATINUM = ITEMS.register("ingot_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_SILVER = ITEMS.register("ingot_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_STEEL = ITEMS.register("ingot_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_TIN = ITEMS.register("ingot_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_URANIUM = ITEMS.register("ingot_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGOT_ZINC = ITEMS.register("ingot_zinc",
            () -> new Item(new Item.Properties()));

    // Gem
    public static final RegistryObject<Item> GEM_AMETHYST = ITEMS.register("gem_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEM_PERIDOT = ITEMS.register("gem_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEM_RUBY = ITEMS.register("gem_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEM_SAPPHIRE = ITEMS.register("gem_sapphire",
            () -> new Item(new Item.Properties()));

    // Gem Shards
    public static final RegistryObject<Item> SHARD_PERIDOT = ITEMS.register("shard_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_RUBY = ITEMS.register("shard_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SHARD_SAPPHIRE = ITEMS.register("shard_sapphire",
            () -> new Item(new Item.Properties()));

    // Nugget
    public static final RegistryObject<Item> NUGGET_ALUMINIUM = ITEMS.register("nugget_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_AMETHYST = ITEMS.register("nugget_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_BRASS = ITEMS.register("nugget_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_BRONZE = ITEMS.register("nugget_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_COPPER = ITEMS.register("nugget_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_DIAMOND = ITEMS.register("nugget_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_ELECTRUM = ITEMS.register("nugget_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_EMERALD = ITEMS.register("nugget_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_ENDERITE = ITEMS.register("nugget_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_LEAD = ITEMS.register("nugget_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_NICKEL = ITEMS.register("nugget_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_PERIDOT = ITEMS.register("nugget_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_PLATINUM = ITEMS.register("nugget_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_RUBY = ITEMS.register("nugget_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_SAPPHIRE = ITEMS.register("nugget_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_SILVER = ITEMS.register("nugget_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_STEEL = ITEMS.register("nugget_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_TIN = ITEMS.register("nugget_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NUGGET_ZINC = ITEMS.register("nugget_zinc",
            () -> new Item(new Item.Properties()));

    // Dust
    public static final RegistryObject<Item> DUST_AMETHYST = ITEMS.register("dust_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_ALUMINIUM = ITEMS.register("dust_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_BRASS = ITEMS.register("dust_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_BRONZE = ITEMS.register("dust_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_CHARCOAL = ITEMS.register("dust_charcoal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_COAL = ITEMS.register("dust_coal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_COPPER = ITEMS.register("dust_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_DIAMOND = ITEMS.register("dust_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_ELECTRUM = ITEMS.register("dust_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_EMERALD = ITEMS.register("dust_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_ENDERITE = ITEMS.register("dust_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_GOLD = ITEMS.register("dust_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_IRON = ITEMS.register("dust_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_LEAD = ITEMS.register("dust_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_NICKEL = ITEMS.register("dust_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_OBSIDIAN = ITEMS.register("dust_obsidian",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_PERIDOT = ITEMS.register("dust_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_PLATINUM = ITEMS.register("dust_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_RUBY = ITEMS.register("dust_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_SAPPHIRE = ITEMS.register("dust_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_SILVER = ITEMS.register("dust_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_STEEL = ITEMS.register("dust_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_TIN = ITEMS.register("dust_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_URANIUM = ITEMS.register("dust_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DUST_ZINC = ITEMS.register("dust_zinc",
            () -> new Item(new Item.Properties()));

    // Dirty Dust
    public static final RegistryObject<Item> DIRTY_AMETHYST = ITEMS.register("dirty_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ALUMINIUM = ITEMS.register("dirty_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_BRASS = ITEMS.register("dirty_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_BRONZE = ITEMS.register("dirty_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_COPPER = ITEMS.register("dirty_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_DIAMOND = ITEMS.register("dirty_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ELECTRUM = ITEMS.register("dirty_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_EMERALD = ITEMS.register("dirty_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ENDERITE = ITEMS.register("dirty_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_GOLD = ITEMS.register("dirty_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_IRON = ITEMS.register("dirty_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_LEAD = ITEMS.register("dirty_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_NICKEL = ITEMS.register("dirty_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_OBSIDIAN = ITEMS.register("dirty_obsidian",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_PERIDOT = ITEMS.register("dirty_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_PLATINUM = ITEMS.register("dirty_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_RUBY = ITEMS.register("dirty_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_SAPPHIRE = ITEMS.register("dirty_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_SILVER = ITEMS.register("dirty_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_STEEL = ITEMS.register("dirty_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_TIN = ITEMS.register("dirty_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_URANIUM = ITEMS.register("dirty_uranium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_ZINC = ITEMS.register("dirty_zinc",
            () -> new Item(new Item.Properties()));

    // Buckets
    public static final RegistryObject<Item> BUCKET_MOLTEN_ALUMINIUM = ITEMS.register("bucket_molten_aluminium",
            () -> new BucketItem(REOFluids.MOLTEN_ALUMINIUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_AMETHYST = ITEMS.register("bucket_molten_amethyst",
            () -> new BucketItem(REOFluids.MOLTEN_AMETHYST_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_BRASS = ITEMS.register("bucket_molten_brass",
            () -> new BucketItem(REOFluids.MOLTEN_BRASS_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_BRONZE = ITEMS.register("bucket_molten_bronze",
            () -> new BucketItem(REOFluids.MOLTEN_BRONZE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_COAL = ITEMS.register("bucket_molten_coal",
            () -> new BucketItem(REOFluids.MOLTEN_COAL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_COPPER = ITEMS.register("bucket_molten_copper",
            () -> new BucketItem(REOFluids.MOLTEN_COPPER_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_DIAMOND = ITEMS.register("bucket_molten_diamond",
            () -> new BucketItem(REOFluids.MOLTEN_DIAMOND_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_ELECTRUM = ITEMS.register("bucket_molten_electrum",
            () -> new BucketItem(REOFluids.MOLTEN_ELECTRUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_EMERALD = ITEMS.register("bucket_molten_emerald",
            () -> new BucketItem(REOFluids.MOLTEN_EMERALD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_ENDERITE = ITEMS.register("bucket_molten_enderite",
            () -> new BucketItem(REOFluids.MOLTEN_ENDERITE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_GOLD = ITEMS.register("bucket_molten_gold",
            () -> new BucketItem(REOFluids.MOLTEN_GOLD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_IRON = ITEMS.register("bucket_molten_iron",
            () -> new BucketItem(REOFluids.MOLTEN_IRON_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_LAPIS = ITEMS.register("bucket_molten_lapis",
            () -> new BucketItem(REOFluids.MOLTEN_LAPIS_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_LEAD = ITEMS.register("bucket_molten_lead",
            () -> new BucketItem(REOFluids.MOLTEN_LEAD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_NICKEL = ITEMS.register("bucket_molten_nickel",
            () -> new BucketItem(REOFluids.MOLTEN_NICKEL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_PERIDOT = ITEMS.register("bucket_molten_peridot",
            () -> new BucketItem(REOFluids.MOLTEN_PERIDOT_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_PLATINUM = ITEMS.register("bucket_molten_platinum",
            () -> new BucketItem(REOFluids.MOLTEN_PLATINUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_REDSTONE = ITEMS.register("bucket_molten_redstone",
            () -> new BucketItem(REOFluids.MOLTEN_REDSTONE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_RUBY = ITEMS.register("bucket_molten_ruby",
            () -> new BucketItem(REOFluids.MOLTEN_RUBY_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_SAPPHIRE = ITEMS.register("bucket_molten_sapphire",
            () -> new BucketItem(REOFluids.MOLTEN_SAPPHIRE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_SILVER = ITEMS.register("bucket_molten_silver",
            () -> new BucketItem(REOFluids.MOLTEN_SILVER_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_STEEL = ITEMS.register("bucket_molten_steel",
            () -> new BucketItem(REOFluids.MOLTEN_STEEL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_TIN = ITEMS.register("bucket_molten_tin",
            () -> new BucketItem(REOFluids.MOLTEN_TIN_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_URANIUM = ITEMS.register("bucket_molten_uranium",
            () -> new BucketItem(REOFluids.MOLTEN_URANIUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BUCKET_MOLTEN_ZINC = ITEMS.register("bucket_molten_zinc",
            () -> new BucketItem(REOFluids.MOLTEN_ZINC_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Luminous Powder
    public static final RegistryObject<Item> LUMINOUS_BLACK = ITEMS.register("luminous_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_BLUE = ITEMS.register("luminous_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_BROWN = ITEMS.register("luminous_brown",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_CYAN = ITEMS.register("luminous_cyan",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_GRAY = ITEMS.register("luminous_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_GREEN = ITEMS.register("luminous_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_LIGHTBLUE = ITEMS.register("luminous_lightblue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_LIGHTGRAY = ITEMS.register("luminous_lightgray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_LIME = ITEMS.register("luminous_lime",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_MAGENTA = ITEMS.register("luminous_magenta",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_ORANGE = ITEMS.register("luminous_orange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_PINK = ITEMS.register("luminous_pink",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_PURPLE = ITEMS.register("luminous_purple",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_RED = ITEMS.register("luminous_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_WHITE = ITEMS.register("luminous_white",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LUMINOUS_YELLOW = ITEMS.register("luminous_yellow",
            () -> new Item(new Item.Properties()));


    // Tools
    // Aluminium
    public static final RegistryObject<Item> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_AXE = ITEMS.register("aluminium_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_HAMMER = ITEMS.register("aluminium_hammer",
            () -> new HammerItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_EXCAVATOR = ITEMS.register("aluminium_excavator",
            () -> new ExcavatorItem(Tiers.IRON,  1f, -3f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_HATCHET = ITEMS.register("aluminium_hatchet",
            () -> new HatchetItem(Tiers.IRON,  6f, -3.1f,
                    new Item.Properties().durability(50)));
    public static final RegistryObject<Item> ALUMINIUM_SICKLE = ITEMS.register("aluminium_sickle",
            () -> new SickleItem(Tiers.IRON,  0f, -3f,
                    new Item.Properties().durability(476)));
    public static final RegistryObject<Item> ALUMINIUM_PAXEL = ITEMS.register("aluminium_paxel",
            () -> new PaxelItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> ALUMINIUM_SHEARS = ITEMS.register("aluminium_shears",
            () -> new ModShearsItem(new Item.Properties().durability(476)));
    public static final RegistryObject<Item> ALUMINIUM_BOW = ITEMS.register("aluminium_bow",
            () -> new BowItem(new Item.Properties().durability(500)));

    // Amethyst
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3F,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new HammerItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_EXCAVATOR = ITEMS.register("amethyst_excavator",
            () -> new ExcavatorItem(Tiers.IRON,  1f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_HATCHET = ITEMS.register("amethyst_hatchet",
            () -> new HatchetItem(Tiers.IRON,  6f, -3.1f,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> AMETHYST_SICKLE = ITEMS.register("amethyst_sickle",
            () -> new SickleItem(Tiers.IRON,  0f, -3f,
                    new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> AMETHYST_PAXEL = ITEMS.register("amethyst_paxel",
            () -> new PaxelItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> AMETHYST_SHEARS = ITEMS.register("amethyst_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> AMETHYST_BOW = ITEMS.register("amethyst_bow",
            () -> new BowItem(new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> AMETHYST_SHIELD = ITEMS.register("amethyst_shield",
            () -> new ShieldItem(new Item.Properties().durability(1475)));

    // Bronze
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_HAMMER = ITEMS.register("bronze_hammer",
            () -> new HammerItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_EXCAVATOR = ITEMS.register("bronze_excavator",
            () -> new ExcavatorItem(Tiers.IRON,  1f, -3f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_HATCHET = ITEMS.register("bronze_hatchet",
            () -> new HatchetItem(Tiers.IRON,  6f, -3.1f,
                    new Item.Properties().durability(50)));
    public static final RegistryObject<Item> BRONZE_SICKLE = ITEMS.register("bronze_sickle",
            () -> new SickleItem(Tiers.IRON,  0f, -3f,
                    new Item.Properties().durability(476)));
    public static final RegistryObject<Item> BRONZE_PAXEL = ITEMS.register("bronze_paxel",
            () -> new PaxelItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(500)));
    public static final RegistryObject<Item> BRONZE_SHEARS = ITEMS.register("bronze_shears",
            () -> new ModShearsItem(new Item.Properties().durability(476)));
    public static final RegistryObject<Item> BRONZE_BOW = ITEMS.register("bronze_bow",
            () -> new BowItem(new Item.Properties().durability(500)));

    // Diamond
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> DIAMOND_EXCAVATOR = ITEMS.register("diamond_excavator",
            () -> new ExcavatorItem(Tiers.DIAMOND, 1f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> DIAMOND_HATCHET = ITEMS.register("diamond_hatchet",
            () -> new HatchetItem(Tiers.DIAMOND, 6f, -3.1f,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle",
            () -> new SickleItem(Tiers.DIAMOND, 0f, -3f,
                    new Item.Properties().durability(1486)));
    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1486)));
    public static final RegistryObject<Item> DIAMOND_BOW = ITEMS.register("diamond_bow",
            () -> new BowItem(new Item.Properties().durability(1561)));


    // Enderite
    public static final RegistryObject<Item> ENDERITE_SHOVEL = ITEMS.register("enderite_shovel",
            () -> new ShovelItem(Tiers.NETHERITE, 4f, -3F,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_PICKAXE = ITEMS.register("enderite_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 0, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_AXE = ITEMS.register("enderite_axe",
            () -> new AxeItem(Tiers.NETHERITE, 5f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_HOE = ITEMS.register("enderite_hoe",
            () -> new HoeItem(Tiers.NETHERITE, -4, 0f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_SWORD = ITEMS.register("enderite_sword",
            () -> new SwordItem(Tiers.NETHERITE, 3, -2.4f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_HAMMER = ITEMS.register("enderite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_EXCAVATOR = ITEMS.register("enderite_excavator",
            () -> new ExcavatorItem(Tiers.NETHERITE, 1f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_HATCHET = ITEMS.register("enderite_hatchet",
            () -> new HatchetItem(Tiers.NETHERITE, 6f, -3.1f,
                    new Item.Properties().durability(203)));
    public static final RegistryObject<Item> ENDERITE_SICKLE = ITEMS.register("enderite_sickle",
            () -> new SickleItem(Tiers.NETHERITE, 0f, -3f,
                    new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> ENDERITE_PAXEL = ITEMS.register("enderite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> ENDERITE_SHEARS = ITEMS.register("enderite_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> ENDERITE_BOW = ITEMS.register("enderite_bow",
            () -> new BowItem(new Item.Properties().durability(2031)));

    // Gold
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new HammerItem(Tiers.GOLD, 1f, -2.8f,
                    new Item.Properties().durability(32)));
    public static final RegistryObject<Item> GOLDEN_EXCAVATOR = ITEMS.register("golden_excavator",
            () -> new ExcavatorItem(Tiers.GOLD, 1f, -3f,
                    new Item.Properties().durability(32)));
    public static final RegistryObject<Item> GOLDEN_HATCHET = ITEMS.register("golden_hatchet",
            () -> new HatchetItem(Tiers.GOLD, 6f, -3.1f,
                    new Item.Properties().durability(3)));
    public static final RegistryObject<Item> GOLDEN_SICKLE = ITEMS.register("golden_sickle",
            () -> new SickleItem(Tiers.GOLD, 0f, -3f,
                    new Item.Properties().durability(30)));
    public static final RegistryObject<Item> GOLDEN_PAXEL = ITEMS.register("golden_paxel",
            () -> new PaxelItem(Tiers.GOLD, 1f, -2.8f,
                    new Item.Properties().durability(32)));
    public static final RegistryObject<Item> GOLDEN_SHEARS = ITEMS.register("golden_shears",
            () -> new ModShearsItem(new Item.Properties().durability(30)));
    public static final RegistryObject<Item> GOLDEN_BOW = ITEMS.register("golden_bow",
            () -> new BowItem(new Item.Properties().durability(32)));

    // Netherite
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> NETHERITE_EXCAVATOR = ITEMS.register("netherite_excavator",
            () -> new ExcavatorItem(Tiers.NETHERITE, 1f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> NETHERITE_HATCHET = ITEMS.register("netherite_hatchet",
            () -> new HatchetItem(Tiers.NETHERITE, 6f, -3.1f,
                    new Item.Properties().durability(203)));
    public static final RegistryObject<Item> NETHERITE_SICKLE = ITEMS.register("netherite_sickle",
            () -> new SickleItem(Tiers.NETHERITE, 0f, -3f,
                    new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> NETHERITE_PAXEL = ITEMS.register("netherite_paxel",
            () -> new PaxelItem(Tiers.NETHERITE, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> NETHERITE_BOW = ITEMS.register("netherite_bow",
            () -> new BowItem(new Item.Properties().durability(2031)));

    // Iron
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(250)));
    public static final RegistryObject<Item> IRON_EXCAVATOR = ITEMS.register("iron_excavator",
            () -> new ExcavatorItem(Tiers.IRON,  1f, -3f,
                    new Item.Properties().durability(250)));
    public static final RegistryObject<Item> IRON_HATCHET = ITEMS.register("iron_hatchet",
            () -> new HatchetItem(Tiers.IRON,  6f, -3.1f,
                    new Item.Properties().durability(25)));
    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle",
            () -> new SickleItem(Tiers.IRON,  0f, -3f,
                    new Item.Properties().durability(248)));
    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON,  1f, -2.8f,
                    new Item.Properties().durability(250)));
    public static final RegistryObject<Item> IRON_BOW = ITEMS.register("iron_bow",
            () -> new BowItem(new Item.Properties().durability(250)));

    // Peridot
    public static final RegistryObject<Item> PERIDOT_SHOVEL = ITEMS.register("peridot_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_PICKAXE = ITEMS.register("peridot_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_AXE = ITEMS.register("peridot_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_HOE = ITEMS.register("peridot_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_SWORD = ITEMS.register("peridot_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_HAMMER = ITEMS.register("peridot_hammer",
            () -> new HammerItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_EXCAVATOR = ITEMS.register("peridot_excavator",
            () -> new ExcavatorItem(Tiers.IRON, 1f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_HATCHET = ITEMS.register("peridot_hatchet",
            () -> new HatchetItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> PERIDOT_SICKLE = ITEMS.register("peridot_sickle",
            () -> new SickleItem(Tiers.IRON, 0f, -3f,
                    new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> PERIDOT_PAXEL = ITEMS.register("peridot_paxel",
            () -> new PaxelItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> PERIDOT_SHEARS = ITEMS.register("peridot_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> PERIDOT_BOW = ITEMS.register("peridot_bow",
            () -> new BowItem(new Item.Properties().durability(1561)));


    // Platinum
    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 6.5f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 0, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(Tiers.DIAMOND, 6f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_HOE = ITEMS.register("platinum_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_HAMMER = ITEMS.register("platinum_hammer",
            () -> new HammerItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_EXCAVATOR = ITEMS.register("platinum_excavator",
            () -> new ExcavatorItem(Tiers.DIAMOND, 1f, -3f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_HATCHET = ITEMS.register("platinum_hatchet",
            () -> new HatchetItem(Tiers.DIAMOND, 6f, -3.1f,
                    new Item.Properties().durability(203)));
    public static final RegistryObject<Item> PLATINUM_SICKLE = ITEMS.register("platinum_sickle",
            () -> new SickleItem(Tiers.DIAMOND, 0f, -3f,
                    new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> PLATINUM_PAXEL = ITEMS.register("platinum_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(2031)));
    public static final RegistryObject<Item> PLATINUM_SHEARS = ITEMS.register("platinum_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1934)));
    public static final RegistryObject<Item> PLATINUM_BOW = ITEMS.register("platinum_bow",
            () -> new BowItem(new Item.Properties().durability(2031)));


    // Ruby
    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_HAMMER = ITEMS.register("ruby_hammer",
            () -> new HammerItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_EXCAVATOR = ITEMS.register("ruby_excavator",
            () -> new ExcavatorItem(Tiers.IRON, 1f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_HATCHET = ITEMS.register("ruby_hatchet",
            () -> new HatchetItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> RUBY_SICKLE = ITEMS.register("ruby_sickle",
            () -> new SickleItem(Tiers.IRON, 0f, -3f,
                    new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> RUBY_PAXEL = ITEMS.register("ruby_paxel",
            () -> new PaxelItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> RUBY_SHEARS = ITEMS.register("ruby_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> RUBY_BOW = ITEMS.register("ruby_bow",
            () -> new BowItem(new Item.Properties().durability(1561)));


    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(Tiers.IRON, 1.5f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 0, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(Tiers.IRON, -2, -1f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_HAMMER = ITEMS.register("sapphire_hammer",
            () -> new HammerItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_EXCAVATOR = ITEMS.register("sapphire_excavator",
            () -> new ExcavatorItem(Tiers.IRON, 1f, -3f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_HATCHET = ITEMS.register("sapphire_hatchet",
            () -> new HatchetItem(Tiers.IRON, 6f, -3.1f,
                    new Item.Properties().durability(156)));
    public static final RegistryObject<Item> SAPPHIRE_SICKLE = ITEMS.register("sapphire_sickle",
            () -> new SickleItem(Tiers.IRON, 0f, -3f,
                    new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> SAPPHIRE_PAXEL = ITEMS.register("sapphire_paxel",
            () -> new PaxelItem(Tiers.IRON, 1f, -2.8f,
                    new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> SAPPHIRE_SHEARS = ITEMS.register("sapphire_shears",
            () -> new ModShearsItem(new Item.Properties().durability(1475)));
    public static final RegistryObject<Item> SAPPHIRE_BOW = ITEMS.register("sapphire_bow",
            () -> new BowItem(new Item.Properties().durability(1561)));


    // Silver
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(Tiers.GOLD, 1f, -3f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, 0, -2.8f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(Tiers.GOLD, 7f, -3.1f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(Tiers.GOLD, 0, -3f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(Tiers.GOLD, 3, -2.4f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_HAMMER = ITEMS.register("silver_hammer",
            () -> new HammerItem(Tiers.GOLD, 1f, -2.8f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_EXCAVATOR = ITEMS.register("silver_excavator",
            () -> new ExcavatorItem(Tiers.GOLD, 1f, -3f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_HATCHET = ITEMS.register("silver_hatchet",
            () -> new HatchetItem(Tiers.GOLD, 6f, -3.1f,
                    new Item.Properties().durability(6)));
    public static final RegistryObject<Item> SILVER_SICKLE = ITEMS.register("silver_sickle",
            () -> new SickleItem(Tiers.GOLD, 0f, -3f,
                    new Item.Properties().durability(61)));
    public static final RegistryObject<Item> SILVER_PAXEL = ITEMS.register("silver_paxel",
            () -> new PaxelItem(Tiers.GOLD, 1f, -2.8f,
                    new Item.Properties().durability(64)));
    public static final RegistryObject<Item> SILVER_SHEARS = ITEMS.register("silver_shears",
            () -> new ModShearsItem(new Item.Properties().durability(61)));
    public static final RegistryObject<Item> SILVER_BOW = ITEMS.register("silver_bow",
            () -> new BowItem(new Item.Properties().durability(64)));


    // Steel
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(Tiers.DIAMOND, 5f, -3f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(Tiers.DIAMOND, 0, -2.8f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(Tiers.DIAMOND, 5f, -3.1f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(Tiers.DIAMOND, -3, 0f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.4f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_HAMMER = ITEMS.register("steel_hammer",
            () -> new HammerItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_EXCAVATOR = ITEMS.register("steel_excavator",
            () -> new ExcavatorItem(Tiers.DIAMOND, 1f, -3f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_HATCHET = ITEMS.register("steel_hatchet",
            () -> new HatchetItem(Tiers.DIAMOND, 6f, -3.1f,
                    new Item.Properties().durability(97)));
    public static final RegistryObject<Item> STEEL_SICKLE = ITEMS.register("steel_sickle",
            () -> new SickleItem(Tiers.DIAMOND, 0f, -3f,
                    new Item.Properties().durability(929)));
    public static final RegistryObject<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 1f, -2.8f,
                    new Item.Properties().durability(976)));
    public static final RegistryObject<Item> STEEL_SHEARS = ITEMS.register("steel_shears",
            () -> new ModShearsItem(new Item.Properties().durability(929)));
    public static final RegistryObject<Item> STEEL_BOW = ITEMS.register("steel_bow",
            () -> new BowItem(new Item.Properties().durability(976)));

    // Stone
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(Tiers.STONE, 0.5f, -2.8f,
                    new Item.Properties().durability(131)));
    public static final RegistryObject<Item> STONE_EXCAVATOR = ITEMS.register("stone_excavator",
            () -> new ExcavatorItem(Tiers.STONE, 1.5f, -3f,
                    new Item.Properties().durability(131)));
    public static final RegistryObject<Item> STONE_HATCHET = ITEMS.register("stone_hatchet",
            () -> new HatchetItem(Tiers.STONE, 6f, -3.1f,
                    new Item.Properties().durability(13)));
    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle",
            () -> new SickleItem(Tiers.STONE, 0f, -3f,
                    new Item.Properties().durability(125)));
    public static final RegistryObject<Item> STONE_PAXEL = ITEMS.register("stone_paxel",
            () -> new PaxelItem(Tiers.STONE, 0f, -2.8f,
                    new Item.Properties().durability(131)));
    public static final RegistryObject<Item> STONE_SHEARS = ITEMS.register("stone_shears",
            () -> new ModShearsItem(new Item.Properties().durability(125)));
    public static final RegistryObject<Item> STONE_BOW = ITEMS.register("stone_bow",
            () -> new BowItem(new Item.Properties().durability(131)));

    // Wood
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new HammerItem(Tiers.WOOD, 1f, -2.8f,
                    new Item.Properties().durability(59)));
    public static final RegistryObject<Item> WOODEN_EXCAVATOR = ITEMS.register("wooden_excavator",
            () -> new ExcavatorItem(Tiers.WOOD, 1.5F, -3f,
                    new Item.Properties().durability(59)));
    public static final RegistryObject<Item> WOODEN_HATCHET = ITEMS.register("wooden_hatchet",
            () -> new HatchetItem(Tiers.WOOD, 6f, -3.1f,
                    new Item.Properties().durability(5)));
    public static final RegistryObject<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle",
            () -> new SickleItem(Tiers.WOOD, 1f, -3f,
                    new Item.Properties().durability(56)));
    public static final RegistryObject<Item> WOODEN_PAXEL = ITEMS.register("wooden_paxel",
            () -> new PaxelItem(Tiers.WOOD, 1f, -2.8f,
                    new Item.Properties().durability(59)));
    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
            () -> new ModShearsItem(new Item.Properties().durability(56)));


    // Armour
    // Aluminium
    public static final RegistryObject<Item> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_ALUMINIUM = ITEMS.register("horse_armor_aluminium",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_aluminium.png"),
                    new Item.Properties().stacksTo(1)));

    // Amethyst
    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet",
            () -> new ModArmourItem(REOArmourMaterials.AMETHYST, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings",
            () -> new ModArmourItem(REOArmourMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots",
            () -> new ModArmourItem(REOArmourMaterials.AMETHYST, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_AMETHYST = ITEMS.register("horse_armor_amethyst",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_amethyst.png"),
                    new Item.Properties().stacksTo(1)));

    // Bronze
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            () -> new ModArmourItem(REOArmourMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            () -> new ModArmourItem(REOArmourMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            () -> new ModArmourItem(REOArmourMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_BRONZE = ITEMS.register("horse_armor_bronze",
            () -> new HorseArmorItem(5, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_bronze.png"),
                    new Item.Properties().stacksTo(1)));

    // Chain
    //public static final RegistryObject<Item> HORSE_ARMOR_CHAIN = ITEMS.register("horse_armor_chain",
    //        () -> new HorseArmorItem(4, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_chain.png"),
    //                new Item.Properties().stacksTo(1)));

    // Enderite
    public static final RegistryObject<Item> ENDERITE_HELMET = ITEMS.register("enderite_helmet",
            () -> new ModArmourItem(REOArmourMaterials.ENDERITE, ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ENDERITE_CHESTPLATE = ITEMS.register("enderite_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.ENDERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ENDERITE_LEGGINGS = ITEMS.register("enderite_leggings",
            () -> new ModArmourItem(REOArmourMaterials.ENDERITE, ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> ENDERITE_BOOTS = ITEMS.register("enderite_boots",
            () -> new ModArmourItem(REOArmourMaterials.ENDERITE, ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> HORSE_ARMOR_ENDERITE = ITEMS.register("horse_armor_enderite",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_enderite.png"),
                    new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));


    // Netherite
    //public static final RegistryObject<Item> HORSE_ARMOR_NETHERITE = ITEMS.register("horse_armor_netherite",
    //        () -> new HorseArmorItem(13, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_netherite.png"),
    //                new Item.Properties().stacksTo(1)));

    // Platinum
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ModArmourItem(REOArmourMaterials.PLATINUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_LEGGINGS = ITEMS.register("platinum_leggings",
            () -> new ModArmourItem(REOArmourMaterials.PLATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ModArmourItem(REOArmourMaterials.PLATINUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_PLATINUM = ITEMS.register("horse_armor_platinum",
            () -> new HorseArmorItem(11, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_platinum.png"),
                    new Item.Properties().stacksTo(1)));

    // Peridot
    public static final RegistryObject<Item> PERIDOT_HELMET = ITEMS.register("peridot_helmet",
            () -> new ModArmourItem(REOArmourMaterials.PERIDOT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_CHESTPLATE = ITEMS.register("peridot_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.PERIDOT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_LEGGINGS = ITEMS.register("peridot_leggings",
            () -> new ModArmourItem(REOArmourMaterials.PERIDOT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_BOOTS = ITEMS.register("peridot_boots",
            () -> new ModArmourItem(REOArmourMaterials.PERIDOT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_PERIDOT = ITEMS.register("horse_armor_peridot",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_peridot.png"),
                    new Item.Properties().stacksTo(1)));

    // Ruby
    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ModArmourItem(REOArmourMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ModArmourItem(REOArmourMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ModArmourItem(REOArmourMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_RUBY = ITEMS.register("horse_armor_ruby",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_ruby.png"),
                    new Item.Properties().stacksTo(1)));

    // Sapphire
    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ModArmourItem(REOArmourMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ModArmourItem(REOArmourMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ModArmourItem(REOArmourMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_SAPPHIRE = ITEMS.register("horse_armor_sapphire",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_sapphire.png"),
                    new Item.Properties().stacksTo(1)));

    // Silver
    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ModArmourItem(REOArmourMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ModArmourItem(REOArmourMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ModArmourItem(REOArmourMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_SILVER = ITEMS.register("horse_armor_silver",
            () -> new HorseArmorItem(7, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_silver.png"),
                    new Item.Properties().stacksTo(1)));

    // Steel
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ModArmourItem(REOArmourMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ModArmourItem(REOArmourMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ModArmourItem(REOArmourMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSE_ARMOR_STEEL = ITEMS.register("horse_armor_steel",
            () -> new HorseArmorItem(8, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/horse_armor_steel.png"),
                    new Item.Properties().stacksTo(1)));


    // Signs
    public static final RegistryObject<Item> SIGN_BALSA = ITEMS.register("sign_balsa",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_BALSA.get(), REOBlocks.SIGN_BALSA_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_BALSA = ITEMS.register("sign_hanging_balsa",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.SIGN_HANGING_BALSA_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_BALSA = ITEMS.register("boat_balsa",
            () -> new ModBoatItem(false, REOBoatEntity.Type.BALSA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_BALSA_CHEST = ITEMS.register("boat_balsa_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.BALSA, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_BAOBAB = ITEMS.register("sign_baobab",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_BAOBAB.get(), REOBlocks.SIGN_BAOBAB_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_BAOBAB = ITEMS.register("sign_hanging_baobab",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.SIGN_HANGING_BAOBAB_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_BAOBAB = ITEMS.register("boat_baobab",
            () -> new ModBoatItem(false, REOBoatEntity.Type.BAOBAB, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_BAOBAB_CHEST = ITEMS.register("boat_baobab_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.BAOBAB, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_HILL_CHERRY = ITEMS.register("sign_hill_cherry",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_HILL_CHERRY.get(), REOBlocks.SIGN_HILL_CHERRY_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_HILL_CHERRY = ITEMS.register("sign_hanging_hill_cherry",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.SIGN_HANGING_HILL_CHERRY_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_HILL_CHERRY = ITEMS.register("boat_hill_cherry",
            () -> new ModBoatItem(false, REOBoatEntity.Type.HILL_CHERRY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_HILL_CHERRY_CHEST = ITEMS.register("boat_hill_cherry_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.HILL_CHERRY, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_CHESTNUT = ITEMS.register("sign_chestnut",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_CHESTNUT.get(), REOBlocks.SIGN_CHESTNUT_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_CHESTNUT = ITEMS.register("sign_hanging_chestnut",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_CHESTNUT.get(), REOBlocks.SIGN_HANGING_CHESTNUT_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_CHESTNUT = ITEMS.register("boat_chestnut",
            () -> new ModBoatItem(false, REOBoatEntity.Type.CHESTNUT, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_CHESTNUT_CHEST = ITEMS.register("boat_chestnut_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.CHESTNUT, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_CITRUS = ITEMS.register("sign_citrus",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_CITRUS.get(), REOBlocks.SIGN_CITRUS_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_CITRUS = ITEMS.register("sign_hanging_citrus",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.SIGN_HANGING_CITRUS_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_CITRUS = ITEMS.register("boat_citrus",
            () -> new ModBoatItem(false, REOBoatEntity.Type.CITRUS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_CITRUS_CHEST = ITEMS.register("boat_citrus_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.CITRUS, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_EBONY = ITEMS.register("sign_ebony",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_EBONY.get(), REOBlocks.SIGN_EBONY_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_EBONY = ITEMS.register("sign_hanging_ebony",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.SIGN_HANGING_EBONY_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_EBONY = ITEMS.register("boat_ebony",
            () -> new ModBoatItem(false, REOBoatEntity.Type.EBONY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_EBONY_CHEST = ITEMS.register("boat_ebony_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.EBONY, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_LARCH = ITEMS.register("sign_larch",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_LARCH.get(), REOBlocks.SIGN_LARCH_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_LARCH = ITEMS.register("sign_hanging_larch",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_LARCH.get(), REOBlocks.SIGN_HANGING_LARCH_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_LARCH = ITEMS.register("boat_larch",
            () -> new ModBoatItem(false, REOBoatEntity.Type.LARCH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_LARCH_CHEST = ITEMS.register("boat_larch_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.LARCH, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_LIME = ITEMS.register("sign_lime",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_LIME.get(), REOBlocks.SIGN_LIME_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_LIME = ITEMS.register("sign_hanging_lime",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.SIGN_HANGING_LIME_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_LIME = ITEMS.register("boat_lime",
            () -> new ModBoatItem(false, REOBoatEntity.Type.LIME, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_LIME_CHEST = ITEMS.register("boat_lime_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.LIME, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_MAHOGANY = ITEMS.register("sign_mahogany",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_MAHOGANY.get(), REOBlocks.SIGN_MAHOGANY_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_MAHOGANY = ITEMS.register("sign_hanging_mahogany",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.SIGN_HANGING_MAHOGANY_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_MAHOGANY = ITEMS.register("boat_mahogany",
            () -> new ModBoatItem(false, REOBoatEntity.Type.MAHOGANY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_MAHOGANY_CHEST = ITEMS.register("boat_mahogany_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.MAHOGANY, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_MAPLE = ITEMS.register("sign_maple",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_MAPLE.get(), REOBlocks.SIGN_MAPLE_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_MAPLE = ITEMS.register("sign_hanging_maple",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_MAPLE.get(), REOBlocks.SIGN_HANGING_MAPLE_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_MAPLE = ITEMS.register("boat_maple",
            () -> new ModBoatItem(false, REOBoatEntity.Type.MAPLE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_MAPLE_CHEST = ITEMS.register("boat_maple_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.MAPLE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_PALM = ITEMS.register("sign_palm",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_PALM.get(), REOBlocks.SIGN_PALM_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_PALM = ITEMS.register("sign_hanging_palm",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.SIGN_HANGING_PALM_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_PALM = ITEMS.register("boat_palm",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PALM, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_PALM_CHEST = ITEMS.register("boat_palm_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PALM, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_PAPAYA = ITEMS.register("sign_papaya",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_PAPAYA.get(), REOBlocks.SIGN_PAPAYA_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_PAPAYA = ITEMS.register("sign_hanging_papaya",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.SIGN_HANGING_PAPAYA_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_PAPAYA = ITEMS.register("boat_papaya",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PAPAYA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_PAPAYA_CHEST = ITEMS.register("boat_papaya_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PAPAYA, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_PINE = ITEMS.register("sign_pine",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_PINE.get(), REOBlocks.SIGN_PINE_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_PINE = ITEMS.register("sign_hanging_pine",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_PINE.get(), REOBlocks.SIGN_HANGING_PINE_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_PINE = ITEMS.register("boat_pine",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PINE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_PINE_CHEST = ITEMS.register("boat_pine_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PINE, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_PLUM = ITEMS.register("sign_plum",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_PLUM.get(), REOBlocks.SIGN_PLUM_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_PLUM = ITEMS.register("sign_hanging_plum",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.SIGN_HANGING_PLUM_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_PLUM = ITEMS.register("boat_plum",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PLUM, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_PLUM_CHEST = ITEMS.register("boat_plum_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PLUM, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_POPLAR = ITEMS.register("sign_poplar",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_POPLAR.get(), REOBlocks.SIGN_POPLAR_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_POPLAR = ITEMS.register("sign_hanging_poplar",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_POPLAR.get(), REOBlocks.SIGN_HANGING_POPLAR_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_POPLAR = ITEMS.register("boat_poplar",
            () -> new ModBoatItem(false, REOBoatEntity.Type.POPLAR, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_POPLAR_CHEST = ITEMS.register("boat_poplar_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.POPLAR, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_REDWOOD = ITEMS.register("sign_redwood",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_REDWOOD.get(), REOBlocks.SIGN_REDWOOD_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_REDWOOD = ITEMS.register("sign_hanging_redwood",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_REDWOOD.get(), REOBlocks.SIGN_HANGING_REDWOOD_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_REDWOOD = ITEMS.register("boat_redwood",
            () -> new ModBoatItem(false, REOBoatEntity.Type.REDWOOD, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_REDWOOD_CHEST = ITEMS.register("boat_redwood_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.REDWOOD, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_RUBBER = ITEMS.register("sign_rubber",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_RUBBER.get(), REOBlocks.SIGN_RUBBER_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_RUBBER = ITEMS.register("sign_hanging_rubber",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.SIGN_HANGING_RUBBER_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_RUBBER = ITEMS.register("boat_rubber",
            () -> new ModBoatItem(false, REOBoatEntity.Type.RUBBER, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_RUBBER_CHEST = ITEMS.register("boat_rubber_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.RUBBER, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_TEAK = ITEMS.register("sign_teak",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_TEAK.get(), REOBlocks.SIGN_TEAK_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_TEAK = ITEMS.register("sign_hanging_teak",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.SIGN_HANGING_TEAK_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_TEAK = ITEMS.register("boat_teak",
            () -> new ModBoatItem(false, REOBoatEntity.Type.TEAK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_TEAK_CHEST = ITEMS.register("boat_teak_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.TEAK, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_WALNUT = ITEMS.register("sign_walnut",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_WALNUT.get(), REOBlocks.SIGN_WALNUT_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_WALNUT = ITEMS.register("sign_hanging_walnut",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_WALNUT.get(), REOBlocks.SIGN_HANGING_WALNUT_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_WALNUT = ITEMS.register("boat_walnut",
            () -> new ModBoatItem(false, REOBoatEntity.Type.WALNUT, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_WALNUT_CHEST = ITEMS.register("boat_walnut_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.WALNUT, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SIGN_WILLOW = ITEMS.register("sign_willow",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.SIGN_WILLOW.get(), REOBlocks.SIGN_WILLOW_WALL.get()));
    public static final RegistryObject<Item> SIGN_HANGING_WILLOW = ITEMS.register("sign_hanging_willow",
            () -> new HangingSignItem(REOBlocks.SIGN_HANGING_WILLOW.get(), REOBlocks.SIGN_HANGING_WILLOW_WALL.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_WILLOW = ITEMS.register("boat_willow",
            () -> new ModBoatItem(false, REOBoatEntity.Type.WILLOW, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BOAT_WILLOW_CHEST = ITEMS.register("boat_willow_chest",
            () -> new ModBoatItem(true, REOBoatEntity.Type.WILLOW, new Item.Properties().stacksTo(1)));

    // Seeds
    public static final RegistryObject<Item> SEED_BARLEY= ITEMS.register("seed_barley",
            () -> new ItemNameBlockItem(REOBlocks.CROP_BARLEY.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_CAULIFLOWER= ITEMS.register("seed_cauliflower",
            () -> new ItemNameBlockItem(REOBlocks.CROP_CAULIFLOWER.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_COTTON= ITEMS.register("seed_cotton",
            () -> new ItemNameBlockItem(REOBlocks.CROP_COTTON.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_RICE= ITEMS.register("seed_rice",
            () -> new ItemNameBlockItem(REOBlocks.CROP_RICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> SEED_STRAWBERRY= ITEMS.register("seed_strawberry",
            () -> new Item( new Item.Properties()));
    public static final RegistryObject<Item> SEED_TOMATO= ITEMS.register("seed_tomato",
            () -> new ItemNameBlockItem(REOBlocks.CROP_TOMATO.get(), new Item.Properties()));

    // Food
    public static final RegistryObject<Item> PLANT_BARLEY = ITEMS.register("plant_barley",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANT_COTTON = ITEMS.register("plant_cotton",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLANT_RICE = ITEMS.register("plant_rice",
            () -> new Item(new Item.Properties()));

    // Flour
    public static final RegistryObject<Item> FLOUR_BARLEY = ITEMS.register("flour_barley",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR_WHEAT = ITEMS.register("flour_wheat",
            () -> new Item(new Item.Properties()));

    // Food //
    // Fruit
    public static final RegistryObject<Item> FOOD_CHERRY = ITEMS.register("food_cherry",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_CHESTNUT = ITEMS.register("food_chestnut",
            () -> new Item(new Item.Properties().food(REOFoods.NUT)));
    public static final RegistryObject<Item> FOOD_DATES = ITEMS.register("food_dates",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_LEMON = ITEMS.register("food_lemon",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_CITRUS_BLOCK.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_LIME = ITEMS.register("food_lime",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_LIME_BLOCK.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_PAPAYA = ITEMS.register("food_papaya",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_PAPAYA_BLOCK.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_PEACH = ITEMS.register("food_peach",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_PEAR = ITEMS.register("food_pear",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_PEAR_BLOCK.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_PLUM = ITEMS.register("food_plum",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_PLUM_BLOCK.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> FOOD_WALNUT = ITEMS.register("food_walnut",
            () -> new ItemNameBlockItem(REOBlocks.FRUIT_WALNUT_BLOCK.get(), new Item.Properties().food(REOFoods.NUT)));

    // Veg
    public static final RegistryObject<Item> FOOD_CAULIFLOWER = ITEMS.register("food_cauliflower",
            () -> new Item(new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> FOOD_ONION = ITEMS.register("food_onion",
            () -> new ItemNameBlockItem(REOBlocks.CROP_ONIONS.get(), new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> FOOD_RICE = ITEMS.register("food_rice",
            () -> new Item(new Item.Properties().food(REOFoods.RICE)));
    public static final RegistryObject<Item> FOOD_TOMATO = ITEMS.register("food_tomato",
            () -> new Item(new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> FOOD_TOMATO_ROTTEN = ITEMS.register("food_tomato_rotten",
            () -> new Item(new Item.Properties().food(REOFoods.TOMATO_ROTTEN)));

    // Berries
    public static final RegistryObject<Item> FOOD_BLACKBERRY = ITEMS.register("food_blackberry",
            () -> new ItemNameBlockItem(REOBlocks.BERRY_BLACKBERRY_BLOCK.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> FOOD_BLUEBERRY = ITEMS.register("food_blueberry",
            () -> new ItemNameBlockItem(REOBlocks.BERRY_BLUEBERRY_BLOCK.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> FOOD_RASPBERRY = ITEMS.register("food_raspberry",
            () -> new ItemNameBlockItem(REOBlocks.BERRY_RASPBERRY_BLOCK.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> FOOD_STRAWBERRY = ITEMS.register("food_strawberry",
            () -> new Item(new Item.Properties().food(REOFoods.BERRY)));

    // Ore Seeds
    //public static final RegistryObject<Item> SEED_ALUMINIUM = ITEMS.register("seed_aluminium",
    //        () -> new ItemNameBlockItem(REOBlocks.CROP_ALUMINIUM.get(), new Item.Properties()));

    // Tech //
    // Misc
    public static final RegistryObject<Item> SAP = ITEMS.register("sap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));

    // Gear
    public static final RegistryObject<Item> GEAR_ALUMINIUM = ITEMS.register("gear_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_AMETHYST = ITEMS.register("gear_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_BRASS = ITEMS.register("gear_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_BRONZE = ITEMS.register("gear_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_COPPER = ITEMS.register("gear_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_DIAMOND = ITEMS.register("gear_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_ELECTRUM = ITEMS.register("gear_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_EMERALD = ITEMS.register("gear_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_ENDERITE = ITEMS.register("gear_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_GOLDEN = ITEMS.register("gear_golden",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_IRON = ITEMS.register("gear_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_LEAD = ITEMS.register("gear_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_NICKEL = ITEMS.register("gear_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_PLATINUM = ITEMS.register("gear_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_PERIDOT = ITEMS.register("gear_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_RUBY = ITEMS.register("gear_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_SAPPHIRE = ITEMS.register("gear_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_SILVER = ITEMS.register("gear_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_STEEL = ITEMS.register("gear_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_STONE = ITEMS.register("gear_stone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_TIN = ITEMS.register("gear_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_WOODEN = ITEMS.register("gear_wooden",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEAR_ZINC = ITEMS.register("gear_zinc",
            () -> new Item(new Item.Properties()));

    // Plate
    public static final RegistryObject<Item> PLATE_ALUMINIUM = ITEMS.register("plate_aluminium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_AMETHYST = ITEMS.register("plate_amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_BRASS = ITEMS.register("plate_brass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_BRONZE = ITEMS.register("plate_bronze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_COPPER = ITEMS.register("plate_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_DIAMOND = ITEMS.register("plate_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_ELECTRUM = ITEMS.register("plate_electrum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_EMERALD = ITEMS.register("plate_emerald",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_ENDERITE = ITEMS.register("plate_enderite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_GOLDEN = ITEMS.register("plate_golden",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_IRON = ITEMS.register("plate_iron",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_LEAD = ITEMS.register("plate_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_NICKEL = ITEMS.register("plate_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_PLATINUM = ITEMS.register("plate_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_PERIDOT = ITEMS.register("plate_peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_RUBY = ITEMS.register("plate_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_SAPPHIRE = ITEMS.register("plate_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_SILVER = ITEMS.register("plate_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_STEEL = ITEMS.register("plate_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_TIN = ITEMS.register("plate_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATE_ZINC = ITEMS.register("plate_zinc",
            () -> new Item(new Item.Properties()));

}
