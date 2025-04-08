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
        ingotItem(REOItems.ALUMINUM_INGOT);
        ingotItem(REOItems.BRASS_INGOT);
        ingotItem(REOItems.BRONZE_INGOT);
        ingotItem(REOItems.ELECTRUM_INGOT);
        ingotItem(REOItems.ENDERITE_INGOT);
        ingotItem(REOItems.LEAD_INGOT);
        ingotItem(REOItems.NICKEL_INGOT);
        ingotItem(REOItems.OBSIDIAN_INGOT);
        ingotItem(REOItems.PLATINUM_INGOT);
        ingotItem(REOItems.SILVER_INGOT);
        ingotItem(REOItems.STEEL_INGOT);
        ingotItem(REOItems.TIN_INGOT);
        ingotItem(REOItems.URANIUM_INGOT);
        ingotItem(REOItems.ZINC_INGOT);

        // Gem
        gemItem(REOItems.AMETHYST);
        gemItem(REOItems.PERIDOT);
        gemItem(REOItems.RUBY);
        gemItem(REOItems.SAPPHIRE);

        // Gem Shard
        shardItem(REOItems.PERIDOT_SHARD);
        shardItem(REOItems.RUBY_SHARD);
        shardItem(REOItems.SAPPHIRE_SHARD);

        // Nugget
        nuggetItem(REOItems.ALUMINUM_NUGGET);
        nuggetItem(REOItems.AMETHYST_NUGGET);
        nuggetItem(REOItems.BRASS_NUGGET);
        nuggetItem(REOItems.BRONZE_NUGGET);
        nuggetItem(REOItems.COPPER_NUGGET);
        nuggetItem(REOItems.DIAMOND_NUGGET);
        nuggetItem(REOItems.ELECTRUM_NUGGET);
        nuggetItem(REOItems.EMERALD_NUGGET);
        nuggetItem(REOItems.ENDERITE_NUGGET);
        nuggetItem(REOItems.LEAD_NUGGET);
        nuggetItem(REOItems.NETHERITE_NUGGET);
        nuggetItem(REOItems.NICKEL_NUGGET);
        nuggetItem(REOItems.PERIDOT_NUGGET);
        nuggetItem(REOItems.PLATINUM_NUGGET);
        nuggetItem(REOItems.RUBY_NUGGET);
        nuggetItem(REOItems.SAPPHIRE_NUGGET);
        nuggetItem(REOItems.SILVER_NUGGET);
        nuggetItem(REOItems.STEEL_NUGGET);
        nuggetItem(REOItems.TIN_NUGGET);
        nuggetItem(REOItems.ZINC_NUGGET);

        // Bucket
        bucketItem(REOItems.ALUMINUM_BUCKET);
        bucketItem(REOItems.AMETHYST_BUCKET);
        bucketItem(REOItems.BRASS_BUCKET);
        bucketItem(REOItems.BRONZE_BUCKET);
        bucketItem(REOItems.COAL_BUCKET);
        bucketItem(REOItems.COPPER_BUCKET);
        bucketItem(REOItems.DIAMOND_BUCKET);
        bucketItem(REOItems.ELECTRUM_BUCKET);
        bucketItem(REOItems.EMERALD_BUCKET);
        bucketItem(REOItems.ENDERITE_BUCKET);
        bucketItem(REOItems.GOLD_BUCKET);
        bucketItem(REOItems.IRON_BUCKET);
        bucketItem(REOItems.LAPIS_BUCKET);
        bucketItem(REOItems.LEAD_BUCKET);
        bucketItem(REOItems.NICKEL_BUCKET);
        bucketItem(REOItems.PERIDOT_BUCKET);
        bucketItem(REOItems.PLATINUM_BUCKET);
        bucketItem(REOItems.REDSTONE_BUCKET);
        bucketItem(REOItems.RUBY_BUCKET);
        bucketItem(REOItems.SAPPHIRE_BUCKET);
        bucketItem(REOItems.SILVER_BUCKET);
        bucketItem(REOItems.STEEL_BUCKET);
        bucketItem(REOItems.TIN_BUCKET);
        bucketItem(REOItems.URANIUM_BUCKET);
        bucketItem(REOItems.ZINC_BUCKET);

        // Luminous Powder
        luminousDustItem(REOItems.BLACK_LUMINOUS);
        luminousDustItem(REOItems.BLUE_LUMINOUS);
        luminousDustItem(REOItems.BROWN_LUMINOUS);
        luminousDustItem(REOItems.CYAN_LUMINOUS);
        luminousDustItem(REOItems.GRAY_LUMINOUS);
        luminousDustItem(REOItems.GREEN_LUMINOUS);
        luminousDustItem(REOItems.LIGHT_BLUE_LUMINOUS);
        luminousDustItem(REOItems.LIGHT_GRAY_LUMINOUS);
        luminousDustItem(REOItems.LIME_LUMINOUS);
        luminousDustItem(REOItems.MAGENTA_LUMINOUS);
        luminousDustItem(REOItems.ORANGE_LUMINOUS);
        luminousDustItem(REOItems.PINK_LUMINOUS);
        luminousDustItem(REOItems.PURPLE_LUMINOUS);
        luminousDustItem(REOItems.RED_LUMINOUS);
        luminousDustItem(REOItems.WHITE_LUMINOUS);
        luminousDustItem(REOItems.YELLOW_LUMINOUS);

        // Dust
        dustItem(REOItems.ALUMINUM_DUST);
        dustItem(REOItems.AMETHYST_DUST);
        dustItem(REOItems.BRASS_DUST);
        dustItem(REOItems.BRONZE_DUST);
        dustItem(REOItems.CHARCOAL_DUST);
        dustItem(REOItems.COAL_DUST);
        dustItem(REOItems.COPPER_DUST);
        dustItem(REOItems.DIAMOND_DUST);
        dustItem(REOItems.ELECTRUM_DUST);
        dustItem(REOItems.EMERALD_DUST);
        dustItem(REOItems.ENDERITE_DUST);
        dustItem(REOItems.GOLD_DUST);
        dustItem(REOItems.IRON_DUST);
        dustItem(REOItems.LEAD_DUST);
        dustItem(REOItems.NETHERITE_DUST);
        dustItem(REOItems.NICKEL_DUST);
        dustItem(REOItems.OBSIDIAN_DUST);
        dustItem(REOItems.PERIDOT_DUST);
        dustItem(REOItems.PLATINUM_DUST);
        dustItem(REOItems.RUBY_DUST);
        dustItem(REOItems.SAPPHIRE_DUST);
        dustItem(REOItems.SILVER_DUST);
        dustItem(REOItems.STEEL_DUST);
        dustItem(REOItems.TIN_DUST);
        dustItem(REOItems.URANIUM_DUST);
        dustItem(REOItems.ZINC_DUST);

        // Dust
        dirtyDustItem(REOItems.ALUMINUM_DIRTY);
        dirtyDustItem(REOItems.AMETHYST_DIRTY);
        dirtyDustItem(REOItems.BRASS_DIRTY);
        dirtyDustItem(REOItems.BRONZE_DIRTY);
        dirtyDustItem(REOItems.COPPER_DIRTY);
        dirtyDustItem(REOItems.DIAMOND_DIRTY);
        dirtyDustItem(REOItems.ELECTRUM_DIRTY);
        dirtyDustItem(REOItems.EMERALD_DIRTY);
        dirtyDustItem(REOItems.ENDERITE_DIRTY);
        dirtyDustItem(REOItems.GOLD_DIRTY);
        dirtyDustItem(REOItems.IRON_DIRTY);
        dirtyDustItem(REOItems.LEAD_DIRTY);
        dirtyDustItem(REOItems.NETHERITE_DIRTY);
        dirtyDustItem(REOItems.NICKEL_DIRTY);
        dirtyDustItem(REOItems.OBSIDIAN_DIRTY);
        dirtyDustItem(REOItems.PERIDOT_DIRTY);
        dirtyDustItem(REOItems.PLATINUM_DIRTY);
        dirtyDustItem(REOItems.RUBY_DIRTY);
        dirtyDustItem(REOItems.SAPPHIRE_DIRTY);
        dirtyDustItem(REOItems.SILVER_DIRTY);
        dirtyDustItem(REOItems.STEEL_DIRTY);
        dirtyDustItem(REOItems.TIN_DIRTY);
        dirtyDustItem(REOItems.URANIUM_DIRTY);
        dirtyDustItem(REOItems.ZINC_DIRTY);

        // Tech //
        // Misc
        miscItem(REOItems.SAP);
        miscItem(REOItems.RESIN);
        miscItem(REOItems.RUBBER);
        miscItem(REOItems.TREE_TAP);

        // Gear
        gearItem(REOItems.ALUMINUM_GEAR);
        gearItem(REOItems.AMETHYST_GEAR);
        gearItem(REOItems.BRASS_GEAR);
        gearItem(REOItems.BRONZE_GEAR);
        gearItem(REOItems.COPPER_GEAR);
        gearItem(REOItems.DIAMOND_GEAR);
        gearItem(REOItems.ELECTRUM_GEAR);
        gearItem(REOItems.EMERALD_GEAR);
        gearItem(REOItems.ENDERITE_GEAR);
        gearItem(REOItems.GOLD_GERAR);
        gearItem(REOItems.IRON_GEAR);
        gearItem(REOItems.LEAD_GEAR);
        gearItem(REOItems.NICKEL_GEAR);
        gearItem(REOItems.PLATINUM_GEAR);
        gearItem(REOItems.PERIDOT_GEAR);
        gearItem(REOItems.RUBY_GEAR);
        gearItem(REOItems.SAPPHIRE_GEAR);
        gearItem(REOItems.SILVER_GEAR);
        gearItem(REOItems.STEEL_GEAR);
        gearItem(REOItems.STONE_GEAR);
        gearItem(REOItems.TIN_GEAR);
        gearItem(REOItems.WOOD_GEAR);
        gearItem(REOItems.ZINC_GEAR);

        // Plate
        plateItem(REOItems.ALUMINUM_PLATE);
        plateItem(REOItems.AMETHYST_PLATE);
        plateItem(REOItems.BRASS_PALTE);
        plateItem(REOItems.BRONZE_PLATE);
        plateItem(REOItems.COPPER_PALTE);
        plateItem(REOItems.DIAMOND_PLATE);
        plateItem(REOItems.ELECTRUM_PLATE);
        plateItem(REOItems.EMERALD_PLATE);
        plateItem(REOItems.ENDERITE_PLATE);
        plateItem(REOItems.GOLD_PLATE);
        plateItem(REOItems.IRON_PLATE);
        plateItem(REOItems.LEAD_PLATE);
        plateItem(REOItems.NICKEL_PLATE);
        plateItem(REOItems.PLATINUM_PLATE);
        plateItem(REOItems.PERIDOT_PLATE);
        plateItem(REOItems.RUBY_PLATE);
        plateItem(REOItems.SAPPHIRE_PLATE);
        plateItem(REOItems.SILVER_PLATE);
        plateItem(REOItems.STEEL_PLATE);
        plateItem(REOItems.TIN_PLATE);
        plateItem(REOItems.ZINC_PLATE);

        // Capacitor
        capacitorItem(REOItems.BASIC_CAPACITOR);
        capacitorItem(REOItems.ADVANCED_CAPACITOR);
        capacitorItem(REOItems.ULTIMATE_CAPACITOR);

        // Foods //
        // Seeds
        seedItem(REOItems.BARLEY_SEED);
        seedItem(REOItems.CAULIFLOWER_SEED);
        seedItem(REOItems.COTTON_SEED);
        seedItem(REOItems.ENDER_LILLY_SEED);
        seedItem(REOItems.RICE_SEED);
        seedItem(REOItems.STRAWBERRY_SEED);
        seedItem(REOItems.TOMATO_SEED);

        // Crops
        plantItem(REOItems.BARLEY_PLANT);
        plantItem(REOItems.COTTON_PLANT);
        plantItem(REOItems.RICE_PLANT);

        // Flour
        foodItem(REOItems.BARLEY_FLOUR);
        foodItem(REOItems.WHEAT_FLOUR);

        // Fruit
        foodItem(REOItems.BLACKBERRY);
        foodItem(REOItems.BLUEBERRY);
        foodItem(REOItems.CHERRY);
        foodItem(REOItems.DATES);
        foodItem(REOItems.LEMON);
        foodItem(REOItems.LIME);
        foodItem(REOItems.PAPAYA);
        foodItem(REOItems.PEACH);
        foodItem(REOItems.PEAR);
        foodItem(REOItems.PLUM);
        foodItem(REOItems.RASPBERRY);
        foodItem(REOItems.STRAWBERRY);

        // Nuts
        foodItem(REOItems.CHESTNUT);
        foodItem(REOItems.WALNUT);

        // Veg
        foodItem(REOItems.CAULIFLOWER);
        foodItem(REOItems.ONION);
        foodItem(REOItems.RICE);
        foodItem(REOItems.TOMATO);
        foodItem(REOItems.TOMATO_ROTTEN);


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

        horseArmorItem(REOItems.ALUMINIUM_HORSE_ARMOR);

        // Amethyst
        trimmedArmourItem(REOItems.AMETHYST_HELMET);
        trimmedArmourItem(REOItems.AMETHYST_CHESTPLATE);
        trimmedArmourItem(REOItems.AMETHYST_LEGGINGS);
        trimmedArmourItem(REOItems.AMETHYST_BOOTS);

        horseArmorItem(REOItems.AMETHYST_HORSE_ARMOR);

        // Bronze
        trimmedArmourItem(REOItems.BRONZE_HELMET);
        trimmedArmourItem(REOItems.BRONZE_CHESTPLATE);
        trimmedArmourItem(REOItems.BRONZE_LEGGINGS);
        trimmedArmourItem(REOItems.BRONZE_BOOTS);

        horseArmorItem(REOItems.BRONZE_HORSE_ARMOR);

        // Enderite
        trimmedArmourItem(REOItems.ENDERITE_HELMET);
        trimmedArmourItem(REOItems.ENDERITE_CHESTPLATE);
        trimmedArmourItem(REOItems.ENDERITE_LEGGINGS);
        trimmedArmourItem(REOItems.ENDERITE_BOOTS);

        horseArmorItem(REOItems.ENDERITE_HORSE_ARMOR);

        // Platinum
        trimmedArmourItem(REOItems.PLATINUM_HELMET);
        trimmedArmourItem(REOItems.PLATINUM_CHESTPLATE);
        trimmedArmourItem(REOItems.PLATINUM_LEGGINGS);
        trimmedArmourItem(REOItems.PLATINUM_BOOTS);

        horseArmorItem(REOItems.PLATINUM_HORSE_ARMOR);

        // Peridot
        trimmedArmourItem(REOItems.PERIDOT_HELMET);
        trimmedArmourItem(REOItems.PERIDOT_CHESTPLATE);
        trimmedArmourItem(REOItems.PERIDOT_LEGGINGS);
        trimmedArmourItem(REOItems.PERIDOT_BOOTS);

        horseArmorItem(REOItems.PERIDOT_HORSE_ARMOR);

        // Ruby
        trimmedArmourItem(REOItems.RUBY_HELMET);
        trimmedArmourItem(REOItems.RUBY_CHESTPLATE);
        trimmedArmourItem(REOItems.RUBY_LEGGINGS);
        trimmedArmourItem(REOItems.RUBY_BOOTS);

        horseArmorItem(REOItems.RUBY_HORSE_ARMOR);

        // Sapphire
        trimmedArmourItem(REOItems.SAPPHIRE_HELMET);
        trimmedArmourItem(REOItems.SAPPHIRE_CHESTPLATE);
        trimmedArmourItem(REOItems.SAPPHIRE_LEGGINGS);
        trimmedArmourItem(REOItems.SAPPHIRE_BOOTS);

        horseArmorItem(REOItems.SAPPHIRE_HORSE_ARMOR);

        // Silver
        trimmedArmourItem(REOItems.SILVER_HELMET);
        trimmedArmourItem(REOItems.SILVER_CHESTPLATE);
        trimmedArmourItem(REOItems.SILVER_LEGGINGS);
        trimmedArmourItem(REOItems.SILVER_BOOTS);

        horseArmorItem(REOItems.SILVER_HORSE_ARMOR);

        // Steel
        trimmedArmourItem(REOItems.STEEL_HELMET);
        trimmedArmourItem(REOItems.STEEL_CHESTPLATE);
        trimmedArmourItem(REOItems.STEEL_LEGGINGS);
        trimmedArmourItem(REOItems.STEEL_BOOTS);

        horseArmorItem(REOItems.STEEL_HORSE_ARMOR);


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
        simpleBlockItem(REOBlocks.MARBLE_BRICK_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS);
        simpleBlockItem(REOBlocks.MARBLE_SLAB);
        simpleBlockItem(REOBlocks.MARBLE_BRICK_SLAB);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_SLAB);
        simpleBlockItem(REOBlocks.MARBLE_COBBLE_MOSSY_SLAB);
        wallItem(REOBlocks.MARBLE_WALL, "marble/marble");
        wallItem(REOBlocks.MARBLE_BRICK_WALL, "marble/marble_brick");
        wallItem(REOBlocks.MARBLE_COBBLE_WALL, "marble/marble_cobble");
        wallItem(REOBlocks.MARBLE_COBBLE_MOSSY_WALL, "marble/marble_cobble_mossy");

        // Limestone
        simpleBlockItem(REOBlocks.LIMESTONE_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_BRICK_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS);
        simpleBlockItem(REOBlocks.LIMESTONE_SLAB);
        simpleBlockItem(REOBlocks.LIMESTONE_BRICK_SLAB);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_SLAB);
        simpleBlockItem(REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB);
        wallItem(REOBlocks.LIMESTONE_WALL, "limestone/limestone");
        wallItem(REOBlocks.LIMESTONE_BRICK_WALL, "limestone/limestone_brick");
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
        signItem(REOItems.BALSA_SIGN);
        signItem(REOItems.BALSA_HANGING_SIGN);

        boatItem(REOItems.BALSA_BOAT);
        boatItem(REOItems.BALSA_CHEST_BOAT);

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
        signItem(REOItems.BAOBAB_SIGN);
        signItem(REOItems.BAOBAB_HANGING_SIGN);

        boatItem(REOItems.BAOBAB_BOAT);
        boatItem(REOItems.BAOBAB_CHEST_BOAT);

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
        signItem(REOItems.HILL_CHERRY_SIGN);
        signItem(REOItems.HILL_CHERRY_HANGING_SIGN);

        boatItem(REOItems.HILL_CHERRY_BOAT);
        boatItem(REOItems.HILL_CHERRY_CHEST_BOAT);

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
        signItem(REOItems.CHESTNUT_SIGN);
        signItem(REOItems.CHESTNUT_HANGING_SIGN);

        boatItem(REOItems.BOAT_CHESTNUT);
        boatItem(REOItems.CHESTNUT_CHEST_BOAT);

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
        signItem(REOItems.CITRUS_SIGN);
        signItem(REOItems.CITRUS_HANGING_SIGN);

        boatItem(REOItems.CITRUS_BOAT);
        boatItem(REOItems.CITRUS_CHEST_BOAT);

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
        signItem(REOItems.EBONY_SIGN);
        signItem(REOItems.EBONY_HANGING_SIGN);

        boatItem(REOItems.EBONY_BOAT);
        boatItem(REOItems.EBONY_CHEST_BOAT);

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
        signItem(REOItems.LARCH_SIGN);
        signItem(REOItems.LARCH_HANGING_SIGN);

        boatItem(REOItems.LARCH_BOAT);
        boatItem(REOItems.LARCH_CHEST_BOAT);

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
        signItem(REOItems.LIME_SIGN);
        signItem(REOItems.LIME_HANGING_SIGN);

        boatItem(REOItems.LIME_BOAT);
        boatItem(REOItems.LIME_CHEST_BOAT);

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
        signItem(REOItems.MAHOGANY_SIGN);
        signItem(REOItems.MAHOGANY_HANGING_SIGN);

        boatItem(REOItems.MAHOGANY_BOAT);
        boatItem(REOItems.MAHOGANY_CHEST_BOAT);

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
        signItem(REOItems.MAPLE_SIGN);
        signItem(REOItems.MAPLE_HANGING_SIGN);

        boatItem(REOItems.MAPLE_BOAT);
        boatItem(REOItems.MAPLE_CHEST_BOAT);

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
        signItem(REOItems.PALM_SIGN);
        signItem(REOItems.PALM_HANGING_SIGN);

        boatItem(REOItems.PALM_BOAT);
        boatItem(REOItems.PALM_CHEST_BOAT);

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
        signItem(REOItems.PAPAYA_SIGN);
        signItem(REOItems.PAPAYA_HANGING_SIGN);

        boatItem(REOItems.PAPAYA_BOAT);
        boatItem(REOItems.PAPAYA_CHEST_BOAT);

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
        signItem(REOItems.PINE_SIGN);
        signItem(REOItems.PINE_HANGING_SIGN);

        boatItem(REOItems.PINE_BOAT);
        boatItem(REOItems.PINE_CHEST_BOAT);

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
        signItem(REOItems.PLUM_SIGN);
        signItem(REOItems.PLUM_HANGING_SIGN);

        boatItem(REOItems.PLUM_BOAT);
        boatItem(REOItems.PLUM_CHEST_BOAT);

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
        signItem(REOItems.POPLAR_SIGN);
        signItem(REOItems.POPLAR_HANGING_SIGN);

        boatItem(REOItems.POPLAR_BOAT);
        boatItem(REOItems.POPLAR_CHEST_BOAT);

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
        signItem(REOItems.REDWOOD_SIGN);
        signItem(REOItems.REDWOOD_HANGING_SIGN);

        boatItem(REOItems.REDWOOD_BOAT);
        boatItem(REOItems.REDWOOD_CHEST_BOAT);

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
        signItem(REOItems.RUBBER_SIGN);
        signItem(REOItems.RUBBER_HANGING_SIGN);

        boatItem(REOItems.RUBBER_BOAT);
        boatItem(REOItems.RUBBER_CHEST_BOAT);

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
        signItem(REOItems.TEAK_SIGN);
        signItem(REOItems.TEAK_HANGING_SIGN);

        boatItem(REOItems.TEAK_BOAT);
        boatItem(REOItems.TEAK_CHEST_BOAT);

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
        signItem(REOItems.WALNUT_SIGN);
        signItem(REOItems.WALNUT_HANGING_SIGN);

        boatItem(REOItems.WALNUT_BOAT);
        boatItem(REOItems.WALNUT_CHEST_BOAT);

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
        signItem(REOItems.WILLOW_SIGN);
        signItem(REOItems.WILLOW_HANGING_SIGN);

        boatItem(REOItems.WILLOW_BOAT);
        boatItem(REOItems.WILLOW_CHEST_BOAT);

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

        // Tech //
        // Machines
        // Coal
        simpleBlockItem(REOBlocks.KILN);
        simpleBlockItem(REOBlocks.CRUSHER);
        simpleBlockItem(REOBlocks.EXTRACTOR);
        simpleBlockItem(REOBlocks.PURIFIER);

        // Basic
        simpleBlockItem(REOBlocks.ELECTRIC_ALLOY_FURNACE);
        simpleBlockItem(REOBlocks.ELECTRIC_COMPRESSOR);
        simpleBlockItem(REOBlocks.ELECTRIC_CENTRIFUGE);
        simpleBlockItem(REOBlocks.ELECTRIC_CRUSHER);
        simpleBlockItem(REOBlocks.ELECTRIC_FURNACE);
        simpleBlockItem(REOBlocks.ELECTRIC_EXTRACTOR);
        simpleBlockItem(REOBlocks.ELECTRIC_INDUCTION_FURNACE);
        simpleBlockItem(REOBlocks.ELECTRIC_PURIFIER);
        simpleBlockItem(REOBlocks.ELECTRIC_SAWMILL);
        simpleBlockItem(REOBlocks.ELECTRIC_TRANSFUSER);

        // Generator
        simpleBlockItem(REOBlocks.COAL_GENERATOR);

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

    private ItemModelBuilder capacitorItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/capacitor/" + item.getId().getPath()));
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

    private ItemModelBuilder plantItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RealEarthOres.MOD_ID, "item/food/plant/" + item.getId().getPath()));
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