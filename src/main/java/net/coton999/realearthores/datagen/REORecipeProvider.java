package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.datagen.custom.AlloyFurnaceRecipeBuilder;
import net.coton999.realearthores.datagen.custom.CrusherRecipeBuilder;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.core.NonNullList;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class REORecipeProvider extends RecipeProvider implements IConditionBuilder {

    // Ores //
    private static final List<ItemLike> AMETHYST_SMELTABLES = List.of(Blocks.AMETHYST_CLUSTER,
            REOItems.DUST_AMETHYST.get(), REOItems.DUST_DIRTY_AMETHYST.get());

    private static final List<ItemLike> ALUMINIUM_SMELTABLES = List.of(REOItems.RAW_ALUMINIUM.get(),
            REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.NETHER_ALUMINIUM.get(),
            REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), REOItems.DUST_DIRTY_ALUMINIUM.get());

    private static final List<ItemLike> BRASS_SMELTABLES = List.of(REOItems.DUST_BRASS.get(), REOItems.DUST_DIRTY_BRASS.get());

    private static final List<ItemLike> BRONZE_SMELTABLES = List.of(REOItems.DUST_BRONZE.get(), REOItems.DUST_DIRTY_BRONZE.get());

    private static final List<ItemLike> CHARCOAL_SMELTABLES = List.of(REOItems.DUST_CHARCOAL.get());

    private static final List<ItemLike> COAL_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_COAL.get(), REOBlocks.NETHER_COAL.get(),
            REOItems.DUST_COAL.get());

    private static final List<ItemLike> COPPER_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(),
            REOItems.DUST_COPPER.get(), REOItems.DUST_DIRTY_COPPER.get());

    private static final List<ItemLike> DIAMOND_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(),
            REOItems.DUST_DIAMOND.get(), REOItems.DUST_DIRTY_DIAMOND.get());

    private static final List<ItemLike> ELECTRUM_SMELTABLES = List.of(REOItems.DUST_ELECTRUM.get(), REOItems.DUST_DIRTY_ELECTRUM.get());

    private static final List<ItemLike> EMERALD_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(),
            REOItems.DUST_EMERALD.get(), REOItems.DUST_DIRTY_EMERALD.get());

    private static final List<ItemLike> ENDERITE_SMELTABLES = List.of(REOItems.RAW_ENDERITE.get(),
            REOBlocks.ORE_ENDERITE.get(), REOItems.DUST_ENDERITE.get(), REOItems.DUST_DIRTY_ENDERITE.get());

    private static final List<ItemLike> GOLD_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.DUST_GOLD.get(),
            REOItems.DUST_DIRTY_GOLD.get());

    private static final List<ItemLike> IRON_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(),
            REOItems.DUST_IRON.get(), REOItems.DUST_DIRTY_IRON.get());

    private static final List<ItemLike> LAPIS_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_LAPIS.get(), REOBlocks.NETHER_LAPIS.get());

    private static final List<ItemLike> LEAD_SMELTABLES = List.of(REOItems.RAW_LEAD.get(),
            REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.NETHER_LEAD.get(),
            REOBlocks.GRAVEL_ORE_LEAD.get(), REOItems.DUST_LEAD.get(), REOItems.DUST_DIRTY_LEAD.get());

    private static final List<ItemLike> NICKEL_SMELTABLES = List.of(REOItems.RAW_NICKEL.get(),
            REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.NETHER_NICKEL.get(),
            REOBlocks.GRAVEL_ORE_NICKEL.get(), REOItems.DUST_NICKEL.get(), REOItems.DUST_DIRTY_NICKEL.get());

    private static final List<ItemLike> PERIDOT_SMELTABLES = List.of(REOBlocks.CLUSTER_PERIDOT.get(),
            REOItems.DUST_PERIDOT.get(), REOItems.DUST_DIRTY_PERIDOT.get());

    private static final List<ItemLike> PLATINUM_SMELTABLES = List.of(REOItems.RAW_PLATINUM.get(),
            REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.NETHER_PLATINUM.get(),
            REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), REOItems.DUST_DIRTY_PLATINUM.get());


    private static final List<ItemLike> REDSTONE_SMELTABLES = List.of(REOBlocks.GRAVEL_ORE_REDSTONE.get(),
            REOBlocks.NETHER_REDSTONE.get());

    private static final List<ItemLike> RUBY_SMELTABLES = List.of(REOBlocks.CLUSTER_RUBY.get(),
            REOItems.DUST_RUBY.get(), REOItems.DUST_DIRTY_RUBY.get());

    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(REOBlocks.CLUSTER_SAPPHIRE.get(),
            REOItems.DUST_SAPPHIRE.get(), REOItems.DUST_DIRTY_SAPPHIRE.get());

    private static final List<ItemLike> SILVER_SMELTABLES = List.of(REOItems.RAW_SILVER.get(),
            REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.NETHER_SILVER.get(),
            REOBlocks.GRAVEL_ORE_SILVER.get(), REOItems.DUST_SILVER.get(), REOItems.DUST_DIRTY_SILVER.get());

    private static final List<ItemLike> STEEL_SMELTABLES = List.of(Items.IRON_INGOT,
            REOItems.DUST_STEEL.get(), REOItems.DUST_DIRTY_STEEL.get());

    private static final List<ItemLike> TIN_SMELTABLES = List.of(REOItems.RAW_TIN.get(),
            REOBlocks.ORE_TIN.get(), REOBlocks.NETHER_TIN.get(),
            REOBlocks.GRAVEL_ORE_TIN.get(), REOItems.DUST_TIN.get(), REOItems.DUST_DIRTY_TIN.get());

    private static final List<ItemLike> URANIUM_SMELTABLES = List.of(REOItems.RAW_URANIUM.get(),
            REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.NETHER_URANIUM.get(),
            REOBlocks.GRAVEL_ORE_URANIUM.get(), REOItems.DUST_URANIUM.get(), REOItems.DUST_DIRTY_URANIUM.get());

    private static final List<ItemLike> ZINC_SMELTABLES = List.of(REOItems.RAW_ZINC.get(),
            REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.NETHER_ZINC.get(),
            REOBlocks.GRAVEL_ORE_ZINC.get(), REOItems.DUST_ZINC.get(), REOItems.DUST_DIRTY_ZINC.get());

    // Misc //
    private static final List<ItemLike> RUBBER_SMELTABLES = List.of(REOItems.SAP.get(), REOItems.RESIN.get());


    public REORecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Vanilla Furnace //
        // Building Blocks
        oreSmelting(pWriter, List.of(REOBlocks.MARBLE_COBBLE.get()), RecipeCategory.MISC,
                REOBlocks.MARBLE.get(), 0.1f, 100, "marble");
        oreSmelting(pWriter, List.of(REOBlocks.MARBLE_CRACKED.get()), RecipeCategory.MISC,
                REOBlocks.MARBLE_COBBLE.get(), 0.1f, 200, "marble_cracked");
        oreSmelting(pWriter, List.of(REOBlocks.LIMESTONE_COBBLE.get()), RecipeCategory.MISC,
                REOBlocks.LIMESTONE.get(), 0.1f, 200, "limestone");
        oreSmelting(pWriter, List.of(REOBlocks.LIMESTONE_CRACKED.get()), RecipeCategory.MISC,
                REOBlocks.LIMESTONE_COBBLE.get(), 0.1f, 200, "limestone_cracked");

        // Ores
        oreSmelting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_AMETHYST.get(),
                0.7f, 200, "gem_amethyst");
        oreSmelting(pWriter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(),
                0.7f, 200, "ingot_aluminium");
        oreSmelting(pWriter, BRASS_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_BRASS.get(),
                0.7f, 200, "ingot_brass");
        oreSmelting(pWriter, BRONZE_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(),
                0.7f, 200, "ingot_bronze");
        oreSmelting(pWriter, CHARCOAL_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL,
                0.7f, 200, "charcoal");
        oreSmelting(pWriter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.7f, 200, "coal");
        oreSmelting(pWriter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 200, "ingot_copper");
        oreSmelting(pWriter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                0.7f, 200, "diamond");
        oreSmelting(pWriter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                0.7f, 200, "emerald");
        oreSmelting(pWriter, ELECTRUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(),
                0.7f, 200, "ingot_electrum");
        oreSmelting(pWriter, ENDERITE_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(),
                0.7f, 200, "ingot_enderite");
        oreSmelting(pWriter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                0.7f, 200, "ingot_gold");
        oreSmelting(pWriter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 200, "ingot_iron");
        oreSmelting(pWriter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.7f, 200, "lapis_lazuli");
        oreSmelting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_LEAD.get(),
                0.7f, 200, "ingot_lead");
        oreSmelting(pWriter, NICKEL_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(),
                0.7f, 200, "ingot_nickel");
        oreSmelting(pWriter, PERIDOT_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_PERIDOT.get(),
                0.7f, 200, "gem_peridot");
        oreSmelting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(),
                0.7f, 200, "ingot_platinum");
        oreSmelting(pWriter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 200, "redstone");
        oreSmelting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_RUBY.get(),
                0.7f, 200, "gem_ruby");
        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_SAPPHIRE.get(),
                0.7f, 200, "gem_sapphire");
        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_SILVER.get(),
                0.7f, 200, "ingot_silver");
        oreSmelting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_STEEL.get(),
                0.7f, 200, "ingot_steel");
        oreSmelting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_TIN.get(),
                0.7f, 200, "ingot_tin");
        oreSmelting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_URANIUM.get(),
                0.7f, 200, "ingot_uranium");
        oreSmelting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ZINC.get(),
                0.7f, 200, "ingot_zinc");

        // Misc
        oreSmelting(pWriter, RUBBER_SMELTABLES, RecipeCategory.MISC, REOItems.RUBBER.get(),
                0.5f, 200, "rubber");


        //dustSmelting(pWriter, List.of(ModItems.DUST_OBSIDIAN.get()), RecipeCategory.MISC,
        //        ModItems.INGOT_OBSIDIAN.get(), 0.7f, 200, "dust_obsidian");

        // Food
        oreSmelting(pWriter, List.of(REOItems.FLOUR_BARLEY.get()), RecipeCategory.MISC,
                Items.BREAD, 0.35f, 200, "flour_barley");
        oreSmelting(pWriter, List.of(REOItems.FLOUR_WHEAT.get()), RecipeCategory.MISC,
                Items.BREAD, 0.35f, 200, "flour_wheat");


        // Blast Furnace //
        // Ores
        oreBlasting(pWriter, AMETHYST_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_AMETHYST.get(),
                0.7f, 100, "gem_amethyst");
        oreBlasting(pWriter, ALUMINIUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(),
                0.7f, 100, "ingot_aluminium");
        oreBlasting(pWriter, BRASS_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_BRASS.get(),
                0.7f, 100, "ingot_brass");
        oreBlasting(pWriter, BRONZE_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(),
                0.7f, 100, "ingot_bronze");
        oreBlasting(pWriter, CHARCOAL_SMELTABLES, RecipeCategory.MISC, Items.CHARCOAL,
                0.7f, 100, "charcoal");
        oreBlasting(pWriter, COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL,
                0.7f, 100, "coal");
        oreBlasting(pWriter, COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT,
                0.7f, 100, "ingot_copper");
        oreBlasting(pWriter, DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND,
                0.7f, 100, "diamond");
        oreBlasting(pWriter, EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD,
                0.7f, 100, "emerald");
        oreBlasting(pWriter, ELECTRUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(),
                0.7f, 100, "ingot_electrum");
        oreBlasting(pWriter, ENDERITE_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(),
                0.7f, 100, "ingot_enderite");
        oreBlasting(pWriter, GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT,
                0.7f, 100, "ingot_gold");
        oreBlasting(pWriter, IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT,
                0.7f, 100, "ingot_iron");
        oreBlasting(pWriter, LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI,
                0.7f, 100, "lapis_lazuli");
        oreBlasting(pWriter, LEAD_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_LEAD.get(),
                0.7f, 100, "ingot_lead");
        oreBlasting(pWriter, NICKEL_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(),
                0.7f, 100, "ingot_nickel");
        oreBlasting(pWriter, PERIDOT_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_PERIDOT.get(),
                0.7f, 100, "gem_peridot");
        oreBlasting(pWriter, PLATINUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(),
                0.7f, 100, "ingot_platinum");
        oreBlasting(pWriter, REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE,
                0.7f, 100, "redstone");
        oreBlasting(pWriter, RUBY_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_RUBY.get(),
                0.7f, 100, "gem_ruby");
        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, REOItems.GEM_SAPPHIRE.get(),
                0.7f, 100, "gem_sapphire");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_SILVER.get(),
                0.7f, 100, "ingot_silver");
        oreBlasting(pWriter, STEEL_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_STEEL.get(),
                0.7f, 100, "ingot_steel");
        oreBlasting(pWriter, TIN_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_TIN.get(),
                0.7f, 100, "ingot_tin");
        oreBlasting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_URANIUM.get(),
                0.7f, 100, "ingot_uranium");
        oreBlasting(pWriter, ZINC_SMELTABLES, RecipeCategory.MISC, REOItems.INGOT_ZINC.get(),
                0.7f, 200, "ingot_zinc");

        //dustBlasting(pWriter, List.of(ModItems.DUST_OBSIDIAN.get()), RecipeCategory.MISC,
        //        ModItems.INGOT_OBSIDIAN.get(), 0.7f, 100, "dust_obsidian");


        // SMOKER //
        // Food
        foodCooking(pWriter, RecipeSerializer.SMOKING_RECIPE,
                List.of(REOItems.FLOUR_BARLEY.get()), RecipeCategory.FOOD, Items.BREAD,
                0.35f, 100, "flour_barley", "_from_smoking_");
        foodCooking(pWriter, RecipeSerializer.SMOKING_RECIPE,
                List.of(REOItems.FLOUR_WHEAT.get()), RecipeCategory.FOOD, Items.BREAD,
                0.35f, 100, "flour_wheat", "_from_smoking_");

        // Misc
        foodCooking(pWriter, RecipeSerializer.SMOKING_RECIPE,
                RUBBER_SMELTABLES, RecipeCategory.MISC, REOItems.RUBBER.get(),
                0.5f, 100, "rubber", "_from_smoking_");

        // Campfire //
        // Food
        foodCooking(pWriter, RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
                List.of(REOItems.FLOUR_BARLEY.get()), RecipeCategory.FOOD, Items.BREAD,
                0.35f, 100, "flour_barley", "_from_campfire_");
        foodCooking(pWriter, RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
                List.of(REOItems.FLOUR_WHEAT.get()), RecipeCategory.FOOD, Items.BREAD,
                0.35f, 100, "flour_wheat", "_from_campfire_");

        // Misc
        foodCooking(pWriter, RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
                RUBBER_SMELTABLES, RecipeCategory.MISC, REOItems.RUBBER.get(),
                0.5f, 100, "rubber", "_from_campfire_");

        // Crusher //
        // Overworld Ores
        new CrusherRecipeBuilder(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.ORE_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), 2)
                .unlockedBy("has_ore_aluminium", has(REOBlocks.ORE_ALUMINIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), 2)
                .unlockedBy("has_ore_aluminium", has(REOBlocks.DEEPSLATE_ALUMINIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(Blocks.AMETHYST_CLUSTER, Blocks.AMETHYST_CLUSTER, REOItems.DUST_AMETHYST.get(), 2)
                .unlockedBy("has_cluster_amethyst", has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.COAL_ORE, Blocks.COAL_ORE, REOItems.DUST_COAL.get(), 2)
                .unlockedBy("has_ore_coal", has(Blocks.COAL_ORE)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.COPPER_ORE, Blocks.COPPER_ORE, REOItems.DUST_COPPER.get(), 2)
                .unlockedBy("has_ore_copper", has(Blocks.COPPER_ORE)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.DIAMOND_ORE, Blocks.DIAMOND_ORE, REOItems.DUST_DIAMOND.get(), 2)
                .unlockedBy("has_ore_diamond", has(Blocks.DIAMOND_ORE)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.EMERALD_ORE, Blocks.EMERALD_ORE, REOItems.DUST_EMERALD.get(), 2)
                .unlockedBy("has_ore_emerald", has(Blocks.EMERALD_ORE)).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_ENDERITE.get(), REOBlocks.ORE_ENDERITE.get(), REOItems.DUST_ENDERITE.get(), 2)
                .unlockedBy("has_ore_enderite", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter);
        new CrusherRecipeBuilder(Blocks.GOLD_ORE, Blocks.GOLD_ORE, REOItems.DUST_GOLD.get(), 2)
                .unlockedBy("has_ore_gold", has(Blocks.GOLD_ORE)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.IRON_ORE, Blocks.IRON_ORE, REOItems.DUST_IRON.get(), 2)
                .unlockedBy("has_ore_iron", has(Blocks.IRON_ORE)).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_LEAD.get(), REOBlocks.ORE_LEAD.get(), REOItems.DUST_LEAD.get(), 2)
                .unlockedBy("has_ore_lead", has(REOBlocks.ORE_LEAD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOItems.DUST_LEAD.get(), 2)
                .unlockedBy("has_ore_lead", has(REOBlocks.DEEPSLATE_LEAD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_NICKEL.get(), REOBlocks.ORE_NICKEL.get(), REOItems.DUST_NICKEL.get(), 2)
                .unlockedBy("has_ore_nickel", has(REOBlocks.ORE_NICKEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOItems.DUST_NICKEL.get(), 2)
                .unlockedBy("has_ore_nickel", has(REOBlocks.DEEPSLATE_NICKEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.CLUSTER_PERIDOT.get(), REOBlocks.CLUSTER_PERIDOT.get(), REOItems.DUST_PERIDOT.get(), 2)
                .unlockedBy("has_cluster_peridot", has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_PLATINUM.get(), REOBlocks.ORE_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), 2)
                .unlockedBy("has_ore_platinum", has(REOBlocks.ORE_PLATINUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), 2)
                .unlockedBy("has_ore_platinum", has(REOBlocks.DEEPSLATE_PLATINUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.CLUSTER_RUBY.get(), REOBlocks.CLUSTER_RUBY.get(), REOItems.DUST_RUBY.get(), 2)
                .unlockedBy("has_cluster_ruby", has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.CLUSTER_SAPPHIRE.get(), REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.DUST_SAPPHIRE.get(), 2)
                .unlockedBy("has_cluster_sapphire", has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_SILVER.get(), REOBlocks.ORE_SILVER.get(), REOItems.DUST_SILVER.get(), 2)
                .unlockedBy("has_ore_silver", has(REOBlocks.ORE_SILVER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOItems.DUST_SILVER.get(), 2)
                .unlockedBy("has_ore_silver", has(REOBlocks.DEEPSLATE_SILVER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_TIN.get(), REOBlocks.ORE_TIN.get(), REOItems.DUST_TIN.get(), 2)
                .unlockedBy("has_ore_tin", has(REOBlocks.ORE_TIN.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_URANIUM.get(), REOBlocks.ORE_URANIUM.get(), REOItems.DUST_URANIUM.get(), 2)
                .unlockedBy("has_ore_uranium", has(REOBlocks.ORE_URANIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOItems.DUST_URANIUM.get(), 2)
                .unlockedBy("has_ore_uranium", has(REOBlocks.DEEPSLATE_URANIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.ORE_ZINC.get(), REOBlocks.ORE_ZINC.get(), REOItems.DUST_ZINC.get(), 2)
                .unlockedBy("has_ore_zinc", has(REOBlocks.ORE_ZINC.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOItems.DUST_ZINC.get(), 2)
                .unlockedBy("has_ore_zinc", has(REOBlocks.DEEPSLATE_ZINC.get())).save(pWriter);


        // Gravel
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), 2)
                .unlockedBy("has_gravel_ore_aluminium", has(REOBlocks.GRAVEL_ORE_ALUMINIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_COAL.get(), REOBlocks.GRAVEL_ORE_COAL.get(), REOItems.DUST_COAL.get(), 2)
                .unlockedBy("has_gravel_ore_coal", has(REOBlocks.GRAVEL_ORE_COAL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.GRAVEL_ORE_COPPER.get(), REOItems.DUST_COPPER.get(), 2)
                .unlockedBy("has_gravel_ore_copper", has(REOBlocks.GRAVEL_ORE_COPPER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOItems.DUST_DIAMOND.get(), 2)
                .unlockedBy("has_gravel_ore_diamond", has(REOBlocks.GRAVEL_ORE_DIAMOND.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.GRAVEL_ORE_EMERALD.get(), REOItems.DUST_EMERALD.get(), 2)
                .unlockedBy("has_gravel_ore_emerald", has(REOBlocks.GRAVEL_ORE_EMERALD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_GOLD.get(), REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.DUST_GOLD.get(), 2)
                .unlockedBy("has_gravel_ore_gold", has(REOBlocks.GRAVEL_ORE_GOLD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.GRAVEL_ORE_IRON.get(), REOItems.DUST_IRON.get(), 2)
                .unlockedBy("has_gravel_ore_iron", has(REOBlocks.GRAVEL_ORE_IRON.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_LEAD.get(), REOBlocks.GRAVEL_ORE_LEAD.get(), REOItems.DUST_LEAD.get(), 2)
                .unlockedBy("has_gravel_ore_lead", has(REOBlocks.GRAVEL_ORE_LEAD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_NICKEL.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(), REOItems.DUST_NICKEL.get(), 2)
                .unlockedBy("has_gravel_ore_nickel", has(REOBlocks.GRAVEL_ORE_NICKEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), 2)
                .unlockedBy("has_gravel_ore_platinum", has(REOBlocks.GRAVEL_ORE_PLATINUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_SILVER.get(), REOBlocks.GRAVEL_ORE_SILVER.get(), REOItems.DUST_SILVER.get(), 2)
                .unlockedBy("has_gravel_ore_silver", has(REOBlocks.GRAVEL_ORE_SILVER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_TIN.get(), REOBlocks.GRAVEL_ORE_TIN.get(), REOItems.DUST_TIN.get(), 2)
                .unlockedBy("has_gravel_ore_tin", has(REOBlocks.GRAVEL_ORE_TIN.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_URANIUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(), REOItems.DUST_URANIUM.get(), 2)
                .unlockedBy("has_gravel_ore_uranium", has(REOBlocks.GRAVEL_ORE_URANIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.GRAVEL_ORE_ZINC.get(), REOBlocks.GRAVEL_ORE_ZINC.get(), REOItems.DUST_ZINC.get(), 2)
                .unlockedBy("has_gravel_ore_zinc", has(REOBlocks.GRAVEL_ORE_ZINC.get())).save(pWriter);

        // Nether
        new CrusherRecipeBuilder(REOBlocks.NETHER_ALUMINIUM.get(), REOBlocks.NETHER_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), 1)
                .unlockedBy("has_nether_aluminium", has(REOBlocks.NETHER_ALUMINIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_COAL.get(), REOBlocks.NETHER_COAL.get(), REOItems.DUST_COAL.get(), 1)
                .unlockedBy("has_NETHER_coal", has(REOBlocks.NETHER_COAL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_COPPER.get(), REOBlocks.NETHER_COPPER.get(), REOItems.DUST_COPPER.get(), 1)
                .unlockedBy("has_nether_copper", has(REOBlocks.NETHER_COPPER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(), REOItems.DUST_DIAMOND.get(), 1)
                .unlockedBy("has_nether_diamond", has(REOBlocks.NETHER_DIAMOND.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(), REOItems.DUST_EMERALD.get(), 1)
                .unlockedBy("has_nether_emerald", has(REOBlocks.NETHER_EMERALD.get())).save(pWriter);
        new CrusherRecipeBuilder(Blocks.NETHER_GOLD_ORE, Blocks.NETHER_GOLD_ORE, REOItems.DUST_GOLD.get(), 1)
                .unlockedBy("has_nether_gold", has(Blocks.NETHER_GOLD_ORE)).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_IRON.get(), REOBlocks.NETHER_IRON.get(), REOItems.DUST_IRON.get(), 1)
                .unlockedBy("has_nether_iron", has(REOBlocks.NETHER_IRON.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_LEAD.get(), REOBlocks.NETHER_LEAD.get(), REOItems.DUST_LEAD.get(), 1)
                .unlockedBy("has_nether_lead", has(REOBlocks.NETHER_LEAD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_NICKEL.get(), REOBlocks.NETHER_NICKEL.get(), REOItems.DUST_NICKEL.get(), 1)
                .unlockedBy("has_nether_nickel", has(REOBlocks.NETHER_NICKEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_PLATINUM.get(), REOBlocks.NETHER_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), 1)
                .unlockedBy("has_nether_platinum", has(REOBlocks.NETHER_PLATINUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_SILVER.get(), REOBlocks.NETHER_SILVER.get(), REOItems.DUST_SILVER.get(), 1)
                .unlockedBy("has_nether_silver", has(REOBlocks.NETHER_SILVER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_TIN.get(), REOBlocks.NETHER_TIN.get(), REOItems.DUST_TIN.get(), 1)
                .unlockedBy("has_nether_tin", has(REOBlocks.NETHER_TIN.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_URANIUM.get(), REOBlocks.NETHER_URANIUM.get(), REOItems.DUST_URANIUM.get(), 1)
                .unlockedBy("has_nether_uranium", has(REOBlocks.NETHER_URANIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOBlocks.NETHER_ZINC.get(), REOBlocks.NETHER_ZINC.get(), REOItems.DUST_ZINC.get(), 1)
                .unlockedBy("has_nether_zinc", has(REOBlocks.NETHER_ZINC.get())).save(pWriter);


        // Misc
        new CrusherRecipeBuilder(Items.CHARCOAL, Items.CHARCOAL, REOItems.DUST_CHARCOAL.get(), 1)
                .unlockedBy("has_charcoal", has(Items.CHARCOAL)).save(pWriter);
        new CrusherRecipeBuilder(Items.COAL, Items.COAL, REOItems.DUST_COAL.get(), 1)
                .unlockedBy("has_coal", has(Items.COAL)).save(pWriter);
        new CrusherRecipeBuilder(Blocks.OBSIDIAN, Blocks.OBSIDIAN, REOItems.DUST_OBSIDIAN.get(), 2)
                .unlockedBy("has_obsidian", has(Blocks.OBSIDIAN)).save(pWriter);

        // Ingots
        new CrusherRecipeBuilder(REOItems.INGOT_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get(), REOItems.DUST_ALUMINIUM.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(REOItems.INGOT_ALUMINIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.GEM_AMETHYST.get(), REOItems.GEM_AMETHYST.get(), REOItems.DUST_AMETHYST.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(REOItems.GEM_AMETHYST.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_BRASS.get(), REOItems.INGOT_BRASS.get(), REOItems.DUST_BRASS.get(), 1)
                .unlockedBy("has_ingot_brass", has(REOItems.INGOT_BRASS.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_BRONZE.get(), REOItems.INGOT_BRONZE.get(), REOItems.DUST_BRONZE.get(), 1)
                .unlockedBy("has_ingot_bronze", has(REOItems.INGOT_BRONZE.get())).save(pWriter);
        new CrusherRecipeBuilder(Items.DIAMOND, Items.DIAMOND, REOItems.DUST_DIAMOND.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(Items.DIAMOND)).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get(), REOItems.DUST_ELECTRUM.get(), 1)
                .unlockedBy("has_ingot_electrum", has(REOItems.INGOT_ELECTRUM.get())).save(pWriter);
        new CrusherRecipeBuilder(Items.EMERALD, Items.EMERALD, REOItems.DUST_EMERALD.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(Items.EMERALD)).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_ENDERITE.get(), REOItems.INGOT_ENDERITE.get(), REOItems.DUST_ENDERITE.get(), 1)
                .unlockedBy("has_ingot_enderite", has(REOItems.INGOT_ENDERITE.get())).save(pWriter);
        new CrusherRecipeBuilder(Items.GOLD_INGOT, Items.GOLD_INGOT, REOItems.DUST_GOLD.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(Items.GOLD_INGOT)).save(pWriter);
        new CrusherRecipeBuilder(Items.IRON_INGOT, Items.IRON_INGOT, REOItems.DUST_IRON.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(Items.IRON_INGOT)).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_LEAD.get(), REOItems.INGOT_LEAD.get(), REOItems.DUST_LEAD.get(), 1)
                .unlockedBy("has_ingot_lead", has(REOItems.INGOT_LEAD.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_NICKEL.get(), REOItems.INGOT_NICKEL.get(), REOItems.DUST_NICKEL.get(), 1)
                .unlockedBy("has_ingot_nickel", has(REOItems.INGOT_NICKEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.GEM_PERIDOT.get(), REOItems.GEM_PERIDOT.get(), REOItems.DUST_PERIDOT.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(REOItems.GEM_PERIDOT.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_PLATINUM.get(), REOItems.INGOT_PLATINUM.get(), REOItems.DUST_PLATINUM.get(), 1)
                .unlockedBy("has_ingot_platinum", has(REOItems.INGOT_PLATINUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.GEM_RUBY.get(), REOItems.GEM_RUBY.get(), REOItems.DUST_RUBY.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(REOItems.GEM_RUBY.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.GEM_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get(), REOItems.DUST_SAPPHIRE.get(), 1)
                .unlockedBy("has_ingot_aluminium", has(REOItems.GEM_SAPPHIRE.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_SILVER.get(), REOItems.INGOT_SILVER.get(), REOItems.DUST_SILVER.get(), 1)
                .unlockedBy("has_ingot_silver", has(REOItems.INGOT_SILVER.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_STEEL.get(), REOItems.INGOT_STEEL.get(), REOItems.DUST_STEEL.get(), 1)
                .unlockedBy("has_ingot_steel", has(REOItems.INGOT_STEEL.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_TIN.get(), REOItems.INGOT_TIN.get(), REOItems.DUST_TIN.get(), 1)
                .unlockedBy("has_ingot_tin", has(REOItems.INGOT_TIN.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_URANIUM.get(), REOItems.INGOT_URANIUM.get(), REOItems.DUST_URANIUM.get(), 1)
                .unlockedBy("has_ingot_uranium", has(REOItems.INGOT_URANIUM.get())).save(pWriter);
        new CrusherRecipeBuilder(REOItems.INGOT_ZINC.get(), REOItems.INGOT_ZINC.get(), REOItems.DUST_ZINC.get(), 1)
                .unlockedBy("has_ingot_zinc", has(REOItems.INGOT_ZINC.get())).save(pWriter);

        // Alloy Furnace //
        // Ingots
        new AlloyFurnaceRecipeBuilder(NonNullList.of(Ingredient.of(REOItems.DUST_COPPER.get(), REOItems.DUST_TIN.get())), REOItems.INGOT_BRONZE.get(), 2)
                .unlockedBy("has_dust_tin", has(REOItems.DUST_TIN.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(NonNullList.of(Ingredient.of(REOItems.DUST_COPPER.get(), REOItems.DUST_ZINC.get())), REOItems.INGOT_BRASS.get(), 2)
                .unlockedBy("has_dust_zinc", has(REOItems.DUST_ZINC.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(NonNullList.of(Ingredient.of(REOItems.DUST_GOLD.get(), REOItems.DUST_SILVER.get())), REOItems.INGOT_ELECTRUM.get(), 1)
                .unlockedBy("has_dust_silver", has(REOItems.DUST_SILVER.get())).save(pWriter);

        // Blocks //
        // Storage
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_ALUMINIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_ALUMINIUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_ENDERITE.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_ENDERITE.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_LEAD.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_LEAD.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_NICKEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_NICKEL.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_PLATINUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_PLATINUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_SILVER.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_SILVER.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_STEEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_STEEL.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_TIN.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_TIN.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_URANIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_URANIUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.INGOT_ZINC.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_ZINC.get());

        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_PERIDOT.get(), REOItems.SHARD_PERIDOT.get());
        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_RUBY.get(), REOItems.SHARD_RUBY.get());
        twoByTwoPacker(pWriter, RecipeCategory.MISC, REOBlocks.BLOCK_SAPPHIRE.get(), REOItems.SHARD_SAPPHIRE.get());

        // Raw Storage
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_ALUMINIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ALUMINIUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_ENDERITE.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ENDERITE.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_LEAD.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_LEAD.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_NICKEL.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_NICKEL.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_PLATINUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_PLATINUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_SILVER.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_SILVER.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_TIN.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_TIN.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_URANIUM.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_URANIUM.get());
        nineBlockStorageRecipes(pWriter, RecipeCategory.BUILDING_BLOCKS, REOItems.RAW_ZINC.get(), RecipeCategory.MISC,
                REOBlocks.BLOCK_RAW_ZINC.get());


        // Building Blocks
        // Marble
        cut(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_BRICK.get(), REOBlocks.MARBLE.get());
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_STAIRS.get(), REOBlocks.MARBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_SLAB.get(), REOBlocks.MARBLE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE.get());
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_COBBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_COBBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE.get());

        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_BRICK.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_STAIRS.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_COBBLE_STAIRS.get(), REOBlocks.MARBLE_COBBLE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_SLAB.get(), REOBlocks.MARBLE.get(), 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_COBBLE_SLAB.get(), REOBlocks.MARBLE_COBBLE.get(), 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_WALL.get(), REOBlocks.MARBLE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.MARBLE_COBBLE_WALL.get(), REOBlocks.MARBLE_COBBLE.get(), 1);

        // limestone
        cut(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_BRICK.get(), REOBlocks.LIMESTONE.get());
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_STAIRS.get(), REOBlocks.LIMESTONE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_SLAB.get(), REOBlocks.LIMESTONE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE.get());
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_COBBLE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_COBBLE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE.get());
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE.get());

        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_BRICK.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_STAIRS.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_COBBLE_STAIRS.get(), REOBlocks.LIMESTONE_COBBLE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_SLAB.get(), REOBlocks.LIMESTONE.get(), 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_COBBLE_SLAB.get(), REOBlocks.LIMESTONE_COBBLE.get(), 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_WALL.get(), REOBlocks.LIMESTONE.get(), 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.LIMESTONE_COBBLE_WALL.get(), REOBlocks.LIMESTONE_COBBLE.get(), 1);


        // Calcite
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CALCITE_SLAB.get(), Blocks.CALCITE);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CALCITE_WALL.get(), Blocks.CALCITE);

        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.CALCITE_STAIRS.get(), Blocks.CALCITE, 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.CALCITE_SLAB.get(), Blocks.CALCITE, 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.CALCITE_WALL.get(), Blocks.CALCITE, 1);

        // Netherrack
        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.NETHERRACK_STAIRS.get(), Blocks.NETHERRACK);
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.NETHERRACK_SLAB.get(), Blocks.NETHERRACK);
        wall(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK);

        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.NETHERRACK_STAIRS.get(), Blocks.NETHERRACK, 1);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.NETHERRACK_SLAB.get(), Blocks.NETHERRACK, 2);
        stonecutterRecipes(pWriter, RecipeCategory.MISC, REOBlocks.NETHERRACK_WALL.get(), Blocks.NETHERRACK, 1);

        // Lamp
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_BLACK.get(), REOItems.LUMINOUS_BLACK.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_BLUE.get(), REOItems.LUMINOUS_BLUE.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_BROWN.get(), REOItems.LUMINOUS_BROWN.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_CYAN.get(), REOItems.LUMINOUS_CYAN.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_GRAY.get(), REOItems.LUMINOUS_GRAY.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_GREEN.get(), REOItems.LUMINOUS_GREEN.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_LIGHTBLUE.get(), REOItems.LUMINOUS_LIGHTBLUE.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_LIGHTGRAY.get(), REOItems.LUMINOUS_LIGHTGRAY.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_LIME.get(), REOItems.LUMINOUS_LIME.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_MAGENTA.get(), REOItems.LUMINOUS_MAGENTA.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_ORANGE.get(), REOItems.LUMINOUS_ORANGE.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_PINK.get(), REOItems.LUMINOUS_PINK.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_PURPLE.get(), REOItems.LUMINOUS_PURPLE.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_RED.get(), REOItems.LUMINOUS_RED.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_WHITE.get(), REOItems.LUMINOUS_WHITE.get());
        lampRecipe(pWriter, RecipeCategory.MISC, REOBlocks.LAMP_YELLOW.get(), REOItems.LUMINOUS_YELLOW.get());

        // Seeds
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_BARLEY.get(), REOItems.PLANT_BARLEY.get());
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_CAULIFLOWER.get(), REOItems.FOOD_CAULIFLOWER.get());
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_COTTON.get(), REOItems.PLANT_COTTON.get());
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_RICE.get(), REOItems.PLANT_RICE.get());
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_TOMATO.get(), REOItems.FOOD_TOMATO.get());
        seedRecipe(pWriter, RecipeCategory.FOOD,  REOItems.SEED_TOMATO.get(), REOItems.FOOD_TOMATO_ROTTEN.get());

        flourRecipe(pWriter, RecipeCategory.FOOD, REOItems.FLOUR_WHEAT.get(), Items.WHEAT);
        flourRecipe(pWriter, RecipeCategory.FOOD,  REOItems.FLOUR_BARLEY.get(), REOItems.PLANT_BARLEY.get());
        breadLikeRecipe(pWriter, RecipeCategory.FOOD, Items.BREAD, REOItems.PLANT_BARLEY.get());
        breadLikeRecipe(pWriter, RecipeCategory.MISC, Items.STRING, REOItems.PLANT_COTTON.get());
        breadLikeRecipe(pWriter, RecipeCategory.FOOD, REOItems.FOOD_RICE.get(), REOItems.PLANT_RICE.get());

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
        planksFromLogs(pWriter, REOBlocks.PLANKS_BALSA.get(), REOBlocks.LOG_BALSA.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_BALSA.get(), REOBlocks.LOG_BALSA_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_BALSA.get(), REOBlocks.WOOD_BALSA_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.LOG_BALSA_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_BALSA.get(), REOBlocks.PLANKS_BALSA.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_BALSA.get(), REOBlocks.PLANKS_BALSA.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_BALSA_CHEST.get(), REOItems.BOAT_BALSA.get());

        // Baobab
        planksFromLogs(pWriter, REOBlocks.PLANKS_BAOBAB.get(), REOBlocks.LOG_BAOBAB.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_BAOBAB.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_BAOBAB.get(), REOBlocks.WOOD_BAOBAB_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.LOG_BAOBAB_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_BAOBAB.get(), REOBlocks.PLANKS_BAOBAB.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_BAOBAB_CHEST.get(), REOItems.BOAT_BAOBAB.get());

        // Hill Cherry
        planksFromLogs(pWriter, REOBlocks.PLANKS_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_HILL_CHERRY.get(), REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_HILL_CHERRY.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_HILL_CHERRY_CHEST.get(), REOItems.BOAT_HILL_CHERRY.get());

        // Chestnut
        planksFromLogs(pWriter, REOBlocks.PLANKS_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_CHESTNUT.get(), REOBlocks.WOOD_CHESTNUT_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_CHESTNUT.get(), REOBlocks.LOG_CHESTNUT_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_CHESTNUT.get(), REOBlocks.PLANKS_CHESTNUT.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_CHESTNUT_CHEST.get(), REOItems.BOAT_CHESTNUT.get());

        // Citrus
        planksFromLogs(pWriter, REOBlocks.PLANKS_CITRUS.get(), REOBlocks.LOG_CITRUS.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_CITRUS.get(), REOBlocks.LOG_CITRUS_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_CITRUS.get(), REOBlocks.WOOD_CITRUS_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.LOG_CITRUS_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_CITRUS.get(), REOBlocks.PLANKS_CITRUS.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_CITRUS_CHEST.get(), REOItems.BOAT_CITRUS.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PLANKS_EBONY.get(), REOBlocks.LOG_EBONY.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_EBONY.get(), REOBlocks.LOG_EBONY_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_EBONY.get(), REOBlocks.WOOD_EBONY_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.LOG_EBONY_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_EBONY.get(), REOBlocks.PLANKS_EBONY.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_EBONY.get(), REOBlocks.PLANKS_EBONY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_EBONY_CHEST.get(), REOItems.BOAT_EBONY.get());

        // Larch
        planksFromLogs(pWriter, REOBlocks.PLANKS_LARCH.get(), REOBlocks.LOG_LARCH.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_LARCH.get(), REOBlocks.LOG_LARCH_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_LARCH.get(), REOBlocks.WOOD_LARCH_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_LARCH.get(), REOBlocks.LOG_LARCH_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_LARCH.get(), REOBlocks.PLANKS_LARCH.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_LARCH.get(), REOBlocks.PLANKS_LARCH.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_LARCH_CHEST.get(), REOItems.BOAT_LARCH.get());

        // Lime
        planksFromLogs(pWriter, REOBlocks.PLANKS_LIME.get(), REOBlocks.LOG_LIME.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_LIME.get(), REOBlocks.LOG_LIME_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_LIME.get(), REOBlocks.WOOD_LIME_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_LIME.get(), REOBlocks.PLANKS_LIME.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_LIME.get(), REOBlocks.PLANKS_LIME.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_LIME.get(), REOBlocks.PLANKS_LIME.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_LIME.get(), REOBlocks.PLANKS_LIME.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_LIME.get(), REOBlocks.PLANKS_LIME.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.LOG_LIME_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_LIME.get(), REOBlocks.PLANKS_LIME.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_LIME.get(), REOBlocks.PLANKS_LIME.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_LIME.get(), REOBlocks.PLANKS_LIME.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_LIME.get(), REOBlocks.PLANKS_LIME.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_LIME.get(), REOBlocks.PLANKS_LIME.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_LIME_CHEST.get(), REOItems.BOAT_LIME.get());

        // Mahogany
        planksFromLogs(pWriter, REOBlocks.PLANKS_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_MAHOGANY.get(), REOBlocks.WOOD_MAHOGANY_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.LOG_MAHOGANY_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_MAHOGANY.get(), REOBlocks.PLANKS_MAHOGANY.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_MAHOGANY_CHEST.get(), REOItems.BOAT_MAHOGANY.get());

        // Maple
        planksFromLogs(pWriter, REOBlocks.PLANKS_MAPLE.get(), REOBlocks.LOG_MAPLE.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_MAPLE.get(), REOBlocks.LOG_MAPLE_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_MAPLE.get(), REOBlocks.WOOD_MAPLE_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_MAPLE.get(), REOBlocks.LOG_MAPLE_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_MAPLE.get(), REOBlocks.PLANKS_MAPLE.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_MAPLE_CHEST.get(), REOItems.BOAT_MAPLE.get());

        // Palm
        planksFromLogs(pWriter, REOBlocks.PLANKS_PALM.get(), REOBlocks.LOG_PALM.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PALM.get(), REOBlocks.LOG_PALM_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PALM.get(), REOBlocks.WOOD_PALM_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_PALM.get(), REOBlocks.PLANKS_PALM.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PALM.get(), REOBlocks.PLANKS_PALM.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_PALM.get(), REOBlocks.PLANKS_PALM.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_PALM.get(), REOBlocks.PLANKS_PALM.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_PALM.get(), REOBlocks.PLANKS_PALM.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.LOG_PALM_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_PALM.get(), REOBlocks.PLANKS_PALM.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_PALM.get(), REOBlocks.PLANKS_PALM.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_PALM.get(), REOBlocks.PLANKS_PALM.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_PALM.get(), REOBlocks.PLANKS_PALM.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_PALM.get(), REOBlocks.PLANKS_PALM.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PALM_CHEST.get(), REOItems.BOAT_PALM.get());

        // Papaya
        planksFromLogs(pWriter, REOBlocks.PLANKS_PAPAYA.get(), REOBlocks.LOG_PAPAYA.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PAPAYA.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PAPAYA.get(), REOBlocks.WOOD_PAPAYA_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.LOG_PAPAYA_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_PAPAYA.get(), REOBlocks.PLANKS_PAPAYA.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PAPAYA_CHEST.get(), REOItems.BOAT_PAPAYA.get());

        // Pine
        planksFromLogs(pWriter, REOBlocks.PLANKS_PINE.get(), REOBlocks.LOG_PINE.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PINE.get(), REOBlocks.LOG_PINE_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PINE.get(), REOBlocks.WOOD_PINE_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_PINE.get(), REOBlocks.PLANKS_PINE.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PINE.get(), REOBlocks.PLANKS_PINE.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_PINE.get(), REOBlocks.PLANKS_PINE.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_PINE.get(), REOBlocks.PLANKS_PINE.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_PINE.get(), REOBlocks.PLANKS_PINE.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_PINE.get(), REOBlocks.LOG_PINE_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_PINE.get(), REOBlocks.PLANKS_PINE.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_PINE.get(), REOBlocks.PLANKS_PINE.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_PINE.get(), REOBlocks.PLANKS_PINE.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_PINE.get(), REOBlocks.PLANKS_PINE.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_PINE.get(), REOBlocks.PLANKS_PINE.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_PINE_CHEST.get(), REOItems.BOAT_PINE.get());

        // Plum
        planksFromLogs(pWriter, REOBlocks.PLANKS_PLUM.get(), REOBlocks.LOG_PLUM.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PLUM.get(), REOBlocks.LOG_PLUM_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_PLUM.get(), REOBlocks.WOOD_PLUM_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_PLUM.get(), REOBlocks.PLANKS_PLUM.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_PLUM.get(), REOBlocks.PLANKS_PLUM.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.LOG_PLUM_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_POPLAR.get(), REOBlocks.PLANKS_POPLAR.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_POPLAR_CHEST.get(), REOItems.BOAT_POPLAR.get());

        // Redwood
        planksFromLogs(pWriter, REOBlocks.PLANKS_REDWOOD.get(), REOBlocks.LOG_REDWOOD.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_REDWOOD.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_REDWOOD.get(), REOBlocks.WOOD_REDWOOD_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_REDWOOD.get(), REOBlocks.LOG_REDWOOD_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_REDWOOD.get(), REOBlocks.PLANKS_REDWOOD.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_REDWOOD_CHEST.get(), REOItems.BOAT_REDWOOD.get());

        // Rubber
        planksFromLogs(pWriter, REOBlocks.PLANKS_RUBBER.get(), REOBlocks.LOG_RUBBER.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_RUBBER.get(), REOBlocks.LOG_RUBBER_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_RUBBER.get(), REOBlocks.WOOD_RUBBER_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.LOG_RUBBER_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_RUBBER.get(), REOBlocks.PLANKS_RUBBER.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_RUBBER_CHEST.get(), REOItems.BOAT_RUBBER.get());

        // Teak
        planksFromLogs(pWriter, REOBlocks.PLANKS_TEAK.get(), REOBlocks.LOG_TEAK.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_TEAK.get(), REOBlocks.LOG_TEAK_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_TEAK.get(), REOBlocks.WOOD_TEAK_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.LOG_TEAK_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_TEAK.get(), REOBlocks.PLANKS_TEAK.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_TEAK.get(), REOBlocks.PLANKS_TEAK.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_TEAK_CHEST.get(), REOItems.BOAT_TEAK.get());

        // Walnut
        planksFromLogs(pWriter, REOBlocks.PLANKS_WALNUT.get(), REOBlocks.LOG_WALNUT.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_WALNUT.get(), REOBlocks.LOG_WALNUT_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_WALNUT.get(), REOBlocks.WOOD_WALNUT_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_WALNUT.get(), REOBlocks.LOG_WALNUT_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_WALNUT.get(), REOBlocks.PLANKS_WALNUT.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_WALNUT_CHEST.get(), REOItems.BOAT_WALNUT.get());

        // Willow
        planksFromLogs(pWriter, REOBlocks.PLANKS_WILLOW.get(), REOBlocks.LOG_WILLOW.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_WILLOW.get(), REOBlocks.LOG_WILLOW_STRIPPED.get());
        planksFromStripped(pWriter, REOBlocks.PLANKS_WILLOW.get(), REOBlocks.WOOD_WILLOW_STRIPPED.get());
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

        stairsRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.STAIRS_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.SLAB_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        fenceRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        fenceGateRecipe(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.FENCE_GATE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        signRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        hangingSignRecipe(pWriter, RecipeCategory.MISC, REOBlocks.SIGN_HANGING_WILLOW.get(), REOBlocks.LOG_WILLOW_STRIPPED.get());

        buttonRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.BUTTON_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        pressurePlateRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.PRESSURE_PLATE_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        doorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.DOOR_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        trapdoorRecipe(pWriter, RecipeCategory.REDSTONE, REOBlocks.TRAPDOOR_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());

        boatRecipe(pWriter, RecipeCategory.TRANSPORTATION, REOItems.BOAT_WILLOW.get(), REOBlocks.PLANKS_WILLOW.get());
        chestBoatRecipe(pWriter, REOItems.BOAT_WILLOW_CHEST.get(), REOItems.BOAT_WILLOW.get());

        // Tools //
        // Aluminium
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_SHOVEL.get(), REOItems.INGOT_ALUMINIUM.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_PICKAXE.get(), REOItems.INGOT_ALUMINIUM.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_AXE.get(), REOItems.INGOT_ALUMINIUM.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_HOE.get(), REOItems.INGOT_ALUMINIUM.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_SWORD.get(), REOItems.INGOT_ALUMINIUM.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_HAMMER.get(), REOItems.INGOT_ALUMINIUM.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_EXCAVATOR.get(), REOItems.INGOT_ALUMINIUM.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_HATCHET.get(), REOItems.INGOT_ALUMINIUM.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_SICKLE.get(), REOItems.INGOT_ALUMINIUM.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_SHEARS.get(), REOItems.INGOT_ALUMINIUM.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ALUMINIUM_PAXEL.get(),
                REOItems.ALUMINIUM_AXE.get(), REOItems.ALUMINIUM_SHOVEL.get(), REOItems.ALUMINIUM_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ALUMINIUM_BOW.get(), REOItems.INGOT_ALUMINIUM.get());

        // Amethyst
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_SHOVEL.get(), REOItems.GEM_AMETHYST.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_PICKAXE.get(), REOItems.GEM_AMETHYST.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_AXE.get(), REOItems.GEM_AMETHYST.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_HOE.get(), REOItems.GEM_AMETHYST.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_SWORD.get(), REOItems.GEM_AMETHYST.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_HAMMER.get(), REOItems.GEM_AMETHYST.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_EXCAVATOR.get(), REOItems.GEM_AMETHYST.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_HATCHET.get(), REOItems.GEM_AMETHYST.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_SICKLE.get(), REOItems.GEM_AMETHYST.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_SHEARS.get(), REOItems.GEM_AMETHYST.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.AMETHYST_PAXEL.get(),
                REOItems.AMETHYST_AXE.get(), REOItems.AMETHYST_SHOVEL.get(), REOItems.AMETHYST_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_BOW.get(), REOItems.GEM_AMETHYST.get());
        shieldRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_SHIELD.get(), REOItems.GEM_AMETHYST.get());

        // Bronze
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_SHOVEL.get(), REOItems.INGOT_BRONZE.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_PICKAXE.get(), REOItems.INGOT_BRONZE.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_AXE.get(), REOItems.INGOT_BRONZE.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_HOE.get(), REOItems.INGOT_BRONZE.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_SWORD.get(), REOItems.INGOT_BRONZE.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_HAMMER.get(), REOItems.INGOT_BRONZE.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_EXCAVATOR.get(), REOItems.INGOT_BRONZE.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_HATCHET.get(), REOItems.INGOT_BRONZE.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_SICKLE.get(), REOItems.INGOT_BRONZE.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_SHEARS.get(), REOItems.INGOT_BRONZE.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.BRONZE_PAXEL.get(),
                REOItems.BRONZE_AXE.get(), REOItems.BRONZE_SHOVEL.get(), REOItems.BRONZE_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.BRONZE_BOW.get(), REOItems.INGOT_BRONZE.get());

        // Enderite
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_SHOVEL.get(), REOItems.INGOT_ENDERITE.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_PICKAXE.get(), REOItems.INGOT_ENDERITE.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_AXE.get(), REOItems.INGOT_ENDERITE.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_HOE.get(), REOItems.INGOT_ENDERITE.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_SWORD.get(), REOItems.INGOT_ENDERITE.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_HAMMER.get(), REOItems.INGOT_ENDERITE.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_EXCAVATOR.get(), REOItems.INGOT_ENDERITE.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_HATCHET.get(), REOItems.INGOT_ENDERITE.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_SICKLE.get(), REOItems.INGOT_ENDERITE.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_SHEARS.get(), REOItems.INGOT_ENDERITE.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.ENDERITE_PAXEL.get(),
                REOItems.ENDERITE_AXE.get(), REOItems.ENDERITE_SHOVEL.get(), REOItems.ENDERITE_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ENDERITE_BOW.get(), REOItems.INGOT_ENDERITE.get());

        // Peridot
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_SHOVEL.get(), REOItems.GEM_PERIDOT.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_PICKAXE.get(), REOItems.GEM_PERIDOT.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_AXE.get(), REOItems.GEM_PERIDOT.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_HOE.get(), REOItems.GEM_PERIDOT.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_SWORD.get(), REOItems.GEM_PERIDOT.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_HAMMER.get(), REOItems.GEM_PERIDOT.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_EXCAVATOR.get(), REOItems.GEM_PERIDOT.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_HATCHET.get(), REOItems.GEM_PERIDOT.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_SICKLE.get(), REOItems.GEM_PERIDOT.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_SHEARS.get(), REOItems.GEM_PERIDOT.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PERIDOT_PAXEL.get(),
                REOItems.PERIDOT_AXE.get(), REOItems.PERIDOT_SHOVEL.get(), REOItems.PERIDOT_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PERIDOT_BOW.get(), REOItems.GEM_PERIDOT.get());

        // Platinum
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_SHOVEL.get(), REOItems.INGOT_PLATINUM.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_PICKAXE.get(), REOItems.INGOT_PLATINUM.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_AXE.get(), REOItems.INGOT_PLATINUM.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_HOE.get(), REOItems.INGOT_PLATINUM.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_SWORD.get(), REOItems.INGOT_PLATINUM.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_HAMMER.get(), REOItems.INGOT_PLATINUM.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_EXCAVATOR.get(), REOItems.INGOT_PLATINUM.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_HATCHET.get(), REOItems.INGOT_PLATINUM.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_SICKLE.get(), REOItems.INGOT_PLATINUM.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_SHEARS.get(), REOItems.INGOT_PLATINUM.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.PLATINUM_PAXEL.get(),
                REOItems.PLATINUM_AXE.get(), REOItems.PLATINUM_SHOVEL.get(), REOItems.PLATINUM_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PLATINUM_BOW.get(), REOItems.INGOT_PLATINUM.get());

        // Ruby
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_SHOVEL.get(), REOItems.GEM_RUBY.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_PICKAXE.get(), REOItems.GEM_RUBY.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_AXE.get(), REOItems.GEM_RUBY.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_HOE.get(), REOItems.GEM_RUBY.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_SWORD.get(), REOItems.GEM_RUBY.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_HAMMER.get(), REOItems.GEM_RUBY.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_EXCAVATOR.get(), REOItems.GEM_RUBY.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_HATCHET.get(), REOItems.GEM_RUBY.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_SICKLE.get(), REOItems.GEM_RUBY.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_SHEARS.get(), REOItems.GEM_RUBY.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.RUBY_PAXEL.get(),
                REOItems.RUBY_AXE.get(), REOItems.RUBY_SHOVEL.get(), REOItems.RUBY_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.RUBY_BOW.get(), REOItems.GEM_RUBY.get());

        // Sapphire
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_SHOVEL.get(), REOItems.GEM_SAPPHIRE.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_PICKAXE.get(), REOItems.GEM_SAPPHIRE.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_AXE.get(), REOItems.GEM_SAPPHIRE.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_HOE.get(), REOItems.GEM_SAPPHIRE.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_SWORD.get(), REOItems.GEM_SAPPHIRE.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_HAMMER.get(), REOItems.GEM_SAPPHIRE.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_EXCAVATOR.get(), REOItems.GEM_SAPPHIRE.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_HATCHET.get(), REOItems.GEM_SAPPHIRE.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_SICKLE.get(), REOItems.GEM_SAPPHIRE.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_SHEARS.get(), REOItems.GEM_SAPPHIRE.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SAPPHIRE_PAXEL.get(),
                REOItems.SAPPHIRE_AXE.get(), REOItems.SAPPHIRE_SHOVEL.get(), REOItems.SAPPHIRE_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SAPPHIRE_BOW.get(), REOItems.GEM_SAPPHIRE.get());

        // Silver
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_SHOVEL.get(), REOItems.INGOT_SILVER.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_PICKAXE.get(), REOItems.INGOT_SILVER.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_AXE.get(), REOItems.INGOT_SILVER.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_HOE.get(), REOItems.INGOT_SILVER.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_SWORD.get(), REOItems.INGOT_SILVER.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_HAMMER.get(), REOItems.INGOT_SILVER.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_EXCAVATOR.get(), REOItems.INGOT_SILVER.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_HATCHET.get(), REOItems.INGOT_SILVER.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_SICKLE.get(), REOItems.INGOT_SILVER.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_SHEARS.get(), REOItems.INGOT_SILVER.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.SILVER_PAXEL.get(),
                REOItems.SILVER_AXE.get(), REOItems.SILVER_SHOVEL.get(), REOItems.SILVER_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SILVER_BOW.get(), REOItems.INGOT_SILVER.get());

        // Steel
        shovelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_SHOVEL.get(), REOItems.INGOT_STEEL.get());
        pickaxeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_PICKAXE.get(), REOItems.INGOT_STEEL.get());
        axeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_AXE.get(), REOItems.INGOT_STEEL.get());
        hoeRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_HOE.get(), REOItems.INGOT_STEEL.get());
        swordRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_SWORD.get(), REOItems.INGOT_STEEL.get());
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_HAMMER.get(), REOItems.INGOT_STEEL.get());
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_EXCAVATOR.get(), REOItems.INGOT_STEEL.get());
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_HATCHET.get(), REOItems.INGOT_STEEL.get());
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_SICKLE.get(), REOItems.INGOT_STEEL.get());
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_SHEARS.get(), REOItems.INGOT_STEEL.get());

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STEEL_PAXEL.get(),
                REOItems.STEEL_AXE.get(), REOItems.STEEL_SHOVEL.get(), REOItems.STEEL_PICKAXE.get());
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STEEL_BOW.get(), REOItems.INGOT_STEEL.get());

        // Diamond
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_HAMMER.get(), Items.DIAMOND);
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_EXCAVATOR.get(), Items.DIAMOND);
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_HATCHET.get(), Items.DIAMOND);
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_SICKLE.get(), Items.DIAMOND);
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_SHEARS.get(), Items.DIAMOND);

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.DIAMOND_PAXEL.get(),
                Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE);
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.DIAMOND_BOW.get(), Items.DIAMOND);

        // Golden
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_HAMMER.get(), Items.GOLD_INGOT);
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_EXCAVATOR.get(), Items.GOLD_INGOT);
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_HATCHET.get(), Items.GOLD_INGOT);
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_SICKLE.get(), Items.GOLD_INGOT);
        shearsRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_SHEARS.get(), Items.GOLD_INGOT);

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.GOLDEN_PAXEL.get(),
                Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE);
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.GOLDEN_BOW.get(), Items.GOLD_INGOT);

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
        hammerRecipe(pWriter, RecipeCategory.TOOLS, REOItems.IRON_HAMMER.get(), Items.IRON_INGOT);
        excavatorRecipe(pWriter, RecipeCategory.TOOLS, REOItems.IRON_EXCAVATOR.get(), Items.IRON_INGOT);
        hatchetRecipe(pWriter, RecipeCategory.TOOLS, REOItems.IRON_HATCHET.get(), Items.IRON_INGOT);
        sickleRecipe(pWriter, RecipeCategory.TOOLS, REOItems.IRON_SICKLE.get(), Items.IRON_INGOT);

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.IRON_PAXEL.get(),
                Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_PICKAXE);
        bowRecipe(pWriter, RecipeCategory.COMBAT, REOItems.IRON_BOW.get(), Items.IRON_INGOT);

        // Stone
        hammerTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_HAMMER.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_PICKAXE);
        excavatorTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_EXCAVATOR.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_SHOVEL);
        hatchetTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_HATCHET.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_AXE);
        sickleTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_SICKLE.get(), ItemTags.STONE_TOOL_MATERIALS, Items.STONE_HOE);
        shearsTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_SHEARS.get(), ItemTags.STONE_TOOL_MATERIALS, Items.COBBLESTONE);

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.STONE_PAXEL.get(),
                Items.STONE_AXE, Items.STONE_SHOVEL, Items.STONE_PICKAXE);
        bowTagRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STONE_BOW.get(), ItemTags.STONE_TOOL_MATERIALS);

        // Wooden
        hammerTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_HAMMER.get(), ItemTags.PLANKS, Items.WOODEN_PICKAXE);
        excavatorTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_EXCAVATOR.get(), ItemTags.PLANKS, Items.WOODEN_SHOVEL);
        hatchetTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_HATCHET.get(), ItemTags.PLANKS, Items.WOODEN_AXE);
        sickleTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_SICKLE.get(), ItemTags.PLANKS, Items.WOODEN_HOE);
        shearsTagRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_SHEARS.get(), ItemTags.PLANKS, Items.OAK_PLANKS);

        paxelRecipe(pWriter, RecipeCategory.TOOLS, REOItems.WOODEN_PAXEL.get(),
                Items.WOODEN_AXE, Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE);

        // Armour //
        // Aluminium
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ALUMINIUM_HELMET.get(), REOItems.INGOT_ALUMINIUM.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ALUMINIUM_CHESTPLATE.get(), REOItems.INGOT_ALUMINIUM.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ALUMINIUM_LEGGINGS.get(), REOItems.INGOT_ALUMINIUM.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ALUMINIUM_BOOTS.get(), REOItems.INGOT_ALUMINIUM.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());

        // Amethyst
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_HELMET.get(), REOItems.GEM_AMETHYST.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_CHESTPLATE.get(), REOItems.GEM_AMETHYST.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_LEGGINGS.get(), REOItems.GEM_AMETHYST.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.AMETHYST_BOOTS.get(), REOItems.GEM_AMETHYST.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_AMETHYST.get(), REOItems.GEM_AMETHYST.get());

        // Bronze
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.BRONZE_HELMET.get(), REOItems.INGOT_BRONZE.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.BRONZE_CHESTPLATE.get(), REOItems.INGOT_BRONZE.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.BRONZE_LEGGINGS.get(), REOItems.INGOT_BRONZE.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.BRONZE_BOOTS.get(), REOItems.INGOT_BRONZE.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_BRONZE.get(), REOItems.INGOT_BRONZE.get());

        // Chain
        helmetRecipe(pWriter, RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, Items.CHAIN);
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, Items.CHAIN);
        legginsRecipe(pWriter, RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, Items.CHAIN);
        bootsRecipe(pWriter, RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, Items.CHAIN);

        // Enderite
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ENDERITE_HELMET.get(), REOItems.INGOT_ENDERITE.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ENDERITE_CHESTPLATE.get(), REOItems.INGOT_ENDERITE.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ENDERITE_LEGGINGS.get(), REOItems.INGOT_ENDERITE.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.ENDERITE_BOOTS.get(), REOItems.INGOT_ENDERITE.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());

        // Peridot
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PERIDOT_HELMET.get(), REOItems.GEM_PERIDOT.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PERIDOT_CHESTPLATE.get(), REOItems.GEM_PERIDOT.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PERIDOT_LEGGINGS.get(), REOItems.GEM_PERIDOT.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PERIDOT_BOOTS.get(), REOItems.GEM_PERIDOT.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_PERIDOT.get(), REOItems.GEM_PERIDOT.get());

        // Platinum
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PLATINUM_HELMET.get(), REOItems.INGOT_PLATINUM.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PLATINUM_CHESTPLATE.get(), REOItems.INGOT_PLATINUM.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PLATINUM_LEGGINGS.get(), REOItems.INGOT_PLATINUM.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.PLATINUM_BOOTS.get(), REOItems.INGOT_PLATINUM.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());

        // Ruby
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.RUBY_HELMET.get(), REOItems.GEM_RUBY.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.RUBY_CHESTPLATE.get(), REOItems.GEM_RUBY.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.RUBY_LEGGINGS.get(), REOItems.GEM_RUBY.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.RUBY_BOOTS.get(), REOItems.GEM_RUBY.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_RUBY.get(), REOItems.GEM_RUBY.get());

        // Sapphire
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SAPPHIRE_HELMET.get(), REOItems.GEM_SAPPHIRE.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SAPPHIRE_CHESTPLATE.get(), REOItems.GEM_SAPPHIRE.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SAPPHIRE_LEGGINGS.get(), REOItems.GEM_SAPPHIRE.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SAPPHIRE_BOOTS.get(), REOItems.GEM_SAPPHIRE.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());

        // Silver
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SILVER_HELMET.get(), REOItems.INGOT_SILVER.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SILVER_CHESTPLATE.get(), REOItems.INGOT_SILVER.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SILVER_LEGGINGS.get(), REOItems.INGOT_SILVER.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.SILVER_BOOTS.get(), REOItems.INGOT_SILVER.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_SILVER.get(), REOItems.INGOT_SILVER.get());

        // Steel
        helmetRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STEEL_HELMET.get(), REOItems.INGOT_STEEL.get());
        chestplateRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STEEL_CHESTPLATE.get(), REOItems.INGOT_STEEL.get());
        legginsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STEEL_LEGGINGS.get(), REOItems.INGOT_STEEL.get());
        bootsRecipe(pWriter, RecipeCategory.COMBAT, REOItems.STEEL_BOOTS.get(), REOItems.INGOT_STEEL.get());
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, REOItems.HORSE_ARMOR_STEEL.get(), REOItems.INGOT_STEEL.get());

        // Vanila
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR, Items.IRON_INGOT);
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT);
        horseArmorRecipe(pWriter, RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND);

        // Saddle
        saddleRecipe(pWriter, RecipeCategory.MISC, Items.SADDLE);

        // Items
        // Ingots Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.INGOT_NICKEL.get(), 3)
                .unlockedBy(getHasName(REOItems.INGOT_NICKEL.get()), has(REOItems.INGOT_NICKEL.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_BRASS.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.INGOT_ZINC.get(), 3)
                .unlockedBy(getHasName(REOItems.INGOT_ZINC.get()), has(REOItems.INGOT_ZINC.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(), 2)
                .requires(Items.GOLD_INGOT, 2)
                .requires(REOItems.INGOT_SILVER.get(), 2)
                .unlockedBy(getHasName(REOItems.INGOT_SILVER.get()), has(REOItems.INGOT_SILVER.get()))
                .save(pWriter);

        // Dust Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_BRONZE.get(), 2)
                .requires(REOItems.DUST_COPPER.get())
                .requires(REOItems.DUST_NICKEL.get(), 3)
                .unlockedBy(getHasName(REOItems.DUST_NICKEL.get()), has(REOItems.DUST_NICKEL.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_BRASS.get(), 2)
                .requires(REOItems.DUST_COPPER.get())
                .requires(REOItems.DUST_ZINC.get(), 3)
                .unlockedBy(getHasName(REOItems.DUST_ZINC.get()), has(REOItems.DUST_ZINC.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.DUST_ELECTRUM.get(), 2)
                .requires(REOItems.DUST_GOLD.get(), 2)
                .requires(REOItems.DUST_SILVER.get(), 2)
                .unlockedBy(getHasName(REOItems.DUST_SILVER.get()), has(REOItems.DUST_SILVER.get()))
                .save(pWriter);


        // Nuggets
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_ALUMINIUM.get(), REOItems.NUGGET_ALUMINIUM.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.GEM_AMETHYST.get(), REOItems.NUGGET_AMETHYST.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_BRASS.get(), REOItems.NUGGET_BRASS.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_BRONZE.get(), REOItems.NUGGET_BRONZE.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, Items.COPPER_INGOT, REOItems.NUGGET_COPPER.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, Items.DIAMOND, REOItems.NUGGET_DIAMOND.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_ELECTRUM.get(), REOItems.NUGGET_ELECTRUM.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, Items.EMERALD, REOItems.NUGGET_EMERALD.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_ENDERITE.get(), REOItems.NUGGET_ENDERITE.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_LEAD.get(), REOItems.NUGGET_LEAD.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_NICKEL.get(), REOItems.NUGGET_NICKEL.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.GEM_PERIDOT.get(), REOItems.NUGGET_PERIDOT.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_PLATINUM.get(), REOItems.NUGGET_PLATINUM.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.GEM_RUBY.get(), REOItems.NUGGET_RUBY.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.GEM_SAPPHIRE.get(), REOItems.NUGGET_SAPPHIRE.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_SILVER.get(), REOItems.NUGGET_SILVER.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_STEEL.get(), REOItems.NUGGET_STEEL.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_TIN.get(), REOItems.NUGGET_TIN.get());
        nuggetRecipe(pWriter, RecipeCategory.MISC, REOItems.INGOT_ZINC.get(), REOItems.NUGGET_ZINC.get());

        // Luminous Powder
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_BLACK.get(), Items.BLACK_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_BLUE.get(), Items.BLUE_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_BROWN.get(), Items.BROWN_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_CYAN.get(), Items.CYAN_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_GRAY.get(), Items.GRAY_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_GREEN.get(), Items.GREEN_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_LIGHTBLUE.get(), Items.LIGHT_BLUE_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_LIGHTGRAY.get(), Items.LIGHT_GRAY_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_LIME.get(), Items.LIME_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_MAGENTA.get(), Items.MAGENTA_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_ORANGE.get(), Items.ORANGE_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_PINK.get(), Items.PINK_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_PURPLE.get(), Items.PURPLE_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_RED.get(), Items.RED_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_WHITE.get(), Items.WHITE_DYE);
        luminousDustRecipe(pWriter, RecipeCategory.MISC, REOItems.LUMINOUS_YELLOW.get(), Items.YELLOW_DYE);


        // Tech //
        // Gear
        // Base
        woodenGearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_WOODEN.get(), Items.STICK);
        stoneGearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_STONE.get(), ItemTags.STONE_TOOL_MATERIALS);

        // Tier 1
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_IRON.get(), Items.IRON_INGOT);
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_BRASS.get(), REOItems.INGOT_BRASS.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_BRONZE.get(), REOItems.INGOT_BRONZE.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_COPPER.get(), Items.COPPER_INGOT);
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_LEAD.get(), REOItems.INGOT_LEAD.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_NICKEL.get(), REOItems.INGOT_NICKEL.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_SILVER.get(), REOItems.INGOT_SILVER.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_STEEL.get(), REOItems.INGOT_STEEL.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_TIN.get(), REOItems.INGOT_TIN.get());
        tier1GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_ZINC.get(), REOItems.INGOT_ZINC.get());

        // Tier 2
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_AMETHYST.get(), REOItems.GEM_AMETHYST.get());
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_DIAMOND.get(), Items.DIAMOND);
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get());
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_EMERALD.get(), Items.EMERALD);
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_GOLDEN.get(), Items.GOLD_INGOT);
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_PERIDOT.get(), REOItems.GEM_PERIDOT.get());
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_RUBY.get(), REOItems.GEM_RUBY.get());
        tier2GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());

        // Tier 3
        tier3GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());
        tier3GearRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.GEAR_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());

        // Plate
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_ALUMINIUM.get(), REOItems.INGOT_ALUMINIUM.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_AMETHYST.get(), REOItems.GEM_AMETHYST.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_BRASS.get(), REOItems.INGOT_BRASS.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_BRONZE.get(), REOItems.INGOT_BRONZE.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_COPPER.get(), Items.COPPER_INGOT);
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_DIAMOND.get(), Items.DIAMOND);
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_ELECTRUM.get(), REOItems.INGOT_ELECTRUM.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_EMERALD.get(), Items.EMERALD);
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_ENDERITE.get(), REOItems.INGOT_ENDERITE.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_GOLDEN.get(), Items.GOLD_INGOT);
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_IRON.get(), Items.IRON_INGOT);
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_LEAD.get(), REOItems.INGOT_LEAD.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_NICKEL.get(), REOItems.INGOT_NICKEL.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_PLATINUM.get(), REOItems.INGOT_PLATINUM.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_PERIDOT.get(), REOItems.GEM_PERIDOT.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_RUBY.get(), REOItems.GEM_RUBY.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_SAPPHIRE.get(), REOItems.GEM_SAPPHIRE.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_SILVER.get(), REOItems.INGOT_SILVER.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_STEEL.get(), REOItems.INGOT_STEEL.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_TIN.get(), REOItems.INGOT_TIN.get());
        plateRecipe(pWriter, RecipeCategory.REDSTONE, REOItems.PLATE_ZINC.get(), REOItems.INGOT_ZINC.get());

    }



    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,
                                      ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory,
                pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }


    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,
                                      ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory,
                pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void foodCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pResult) + pRecipeName + getItemName(itemlike));
        }
    }


    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer, RecipeCategory pRecipe, ItemLike pItem, RecipeCategory pRecipe1, ItemLike pItem1) {
        nineBlockStorageRecipes(finishedRecipeConsumer, pRecipe, pItem, pRecipe1, pItem1, getSimpleRecipeName(pItem1), (String)null, getSimpleRecipeName(pItem), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer, RecipeCategory recipeCategory, ItemLike itemLike,
                                                  RecipeCategory recipeCategory1, ItemLike itemLike1, String string, @Nullable String string1,
                                                  String string2, @Nullable String string3) {
        ShapelessRecipeBuilder.shapeless(recipeCategory, itemLike, 9)
                .requires(itemLike1).group(string3)
                .unlockedBy(getHasName(itemLike1), has(itemLike1))
                .save(finishedRecipeConsumer, new ResourceLocation(RealEarthOres.MOD_ID, string2));
        ShapedRecipeBuilder.shaped(recipeCategory1, itemLike1)
                .define('#', itemLike)
                .pattern("###")
                .pattern("###").pattern("###")
                .group(string1)
                .unlockedBy(getHasName(itemLike), has(itemLike)).save(finishedRecipeConsumer, new ResourceLocation(RealEarthOres.MOD_ID, string));
    }

    protected static void stonecutterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), pCategory, pResult, pResultCount).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, getConversionRecipeName(pResult, pMaterial) + "_stonecutting");
    }

    protected static void shovelRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void pickaxeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void axeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hoeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void swordRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hammerRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hammerTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getSimpleRecipeName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void excavatorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void excavatorTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" S ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hatchetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void hatchetTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void sickleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("  #")
                .pattern("S# ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }
    protected static void sickleTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("  #")
                .pattern("S# ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shearsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shearsTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial, ItemLike pBaseTool) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy(getHasName(pBaseTool), has(pBaseTool))
                .save(pFinishedRecipeConsumer);
    }


    protected static void paxelRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pAxe, ItemLike pShovel, ItemLike pPickaxe) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
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

    protected static void helmetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void chestplateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void legginsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bootsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void horseArmorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('@', Items.LEATHER_HORSE_ARMOR)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bowRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('@', Items.STRING)
                .pattern(" #@")
                .pattern("# @")
                .pattern(" #@")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void bowTagRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('@', Items.STRING)
                .pattern(" #@")
                .pattern("# @")
                .pattern(" #@")
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE))
                .save(pFinishedRecipeConsumer);
    }

    protected static void shieldRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('@', Items.SHIELD)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void saddleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', Items.LEATHER)
                .define('@', Items.IRON_INGOT)
                .pattern(" # ")
                .pattern("#@#")
                .pattern("@ @")
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pFinishedRecipeConsumer);
    }

    protected static void nuggetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_nugget");
    }

    protected static void luminousDustRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 9)
                .define('#', pMaterial)
                .define('G', Items.GLOWSTONE_DUST)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_glowstone_dust");
    }

    protected static void lampRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('G', Items.REDSTONE_TORCH)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_redstone_torch");
    }

    protected static void stairsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 4)
                .define('#', pMaterial)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }


    protected static void fenceRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#S#")
                .pattern("#S#")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void fenceGateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("S#S")
                .pattern("S#S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void signRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void hangingSignRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 6)
                .define('#', pMaterial)
                .define('S', Items.CHAIN)
                .pattern("S S")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void doorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 3)
                .define('#', pMaterial)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void trapdoorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult, 2)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void planksFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pPlanks, ItemLike pLog)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlanks, 4)
                .requires(pLog).group("planks")
                .unlockedBy(getHasName(pLog), has(pLog))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pPlanks) + "_from_" + getItemName(pLog));
    }
    protected static void planksFromStripped(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pStripped)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult, 4)
                .requires(pStripped).group("planks")
                .unlockedBy(getHasName(pStripped), has(pStripped))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_" + getItemName(pStripped));
    }

    protected static void woodFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pLog)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult, 3)
                .requires(pLog, 4).group("planks")
                .unlockedBy(getHasName(pLog), has(pLog))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_"+ getItemName(pLog));
    }


    protected static void resistantRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer,ItemLike pItemResult, ItemLike pWood)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pWood).requires(Items.HONEYCOMB)
                .group("wood")
                .unlockedBy(getHasName(pWood), has(pWood))
                .save(pFinishedRecipeConsumer);
    }

    protected static void buttonRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer,RecipeCategory pCategory, ItemLike pItemResult, ItemLike pPlanks)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pPlanks).group("planks")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer);;
    }


    protected static void pressurePlateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer,RecipeCategory pCategory, ItemLike pItenResult, ItemLike pPlanks) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pPlanks)
                .pattern("##")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer);;
    }

    protected static void seedRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory,  ItemLike pItemResult, ItemLike pItemFrom)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pItemFrom).group("seeds")
                .unlockedBy(getHasName(pItemFrom), has(pItemFrom))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItemResult) + "_from_"+ getItemName(pItemFrom));
    }

    protected static void flourRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void breadLikeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":" + getItemName(pItenResult) + "_from_" + getItemName(pMaterial));
    }

    protected static void boatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void woodenGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void stoneGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, TagKey pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('G', REOItems.GEAR_WOODEN.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(REOItems.GEAR_WOODEN.get()), has(REOItems.GEAR_WOODEN.get()))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier1GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('G', REOItems.GEAR_STONE.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier2GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('G', REOItems.GEAR_IRON.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void tier3GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .define('G', REOTags.Items.GEM_GEAR_TIER)
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void plateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pItenResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(pCategory, pItenResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer);
    }

    protected static void chestBoatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pBoat)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pBoat).requires(Blocks.CHEST).group("boats")
                .unlockedBy(getHasName(pBoat), has(pBoat))
                .save(pFinishedRecipeConsumer);
    }



}
