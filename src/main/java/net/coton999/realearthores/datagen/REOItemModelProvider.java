package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.item.REOItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class REOItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public REOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RealEarthOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Raw Ore
        rawItem(REOItems.RAW_ALUMINIUM);
        rawItem(REOItems.RAW_ENDERITE);
        rawItem(REOItems.RAW_LEAD);
        rawItem(REOItems.RAW_NICKEL);
        rawItem(REOItems.RAW_PLATINUM);
        rawItem(REOItems.RAW_SILVER);
        rawItem(REOItems.RAW_TIN);
        rawItem(REOItems.RAW_URANIUM);
        rawItem(REOItems.RAW_ZINC);

        // Ingot
        ingotItem(REOItems.INGOT_ALUMINIUM);
        ingotItem(REOItems.INGOT_BRASS);
        ingotItem(REOItems.INGOT_BRONZE);
        ingotItem(REOItems.INGOT_ELECTRUM);
        ingotItem(REOItems.INGOT_ENDERITE);
        ingotItem(REOItems.INGOT_LEAD);
        ingotItem(REOItems.INGOT_NICKEL);
        ingotItem(REOItems.INGOT_PLATINUM);
        ingotItem(REOItems.INGOT_SILVER);
        ingotItem(REOItems.INGOT_STEEL);
        ingotItem(REOItems.INGOT_TIN);
        ingotItem(REOItems.INGOT_URANIUM);
        ingotItem(REOItems.INGOT_ZINC);

        // Gem
        gemItem(REOItems.GEM_AMETHYST);
        gemItem(REOItems.GEM_PERIDOT);
        gemItem(REOItems.GEM_RUBY);
        gemItem(REOItems.GEM_SAPPHIRE);

        // Gem Shard
        shardItem(REOItems.SHARD_PERIDOT);
        shardItem(REOItems.SHARD_RUBY);
        shardItem(REOItems.SHARD_SAPPHIRE);

        // Nugget
        nuggetItem(REOItems.NUGGET_ALUMINIUM);
        nuggetItem(REOItems.NUGGET_AMETHYST);
        nuggetItem(REOItems.NUGGET_BRASS);
        nuggetItem(REOItems.NUGGET_BRONZE);
        nuggetItem(REOItems.NUGGET_COPPER);
        nuggetItem(REOItems.NUGGET_DIAMOND);
        nuggetItem(REOItems.NUGGET_ELECTRUM);
        nuggetItem(REOItems.NUGGET_EMERALD);
        nuggetItem(REOItems.NUGGET_ENDERITE);
        nuggetItem(REOItems.NUGGET_LEAD);
        nuggetItem(REOItems.NUGGET_NICKEL);
        nuggetItem(REOItems.NUGGET_PERIDOT);
        nuggetItem(REOItems.NUGGET_PLATINUM);
        nuggetItem(REOItems.NUGGET_RUBY);
        nuggetItem(REOItems.NUGGET_SAPPHIRE);
        nuggetItem(REOItems.NUGGET_SILVER);
        nuggetItem(REOItems.NUGGET_STEEL);
        nuggetItem(REOItems.NUGGET_TIN);
        nuggetItem(REOItems.NUGGET_ZINC);

        // Bucket
        bucketItem(REOItems.BUCKET_MOLTEN_ALUMINIUM);
        bucketItem(REOItems.BUCKET_MOLTEN_AMETHYST);
        bucketItem(REOItems.BUCKET_MOLTEN_BRASS);
        bucketItem(REOItems.BUCKET_MOLTEN_BRONZE);
        bucketItem(REOItems.BUCKET_MOLTEN_COAL);
        bucketItem(REOItems.BUCKET_MOLTEN_COPPER);
        bucketItem(REOItems.BUCKET_MOLTEN_DIAMOND);
        bucketItem(REOItems.BUCKET_MOLTEN_ELECTRUM);
        bucketItem(REOItems.BUCKET_MOLTEN_EMERALD);
        bucketItem(REOItems.BUCKET_MOLTEN_ENDERITE);
        bucketItem(REOItems.BUCKET_MOLTEN_GOLD);
        bucketItem(REOItems.BUCKET_MOLTEN_IRON);
        bucketItem(REOItems.BUCKET_MOLTEN_LAPIS);
        bucketItem(REOItems.BUCKET_MOLTEN_LEAD);
        bucketItem(REOItems.BUCKET_MOLTEN_NICKEL);
        bucketItem(REOItems.BUCKET_MOLTEN_PERIDOT);
        bucketItem(REOItems.BUCKET_MOLTEN_PLATINUM);
        bucketItem(REOItems.BUCKET_MOLTEN_REDSTONE);
        bucketItem(REOItems.BUCKET_MOLTEN_RUBY);
        bucketItem(REOItems.BUCKET_MOLTEN_SAPPHIRE);
        bucketItem(REOItems.BUCKET_MOLTEN_SILVER);
        bucketItem(REOItems.BUCKET_MOLTEN_STEEL);
        bucketItem(REOItems.BUCKET_MOLTEN_TIN);
        bucketItem(REOItems.BUCKET_MOLTEN_URANIUM);
        bucketItem(REOItems.BUCKET_MOLTEN_ZINC);

        // Luminous Powder
        luminousDustItem(REOItems.LUMINOUS_BLACK);
        luminousDustItem(REOItems.LUMINOUS_BLUE);
        luminousDustItem(REOItems.LUMINOUS_BROWN);
        luminousDustItem(REOItems.LUMINOUS_CYAN);
        luminousDustItem(REOItems.LUMINOUS_GRAY);
        luminousDustItem(REOItems.LUMINOUS_GREEN);
        luminousDustItem(REOItems.LUMINOUS_LIGHTBLUE);
        luminousDustItem(REOItems.LUMINOUS_LIGHTGRAY);
        luminousDustItem(REOItems.LUMINOUS_LIME);
        luminousDustItem(REOItems.LUMINOUS_MAGENTA);
        luminousDustItem(REOItems.LUMINOUS_ORANGE);
        luminousDustItem(REOItems.LUMINOUS_PINK);
        luminousDustItem(REOItems.LUMINOUS_PURPLE);
        luminousDustItem(REOItems.LUMINOUS_RED);
        luminousDustItem(REOItems.LUMINOUS_WHITE);
        luminousDustItem(REOItems.LUMINOUS_YELLOW);

        // Dust
        dustItem(REOItems.DUST_ALUMINIUM);
        dustItem(REOItems.DUST_AMETHYST);
        dustItem(REOItems.DUST_BRASS);
        dustItem(REOItems.DUST_BRONZE);
        dustItem(REOItems.DUST_CHARCOAL);
        dustItem(REOItems.DUST_COAL);
        dustItem(REOItems.DUST_COPPER);
        dustItem(REOItems.DUST_DIAMOND);
        dustItem(REOItems.DUST_ELECTRUM);
        dustItem(REOItems.DUST_EMERALD);
        dustItem(REOItems.DUST_ENDERITE);
        dustItem(REOItems.DUST_GOLD);
        dustItem(REOItems.DUST_IRON);
        dustItem(REOItems.DUST_LEAD);
        dustItem(REOItems.DUST_NICKEL);
        dustItem(REOItems.DUST_OBSIDIAN);
        dustItem(REOItems.DUST_PERIDOT);
        dustItem(REOItems.DUST_PLATINUM);
        dustItem(REOItems.DUST_RUBY);
        dustItem(REOItems.DUST_SAPPHIRE);
        dustItem(REOItems.DUST_SILVER);
        dustItem(REOItems.DUST_STEEL);
        dustItem(REOItems.DUST_TIN);
        dustItem(REOItems.DUST_URANIUM);
        dustItem(REOItems.DUST_ZINC);

        // Dust
        dirtyDustItem(REOItems.DIRTY_ALUMINIUM);
        dirtyDustItem(REOItems.DIRTY_AMETHYST);
        dirtyDustItem(REOItems.DIRTY_BRASS);
        dirtyDustItem(REOItems.DIRTY_BRONZE);
        dirtyDustItem(REOItems.DIRTY_COPPER);
        dirtyDustItem(REOItems.DIRTY_DIAMOND);
        dirtyDustItem(REOItems.DIRTY_ELECTRUM);
        dirtyDustItem(REOItems.DIRTY_EMERALD);
        dirtyDustItem(REOItems.DIRTY_ENDERITE);
        dirtyDustItem(REOItems.DIRTY_GOLD);
        dirtyDustItem(REOItems.DIRTY_IRON);
        dirtyDustItem(REOItems.DIRTY_LEAD);
        dirtyDustItem(REOItems.DIRTY_NICKEL);
        dirtyDustItem(REOItems.DIRTY_OBSIDIAN);
        dirtyDustItem(REOItems.DIRTY_PERIDOT);
        dirtyDustItem(REOItems.DIRTY_PLATINUM);
        dirtyDustItem(REOItems.DIRTY_RUBY);
        dirtyDustItem(REOItems.DIRTY_SAPPHIRE);
        dirtyDustItem(REOItems.DIRTY_SILVER);
        dirtyDustItem(REOItems.DIRTY_STEEL);
        dirtyDustItem(REOItems.DIRTY_TIN);
        dirtyDustItem(REOItems.DIRTY_URANIUM);
        dirtyDustItem(REOItems.DIRTY_ZINC);

        // Tech //
        // Misc
        miscItem(REOItems.SAP);
        miscItem(REOItems.RESIN);
        miscItem(REOItems.RUBBER);

        // Gear
        gearItem(REOItems.GEAR_ALUMINIUM);
        gearItem(REOItems.GEAR_AMETHYST);
        gearItem(REOItems.GEAR_BRASS);
        gearItem(REOItems.GEAR_BRONZE);
        gearItem(REOItems.GEAR_COPPER);
        gearItem(REOItems.GEAR_DIAMOND);
        gearItem(REOItems.GEAR_ELECTRUM);
        gearItem(REOItems.GEAR_EMERALD);
        gearItem(REOItems.GEAR_ENDERITE);
        gearItem(REOItems.GEAR_GOLDEN);
        gearItem(REOItems.GEAR_IRON);
        gearItem(REOItems.GEAR_LEAD);
        gearItem(REOItems.GEAR_NICKEL);
        gearItem(REOItems.GEAR_PLATINUM);
        gearItem(REOItems.GEAR_PERIDOT);
        gearItem(REOItems.GEAR_RUBY);
        gearItem(REOItems.GEAR_SAPPHIRE);
        gearItem(REOItems.GEAR_SILVER);
        gearItem(REOItems.GEAR_STEEL);
        gearItem(REOItems.GEAR_STONE);
        gearItem(REOItems.GEAR_TIN);
        gearItem(REOItems.GEAR_WOODEN);
        gearItem(REOItems.GEAR_ZINC);

        // Plate
        plateItem(REOItems.PLATE_ALUMINIUM);
        plateItem(REOItems.PLATE_AMETHYST);
        plateItem(REOItems.PLATE_BRASS);
        plateItem(REOItems.PLATE_BRONZE);
        plateItem(REOItems.PLATE_COPPER);
        plateItem(REOItems.PLATE_DIAMOND);
        plateItem(REOItems.PLATE_ELECTRUM);
        plateItem(REOItems.PLATE_EMERALD);
        plateItem(REOItems.PLATE_ENDERITE);
        plateItem(REOItems.PLATE_GOLDEN);
        plateItem(REOItems.PLATE_IRON);
        plateItem(REOItems.PLATE_LEAD);
        plateItem(REOItems.PLATE_NICKEL);
        plateItem(REOItems.PLATE_PLATINUM);
        plateItem(REOItems.PLATE_PERIDOT);
        plateItem(REOItems.PLATE_RUBY);
        plateItem(REOItems.PLATE_SAPPHIRE);
        plateItem(REOItems.PLATE_SILVER);
        plateItem(REOItems.PLATE_STEEL);
        plateItem(REOItems.PLATE_TIN);
        plateItem(REOItems.PLATE_ZINC);

        // Foods //
        // Seeds
        seedItem(REOItems.SEED_BARLEY);
        seedItem(REOItems.SEED_CAULIFLOWER);
        seedItem(REOItems.SEED_COTTON);
        seedItem(REOItems.SEED_RICE);
        seedItem(REOItems.SEED_STRAWBERRY);
        seedItem(REOItems.SEED_TOMATO);

        // Crops
        foodItem(REOItems.PLANT_BARLEY);
        foodItem(REOItems.PLANT_COTTON);
        foodItem(REOItems.PLANT_RICE);

        // Flour
        foodItem(REOItems.FLOUR_BARLEY);
        foodItem(REOItems.FLOUR_WHEAT);

        // Food
        foodItem(REOItems.FOOD_BLACKBERRY);
        foodItem(REOItems.FOOD_BLUEBERRY);
        foodItem(REOItems.FOOD_CAULIFLOWER);
        foodItem(REOItems.FOOD_CHERRY);
        foodItem(REOItems.FOOD_CHESTNUT);
        foodItem(REOItems.FOOD_DATES);
        foodItem(REOItems.FOOD_LEMON);
        foodItem(REOItems.FOOD_LIME);
        foodItem(REOItems.FOOD_ONION);
        foodItem(REOItems.FOOD_PAPAYA);
        foodItem(REOItems.FOOD_PEACH);
        foodItem(REOItems.FOOD_PEAR);
        foodItem(REOItems.FOOD_PLUM);
        foodItem(REOItems.FOOD_RASPBERRY);
        foodItem(REOItems.FOOD_RICE);
        foodItem(REOItems.FOOD_STRAWBERRY);
        foodItem(REOItems.FOOD_TOMATO);
        foodItem(REOItems.FOOD_TOMATO_ROTTEN);
        foodItem(REOItems.FOOD_WALNUT);


        // Tools //
        // Aluminium
        aluminiumTool(REOItems.ALUMINIUM_AXE);
        aluminiumTool(REOItems.ALUMINIUM_HOE);
        aluminiumTool(REOItems.ALUMINIUM_PICKAXE);
        aluminiumTool(REOItems.ALUMINIUM_SHOVEL);
        aluminiumTool(REOItems.ALUMINIUM_SWORD);
        aluminiumTool(REOItems.ALUMINIUM_HAMMER);
        aluminiumTool(REOItems.ALUMINIUM_EXCAVATOR);
        aluminiumTool(REOItems.ALUMINIUM_HATCHET);
        aluminiumTool(REOItems.ALUMINIUM_SICKLE);
        aluminiumTool(REOItems.ALUMINIUM_PAXEL);
        aluminiumTool(REOItems.ALUMINIUM_SHEARS);

        // Amethyst
        amethystTool(REOItems.AMETHYST_AXE);
        amethystTool(REOItems.AMETHYST_HOE);
        amethystTool(REOItems.AMETHYST_PICKAXE);
        amethystTool(REOItems.AMETHYST_SHOVEL);
        amethystTool(REOItems.AMETHYST_SWORD);
        amethystTool(REOItems.AMETHYST_HAMMER);
        amethystTool(REOItems.AMETHYST_EXCAVATOR);
        amethystTool(REOItems.AMETHYST_HATCHET);
        amethystTool(REOItems.AMETHYST_SICKLE);
        amethystTool(REOItems.AMETHYST_PAXEL);
        amethystTool(REOItems.AMETHYST_SHEARS);

        // Bronze
        bronzeTool(REOItems.BRONZE_AXE);
        bronzeTool(REOItems.BRONZE_HOE);
        bronzeTool(REOItems.BRONZE_PICKAXE);
        bronzeTool(REOItems.BRONZE_SHOVEL);
        bronzeTool(REOItems.BRONZE_SWORD);
        bronzeTool(REOItems.BRONZE_HAMMER);
        bronzeTool(REOItems.BRONZE_EXCAVATOR);
        bronzeTool(REOItems.BRONZE_HATCHET);
        bronzeTool(REOItems.BRONZE_SICKLE);
        bronzeTool(REOItems.BRONZE_PAXEL);
        bronzeTool(REOItems.BRONZE_SHEARS);

        // Diamond
        diamondTool(REOItems.DIAMOND_HAMMER);
        diamondTool(REOItems.DIAMOND_EXCAVATOR);
        diamondTool(REOItems.DIAMOND_HATCHET);
        diamondTool(REOItems.DIAMOND_SICKLE);
        diamondTool(REOItems.DIAMOND_PAXEL);
        diamondTool(REOItems.DIAMOND_SHEARS);

        // Enderite
        enderiteTool(REOItems.ENDERITE_AXE);
        enderiteTool(REOItems.ENDERITE_HOE);
        enderiteTool(REOItems.ENDERITE_PICKAXE);
        enderiteTool(REOItems.ENDERITE_SHOVEL);
        enderiteTool(REOItems.ENDERITE_SWORD);
        enderiteTool(REOItems.ENDERITE_HAMMER);
        enderiteTool(REOItems.ENDERITE_EXCAVATOR);
        enderiteTool(REOItems.ENDERITE_HATCHET);
        enderiteTool(REOItems.ENDERITE_SICKLE);
        enderiteTool(REOItems.ENDERITE_PAXEL);
        enderiteTool(REOItems.ENDERITE_SHEARS);

        // Gold
        goldenTool(REOItems.GOLDEN_HAMMER);
        goldenTool(REOItems.GOLDEN_EXCAVATOR);
        goldenTool(REOItems.GOLDEN_HATCHET);
        goldenTool(REOItems.GOLDEN_SICKLE);
        goldenTool(REOItems.GOLDEN_PAXEL);
        goldenTool(REOItems.GOLDEN_SHEARS);

        // Netherite
        netheriteTool(REOItems.NETHERITE_HAMMER);
        netheriteTool(REOItems.NETHERITE_EXCAVATOR);
        netheriteTool(REOItems.NETHERITE_HATCHET);
        netheriteTool(REOItems.NETHERITE_SICKLE);
        netheriteTool(REOItems.NETHERITE_PAXEL);
        netheriteTool(REOItems.NETHERITE_SHEARS);

        // Iron
        ironTool(REOItems.IRON_HAMMER);
        ironTool(REOItems.IRON_EXCAVATOR);
        ironTool(REOItems.IRON_HATCHET);
        ironTool(REOItems.IRON_SICKLE);
        ironTool(REOItems.IRON_PAXEL);

        // Peridot
        peridotTool(REOItems.PERIDOT_AXE);
        peridotTool(REOItems.PERIDOT_HOE);
        peridotTool(REOItems.PERIDOT_PICKAXE);
        peridotTool(REOItems.PERIDOT_SHOVEL);
        peridotTool(REOItems.PERIDOT_SWORD);
        peridotTool(REOItems.PERIDOT_HAMMER);
        peridotTool(REOItems.PERIDOT_EXCAVATOR);
        peridotTool(REOItems.PERIDOT_HATCHET);
        peridotTool(REOItems.PERIDOT_SICKLE);
        peridotTool(REOItems.PERIDOT_PAXEL);
        peridotTool(REOItems.PERIDOT_SHEARS);

        // Platinum
        platinumTool(REOItems.PLATINUM_AXE);
        platinumTool(REOItems.PLATINUM_HOE);
        platinumTool(REOItems.PLATINUM_PICKAXE);
        platinumTool(REOItems.PLATINUM_SHOVEL);
        platinumTool(REOItems.PLATINUM_SWORD);
        platinumTool(REOItems.PLATINUM_HAMMER);
        platinumTool(REOItems.PLATINUM_EXCAVATOR);
        platinumTool(REOItems.PLATINUM_HATCHET);
        platinumTool(REOItems.PLATINUM_SICKLE);
        platinumTool(REOItems.PLATINUM_PAXEL);
        platinumTool(REOItems.PLATINUM_SHEARS);

        // Ruby
        rubyTool(REOItems.RUBY_AXE);
        rubyTool(REOItems.RUBY_HOE);
        rubyTool(REOItems.RUBY_PICKAXE);
        rubyTool(REOItems.RUBY_SHOVEL);
        rubyTool(REOItems.RUBY_SWORD);
        rubyTool(REOItems.RUBY_HAMMER);
        rubyTool(REOItems.RUBY_EXCAVATOR);
        rubyTool(REOItems.RUBY_HATCHET);
        rubyTool(REOItems.RUBY_SICKLE);
        rubyTool(REOItems.RUBY_PAXEL);
        rubyTool(REOItems.RUBY_SHEARS);

        // Sapphire
        sapphireTool(REOItems.SAPPHIRE_AXE);
        sapphireTool(REOItems.SAPPHIRE_HOE);
        sapphireTool(REOItems.SAPPHIRE_PICKAXE);
        sapphireTool(REOItems.SAPPHIRE_SHOVEL);
        sapphireTool(REOItems.SAPPHIRE_SWORD);
        sapphireTool(REOItems.SAPPHIRE_HAMMER);
        sapphireTool(REOItems.SAPPHIRE_EXCAVATOR);
        sapphireTool(REOItems.SAPPHIRE_HATCHET);
        sapphireTool(REOItems.SAPPHIRE_SICKLE);
        sapphireTool(REOItems.SAPPHIRE_PAXEL);
        sapphireTool(REOItems.SAPPHIRE_SHEARS);

        // Silver
        silverTool(REOItems.SILVER_AXE);
        silverTool(REOItems.SILVER_HOE);
        silverTool(REOItems.SILVER_PICKAXE);
        silverTool(REOItems.SILVER_SHOVEL);
        silverTool(REOItems.SILVER_SWORD);
        silverTool(REOItems.SILVER_HAMMER);
        silverTool(REOItems.SILVER_EXCAVATOR);
        silverTool(REOItems.SILVER_HATCHET);
        silverTool(REOItems.SILVER_SICKLE);
        silverTool(REOItems.SILVER_PAXEL);
        silverTool(REOItems.SILVER_SHEARS);

        // Steel
        steelTool(REOItems.STEEL_AXE);
        steelTool(REOItems.STEEL_HOE);
        steelTool(REOItems.STEEL_PICKAXE);
        steelTool(REOItems.STEEL_SHOVEL);
        steelTool(REOItems.STEEL_SWORD);
        steelTool(REOItems.STEEL_HAMMER);
        steelTool(REOItems.STEEL_EXCAVATOR);
        steelTool(REOItems.STEEL_HATCHET);
        steelTool(REOItems.STEEL_SICKLE);
        steelTool(REOItems.STEEL_PAXEL);
        steelTool(REOItems.STEEL_SHEARS);

        // Stone
        stoneTool(REOItems.STONE_HAMMER);
        stoneTool(REOItems.STONE_EXCAVATOR);
        stoneTool(REOItems.STONE_HATCHET);
        stoneTool(REOItems.STONE_SICKLE);
        stoneTool(REOItems.STONE_PAXEL);
        stoneTool(REOItems.STONE_SHEARS);

        // Wood
        woodenTool(REOItems.WOODEN_HAMMER);
        woodenTool(REOItems.WOODEN_EXCAVATOR);
        woodenTool(REOItems.WOODEN_HATCHET);
        woodenTool(REOItems.WOODEN_SICKLE);
        woodenTool(REOItems.WOODEN_PAXEL);
        woodenTool(REOItems.WOODEN_SHEARS);

        // Armour //
        // Aluminium
        trimmedArmourItem(REOItems.ALUMINIUM_HELMET);
        trimmedArmourItem(REOItems.ALUMINIUM_CHESTPLATE);
        trimmedArmourItem(REOItems.ALUMINIUM_LEGGINGS);
        trimmedArmourItem(REOItems.ALUMINIUM_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_ALUMINIUM);

        // Amethyst
        trimmedArmourItem(REOItems.AMETHYST_HELMET);
        trimmedArmourItem(REOItems.AMETHYST_CHESTPLATE);
        trimmedArmourItem(REOItems.AMETHYST_LEGGINGS);
        trimmedArmourItem(REOItems.AMETHYST_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_AMETHYST);

        // Bronze
        trimmedArmourItem(REOItems.BRONZE_HELMET);
        trimmedArmourItem(REOItems.BRONZE_CHESTPLATE);
        trimmedArmourItem(REOItems.BRONZE_LEGGINGS);
        trimmedArmourItem(REOItems.BRONZE_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_BRONZE);

        // Enderite
        trimmedArmourItem(REOItems.ENDERITE_HELMET);
        trimmedArmourItem(REOItems.ENDERITE_CHESTPLATE);
        trimmedArmourItem(REOItems.ENDERITE_LEGGINGS);
        trimmedArmourItem(REOItems.ENDERITE_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_ENDERITE);

        // Platinum
        trimmedArmourItem(REOItems.PLATINUM_HELMET);
        trimmedArmourItem(REOItems.PLATINUM_CHESTPLATE);
        trimmedArmourItem(REOItems.PLATINUM_LEGGINGS);
        trimmedArmourItem(REOItems.PLATINUM_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_PLATINUM);

        // Peridot
        trimmedArmourItem(REOItems.PERIDOT_HELMET);
        trimmedArmourItem(REOItems.PERIDOT_CHESTPLATE);
        trimmedArmourItem(REOItems.PERIDOT_LEGGINGS);
        trimmedArmourItem(REOItems.PERIDOT_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_PERIDOT);

        // Ruby
        trimmedArmourItem(REOItems.RUBY_HELMET);
        trimmedArmourItem(REOItems.RUBY_CHESTPLATE);
        trimmedArmourItem(REOItems.RUBY_LEGGINGS);
        trimmedArmourItem(REOItems.RUBY_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_RUBY);

        // Sapphire
        trimmedArmourItem(REOItems.SAPPHIRE_HELMET);
        trimmedArmourItem(REOItems.SAPPHIRE_CHESTPLATE);
        trimmedArmourItem(REOItems.SAPPHIRE_LEGGINGS);
        trimmedArmourItem(REOItems.SAPPHIRE_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_SAPPHIRE);

        // Silver
        trimmedArmourItem(REOItems.SILVER_HELMET);
        trimmedArmourItem(REOItems.SILVER_CHESTPLATE);
        trimmedArmourItem(REOItems.SILVER_LEGGINGS);
        trimmedArmourItem(REOItems.SILVER_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_SILVER);

        // Steel
        trimmedArmourItem(REOItems.STEEL_HELMET);
        trimmedArmourItem(REOItems.STEEL_CHESTPLATE);
        trimmedArmourItem(REOItems.STEEL_LEGGINGS);
        trimmedArmourItem(REOItems.STEEL_BOOTS);

        horseArmorItem(REOItems.HORSE_ARMOR_STEEL);


        // Blocks //
        // Cluster
        clusterBlockItem(REOBlocks.CLUSTER_PERIDOT, "cluster/peridot");
        clusterBlockItem(REOBlocks.LARGE_PERIDOT_BUD, "bud/large_peridot");
        clusterBlockItem(REOBlocks.MEDIUM_PERIDOT_BUD, "bud/medium_peridot");
        clusterBlockItem(REOBlocks.SMALL_PERIDOT_BUD, "bud/small_peridot");

        clusterBlockItem(REOBlocks.CLUSTER_RUBY, "cluster/ruby");
        clusterBlockItem(REOBlocks.LARGE_RUBY_BUD, "bud/large_ruby");
        clusterBlockItem(REOBlocks.MEDIUM_RUBY_BUD, "bud/medium_ruby");
        clusterBlockItem(REOBlocks.SMALL_RUBY_BUD, "bud/small_ruby");

        clusterBlockItem(REOBlocks.CLUSTER_SAPPHIRE, "cluster/sapphire");
        clusterBlockItem(REOBlocks.LARGE_SAPPHIRE_BUD, "bud/large_sapphire");
        clusterBlockItem(REOBlocks.MEDIUM_SAPPHIRE_BUD, "bud/medium_sapphire");
        clusterBlockItem(REOBlocks.SMALL_SAPPHIRE_BUD, "bud/small_sapphire");

        // Marble
        simpleBlockItem(REOBlocks.MARBLE_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_SLAB);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_SLAB);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_MOSSY_SLAB);
        wallItem(REOBlocks.MARBLE_WALL, "marble/marble");
        wallItem(REOBlocks.MARBLE_COBBLE_WALL, "marble/marble_cobble");
        wallItem(REOBlocks.MARBLE_COBBLE_MOSSY_WALL, "marble/marble_cobble_mossy");

        // Limestone
        simpleBlockItem(REOBlocks.LIMESTONE_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_SLAB);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_SLAB);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB);
        wallItem(REOBlocks.LIMESTONE_WALL, "limestone/limestone");
        wallItem(REOBlocks.LIMESTONE_COBBLE_WALL, "limestone/limestone_cobble");
        wallItem(REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL, "limestone/limestone_cobble_mossy");

        // Calcite
        simpleBlockItem(REOBlocks.CALCITE_STAIRS);
        simpleBlockItem(REOBlocks.CALCITE_SLAB);
        vanillaWallItem(REOBlocks.CALCITE_WALL, "calcite");


        // Netherrrack
        simpleBlockItem(REOBlocks.NETHERRACK_STAIRS);
        simpleBlockItem(REOBlocks.NETHERRACK_SLAB);
        vanillaWallItem(REOBlocks.NETHERRACK_WALL, "netherrack");

        // Lamp
        lampBlockItem(REOBlocks.LAMP_BLACK);
        lampBlockItem(REOBlocks.LAMP_RED);
        lampBlockItem(REOBlocks.LAMP_GREEN);
        lampBlockItem(REOBlocks.LAMP_BROWN);
        lampBlockItem(REOBlocks.LAMP_PURPLE);
        lampBlockItem(REOBlocks.LAMP_CYAN);
        lampBlockItem(REOBlocks.LAMP_LIGHTGRAY);
        lampBlockItem(REOBlocks.LAMP_GRAY);
        lampBlockItem(REOBlocks.LAMP_PINK);
        lampBlockItem(REOBlocks.LAMP_LIME);
        lampBlockItem(REOBlocks.LAMP_YELLOW);
        lampBlockItem(REOBlocks.LAMP_BLUE);
        lampBlockItem(REOBlocks.LAMP_LIGHTBLUE);
        lampBlockItem(REOBlocks.LAMP_MAGENTA);
        lampBlockItem(REOBlocks.LAMP_ORANGE);
        lampBlockItem(REOBlocks.LAMP_WHITE);

        // Wood
        // Vanilla
        simpleBlockItem(REOBlocks.STAIRS_OAK_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_OAK_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_OAK_RESISTANT, "oak_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_OAK_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_SPRUCE_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_SPRUCE_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_SPRUCE_RESISTANT, "spruce_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_SPRUCE_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_BIRCH_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_BIRCH_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_BIRCH_RESISTANT, "birch_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_BIRCH_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_JUNGLE_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_JUNGLE_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_JUNGLE_RESISTANT, "jungle_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_JUNGLE_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_ACACIA_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_ACACIA_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_ACACIA_RESISTANT, "acacia_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_ACACIA_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_DARK_OAK_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_DARK_OAK_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_DARK_OAK_RESISTANT, "dark_oak_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_MANGROVE_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_MANGROVE_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_MANGROVE_RESISTANT, "mangrove_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_MANGROVE_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_CHERRY_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_CHERRY_RESISTANT);
        vanillaWoodFenceItem(REOBlocks.FENCE_CHERRY_RESISTANT, "cherry_planks");
        simpleBlockItem(REOBlocks.FENCE_GATE_CHERRY_RESISTANT);


        // Modded
        simpleBlockItem(REOBlocks.STAIRS_BALSA);
        simpleBlockItem(REOBlocks.SLAB_BALSA);
        woodFenceItem(REOBlocks.FENCE_BALSA, "balsa");
        simpleBlockItem(REOBlocks.FENCE_GATE_BALSA);

        buttonItem(REOBlocks.BUTTON_BALSA, "balsa");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_BALSA);

        saplingItem(REOBlocks.SAPLING_BALSA, "balsa");
        signItem(REOItems.SIGN_BALSA);
        signItem(REOItems.SIGN_HANGING_BALSA);

        boatItem(REOItems.BOAT_BALSA);
        boatItem(REOItems.BOAT_BALSA_CHEST);

        doorItem(REOBlocks.DOOR_BALSA);
        trapdoorItem(REOBlocks.TRAPDOOR_BALSA);

        simpleBlockItem(REOBlocks.STAIRS_BALSA_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_BALSA_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_BALSA_RESISTANT, "balsa");
        simpleBlockItem(REOBlocks.FENCE_GATE_BALSA_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_BAOBAB);
        simpleBlockItem(REOBlocks.SLAB_BAOBAB);
        woodFenceItem(REOBlocks.FENCE_BAOBAB, "baobab");
        simpleBlockItem(REOBlocks.FENCE_GATE_BAOBAB);

        buttonItem(REOBlocks.BUTTON_BAOBAB, "baobab");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_BAOBAB);

        saplingItem(REOBlocks.SAPLING_BAOBAB, "baobab");
        signItem(REOItems.SIGN_BAOBAB);
        signItem(REOItems.SIGN_HANGING_BAOBAB);

        boatItem(REOItems.BOAT_BAOBAB);
        boatItem(REOItems.BOAT_BAOBAB_CHEST);

        doorItem(REOBlocks.DOOR_BAOBAB);
        trapdoorItem(REOBlocks.TRAPDOOR_BAOBAB);

        simpleBlockItem(REOBlocks.STAIRS_BAOBAB_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_BAOBAB_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_BAOBAB_RESISTANT, "baobab");
        simpleBlockItem(REOBlocks.FENCE_GATE_BAOBAB_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_HILL_CHERRY);
        simpleBlockItem(REOBlocks.SLAB_HILL_CHERRY);
        woodFenceItem(REOBlocks.FENCE_HILL_CHERRY, "cherry");
        simpleBlockItem(REOBlocks.FENCE_GATE_HILL_CHERRY);

        buttonItem(REOBlocks.BUTTON_HILL_CHERRY, "cherry");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_HILL_CHERRY);

        saplingItem(REOBlocks.SAPLING_HILL_CHERRY, "cherry");
        signItem(REOItems.SIGN_HILL_CHERRY);
        signItem(REOItems.SIGN_HANGING_HILL_CHERRY);

        boatItem(REOItems.BOAT_HILL_CHERRY);
        boatItem(REOItems.BOAT_HILL_CHERRY_CHEST);

        doorItem(REOBlocks.DOOR_HILL_CHERRY);
        trapdoorItem(REOBlocks.TRAPDOOR_HILL_CHERRY);

        simpleBlockItem(REOBlocks.STAIRS_HILL_CHERRY_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_HILL_CHERRY_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_HILL_CHERRY_RESISTANT, "cherry");
        simpleBlockItem(REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_CHESTNUT);
        simpleBlockItem(REOBlocks.SLAB_CHESTNUT);
        woodFenceItem(REOBlocks.FENCE_CHESTNUT, "chestnut");
        simpleBlockItem(REOBlocks.FENCE_GATE_CHESTNUT);

        buttonItem(REOBlocks.BUTTON_CHESTNUT, "chestnut");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_CHESTNUT);

        saplingItem(REOBlocks.SAPLING_CHESTNUT, "chestnut");
        signItem(REOItems.SIGN_CHESTNUT);
        signItem(REOItems.SIGN_HANGING_CHESTNUT);

        boatItem(REOItems.BOAT_CHESTNUT);
        boatItem(REOItems.BOAT_CHESTNUT_CHEST);

        doorItem(REOBlocks.DOOR_CHESTNUT);
        trapdoorItem(REOBlocks.TRAPDOOR_CHESTNUT);

        simpleBlockItem(REOBlocks.STAIRS_CHESTNUT_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_CHESTNUT_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_CHESTNUT_RESISTANT, "chestnut");
        simpleBlockItem(REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT);

        simpleBlockItem(REOBlocks.STAIRS_CITRUS);
        simpleBlockItem(REOBlocks.SLAB_CITRUS);
        woodFenceItem(REOBlocks.FENCE_CITRUS, "citrus");
        simpleBlockItem(REOBlocks.FENCE_GATE_CITRUS);

        buttonItem(REOBlocks.BUTTON_CITRUS, "citrus");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_CITRUS);

        saplingItem(REOBlocks.SAPLING_CITRUS, "citrus");
        signItem(REOItems.SIGN_CITRUS);
        signItem(REOItems.SIGN_HANGING_CITRUS);

        boatItem(REOItems.BOAT_CITRUS);
        boatItem(REOItems.BOAT_CITRUS_CHEST);

        doorItem(REOBlocks.DOOR_CITRUS);
        trapdoorItem(REOBlocks.TRAPDOOR_CITRUS);

        simpleBlockItem(REOBlocks.STAIRS_CITRUS_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_CITRUS_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_CITRUS_RESISTANT, "citrus");
        simpleBlockItem(REOBlocks.FENCE_GATE_CITRUS_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_EBONY);
        simpleBlockItem(REOBlocks.SLAB_EBONY);
        woodFenceItem(REOBlocks.FENCE_EBONY, "ebony");
        simpleBlockItem(REOBlocks.FENCE_GATE_EBONY);

        buttonItem(REOBlocks.BUTTON_EBONY, "ebony");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_EBONY);

        saplingItem(REOBlocks.SAPLING_EBONY, "ebony");
        signItem(REOItems.SIGN_EBONY);
        signItem(REOItems.SIGN_HANGING_EBONY);

        boatItem(REOItems.BOAT_EBONY);
        boatItem(REOItems.BOAT_EBONY_CHEST);

        doorItem(REOBlocks.DOOR_EBONY);
        trapdoorItem(REOBlocks.TRAPDOOR_EBONY);

        simpleBlockItem(REOBlocks.STAIRS_EBONY_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_EBONY_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_EBONY_RESISTANT, "ebony");
        simpleBlockItem(REOBlocks.FENCE_GATE_EBONY_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_LARCH);
        simpleBlockItem(REOBlocks.SLAB_LARCH);
        woodFenceItem(REOBlocks.FENCE_LARCH, "larch");
        simpleBlockItem(REOBlocks.FENCE_GATE_LARCH);

        buttonItem(REOBlocks.BUTTON_LARCH, "larch");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_LARCH);

        saplingItem(REOBlocks.SAPLING_LARCH, "larch");
        signItem(REOItems.SIGN_LARCH);
        signItem(REOItems.SIGN_HANGING_LARCH);

        boatItem(REOItems.BOAT_LARCH);
        boatItem(REOItems.BOAT_LARCH_CHEST);

        doorItem(REOBlocks.DOOR_LARCH);
        trapdoorItem(REOBlocks.TRAPDOOR_LARCH);

        simpleBlockItem(REOBlocks.STAIRS_LARCH_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_LARCH_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_LARCH_RESISTANT, "larch");
        simpleBlockItem(REOBlocks.FENCE_GATE_LARCH_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_LIME);
        simpleBlockItem(REOBlocks.SLAB_LIME);
        woodFenceItem(REOBlocks.FENCE_LIME, "lime");
        simpleBlockItem(REOBlocks.FENCE_GATE_LIME);

        buttonItem(REOBlocks.BUTTON_LIME, "lime");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_LIME);

        saplingItem(REOBlocks.SAPLING_LIME, "lime");
        signItem(REOItems.SIGN_LIME);
        signItem(REOItems.SIGN_HANGING_LIME);

        boatItem(REOItems.BOAT_LIME);
        boatItem(REOItems.BOAT_LIME_CHEST);

        doorItem(REOBlocks.DOOR_LIME);
        trapdoorItem(REOBlocks.TRAPDOOR_LIME);

        simpleBlockItem(REOBlocks.STAIRS_LIME_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_LIME_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_LIME_RESISTANT, "lime");
        simpleBlockItem(REOBlocks.FENCE_GATE_LIME_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_MAHOGANY);
        simpleBlockItem(REOBlocks.SLAB_MAHOGANY);
        woodFenceItem(REOBlocks.FENCE_MAHOGANY, "mahogany");
        simpleBlockItem(REOBlocks.FENCE_GATE_MAHOGANY);

        buttonItem(REOBlocks.BUTTON_MAHOGANY, "mahogany");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_MAHOGANY);

        saplingItem(REOBlocks.SAPLING_MAHOGANY, "mahogany");
        signItem(REOItems.SIGN_MAHOGANY);
        signItem(REOItems.SIGN_HANGING_MAHOGANY);

        boatItem(REOItems.BOAT_MAHOGANY);
        boatItem(REOItems.BOAT_MAHOGANY_CHEST);

        doorItem(REOBlocks.DOOR_MAHOGANY);
        trapdoorItem(REOBlocks.TRAPDOOR_MAHOGANY);

        simpleBlockItem(REOBlocks.STAIRS_MAHOGANY_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_MAHOGANY_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_MAHOGANY_RESISTANT, "mahogany");
        simpleBlockItem(REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_MAPLE);
        simpleBlockItem(REOBlocks.SLAB_MAPLE);
        woodFenceItem(REOBlocks.FENCE_MAPLE, "maple");
        simpleBlockItem(REOBlocks.FENCE_GATE_MAPLE);

        buttonItem(REOBlocks.BUTTON_MAPLE, "maple");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_MAPLE);

        saplingItem(REOBlocks.SAPLING_MAPLE, "maple");
        signItem(REOItems.SIGN_MAPLE);
        signItem(REOItems.SIGN_HANGING_MAPLE);

        boatItem(REOItems.BOAT_MAPLE);
        boatItem(REOItems.BOAT_MAPLE_CHEST);

        doorItem(REOBlocks.DOOR_MAPLE);
        trapdoorItem(REOBlocks.TRAPDOOR_MAPLE);

        simpleBlockItem(REOBlocks.STAIRS_MAPLE_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_MAPLE_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_MAPLE_RESISTANT, "maple");
        simpleBlockItem(REOBlocks.FENCE_GATE_MAPLE_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_PALM);
        simpleBlockItem(REOBlocks.SLAB_PALM);
        woodFenceItem(REOBlocks.FENCE_PALM, "palm");
        simpleBlockItem(REOBlocks.FENCE_GATE_PALM);

        buttonItem(REOBlocks.BUTTON_PALM, "palm");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_PALM);

        saplingItem(REOBlocks.SAPLING_PALM, "palm");
        signItem(REOItems.SIGN_PALM);
        signItem(REOItems.SIGN_HANGING_PALM);

        boatItem(REOItems.BOAT_PALM);
        boatItem(REOItems.BOAT_PALM_CHEST);

        doorItem(REOBlocks.DOOR_PALM);
        trapdoorItem(REOBlocks.TRAPDOOR_PALM);

        simpleBlockItem(REOBlocks.STAIRS_PALM_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_PALM_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_PALM_RESISTANT, "palm");
        simpleBlockItem(REOBlocks.FENCE_GATE_PALM_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_PAPAYA);
        simpleBlockItem(REOBlocks.SLAB_PAPAYA);
        woodFenceItem(REOBlocks.FENCE_PAPAYA, "papaya");
        simpleBlockItem(REOBlocks.FENCE_GATE_PAPAYA);

        buttonItem(REOBlocks.BUTTON_PAPAYA, "papaya");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_PAPAYA);

        saplingItem(REOBlocks.SAPLING_PAPAYA, "papaya");
        signItem(REOItems.SIGN_PAPAYA);
        signItem(REOItems.SIGN_HANGING_PAPAYA);

        boatItem(REOItems.BOAT_PAPAYA);
        boatItem(REOItems.BOAT_PAPAYA_CHEST);

        doorItem(REOBlocks.DOOR_PAPAYA);
        trapdoorItem(REOBlocks.TRAPDOOR_PAPAYA);

        simpleBlockItem(REOBlocks.STAIRS_PAPAYA_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_PAPAYA_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_PAPAYA_RESISTANT, "papaya");
        simpleBlockItem(REOBlocks.FENCE_GATE_PAPAYA_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_PINE);
        simpleBlockItem(REOBlocks.SLAB_PINE);
        woodFenceItem(REOBlocks.FENCE_PINE, "pine");
        simpleBlockItem(REOBlocks.FENCE_GATE_PINE);

        buttonItem(REOBlocks.BUTTON_PINE, "pine");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_PINE);

        saplingItem(REOBlocks.SAPLING_PINE, "pine");
        signItem(REOItems.SIGN_PINE);
        signItem(REOItems.SIGN_HANGING_PINE);

        boatItem(REOItems.BOAT_PINE);
        boatItem(REOItems.BOAT_PINE_CHEST);

        doorItem(REOBlocks.DOOR_PINE);
        trapdoorItem(REOBlocks.TRAPDOOR_PINE);

        simpleBlockItem(REOBlocks.STAIRS_PINE_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_PINE_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_PINE_RESISTANT, "pine");
        simpleBlockItem(REOBlocks.FENCE_GATE_PINE_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_PLUM);
        simpleBlockItem(REOBlocks.SLAB_PLUM);
        woodFenceItem(REOBlocks.FENCE_PLUM, "plum");
        simpleBlockItem(REOBlocks.FENCE_GATE_PLUM);

        buttonItem(REOBlocks.BUTTON_PLUM, "plum");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_PLUM);

        saplingItem(REOBlocks.SAPLING_PLUM, "plum");
        signItem(REOItems.SIGN_PLUM);
        signItem(REOItems.SIGN_HANGING_PLUM);

        boatItem(REOItems.BOAT_PLUM);
        boatItem(REOItems.BOAT_PLUM_CHEST);

        doorItem(REOBlocks.DOOR_PLUM);
        trapdoorItem(REOBlocks.TRAPDOOR_PLUM);

        simpleBlockItem(REOBlocks.STAIRS_PLUM_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_PLUM_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_PLUM_RESISTANT, "plum");
        simpleBlockItem(REOBlocks.FENCE_GATE_PLUM_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_POPLAR);
        simpleBlockItem(REOBlocks.SLAB_POPLAR);
        woodFenceItem(REOBlocks.FENCE_POPLAR, "poplar");
        simpleBlockItem(REOBlocks.FENCE_GATE_POPLAR);

        buttonItem(REOBlocks.BUTTON_POPLAR, "poplar");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_POPLAR);

        saplingItem(REOBlocks.SAPLING_POPLAR, "poplar");
        signItem(REOItems.SIGN_POPLAR);
        signItem(REOItems.SIGN_HANGING_POPLAR);

        boatItem(REOItems.BOAT_POPLAR);
        boatItem(REOItems.BOAT_POPLAR_CHEST);

        doorItem(REOBlocks.DOOR_POPLAR);
        trapdoorItem(REOBlocks.TRAPDOOR_POPLAR);

        simpleBlockItem(REOBlocks.STAIRS_POPLAR_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_POPLAR_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_POPLAR_RESISTANT, "poplar");
        simpleBlockItem(REOBlocks.FENCE_GATE_POPLAR_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_REDWOOD);
        simpleBlockItem(REOBlocks.SLAB_REDWOOD);
        woodFenceItem(REOBlocks.FENCE_REDWOOD, "redwood");
        simpleBlockItem(REOBlocks.FENCE_GATE_REDWOOD);

        buttonItem(REOBlocks.BUTTON_REDWOOD, "redwood");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_REDWOOD);

        saplingItem(REOBlocks.SAPLING_REDWOOD, "redwood");
        signItem(REOItems.SIGN_REDWOOD);
        signItem(REOItems.SIGN_HANGING_REDWOOD);

        boatItem(REOItems.BOAT_REDWOOD);
        boatItem(REOItems.BOAT_REDWOOD_CHEST);

        doorItem(REOBlocks.DOOR_REDWOOD);
        trapdoorItem(REOBlocks.TRAPDOOR_REDWOOD);

        simpleBlockItem(REOBlocks.STAIRS_REDWOOD_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_REDWOOD_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_REDWOOD_RESISTANT, "redwood");
        simpleBlockItem(REOBlocks.FENCE_GATE_REDWOOD_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_RUBBER);
        simpleBlockItem(REOBlocks.SLAB_RUBBER);
        woodFenceItem(REOBlocks.FENCE_RUBBER, "rubber");
        simpleBlockItem(REOBlocks.FENCE_GATE_RUBBER);

        buttonItem(REOBlocks.BUTTON_RUBBER, "rubber");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_RUBBER);

        saplingItem(REOBlocks.SAPLING_RUBBER, "rubber");
        signItem(REOItems.SIGN_RUBBER);
        signItem(REOItems.SIGN_HANGING_RUBBER);

        boatItem(REOItems.BOAT_RUBBER);
        boatItem(REOItems.BOAT_RUBBER_CHEST);

        doorItem(REOBlocks.DOOR_RUBBER);
        trapdoorItem(REOBlocks.TRAPDOOR_RUBBER);

        simpleBlockItem(REOBlocks.STAIRS_RUBBER_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_RUBBER_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_RUBBER_RESISTANT, "rubber");
        simpleBlockItem(REOBlocks.FENCE_GATE_RUBBER_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_TEAK);
        simpleBlockItem(REOBlocks.SLAB_TEAK);
        woodFenceItem(REOBlocks.FENCE_TEAK, "teak");
        simpleBlockItem(REOBlocks.FENCE_GATE_TEAK);

        buttonItem(REOBlocks.BUTTON_TEAK, "teak");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_TEAK);

        saplingItem(REOBlocks.SAPLING_TEAK, "teak");
        signItem(REOItems.SIGN_TEAK);
        signItem(REOItems.SIGN_HANGING_TEAK);

        boatItem(REOItems.BOAT_TEAK);
        boatItem(REOItems.BOAT_TEAK_CHEST);

        doorItem(REOBlocks.DOOR_TEAK);
        trapdoorItem(REOBlocks.TRAPDOOR_TEAK);

        simpleBlockItem(REOBlocks.STAIRS_TEAK_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_TEAK_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_TEAK_RESISTANT, "teak");
        simpleBlockItem(REOBlocks.FENCE_GATE_TEAK_RESISTANT);

        //
        simpleBlockItem(REOBlocks.STAIRS_WALNUT);
        simpleBlockItem(REOBlocks.SLAB_WALNUT);
        woodFenceItem(REOBlocks.FENCE_WALNUT, "walnut");
        simpleBlockItem(REOBlocks.FENCE_GATE_WALNUT);

        buttonItem(REOBlocks.BUTTON_WALNUT, "walnut");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_WALNUT);

        saplingItem(REOBlocks.SAPLING_WALNUT, "walnut");
        signItem(REOItems.SIGN_WALNUT);
        signItem(REOItems.SIGN_HANGING_WALNUT);

        boatItem(REOItems.BOAT_WALNUT);
        boatItem(REOItems.BOAT_WALNUT_CHEST);

        doorItem(REOBlocks.DOOR_WALNUT);
        trapdoorItem(REOBlocks.TRAPDOOR_WALNUT);

        simpleBlockItem(REOBlocks.STAIRS_WALNUT_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_WALNUT_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_WALNUT_RESISTANT, "walnut");
        simpleBlockItem(REOBlocks.FENCE_GATE_WALNUT_RESISTANT);


        simpleBlockItem(REOBlocks.STAIRS_WILLOW);
        simpleBlockItem(REOBlocks.SLAB_WILLOW);
        woodFenceItem(REOBlocks.FENCE_WILLOW, "willow");
        simpleBlockItem(REOBlocks.FENCE_GATE_WILLOW);

        buttonItem(REOBlocks.BUTTON_WILLOW, "willow");
        simpleBlockItem(REOBlocks.PRESSURE_PLATE_WILLOW);

        saplingItem(REOBlocks.SAPLING_WILLOW, "willow");
        signItem(REOItems.SIGN_WILLOW);
        signItem(REOItems.SIGN_HANGING_WILLOW);

        boatItem(REOItems.BOAT_WILLOW);
        boatItem(REOItems.BOAT_WILLOW_CHEST);

        doorItem(REOBlocks.DOOR_WILLOW);
        trapdoorItem(REOBlocks.TRAPDOOR_WILLOW);

        simpleBlockItem(REOBlocks.STAIRS_WILLOW_RESISTANT);
        simpleBlockItem(REOBlocks.SLAB_WILLOW_RESISTANT);
        woodFenceItem(REOBlocks.FENCE_WILLOW_RESISTANT, "willow");
        simpleBlockItem(REOBlocks.FENCE_GATE_WILLOW_RESISTANT);

        // Food
        wildBlockItem(REOBlocks.WILD_BARLEY, "wild_barley");
        wildBlockItem(REOBlocks.WILD_COTTON, "wild_cotton");
        wildBlockItem(REOBlocks.WILD_RICE, "wild_rice");
        wildBlockItem(REOBlocks.WILD_TOMATO, "wild_tomato");

    }

    private ItemModelBuilder horseArmorItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID,"item/armor/horse/" + item.getId().getPath()));
    }

    private ItemModelBuilder signItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID,"item/sign/" + item.getId().getPath()));
    }

    private ItemModelBuilder ingotItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/ingot/" + item.getId().getPath()));
    }

    private ItemModelBuilder gemItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/gem/" + item.getId().getPath()));
    }

    private ItemModelBuilder shardItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/shard/" + item.getId().getPath()));
    }

    private ItemModelBuilder nuggetItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/nugget/" + item.getId().getPath()));
    }

    private ItemModelBuilder rawItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/raw/" + item.getId().getPath()));
    }

    private ItemModelBuilder dustItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/dust/" + item.getId().getPath()));
    }

    private ItemModelBuilder dirtyDustItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/dust/dirty/" + item.getId().getPath()));
    }

    private ItemModelBuilder miscItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/misc/" + item.getId().getPath()));
    }

    private ItemModelBuilder gearItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/gear/" + item.getId().getPath()));
    }

    private ItemModelBuilder plateItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/plate/" + item.getId().getPath()));
    }

    private ItemModelBuilder luminousDustItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/dust/luminous/" + item.getId().getPath()));
    }

    private ItemModelBuilder boatItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/boat/" + item.getId().getPath()));
    }


    private ItemModelBuilder saplingItem(RegistryObject<Block> item, String sapling) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID,"block/tree/sapling/" + sapling));
    }
    private ItemModelBuilder bucketItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID,"item/bucket/" + item.getId().getPath()));
    }

    private ItemModelBuilder aluminiumTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/aluminium/" + item.getId().getPath()));
    }

    private ItemModelBuilder amethystTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/amethyst/" + item.getId().getPath()));
    }

    private ItemModelBuilder bronzeTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/bronze/" + item.getId().getPath()));
    }

    private ItemModelBuilder diamondTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/diamond/" + item.getId().getPath()));
    }

    private ItemModelBuilder enderiteTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/enderite/" + item.getId().getPath()));
    }

    private ItemModelBuilder goldenTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/golden/" + item.getId().getPath()));
    }

    private ItemModelBuilder netheriteTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/netherite/" + item.getId().getPath()));
    }

    private ItemModelBuilder ironTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/iron/" + item.getId().getPath()));
    }

    private ItemModelBuilder peridotTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/peridot/" + item.getId().getPath()));
    }

    private ItemModelBuilder platinumTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/platinum/" + item.getId().getPath()));
    }

    private ItemModelBuilder rubyTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/ruby/" + item.getId().getPath()));
    }

    private ItemModelBuilder sapphireTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/sapphire/" + item.getId().getPath()));
    }

    private ItemModelBuilder silverTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/silver/" + item.getId().getPath()));
    }

    private ItemModelBuilder steelTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/steel/" + item.getId().getPath()));
    }

    private ItemModelBuilder stoneTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/stone/" + item.getId().getPath()));
    }

    private ItemModelBuilder woodenTool(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/tool/wooden/" + item.getId().getPath()));
    }

    private ItemModelBuilder seedItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/food/seeds/" + item.getId().getPath()));
    }

    private ItemModelBuilder foodItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/food/" + item.getId().getPath()));
    }

    private ItemModelBuilder doorItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/door/" + item.getId().getPath()));
    }

    private ItemModelBuilder wildBlockItem(RegistryObject<Block> item, String texture) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + texture));
    }

    public void simpleBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(RealEarthOres.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void woodFenceItem(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/" + baseBlock));
    }

    public void vanillaWoodFenceItem(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation("block/" + baseBlock));
    }

    public void buttonItem(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/" + baseBlock));
    }

    public void wallItem(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/" + baseBlock));
    }

    public void vanillaWallItem(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation("block/" + baseBlock));
    }

    public void lampBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(RealEarthOres.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private ItemModelBuilder clusterBlockItem(RegistryObject<Block> block, String name) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/" + name));
    }

    // Credits to El_Redstoniano for making this
    private void trimmedArmourItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = RealEarthOres.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/armor/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/armor/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}