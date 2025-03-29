package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.datagen.custom.coal.BasicCrusherRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.BasicExtractorRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.BasicPurifierRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.KilnRecipeBuilder;
import net.coton999.realearthores.datagen.custom.electric.basic.*;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.StrictNBTIngredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class REORecipeProvider extends RecipeProvider implements IConditionBuilder {

    public REORecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Vanilla Furnace //
        // Building Blocks
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.MARBLE_COBBLE.get()), RecipeCategory.MISC,
                REOBlocks.MARBLE.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.MARBLE.get()), has(REOBlocks.MARBLE.get())).save(pWriter, "marble_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.MARBLE_BRICK.get()), RecipeCategory.MISC,
                REOBlocks.MARBLE_BRICK_CRACKED.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.MARBLE_BRICK.get()), has(REOBlocks.MARBLE_BRICK.get())).save(pWriter, "marble_brick_cracked_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.LIMESTONE_COBBLE.get()), RecipeCategory.MISC,
                        REOBlocks.LIMESTONE.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE.get()), has(REOBlocks.LIMESTONE.get())).save(pWriter, "limestone_from_smelting");
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.LIMESTONE_BRICK.get()), RecipeCategory.MISC,
                        REOBlocks.LIMESTONE_BRICK_CRACKED.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE_BRICK.get()), has(REOBlocks.LIMESTONE_BRICK.get())).save(pWriter, "limestone_brick_cracked_from_smelting");

        // Ores
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                        REOBlocks.NETHER_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), REOItems.DIRTY_ALUMINIUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(), 0.7F, 200)
                .unlockedBy("has_aluminium_ores", has(REOTags.Items.ALUMINIUM_ORES)).save(pWriter, "aluminium_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.AMETHYST_CLUSTER, REOItems.DUST_AMETHYST.get(), REOItems.DIRTY_AMETHYST.get()),
                        RecipeCategory.MISC, REOItems.GEM_AMETHYST.get(), 0.7F, 200)
                .unlockedBy("has_amethyst_cluster", has(Blocks.AMETHYST_CLUSTER)).save(pWriter, "amethyst_gem_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.DUST_BRASS.get(), REOItems.DIRTY_BRASS.get()),
                        RecipeCategory.MISC, REOItems.INGOT_BRASS.get(), 0.7F, 200)
                .unlockedBy("has_dust_brass", has(REOItems.DUST_BRASS.get()))
                .unlockedBy("has_dirty_brass", has(REOItems.DIRTY_BRASS.get())).save(pWriter, "steel_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.DUST_BRONZE.get(), REOItems.DIRTY_BRONZE.get()),
                        RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(), 0.7F, 200)
                .unlockedBy("has_dust_bronze", has(REOItems.DUST_BRONZE.get()))
                .unlockedBy("has_dirty_bronze", has(REOItems.DIRTY_BRONZE.get())).save(pWriter, "bronze_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(),
                        REOItems.DUST_COPPER.get(), REOItems.DIRTY_COPPER.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES)).save(pWriter, "copper_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(),
                        REOItems.DUST_DIAMOND.get(), REOItems.DIRTY_DIAMOND.get()),
                        RecipeCategory.MISC, Items.DIAMOND, 1F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.DIAMOND_ORES)).save(pWriter, "diamond_from_smelting_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.DUST_ELECTRUM.get(), REOItems.DIRTY_ELECTRUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(), 0.7F, 200)
                .unlockedBy("has_electrum_ores", has(REOTags.Items.ELECTRUM_DUSTS)).save(pWriter, "electrum_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(),
                        REOItems.DUST_EMERALD.get(), REOItems.DIRTY_EMERALD.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.EMERALD_ORES)).save(pWriter, "emerald_from_smelting_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ENDERITE.get(), REOItems.RAW_ENDERITE.get(),
                        REOItems.DUST_ENDERITE.get(), REOItems.DIRTY_ENDERITE.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(), 1F, 200)
                .unlockedBy("has_enderite_ores", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter, "enderite_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.DUST_GOLD.get(), REOItems.DIRTY_GOLD.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.GOLD_ORES)).save(pWriter, "gold_ingot_from_smelting_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(),
                        REOItems.DUST_IRON.get(), REOItems.DIRTY_IRON.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.IRON_ORES)).save(pWriter, "iron_ingot_from_smelting_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.GRAVEL_ORE_LEAD.get(),
                        REOBlocks.NETHER_LEAD.get(), REOItems.RAW_LEAD.get(), REOItems.DUST_LEAD.get(), REOItems.DIRTY_LEAD.get()),
                        RecipeCategory.MISC, REOItems.INGOT_LEAD.get(), 0.7F, 200)
                .unlockedBy("has_lead_ores", has(REOTags.Items.LEAD_ORES)).save(pWriter, "lead_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.DUST_NETHERITE.get(), REOItems.DIRTY_NETHERITE.get()),
                        RecipeCategory.MISC, Items.NETHERITE_SCRAP, 2F, 200)
                .unlockedBy("has_netherite_ores", has(REOTags.Items.NETHERITE_DUSTS)).save(pWriter, "netherite_ingot_from_smelting_dust");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(),
                        REOBlocks.NETHER_NICKEL.get(), REOItems.RAW_NICKEL.get(), REOItems.DUST_NICKEL.get(), REOItems.DIRTY_NICKEL.get()),
                        RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(), 0.7F, 200)
                .unlockedBy("has_nickel_ores", has(REOTags.Items.NICKEL_ORES)).save(pWriter, "nickel_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.DUST_OBSIDIAN.get(), REOItems.DIRTY_OBSIDIAN.get()),
                        RecipeCategory.MISC, REOItems.INGOT_OBSIDIAN.get(), 0.7F, 200)
                .unlockedBy("has_obsidian_ores", has(REOTags.Items.OBSIDIAN_DUSTS)).save(pWriter, "obsidian_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.DUST_PERIDOT.get(), REOItems.DIRTY_PERIDOT.get()),
                        RecipeCategory.MISC, REOItems.GEM_PERIDOT.get(), 0.7F, 200)
                .unlockedBy("has_peridot_cluster", has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter, "peridot_gem_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                        REOBlocks.NETHER_PLATINUM.get(), REOItems.RAW_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), REOItems.DIRTY_PLATINUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(), 0.7F, 200)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.PLATINUM_ORES)).save(pWriter, "platinum_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.DUST_RUBY.get(), REOItems.DIRTY_RUBY.get()),
                        RecipeCategory.MISC, REOItems.GEM_RUBY.get(), 0.7F, 200)
                .unlockedBy("has_ruby_cluster", has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter, "ruby_gem_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.DUST_SAPPHIRE.get(), REOItems.DIRTY_SAPPHIRE.get()),
                        RecipeCategory.MISC, REOItems.GEM_SAPPHIRE.get(), 0.7F, 200)
                .unlockedBy("has_sapphire_cluster", has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter, "sapphire_gem_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),
                        REOBlocks.NETHER_SILVER.get(), REOItems.RAW_SILVER.get(), REOItems.DUST_SILVER.get(), REOItems.DIRTY_SILVER.get()),
                        RecipeCategory.MISC, REOItems.INGOT_SILVER.get(), 0.7F, 200)
                .unlockedBy("has_silver_ores", has(REOTags.Items.SILVER_ORES)).save(pWriter, "silver_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.IRON_INGOT, REOItems.DUST_STEEL.get(), REOItems.DIRTY_STEEL.get()),
                        RecipeCategory.MISC, REOItems.INGOT_STEEL.get(), 0.7F, 200)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).unlockedBy("has_dust_brass", has(REOItems.DUST_STEEL.get()))
                .unlockedBy("has_dirty_brass", has(REOItems.DIRTY_STEEL.get())).save(pWriter, "brass_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_TIN.get(), REOBlocks.GRAVEL_ORE_TIN.get(),
                        REOBlocks.NETHER_TIN.get(), REOItems.RAW_TIN.get(), REOItems.DUST_TIN.get(), REOItems.DIRTY_TIN.get()),
                        RecipeCategory.MISC, REOItems.INGOT_TIN.get(), 0.7F, 200)
                .unlockedBy("has_tin_ores", has(REOTags.Items.TIN_ORES)).save(pWriter, "tin_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(),
                        REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get(), REOItems.DUST_URANIUM.get(), REOItems.DIRTY_URANIUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_URANIUM.get(), 0.7F, 200)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.URANIUM_ORES)).save(pWriter, "uranium_ingot_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.GRAVEL_ORE_ZINC.get(),
                        REOBlocks.NETHER_ZINC.get(), REOItems.RAW_ZINC.get(), REOItems.DUST_ZINC.get(), REOItems.DIRTY_ZINC.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ZINC.get(), 0.7F, 200)
                .unlockedBy("has_zinc_ores", has(REOTags.Items.ZINC_ORES)).save(pWriter, "zinc_ingot_from_smelting");

        // Nuggets
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.IRON_AXE, Items.IRON_PICKAXE, Items.IRON_SHOVEL, Items.IRON_HOE, Items.IRON_SWORD,
                        Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                        Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS,
                        Items.IRON_HORSE_ARMOR, REOItems.IRON_BOW.get(), REOItems.IRON_EXCAVATOR.get(), REOItems.IRON_HAMMER.get(),
                        REOItems.IRON_HATCHET.get(), REOItems.IRON_PAXEL.get(), REOItems.IRON_SICKLE.get()),
                        RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 200)
                .unlockedBy("has_iron_tools_and_armour", has(Items.IRON_SWORD)).save(pWriter, "iron_nugget_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.DIAMOND_AXE, Items.DIAMOND_PICKAXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_HOE, Items.DIAMOND_SWORD,
                        Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS,
                        Items.DIAMOND_HORSE_ARMOR, REOItems.DIAMOND_BOW.get(), REOItems.DIAMOND_EXCAVATOR.get(), REOItems.DIAMOND_HAMMER.get(),
                        REOItems.DIAMOND_HATCHET.get(), REOItems.DIAMOND_PAXEL.get(), REOItems.DIAMOND_SICKLE.get()),
                        RecipeCategory.MISC, REOItems.NUGGET_DIAMOND.get(), 0.1F, 200)
                .unlockedBy("has_diamond_tools_and_armour", has(Items.DIAMOND_SWORD)).save(pWriter, "nugget_diamond_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.GOLDEN_AXE, Items.GOLDEN_PICKAXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_HOE, Items.GOLDEN_SWORD,
                        Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS,
                        Items.GOLDEN_HORSE_ARMOR, REOItems.GOLDEN_BOW.get(), REOItems.GOLDEN_EXCAVATOR.get(), REOItems.GOLDEN_HAMMER.get(),
                        REOItems.GOLDEN_HATCHET.get(), REOItems.GOLDEN_PAXEL.get(), REOItems.GOLDEN_SICKLE.get()),
                        RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 200)
                .unlockedBy("has_golden_tools_and_armour", has(Items.GOLDEN_SWORD)).save(pWriter, "gold_nugget_from_smelting");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.NETHERITE_AXE, Items.NETHERITE_PICKAXE, Items.NETHERITE_SHOVEL, Items.NETHERITE_HOE, Items.NETHERITE_SWORD,
                        Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS,
                        REOItems.NETHERITE_BOW.get(), REOItems.NETHERITE_EXCAVATOR.get(), REOItems.NETHERITE_HAMMER.get(),
                        REOItems.NETHERITE_HATCHET.get(), REOItems.NETHERITE_PAXEL.get(), REOItems.NETHERITE_SICKLE.get()),
                        RecipeCategory.MISC, REOItems.NUGGET_NETHERITE.get(), 0.1F, 200)
                .unlockedBy("has_netherite_tools_and_armour", has(Items.NETHERITE_SWORD)).save(pWriter, "nugget_netherite_from_smelting");

        // Misc
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 200)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get())).save(pWriter, "rubber_from_smelting");

        // Food
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.FLOUR_WHEAT.get(), REOItems.FLOUR_BARLEY.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 200)
                .unlockedBy(getHasName(REOItems.FLOUR_WHEAT.get()), has(REOItems.FLOUR_WHEAT.get()))
                .unlockedBy(getHasName(REOItems.FLOUR_BARLEY.get()), has(REOItems.FLOUR_BARLEY.get())).save(pWriter, "bread_from_smelting");


        // Blast Furnace //
        // Ores
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                        REOBlocks.NETHER_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), REOItems.DIRTY_ALUMINIUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(), 0.7F, 100)
                .unlockedBy("has_aluminium_ores", has(REOTags.Items.ALUMINIUM_ORES)).save(pWriter, "aluminium_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.AMETHYST_CLUSTER, REOItems.DUST_AMETHYST.get(), REOItems.DIRTY_AMETHYST.get()),
                        RecipeCategory.MISC, REOItems.GEM_AMETHYST.get(), 0.7F, 100)
                .unlockedBy("has_amethyst_cluster", has(Blocks.AMETHYST_CLUSTER)).save(pWriter, "amethyst_gem_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.DUST_BRASS.get(), REOItems.DIRTY_BRASS.get()),
                        RecipeCategory.MISC, REOItems.INGOT_BRASS.get(), 0.7F, 100)
                .unlockedBy("has_dust_brass", has(REOItems.DUST_BRASS.get()))
                .unlockedBy("has_dirty_brass", has(REOItems.DIRTY_BRASS.get())).save(pWriter, "steel_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.DUST_BRONZE.get(), REOItems.DIRTY_BRONZE.get()),
                        RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(), 0.7F, 100)
                .unlockedBy("has_dust_bronze", has(REOItems.DUST_BRONZE.get()))
                .unlockedBy("has_dirty_bronze", has(REOItems.DIRTY_BRONZE.get())).save(pWriter, "bronze_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(),
                        REOItems.DUST_COPPER.get(), REOItems.DIRTY_COPPER.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 100)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES)).save(pWriter, "copper_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(),
                                REOItems.DUST_DIAMOND.get(), REOItems.DIRTY_DIAMOND.get()),
                        RecipeCategory.MISC, Items.DIAMOND, 1F, 100)
                .unlockedBy("has_copper_ores", has(ItemTags.DIAMOND_ORES)).save(pWriter, "diamond_from_blasting_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.DUST_ELECTRUM.get(), REOItems.DIRTY_ELECTRUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(), 0.7F, 100)
                .unlockedBy("has_electrum_ores", has(REOTags.Items.ELECTRUM_DUSTS)).save(pWriter, "electrum_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(),
                                REOItems.DUST_EMERALD.get(), REOItems.DIRTY_EMERALD.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 100)
                .unlockedBy("has_copper_ores", has(ItemTags.EMERALD_ORES)).save(pWriter, "emerald_from_blasting_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ENDERITE.get(), REOItems.RAW_ENDERITE.get(), REOItems.DUST_ENDERITE.get(), REOItems.DIRTY_ENDERITE.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(), 1F, 100)
                .unlockedBy("has_enderite_ores", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter, "enderite_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.DUST_GOLD.get(), REOItems.DIRTY_GOLD.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 100)
                .unlockedBy("has_copper_ores", has(ItemTags.GOLD_ORES)).save(pWriter, "gold_ingot_from_blasting_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(),
                                REOItems.DUST_IRON.get(), REOItems.DIRTY_IRON.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 100)
                .unlockedBy("has_copper_ores", has(ItemTags.IRON_ORES)).save(pWriter, "iron_ingot_from_blasting_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.GRAVEL_ORE_LEAD.get(),
                        REOBlocks.NETHER_LEAD.get(), REOItems.RAW_LEAD.get(), REOItems.DUST_LEAD.get(), REOItems.DIRTY_LEAD.get()),
                        RecipeCategory.MISC, REOItems.INGOT_LEAD.get(), 0.7F, 100)
                .unlockedBy("has_lead_ores", has(REOTags.Items.LEAD_ORES)).save(pWriter, "lead_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.DUST_NETHERITE.get(), REOItems.DIRTY_NETHERITE.get()),
                        RecipeCategory.MISC, Items.NETHERITE_SCRAP, 2F, 100)
                .unlockedBy("has_netherite_ores", has(REOTags.Items.NETHERITE_DUSTS)).save(pWriter, "netherite_ingot_from_blasting_dust");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(),
                        REOBlocks.NETHER_NICKEL.get(), REOItems.RAW_NICKEL.get(), REOItems.DUST_NICKEL.get(), REOItems.DIRTY_NICKEL.get()),
                        RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(), 0.7F, 100)
                .unlockedBy("has_nickel_ores", has(REOTags.Items.NICKEL_ORES)).save(pWriter, "nickel_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.DUST_OBSIDIAN.get(), REOItems.DIRTY_OBSIDIAN.get()),
                        RecipeCategory.MISC, REOItems.INGOT_OBSIDIAN.get(), 0.7F, 100)
                .unlockedBy("has_obsidian_ores", has(REOTags.Items.OBSIDIAN_DUSTS)).save(pWriter, "obsidian_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.DUST_PERIDOT.get(), REOItems.DIRTY_PERIDOT.get()),
                        RecipeCategory.MISC, REOItems.GEM_PERIDOT.get(), 0.7F, 100)
                .unlockedBy("has_peridot_cluster", has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter, "peridot_gem_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                        REOBlocks.NETHER_PLATINUM.get(), REOItems.RAW_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), REOItems.DIRTY_PLATINUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(), 0.7F, 100)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.PLATINUM_ORES)).save(pWriter, "platinum_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.DUST_RUBY.get(), REOItems.DIRTY_RUBY.get()),
                        RecipeCategory.MISC, REOItems.GEM_RUBY.get(), 0.7F, 100)
                .unlockedBy("has_ruby_cluster", has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter, "ruby_gem_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.DUST_SAPPHIRE.get(), REOItems.DIRTY_SAPPHIRE.get()),
                        RecipeCategory.MISC, REOItems.GEM_SAPPHIRE.get(), 0.7F, 100)
                .unlockedBy("has_sapphire_cluster", has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter, "sapphire_gem_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),
                        REOBlocks.NETHER_SILVER.get(), REOItems.RAW_SILVER.get(), REOItems.DUST_SILVER.get(), REOItems.DIRTY_SILVER.get()),
                        RecipeCategory.MISC, REOItems.INGOT_SILVER.get(), 0.7F, 100)
                .unlockedBy("has_silver_ores", has(REOTags.Items.SILVER_ORES)).save(pWriter, "silver_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.IRON_INGOT, REOItems.DUST_STEEL.get(), REOItems.DIRTY_STEEL.get()),
                        RecipeCategory.MISC, REOItems.INGOT_STEEL.get(), 0.7F, 100)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT)).unlockedBy("has_dust_brass", has(REOItems.DUST_STEEL.get()))
                .unlockedBy("has_dirty_brass", has(REOItems.DIRTY_STEEL.get())).save(pWriter, "brass_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_TIN.get(), REOBlocks.GRAVEL_ORE_TIN.get(),
                        REOBlocks.NETHER_TIN.get(), REOItems.RAW_TIN.get(), REOItems.DUST_TIN.get(), REOItems.DIRTY_TIN.get()),
                        RecipeCategory.MISC, REOItems.INGOT_TIN.get(), 0.7F, 100)
                .unlockedBy("has_tin_ores", has(REOTags.Items.TIN_ORES)).save(pWriter, "tin_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(),
                        REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get(), REOItems.DUST_URANIUM.get(), REOItems.DIRTY_URANIUM.get()),
                        RecipeCategory.MISC, REOItems.INGOT_URANIUM.get(), 0.7F, 100)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.URANIUM_ORES)).save(pWriter, "uranium_ingot_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.GRAVEL_ORE_ZINC.get(),
                        REOBlocks.NETHER_ZINC.get(), REOItems.RAW_ZINC.get(), REOItems.DUST_ZINC.get(), REOItems.DIRTY_ZINC.get()),
                        RecipeCategory.MISC, REOItems.INGOT_ZINC.get(), 0.7F, 100)
                .unlockedBy("has_zinc_ores", has(REOTags.Items.ZINC_ORES)).save(pWriter, "zinc_ingot_from_blasting");

        // Nuggets
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.IRON_AXE, Items.IRON_PICKAXE, Items.IRON_SHOVEL, Items.IRON_HOE, Items.IRON_SWORD,
                        Items.IRON_HELMET, Items.IRON_CHESTPLATE, Items.IRON_LEGGINGS, Items.IRON_BOOTS,
                        Items.CHAINMAIL_HELMET, Items.CHAINMAIL_CHESTPLATE, Items.CHAINMAIL_LEGGINGS, Items.CHAINMAIL_BOOTS,
                        Items.IRON_HORSE_ARMOR, REOItems.IRON_BOW.get(), REOItems.IRON_EXCAVATOR.get(), REOItems.IRON_HAMMER.get(),
                        REOItems.IRON_HATCHET.get(), REOItems.IRON_PAXEL.get(), REOItems.IRON_SICKLE.get()), RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 100)
                .unlockedBy("has_iron_tools_and_armour", has(Items.IRON_SWORD)).save(pWriter, "iron_nugget_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.DIAMOND_AXE, Items.DIAMOND_PICKAXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_HOE, Items.DIAMOND_SWORD,
                        Items.DIAMOND_HELMET, Items.DIAMOND_CHESTPLATE, Items.DIAMOND_LEGGINGS, Items.DIAMOND_BOOTS,
                        Items.DIAMOND_HORSE_ARMOR, REOItems.DIAMOND_BOW.get(), REOItems.DIAMOND_EXCAVATOR.get(), REOItems.DIAMOND_HAMMER.get(),
                        REOItems.DIAMOND_HATCHET.get(), REOItems.DIAMOND_PAXEL.get(), REOItems.DIAMOND_SICKLE.get()), RecipeCategory.MISC, REOItems.NUGGET_DIAMOND.get(), 0.1F, 100)
                .unlockedBy("has_diamond_tools_and_armour", has(Items.DIAMOND_SWORD)).save(pWriter, "nugget_diamond_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.GOLDEN_AXE, Items.GOLDEN_PICKAXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_HOE, Items.GOLDEN_SWORD,
                        Items.GOLDEN_HELMET, Items.GOLDEN_CHESTPLATE, Items.GOLDEN_LEGGINGS, Items.GOLDEN_BOOTS,
                        Items.GOLDEN_HORSE_ARMOR, REOItems.GOLDEN_BOW.get(), REOItems.GOLDEN_EXCAVATOR.get(), REOItems.GOLDEN_HAMMER.get(),
                        REOItems.GOLDEN_HATCHET.get(), REOItems.GOLDEN_PAXEL.get(), REOItems.GOLDEN_SICKLE.get()), RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 100)
                .unlockedBy("has_golden_tools_and_armour", has(Items.GOLDEN_SWORD)).save(pWriter, "gold_nugget_from_blasting");

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.NETHERITE_AXE, Items.NETHERITE_PICKAXE, Items.NETHERITE_SHOVEL, Items.NETHERITE_HOE, Items.NETHERITE_SWORD,
                        Items.NETHERITE_HELMET, Items.NETHERITE_CHESTPLATE, Items.NETHERITE_LEGGINGS, Items.NETHERITE_BOOTS,
                        REOItems.NETHERITE_BOW.get(), REOItems.NETHERITE_EXCAVATOR.get(), REOItems.NETHERITE_HAMMER.get(),
                        REOItems.NETHERITE_HATCHET.get(), REOItems.NETHERITE_PAXEL.get(), REOItems.NETHERITE_SICKLE.get()), RecipeCategory.MISC, REOItems.NUGGET_NETHERITE.get(), 0.1F, 100)
                .unlockedBy("has_netherite_tools_and_armour", has(Items.NETHERITE_SWORD)).save(pWriter, "nugget_netherite_from_blasting");


        // SMOKER //
        // Misc
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 100)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get())).save(pWriter, "rubber_from_smoking");

        // Food
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(REOItems.FLOUR_WHEAT.get(), REOItems.FLOUR_BARLEY.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 100)
                .unlockedBy(getHasName(REOItems.FLOUR_WHEAT.get()), has(REOItems.FLOUR_WHEAT.get()))
                .unlockedBy(getHasName(REOItems.FLOUR_BARLEY.get()), has(REOItems.FLOUR_BARLEY.get())).save(pWriter, "bread_from_smoking");

        // Campfire //
        // Misc
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 600)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get())).save(pWriter, "rubber_from_campfire");

        // Food
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(REOItems.FLOUR_WHEAT.get(), REOItems.FLOUR_BARLEY.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 600)
                .unlockedBy(getHasName(REOItems.FLOUR_WHEAT.get()), has(REOItems.FLOUR_WHEAT.get()))
                .unlockedBy(getHasName(REOItems.FLOUR_BARLEY.get()), has(REOItems.FLOUR_BARLEY.get())).save(pWriter, "bread_from_campfire");

        // Modded Furnaces//
        // Eletric Furnace
        new ElectricFurnaceRecipeBuilder(Items.BAKED_POTATO, Ingredient.of(Items.POTATO), 1)
                .unlockedBy(getHasName(Items.POTATO), has(Items.POTATO)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.DRIED_KELP, Ingredient.of(Items.KELP), 1)
                .unlockedBy(getHasName(Items.KELP), has(Items.KELP)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_BEEF, Ingredient.of(Items.BEEF), 1)
                .unlockedBy(getHasName(Items.BEEF), has(Items.BEEF)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_PORKCHOP, Ingredient.of(Items.PORKCHOP), 1)
                .unlockedBy(getHasName(Items.PORKCHOP), has(Items.PORKCHOP)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_MUTTON, Ingredient.of(Items.MUTTON), 1)
                .unlockedBy(getHasName(Items.MUTTON), has(Items.MUTTON)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_CHICKEN, Ingredient.of(Items.CHICKEN), 1)
                .unlockedBy(getHasName(Items.CHICKEN), has(Items.CHICKEN)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_RABBIT, Ingredient.of(Items.RABBIT), 1)
                .unlockedBy(getHasName(Items.RABBIT), has(Items.RABBIT)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_COD, Ingredient.of(Items.COD), 1)
                .unlockedBy(getHasName(Items.COD), has(Items.COD)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COOKED_SALMON, Ingredient.of(Items.SALMON), 1)
                .unlockedBy(getHasName(Items.SALMON), has(Items.SALMON)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.NETHERITE_SCRAP, Ingredient.of(Blocks.ANCIENT_DEBRIS), 1)
                .unlockedBy(getHasName(Blocks.ANCIENT_DEBRIS), has(Blocks.ANCIENT_DEBRIS)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(Items.REDSTONE, Ingredient.of(Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE,
                REOBlocks.GRAVEL_ORE_REDSTONE.get(), REOBlocks.NETHER_REDSTONE.get()), 1)
                .unlockedBy("has_redstone_ore", has(ItemTags.REDSTONE_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COAL, Ingredient.of(Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE,
                REOBlocks.GRAVEL_ORE_COAL.get(), REOBlocks.NETHER_COAL.get(), REOItems.DUST_COAL.get()), 1)
                .unlockedBy("has_coal_ore", has(ItemTags.COAL_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.EMERALD, Ingredient.of(Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
                REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(), REOItems.DUST_EMERALD.get(), REOItems.DIRTY_EMERALD.get()), 1)
                .unlockedBy("has_emerald_ore", has(ItemTags.EMERALD_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.LAPIS_LAZULI, Ingredient.of(Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE,
                REOBlocks.GRAVEL_ORE_LAPIS.get(), REOBlocks.NETHER_LAPIS.get()), 1)
                .unlockedBy("has_lapis_ore", has(ItemTags.LAPIS_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.DIAMOND, Ingredient.of(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE,
                REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(), REOItems.DUST_DIAMOND.get(), REOItems.DIRTY_DIAMOND.get()), 1)
                .unlockedBy("has_diamond_ore", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.QUARTZ, Ingredient.of(Blocks.NETHER_QUARTZ_ORE), 1)
                .unlockedBy("has_nether_quartz_ore", has(Blocks.NETHER_QUARTZ_ORE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.IRON_INGOT, Ingredient.of(Items.RAW_IRON, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE,
                REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(), REOItems.DUST_IRON.get(), REOItems.DIRTY_IRON.get()), 1)
                .unlockedBy("has_iron_ore", has(ItemTags.IRON_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COPPER_INGOT, Ingredient.of(Items.RAW_COPPER, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE,
                REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(), REOItems.DUST_COPPER.get(), REOItems.DIRTY_COPPER.get()), 1)
                .unlockedBy("has_copper_ore", has(ItemTags.COPPER_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.GOLD_INGOT, Ingredient.of(Items.RAW_GOLD, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE,
                Blocks.NETHER_GOLD_ORE, REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.DUST_GOLD.get(), REOItems.DIRTY_GOLD.get()), 1)
                .unlockedBy("has_gold_ore", has(ItemTags.GOLD_ORES)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_ALUMINIUM.get(), Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(),
                REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOBlocks.NETHER_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), REOItems.DIRTY_ALUMINIUM.get()), 1)
                .unlockedBy("has_aluminium_ore", has(REOTags.Items.ALUMINIUM_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_LEAD.get(), Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(),
                REOBlocks.GRAVEL_ORE_LEAD.get(), REOBlocks.NETHER_LEAD.get(), REOItems.DUST_LEAD.get(), REOItems.DIRTY_LEAD.get()), 1)
                .unlockedBy("has_lead_ore", has(REOTags.Items.LEAD_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_NICKEL.get(), Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(),
                REOBlocks.GRAVEL_ORE_NICKEL.get(), REOBlocks.NETHER_NICKEL.get(), REOItems.DUST_NICKEL.get(), REOItems.DIRTY_NICKEL.get()), 1)
                .unlockedBy("has_nickel_ore", has(REOTags.Items.NICKEL_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_PLATINUM.get(), Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(),
                REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOBlocks.NETHER_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), REOItems.DIRTY_PLATINUM.get()), 1)
                .unlockedBy("has_platinum_ore", has(REOTags.Items.PLATINUM_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_SILVER.get(), Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(),
                REOBlocks.GRAVEL_ORE_SILVER.get(), REOBlocks.NETHER_SILVER.get(), REOItems.DUST_SILVER.get(), REOItems.DIRTY_SILVER.get()), 1)
                .unlockedBy("has_silver_ore", has(REOTags.Items.SILVER_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_TIN.get(), Ingredient.of(REOBlocks.ORE_TIN.get(),
                REOBlocks.GRAVEL_ORE_TIN.get(), REOBlocks.NETHER_TIN.get(), REOItems.DUST_TIN.get(), REOItems.DIRTY_TIN.get()), 1)
                .unlockedBy("has_tin_ore", has(REOTags.Items.TIN_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_URANIUM.get(), Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(),
                REOBlocks.GRAVEL_ORE_URANIUM.get(), REOBlocks.NETHER_URANIUM.get(), REOItems.DUST_URANIUM.get(), REOItems.DIRTY_URANIUM.get()), 1)
                .unlockedBy("has_uranium_ore", has(REOTags.Items.URANIUM_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.INGOT_ZINC.get(), Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(),
                REOBlocks.GRAVEL_ORE_ZINC.get(), REOBlocks.NETHER_ZINC.get(), REOItems.DUST_ZINC.get(), REOItems.DIRTY_ZINC.get()), 1)
                .unlockedBy("has_zinc_ore", has(REOTags.Items.ZINC_ORES)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.GEM_AMETHYST.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER, Items.AMETHYST_SHARD,
                REOItems.DUST_AMETHYST.get(), REOItems.DIRTY_AMETHYST.get()), 1)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.GEM_PERIDOT.get(), Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.SHARD_PERIDOT.get(),
                REOItems.DUST_PERIDOT.get(), REOItems.DIRTY_PERIDOT.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.GEM_RUBY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.SHARD_RUBY.get(),
                REOItems.DUST_RUBY.get(), REOItems.DIRTY_RUBY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.GEM_SAPPHIRE.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.SHARD_SAPPHIRE.get(),
                REOItems.DUST_SAPPHIRE.get(), REOItems.DIRTY_SAPPHIRE.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.IRON_NUGGET, Ingredient.of(REOTags.Items.IRON_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_iron_tools_and_armor", has(REOTags.Items.IRON_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.GOLD_NUGGET, Ingredient.of(REOTags.Items.GOLD_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_gold_tools_and_armor", has(REOTags.Items.GOLD_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_DIAMOND.get(), Ingredient.of(REOTags.Items.DIAMOND_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_diamond_tools_and_armor", has(REOTags.Items.DIAMOND_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_NETHERITE.get(), Ingredient.of(REOTags.Items.NETHERITE_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_netherite_tools_and_armor", has(REOTags.Items.NETHERITE_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_ALUMINIUM.get(), Ingredient.of(REOTags.Items.ALUMINIUM_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.ALUMINIUM_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_AMETHYST.get(), Ingredient.of(REOTags.Items.AMETHYST_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.AMETHYST_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_BRONZE.get(), Ingredient.of(REOTags.Items.BRONZE_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.BRONZE_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_ENDERITE.get(), Ingredient.of(REOTags.Items.ENDERITE_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.ENDERITE_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_PERIDOT.get(), Ingredient.of(REOTags.Items.PERIDOT_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.PERIDOT_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_PLATINUM.get(), Ingredient.of(REOTags.Items.PLATINUM_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.PLATINUM_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_RUBY.get(), Ingredient.of(REOTags.Items.RUBY_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.RUBY_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_SAPPHIRE.get(), Ingredient.of(REOTags.Items.SAPPHIRE_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.SAPPHIRE_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_SILVER.get(), Ingredient.of(REOTags.Items.SILVER_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.SILVER_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NUGGET_STEEL.get(), Ingredient.of(REOTags.Items.STEEL_TOOLS_AND_ARMOR), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.STEEL_TOOLS_AND_ARMOR)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Blocks.STONE, Ingredient.of(Blocks.COBBLESTONE), 1)
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SMOOTH_STONE, Ingredient.of(Blocks.STONE), 1)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CRACKED_STONE_BRICKS, Ingredient.of(Blocks.STONE_BRICKS), 1)
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Blocks.STONE_BRICKS)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.DEEPSLATE, Ingredient.of(Blocks.COBBLED_DEEPSLATE), 1)
                .unlockedBy(getHasName(Blocks.COBBLED_DEEPSLATE), has(Blocks.COBBLED_DEEPSLATE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CRACKED_DEEPSLATE_BRICKS, Ingredient.of(Blocks.DEEPSLATE_BRICKS), 1)
                .unlockedBy(getHasName(Blocks.DEEPSLATE_BRICKS), has(Blocks.DEEPSLATE_BRICKS)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CRACKED_DEEPSLATE_TILES, Ingredient.of(Blocks.DEEPSLATE_TILES), 1)
                .unlockedBy(getHasName(Blocks.DEEPSLATE_TILES), has(Blocks.DEEPSLATE_TILES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SMOOTH_SANDSTONE, Ingredient.of(Blocks.SANDSTONE), 1)
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SMOOTH_RED_SANDSTONE, Ingredient.of(Blocks.RED_SANDSTONE), 1)
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CRACKED_NETHER_BRICKS, Ingredient.of(Blocks.NETHER_BRICKS), 1)
                .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SMOOTH_BASALT, Ingredient.of(Blocks.BASALT), 1)
                .unlockedBy(getHasName(Blocks.BASALT), has(Blocks.BASALT)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS),  1)
                .unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE_BRICKS)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SMOOTH_QUARTZ, Ingredient.of(Blocks.QUARTZ_BLOCK), 1)
                .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.TERRACOTTA, Ingredient.of(Blocks.CLAY), 1)
                .unlockedBy(getHasName(Blocks.CLAY), has(Blocks.CLAY)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(Blocks.WHITE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.WHITE_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.WHITE_TERRACOTTA), has(Blocks.WHITE_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.ORANGE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.ORANGE_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.ORANGE_TERRACOTTA), has(Blocks.ORANGE_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.MAGENTA_GLAZED_TERRACOTTA, Ingredient.of(Blocks.MAGENTA_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.MAGENTA_TERRACOTTA), has(Blocks.MAGENTA_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.LIGHT_BLUE_TERRACOTTA), has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.YELLOW_GLAZED_TERRACOTTA, Ingredient.of(Blocks.YELLOW_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.YELLOW_TERRACOTTA), has(Blocks.YELLOW_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.LIME_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIME_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.LIME_TERRACOTTA), has(Blocks.LIME_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.PINK_GLAZED_TERRACOTTA, Ingredient.of(Blocks.PINK_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.PINK_TERRACOTTA), has(Blocks.PINK_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.GRAY_GLAZED_TERRACOTTA, Ingredient.of(Blocks.GRAY_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.GRAY_TERRACOTTA), has(Blocks.GRAY_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.LIGHT_GRAY_TERRACOTTA), has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.CYAN_GLAZED_TERRACOTTA, Ingredient.of(Blocks.CYAN_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.CYAN_TERRACOTTA), has(Blocks.CYAN_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.PURPLE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.PURPLE_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.PURPLE_TERRACOTTA), has(Blocks.PURPLE_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.BLUE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BLUE_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.BLUE_TERRACOTTA), has(Blocks.BLUE_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.BROWN_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BROWN_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.BROWN_TERRACOTTA), has(Blocks.BROWN_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.RED_GLAZED_TERRACOTTA, Ingredient.of(Blocks.RED_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.RED_TERRACOTTA), has(Blocks.RED_TERRACOTTA)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.BLACK_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BLACK_TERRACOTTA), 1)
                .unlockedBy(getHasName(Blocks.BLACK_TERRACOTTA), has(Blocks.BLACK_TERRACOTTA)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Blocks.GLASS, Ingredient.of(Blocks.SAND), 1)
                .unlockedBy(getHasName(Blocks.SAND), has(Blocks.SAND)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Blocks.SPONGE, Ingredient.of(Blocks.WET_SPONGE), 1)
                .unlockedBy(getHasName(Blocks.WET_SPONGE), has(Blocks.WET_SPONGE)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.CHARCOAL, Ingredient.of(ItemTags.LOGS_THAT_BURN), 1)
                .unlockedBy("has_oak_log", has(ItemTags.LOGS_THAT_BURN)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.POPPED_CHORUS_FRUIT, Ingredient.of(Items.CHORUS_FRUIT), 1)
                .unlockedBy(getHasName(Items.CHORUS_FRUIT), has(Items.CHORUS_FRUIT)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.LIME_DYE, Ingredient.of(Blocks.SEA_PICKLE), 1)
                .unlockedBy(getHasName(Blocks.SEA_PICKLE), has(Blocks.SEA_PICKLE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.GREEN_DYE, Ingredient.of(Blocks.CACTUS), 1)
                .unlockedBy(getHasName(Blocks.CACTUS), has(Blocks.CACTUS)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.BRICK, Ingredient.of(Items.CLAY_BALL), 1)
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.NETHER_BRICK, Ingredient.of(Blocks.NETHERRACK), 1)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK)).save(pWriter);

        // Kiln //
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE.get(), Ingredient.of(REOBlocks.MARBLE_COBBLE.get()), 0.1f, 100)
                .unlockedBy(getHasName(REOBlocks.MARBLE_COBBLE.get()), has(REOBlocks.MARBLE_COBBLE.get())).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_BRICK_CRACKED.get(), Ingredient.of(REOBlocks.MARBLE_BRICK.get()), 0.1f, 100)
                .unlockedBy(getHasName(REOBlocks.MARBLE_BRICK.get()), has(REOBlocks.MARBLE_BRICK.get())).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE.get(), Ingredient.of(REOBlocks.LIMESTONE_COBBLE.get()), 0.1f, 100)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE_COBBLE.get()), has(REOBlocks.LIMESTONE_COBBLE.get())).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_BRICK_CRACKED.get(), Ingredient.of(REOBlocks.LIMESTONE_BRICK.get()), 0.1f, 100)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE_BRICK.get()), has(REOBlocks.LIMESTONE_BRICK.get())).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.STONE, Ingredient.of(Blocks.COBBLESTONE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_STONE, Ingredient.of(Blocks.STONE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.STONE), has(Blocks.STONE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_STONE_BRICKS, Ingredient.of(Blocks.STONE_BRICKS), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.STONE_BRICKS), has(Blocks.STONE_BRICKS)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.DEEPSLATE, Ingredient.of(Blocks.COBBLED_DEEPSLATE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.COBBLED_DEEPSLATE), has(Blocks.COBBLED_DEEPSLATE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS, Ingredient.of(Blocks.DEEPSLATE_BRICKS), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.DEEPSLATE_BRICKS), has(Blocks.DEEPSLATE_BRICKS)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES, Ingredient.of(Blocks.DEEPSLATE_TILES), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.DEEPSLATE_TILES), has(Blocks.DEEPSLATE_TILES)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE, Ingredient.of(Blocks.SANDSTONE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE, Ingredient.of(Blocks.RED_SANDSTONE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_NETHER_BRICKS, Ingredient.of(Blocks.NETHER_BRICKS), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.NETHER_BRICKS), has(Blocks.NETHER_BRICKS)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_BASALT, Ingredient.of(Blocks.BASALT), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.BASALT), has(Blocks.BASALT)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, Ingredient.of(Blocks.POLISHED_BLACKSTONE_BRICKS), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.POLISHED_BLACKSTONE_BRICKS), has(Blocks.POLISHED_BLACKSTONE_BRICKS)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SMOOTH_QUARTZ, Ingredient.of(Blocks.QUARTZ_BLOCK), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.QUARTZ_BLOCK), has(Blocks.QUARTZ_BLOCK)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.TERRACOTTA, Ingredient.of(Blocks.CLAY), 0.35f, 100)
                .unlockedBy(getHasName(Blocks.CLAY), has(Blocks.CLAY)).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.WHITE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.WHITE_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.WHITE_TERRACOTTA), has(Blocks.WHITE_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.ORANGE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.ORANGE_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.ORANGE_TERRACOTTA), has(Blocks.ORANGE_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.MAGENTA_GLAZED_TERRACOTTA, Ingredient.of(Blocks.MAGENTA_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.MAGENTA_TERRACOTTA), has(Blocks.MAGENTA_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIGHT_BLUE_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.LIGHT_BLUE_TERRACOTTA), has(Blocks.LIGHT_BLUE_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.YELLOW_GLAZED_TERRACOTTA, Ingredient.of(Blocks.YELLOW_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.YELLOW_TERRACOTTA), has(Blocks.YELLOW_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.LIME_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIME_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.LIME_TERRACOTTA), has(Blocks.LIME_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.PINK_GLAZED_TERRACOTTA, Ingredient.of(Blocks.PINK_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.PINK_TERRACOTTA), has(Blocks.PINK_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.GRAY_GLAZED_TERRACOTTA, Ingredient.of(Blocks.GRAY_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.GRAY_TERRACOTTA), has(Blocks.GRAY_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA, Ingredient.of(Blocks.LIGHT_GRAY_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.LIGHT_GRAY_TERRACOTTA), has(Blocks.LIGHT_GRAY_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.CYAN_GLAZED_TERRACOTTA, Ingredient.of(Blocks.CYAN_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.CYAN_TERRACOTTA), has(Blocks.CYAN_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.PURPLE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.PURPLE_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.PURPLE_TERRACOTTA), has(Blocks.PURPLE_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.BLUE_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BLUE_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.BLUE_TERRACOTTA), has(Blocks.BLUE_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.BROWN_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BROWN_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.BROWN_TERRACOTTA), has(Blocks.BROWN_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.GREEN_GLAZED_TERRACOTTA, Ingredient.of(Blocks.GREEN_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.GREEN_TERRACOTTA), has(Blocks.GREEN_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.RED_GLAZED_TERRACOTTA, Ingredient.of(Blocks.RED_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.RED_TERRACOTTA), has(Blocks.RED_TERRACOTTA)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.BLACK_GLAZED_TERRACOTTA, Ingredient.of(Blocks.BLACK_TERRACOTTA), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.BLACK_TERRACOTTA), has(Blocks.BLACK_TERRACOTTA)).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS, Ingredient.of(Blocks.SAND), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.SAND), has(Blocks.SAND)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Blocks.SPONGE, Ingredient.of(Blocks.WET_SPONGE), 0.15f, 100)
                .unlockedBy(getHasName(Blocks.WET_SPONGE), has(Blocks.WET_SPONGE)).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.MISC, Items.CHARCOAL, Ingredient.of(ItemTags.LOGS_THAT_BURN), 0.15f, 100)
                .unlockedBy("has_log_or_wood", has(ItemTags.LOGS_THAT_BURN)).save(pWriter);

        new KilnRecipeBuilder(RecipeCategory.FOOD, Items.POPPED_CHORUS_FRUIT, Ingredient.of(Items.CHORUS_FRUIT), 0.1f, 100)
                .unlockedBy(getHasName(Items.CHORUS_FRUIT), has(Items.CHORUS_FRUIT)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.DECORATIONS, Items.LIME_DYE, Ingredient.of(Blocks.SEA_PICKLE), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.SEA_PICKLE), has(Blocks.SEA_PICKLE)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.DECORATIONS, Items.GREEN_DYE, Ingredient.of(Blocks.CACTUS), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.CACTUS), has(Blocks.CACTUS)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Items.BRICK, Ingredient.of(Items.CLAY_BALL), 0.3f, 100)
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL)).save(pWriter);
        new KilnRecipeBuilder(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_BRICK, Ingredient.of(Blocks.NETHERRACK), 0.1f, 100)
                .unlockedBy(getHasName(Blocks.NETHERRACK), has(Blocks.NETHERRACK)).save(pWriter);

        // Coal Crusher //
        // Ores
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_ALUMINIUM.get(), Ingredient.of(REOTags.Items.ALUMINIUM_ORES),
                0.5F, 200).unlockedBy("has_ore_aluminium", has(REOTags.Items.ALUMINIUM_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_AMETHYST.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER),
                0.5F, 200).unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DUST_COAL.get(), Ingredient.of(ItemTags.COAL_ORES),
                0.5F, 200).unlockedBy("has_ore_coal", has(ItemTags.COAL_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_COPPER.get(), Ingredient.of(ItemTags.COPPER_ORES),
                0.5F, 200).unlockedBy("has_ore_copper", has(ItemTags.COPPER_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_DIAMOND.get(), Ingredient.of(ItemTags.DIAMOND_ORES),
                0.5F, 200).unlockedBy("has_ore_diamond", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_EMERALD.get(), Ingredient.of(ItemTags.EMERALD_ORES),
                0.5F, 200).unlockedBy("has_ore_emerald", has(ItemTags.EMERALD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_ENDERITE.get(), Ingredient.of(REOBlocks.ORE_ENDERITE.get()),
                0.5F, 200).unlockedBy("has_ore_enderite", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_GOLD.get(), Ingredient.of(ItemTags.GOLD_ORES),
                0.5F, 200).unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_IRON.get(), Ingredient.of(ItemTags.IRON_ORES),
                0.5F, 200).unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_LEAD.get(), Ingredient.of(REOTags.Items.LEAD_ORES),
                0.5F, 200).unlockedBy("has_ore_lead", has(REOTags.Items.LEAD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_NICKEL.get(), Ingredient.of(REOTags.Items.NICKEL_ORES),
                0.5F, 200).unlockedBy("has_ore_nickel", has(REOTags.Items.NICKEL_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_PERIDOT.get(),Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_PLATINUM.get(), Ingredient.of(REOTags.Items.PLATINUM_ORES),
                0.5F, 200).unlockedBy("has_ore_platinum", has(REOTags.Items.PLATINUM_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_RUBY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_SAPPHIRE.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_SILVER.get(), Ingredient.of(REOTags.Items.SILVER_ORES),
                0.5F, 200).unlockedBy("has_ore_silver", has(REOTags.Items.SILVER_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_TIN.get(), Ingredient.of(REOTags.Items.TIN_ORES),
                0.5F, 200).unlockedBy("has_ore_tin", has(REOTags.Items.TIN_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_URANIUM.get(), Ingredient.of(REOTags.Items.URANIUM_ORES),
                0.5F, 200).unlockedBy("has_ore_uranium", has(REOTags.Items.URANIUM_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_ZINC.get(), Ingredient.of(REOTags.Items.ZINC_ORES),
                0.5F, 200).unlockedBy("has_ore_zinc", has(REOTags.Items.ZINC_ORES)).save(pWriter);


        // Misc
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DUST_CHARCOAL.get(), Ingredient.of(Items.CHARCOAL),
                0.3F, 200).unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL)).save(pWriter);
        BasicCrusherRecipeBuilder.named(RecipeCategory.MISC, REOItems.DUST_COAL.get(), Ingredient.of(Items.COAL),
                0.5F, 200, "_coal").unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIRTY_OBSIDIAN.get(), Ingredient.of(Blocks.OBSIDIAN),
                0.5F, 200).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Blocks.GRAVEL, Ingredient.of(Blocks.COBBLESTONE),
                0.3F, 200).unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        BasicCrusherRecipeBuilder.named(RecipeCategory.BUILDING_BLOCKS, Blocks.SAND, Ingredient.of(Blocks.SANDSTONE),
                0.1F, 200, "_sandstone").unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Blocks.RED_SAND, Ingredient.of(Blocks.RED_SANDSTONE),
                0.1F, 200).unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Items.GLOWSTONE_DUST, Ingredient.of(Blocks.GLOWSTONE),
                0.1F, 200).unlockedBy(getHasName(Blocks.GLOWSTONE), has(Blocks.GLOWSTONE)).save(pWriter);

        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Items.STRING, Ingredient.of(ItemTags.WOOL),
                0.1F, 200).unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Items.SNOWBALL, Ingredient.of(Blocks.SNOW_BLOCK),
                0.1F, 200).unlockedBy(getHasName(Blocks.SNOW_BLOCK), has(Blocks.SNOW_BLOCK)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Items.BONE_MEAL, Ingredient.of(Blocks.BONE_BLOCK),
                0.3F, 200).unlockedBy(getHasName(Blocks.BONE_BLOCK), has(Blocks.BONE_BLOCK)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Items.BLAZE_POWDER, Ingredient.of(Items.BLAZE_ROD),
                0.5F, 200).unlockedBy(getHasName(Items.BLAZE_ROD), has(Items.BLAZE_ROD)).save(pWriter);

        // Crusher //
        // Ores
        CrusherRecipeBuilder.generic(REOItems.DIRTY_ALUMINIUM.get(), Ingredient.of(REOTags.Items.ALUMINIUM_ORES), 2)
                .unlockedBy("has_ore_aluminium", has(REOTags.Items.ALUMINIUM_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_AMETHYST.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER), 2)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DUST_COAL.get(), Ingredient.of(ItemTags.COAL_ORES), 2)
                .unlockedBy("has_ore_coal", has(ItemTags.COAL_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_COPPER.get(), Ingredient.of(ItemTags.COPPER_ORES), 2)
                .unlockedBy("has_ore_copper", has(ItemTags.COPPER_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_DIAMOND.get(), Ingredient.of(ItemTags.DIAMOND_ORES), 2)
                .unlockedBy("has_ore_diamond", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_EMERALD.get(), Ingredient.of(ItemTags.EMERALD_ORES), 2)
                .unlockedBy("has_ore_emerald", has(ItemTags.EMERALD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_ENDERITE.get(), Ingredient.of(REOBlocks.ORE_ENDERITE.get()), 2)
                .unlockedBy("has_ore_enderite", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_GOLD.get(), Ingredient.of(ItemTags.GOLD_ORES), 2)
                .unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_IRON.get(), Ingredient.of(ItemTags.IRON_ORES), 2)
                .unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_LEAD.get(), Ingredient.of(REOTags.Items.LEAD_ORES), 2)
                .unlockedBy("has_ore_lead", has(REOTags.Items.LEAD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_NICKEL.get(), Ingredient.of(REOTags.Items.NICKEL_ORES), 2)
                .unlockedBy("has_ore_nickel", has(REOTags.Items.NICKEL_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_PERIDOT.get(),Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_PLATINUM.get(), Ingredient.of(REOTags.Items.PLATINUM_ORES), 2)
                .unlockedBy("has_ore_platinum", has(REOTags.Items.PLATINUM_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_RUBY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_SAPPHIRE.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_SILVER.get(), Ingredient.of(REOTags.Items.SILVER_ORES), 2)
                .unlockedBy("has_ore_silver", has(REOTags.Items.SILVER_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_TIN.get(), Ingredient.of(REOTags.Items.TIN_ORES), 2)
                .unlockedBy("has_ore_tin", has(REOTags.Items.TIN_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_URANIUM.get(), Ingredient.of(REOTags.Items.URANIUM_ORES), 2)
                .unlockedBy("has_ore_uranium", has(REOTags.Items.URANIUM_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_ZINC.get(), Ingredient.of(REOTags.Items.ZINC_ORES), 2)
                .unlockedBy("has_ore_zinc", has(REOTags.Items.ZINC_ORES)).save(pWriter);


        // Misc
        CrusherRecipeBuilder.generic(REOItems.DUST_CHARCOAL.get(), Ingredient.of(Items.CHARCOAL), 1)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIRTY_OBSIDIAN.get(), Ingredient.of(Blocks.OBSIDIAN), 2)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        CrusherRecipeBuilder.generic(Blocks.GRAVEL, Ingredient.of(Blocks.COBBLESTONE), 1)
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        CrusherRecipeBuilder.generic(Blocks.SAND, Ingredient.of(Blocks.GRAVEL), 1)
                .unlockedBy(getHasName(Blocks.GRAVEL), has(Blocks.GRAVEL)).save(pWriter);
        CrusherRecipeBuilder.named(Blocks.SAND, Ingredient.of(Blocks.GRAVEL), 1, "_sandstone")
                .unlockedBy(getHasName(Blocks.GRAVEL), has(Blocks.GRAVEL)).save(pWriter);
        CrusherRecipeBuilder.generic(Blocks.RED_SAND, Ingredient.of(Blocks.RED_SANDSTONE), 4)
                .unlockedBy(getHasName(Blocks.RED_SANDSTONE), has(Blocks.RED_SANDSTONE)).save(pWriter);
        CrusherRecipeBuilder.generic(Items.GLOWSTONE_DUST, Ingredient.of(Blocks.GLOWSTONE), 4)
                .unlockedBy(getHasName(Blocks.GLOWSTONE), has(Blocks.GLOWSTONE)).save(pWriter);

        CrusherRecipeBuilder.generic(Items.STRING, Ingredient.of(ItemTags.WOOL), 4)
                .unlockedBy("has_wool", has(ItemTags.WOOL)).save(pWriter);

        CrusherRecipeBuilder.generic(Items.SNOWBALL, Ingredient.of(Blocks.SNOW_BLOCK),4)
                .unlockedBy(getHasName(Blocks.SNOW_BLOCK), has(Blocks.SNOW_BLOCK)).save(pWriter);
        CrusherRecipeBuilder.generic(Items.BONE_MEAL, Ingredient.of(Blocks.BONE_BLOCK),6)
                .unlockedBy(getHasName(Blocks.BONE_BLOCK), has(Blocks.BONE_BLOCK)).save(pWriter);
        CrusherRecipeBuilder.generic(Items.BLAZE_POWDER, Ingredient.of(Items.BLAZE_ROD), 4)
                .unlockedBy(getHasName(Items.BLAZE_ROD), has(Items.BLAZE_ROD)).save(pWriter);

        // Ingots
        CrusherRecipeBuilder.named(REOItems.DIRTY_ALUMINIUM.get(), Ingredient.of(REOItems.INGOT_ALUMINIUM.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_ALUMINIUM.get()), has(REOItems.INGOT_ALUMINIUM.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_AMETHYST.get(), Ingredient.of(REOItems.GEM_AMETHYST.get()), 1, "_gem")
                .unlockedBy(getHasName(REOItems.GEM_AMETHYST.get()), has(REOItems.GEM_AMETHYST.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DUST_COAL.get(), Ingredient.of(Items.COAL), 1, "_coal")
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_COPPER.get(), Ingredient.of(Items.COPPER_INGOT), 1, "_ingot")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_DIAMOND.get(), Ingredient.of(Items.DIAMOND), 1, "_ingot")
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_EMERALD.get(), Ingredient.of(Items.EMERALD), 1, "_ingot")
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_ENDERITE.get(), Ingredient.of(REOItems.INGOT_ENDERITE.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_ENDERITE.get()), has(REOItems.INGOT_ENDERITE.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_GOLD.get(), Ingredient.of(Items.GOLD_INGOT), 1, "_ingot")
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_IRON.get(), Ingredient.of(Items.IRON_INGOT), 1, "_ingot")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_LEAD.get(), Ingredient.of(REOItems.INGOT_LEAD.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_LEAD.get()), has(REOItems.INGOT_LEAD.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_NICKEL.get(), Ingredient.of(REOItems.INGOT_NICKEL.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_NICKEL.get()), has(REOItems.INGOT_NICKEL.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_PERIDOT.get(),Ingredient.of(REOItems.GEM_PERIDOT.get()), 1, "_gem")
                .unlockedBy(getHasName(REOItems.GEM_PERIDOT.get()), has(REOItems.GEM_PERIDOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_PLATINUM.get(), Ingredient.of(REOItems.INGOT_PLATINUM.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_PLATINUM.get()), has(REOItems.INGOT_PLATINUM.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_RUBY.get(), Ingredient.of(REOItems.GEM_RUBY.get()), 1, "_gem")
                .unlockedBy(getHasName(REOItems.GEM_RUBY.get()), has(REOItems.GEM_RUBY.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_SAPPHIRE.get(), Ingredient.of(REOItems.GEM_SAPPHIRE.get()), 1, "_gem")
                .unlockedBy(getHasName(REOItems.GEM_SAPPHIRE.get()), has(REOItems.GEM_SAPPHIRE.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_SILVER.get(), Ingredient.of(REOItems.INGOT_SILVER.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_SILVER.get()), has(REOItems.INGOT_SILVER.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_TIN.get(), Ingredient.of(REOItems.INGOT_TIN.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_TIN.get()), has(REOItems.INGOT_TIN.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_URANIUM.get(), Ingredient.of(REOItems.INGOT_URANIUM.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_URANIUM.get()), has(REOItems.INGOT_URANIUM.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIRTY_ZINC.get(), Ingredient.of(REOItems.INGOT_ZINC.get()), 1, "_ingot")
                .unlockedBy(getHasName(REOItems.INGOT_ZINC.get()), has(REOItems.INGOT_ZINC.get())).save(pWriter);

        // Alloy Furnace //
        // Dust
        new AlloyFurnaceRecipeBuilder(REOItems.DUST_BRASS.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_COPPER.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_ZINC.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.DUST_COPPER.get()), has(REOItems.DUST_COPPER.get()))
                .unlockedBy(getHasName(REOItems.DUST_ZINC.get()), has(REOItems.DUST_ZINC.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.DUST_BRONZE.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_COPPER.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_TIN.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.DUST_COPPER.get()), has(REOItems.DUST_COPPER.get()))
                .unlockedBy(getHasName(REOItems.DUST_TIN.get()), has(REOItems.DUST_TIN.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.DUST_ELECTRUM.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_GOLD.get(), 2)),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_SILVER.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.DUST_GOLD.get()), has(REOItems.DUST_GOLD.get()))
                .unlockedBy(getHasName(REOItems.DUST_SILVER.get()), has(REOItems.DUST_SILVER.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.DUST_STEEL.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_IRON.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.DUST_COAL.get(), 3)), 2)
                .unlockedBy(getHasName(REOItems.DUST_IRON.get()), has(REOItems.DUST_IRON.get()))
                .unlockedBy(getHasName(REOItems.DUST_COAL.get()), has(REOItems.DUST_COAL.get())).save(pWriter);

        // Ingot
        new AlloyFurnaceRecipeBuilder(REOItems.INGOT_BRASS.get(),
                StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_ZINC.get(), 2)), 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_ZINC.get()), has(REOItems.INGOT_ZINC.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.INGOT_BRONZE.get(),
                StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_TIN.get(), 2)), 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_TIN.get()), has(REOItems.INGOT_TIN.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.INGOT_ELECTRUM.get(),
                StrictNBTIngredient.of(new ItemStack(Items.GOLD_INGOT, 2)),
                StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_SILVER.get(), 2)), 2)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_SILVER.get()), has(REOItems.INGOT_SILVER.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.INGOT_STEEL.get(),
                StrictNBTIngredient.of(new ItemStack(Items.IRON_INGOT, 1)),
                StrictNBTIngredient.of(new ItemStack(Items.COAL, 3)), 1)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(pWriter);

        // Sawmill //
        // Vanilla Wood
        // Oak
        new SawmillRecipeBuilder(Blocks.OAK_PLANKS, Ingredient.of(ItemTags.OAK_LOGS), 6)
                .unlockedBy("has_oak_logs", has(ItemTags.OAK_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.OAK_SLAB, Ingredient.of(Blocks.OAK_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.OAK_PLANKS), has(Blocks.OAK_PLANKS)).save(pWriter);

        // Spruce
        new SawmillRecipeBuilder(Blocks.SPRUCE_PLANKS, Ingredient.of(ItemTags.SPRUCE_LOGS), 6)
                .unlockedBy("has_spruce_logs", has(ItemTags.SPRUCE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.SPRUCE_SLAB, Ingredient.of(Blocks.SPRUCE_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS), has(Blocks.SPRUCE_PLANKS)).save(pWriter);

        // Birch
        new SawmillRecipeBuilder(Blocks.BIRCH_PLANKS, Ingredient.of(ItemTags.BIRCH_LOGS), 6)
                .unlockedBy("has_birch_logs", has(ItemTags.BIRCH_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.BIRCH_SLAB, Ingredient.of(Blocks.BIRCH_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.BIRCH_PLANKS), has(Blocks.BIRCH_PLANKS)).save(pWriter);

        // Jungle
        new SawmillRecipeBuilder(Blocks.JUNGLE_PLANKS, Ingredient.of(ItemTags.JUNGLE_LOGS), 6)
                .unlockedBy("has_jungle_logs", has(ItemTags.JUNGLE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.JUNGLE_SLAB, Ingredient.of(Blocks.JUNGLE_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS), has(Blocks.JUNGLE_PLANKS)).save(pWriter);

        // Acacia
        new SawmillRecipeBuilder(Blocks.ACACIA_PLANKS, Ingredient.of(ItemTags.ACACIA_LOGS), 6)
                .unlockedBy("has_acacia_logs", has(ItemTags.ACACIA_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.ACACIA_SLAB, Ingredient.of(Blocks.ACACIA_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.ACACIA_PLANKS), has(Blocks.ACACIA_PLANKS)).save(pWriter);

        // Dark Oak
        new SawmillRecipeBuilder(Blocks.DARK_OAK_PLANKS, Ingredient.of(ItemTags.DARK_OAK_LOGS), 6)
                .unlockedBy("has_dark_oak_logs", has(ItemTags.DARK_OAK_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.DARK_OAK_SLAB, Ingredient.of(Blocks.DARK_OAK_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS), has(Blocks.DARK_OAK_PLANKS)).save(pWriter);

        // Mangrove
        new SawmillRecipeBuilder(Blocks.MANGROVE_PLANKS, Ingredient.of(ItemTags.MANGROVE_LOGS), 6)
                .unlockedBy("has_mangrove_logs", has(ItemTags.MANGROVE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.MANGROVE_SLAB, Ingredient.of(Blocks.MANGROVE_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS), has(Blocks.MANGROVE_PLANKS)).save(pWriter);

        // Cherry
        new SawmillRecipeBuilder(Blocks.CHERRY_PLANKS, Ingredient.of(ItemTags.CHERRY_LOGS), 6)
                .unlockedBy("has_cherry_logs", has(ItemTags.CHERRY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.CHERRY_SLAB, Ingredient.of(Blocks.CHERRY_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.CHERRY_PLANKS), has(Blocks.CHERRY_PLANKS)).save(pWriter);

        // Crimson
        new SawmillRecipeBuilder(Blocks.CRIMSON_PLANKS, Ingredient.of(ItemTags.CRIMSON_STEMS), 6)
                .unlockedBy("has_crimson_stems", has(ItemTags.CRIMSON_STEMS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.CRIMSON_SLAB, Ingredient.of(Blocks.CRIMSON_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS), has(Blocks.CRIMSON_PLANKS)).save(pWriter);

        // Warped
        new SawmillRecipeBuilder(Blocks.WARPED_PLANKS, Ingredient.of(ItemTags.WARPED_STEMS), 6)
                .unlockedBy("has_warped_stems", has(ItemTags.WARPED_STEMS)).save(pWriter);
        new SawmillRecipeBuilder(Blocks.WARPED_SLAB, Ingredient.of(Blocks.WARPED_PLANKS), 4)
                .unlockedBy(getHasName(Blocks.WARPED_PLANKS), has(Blocks.WARPED_PLANKS)).save(pWriter);

        // Modded Wood
        // Balsa
        new SawmillRecipeBuilder(REOBlocks.PLANKS_BALSA.get(), Ingredient.of(REOTags.Items.BALSA_LOGS), 6)
                .unlockedBy("has_balsa_logs", has(REOTags.Items.BALSA_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_BALSA.get(), Ingredient.of(REOBlocks.PLANKS_BALSA.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_BALSA.get()), has(REOBlocks.PLANKS_BALSA.get())).save(pWriter);
        // Baobab
        new SawmillRecipeBuilder(REOBlocks.PLANKS_BAOBAB.get(), Ingredient.of(REOTags.Items.BAOBAB_LOGS), 6)
                .unlockedBy("has_baobab_logs", has(REOTags.Items.BAOBAB_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_BAOBAB.get(), Ingredient.of(REOBlocks.PLANKS_BAOBAB.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_BAOBAB.get()), has(REOBlocks.PLANKS_BAOBAB.get())).save(pWriter);
        // Hill Cherry
        new SawmillRecipeBuilder(REOBlocks.PLANKS_HILL_CHERRY.get(), Ingredient.of(REOTags.Items.HILL_CHERRY_LOGS), 6)
                .unlockedBy("has_hill_cherry_logs", has(REOTags.Items.HILL_CHERRY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_HILL_CHERRY.get(), Ingredient.of(REOBlocks.PLANKS_HILL_CHERRY.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_HILL_CHERRY.get()), has(REOBlocks.PLANKS_HILL_CHERRY.get())).save(pWriter);
        // Chestnut
        new SawmillRecipeBuilder(REOBlocks.PLANKS_CHESTNUT.get(), Ingredient.of(REOTags.Items.CHESTNUT_LOGS), 6)
                .unlockedBy("has_chestnut_logs", has(REOTags.Items.CHESTNUT_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_CHESTNUT.get(), Ingredient.of(REOBlocks.PLANKS_CHESTNUT.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_CHESTNUT.get()), has(REOBlocks.PLANKS_CHESTNUT.get())).save(pWriter);
        // Citrus
        new SawmillRecipeBuilder(REOBlocks.PLANKS_CITRUS.get(), Ingredient.of(REOTags.Items.CITRUS_LOGS), 6)
                .unlockedBy("has_citrus_logs", has(REOTags.Items.CITRUS_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_CITRUS.get(), Ingredient.of(REOBlocks.PLANKS_CITRUS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_CITRUS.get()), has(REOBlocks.PLANKS_CITRUS.get())).save(pWriter);
        // Ebony
        new SawmillRecipeBuilder(REOBlocks.PLANKS_EBONY.get(), Ingredient.of(REOTags.Items.EBONY_LOGS), 6)
                .unlockedBy("has_ebony_logs", has(REOTags.Items.EBONY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_EBONY.get(), Ingredient.of(REOBlocks.PLANKS_EBONY.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_EBONY.get()), has(REOBlocks.PLANKS_EBONY.get())).save(pWriter);
        // Larch
        new SawmillRecipeBuilder(REOBlocks.PLANKS_LARCH.get(), Ingredient.of(REOTags.Items.LARCH_LOGS), 6)
                .unlockedBy("has_larch_logs", has(REOTags.Items.LARCH_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_LARCH.get(), Ingredient.of(REOBlocks.PLANKS_LARCH.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_LARCH.get()), has(REOBlocks.PLANKS_LARCH.get())).save(pWriter);
        // Mahogany
        new SawmillRecipeBuilder(REOBlocks.PLANKS_MAHOGANY.get(), Ingredient.of(REOTags.Items.MAHOGANY_LOGS), 6)
                .unlockedBy("has_mahogany_logs", has(REOTags.Items.MAHOGANY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_MAHOGANY.get(), Ingredient.of(REOBlocks.PLANKS_MAHOGANY.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_MAHOGANY.get()), has(REOBlocks.PLANKS_MAHOGANY.get())).save(pWriter);
        // Maple
        new SawmillRecipeBuilder(REOBlocks.PLANKS_MAPLE.get(), Ingredient.of(REOTags.Items.MAPLE_LOGS), 6)
                .unlockedBy("has_maple_logs", has(REOTags.Items.MAPLE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_MAPLE.get(), Ingredient.of(REOBlocks.PLANKS_MAPLE.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_MAPLE.get()), has(REOBlocks.PLANKS_MAPLE.get())).save(pWriter);
        // Palm
        new SawmillRecipeBuilder(REOBlocks.PLANKS_PALM.get(), Ingredient.of(REOTags.Items.PALM_LOGS), 6)
                .unlockedBy("has_palm_logs", has(REOTags.Items.PALM_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_PALM.get(), Ingredient.of(REOBlocks.PLANKS_PALM.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_PALM.get()), has(REOBlocks.PLANKS_PALM.get())).save(pWriter);
        // Papaya
        new SawmillRecipeBuilder(REOBlocks.PLANKS_PAPAYA.get(), Ingredient.of(REOTags.Items.PAPAYA_LOGS), 6)
                .unlockedBy("has_papaya_logs", has(REOTags.Items.PAPAYA_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_PAPAYA.get(), Ingredient.of(REOBlocks.PLANKS_PAPAYA.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_PAPAYA.get()), has(REOBlocks.PLANKS_PAPAYA.get())).save(pWriter);
        // Pine
        new SawmillRecipeBuilder(REOBlocks.PLANKS_PINE.get(), Ingredient.of(REOTags.Items.PINE_LOGS), 6)
                .unlockedBy("has_pine_logs", has(REOTags.Items.PINE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_PINE.get(), Ingredient.of(REOBlocks.PLANKS_PINE.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_PINE.get()), has(REOBlocks.PLANKS_PINE.get())).save(pWriter);
        // Plum
        new SawmillRecipeBuilder(REOBlocks.PLANKS_PLUM.get(), Ingredient.of(REOTags.Items.PLUM_LOGS), 6)
                .unlockedBy("has_plum_logs", has(REOTags.Items.PLUM_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_PLUM.get(), Ingredient.of(REOBlocks.PLANKS_PLUM.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_PLUM.get()), has(REOBlocks.PLANKS_PLUM.get())).save(pWriter);
        // Poplar
        new SawmillRecipeBuilder(REOBlocks.PLANKS_POPLAR.get(), Ingredient.of(REOTags.Items.POPLAR_LOGS), 6)
                .unlockedBy("has_poplar_logs", has(REOTags.Items.POPLAR_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_POPLAR.get(), Ingredient.of(REOBlocks.PLANKS_POPLAR.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_POPLAR.get()), has(REOBlocks.PLANKS_POPLAR.get())).save(pWriter);
        // Redwood
        new SawmillRecipeBuilder(REOBlocks.PLANKS_REDWOOD.get(), Ingredient.of(REOTags.Items.REDWOOD_LOGS), 6)
                .unlockedBy("has_redwood_logs", has(REOTags.Items.REDWOOD_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_REDWOOD.get(), Ingredient.of(REOBlocks.PLANKS_REDWOOD.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_REDWOOD.get()), has(REOBlocks.PLANKS_REDWOOD.get())).save(pWriter);
        // Rubber
        new SawmillRecipeBuilder(REOBlocks.PLANKS_RUBBER.get(), Ingredient.of(REOTags.Items.RUBBER_LOGS), 6)
                .unlockedBy("has_rubber_logs", has(REOTags.Items.RUBBER_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_RUBBER.get(), Ingredient.of(REOBlocks.PLANKS_RUBBER.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_RUBBER.get()), has(REOBlocks.PLANKS_RUBBER.get())).save(pWriter);
        // Teak
        new SawmillRecipeBuilder(REOBlocks.PLANKS_TEAK.get(), Ingredient.of(REOTags.Items.TEAK_LOGS), 6)
                .unlockedBy("has_teak_logs", has(REOTags.Items.TEAK_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_TEAK.get(), Ingredient.of(REOBlocks.PLANKS_TEAK.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_TEAK.get()), has(REOBlocks.PLANKS_TEAK.get())).save(pWriter);
        // Walnut
        new SawmillRecipeBuilder(REOBlocks.PLANKS_WALNUT.get(), Ingredient.of(REOTags.Items.WALNUT_LOGS), 6)
                .unlockedBy("has_walnut_logs", has(REOTags.Items.WALNUT_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_WALNUT.get(), Ingredient.of(REOBlocks.PLANKS_WALNUT.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_WALNUT.get()), has(REOBlocks.PLANKS_WALNUT.get())).save(pWriter);
        // Willow
        new SawmillRecipeBuilder(REOBlocks.PLANKS_WILLOW.get(), Ingredient.of(REOTags.Items.WILLOW_LOGS), 6)
                .unlockedBy("has_willow_logs", has(REOTags.Items.WILLOW_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.SLAB_WILLOW.get(), Ingredient.of(REOBlocks.PLANKS_WILLOW.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLANKS_WILLOW.get()), has(REOBlocks.PLANKS_WILLOW.get())).save(pWriter);


        // Compressor //
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_ALUMINIUM.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_ALUMINIUM.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_ALUMINIUM.get()), has(REOItems.INGOT_ALUMINIUM.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_AMETHYST.get(), StrictNBTIngredient.of(new ItemStack(REOItems.GEM_AMETHYST.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.GEM_AMETHYST.get()), has(REOItems.GEM_AMETHYST.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_BRASS.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_BRASS.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_BRASS.get()), has(REOItems.INGOT_BRASS.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_BRONZE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_BRONZE.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_BRONZE.get()), has(REOItems.INGOT_BRONZE.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_COPPER.get(), StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_DIAMOND.get(), StrictNBTIngredient.of(new ItemStack(Items.DIAMOND, 3)) , 1)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_ELECTRUM.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_ELECTRUM.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_ELECTRUM.get()), has(REOItems.INGOT_ELECTRUM.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_EMERALD.get(), StrictNBTIngredient.of(new ItemStack(Items.EMERALD, 3)) , 1)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_ENDERITE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_ENDERITE.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_ENDERITE.get()), has(REOItems.INGOT_ENDERITE.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_GOLDEN.get(), StrictNBTIngredient.of(new ItemStack(Items.GOLD_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_IRON.get(), StrictNBTIngredient.of(new ItemStack(Items.IRON_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_LEAD.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_LEAD.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_LEAD.get()), has(REOItems.INGOT_LEAD.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_NICKEL.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_NICKEL.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_NICKEL.get()), has(REOItems.INGOT_NICKEL.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_PERIDOT.get(), StrictNBTIngredient.of(new ItemStack(REOItems.GEM_PERIDOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.GEM_PERIDOT.get()), has(REOItems.GEM_PERIDOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_PLATINUM.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_PLATINUM.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_PLATINUM.get()), has(REOItems.INGOT_PLATINUM.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_RUBY.get(), StrictNBTIngredient.of(new ItemStack(REOItems.GEM_RUBY.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.GEM_RUBY.get()), has(REOItems.GEM_RUBY.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_SAPPHIRE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.GEM_SAPPHIRE.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.GEM_SAPPHIRE.get()), has(REOItems.GEM_SAPPHIRE.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_SILVER.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_SILVER.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_SILVER.get()), has(REOItems.INGOT_SILVER.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_STEEL.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_STEEL.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_STEEL.get()), has(REOItems.INGOT_STEEL.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_TIN.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_TIN.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_TIN.get()), has(REOItems.INGOT_TIN.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATE_ZINC.get(), StrictNBTIngredient.of(new ItemStack(REOItems.INGOT_ZINC.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.INGOT_ZINC.get()), has(REOItems.INGOT_ZINC.get())).save(pWriter);

        // Extractor //
        // Coal Extractor
        new BasicExtractorRecipeBuilder(RecipeCategory.MISC, REOItems.RUBBER.get(), Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()), 0.7f, 400)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get())).save(pWriter);

        new BasicExtractorRecipeBuilder(RecipeCategory.MISC, REOItems.SAP.get(), Ingredient.of(ItemTags.LOGS_THAT_BURN), 0.3f, 400)
                .unlockedBy("has_log_or_wood", has(ItemTags.LOGS_THAT_BURN)).save(pWriter);


        // Electric Extractor
        new ExtractorRecipeBuilder(REOItems.RUBBER.get(), Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()), 2)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get())).save(pWriter);

        new ExtractorRecipeBuilder(REOItems.SAP.get(), Ingredient.of(ItemTags.LOGS_THAT_BURN), 1)
                .unlockedBy("has_log_or_wood", has(ItemTags.LOGS_THAT_BURN)).save(pWriter);

        // Coal Purifier //
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_ALUMINIUM.get(), Ingredient.of(REOItems.DIRTY_ALUMINIUM.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_ALUMINIUM.get()), has(REOItems.DIRTY_ALUMINIUM.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_AMETHYST.get(), Ingredient.of(REOItems.DIRTY_AMETHYST.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_AMETHYST.get()), has(REOItems.DIRTY_AMETHYST.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_BRASS.get(), Ingredient.of(REOItems.DIRTY_BRASS.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_BRASS.get()), has(REOItems.DIRTY_BRASS.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_BRONZE.get(), Ingredient.of(REOItems.DIRTY_BRONZE.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_BRONZE.get()), has(REOItems.DIRTY_BRONZE.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_COPPER.get(), Ingredient.of(REOItems.DIRTY_COPPER.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_COPPER.get()), has(REOItems.DIRTY_COPPER.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_DIAMOND.get(), Ingredient.of(REOItems.DIRTY_DIAMOND.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_DIAMOND.get()), has(REOItems.DIRTY_DIAMOND.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_ELECTRUM.get(), Ingredient.of(REOItems.DIRTY_ELECTRUM.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_ELECTRUM.get()), has(REOItems.DIRTY_ELECTRUM.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_EMERALD.get(), Ingredient.of(REOItems.DIRTY_EMERALD.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_EMERALD.get()), has(REOItems.DIRTY_EMERALD.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_ENDERITE.get(), Ingredient.of(REOItems.DIRTY_ENDERITE.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_ENDERITE.get()), has(REOItems.DIRTY_ENDERITE.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_GOLD.get(), Ingredient.of(REOItems.DIRTY_GOLD.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_GOLD.get()), has(REOItems.DIRTY_GOLD.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_IRON.get(), Ingredient.of(REOItems.DIRTY_IRON.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_IRON.get()), has(REOItems.DIRTY_IRON.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_LEAD.get(), Ingredient.of(REOItems.DIRTY_LEAD.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_LEAD.get()), has(REOItems.DIRTY_LEAD.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_NICKEL.get(), Ingredient.of(REOItems.DIRTY_NICKEL.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_NICKEL.get()), has(REOItems.DIRTY_NICKEL.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_OBSIDIAN.get(), Ingredient.of(REOItems.DIRTY_OBSIDIAN.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_OBSIDIAN.get()), has(REOItems.DIRTY_OBSIDIAN.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_PERIDOT.get(), Ingredient.of(REOItems.DIRTY_PERIDOT.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_PERIDOT.get()), has(REOItems.DIRTY_PERIDOT.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_PLATINUM.get(), Ingredient.of(REOItems.DIRTY_PLATINUM.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_PLATINUM.get()), has(REOItems.DIRTY_PLATINUM.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_RUBY.get(), Ingredient.of(REOItems.DIRTY_RUBY.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_RUBY.get()), has(REOItems.DIRTY_RUBY.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_SAPPHIRE.get(), Ingredient.of(REOItems.DIRTY_SAPPHIRE.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_SAPPHIRE.get()), has(REOItems.DIRTY_SAPPHIRE.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_SILVER.get(), Ingredient.of(REOItems.DIRTY_SILVER.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_SILVER.get()), has(REOItems.DIRTY_SILVER.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_STEEL.get(), Ingredient.of(REOItems.DIRTY_STEEL.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_STEEL.get()), has(REOItems.DIRTY_STEEL.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_TIN.get(), Ingredient.of(REOItems.DIRTY_TIN.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_TIN.get()), has(REOItems.DIRTY_TIN.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_URANIUM.get(), Ingredient.of(REOItems.DIRTY_URANIUM.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_URANIUM.get()), has(REOItems.DIRTY_URANIUM.get())).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DUST_ZINC.get(), Ingredient.of(REOItems.DIRTY_ZINC.get()), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIRTY_ZINC.get()), has(REOItems.DIRTY_ZINC.get())).save(pWriter);

        // Purifier //
        PurifierRecipeBuilder.generic(REOItems.DUST_ALUMINIUM.get(), Ingredient.of(REOItems.DIRTY_ALUMINIUM.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_ALUMINIUM.get()), has(REOItems.DIRTY_ALUMINIUM.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_AMETHYST.get(), Ingredient.of(REOItems.DIRTY_AMETHYST.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_AMETHYST.get()), has(REOItems.DIRTY_AMETHYST.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_BRASS.get(), Ingredient.of(REOItems.DIRTY_BRASS.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_BRASS.get()), has(REOItems.DIRTY_BRASS.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_BRONZE.get(), Ingredient.of(REOItems.DIRTY_BRONZE.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_BRONZE.get()), has(REOItems.DIRTY_BRONZE.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_COPPER.get(), Ingredient.of(REOItems.DIRTY_COPPER.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_COPPER.get()), has(REOItems.DIRTY_COPPER.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_DIAMOND.get(), Ingredient.of(REOItems.DIRTY_DIAMOND.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_DIAMOND.get()), has(REOItems.DIRTY_DIAMOND.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_ELECTRUM.get(), Ingredient.of(REOItems.DIRTY_ELECTRUM.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_ELECTRUM.get()), has(REOItems.DIRTY_ELECTRUM.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_EMERALD.get(), Ingredient.of(REOItems.DIRTY_EMERALD.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_EMERALD.get()), has(REOItems.DIRTY_EMERALD.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_ENDERITE.get(), Ingredient.of(REOItems.DIRTY_ENDERITE.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_ENDERITE.get()), has(REOItems.DIRTY_ENDERITE.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_GOLD.get(), Ingredient.of(REOItems.DIRTY_GOLD.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_GOLD.get()), has(REOItems.DIRTY_GOLD.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_IRON.get(), Ingredient.of(REOItems.DIRTY_IRON.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_IRON.get()), has(REOItems.DIRTY_IRON.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_LEAD.get(), Ingredient.of(REOItems.DIRTY_LEAD.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_LEAD.get()), has(REOItems.DIRTY_LEAD.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_NICKEL.get(), Ingredient.of(REOItems.DIRTY_NICKEL.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_NICKEL.get()), has(REOItems.DIRTY_NICKEL.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_OBSIDIAN.get(), Ingredient.of(REOItems.DIRTY_OBSIDIAN.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_OBSIDIAN.get()), has(REOItems.DIRTY_OBSIDIAN.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_PERIDOT.get(), Ingredient.of(REOItems.DIRTY_PERIDOT.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_PERIDOT.get()), has(REOItems.DIRTY_PERIDOT.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_PLATINUM.get(), Ingredient.of(REOItems.DIRTY_PLATINUM.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_PLATINUM.get()), has(REOItems.DIRTY_PLATINUM.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_RUBY.get(), Ingredient.of(REOItems.DIRTY_RUBY.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_RUBY.get()), has(REOItems.DIRTY_RUBY.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_SAPPHIRE.get(), Ingredient.of(REOItems.DIRTY_SAPPHIRE.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_SAPPHIRE.get()), has(REOItems.DIRTY_SAPPHIRE.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_SILVER.get(), Ingredient.of(REOItems.DIRTY_SILVER.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_SILVER.get()), has(REOItems.DIRTY_SILVER.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_STEEL.get(), Ingredient.of(REOItems.DIRTY_STEEL.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_STEEL.get()), has(REOItems.DIRTY_STEEL.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_TIN.get(), Ingredient.of(REOItems.DIRTY_TIN.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_TIN.get()), has(REOItems.DIRTY_TIN.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_URANIUM.get(), Ingredient.of(REOItems.DIRTY_URANIUM.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_URANIUM.get()), has(REOItems.DIRTY_URANIUM.get())).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DUST_ZINC.get(), Ingredient.of(REOItems.DIRTY_ZINC.get()), 1)
                .unlockedBy(getHasName(REOItems.DIRTY_ZINC.get()), has(REOItems.DIRTY_ZINC.get())).save(pWriter);

        // Blocks //
        // Storage
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(),
                RecipeCategory.MISC, REOBlocks.BLOCK_ALUMINIUM.get(), getSimpleRecipeName(REOItems.INGOT_ALUMINIUM.get()), getItemName(REOItems.INGOT_ALUMINIUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_ENDERITE.get(), getSimpleRecipeName(REOItems.INGOT_ENDERITE.get()), getItemName(REOItems.INGOT_ENDERITE.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_LEAD.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_LEAD.get(), getSimpleRecipeName(REOItems.INGOT_LEAD.get()), getItemName(REOItems.INGOT_LEAD.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_NICKEL.get(), getSimpleRecipeName(REOItems.INGOT_NICKEL.get()), getItemName(REOItems.INGOT_NICKEL.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_PLATINUM.get(), getSimpleRecipeName(REOItems.INGOT_PLATINUM.get()), getItemName(REOItems.INGOT_PLATINUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_SILVER.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_SILVER.get(), getSimpleRecipeName(REOItems.INGOT_SILVER.get()), getItemName(REOItems.INGOT_SILVER.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_STEEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_STEEL.get(), getSimpleRecipeName(REOItems.INGOT_STEEL.get()), getItemName(REOItems.INGOT_STEEL.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_TIN.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_TIN.get(), getSimpleRecipeName(REOItems.INGOT_TIN.get()), getItemName(REOItems.INGOT_TIN.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_URANIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_URANIUM.get(), getSimpleRecipeName(REOItems.INGOT_URANIUM.get()), getItemName(REOItems.INGOT_URANIUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.INGOT_ZINC.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_ZINC.get(), getSimpleRecipeName(REOItems.INGOT_ZINC.get()), getItemName(REOItems.INGOT_ZINC.get()));

        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_PERIDOT.get(), REOItems.SHARD_PERIDOT.get());
        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_RUBY.get(), REOItems.SHARD_RUBY.get());
        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_SAPPHIRE.get(), REOItems.SHARD_SAPPHIRE.get());

        // Raw Storage
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_ALUMINIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ALUMINIUM.get(), getSimpleRecipeName(REOItems.RAW_ALUMINIUM.get()), getItemName(REOItems.RAW_ALUMINIUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_ENDERITE.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ENDERITE.get(), getSimpleRecipeName(REOItems.RAW_ENDERITE.get()), getItemName(REOItems.RAW_ENDERITE.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_LEAD.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_LEAD.get(), getSimpleRecipeName(REOItems.RAW_LEAD.get()), getItemName(REOItems.RAW_LEAD.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_NICKEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_NICKEL.get(), getSimpleRecipeName(REOItems.RAW_NICKEL.get()), getItemName(REOItems.RAW_NICKEL.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_PLATINUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_PLATINUM.get(), getSimpleRecipeName(REOItems.RAW_PLATINUM.get()), getItemName(REOItems.RAW_PLATINUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_SILVER.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_SILVER.get(), getSimpleRecipeName(REOItems.RAW_SILVER.get()), getItemName(REOItems.RAW_SILVER.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_TIN.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_TIN.get(), getSimpleRecipeName(REOItems.RAW_TIN.get()), getItemName(REOItems.RAW_TIN.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_URANIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_URANIUM.get(), getSimpleRecipeName(REOItems.RAW_URANIUM.get()), getItemName(REOItems.RAW_URANIUM.get()));
        nineBlockStorageRecipesRecipesWithCustomUnpacking(pWriter, RecipeCategory.MISC, REOItems.RAW_ZINC.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ZINC.get(), getSimpleRecipeName(REOItems.RAW_ZINC.get()), getItemName(REOItems.RAW_ZINC.get()));


        // Building Blocks
        // Marble
        cut(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_BRICK.get(), REOBlocks.MARBLE.get());
        stairsRecipe(pWriter, REOBlocks.MARBLE_STAIRS.get(), REOBlocks.MARBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_SLAB.get(), REOBlocks.MARBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_BRICK_SLAB.get(), REOBlocks.MARBLE_BRICK.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE.get());
        stairsRecipe(pWriter, REOBlocks.MARBLE_COBBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_COBBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE.get());

        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_STAIRS.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_STAIRS.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_SLAB.get(), REOBlocks.MARBLE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_SLAB.get(), REOBlocks.MARBLE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_WALL.get(), REOBlocks.MARBLE.get(), 1);

        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_STAIRS.get(), REOBlocks.MARBLE_BRICK.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_SLAB.get(), REOBlocks.MARBLE_BRICK.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_BRICK_WALL.get(), REOBlocks.MARBLE_BRICK.get(), 1);

        stonecutterRecipes(pWriter, REOBlocks.MARBLE_COBBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_COBBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE.get(), 1);

        // limestone
        cut(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_BRICK.get(), REOBlocks.LIMESTONE.get());
        stairsRecipe(pWriter, REOBlocks.LIMESTONE_STAIRS.get(), REOBlocks.LIMESTONE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_SLAB.get(), REOBlocks.LIMESTONE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_BRICK_SLAB.get(), REOBlocks.LIMESTONE_BRICK.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE.get());
        stairsRecipe(pWriter, REOBlocks.LIMESTONE_COBBLE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_COBBLE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE.get());

        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_STAIRS.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_STAIRS.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_SLAB.get(), REOBlocks.LIMESTONE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_SLAB.get(), REOBlocks.LIMESTONE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_WALL.get(), REOBlocks.LIMESTONE.get(), 1);

        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_STAIRS.get(), REOBlocks.LIMESTONE_BRICK.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_SLAB.get(), REOBlocks.LIMESTONE_BRICK.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_BRICK_WALL.get(), REOBlocks.LIMESTONE_BRICK.get(), 1);

        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_COBBLE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE.get(), 1);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_COBBLE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE.get(), 2);
        stonecutterRecipes(pWriter, REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE.get(), 1);


        // Calcite
        stairsRecipe(pWriter, REOBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CALCITE_SLAB.get(), Blocks.CALCITE);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CALCITE_WALL.get(), Blocks.CALCITE);

        stonecutterRecipes(pWriter, REOBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE, 1);
        stonecutterRecipes(pWriter, REOBlocks.CALCITE_SLAB.get(), Blocks.CALCITE, 2);
        stonecutterRecipes(pWriter, REOBlocks.CALCITE_WALL.get(), Blocks.CALCITE, 1);

        // Netherrack
        stairsRecipe(pWriter, REOBlocks.NETHERRACK_STAIRS.get(), Blocks.NETHERRACK);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.NETHERRACK_SLAB.get(), Blocks.NETHERRACK);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK);

        stonecutterRecipes(pWriter, REOBlocks.NETHERRACK_STAIRS.get(), Blocks.NETHERRACK, 1);
        stonecutterRecipes(pWriter, Blocks.NETHER_BRICKS, Blocks.NETHERRACK, 1);
        stonecutterRecipes(pWriter, REOBlocks.NETHERRACK_SLAB.get(), Blocks.NETHERRACK, 2);
        stonecutterRecipes(pWriter, REOBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK, 1);

        // Lamp
        lampRecipe(pWriter, REOBlocks.LAMP_BLACK.get(), REOItems.LUMINOUS_BLACK.get());
        lampRecipe(pWriter, REOBlocks.LAMP_BLUE.get(), REOItems.LUMINOUS_BLUE.get());
        lampRecipe(pWriter, REOBlocks.LAMP_BROWN.get(), REOItems.LUMINOUS_BROWN.get());
        lampRecipe(pWriter, REOBlocks.LAMP_CYAN.get(), REOItems.LUMINOUS_CYAN.get());
        lampRecipe(pWriter, REOBlocks.LAMP_GRAY.get(), REOItems.LUMINOUS_GRAY.get());
        lampRecipe(pWriter, REOBlocks.LAMP_GREEN.get(), REOItems.LUMINOUS_GREEN.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIGHTBLUE.get(), REOItems.LUMINOUS_LIGHTBLUE.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIGHTGRAY.get(), REOItems.LUMINOUS_LIGHTGRAY.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIME.get(), REOItems.LUMINOUS_LIME.get());
        lampRecipe(pWriter, REOBlocks.LAMP_MAGENTA.get(), REOItems.LUMINOUS_MAGENTA.get());
        lampRecipe(pWriter, REOBlocks.LAMP_ORANGE.get(), REOItems.LUMINOUS_ORANGE.get());
        lampRecipe(pWriter, REOBlocks.LAMP_PINK.get(), REOItems.LUMINOUS_PINK.get());
        lampRecipe(pWriter, REOBlocks.LAMP_PURPLE.get(), REOItems.LUMINOUS_PURPLE.get());
        lampRecipe(pWriter, REOBlocks.LAMP_RED.get(), REOItems.LUMINOUS_RED.get());
        lampRecipe(pWriter, REOBlocks.LAMP_WHITE.get(), REOItems.LUMINOUS_WHITE.get());
        lampRecipe(pWriter, REOBlocks.LAMP_YELLOW.get(), REOItems.LUMINOUS_YELLOW.get());

        // Seeds
        seedRecipe(pWriter, REOItems.SEED_BARLEY.get(), REOItems.PLANT_BARLEY.get());
        seedRecipe(pWriter, REOItems.SEED_CAULIFLOWER.get(), REOItems.FOOD_CAULIFLOWER.get());
        seedRecipe(pWriter, REOItems.SEED_COTTON.get(), REOItems.PLANT_COTTON.get());
        seedRecipe(pWriter, REOItems.SEED_RICE.get(), REOItems.PLANT_RICE.get());
        seedRecipe(pWriter, REOItems.SEED_TOMATO.get(), REOItems.FOOD_TOMATO.get());
        seedRecipe(pWriter, REOItems.SEED_TOMATO.get(), REOItems.FOOD_TOMATO_ROTTEN.get());

        flourRecipe(pWriter, REOItems.FLOUR_WHEAT.get(), Items.WHEAT);
        flourRecipe(pWriter, REOItems.FLOUR_BARLEY.get(), REOItems.PLANT_BARLEY.get());
        breadLikeRecipe(pWriter, Items.BREAD, REOItems.PLANT_BARLEY.get());
        breadLikeRecipe(pWriter, Items.STRING, REOItems.PLANT_COTTON.get());
        breadLikeRecipe(pWriter, REOItems.FOOD_RICE.get(), REOItems.PLANT_RICE.get());

        // Wood //
        // Vanilla
        resistantRecipe(pWriter, REOBlocks.LOG_OAK_RESISTANT.get(), Blocks.OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_OAK_RESISTANT.get(), Blocks.OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_OAK_RESISTANT.get(), Blocks.OAK_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_OAK_RESISTANT.get(), Blocks.OAK_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_OAK_RESISTANT.get(), Blocks.OAK_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_OAK_RESISTANT.get(), Blocks.OAK_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_OAK_RESISTANT.get(), Blocks.OAK_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_SPRUCE_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_SPRUCE_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_SPRUCE_RESISTANT.get(), Blocks.SPRUCE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_BIRCH_RESISTANT.get(), Blocks.BIRCH_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_BIRCH_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_BIRCH_RESISTANT.get(), Blocks.BIRCH_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_BIRCH_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_BIRCH_RESISTANT.get(), Blocks.BIRCH_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_BIRCH_RESISTANT.get(), Blocks.BIRCH_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_BIRCH_RESISTANT.get(), Blocks.BIRCH_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_BIRCH_RESISTANT.get(), Blocks.BIRCH_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_BIRCH_RESISTANT.get(), Blocks.BIRCH_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_JUNGLE_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_JUNGLE_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_JUNGLE_RESISTANT.get(), Blocks.JUNGLE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_ACACIA_RESISTANT.get(), Blocks.ACACIA_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_ACACIA_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_ACACIA_RESISTANT.get(), Blocks.ACACIA_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_ACACIA_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_ACACIA_RESISTANT.get(), Blocks.ACACIA_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_ACACIA_RESISTANT.get(), Blocks.ACACIA_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_ACACIA_RESISTANT.get(), Blocks.ACACIA_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_ACACIA_RESISTANT.get(), Blocks.ACACIA_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_ACACIA_RESISTANT.get(), Blocks.ACACIA_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_DARK_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_DARK_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT.get(), Blocks.DARK_OAK_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_MANGROVE_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_MANGROVE_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_MANGROVE_RESISTANT.get(), Blocks.MANGROVE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.LOG_CHERRY_RESISTANT.get(), Blocks.CHERRY_LOG);
        resistantRecipe(pWriter, REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_CHERRY_LOG);
        resistantRecipe(pWriter, REOBlocks.WOOD_CHERRY_RESISTANT.get(), Blocks.CHERRY_WOOD);
        resistantRecipe(pWriter, REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get(), Blocks.STRIPPED_CHERRY_WOOD);
        resistantRecipe(pWriter, REOBlocks.PLANKS_CHERRY_RESISTANT.get(), Blocks.CHERRY_PLANKS);

        resistantRecipe(pWriter, REOBlocks.STAIRS_CHERRY_RESISTANT.get(), Blocks.CHERRY_STAIRS);
        resistantRecipe(pWriter, REOBlocks.SLAB_CHERRY_RESISTANT.get(), Blocks.CHERRY_SLAB);
        resistantRecipe(pWriter, REOBlocks.FENCE_CHERRY_RESISTANT.get(), Blocks.CHERRY_FENCE);
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_CHERRY_RESISTANT.get(), Blocks.CHERRY_FENCE_GATE);

        // Modded
        // Balsa
        planksFromLogs(pWriter, REOBlocks.PLANKS_BALSA.get(), Ingredient.of(REOTags.Items.BALSA_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_BALSA.get(), REOBlocks.LOG_BALSA.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_BALSA_STRIPPED.get(), REOBlocks.LOG_BALSA_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_BALSA_RESISTANT.get(), REOBlocks.LOG_BALSA.get());
        resistantRecipe(pWriter, REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get(), REOBlocks.LOG_BALSA_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_BALSA_RESISTANT.get(), REOBlocks.WOOD_BALSA.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_BALSA_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_BALSA_RESISTANT.get(), REOBlocks.PLANKS_BALSA.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_BALSA_RESISTANT.get(), REOBlocks.STAIRS_BALSA.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_BALSA_RESISTANT.get(), REOBlocks.SLAB_BALSA.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_BALSA_RESISTANT.get(), REOBlocks.FENCE_BALSA.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_BALSA_RESISTANT.get(), REOBlocks.FENCE_GATE_BALSA.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        signRecipe(pWriter, REOBlocks.SIGN_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.LOG_BALSA_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        doorRecipe(pWriter, REOBlocks.DOOR_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        boatRecipe(pWriter, REOItems.BOAT_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_BALSA_CHEST.get(), REOItems.BOAT_BALSA.get());

        // Baobab
        planksFromLogs(pWriter, REOBlocks.PLANKS_BAOBAB.get(), Ingredient.of(REOTags.Items.BAOBAB_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_BAOBAB.get(), REOBlocks.LOG_BAOBAB.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_BAOBAB_STRIPPED.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_BAOBAB_RESISTANT.get(), REOBlocks.LOG_BAOBAB.get());
        resistantRecipe(pWriter, REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_BAOBAB_RESISTANT.get(), REOBlocks.WOOD_BAOBAB.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_BAOBAB_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_BAOBAB_RESISTANT.get(), REOBlocks.PLANKS_BAOBAB.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_BAOBAB_RESISTANT.get(), REOBlocks.STAIRS_BAOBAB.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_BAOBAB_RESISTANT.get(), REOBlocks.SLAB_BAOBAB.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_BAOBAB_RESISTANT.get(), REOBlocks.FENCE_BAOBAB.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_BAOBAB_RESISTANT.get(), REOBlocks.FENCE_GATE_BAOBAB.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        signRecipe(pWriter, REOBlocks.SIGN_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        doorRecipe(pWriter, REOBlocks.DOOR_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        boatRecipe(pWriter, REOItems.BOAT_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_BAOBAB_CHEST.get(), REOItems.BOAT_BAOBAB.get());

        // Hill Cherry
        planksFromLogs(pWriter, REOBlocks.PLANKS_HILL_CHERRY.get(), Ingredient.of(REOTags.Items.HILL_CHERRY_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_HILL_CHERRY_RESISTANT.get(), REOBlocks.LOG_HILL_CHERRY.get());
        resistantRecipe(pWriter, REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get(), REOBlocks.WOOD_HILL_CHERRY.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_HILL_CHERRY_RESISTANT.get(), REOBlocks.STAIRS_HILL_CHERRY.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get(), REOBlocks.SLAB_HILL_CHERRY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_HILL_CHERRY_RESISTANT.get(), REOBlocks.FENCE_HILL_CHERRY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT.get(), REOBlocks.FENCE_GATE_HILL_CHERRY.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        signRecipe(pWriter, REOBlocks.SIGN_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        doorRecipe(pWriter, REOBlocks.DOOR_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        boatRecipe(pWriter, REOItems.BOAT_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_HILL_CHERRY_CHEST.get(), REOItems.BOAT_HILL_CHERRY.get());

        // Chestnut
        planksFromLogs(pWriter, REOBlocks.PLANKS_CHESTNUT.get(), Ingredient.of(REOTags.Items.CHESTNUT_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_CHESTNUT_STRIPPED.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_CHESTNUT_RESISTANT.get(), REOBlocks.LOG_CHESTNUT.get());
        resistantRecipe(pWriter, REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_CHESTNUT_RESISTANT.get(), REOBlocks.WOOD_CHESTNUT.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_CHESTNUT_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_CHESTNUT_RESISTANT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_CHESTNUT_RESISTANT.get(), REOBlocks.STAIRS_CHESTNUT.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_CHESTNUT_RESISTANT.get(), REOBlocks.SLAB_CHESTNUT.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_CHESTNUT_RESISTANT.get(), REOBlocks.FENCE_CHESTNUT.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT.get(), REOBlocks.FENCE_GATE_CHESTNUT.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        signRecipe(pWriter, REOBlocks.SIGN_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        doorRecipe(pWriter, REOBlocks.DOOR_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        boatRecipe(pWriter, REOItems.BOAT_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_CHESTNUT_CHEST.get(), REOItems.BOAT_CHESTNUT.get());

        // Citrus
        planksFromLogs(pWriter, REOBlocks.PLANKS_CITRUS.get(), Ingredient.of(REOTags.Items.CITRUS_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_CITRUS.get(), REOBlocks.LOG_CITRUS.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_CITRUS_STRIPPED.get(), REOBlocks.LOG_CITRUS_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_CITRUS_RESISTANT.get(), REOBlocks.LOG_CITRUS.get());
        resistantRecipe(pWriter, REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get(), REOBlocks.LOG_CITRUS_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_CITRUS_RESISTANT.get(), REOBlocks.WOOD_CITRUS.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_CITRUS_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_CITRUS_RESISTANT.get(), REOBlocks.PLANKS_CITRUS.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_CITRUS_RESISTANT.get(), REOBlocks.STAIRS_CITRUS.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_CITRUS_RESISTANT.get(), REOBlocks.SLAB_CITRUS.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_CITRUS_RESISTANT.get(), REOBlocks.FENCE_CITRUS.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_CITRUS_RESISTANT.get(), REOBlocks.FENCE_GATE_CITRUS.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        signRecipe(pWriter, REOBlocks.SIGN_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.LOG_CITRUS_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        doorRecipe(pWriter, REOBlocks.DOOR_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        boatRecipe(pWriter, REOItems.BOAT_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_CITRUS_CHEST.get(), REOItems.BOAT_CITRUS.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PLANKS_EBONY.get(), Ingredient.of(REOTags.Items.EBONY_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_EBONY.get(), REOBlocks.LOG_EBONY.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_EBONY_STRIPPED.get(), REOBlocks.LOG_EBONY_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_EBONY_RESISTANT.get(), REOBlocks.LOG_EBONY.get());
        resistantRecipe(pWriter, REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get(), REOBlocks.LOG_EBONY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_EBONY_RESISTANT.get(), REOBlocks.WOOD_EBONY.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_EBONY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_EBONY_RESISTANT.get(), REOBlocks.PLANKS_EBONY.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_EBONY_RESISTANT.get(), REOBlocks.STAIRS_EBONY.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_EBONY_RESISTANT.get(), REOBlocks.SLAB_EBONY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_EBONY_RESISTANT.get(), REOBlocks.FENCE_EBONY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_EBONY_RESISTANT.get(), REOBlocks.FENCE_GATE_EBONY.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        signRecipe(pWriter, REOBlocks.SIGN_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.LOG_EBONY_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        doorRecipe(pWriter, REOBlocks.DOOR_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        boatRecipe(pWriter, REOItems.BOAT_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_EBONY_CHEST.get(), REOItems.BOAT_EBONY.get());

        // Larch
        planksFromLogs(pWriter, REOBlocks.PLANKS_LARCH.get(), Ingredient.of(REOTags.Items.LARCH_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_LARCH.get(), REOBlocks.LOG_LARCH.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_LARCH_STRIPPED.get(), REOBlocks.LOG_LARCH_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_LARCH_RESISTANT.get(), REOBlocks.LOG_LARCH.get());
        resistantRecipe(pWriter, REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get(), REOBlocks.LOG_LARCH_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_LARCH_RESISTANT.get(), REOBlocks.WOOD_LARCH.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_LARCH_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_LARCH_RESISTANT.get(), REOBlocks.PLANKS_LARCH.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_LARCH_RESISTANT.get(), REOBlocks.STAIRS_LARCH.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_LARCH_RESISTANT.get(), REOBlocks.SLAB_LARCH.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_LARCH_RESISTANT.get(), REOBlocks.FENCE_LARCH.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_LARCH_RESISTANT.get(), REOBlocks.FENCE_GATE_LARCH.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        signRecipe(pWriter, REOBlocks.SIGN_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_LARCH.get(), REOBlocks.LOG_LARCH_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        doorRecipe(pWriter, REOBlocks.DOOR_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        boatRecipe(pWriter, REOItems.BOAT_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_LARCH_CHEST.get(), REOItems.BOAT_LARCH.get());

        // Lime
        planksFromLogs(pWriter, REOBlocks.PLANKS_LIME.get(), Ingredient.of(REOTags.Items.LIME_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_LIME.get(), REOBlocks.LOG_LIME.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_LIME_STRIPPED.get(), REOBlocks.LOG_LIME_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_LIME_RESISTANT.get(), REOBlocks.LOG_LIME.get());
        resistantRecipe(pWriter, REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get(), REOBlocks.LOG_LIME_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_LIME_RESISTANT.get(), REOBlocks.WOOD_LIME.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_LIME_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_LIME_RESISTANT.get(), REOBlocks.PLANKS_LIME.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_LIME_RESISTANT.get(), REOBlocks.STAIRS_LIME.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_LIME_RESISTANT.get(), REOBlocks.SLAB_LIME.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_LIME_RESISTANT.get(), REOBlocks.FENCE_LIME.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_LIME_RESISTANT.get(), REOBlocks.FENCE_GATE_LIME.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_LIME.get(), REOBlocks.PLANKS_LIME.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_LIME.get(), REOBlocks.PLANKS_LIME.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_LIME.get(), REOBlocks.PLANKS_LIME.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_LIME.get(), REOBlocks.PLANKS_LIME.get());

        signRecipe(pWriter, REOBlocks.SIGN_LIME.get(), REOBlocks.PLANKS_LIME.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.LOG_LIME_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_LIME.get(), REOBlocks.PLANKS_LIME.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_LIME.get(), REOBlocks.PLANKS_LIME.get());

        doorRecipe(pWriter, REOBlocks.DOOR_LIME.get(), REOBlocks.PLANKS_LIME.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_LIME.get(), REOBlocks.PLANKS_LIME.get());

        boatRecipe(pWriter, REOItems.BOAT_LIME.get(), REOBlocks.PLANKS_LIME.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_LIME_CHEST.get(), REOItems.BOAT_LIME.get());

        // Mahogany
        planksFromLogs(pWriter, REOBlocks.PLANKS_MAHOGANY.get(), Ingredient.of(REOTags.Items.MAHOGANY_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_MAHOGANY_STRIPPED.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_MAHOGANY_RESISTANT.get(), REOBlocks.LOG_MAHOGANY.get());
        resistantRecipe(pWriter, REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_MAHOGANY_RESISTANT.get(), REOBlocks.WOOD_MAHOGANY.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_MAHOGANY_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_MAHOGANY_RESISTANT.get(), REOBlocks.PLANKS_MAHOGANY.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_MAHOGANY_RESISTANT.get(), REOBlocks.STAIRS_MAHOGANY.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_MAHOGANY_RESISTANT.get(), REOBlocks.SLAB_MAHOGANY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_MAHOGANY_RESISTANT.get(), REOBlocks.FENCE_MAHOGANY.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT.get(), REOBlocks.FENCE_GATE_MAHOGANY.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        signRecipe(pWriter, REOBlocks.SIGN_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        doorRecipe(pWriter, REOBlocks.DOOR_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        boatRecipe(pWriter, REOItems.BOAT_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_MAHOGANY_CHEST.get(), REOItems.BOAT_MAHOGANY.get());

        // Maple
        planksFromLogs(pWriter, REOBlocks.PLANKS_MAPLE.get(), Ingredient.of(REOTags.Items.MAPLE_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_MAPLE.get(), REOBlocks.LOG_MAPLE.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_MAPLE_STRIPPED.get(), REOBlocks.LOG_MAPLE_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_MAPLE_RESISTANT.get(), REOBlocks.LOG_MAPLE.get());
        resistantRecipe(pWriter, REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get(), REOBlocks.LOG_MAPLE_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_MAPLE_RESISTANT.get(), REOBlocks.WOOD_MAPLE.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_MAPLE_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_MAPLE_RESISTANT.get(), REOBlocks.PLANKS_MAPLE.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_MAPLE_RESISTANT.get(), REOBlocks.STAIRS_MAPLE.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_MAPLE_RESISTANT.get(), REOBlocks.SLAB_MAPLE.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_MAPLE_RESISTANT.get(), REOBlocks.FENCE_MAPLE.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_MAPLE_RESISTANT.get(), REOBlocks.FENCE_GATE_MAPLE.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        signRecipe(pWriter, REOBlocks.SIGN_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_MAPLE.get(), REOBlocks.LOG_MAPLE_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        doorRecipe(pWriter, REOBlocks.DOOR_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        boatRecipe(pWriter, REOItems.BOAT_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_MAPLE_CHEST.get(), REOItems.BOAT_MAPLE.get());

        // Palm
        planksFromLogs(pWriter, REOBlocks.PLANKS_PALM.get(), Ingredient.of(REOTags.Items.PALM_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_PALM.get(), REOBlocks.LOG_PALM.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_PALM_STRIPPED.get(), REOBlocks.LOG_PALM_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_PALM_RESISTANT.get(), REOBlocks.LOG_PALM.get());
        resistantRecipe(pWriter, REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get(), REOBlocks.LOG_PALM_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PALM_RESISTANT.get(), REOBlocks.WOOD_PALM.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_PALM_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_PALM_RESISTANT.get(), REOBlocks.PLANKS_PALM.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_PALM_RESISTANT.get(), REOBlocks.STAIRS_PALM.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_PALM_RESISTANT.get(), REOBlocks.SLAB_PALM.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_PALM_RESISTANT.get(), REOBlocks.FENCE_PALM.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_PALM_RESISTANT.get(), REOBlocks.FENCE_GATE_PALM.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_PALM.get(), REOBlocks.PLANKS_PALM.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PALM.get(), REOBlocks.PLANKS_PALM.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_PALM.get(), REOBlocks.PLANKS_PALM.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_PALM.get(), REOBlocks.PLANKS_PALM.get());

        signRecipe(pWriter, REOBlocks.SIGN_PALM.get(), REOBlocks.PLANKS_PALM.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.LOG_PALM_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_PALM.get(), REOBlocks.PLANKS_PALM.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_PALM.get(), REOBlocks.PLANKS_PALM.get());

        doorRecipe(pWriter, REOBlocks.DOOR_PALM.get(), REOBlocks.PLANKS_PALM.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_PALM.get(), REOBlocks.PLANKS_PALM.get());

        boatRecipe(pWriter, REOItems.BOAT_PALM.get(), REOBlocks.PLANKS_PALM.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PALM_CHEST.get(), REOItems.BOAT_PALM.get());

        // Papaya
        planksFromLogs(pWriter, REOBlocks.PLANKS_PAPAYA.get(), Ingredient.of(REOTags.Items.PAPAYA_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_PAPAYA.get(), REOBlocks.LOG_PAPAYA.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_PAPAYA_STRIPPED.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_PAPAYA_RESISTANT.get(), REOBlocks.LOG_PAPAYA.get());
        resistantRecipe(pWriter, REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PAPAYA_RESISTANT.get(), REOBlocks.WOOD_PAPAYA.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_PAPAYA_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_PAPAYA_RESISTANT.get(), REOBlocks.PLANKS_PAPAYA.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_PAPAYA_RESISTANT.get(), REOBlocks.STAIRS_PAPAYA.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_PAPAYA_RESISTANT.get(), REOBlocks.SLAB_PAPAYA.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_PAPAYA_RESISTANT.get(), REOBlocks.FENCE_PAPAYA.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_PAPAYA_RESISTANT.get(), REOBlocks.FENCE_GATE_PAPAYA.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        signRecipe(pWriter, REOBlocks.SIGN_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        doorRecipe(pWriter, REOBlocks.DOOR_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        boatRecipe(pWriter, REOItems.BOAT_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PAPAYA_CHEST.get(), REOItems.BOAT_PAPAYA.get());

        // Pine
        planksFromLogs(pWriter, REOBlocks.PLANKS_PINE.get(), Ingredient.of(REOTags.Items.PINE_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_PINE.get(), REOBlocks.LOG_PINE.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_PINE_STRIPPED.get(), REOBlocks.LOG_PINE_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_PINE_RESISTANT.get(), REOBlocks.LOG_PINE.get());
        resistantRecipe(pWriter, REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get(), REOBlocks.LOG_PINE_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PINE_RESISTANT.get(), REOBlocks.WOOD_PINE.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_PINE_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_PINE_RESISTANT.get(), REOBlocks.PLANKS_PINE.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_PINE_RESISTANT.get(), REOBlocks.STAIRS_PINE.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_PINE_RESISTANT.get(), REOBlocks.SLAB_PINE.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_PINE_RESISTANT.get(), REOBlocks.FENCE_PINE.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_PINE_RESISTANT.get(), REOBlocks.FENCE_GATE_PINE.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_PINE.get(), REOBlocks.PLANKS_PINE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PINE.get(), REOBlocks.PLANKS_PINE.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_PINE.get(), REOBlocks.PLANKS_PINE.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_PINE.get(), REOBlocks.PLANKS_PINE.get());

        signRecipe(pWriter, REOBlocks.SIGN_PINE.get(), REOBlocks.PLANKS_PINE.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_PINE.get(), REOBlocks.LOG_PINE_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_PINE.get(), REOBlocks.PLANKS_PINE.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_PINE.get(), REOBlocks.PLANKS_PINE.get());

        doorRecipe(pWriter, REOBlocks.DOOR_PINE.get(), REOBlocks.PLANKS_PINE.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_PINE.get(), REOBlocks.PLANKS_PINE.get());

        boatRecipe(pWriter, REOItems.BOAT_PINE.get(), REOBlocks.PLANKS_PINE.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PINE_CHEST.get(), REOItems.BOAT_PINE.get());

        // Plum
        planksFromLogs(pWriter, REOBlocks.PLANKS_PLUM.get(), Ingredient.of(REOTags.Items.PLUM_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_PLUM.get(), REOBlocks.LOG_PLUM.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_PLUM_STRIPPED.get(), REOBlocks.LOG_PLUM_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_PLUM_RESISTANT.get(), REOBlocks.LOG_PLUM.get());
        resistantRecipe(pWriter, REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get(), REOBlocks.LOG_PLUM_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PLUM_RESISTANT.get(), REOBlocks.WOOD_PLUM.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_PLUM_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_PLUM_RESISTANT.get(), REOBlocks.PLANKS_PLUM.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_PLUM_RESISTANT.get(), REOBlocks.STAIRS_PLUM.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_PLUM_RESISTANT.get(), REOBlocks.SLAB_PLUM.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_PLUM_RESISTANT.get(), REOBlocks.FENCE_PLUM.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_PLUM_RESISTANT.get(), REOBlocks.FENCE_GATE_PLUM.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_PLUM.get(), REOBlocks.PLANKS_PLUM.get());

        signRecipe(pWriter, REOBlocks.SIGN_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.LOG_PLUM_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());

        doorRecipe(pWriter, REOBlocks.DOOR_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());

        boatRecipe(pWriter, REOItems.BOAT_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_POPLAR_CHEST.get(), REOItems.BOAT_POPLAR.get());

        // Redwood
        planksFromLogs(pWriter, REOBlocks.PLANKS_REDWOOD.get(), Ingredient.of(REOTags.Items.REDWOOD_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_REDWOOD.get(), REOBlocks.LOG_REDWOOD.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_REDWOOD_STRIPPED.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_REDWOOD_RESISTANT.get(), REOBlocks.LOG_REDWOOD.get());
        resistantRecipe(pWriter, REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_REDWOOD_RESISTANT.get(), REOBlocks.WOOD_REDWOOD.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_REDWOOD_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_REDWOOD_RESISTANT.get(), REOBlocks.PLANKS_REDWOOD.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_REDWOOD_RESISTANT.get(), REOBlocks.STAIRS_REDWOOD.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_REDWOOD_RESISTANT.get(), REOBlocks.SLAB_REDWOOD.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_REDWOOD_RESISTANT.get(), REOBlocks.FENCE_REDWOOD.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_REDWOOD_RESISTANT.get(), REOBlocks.FENCE_GATE_REDWOOD.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        signRecipe(pWriter, REOBlocks.SIGN_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_REDWOOD.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        doorRecipe(pWriter, REOBlocks.DOOR_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        boatRecipe(pWriter, REOItems.BOAT_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_REDWOOD_CHEST.get(), REOItems.BOAT_REDWOOD.get());

        // Rubber
        planksFromLogs(pWriter, REOBlocks.PLANKS_RUBBER.get(), Ingredient.of(REOTags.Items.RUBBER_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_RUBBER.get(), REOBlocks.LOG_RUBBER.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_RUBBER_STRIPPED.get(), REOBlocks.LOG_RUBBER_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_RUBBER_RESISTANT.get(), REOBlocks.LOG_RUBBER.get());
        resistantRecipe(pWriter, REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get(), REOBlocks.LOG_RUBBER_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_RUBBER_RESISTANT.get(), REOBlocks.WOOD_RUBBER.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_RUBBER_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_RUBBER_RESISTANT.get(), REOBlocks.PLANKS_RUBBER.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_RUBBER_RESISTANT.get(), REOBlocks.STAIRS_RUBBER.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_RUBBER_RESISTANT.get(), REOBlocks.SLAB_RUBBER.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_RUBBER_RESISTANT.get(), REOBlocks.FENCE_RUBBER.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_RUBBER_RESISTANT.get(), REOBlocks.FENCE_GATE_RUBBER.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        signRecipe(pWriter, REOBlocks.SIGN_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.LOG_RUBBER_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        doorRecipe(pWriter, REOBlocks.DOOR_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        boatRecipe(pWriter, REOItems.BOAT_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_RUBBER_CHEST.get(), REOItems.BOAT_RUBBER.get());

        // Teak
        planksFromLogs(pWriter, REOBlocks.PLANKS_TEAK.get(), Ingredient.of(REOTags.Items.TEAK_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_TEAK.get(), REOBlocks.LOG_TEAK.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_TEAK_STRIPPED.get(), REOBlocks.LOG_TEAK_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_TEAK_RESISTANT.get(), REOBlocks.LOG_TEAK.get());
        resistantRecipe(pWriter, REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get(), REOBlocks.LOG_TEAK_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_TEAK_RESISTANT.get(), REOBlocks.WOOD_TEAK.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_TEAK_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_TEAK_RESISTANT.get(), REOBlocks.PLANKS_TEAK.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_TEAK_RESISTANT.get(), REOBlocks.STAIRS_TEAK.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_TEAK_RESISTANT.get(), REOBlocks.SLAB_TEAK.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_TEAK_RESISTANT.get(), REOBlocks.FENCE_TEAK.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_TEAK_RESISTANT.get(), REOBlocks.FENCE_GATE_TEAK.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        signRecipe(pWriter, REOBlocks.SIGN_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.LOG_TEAK_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        doorRecipe(pWriter, REOBlocks.DOOR_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        boatRecipe(pWriter, REOItems.BOAT_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_TEAK_CHEST.get(), REOItems.BOAT_TEAK.get());

        // Walnut
        planksFromLogs(pWriter, REOBlocks.PLANKS_WALNUT.get(), Ingredient.of(REOTags.Items.WALNUT_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_WALNUT.get(), REOBlocks.LOG_WALNUT.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_WALNUT_STRIPPED.get(), REOBlocks.LOG_WALNUT_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_WALNUT_RESISTANT.get(), REOBlocks.LOG_WALNUT.get());
        resistantRecipe(pWriter, REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get(), REOBlocks.LOG_WALNUT_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_WALNUT_RESISTANT.get(), REOBlocks.WOOD_WALNUT.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_WALNUT_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_WALNUT_RESISTANT.get(), REOBlocks.PLANKS_WALNUT.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_WALNUT_RESISTANT.get(), REOBlocks.STAIRS_WALNUT.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_WALNUT_RESISTANT.get(), REOBlocks.SLAB_WALNUT.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_WALNUT_RESISTANT.get(), REOBlocks.FENCE_WALNUT.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_WALNUT_RESISTANT.get(), REOBlocks.FENCE_GATE_WALNUT.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        signRecipe(pWriter, REOBlocks.SIGN_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_WALNUT.get(), REOBlocks.LOG_WALNUT_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        doorRecipe(pWriter, REOBlocks.DOOR_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        boatRecipe(pWriter, REOItems.BOAT_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_WALNUT_CHEST.get(), REOItems.BOAT_WALNUT.get());

        // Willow
        planksFromLogs(pWriter, REOBlocks.PLANKS_WILLOW.get(), Ingredient.of(REOTags.Items.WILLOW_LOGS));
        woodFromLogs(pWriter, REOBlocks.WOOD_WILLOW.get(), REOBlocks.LOG_WILLOW.get());
        woodFromLogs(pWriter, REOBlocks.WOOD_WILLOW_STRIPPED.get(), REOBlocks.LOG_WILLOW_STRIPPED.get());

        resistantRecipe(pWriter, REOBlocks.LOG_WILLOW_RESISTANT.get(), REOBlocks.LOG_WILLOW.get());
        resistantRecipe(pWriter, REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get(), REOBlocks.LOG_WILLOW_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_WILLOW_RESISTANT.get(), REOBlocks.WOOD_WILLOW.get());
        resistantRecipe(pWriter, REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get(), REOBlocks.WOOD_WILLOW_STRIPPED.get());
        resistantRecipe(pWriter, REOBlocks.PLANKS_WILLOW_RESISTANT.get(), REOBlocks.PLANKS_WILLOW.get());

        resistantRecipe(pWriter, REOBlocks.STAIRS_WILLOW_RESISTANT.get(), REOBlocks.STAIRS_WILLOW.get());
        resistantRecipe(pWriter, REOBlocks.SLAB_WILLOW_RESISTANT.get(), REOBlocks.SLAB_WILLOW.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_WILLOW_RESISTANT.get(), REOBlocks.FENCE_WILLOW.get());
        resistantRecipe(pWriter, REOBlocks.FENCE_GATE_WILLOW_RESISTANT.get(), REOBlocks.FENCE_GATE_WILLOW.get());

        stairsRecipe(pWriter, REOBlocks.STAIRS_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        fenceRecipe(pWriter, REOBlocks.FENCE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        fenceGateRecipe(pWriter, REOBlocks.FENCE_GATE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        signRecipe(pWriter, REOBlocks.SIGN_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        hangingSignRecipe(pWriter, REOBlocks.SIGN_HANGING_WILLOW.get(), REOBlocks.LOG_WILLOW_STRIPPED.get());

        buttonRecipe(pWriter, REOBlocks.BUTTON_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        pressurePlateRecipe(pWriter, REOBlocks.PRESSURE_PLATE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        doorRecipe(pWriter, REOBlocks.DOOR_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        trapdoorRecipe(pWriter, REOBlocks.TRAPDOOR_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        boatRecipe(pWriter, REOItems.BOAT_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_WILLOW_CHEST.get(), REOItems.BOAT_WILLOW.get());

        // Tools //
        // Aluminium
        shovelRecipe(pWriter,REOItems.ALUMINIUM_SHOVEL.get(), REOItems.INGOT_ALUMINIUM.get());
        pickaxeRecipe(pWriter,REOItems.ALUMINIUM_PICKAXE.get(), REOItems.INGOT_ALUMINIUM.get());
        axeRecipe(pWriter,REOItems.ALUMINIUM_AXE.get(), REOItems.INGOT_ALUMINIUM.get());
        hoeRecipe(pWriter,REOItems.ALUMINIUM_HOE.get(), REOItems.INGOT_ALUMINIUM.get());
        swordRecipe(pWriter,REOItems.ALUMINIUM_SWORD.get(), REOItems.INGOT_ALUMINIUM.get());
        hammerRecipe(pWriter,REOItems.ALUMINIUM_HAMMER.get(), REOItems.INGOT_ALUMINIUM.get());
        excavatorRecipe(pWriter,REOItems.ALUMINIUM_EXCAVATOR.get(), REOItems.INGOT_ALUMINIUM.get());
        hatchetRecipe(pWriter,REOItems.ALUMINIUM_HATCHET.get(), REOItems.INGOT_ALUMINIUM.get());
        sickleRecipe(pWriter,REOItems.ALUMINIUM_SICKLE.get(), REOItems.INGOT_ALUMINIUM.get());
        shearsRecipe(pWriter,REOItems.ALUMINIUM_SHEARS.get(), REOItems.INGOT_ALUMINIUM.get());

        paxelRecipe(pWriter,REOItems.ALUMINIUM_PAXEL.get(),
                REOItems.ALUMINIUM_AXE.get(), REOItems.ALUMINIUM_SHOVEL.get(), REOItems.ALUMINIUM_PICKAXE.get());
        bowRecipe(pWriter,REOItems.ALUMINIUM_BOW.get(), REOItems.INGOT_ALUMINIUM.get());

        // Amethyst
        shovelRecipe(pWriter,REOItems.AMETHYST_SHOVEL.get(), REOItems.GEM_AMETHYST.get());
        pickaxeRecipe(pWriter,REOItems.AMETHYST_PICKAXE.get(), REOItems.GEM_AMETHYST.get());
        axeRecipe(pWriter,REOItems.AMETHYST_AXE.get(), REOItems.GEM_AMETHYST.get());
        hoeRecipe(pWriter,REOItems.AMETHYST_HOE.get(), REOItems.GEM_AMETHYST.get());
        swordRecipe(pWriter,REOItems.AMETHYST_SWORD.get(), REOItems.GEM_AMETHYST.get());
        hammerRecipe(pWriter,REOItems.AMETHYST_HAMMER.get(), REOItems.GEM_AMETHYST.get());
        excavatorRecipe(pWriter,REOItems.AMETHYST_EXCAVATOR.get(), REOItems.GEM_AMETHYST.get());
        hatchetRecipe(pWriter,REOItems.AMETHYST_HATCHET.get(), REOItems.GEM_AMETHYST.get());
        sickleRecipe(pWriter,REOItems.AMETHYST_SICKLE.get(), REOItems.GEM_AMETHYST.get());
        shearsRecipe(pWriter,REOItems.AMETHYST_SHEARS.get(), REOItems.GEM_AMETHYST.get());

        paxelRecipe(pWriter,REOItems.AMETHYST_PAXEL.get(),
                REOItems.AMETHYST_AXE.get(), REOItems.AMETHYST_SHOVEL.get(), REOItems.AMETHYST_PICKAXE.get());
        bowRecipe(pWriter,REOItems.AMETHYST_BOW.get(), REOItems.GEM_AMETHYST.get());
        shieldRecipe(pWriter,REOItems.AMETHYST_SHIELD.get(), REOItems.GEM_AMETHYST.get());

        // Bronze
        shovelRecipe(pWriter,REOItems.BRONZE_SHOVEL.get(), REOItems.INGOT_BRONZE.get());
        pickaxeRecipe(pWriter,REOItems.BRONZE_PICKAXE.get(), REOItems.INGOT_BRONZE.get());
        axeRecipe(pWriter,REOItems.BRONZE_AXE.get(), REOItems.INGOT_BRONZE.get());
        hoeRecipe(pWriter,REOItems.BRONZE_HOE.get(), REOItems.INGOT_BRONZE.get());
        swordRecipe(pWriter,REOItems.BRONZE_SWORD.get(), REOItems.INGOT_BRONZE.get());
        hammerRecipe(pWriter,REOItems.BRONZE_HAMMER.get(), REOItems.INGOT_BRONZE.get());
        excavatorRecipe(pWriter,REOItems.BRONZE_EXCAVATOR.get(), REOItems.INGOT_BRONZE.get());
        hatchetRecipe(pWriter,REOItems.BRONZE_HATCHET.get(), REOItems.INGOT_BRONZE.get());
        sickleRecipe(pWriter,REOItems.BRONZE_SICKLE.get(), REOItems.INGOT_BRONZE.get());
        shearsRecipe(pWriter,REOItems.BRONZE_SHEARS.get(), REOItems.INGOT_BRONZE.get());

        paxelRecipe(pWriter,REOItems.BRONZE_PAXEL.get(),
                REOItems.BRONZE_AXE.get(), REOItems.BRONZE_SHOVEL.get(), REOItems.BRONZE_PICKAXE.get());
        bowRecipe(pWriter,REOItems.BRONZE_BOW.get(), REOItems.INGOT_BRONZE.get());

        // Enderite
        shovelRecipe(pWriter,REOItems.ENDERITE_SHOVEL.get(), REOItems.INGOT_ENDERITE.get());
        pickaxeRecipe(pWriter,REOItems.ENDERITE_PICKAXE.get(), REOItems.INGOT_ENDERITE.get());
        axeRecipe(pWriter,REOItems.ENDERITE_AXE.get(), REOItems.INGOT_ENDERITE.get());
        hoeRecipe(pWriter,REOItems.ENDERITE_HOE.get(), REOItems.INGOT_ENDERITE.get());
        swordRecipe(pWriter,REOItems.ENDERITE_SWORD.get(), REOItems.INGOT_ENDERITE.get());
        hammerRecipe(pWriter,REOItems.ENDERITE_HAMMER.get(), REOItems.INGOT_ENDERITE.get());
        excavatorRecipe(pWriter,REOItems.ENDERITE_EXCAVATOR.get(), REOItems.INGOT_ENDERITE.get());
        hatchetRecipe(pWriter,REOItems.ENDERITE_HATCHET.get(), REOItems.INGOT_ENDERITE.get());
        sickleRecipe(pWriter,REOItems.ENDERITE_SICKLE.get(), REOItems.INGOT_ENDERITE.get());
        shearsRecipe(pWriter,REOItems.ENDERITE_SHEARS.get(), REOItems.INGOT_ENDERITE.get());

        paxelRecipe(pWriter,REOItems.ENDERITE_PAXEL.get(),
                REOItems.ENDERITE_AXE.get(), REOItems.ENDERITE_SHOVEL.get(), REOItems.ENDERITE_PICKAXE.get());
        bowRecipe(pWriter,REOItems.ENDERITE_BOW.get(), REOItems.INGOT_ENDERITE.get());

        // Peridot
        shovelRecipe(pWriter,REOItems.PERIDOT_SHOVEL.get(), REOItems.GEM_PERIDOT.get());
        pickaxeRecipe(pWriter,REOItems.PERIDOT_PICKAXE.get(), REOItems.GEM_PERIDOT.get());
        axeRecipe(pWriter,REOItems.PERIDOT_AXE.get(), REOItems.GEM_PERIDOT.get());
        hoeRecipe(pWriter,REOItems.PERIDOT_HOE.get(), REOItems.GEM_PERIDOT.get());
        swordRecipe(pWriter,REOItems.PERIDOT_SWORD.get(), REOItems.GEM_PERIDOT.get());
        hammerRecipe(pWriter,REOItems.PERIDOT_HAMMER.get(), REOItems.GEM_PERIDOT.get());
        excavatorRecipe(pWriter,REOItems.PERIDOT_EXCAVATOR.get(), REOItems.GEM_PERIDOT.get());
        hatchetRecipe(pWriter,REOItems.PERIDOT_HATCHET.get(), REOItems.GEM_PERIDOT.get());
        sickleRecipe(pWriter,REOItems.PERIDOT_SICKLE.get(), REOItems.GEM_PERIDOT.get());
        shearsRecipe(pWriter,REOItems.PERIDOT_SHEARS.get(), REOItems.GEM_PERIDOT.get());

        paxelRecipe(pWriter,REOItems.PERIDOT_PAXEL.get(),
                REOItems.PERIDOT_AXE.get(), REOItems.PERIDOT_SHOVEL.get(), REOItems.PERIDOT_PICKAXE.get());
        bowRecipe(pWriter,REOItems.PERIDOT_BOW.get(), REOItems.GEM_PERIDOT.get());

        // Platinum
        shovelRecipe(pWriter,REOItems.PLATINUM_SHOVEL.get(), REOItems.INGOT_PLATINUM.get());
        pickaxeRecipe(pWriter,REOItems.PLATINUM_PICKAXE.get(), REOItems.INGOT_PLATINUM.get());
        axeRecipe(pWriter,REOItems.PLATINUM_AXE.get(), REOItems.INGOT_PLATINUM.get());
        hoeRecipe(pWriter,REOItems.PLATINUM_HOE.get(), REOItems.INGOT_PLATINUM.get());
        swordRecipe(pWriter,REOItems.PLATINUM_SWORD.get(), REOItems.INGOT_PLATINUM.get());
        hammerRecipe(pWriter,REOItems.PLATINUM_HAMMER.get(), REOItems.INGOT_PLATINUM.get());
        excavatorRecipe(pWriter,REOItems.PLATINUM_EXCAVATOR.get(), REOItems.INGOT_PLATINUM.get());
        hatchetRecipe(pWriter,REOItems.PLATINUM_HATCHET.get(), REOItems.INGOT_PLATINUM.get());
        sickleRecipe(pWriter,REOItems.PLATINUM_SICKLE.get(), REOItems.INGOT_PLATINUM.get());
        shearsRecipe(pWriter,REOItems.PLATINUM_SHEARS.get(), REOItems.INGOT_PLATINUM.get());

        paxelRecipe(pWriter,REOItems.PLATINUM_PAXEL.get(),
                REOItems.PLATINUM_AXE.get(), REOItems.PLATINUM_SHOVEL.get(), REOItems.PLATINUM_PICKAXE.get());
        bowRecipe(pWriter,REOItems.PLATINUM_BOW.get(), REOItems.INGOT_PLATINUM.get());

        // Ruby
        shovelRecipe(pWriter,REOItems.RUBY_SHOVEL.get(), REOItems.GEM_RUBY.get());
        pickaxeRecipe(pWriter,REOItems.RUBY_PICKAXE.get(), REOItems.GEM_RUBY.get());
        axeRecipe(pWriter,REOItems.RUBY_AXE.get(), REOItems.GEM_RUBY.get());
        hoeRecipe(pWriter,REOItems.RUBY_HOE.get(), REOItems.GEM_RUBY.get());
        swordRecipe(pWriter,REOItems.RUBY_SWORD.get(), REOItems.GEM_RUBY.get());
        hammerRecipe(pWriter,REOItems.RUBY_HAMMER.get(), REOItems.GEM_RUBY.get());
        excavatorRecipe(pWriter,REOItems.RUBY_EXCAVATOR.get(), REOItems.GEM_RUBY.get());
        hatchetRecipe(pWriter,REOItems.RUBY_HATCHET.get(), REOItems.GEM_RUBY.get());
        sickleRecipe(pWriter,REOItems.RUBY_SICKLE.get(), REOItems.GEM_RUBY.get());
        shearsRecipe(pWriter,REOItems.RUBY_SHEARS.get(), REOItems.GEM_RUBY.get());

        paxelRecipe(pWriter,REOItems.RUBY_PAXEL.get(),
                REOItems.RUBY_AXE.get(), REOItems.RUBY_SHOVEL.get(), REOItems.RUBY_PICKAXE.get());
        bowRecipe(pWriter,REOItems.RUBY_BOW.get(), REOItems.GEM_RUBY.get());

        // Sapphire
        shovelRecipe(pWriter,REOItems.SAPPHIRE_SHOVEL.get(), REOItems.GEM_SAPPHIRE.get());
        pickaxeRecipe(pWriter,REOItems.SAPPHIRE_PICKAXE.get(), REOItems.GEM_SAPPHIRE.get());
        axeRecipe(pWriter,REOItems.SAPPHIRE_AXE.get(), REOItems.GEM_SAPPHIRE.get());
        hoeRecipe(pWriter,REOItems.SAPPHIRE_HOE.get(), REOItems.GEM_SAPPHIRE.get());
        swordRecipe(pWriter,REOItems.SAPPHIRE_SWORD.get(), REOItems.GEM_SAPPHIRE.get());
        hammerRecipe(pWriter,REOItems.SAPPHIRE_HAMMER.get(), REOItems.GEM_SAPPHIRE.get());
        excavatorRecipe(pWriter,REOItems.SAPPHIRE_EXCAVATOR.get(), REOItems.GEM_SAPPHIRE.get());
        hatchetRecipe(pWriter,REOItems.SAPPHIRE_HATCHET.get(), REOItems.GEM_SAPPHIRE.get());
        sickleRecipe(pWriter,REOItems.SAPPHIRE_SICKLE.get(), REOItems.GEM_SAPPHIRE.get());
        shearsRecipe(pWriter,REOItems.SAPPHIRE_SHEARS.get(), REOItems.GEM_SAPPHIRE.get());

        paxelRecipe(pWriter,REOItems.SAPPHIRE_PAXEL.get(),
                REOItems.SAPPHIRE_AXE.get(), REOItems.SAPPHIRE_SHOVEL.get(), REOItems.SAPPHIRE_PICKAXE.get());
        bowRecipe(pWriter,REOItems.SAPPHIRE_BOW.get(), REOItems.GEM_SAPPHIRE.get());

        // Silver
        shovelRecipe(pWriter,REOItems.SILVER_SHOVEL.get(), REOItems.INGOT_SILVER.get());
        pickaxeRecipe(pWriter,REOItems.SILVER_PICKAXE.get(), REOItems.INGOT_SILVER.get());
        axeRecipe(pWriter,REOItems.SILVER_AXE.get(), REOItems.INGOT_SILVER.get());
        hoeRecipe(pWriter,REOItems.SILVER_HOE.get(), REOItems.INGOT_SILVER.get());
        swordRecipe(pWriter,REOItems.SILVER_SWORD.get(), REOItems.INGOT_SILVER.get());
        hammerRecipe(pWriter,REOItems.SILVER_HAMMER.get(), REOItems.INGOT_SILVER.get());
        excavatorRecipe(pWriter,REOItems.SILVER_EXCAVATOR.get(), REOItems.INGOT_SILVER.get());
        hatchetRecipe(pWriter,REOItems.SILVER_HATCHET.get(), REOItems.INGOT_SILVER.get());
        sickleRecipe(pWriter,REOItems.SILVER_SICKLE.get(), REOItems.INGOT_SILVER.get());
        shearsRecipe(pWriter,REOItems.SILVER_SHEARS.get(), REOItems.INGOT_SILVER.get());

        paxelRecipe(pWriter,REOItems.SILVER_PAXEL.get(),
                REOItems.SILVER_AXE.get(), REOItems.SILVER_SHOVEL.get(), REOItems.SILVER_PICKAXE.get());
        bowRecipe(pWriter,REOItems.SILVER_BOW.get(), REOItems.INGOT_SILVER.get());

        // Steel
        shovelRecipe(pWriter,REOItems.STEEL_SHOVEL.get(), REOItems.INGOT_STEEL.get());
        pickaxeRecipe(pWriter,REOItems.STEEL_PICKAXE.get(), REOItems.INGOT_STEEL.get());
        axeRecipe(pWriter,REOItems.STEEL_AXE.get(), REOItems.INGOT_STEEL.get());
        hoeRecipe(pWriter,REOItems.STEEL_HOE.get(), REOItems.INGOT_STEEL.get());
        swordRecipe(pWriter,REOItems.STEEL_SWORD.get(), REOItems.INGOT_STEEL.get());
        hammerRecipe(pWriter,REOItems.STEEL_HAMMER.get(), REOItems.INGOT_STEEL.get());
        excavatorRecipe(pWriter,REOItems.STEEL_EXCAVATOR.get(), REOItems.INGOT_STEEL.get());
        hatchetRecipe(pWriter,REOItems.STEEL_HATCHET.get(), REOItems.INGOT_STEEL.get());
        sickleRecipe(pWriter,REOItems.STEEL_SICKLE.get(), REOItems.INGOT_STEEL.get());
        shearsRecipe(pWriter,REOItems.STEEL_SHEARS.get(), REOItems.INGOT_STEEL.get());

        paxelRecipe(pWriter,REOItems.STEEL_PAXEL.get(),
                REOItems.STEEL_AXE.get(), REOItems.STEEL_SHOVEL.get(), REOItems.STEEL_PICKAXE.get());
        bowRecipe(pWriter,REOItems.STEEL_BOW.get(), REOItems.INGOT_STEEL.get());

        // Diamond
        hammerRecipe(pWriter,REOItems.DIAMOND_HAMMER.get(), Items.DIAMOND);
        excavatorRecipe(pWriter,REOItems.DIAMOND_EXCAVATOR.get(), Items.DIAMOND);
        hatchetRecipe(pWriter,REOItems.DIAMOND_HATCHET.get(), Items.DIAMOND);
        sickleRecipe(pWriter,REOItems.DIAMOND_SICKLE.get(), Items.DIAMOND);
        shearsRecipe(pWriter,REOItems.DIAMOND_SHEARS.get(), Items.DIAMOND);

        paxelRecipe(pWriter,REOItems.DIAMOND_PAXEL.get(),
                Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE);
        bowRecipe(pWriter,REOItems.DIAMOND_BOW.get(), Items.DIAMOND);

        // Golden
        hammerRecipe(pWriter,REOItems.GOLDEN_HAMMER.get(), Items.GOLD_INGOT);
        excavatorRecipe(pWriter,REOItems.GOLDEN_EXCAVATOR.get(), Items.GOLD_INGOT);
        hatchetRecipe(pWriter,REOItems.GOLDEN_HATCHET.get(), Items.GOLD_INGOT);
        sickleRecipe(pWriter,REOItems.GOLDEN_SICKLE.get(), Items.GOLD_INGOT);
        shearsRecipe(pWriter,REOItems.GOLDEN_SHEARS.get(), Items.GOLD_INGOT);

        paxelRecipe(pWriter,REOItems.GOLDEN_PAXEL.get(),
                Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE);
        bowRecipe(pWriter,REOItems.GOLDEN_BOW.get(), Items.GOLD_INGOT);

        // Netherite
        netheriteSmithing(pWriter, REOItems.DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_HAMMER.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_EXCAVATOR.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_EXCAVATOR.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_HATCHET.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_HATCHET.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_SICKLE.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_SICKLE.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_SHEARS.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_SHEARS.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_PAXEL.get(), RecipeCategory.TOOLS, REOItems.NETHERITE_PAXEL.get());
        //netheriteSmithing(pWriter, Items.DIAMOND_HORSE_ARMOR, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_NETHERITE.get());
        netheriteSmithing(pWriter, REOItems.DIAMOND_BOW.get(), RecipeCategory.COMBAT, REOItems.NETHERITE_BOW.get());

        // Iron
        hammerRecipe(pWriter,REOItems.IRON_HAMMER.get(), Items.IRON_INGOT);
        excavatorRecipe(pWriter,REOItems.IRON_EXCAVATOR.get(), Items.IRON_INGOT);
        hatchetRecipe(pWriter,REOItems.IRON_HATCHET.get(), Items.IRON_INGOT);
        sickleRecipe(pWriter,REOItems.IRON_SICKLE.get(), Items.IRON_INGOT);

        paxelRecipe(pWriter,REOItems.IRON_PAXEL.get(),
                Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_PICKAXE);
        bowRecipe(pWriter,REOItems.IRON_BOW.get(), Items.IRON_INGOT);

        // Stone
        hammerTagRecipe(pWriter,REOItems.STONE_HAMMER.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_PICKAXE);
        excavatorTagRecipe(pWriter,REOItems.STONE_EXCAVATOR.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_SHOVEL);
        hatchetTagRecipe(pWriter,REOItems.STONE_HATCHET.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_AXE);
        sickleTagRecipe(pWriter,REOItems.STONE_SICKLE.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_HOE);
        shearsTagRecipe(pWriter,REOItems.STONE_SHEARS.get(), ItemTags.STONE_TOOL_MATERIALS, Items.COBBLESTONE);

        paxelRecipe(pWriter,REOItems.STONE_PAXEL.get(),
                Items.STONE_AXE, Items.STONE_SHOVEL, Items.STONE_PICKAXE);
        bowTagRecipe(pWriter,REOItems.STONE_BOW.get(), ItemTags.STONE_TOOL_MATERIALS);

        // Wooden
        hammerTagRecipe(pWriter,REOItems.WOODEN_HAMMER.get(), ItemTags.PLANKS, Items.WOODEN_PICKAXE);
        excavatorTagRecipe(pWriter,REOItems.WOODEN_EXCAVATOR.get(), ItemTags.PLANKS, Items.WOODEN_SHOVEL);
        hatchetTagRecipe(pWriter,REOItems.WOODEN_HATCHET.get(), ItemTags.PLANKS, Items.WOODEN_AXE);
        sickleTagRecipe(pWriter,REOItems.WOODEN_SICKLE.get(), ItemTags.PLANKS, Items.WOODEN_HOE);
        shearsTagRecipe(pWriter,REOItems.WOODEN_SHEARS.get(), ItemTags.PLANKS, Items.OAK_PLANKS);

        paxelRecipe(pWriter,REOItems.WOODEN_PAXEL.get(),
                Items.WOODEN_AXE, Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE);

        // Armour //
        // Aluminium
        helmetRecipe(pWriter,REOItems.ALUMINIUM_HELMET.get(), REOItems.INGOT_ALUMINIUM.get());
        chestplateRecipe(pWriter,REOItems.ALUMINIUM_CHESTPLATE.get(), REOItems.INGOT_ALUMINIUM.get());
        legginsRecipe(pWriter,REOItems.ALUMINIUM_LEGGINGS.get(), REOItems.INGOT_ALUMINIUM.get());
        bootsRecipe(pWriter,REOItems.ALUMINIUM_BOOTS.get(), REOItems.INGOT_ALUMINIUM.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());

        // Amethyst
        helmetRecipe(pWriter,REOItems.AMETHYST_HELMET.get(), REOItems.GEM_AMETHYST.get());
        chestplateRecipe(pWriter,REOItems.AMETHYST_CHESTPLATE.get(), REOItems.GEM_AMETHYST.get());
        legginsRecipe(pWriter,REOItems.AMETHYST_LEGGINGS.get(), REOItems.GEM_AMETHYST.get());
        bootsRecipe(pWriter,REOItems.AMETHYST_BOOTS.get(), REOItems.GEM_AMETHYST.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_AMETHYST.get(), REOItems.GEM_AMETHYST.get());

        // Bronze
        helmetRecipe(pWriter,REOItems.BRONZE_HELMET.get(), REOItems.INGOT_BRONZE.get());
        chestplateRecipe(pWriter,REOItems.BRONZE_CHESTPLATE.get(), REOItems.INGOT_BRONZE.get());
        legginsRecipe(pWriter,REOItems.BRONZE_LEGGINGS.get(), REOItems.INGOT_BRONZE.get());
        bootsRecipe(pWriter,REOItems.BRONZE_BOOTS.get(), REOItems.INGOT_BRONZE.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_BRONZE.get(), REOItems.INGOT_BRONZE.get());

        // Chain
        helmetRecipe(pWriter,Items.CHAINMAIL_HELMET, Items.CHAIN);
        chestplateRecipe(pWriter,Items.CHAINMAIL_CHESTPLATE, Items.CHAIN);
        legginsRecipe(pWriter,Items.CHAINMAIL_LEGGINGS, Items.CHAIN);
        bootsRecipe(pWriter,Items.CHAINMAIL_BOOTS, Items.CHAIN);

        // Enderite
        helmetRecipe(pWriter,REOItems.ENDERITE_HELMET.get(), REOItems.INGOT_ENDERITE.get());
        chestplateRecipe(pWriter,REOItems.ENDERITE_CHESTPLATE.get(), REOItems.INGOT_ENDERITE.get());
        legginsRecipe(pWriter,REOItems.ENDERITE_LEGGINGS.get(), REOItems.INGOT_ENDERITE.get());
        bootsRecipe(pWriter,REOItems.ENDERITE_BOOTS.get(), REOItems.INGOT_ENDERITE.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());

        // Peridot
        helmetRecipe(pWriter,REOItems.PERIDOT_HELMET.get(), REOItems.GEM_PERIDOT.get());
        chestplateRecipe(pWriter,REOItems.PERIDOT_CHESTPLATE.get(), REOItems.GEM_PERIDOT.get());
        legginsRecipe(pWriter,REOItems.PERIDOT_LEGGINGS.get(), REOItems.GEM_PERIDOT.get());
        bootsRecipe(pWriter,REOItems.PERIDOT_BOOTS.get(), REOItems.GEM_PERIDOT.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_PERIDOT.get(), REOItems.GEM_PERIDOT.get());

        // Platinum
        helmetRecipe(pWriter,REOItems.PLATINUM_HELMET.get(), REOItems.INGOT_PLATINUM.get());
        chestplateRecipe(pWriter,REOItems.PLATINUM_CHESTPLATE.get(), REOItems.INGOT_PLATINUM.get());
        legginsRecipe(pWriter,REOItems.PLATINUM_LEGGINGS.get(), REOItems.INGOT_PLATINUM.get());
        bootsRecipe(pWriter,REOItems.PLATINUM_BOOTS.get(), REOItems.INGOT_PLATINUM.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());

        // Ruby
        helmetRecipe(pWriter,REOItems.RUBY_HELMET.get(), REOItems.GEM_RUBY.get());
        chestplateRecipe(pWriter,REOItems.RUBY_CHESTPLATE.get(), REOItems.GEM_RUBY.get());
        legginsRecipe(pWriter,REOItems.RUBY_LEGGINGS.get(), REOItems.GEM_RUBY.get());
        bootsRecipe(pWriter,REOItems.RUBY_BOOTS.get(), REOItems.GEM_RUBY.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_RUBY.get(), REOItems.GEM_RUBY.get());

        // Sapphire
        helmetRecipe(pWriter,REOItems.SAPPHIRE_HELMET.get(), REOItems.GEM_SAPPHIRE.get());
        chestplateRecipe(pWriter,REOItems.SAPPHIRE_CHESTPLATE.get(), REOItems.GEM_SAPPHIRE.get());
        legginsRecipe(pWriter,REOItems.SAPPHIRE_LEGGINGS.get(), REOItems.GEM_SAPPHIRE.get());
        bootsRecipe(pWriter,REOItems.SAPPHIRE_BOOTS.get(), REOItems.GEM_SAPPHIRE.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());

        // Silver
        helmetRecipe(pWriter,REOItems.SILVER_HELMET.get(), REOItems.INGOT_SILVER.get());
        chestplateRecipe(pWriter,REOItems.SILVER_CHESTPLATE.get(), REOItems.INGOT_SILVER.get());
        legginsRecipe(pWriter,REOItems.SILVER_LEGGINGS.get(), REOItems.INGOT_SILVER.get());
        bootsRecipe(pWriter,REOItems.SILVER_BOOTS.get(), REOItems.INGOT_SILVER.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_SILVER.get(), REOItems.INGOT_SILVER.get());

        // Steel
        helmetRecipe(pWriter,REOItems.STEEL_HELMET.get(), REOItems.INGOT_STEEL.get());
        chestplateRecipe(pWriter,REOItems.STEEL_CHESTPLATE.get(), REOItems.INGOT_STEEL.get());
        legginsRecipe(pWriter,REOItems.STEEL_LEGGINGS.get(), REOItems.INGOT_STEEL.get());
        bootsRecipe(pWriter,REOItems.STEEL_BOOTS.get(), REOItems.INGOT_STEEL.get());
        horseArmorRecipe(pWriter,REOItems.HORSE_ARMOR_STEEL.get(), REOItems.INGOT_STEEL.get());

        // Vanila
        horseArmorRecipe(pWriter,Items.IRON_HORSE_ARMOR, Items.IRON_INGOT);
        horseArmorRecipe(pWriter,Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT);
        horseArmorRecipe(pWriter,Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND);

        // Saddle
        saddleRecipe(pWriter);

        // Items
        // Ingots Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.INGOT_NICKEL.get(), 3)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_NICKEL.get()), has(REOItems.INGOT_NICKEL.get()))
                .save(pWriter, "ingot_bronze_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_BRASS.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.INGOT_ZINC.get(), 3)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_ZINC.get()), has(REOItems.INGOT_ZINC.get()))
                .save(pWriter, "ingot_brass_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(), 2)
                .requires(Items.GOLD_INGOT, 2)
                .requires(REOItems.INGOT_SILVER.get(), 2)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(REOItems.INGOT_SILVER.get()), has(REOItems.INGOT_SILVER.get()))
                .save(pWriter, "ingot_electrum_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_STEEL.get(), 2)
                .requires(Items.IRON_INGOT)
                .requires(Items.COAL, 3)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(pWriter, "ingot_steel_from_alloy_crafting");

        // Dust Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_BRONZE.get(), 2)
                .requires(REOItems.DUST_COPPER.get())
                .requires(REOItems.DUST_NICKEL.get(), 3)
                .unlockedBy(getHasName(REOItems.DUST_COPPER.get()), has(REOItems.DUST_COPPER.get()))
                .unlockedBy(getHasName(REOItems.DUST_NICKEL.get()), has(REOItems.DUST_NICKEL.get()))
                .save(pWriter, "dust_bronze_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_BRASS.get(), 2)
                .requires(REOItems.DUST_COPPER.get())
                .requires(REOItems.DUST_ZINC.get(), 3)
                .unlockedBy(getHasName(REOItems.DUST_COPPER.get()), has(REOItems.DUST_COPPER.get()))
                .unlockedBy(getHasName(REOItems.DUST_ZINC.get()), has(REOItems.DUST_ZINC.get()))
                .save(pWriter, "dust_brass_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_ELECTRUM.get(), 2)
                .requires(REOItems.DUST_GOLD.get(), 2)
                .requires(REOItems.DUST_SILVER.get(), 2)
                .unlockedBy(getHasName(REOItems.DUST_GOLD.get()), has(REOItems.DUST_GOLD.get()))
                .unlockedBy(getHasName(REOItems.DUST_SILVER.get()), has(REOItems.DUST_SILVER.get()))
                .save(pWriter, "dust_electrum_from_alloy_crafting");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_STEEL.get(), 2)
                .requires(REOItems.DUST_IRON.get())
                .requires(REOItems.DUST_COAL.get(), 3)
                .unlockedBy(getHasName(REOItems.DUST_IRON.get()), has(REOItems.DUST_IRON.get()))
                .unlockedBy(getHasName(REOItems.DUST_COAL.get()), has(REOItems.DUST_COAL.get()))
                .save(pWriter, "dust_steel_from_alloy_crafting");

        // Nuggets
        nuggetRecipe(pWriter, REOItems.INGOT_ALUMINIUM.get(), REOItems.NUGGET_ALUMINIUM.get());
        nuggetRecipe(pWriter, REOItems.GEM_AMETHYST.get(), REOItems.NUGGET_AMETHYST.get());
        nuggetRecipe(pWriter, REOItems.INGOT_BRASS.get(), REOItems.NUGGET_BRASS.get());
        nuggetRecipe(pWriter, REOItems.INGOT_BRONZE.get(), REOItems.NUGGET_BRONZE.get());
        nuggetRecipe(pWriter, Items.COPPER_INGOT, REOItems.NUGGET_COPPER.get());
        nuggetRecipe(pWriter, Items.DIAMOND, REOItems.NUGGET_DIAMOND.get());
        nuggetRecipe(pWriter, REOItems.INGOT_ELECTRUM.get(), REOItems.NUGGET_ELECTRUM.get());
        nuggetRecipe(pWriter, Items.EMERALD, REOItems.NUGGET_EMERALD.get());
        nuggetRecipe(pWriter, REOItems.INGOT_ENDERITE.get(), REOItems.NUGGET_ENDERITE.get());
        nuggetRecipe(pWriter, REOItems.INGOT_LEAD.get(), REOItems.NUGGET_LEAD.get());
        nuggetRecipe(pWriter, Items.NETHERITE_INGOT, REOItems.NUGGET_NETHERITE.get());
        nuggetRecipe(pWriter, REOItems.INGOT_NICKEL.get(), REOItems.NUGGET_NICKEL.get());
        nuggetRecipe(pWriter, REOItems.GEM_PERIDOT.get(), REOItems.NUGGET_PERIDOT.get());
        nuggetRecipe(pWriter, REOItems.INGOT_PLATINUM.get(), REOItems.NUGGET_PLATINUM.get());
        nuggetRecipe(pWriter, REOItems.GEM_RUBY.get(), REOItems.NUGGET_RUBY.get());
        nuggetRecipe(pWriter, REOItems.GEM_SAPPHIRE.get(), REOItems.NUGGET_SAPPHIRE.get());
        nuggetRecipe(pWriter, REOItems.INGOT_SILVER.get(), REOItems.NUGGET_SILVER.get());
        nuggetRecipe(pWriter, REOItems.INGOT_STEEL.get(), REOItems.NUGGET_STEEL.get());
        nuggetRecipe(pWriter, REOItems.INGOT_TIN.get(), REOItems.NUGGET_TIN.get());
        nuggetRecipe(pWriter, REOItems.INGOT_ZINC.get(), REOItems.NUGGET_ZINC.get());

        // Ingots
        ingotRecipe(pWriter, REOItems.NUGGET_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());
        ingotRecipe(pWriter, REOItems.NUGGET_AMETHYST.get(), REOItems.GEM_AMETHYST.get());
        ingotRecipe(pWriter, REOItems.NUGGET_BRASS.get(), REOItems.INGOT_BRASS.get());
        ingotRecipe(pWriter, REOItems.NUGGET_BRONZE.get(), REOItems.INGOT_BRONZE.get());
        ingotRecipe(pWriter, REOItems.NUGGET_COPPER.get(), Items.COPPER_INGOT);
        ingotRecipe(pWriter, REOItems.NUGGET_DIAMOND.get(), Items.DIAMOND);
        ingotRecipe(pWriter, REOItems.NUGGET_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get());
        ingotRecipe(pWriter, REOItems.NUGGET_EMERALD.get(), Items.EMERALD);
        ingotRecipe(pWriter, REOItems.NUGGET_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());
        ingotRecipe(pWriter, REOItems.NUGGET_LEAD.get(), REOItems.INGOT_LEAD.get());
        ingotRecipe(pWriter, REOItems.NUGGET_NETHERITE.get(), Items.NETHERITE_INGOT);
        ingotRecipe(pWriter, REOItems.NUGGET_NICKEL.get(), REOItems.INGOT_NICKEL.get());
        ingotRecipe(pWriter, REOItems.NUGGET_PERIDOT.get(), REOItems.GEM_PERIDOT.get());
        ingotRecipe(pWriter, REOItems.NUGGET_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());
        ingotRecipe(pWriter, REOItems.NUGGET_RUBY.get(), REOItems.GEM_RUBY.get());
        ingotRecipe(pWriter, REOItems.NUGGET_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());
        ingotRecipe(pWriter, REOItems.NUGGET_SILVER.get(), REOItems.INGOT_SILVER.get());
        ingotRecipe(pWriter, REOItems.NUGGET_STEEL.get(), REOItems.INGOT_STEEL.get());
        ingotRecipe(pWriter, REOItems.NUGGET_TIN.get(), REOItems.INGOT_TIN.get());
        ingotRecipe(pWriter, REOItems.NUGGET_ZINC.get(), REOItems.INGOT_ZINC.get());

        // Luminous Powder
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_BLACK.get(), Items.BLACK_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_BLUE.get(), Items.BLUE_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_BROWN.get(), Items.BROWN_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_CYAN.get(), Items.CYAN_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_GRAY.get(), Items.GRAY_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_GREEN.get(), Items.GREEN_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_LIGHTBLUE.get(), Items.LIGHT_BLUE_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_LIGHTGRAY.get(), Items.LIGHT_GRAY_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_LIME.get(), Items.LIME_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_MAGENTA.get(), Items.MAGENTA_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_ORANGE.get(), Items.ORANGE_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_PINK.get(), Items.PINK_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_PURPLE.get(), Items.PURPLE_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_RED.get(), Items.RED_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_WHITE.get(), Items.WHITE_DYE);
        luminousDustRecipe(pWriter, REOItems.LUMINOUS_YELLOW.get(), Items.YELLOW_DYE);


        // Tech //
        // Gear
        // Base
        woodenGearRecipe(pWriter, REOItems.GEAR_WOODEN.get());
        stoneGearRecipe(pWriter, REOItems.GEAR_STONE.get());

        // Tier 1
        tier1GearRecipe(pWriter, REOItems.GEAR_IRON.get(), Items.IRON_INGOT);
        tier1GearRecipe(pWriter, REOItems.GEAR_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_BRASS.get(), REOItems.INGOT_BRASS.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_BRONZE.get(), REOItems.INGOT_BRONZE.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_COPPER.get(), Items.COPPER_INGOT);
        tier1GearRecipe(pWriter, REOItems.GEAR_LEAD.get(), REOItems.INGOT_LEAD.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_NICKEL.get(), REOItems.INGOT_NICKEL.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_SILVER.get(), REOItems.INGOT_SILVER.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_STEEL.get(), REOItems.INGOT_STEEL.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_TIN.get(), REOItems.INGOT_TIN.get());
        tier1GearRecipe(pWriter, REOItems.GEAR_ZINC.get(), REOItems.INGOT_ZINC.get());

        // Tier 2
        tier2GearRecipe(pWriter, REOItems.GEAR_AMETHYST.get(), REOItems.GEM_AMETHYST.get());
        tier2GearRecipe(pWriter, REOItems.GEAR_DIAMOND.get(), Items.DIAMOND);
        tier2GearRecipe(pWriter, REOItems.GEAR_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get());
        tier2GearRecipe(pWriter, REOItems.GEAR_EMERALD.get(), Items.EMERALD);
        tier2GearRecipe(pWriter, REOItems.GEAR_GOLDEN.get(), Items.GOLD_INGOT);
        tier2GearRecipe(pWriter, REOItems.GEAR_PERIDOT.get(), REOItems.GEM_PERIDOT.get());
        tier2GearRecipe(pWriter, REOItems.GEAR_RUBY.get(), REOItems.GEM_RUBY.get());
        tier2GearRecipe(pWriter, REOItems.GEAR_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());

        // Tier 3
        tier3GearRecipe(pWriter, REOItems.GEAR_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());
        tier3GearRecipe(pWriter, REOItems.GEAR_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());

        // Plate
        plateRecipe(pWriter, REOItems.PLATE_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());
        plateRecipe(pWriter, REOItems.PLATE_AMETHYST.get(), REOItems.GEM_AMETHYST.get());
        plateRecipe(pWriter, REOItems.PLATE_BRASS.get(), REOItems.INGOT_BRASS.get());
        plateRecipe(pWriter, REOItems.PLATE_BRONZE.get(), REOItems.INGOT_BRONZE.get());
        plateRecipe(pWriter, REOItems.PLATE_COPPER.get(), Items.COPPER_INGOT);
        plateRecipe(pWriter, REOItems.PLATE_DIAMOND.get(), Items.DIAMOND);
        plateRecipe(pWriter, REOItems.PLATE_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get());
        plateRecipe(pWriter, REOItems.PLATE_EMERALD.get(), Items.EMERALD);
        plateRecipe(pWriter, REOItems.PLATE_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());
        plateRecipe(pWriter, REOItems.PLATE_GOLDEN.get(), Items.GOLD_INGOT);
        plateRecipe(pWriter, REOItems.PLATE_IRON.get(), Items.IRON_INGOT);
        plateRecipe(pWriter, REOItems.PLATE_LEAD.get(), REOItems.INGOT_LEAD.get());
        plateRecipe(pWriter, REOItems.PLATE_NICKEL.get(), REOItems.INGOT_NICKEL.get());
        plateRecipe(pWriter, REOItems.PLATE_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());
        plateRecipe(pWriter, REOItems.PLATE_PERIDOT.get(), REOItems.GEM_PERIDOT.get());
        plateRecipe(pWriter, REOItems.PLATE_RUBY.get(), REOItems.GEM_RUBY.get());
        plateRecipe(pWriter, REOItems.PLATE_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());
        plateRecipe(pWriter, REOItems.PLATE_SILVER.get(), REOItems.INGOT_SILVER.get());
        plateRecipe(pWriter, REOItems.PLATE_STEEL.get(), REOItems.INGOT_STEEL.get());
        plateRecipe(pWriter, REOItems.PLATE_TIN.get(), REOItems.INGOT_TIN.get());
        plateRecipe(pWriter, REOItems.PLATE_ZINC.get(), REOItems.INGOT_ZINC.get());

    }

    protected static void stonecutterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), RecipeCategory.BUILDING_BLOCKS, pResult, pResultCount).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, getConversionRecipeName(pResult, pMaterial) + "_stonecutting");
    }

    protected static void shovelRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void pickaxeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void axeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hoeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void swordRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hammerRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hammerTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getSimpleRecipeName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void excavatorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void excavatorTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" S ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hatchetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hatchetTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void sickleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("  #")
                .pattern("S# ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }
    protected static void sickleTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("  #")
                .pattern("S# ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shearsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shearsTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }


    protected static void paxelRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pAxe, ItemLike pShovel, ItemLike pPickaxe) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pAxe)
                .define('@', pShovel)
                .define('?', pPickaxe)
                .define('S', Items.STICK)
                .pattern("#@?")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pPickaxe), has(pPickaxe))
                .save(pFinishedRecipeConsumer);
    }

    protected static void helmetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void chestplateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void legginsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bootsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void horseArmorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.LEATHER_HORSE_ARMOR)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bowRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.STRING)
                .pattern(" #@")
                .pattern("# @")
                .pattern(" #@")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bowTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.STRING)
                .pattern(" #@")
                .pattern("# @")
                .pattern(" #@")
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shieldRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.SHIELD)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void saddleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, Items.SADDLE)
                .define('#', Items.LEATHER)
                .define('@', Items.IRON_INGOT)
                .pattern(" # ")
                .pattern("#@#")
                .pattern("@ @")
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pFinishedRecipeConsumer);
    }

    protected static void nuggetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void ingotRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pItemResult, 9)
                .requires(pMaterial).group("ingot")
                .unlockedBy(getHasName(pItemResult), has(pItemResult))
                .save(pFinishedRecipeConsumer);
    }

    protected static void luminousDustRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pDust, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pDust, 9)
                .define('#', pMaterial)
                .define('G', Items.GLOWSTONE_DUST)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void lampRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pLamp, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pLamp)
                .define('#', pMaterial)
                .define('G', Items.REDSTONE_TORCH)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void stairsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pItemResult, 4)
                .define('#', pMaterial)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }


    protected static void fenceRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#S#")
                .pattern("#S#")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void fenceGateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("S#S")
                .pattern("S#S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void signRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hangingSignRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 6)
                .define('#', pMaterial)
                .define('S', Items.CHAIN)
                .pattern("S S")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void doorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult, 3)
                .define('#', pMaterial)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void trapdoorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult, 2)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void planksFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pPlanks, Ingredient pLog) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlanks, 4)
                .requires(pLog).group("planks")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer);
    }

    protected static void woodFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pWood, ItemLike pLog) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pWood, 3)
                .requires(pLog, 4).group("planks")
                .unlockedBy(getHasName(pLog), has(pLog))
                .save(pFinishedRecipeConsumer);
    }


    protected static void resistantRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pWood) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pWood).requires(Items.HONEYCOMB)
                .group("wood")
                .unlockedBy(getHasName(pWood), has(pWood))
                .save(pFinishedRecipeConsumer);
    }

    protected static void buttonRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pPlanks) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, pItemResult)
                .requires(pPlanks).group("planks")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer);
    }


    protected static void pressurePlateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pPlanks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult)
                .define('#', pPlanks)
                .pattern("##")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer);
    }

    protected static void seedRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pItemFrom) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, pItemResult)
                .requires(pItemFrom).group("seeds")
                .unlockedBy(getHasName(pItemFrom), has(pItemFrom))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_"+ getItemName(pItemFrom));
    }

    protected static void flourRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, pItemResult)
                .define('#', pMaterial)
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void breadLikeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void boatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void chestBoatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pBoat) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, pItemResult)
                .requires(pBoat).requires(Blocks.CHEST).group("chest_boat")
                .unlockedBy(getHasName(pBoat), has(pBoat))
                .save(pFinishedRecipeConsumer);
    }

    protected static void woodenGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', Items.STICK)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pFinishedRecipeConsumer);
    }

    protected static void stoneGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', ItemTags.STONE_TOOL_MATERIALS)
                .define('G', REOItems.GEAR_WOODEN.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(REOItems.GEAR_WOODEN.get()), has(REOItems.GEAR_WOODEN.get()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier1GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOItems.GEAR_STONE.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier2GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOItems.GEAR_IRON.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier3GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOTags.Items.GEM_GEAR_TIER)
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void plateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

}
