package net.coton999.realearthores.item;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.entity.custom.REOBoatEntity;
import net.coton999.realearthores.fluid.REOFluids;
import net.coton999.realearthores.item.custom.FuelItem;
import net.coton999.realearthores.item.custom.ModArmourItem;
import net.coton999.realearthores.item.custom.ModBoatItem;
import net.coton999.realearthores.item.custom.ModShearsItem;
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
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));

    // Gem
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT = ITEMS.register("peridot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    // Gem Shards
    public static final RegistryObject<Item> PERIDOT_SHARD = ITEMS.register("peridot_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("sapphire_shard",
            () -> new Item(new Item.Properties()));

    // Nugget
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_NUGGET = ITEMS.register("amethyst_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_NUGGET = ITEMS.register("enderite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_NUGGET = ITEMS.register("peridot_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_NUGGET = ITEMS.register("sapphire_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties()));

    // Dust
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_DUST = ITEMS.register("amethyst_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_DUST = ITEMS.register("brass_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_DUST = ITEMS.register("enderite_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_DUST = ITEMS.register("obsidian_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_DUST = ITEMS.register("peridot_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_DUST = ITEMS.register("ruby_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties()));

    // Dirty Dust
    public static final RegistryObject<Item> ALUMINUM_DIRTY = ITEMS.register("aluminium_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_DIRTY = ITEMS.register("amethyst_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_DIRTY = ITEMS.register("brass_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_DIRTY = ITEMS.register("bronze_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_DIRTY = ITEMS.register("copper_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DIRTY = ITEMS.register("diamond_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_DIRTY = ITEMS.register("electrum_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_DIRTY = ITEMS.register("emerald_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_DIRTY = ITEMS.register("enderite_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DIRTY = ITEMS.register("gold_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_DIRTY = ITEMS.register("iron_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_DIRTY = ITEMS.register("lead_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_DIRTY = ITEMS.register("netherite_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_DIRTY = ITEMS.register("nickel_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_DIRTY = ITEMS.register("obsidian_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_DIRTY = ITEMS.register("peridot_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_DIRTY = ITEMS.register("platinum_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_DIRTY = ITEMS.register("ruby_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_DIRTY = ITEMS.register("sapphire_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DIRTY = ITEMS.register("silver_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_DIRTY = ITEMS.register("steel_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_DIRTY = ITEMS.register("tin_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_DIRTY = ITEMS.register("uranium_dirty",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_DIRTY = ITEMS.register("zinc_dirty",
            () -> new Item(new Item.Properties()));

    // Buckets
    public static final RegistryObject<Item> ALUMINUM_BUCKET = ITEMS.register("aluminium_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_ALUMINIUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> AMETHYST_BUCKET = ITEMS.register("amethyst_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_AMETHYST_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BRASS_BUCKET = ITEMS.register("brass_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_BRASS_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> BRONZE_BUCKET = ITEMS.register("bronze_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_BRONZE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> COAL_BUCKET = ITEMS.register("coal_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_COAL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> COPPER_BUCKET = ITEMS.register("copper_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_COPPER_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_BUCKET = ITEMS.register("diamond_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_DIAMOND_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> ELECTRUM_BUCKET = ITEMS.register("electrum_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_ELECTRUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_BUCKET = ITEMS.register("emerald_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_EMERALD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> ENDERITE_BUCKET = ITEMS.register("enderite_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_ENDERITE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> GOLD_BUCKET = ITEMS.register("gold_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_GOLD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> IRON_BUCKET = ITEMS.register("iron_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_IRON_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> LAPIS_BUCKET = ITEMS.register("lapis_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_LAPIS_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> LEAD_BUCKET = ITEMS.register("lead_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_LEAD_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> NICKEL_BUCKET = ITEMS.register("nickel_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_NICKEL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> PERIDOT_BUCKET = ITEMS.register("peridot_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_PERIDOT_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> PLATINUM_BUCKET = ITEMS.register("platinum_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_PLATINUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> REDSTONE_BUCKET = ITEMS.register("redstone_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_REDSTONE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> RUBY_BUCKET = ITEMS.register("ruby_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_RUBY_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SAPPHIRE_BUCKET = ITEMS.register("sapphire_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_SAPPHIRE_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> SILVER_BUCKET = ITEMS.register("silver_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_SILVER_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> STEEL_BUCKET = ITEMS.register("steel_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_STEEL_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> TIN_BUCKET = ITEMS.register("tin_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_TIN_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> URANIUM_BUCKET = ITEMS.register("uranium_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_URANIUM_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> ZINC_BUCKET = ITEMS.register("zinc_bucket",
            () -> new BucketItem(REOFluids.MOLTEN_ZINC_SOURCE,
                    new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));

    // Luminous Powder
    public static final RegistryObject<Item> BLACK_LUMINOUS = ITEMS.register("black_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_LUMINOUS = ITEMS.register("blue_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROWN_LUMINOUS = ITEMS.register("brown_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CYAN_LUMINOUS = ITEMS.register("cyan_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAY_LUMINOUS = ITEMS.register("gray_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_LUMINOUS = ITEMS.register("green_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_BLUE_LUMINOUS = ITEMS.register("light_blue_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIGHT_GRAY_LUMINOUS = ITEMS.register("light_gray_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIME_LUMINOUS = ITEMS.register("lime_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGENTA_LUMINOUS = ITEMS.register("magenta_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_LUMINOUS = ITEMS.register("orange_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_LUMINOUS = ITEMS.register("pink_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LUMINOUS = ITEMS.register("purple_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_LUMINOUS = ITEMS.register("red_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_LUMINOUS = ITEMS.register("white_luminous",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_LUMINOUS = ITEMS.register("yellow_luminous",
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


    // Armour //
    // Aluminium
    public static final RegistryObject<Item> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ModArmourItem(REOArmourMaterials.ALUMINIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ALUMINIUM_HORSE_ARMOR = ITEMS.register("aluminium_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/aluminium_horse_armor.png"),
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

    public static final RegistryObject<Item> AMETHYST_HORSE_ARMOR = ITEMS.register("amethyst_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/amethyst_horse_armor.png"),
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

    public static final RegistryObject<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor",
            () -> new HorseArmorItem(5, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/bronze_horse_armor.png"),
                    new Item.Properties().stacksTo(1)));

    // Chain
    //public static final RegistryObject<Item> CHAIN_HORSE_ARMOR = ITEMS.register("chain_horse_armor",
    //        () -> new HorseArmorItem(4, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/chain_horse_armor.png"),
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

    public static final RegistryObject<Item> ENDERITE_HORSE_ARMOR = ITEMS.register("enderite_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/enderite_horse_armor.png"),
                    new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));


    // Netherite
    //public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
    //        () -> new HorseArmorItem(13, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/netherite_horse_armor.png"),
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

    public static final RegistryObject<Item> PLATINUM_HORSE_ARMOR = ITEMS.register("platinum_horse_armor",
            () -> new HorseArmorItem(11, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/platinum_horse_armor.png"),
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

    public static final RegistryObject<Item> PERIDOT_HORSE_ARMOR = ITEMS.register("peridot_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/peridot_horse_armor.png"),
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

    public static final RegistryObject<Item> RUBY_HORSE_ARMOR = ITEMS.register("ruby_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/ruby_horse_armor.png"),
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

    public static final RegistryObject<Item> SAPPHIRE_HORSE_ARMOR = ITEMS.register("sapphire_horse_armor",
            () -> new HorseArmorItem(9, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/sapphire_horse_armor.png"),
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

    public static final RegistryObject<Item> SILVER_HORSE_ARMOR = ITEMS.register("silver_horse_armor",
            () -> new HorseArmorItem(7, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/silver_horse_armor.png"),
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

    public static final RegistryObject<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor",
            () -> new HorseArmorItem(8, new ResourceLocation(RealEarthOres.MOD_ID, "textures/entity/horse/armor/steel_horse_armor.png"),
                    new Item.Properties().stacksTo(1)));


    // Wood //
    // Balsa
    public static final RegistryObject<Item> BALSA_SIGN = ITEMS.register("balsa_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.BALSA_SIGN.get(), REOBlocks.BALSA_WALL_SIGN.get()));
    public static final RegistryObject<Item> BALSA_HANGING_SIGN = ITEMS.register("balsa_hanging_sign",
            () -> new HangingSignItem(REOBlocks.BALSA_HANGING_SIGN.get(), REOBlocks.BALSA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BALSA_BOAT = ITEMS.register("balsa_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.BALSA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BALSA_CHEST_BOAT = ITEMS.register("balsa_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.BALSA, new Item.Properties().stacksTo(1)));

    // Baobab
    public static final RegistryObject<Item> BAOBAB_SIGN = ITEMS.register("baobab_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.BAOBAB_SIGN.get(), REOBlocks.BAOBAB_WALL_SIGN.get()));
    public static final RegistryObject<Item> BAOBAB_HANGING_SIGN = ITEMS.register("baobab_hanging_sign",
            () -> new HangingSignItem(REOBlocks.BAOBAB_HANGING_SIGN.get(), REOBlocks.BAOBAB_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BAOBAB_BOAT = ITEMS.register("baobab_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.BAOBAB, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BAOBAB_CHEST_BOAT = ITEMS.register("baobab_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.BAOBAB, new Item.Properties().stacksTo(1)));

    // Hill Cherry
    public static final RegistryObject<Item> HILL_CHERRY_SIGN = ITEMS.register("hill_cherry_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.HILL_CHERRY_SIGN.get(), REOBlocks.HILL_CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> HILL_CHERRY_HANGING_SIGN = ITEMS.register("hill_cherry_hanging_sign",
            () -> new HangingSignItem(REOBlocks.HILL_CHERRY_HANGING_SIGN.get(), REOBlocks.HILL_CHERRY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HILL_CHERRY_BOAT = ITEMS.register("hill_cherry_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.HILL_CHERRY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HILL_CHERRY_CHEST_BOAT = ITEMS.register("hill_cherry_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.HILL_CHERRY, new Item.Properties().stacksTo(1)));

    // Chestnut
    public static final RegistryObject<Item> CHESTNUT_SIGN = ITEMS.register("chestnut_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.CHESTNUT_SIGN.get(), REOBlocks.CHESTNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> CHESTNUT_HANGING_SIGN = ITEMS.register("chestnut_hanging_sign",
            () -> new HangingSignItem(REOBlocks.CHESTNUT_HANGING_SIGN.get(), REOBlocks.CHESTNUT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BOAT_CHESTNUT = ITEMS.register("chestnut_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.CHESTNUT, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHESTNUT_CHEST_BOAT = ITEMS.register("chestnut_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.CHESTNUT, new Item.Properties().stacksTo(1)));

    // Citrus
    public static final RegistryObject<Item> CITRUS_SIGN = ITEMS.register("citrus_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.CITRUS_SIGN.get(), REOBlocks.CITRUS_WALL_SIGN.get()));
    public static final RegistryObject<Item> CITRUS_HANGING_SIGN = ITEMS.register("citrus_hanging_sign",
            () -> new HangingSignItem(REOBlocks.CITRUS_HANGING_SIGN.get(), REOBlocks.CITRUS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CITRUS_BOAT = ITEMS.register("citrus_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.CITRUS, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CITRUS_CHEST_BOAT = ITEMS.register("citrus_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.CITRUS, new Item.Properties().stacksTo(1)));

    // Ebony
    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.EBONY_SIGN.get(), REOBlocks.EBONY_WALL_SIGN.get()));
    public static final RegistryObject<Item> EBONY_HANGING_SIGN = ITEMS.register("ebony_hanging_sign",
            () -> new HangingSignItem(REOBlocks.EBONY_HANGING_SIGN.get(), REOBlocks.EBONY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> EBONY_BOAT = ITEMS.register("ebony_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.EBONY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EBONY_CHEST_BOAT = ITEMS.register("ebony_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.EBONY, new Item.Properties().stacksTo(1)));

    // Larch
    public static final RegistryObject<Item> LARCH_SIGN = ITEMS.register("larch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.LARCH_SIGN.get(), REOBlocks.LARCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> LARCH_HANGING_SIGN = ITEMS.register("larch_hanging_sign",
            () -> new HangingSignItem(REOBlocks.LARCH_HANGING_SIGN.get(), REOBlocks.LARCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LARCH_BOAT = ITEMS.register("larch_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.LARCH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LARCH_CHEST_BOAT = ITEMS.register("larch_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.LARCH, new Item.Properties().stacksTo(1)));

    // Lime
    public static final RegistryObject<Item> LIME_SIGN = ITEMS.register("lime_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.LIME_SIGN.get(), REOBlocks.LIME_WALL_SIGN.get()));
    public static final RegistryObject<Item> LIME_HANGING_SIGN = ITEMS.register("lime_hanging_sign",
            () -> new HangingSignItem(REOBlocks.LIME_HANGING_SIGN.get(), REOBlocks.LIME_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> LIME_BOAT = ITEMS.register("lime_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.LIME, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIME_CHEST_BOAT = ITEMS.register("lime_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.LIME, new Item.Properties().stacksTo(1)));

    // Mahogany
    public static final RegistryObject<Item> MAHOGANY_SIGN = ITEMS.register("mahogany_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.MAHOGANY_SIGN.get(), REOBlocks.MAHOGANY_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAHOGANY_HANGING_SIGN = ITEMS.register("mahogany_hanging_sign",
            () -> new HangingSignItem(REOBlocks.MAHOGANY_HANGING_SIGN.get(), REOBlocks.MAHOGANY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> MAHOGANY_BOAT = ITEMS.register("mahogany_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.MAHOGANY, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAHOGANY_CHEST_BOAT = ITEMS.register("mahogany_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.MAHOGANY, new Item.Properties().stacksTo(1)));

    // Maple
    public static final RegistryObject<Item> MAPLE_SIGN = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.MAPLE_SIGN.get(), REOBlocks.MAPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> MAPLE_HANGING_SIGN = ITEMS.register("maple_hanging_sign",
            () -> new HangingSignItem(REOBlocks.MAPLE_HANGING_SIGN.get(), REOBlocks.MAPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> MAPLE_BOAT = ITEMS.register("maple_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.MAPLE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAPLE_CHEST_BOAT = ITEMS.register("maple_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.MAPLE, new Item.Properties().stacksTo(1)));

    // Palm
    public static final RegistryObject<Item> PALM_SIGN = ITEMS.register("palm_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.PALM_SIGN.get(), REOBlocks.PALM_WALL_SIGN.get()));
    public static final RegistryObject<Item> PALM_HANGING_SIGN = ITEMS.register("palm_hanging_sign",
            () -> new HangingSignItem(REOBlocks.PALM_HANGING_SIGN.get(), REOBlocks.PALM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PALM_BOAT = ITEMS.register("palm_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PALM, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PALM_CHEST_BOAT = ITEMS.register("palm_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PALM, new Item.Properties().stacksTo(1)));

    // Papaya
    public static final RegistryObject<Item> PAPAYA_SIGN = ITEMS.register("papaya_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.PAPAYA_SIGN.get(), REOBlocks.PAPAYA_WALL_SIGN.get()));
    public static final RegistryObject<Item> PAPAYA_HANGING_SIGN = ITEMS.register("papaya_hanging_sign",
            () -> new HangingSignItem(REOBlocks.PAPAYA_HANGING_SIGN.get(), REOBlocks.PAPAYA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PAPAYA_BOAT = ITEMS.register("papaya_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PAPAYA, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PAPAYA_CHEST_BOAT = ITEMS.register("papaya_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PAPAYA, new Item.Properties().stacksTo(1)));

    // Pine
    public static final RegistryObject<Item> PINE_SIGN = ITEMS.register("pine_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.PINE_SIGN.get(), REOBlocks.PINE_WALL_SIGN.get()));
    public static final RegistryObject<Item> PINE_HANGING_SIGN = ITEMS.register("pine_hanging_sign",
            () -> new HangingSignItem(REOBlocks.PINE_HANGING_SIGN.get(), REOBlocks.PINE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PINE_BOAT = ITEMS.register("pine_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PINE, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINE_CHEST_BOAT = ITEMS.register("pine_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PINE, new Item.Properties().stacksTo(1)));

    // Plum
    public static final RegistryObject<Item> PLUM_SIGN = ITEMS.register("plum_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.PLUM_SIGN.get(), REOBlocks.PLUM_WALL_SIGN.get()));
    public static final RegistryObject<Item> PLUM_HANGING_SIGN = ITEMS.register("plum_hanging_sign",
            () -> new HangingSignItem(REOBlocks.PLUM_HANGING_SIGN.get(), REOBlocks.PLUM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> PLUM_BOAT = ITEMS.register("plum_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.PLUM, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PLUM_CHEST_BOAT = ITEMS.register("plum_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.PLUM, new Item.Properties().stacksTo(1)));

    // Poplar
    public static final RegistryObject<Item> POPLAR_SIGN = ITEMS.register("poplar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.POPLAR_SIGN.get(), REOBlocks.POPLAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> POPLAR_HANGING_SIGN = ITEMS.register("poplar_hanging_sign",
            () -> new HangingSignItem(REOBlocks.POPLAR_HANGING_SIGN.get(), REOBlocks.POPLAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> POPLAR_BOAT = ITEMS.register("poplar_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.POPLAR, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> POPLAR_CHEST_BOAT = ITEMS.register("poplar_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.POPLAR, new Item.Properties().stacksTo(1)));

    // Redwood
    public static final RegistryObject<Item> REDWOOD_SIGN = ITEMS.register("redwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.REDWOOD_SIGN.get(), REOBlocks.REDWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> REDWOOD_HANGING_SIGN = ITEMS.register("redwood_hanging_sign",
            () -> new HangingSignItem(REOBlocks.REDWOOD_HANGING_SIGN.get(), REOBlocks.REDWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> REDWOOD_BOAT = ITEMS.register("redwood_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.REDWOOD, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> REDWOOD_CHEST_BOAT = ITEMS.register("redwood_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.REDWOOD, new Item.Properties().stacksTo(1)));

    // Rubber
    public static final RegistryObject<Item> RUBBER_SIGN = ITEMS.register("rubber_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.RUBBER_SIGN.get(), REOBlocks.RUBBER_WALL_SIGN.get()));
    public static final RegistryObject<Item> RUBBER_HANGING_SIGN = ITEMS.register("rubber_hanging_sign",
            () -> new HangingSignItem(REOBlocks.RUBBER_HANGING_SIGN.get(), REOBlocks.RUBBER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RUBBER_BOAT = ITEMS.register("rubber_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.RUBBER, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RUBBER_CHEST_BOAT = ITEMS.register("rubber_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.RUBBER, new Item.Properties().stacksTo(1)));

    // Teak
    public static final RegistryObject<Item> TEAK_SIGN = ITEMS.register("teak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.TEAK_SIGN.get(), REOBlocks.TEAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> TEAK_HANGING_SIGN = ITEMS.register("teak_hanging_sign",
            () -> new HangingSignItem(REOBlocks.TEAK_HANGING_SIGN.get(), REOBlocks.TEAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TEAK_BOAT = ITEMS.register("teak_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.TEAK, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TEAK_CHEST_BOAT = ITEMS.register("teak_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.TEAK, new Item.Properties().stacksTo(1)));

    // Walnut
    public static final RegistryObject<Item> WALNUT_SIGN = ITEMS.register("walnut_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.WALNUT_SIGN.get(), REOBlocks.WALNUT_WALL_SIGN.get()));
    public static final RegistryObject<Item> WALNUT_HANGING_SIGN = ITEMS.register("walnut_hanging_sign",
            () -> new HangingSignItem(REOBlocks.WALNUT_HANGING_SIGN.get(), REOBlocks.WALNUT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WALNUT_BOAT = ITEMS.register("walnut_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.WALNUT, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WALNUT_CHEST_BOAT = ITEMS.register("walnut_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.WALNUT, new Item.Properties().stacksTo(1)));

    // Willow
    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), REOBlocks.WILLOW_SIGN.get(), REOBlocks.WILLOW_WALL_SIGN.get()));
    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ITEMS.register("willow_hanging_sign",
            () -> new HangingSignItem(REOBlocks.WILLOW_HANGING_SIGN.get(), REOBlocks.WILLOW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat",
            () -> new ModBoatItem(false, REOBoatEntity.Type.WILLOW, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WILLOW_CHEST_BOAT = ITEMS.register("willow_chest_boat",
            () -> new ModBoatItem(true, REOBoatEntity.Type.WILLOW, new Item.Properties().stacksTo(1)));

    // Food //
    // Seeds
    public static final RegistryObject<Item> BARLEY_SEED = ITEMS.register("barley_seed",
            () -> new ItemNameBlockItem(REOBlocks.BARLEY_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CAULIFLOWER_SEED = ITEMS.register("cauliflower_seed",
            () -> new ItemNameBlockItem(REOBlocks.CAULIFLOWER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> COTTON_SEED = ITEMS.register("cotton_seed",
            () -> new ItemNameBlockItem(REOBlocks.COTTON_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ENDER_LILLY_SEED = ITEMS.register("ender_lilly_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RICE_SEED = ITEMS.register("rice_seed",
            () -> new ItemNameBlockItem(REOBlocks.RICE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> STRAWBERRY_SEED = ITEMS.register("strawberry_seed",
            () -> new Item( new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_SEED = ITEMS.register("tomato_seed",
            () -> new ItemNameBlockItem(REOBlocks.TOMATO_CROP.get(), new Item.Properties()));

    // Crops
    public static final RegistryObject<Item> BARLEY_PLANT = ITEMS.register("barley_plant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COTTON_PLANT = ITEMS.register("cotton_plant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RICE_PLANT = ITEMS.register("rice_plant",
            () -> new Item(new Item.Properties()));

    // Flour
    public static final RegistryObject<Item> BARLEY_FLOUR = ITEMS.register("barley_flour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour",
            () -> new Item(new Item.Properties()));

    // Fruit
    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> DATES = ITEMS.register("dates",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new ItemNameBlockItem(REOBlocks.CITRUS_FRUIT.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> LIME = ITEMS.register("lime",
            () -> new ItemNameBlockItem(REOBlocks.LIME_FRUIT.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> PAPAYA = ITEMS.register("papaya",
            () -> new ItemNameBlockItem(REOBlocks.PAPAYA_FRUIT.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new ItemNameBlockItem(REOBlocks.PEAR_FRUIT.get(), new Item.Properties().food(REOFoods.FRUIT)));
    public static final RegistryObject<Item> PLUM = ITEMS.register("plum",
            () -> new ItemNameBlockItem(REOBlocks.PLUM_FRUIT.get(), new Item.Properties().food(REOFoods.FRUIT)));

    // Nuts
    public static final RegistryObject<Item> CHESTNUT = ITEMS.register("chestnut",
            () -> new Item(new Item.Properties().food(REOFoods.NUT)));
    public static final RegistryObject<Item> WALNUT = ITEMS.register("walnut",
            () -> new ItemNameBlockItem(REOBlocks.WALNUT_FRUIT.get(), new Item.Properties().food(REOFoods.NUT)));

    // Veg
    public static final RegistryObject<Item> CAULIFLOWER = ITEMS.register("cauliflower",
            () -> new Item(new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new ItemNameBlockItem(REOBlocks.ONIONS_CROP.get(), new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(REOFoods.RICE)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(REOFoods.VEGETABLE)));
    public static final RegistryObject<Item> TOMATO_ROTTEN = ITEMS.register("tomato_rotten",
            () -> new Item(new Item.Properties().food(REOFoods.TOMATO_ROTTEN)));

    // Berries
    public static final RegistryObject<Item> BLACKBERRY = ITEMS.register("blackberry",
            () -> new ItemNameBlockItem(REOBlocks.BLACKBERRY_FRUIT.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> BLUEBERRY = ITEMS.register("blueberry",
            () -> new ItemNameBlockItem(REOBlocks.BLUEBERRY_FRUIT.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> RASPBERRY = ITEMS.register("raspberry",
            () -> new ItemNameBlockItem(REOBlocks.RASPBERRY_FRUIT.get(), new Item.Properties().food(REOFoods.BERRY)));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(REOFoods.BERRY)));

    // Ore Seeds
    //public static final RegistryObject<Item> ALUMINIUM_SEED = ITEMS.register("aluminium_seed",
    //        () -> new ItemNameBlockItem(REOBlocks.CROP_ALUMINIUM.get(), new Item.Properties()));

    // Tech //
    // Misc
    public static final RegistryObject<Item> SAP = ITEMS.register("sap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RESIN = ITEMS.register("resin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap",
            () -> new Item(new Item.Properties()));

    // Gear
    public static final RegistryObject<Item> ALUMINUM_GEAR = ITEMS.register("aluminium_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_GEAR = ITEMS.register("amethyst_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_GEAR = ITEMS.register("brass_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_GEAR = ITEMS.register("bronze_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_GEAR = ITEMS.register("copper_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_GEAR = ITEMS.register("diamond_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_GEAR = ITEMS.register("electrum_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_GEAR = ITEMS.register("emerald_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_GEAR = ITEMS.register("enderite_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_GERAR = ITEMS.register("golden_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_GEAR = ITEMS.register("iron_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_GEAR = ITEMS.register("lead_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_GEAR = ITEMS.register("nickel_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_GEAR = ITEMS.register("platinum_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_GEAR = ITEMS.register("peridot_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_GEAR = ITEMS.register("ruby_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_GEAR = ITEMS.register("sapphire_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GEAR = ITEMS.register("silver_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_GEAR = ITEMS.register("stone_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_GEAR = ITEMS.register("tin_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_GEAR = ITEMS.register("wooden_gear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_GEAR = ITEMS.register("zinc_gear",
            () -> new Item(new Item.Properties()));

    // Plate
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminium_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_PLATE = ITEMS.register("amethyst_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRASS_PALTE = ITEMS.register("brass_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_PALTE = ITEMS.register("copper_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELECTRUM_PLATE = ITEMS.register("electrum_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_PLATE = ITEMS.register("emerald_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERITE_PLATE = ITEMS.register("enderite_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("golden_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_PLATE = ITEMS.register("lead_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_PLATE = ITEMS.register("nickel_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_PLATE = ITEMS.register("platinum_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_PLATE = ITEMS.register("peridot_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PLATE = ITEMS.register("ruby_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PLATE = ITEMS.register("sapphire_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_PLATE = ITEMS.register("zinc_plate",
            () -> new Item(new Item.Properties()));

    // Capacitor
    public static final RegistryObject<Item> BASIC_CAPACITOR = ITEMS.register("basic_capacitor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADVANCED_CAPACITOR = ITEMS.register("advanced_capacitor",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ULTIMATE_CAPACITOR = ITEMS.register("ultimate_capacitor",
            () -> new Item(new Item.Properties()));

}
