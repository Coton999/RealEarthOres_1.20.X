package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.datagen.custom.coal.BasicCrusherRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.BasicExtractorRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.BasicPurifierRecipeBuilder;
import net.coton999.realearthores.datagen.custom.coal.KilnRecipeBuilder;
import net.coton999.realearthores.datagen.custom.electric.*;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
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
                .unlockedBy(getHasName(REOBlocks.MARBLE.get()), has(REOBlocks.MARBLE.get())).
                save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + getItemName(REOBlocks.MARBLE.get()));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.MARBLE_BRICK.get()), RecipeCategory.MISC,
                REOBlocks.MARBLE_BRICK_CRACKED.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.MARBLE_BRICK.get()), has(REOBlocks.MARBLE_BRICK.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + getItemName(REOBlocks.MARBLE_BRICK_CRACKED.get()));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.LIMESTONE_COBBLE.get()), RecipeCategory.MISC,
                        REOBlocks.LIMESTONE.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE.get()), has(REOBlocks.LIMESTONE.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + getItemName(REOBlocks.LIMESTONE.get()));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.LIMESTONE_BRICK.get()), RecipeCategory.MISC,
                        REOBlocks.LIMESTONE_BRICK_CRACKED.get(), 0.1f, 200)
                .unlockedBy(getHasName(REOBlocks.LIMESTONE_BRICK.get()), has(REOBlocks.LIMESTONE_BRICK.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + getItemName(REOBlocks.LIMESTONE_BRICK_CRACKED.get()));

        // Ores
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                        REOBlocks.NETHER_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ALUMINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_aluminium_ores", has(REOTags.Items.ORES_ALUMINUM))
                .unlockedBy(getHasName(REOItems.RAW_ALUMINIUM.get()), has(REOTags.Items.RAW_MATERIALS_ALUMINUM))
                .unlockedBy(getHasName(REOItems.ALUMINUM_DUST.get()), has(REOTags.Items.DUSTS_ALUMINUM))
                .unlockedBy(getHasName(REOItems.ALUMINUM_DIRTY.get()), has(REOTags.Items.DIRTY_ALUMINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.ALUMINUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.AMETHYST_CLUSTER, REOItems.AMETHYST_DUST.get(), REOItems.AMETHYST_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.AMETHYST.get(), 0.7F, 200)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER))
                .unlockedBy(getHasName(REOItems.AMETHYST_DUST.get()), has(REOTags.Items.DUSTS_AMETHYST))
                .unlockedBy(getHasName(REOItems.AMETHYST_DIRTY.get()), has(REOTags.Items.DIRTY_AMETHYST))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.AMETHYST.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.BRASS_DUST.get(), REOItems.BRASS_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.BRASS_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.BRASS_DUST.get()), has(REOTags.Items.DUSTS_BRASS))
                .unlockedBy(getHasName(REOItems.BRASS_DIRTY.get()), has(REOTags.Items.DIRTY_BRASS))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.BRASS_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.BRONZE_DUST.get(), REOItems.BRONZE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.BRONZE_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_BRONZE))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_BRONZE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.BRONZE_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(),
                        REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES))
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_COPPER))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.COPPER_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(),
                        REOItems.DIAMOND_DUST.get(), REOItems.DIAMOND_DIRTY.get()),
                        RecipeCategory.MISC, Items.DIAMOND, 1F, 200)
                .unlockedBy("has_diamond_ores", has(ItemTags.DIAMOND_ORES))
                .unlockedBy(getHasName(REOItems.DIAMOND_DUST.get()), has(REOTags.Items.DUSTS_DIAMOND))
                .unlockedBy(getHasName(REOItems.DIAMOND_DIRTY.get()), has(REOTags.Items.DIRTY_DIAMOND))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.DIAMOND);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.ELECTRUM_DUST.get(), REOItems.ELECTRUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ELECTRUM_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.ELECTRUM_DUST.get()), has(REOTags.Items.DUSTS_ELECTRTUM))
                .unlockedBy(getHasName(REOItems.ELECTRUM_DIRTY.get()), has(REOTags.Items.DIRTY_ELECTRUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.ELECTRUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(),
                        REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 200)
                .unlockedBy("has_emerald_ores", has(ItemTags.EMERALD_ORES))
                .unlockedBy(getHasName(REOItems.EMERALD_DUST.get()), has(REOTags.Items.DUSTS_EMERALD))
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.EMERALD);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ENDERITE.get(), REOItems.RAW_ENDERITE.get(),
                        REOItems.ENDERITE_DUST.get(), REOItems.ENDERITE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ENDERITE_INGOT.get(), 1F, 200)
                .unlockedBy("has_enderite_ores", has(REOTags.Items.ORES_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DUST.get()), has(REOTags.Items.DUSTS_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.ENDERITE_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 200)
                .unlockedBy("has_gold_ores", has(ItemTags.GOLD_ORES))
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOTags.Items.DUSTS_GOLD))
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/furnace/" + Items.GOLD_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(),
                        REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200)
                .unlockedBy("has_iron_ores", has(ItemTags.IRON_ORES))
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOTags.Items.DUSTS_IRON))
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.IRON_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.GRAVEL_ORE_LEAD.get(),
                        REOBlocks.NETHER_LEAD.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.LEAD_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_lead_ores", has(REOTags.Items.ORES_LEAD))
                .unlockedBy(getHasName(REOItems.RAW_LEAD.get()), has(REOTags.Items.RAW_MATERIALS_LEAD))
                .unlockedBy(getHasName(REOItems.LEAD_DUST.get()), has(REOTags.Items.DUSTS_LEAD))
                .unlockedBy(getHasName(REOItems.LEAD_DIRTY.get()), has(REOTags.Items.DIRTY_LEAD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.LEAD_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.NETHERITE_DUST.get(), REOItems.NETHERITE_DIRTY.get()),
                        RecipeCategory.MISC, Items.NETHERITE_SCRAP, 2F, 200)
                .unlockedBy(getHasName(REOItems.NETHERITE_DUST.get()), has(REOTags.Items.DUSTS_NETHERITE))
                .unlockedBy(getHasName(REOItems.NETHERITE_DIRTY.get()), has(REOTags.Items.DIRTY_NETHERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.NETHERITE_SCRAP);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(),
                        REOBlocks.NETHER_NICKEL.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.NICKEL_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_nickel_ores", has(REOTags.Items.ORES_NICKEL))
                .unlockedBy(getHasName(REOItems.RAW_NICKEL.get()), has(REOTags.Items.RAW_MATERIALS_NICKEL))
                .unlockedBy(getHasName(REOItems.NICKEL_DUST.get()), has(REOTags.Items.DUSTS_NICKEL))
                .unlockedBy(getHasName(REOItems.NICKEL_DIRTY.get()), has(REOTags.Items.DIRTY_NICKEL))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.NICKEL_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Blocks.OBSIDIAN, REOItems.OBSIDIAN_DUST.get(), REOItems.OBSIDIAN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.OBSIDIAN_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DUST.get()), has(REOTags.Items.DUSTS_OBSIDIAN))
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DIRTY.get()), has(REOTags.Items.DIRTY_OBSIDIAN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.OBSIDIAN_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PERIDOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get()))
                .unlockedBy(getHasName(REOItems.PERIDOT_DUST.get()), has(REOTags.Items.DUSTS_PERIDOT))
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/furnace/" + REOItems.PERIDOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                        REOBlocks.NETHER_PLATINUM.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PLATINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.ORES_PLATINUM))
                .unlockedBy(getHasName(REOItems.RAW_PLATINUM.get()), has(REOTags.Items.RAW_MATERIALS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DUST.get()), has(REOTags.Items.DUSTS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.PLATINUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.RUBY.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get()))
                .unlockedBy(getHasName(REOItems.RUBY_DUST.get()), has(REOTags.Items.DUSTS_RUBY))
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.RUBY.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SAPPHIRE.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get()))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DUST.get()), has(REOTags.Items.DUSTS_SAPPHIRE))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.SAPPHIRE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),
                        REOBlocks.NETHER_SILVER.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SILVER_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_silver_ores", has(REOTags.Items.ORES_SILVER))
                .unlockedBy(getHasName(REOItems.RAW_SILVER.get()), has(REOTags.Items.RAW_MATERIALS_SILVER))
                .unlockedBy(getHasName(REOItems.SILVER_DUST.get()), has(REOTags.Items.DUSTS_SILVER))
                .unlockedBy(getHasName(REOItems.SILVER_DIRTY.get()), has(REOTags.Items.DIRTY_SILVER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.SILVER_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Items.IRON_INGOT, REOItems.STEEL_DUST.get(), REOItems.STEEL_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.STEEL_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Tags.Items.INGOTS_IRON))
                .unlockedBy(getHasName(REOItems.STEEL_DUST.get()), has(REOTags.Items.DUSTS_STEEL))
                .unlockedBy(getHasName(REOItems.STEEL_DIRTY.get()), has(REOTags.Items.DIRTY_STEEL))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.STEEL_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_TIN.get(), REOBlocks.GRAVEL_ORE_TIN.get(),
                        REOBlocks.NETHER_TIN.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.TIN_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_tin_ores", has(REOTags.Items.ORES_TIN))
                .unlockedBy(getHasName(REOItems.RAW_TIN.get()), has(REOTags.Items.RAW_MATERIALS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DUST.get()), has(REOTags.Items.DUSTS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.TIN_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(),
                        REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.URANIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.ORES_URANIUM))
                .unlockedBy(getHasName(REOItems.RAW_URANIUM.get()), has(REOTags.Items.RAW_MATERIALS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DUST.get()), has(REOTags.Items.DUSTS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.URANIUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.GRAVEL_ORE_ZINC.get(),
                        REOBlocks.NETHER_ZINC.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ZINC_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_zinc_ores", has(REOTags.Items.ORES_ZINC))
                .unlockedBy(getHasName(REOItems.RAW_ZINC.get()), has(REOTags.Items.RAW_MATERIALS_ZINC))
                .unlockedBy(getHasName(REOItems.ZINC_DUST.get()), has(REOTags.Items.DUSTS_ZINC))
                .unlockedBy(getHasName(REOItems.ZINC_DIRTY.get()), has(REOTags.Items.DIRTY_ZINC))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.ZINC_INGOT.get());

        // Nuggets
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_IRON),
                        RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 200)
                .unlockedBy("has_iron_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_IRON))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/furnace/" + Items.IRON_NUGGET);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND),
                        RecipeCategory.MISC, REOItems.DIAMOND_NUGGET.get(), 0.1F, 200)
                .unlockedBy("has_diamond_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.DIAMOND_NUGGET.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_GOLD),
                        RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 200)
                .unlockedBy("has_golden_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_GOLD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.GOLD_NUGGET);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE),
                        RecipeCategory.MISC, REOItems.NETHERITE_NUGGET.get(), 0.1F, 200)
                .unlockedBy("has_netherite_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.NETHERITE_NUGGET.get());

        // Misc
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 200)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.RUBBER.get());

        // Food
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOItems.WHEAT_FLOUR.get(), REOItems.BARLEY_FLOUR.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 200)
                .unlockedBy(getHasName(REOItems.WHEAT_FLOUR.get()), has(REOItems.WHEAT_FLOUR.get()))
                .unlockedBy(getHasName(REOItems.BARLEY_FLOUR.get()), has(REOItems.BARLEY_FLOUR.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.BREAD);


        // Blast Furnace //
        // Ores
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                                REOBlocks.NETHER_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ALUMINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_aluminium_ores", has(REOTags.Items.ORES_ALUMINUM))
                .unlockedBy(getHasName(REOItems.RAW_ALUMINIUM.get()), has(REOTags.Items.RAW_MATERIALS_ALUMINUM))
                .unlockedBy(getHasName(REOItems.ALUMINUM_DUST.get()), has(REOTags.Items.DUSTS_ALUMINUM))
                .unlockedBy(getHasName(REOItems.ALUMINUM_DIRTY.get()), has(REOTags.Items.DIRTY_ALUMINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.ALUMINUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.AMETHYST_CLUSTER, REOItems.AMETHYST_DUST.get(), REOItems.AMETHYST_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.AMETHYST.get(), 0.7F, 200)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER))
                .unlockedBy(getHasName(REOItems.AMETHYST_DUST.get()), has(REOTags.Items.DUSTS_AMETHYST))
                .unlockedBy(getHasName(REOItems.AMETHYST_DIRTY.get()), has(REOTags.Items.DIRTY_AMETHYST))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.AMETHYST.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.BRASS_DUST.get(), REOItems.BRASS_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.BRASS_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.BRASS_DUST.get()), has(REOTags.Items.DUSTS_BRASS))
                .unlockedBy(getHasName(REOItems.BRASS_DIRTY.get()), has(REOTags.Items.DIRTY_BRASS))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.BRASS_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.BRONZE_DUST.get(), REOItems.BRONZE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.BRONZE_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_BRONZE))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_BRONZE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.BRONZE_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(),
                                REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES))
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_COPPER))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.COPPER_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(),
                                REOItems.DIAMOND_DUST.get(), REOItems.DIAMOND_DIRTY.get()),
                        RecipeCategory.MISC, Items.DIAMOND, 1F, 200)
                .unlockedBy("has_diamond_ores", has(ItemTags.DIAMOND_ORES))
                .unlockedBy(getHasName(REOItems.DIAMOND_DUST.get()), has(REOTags.Items.DUSTS_DIAMOND))
                .unlockedBy(getHasName(REOItems.DIAMOND_DIRTY.get()), has(REOTags.Items.DIRTY_DIAMOND))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.DIAMOND);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.ELECTRUM_DUST.get(), REOItems.ELECTRUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ELECTRUM_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOItems.ELECTRUM_DUST.get()), has(REOTags.Items.DUSTS_ELECTRTUM))
                .unlockedBy(getHasName(REOItems.ELECTRUM_DIRTY.get()), has(REOTags.Items.DIRTY_ELECTRUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.ELECTRUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(),
                                REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 200)
                .unlockedBy("has_emerald_ores", has(ItemTags.EMERALD_ORES))
                .unlockedBy(getHasName(REOItems.EMERALD_DUST.get()), has(REOTags.Items.DUSTS_EMERALD))
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.EMERALD);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ENDERITE.get(), REOItems.RAW_ENDERITE.get(),
                                REOItems.ENDERITE_DUST.get(), REOItems.ENDERITE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ENDERITE_INGOT.get(), 1F, 200)
                .unlockedBy("has_enderite_ores", has(REOTags.Items.ORES_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DUST.get()), has(REOTags.Items.DUSTS_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.ENDERITE_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 200)
                .unlockedBy("has_gold_ores", has(ItemTags.GOLD_ORES))
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOTags.Items.DUSTS_GOLD))
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/blast_furnace/" + Items.GOLD_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(),
                                REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200)
                .unlockedBy("has_iron_ores", has(ItemTags.IRON_ORES))
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOTags.Items.DUSTS_IRON))
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.IRON_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(), REOBlocks.GRAVEL_ORE_LEAD.get(),
                                REOBlocks.NETHER_LEAD.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.LEAD_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_lead_ores", has(REOTags.Items.ORES_LEAD))
                .unlockedBy(getHasName(REOItems.RAW_LEAD.get()), has(REOTags.Items.RAW_MATERIALS_LEAD))
                .unlockedBy(getHasName(REOItems.LEAD_DUST.get()), has(REOTags.Items.DUSTS_LEAD))
                .unlockedBy(getHasName(REOItems.LEAD_DIRTY.get()), has(REOTags.Items.DIRTY_LEAD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.LEAD_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOItems.NETHERITE_DUST.get(), REOItems.NETHERITE_DIRTY.get()),
                        RecipeCategory.MISC, Items.NETHERITE_SCRAP, 2F, 200)
                .unlockedBy(getHasName(REOItems.NETHERITE_DUST.get()), has(REOTags.Items.DUSTS_NETHERITE))
                .unlockedBy(getHasName(REOItems.NETHERITE_DIRTY.get()), has(REOTags.Items.DIRTY_NETHERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.NETHERITE_SCRAP);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(), REOBlocks.GRAVEL_ORE_NICKEL.get(),
                                REOBlocks.NETHER_NICKEL.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.NICKEL_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_nickel_ores", has(REOTags.Items.ORES_NICKEL))
                .unlockedBy(getHasName(REOItems.RAW_NICKEL.get()), has(REOTags.Items.RAW_MATERIALS_NICKEL))
                .unlockedBy(getHasName(REOItems.NICKEL_DUST.get()), has(REOTags.Items.DUSTS_NICKEL))
                .unlockedBy(getHasName(REOItems.NICKEL_DIRTY.get()), has(REOTags.Items.DIRTY_NICKEL))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.NICKEL_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Blocks.OBSIDIAN, REOItems.OBSIDIAN_DUST.get(), REOItems.OBSIDIAN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.OBSIDIAN_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN))
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DUST.get()), has(REOTags.Items.DUSTS_OBSIDIAN))
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DIRTY.get()), has(REOTags.Items.DIRTY_OBSIDIAN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.OBSIDIAN_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PERIDOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get()))
                .unlockedBy(getHasName(REOItems.PERIDOT_DUST.get()), has(REOTags.Items.DUSTS_PERIDOT))
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/blast_furnace/" + REOItems.PERIDOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(), REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                                REOBlocks.NETHER_PLATINUM.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PLATINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.ORES_PLATINUM))
                .unlockedBy(getHasName(REOItems.RAW_PLATINUM.get()), has(REOTags.Items.RAW_MATERIALS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DUST.get()), has(REOTags.Items.DUSTS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.PLATINUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.RUBY.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get()))
                .unlockedBy(getHasName(REOItems.RUBY_DUST.get()), has(REOTags.Items.DUSTS_RUBY))
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.RUBY.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SAPPHIRE.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get()))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DUST.get()), has(REOTags.Items.DUSTS_SAPPHIRE))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.SAPPHIRE.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(), REOBlocks.GRAVEL_ORE_SILVER.get(),
                                REOBlocks.NETHER_SILVER.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SILVER_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_silver_ores", has(REOTags.Items.ORES_SILVER))
                .unlockedBy(getHasName(REOItems.RAW_SILVER.get()), has(REOTags.Items.RAW_MATERIALS_SILVER))
                .unlockedBy(getHasName(REOItems.SILVER_DUST.get()), has(REOTags.Items.DUSTS_SILVER))
                .unlockedBy(getHasName(REOItems.SILVER_DIRTY.get()), has(REOTags.Items.DIRTY_SILVER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.SILVER_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.IRON_INGOT, REOItems.STEEL_DUST.get(), REOItems.STEEL_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.STEEL_INGOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Tags.Items.INGOTS_IRON))
                .unlockedBy(getHasName(REOItems.STEEL_DUST.get()), has(REOTags.Items.DUSTS_STEEL))
                .unlockedBy(getHasName(REOItems.STEEL_DIRTY.get()), has(REOTags.Items.DIRTY_STEEL))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.STEEL_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_TIN.get(), REOBlocks.GRAVEL_ORE_TIN.get(),
                                REOBlocks.NETHER_TIN.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.TIN_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_tin_ores", has(REOTags.Items.ORES_TIN))
                .unlockedBy(getHasName(REOItems.RAW_TIN.get()), has(REOTags.Items.RAW_MATERIALS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DUST.get()), has(REOTags.Items.DUSTS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.TIN_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(), REOBlocks.GRAVEL_ORE_URANIUM.get(),
                                REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.URANIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.ORES_URANIUM))
                .unlockedBy(getHasName(REOItems.RAW_URANIUM.get()), has(REOTags.Items.RAW_MATERIALS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DUST.get()), has(REOTags.Items.DUSTS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.URANIUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(), REOBlocks.GRAVEL_ORE_ZINC.get(),
                                REOBlocks.NETHER_ZINC.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ZINC_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_zinc_ores", has(REOTags.Items.ORES_ZINC))
                .unlockedBy(getHasName(REOItems.RAW_ZINC.get()), has(REOTags.Items.RAW_MATERIALS_ZINC))
                .unlockedBy(getHasName(REOItems.ZINC_DUST.get()), has(REOTags.Items.DUSTS_ZINC))
                .unlockedBy(getHasName(REOItems.ZINC_DIRTY.get()), has(REOTags.Items.DIRTY_ZINC))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.ZINC_INGOT.get());

        // Nuggets
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_IRON),
                        RecipeCategory.MISC, Items.IRON_NUGGET, 0.1F, 200)
                .unlockedBy("has_iron_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_IRON))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/blast_furnace/" + Items.IRON_NUGGET);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND),
                        RecipeCategory.MISC, REOItems.DIAMOND_NUGGET.get(), 0.1F, 200)
                .unlockedBy("has_diamond_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.DIAMOND_NUGGET.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_GOLD),
                        RecipeCategory.MISC, Items.GOLD_NUGGET, 0.1F, 200)
                .unlockedBy("has_golden_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_GOLD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.GOLD_NUGGET);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE),
                        RecipeCategory.MISC, REOItems.NETHERITE_NUGGET.get(), 0.1F, 200)
                .unlockedBy("has_netherite_tools_and_armour", has(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.NETHERITE_NUGGET.get());


        // SMOKER //
        // Misc
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 100)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/smoker/" + REOItems.RUBBER.get());

        // Food
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(REOItems.WHEAT_FLOUR.get(), REOItems.BARLEY_FLOUR.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 100)
                .unlockedBy(getHasName(REOItems.WHEAT_FLOUR.get()), has(REOItems.WHEAT_FLOUR.get()))
                .unlockedBy(getHasName(REOItems.BARLEY_FLOUR.get()), has(REOItems.BARLEY_FLOUR.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/smoker/" + Items.BREAD);

        // Campfire //
        // Misc
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(REOItems.SAP.get(), REOItems.RESIN.get()),
                        RecipeCategory.MISC, REOItems.RUBBER.get(), 0.5F, 600)
                .unlockedBy(getHasName(REOItems.SAP.get()), has(REOItems.SAP.get()))
                .unlockedBy(getHasName(REOItems.RESIN.get()), has(REOItems.RESIN.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/camp_fire/" + REOItems.RUBBER.get());

        // Food
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(REOItems.WHEAT_FLOUR.get(), REOItems.BARLEY_FLOUR.get()),
                        RecipeCategory.MISC, Items.BREAD, 0.35F, 600)
                .unlockedBy(getHasName(REOItems.WHEAT_FLOUR.get()), has(REOItems.WHEAT_FLOUR.get()))
                .unlockedBy(getHasName(REOItems.BARLEY_FLOUR.get()), has(REOItems.BARLEY_FLOUR.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/camp_fire/" + Items.BREAD);


        // Modded Furnaces//
        // Electric Furnace
        new ElectricFurnaceRecipeBuilder(Items.BAKED_POTATO, Ingredient.of(Items.POTATO), 1)
                .unlockedBy(getHasName(Items.POTATO), has(Items.POTATO))
                .save(pWriter);
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
                REOBlocks.GRAVEL_ORE_COAL.get(), REOBlocks.NETHER_COAL.get(), REOItems.COAL_DUST.get()), 1)
                .unlockedBy("has_coal_ore", has(ItemTags.COAL_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.EMERALD, Ingredient.of(Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
                REOBlocks.GRAVEL_ORE_EMERALD.get(), REOBlocks.NETHER_EMERALD.get(), REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()), 1)
                .unlockedBy("has_emerald_ore", has(ItemTags.EMERALD_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.LAPIS_LAZULI, Ingredient.of(Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE,
                REOBlocks.GRAVEL_ORE_LAPIS.get(), REOBlocks.NETHER_LAPIS.get()), 1)
                .unlockedBy("has_lapis_ore", has(ItemTags.LAPIS_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.DIAMOND, Ingredient.of(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE,
                REOBlocks.GRAVEL_ORE_DIAMOND.get(), REOBlocks.NETHER_DIAMOND.get(), REOItems.DIAMOND_DUST.get(), REOItems.DIAMOND_DIRTY.get()), 1)
                .unlockedBy("has_diamond_ore", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.QUARTZ, Ingredient.of(Blocks.NETHER_QUARTZ_ORE), 1)
                .unlockedBy("has_nether_quartz_ore", has(Blocks.NETHER_QUARTZ_ORE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.IRON_INGOT, Ingredient.of(Items.RAW_IRON, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE,
                REOBlocks.GRAVEL_ORE_IRON.get(), REOBlocks.NETHER_IRON.get(), REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()), 1)
                .unlockedBy("has_iron_ore", has(ItemTags.IRON_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COPPER_INGOT, Ingredient.of(Items.RAW_COPPER, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE,
                REOBlocks.GRAVEL_ORE_COPPER.get(), REOBlocks.NETHER_COPPER.get(), REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()), 1)
                .unlockedBy("has_copper_ore", has(ItemTags.COPPER_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.GOLD_INGOT, Ingredient.of(Items.RAW_GOLD, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE,
                Blocks.NETHER_GOLD_ORE, REOBlocks.GRAVEL_ORE_GOLD.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()), 1)
                .unlockedBy("has_gold_ore", has(ItemTags.GOLD_ORES)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.ALUMINUM_INGOT.get(), Ingredient.of(REOBlocks.ORE_ALUMINIUM.get(), REOBlocks.DEEPSLATE_ALUMINIUM.get(),
                REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOBlocks.NETHER_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()), 1)
                .unlockedBy("has_aluminium_ore", has(REOTags.Items.ORES_ALUMINUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.LEAD_INGOT.get(), Ingredient.of(REOBlocks.ORE_LEAD.get(), REOBlocks.DEEPSLATE_LEAD.get(),
                REOBlocks.GRAVEL_ORE_LEAD.get(), REOBlocks.NETHER_LEAD.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()), 1)
                .unlockedBy("has_lead_ore", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.NICKEL_INGOT.get(), Ingredient.of(REOBlocks.ORE_NICKEL.get(), REOBlocks.DEEPSLATE_NICKEL.get(),
                REOBlocks.GRAVEL_ORE_NICKEL.get(), REOBlocks.NETHER_NICKEL.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()), 1)
                .unlockedBy("has_nickel_ore", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.PLATINUM_INGOT.get(), Ingredient.of(REOBlocks.ORE_PLATINUM.get(), REOBlocks.DEEPSLATE_PLATINUM.get(),
                REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOBlocks.NETHER_PLATINUM.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()), 1)
                .unlockedBy("has_platinum_ore", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.SILVER_INGOT.get(), Ingredient.of(REOBlocks.ORE_SILVER.get(), REOBlocks.DEEPSLATE_SILVER.get(),
                REOBlocks.GRAVEL_ORE_SILVER.get(), REOBlocks.NETHER_SILVER.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()), 1)
                .unlockedBy("has_silver_ore", has(REOTags.Items.ORES_SILVER)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.TIN_INGOT.get(), Ingredient.of(REOBlocks.ORE_TIN.get(),
                REOBlocks.GRAVEL_ORE_TIN.get(), REOBlocks.NETHER_TIN.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()), 1)
                .unlockedBy("has_tin_ore", has(REOTags.Items.ORES_TIN)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.URANIUM_INGOT.get(), Ingredient.of(REOBlocks.ORE_URANIUM.get(), REOBlocks.DEEPSLATE_URANIUM.get(),
                REOBlocks.GRAVEL_ORE_URANIUM.get(), REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()), 1)
                .unlockedBy("has_uranium_ore", has(REOTags.Items.ORES_URANIUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.ZINC_INGOT.get(), Ingredient.of(REOBlocks.ORE_ZINC.get(), REOBlocks.DEEPSLATE_ZINC.get(),
                REOBlocks.GRAVEL_ORE_ZINC.get(), REOBlocks.NETHER_ZINC.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()), 1)
                .unlockedBy("has_zinc_ore", has(REOTags.Items.ORES_ZINC)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.AMETHYST.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER, Items.AMETHYST_SHARD,
                REOItems.AMETHYST_DUST.get(), REOItems.AMETHYST_DIRTY.get()), 1)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.PERIDOT.get(), Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.PERIDOT_SHARD.get(),
                REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.RUBY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get(), REOItems.RUBY_SHARD.get(),
                REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.SAPPHIRE.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.SAPPHIRE_SHARD.get(),
                REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.IRON_NUGGET, Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_IRON), 1)
                .unlockedBy("has_iron_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_IRON)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(Items.GOLD_NUGGET, Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_GOLD), 1)
                .unlockedBy("has_gold_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_GOLD)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.DIAMOND_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND), 1)
                .unlockedBy("has_diamond_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_DIAMOND)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.NETHERITE_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE), 1)
                .unlockedBy("has_netherite_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_NETHERITE)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.ALUMINUM_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_ALUMINUM), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_ALUMINUM)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.AMETHYST_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_AMETHYST), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_AMETHYST)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.BRONZE_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_BRONZE), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_BRONZE)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.ENDERITE_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_ENDERITE), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_ENDERITE)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.PERIDOT_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_PERIDOT), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_PERIDOT)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.PLATINUM_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_PLATINUM), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_PLATINUM)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.RUBY_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_RUBY), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_RUBY)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.SAPPHIRE_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_SAPPHIRE), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_SAPPHIRE)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.SILVER_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_SILVER), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_SILVER)).save(pWriter);

        new ElectricFurnaceRecipeBuilder(REOItems.STEEL_NUGGET.get(), Ingredient.of(REOTags.Items.TOOLS_AND_ARMOR_STEEL), 1)
                .unlockedBy("has_aluminium_tools_and_armor", has(REOTags.Items.TOOLS_AND_ARMOR_STEEL)).save(pWriter);

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
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.ALUMINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_ALUMINUM),
                0.5F, 200).unlockedBy("has_ore_aluminium", has(REOTags.Items.ORES_ALUMINUM)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.AMETHYST_DIRTY.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER),
                0.5F, 200).unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.COAL_DUST.get(), Ingredient.of(ItemTags.COAL_ORES),
                0.5F, 200).unlockedBy("has_ore_coal", has(ItemTags.COAL_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.COPPER_DIRTY.get(), Ingredient.of(ItemTags.COPPER_ORES),
                0.5F, 200).unlockedBy("has_ore_copper", has(ItemTags.COPPER_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.DIAMOND_DIRTY.get(), Ingredient.of(ItemTags.DIAMOND_ORES),
                0.5F, 200).unlockedBy("has_ore_diamond", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.EMERALD_DIRTY.get(), Ingredient.of(ItemTags.EMERALD_ORES),
                0.5F, 200).unlockedBy("has_ore_emerald", has(ItemTags.EMERALD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.ENDERITE_DIRTY.get(), Ingredient.of(REOBlocks.ORE_ENDERITE.get()),
                0.5F, 200).unlockedBy("has_ore_enderite", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.GOLD_DIRTY.get(), Ingredient.of(ItemTags.GOLD_ORES),
                0.5F, 200).unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.IRON_DIRTY.get(), Ingredient.of(ItemTags.IRON_ORES),
                0.5F, 200).unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.LEAD_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_LEAD),
                0.5F, 200).unlockedBy("has_ore_lead", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.NICKEL_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_NICKEL),
                0.5F, 200).unlockedBy("has_ore_nickel", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.PERIDOT_DIRTY.get(),Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.PLATINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_PLATINUM),
                0.5F, 200).unlockedBy("has_ore_platinum", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.RUBY_DIRTY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.SAPPHIRE_DIRTY.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.SILVER_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_SILVER),
                0.5F, 200).unlockedBy("has_ore_silver", has(REOTags.Items.ORES_SILVER)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.TIN_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_TIN),
                0.5F, 200).unlockedBy("has_ore_tin", has(REOTags.Items.ORES_TIN)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.URANIUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_URANIUM),
                0.5F, 200).unlockedBy("has_ore_uranium", has(REOTags.Items.ORES_URANIUM)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.ZINC_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_ZINC),
                0.5F, 200).unlockedBy("has_ore_zinc", has(REOTags.Items.ORES_ZINC)).save(pWriter);


        // Misc
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.CHARCOAL_DUST.get(), Ingredient.of(Items.CHARCOAL),
                0.3F, 200).unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL)).save(pWriter);
        BasicCrusherRecipeBuilder.named(RecipeCategory.MISC, REOItems.COAL_DUST.get(), Ingredient.of(Items.COAL),
                0.5F, 200, "_from_coal").unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.OBSIDIAN_DIRTY.get(), Ingredient.of(Blocks.OBSIDIAN),
                0.5F, 200).unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, Blocks.GRAVEL, Ingredient.of(Blocks.COBBLESTONE),
                0.3F, 200).unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        BasicCrusherRecipeBuilder.named(RecipeCategory.BUILDING_BLOCKS, Blocks.SAND, Ingredient.of(Blocks.SANDSTONE),
                0.1F, 200, "_from_sandstone").unlockedBy(getHasName(Blocks.SANDSTONE), has(Blocks.SANDSTONE)).save(pWriter);
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
        CrusherRecipeBuilder.generic(REOItems.ALUMINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_ALUMINUM), 2)
                .unlockedBy("has_ore_aluminium", has(REOTags.Items.ORES_ALUMINUM)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.AMETHYST_DIRTY.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER), 2)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.COAL_DUST.get(), Ingredient.of(ItemTags.COAL_ORES), 2)
                .unlockedBy("has_ore_coal", has(ItemTags.COAL_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.COPPER_DIRTY.get(), Ingredient.of(ItemTags.COPPER_ORES), 2)
                .unlockedBy("has_ore_copper", has(ItemTags.COPPER_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.DIAMOND_DIRTY.get(), Ingredient.of(ItemTags.DIAMOND_ORES), 2)
                .unlockedBy("has_ore_diamond", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.EMERALD_DIRTY.get(), Ingredient.of(ItemTags.EMERALD_ORES), 2)
                .unlockedBy("has_ore_emerald", has(ItemTags.EMERALD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.ENDERITE_DIRTY.get(), Ingredient.of(REOBlocks.ORE_ENDERITE.get()), 2)
                .unlockedBy("has_ore_enderite", has(REOBlocks.ORE_ENDERITE.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.GOLD_DIRTY.get(), Ingredient.of(ItemTags.GOLD_ORES), 2)
                .unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.IRON_DIRTY.get(), Ingredient.of(ItemTags.IRON_ORES), 2)
                .unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.LEAD_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_LEAD), 2)
                .unlockedBy("has_ore_lead", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.NICKEL_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_NICKEL), 2)
                .unlockedBy("has_ore_nickel", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.PERIDOT_DIRTY.get(),Ingredient.of(REOBlocks.CLUSTER_PERIDOT.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_PERIDOT.get()), has(REOBlocks.CLUSTER_PERIDOT.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.PLATINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_PLATINUM), 2)
                .unlockedBy("has_ore_platinum", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.RUBY_DIRTY.get(), Ingredient.of(REOBlocks.CLUSTER_RUBY.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_RUBY.get()), has(REOBlocks.CLUSTER_RUBY.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.SAPPHIRE_DIRTY.get(), Ingredient.of(REOBlocks.CLUSTER_SAPPHIRE.get()), 2)
                .unlockedBy(getHasName(REOBlocks.CLUSTER_SAPPHIRE.get()), has(REOBlocks.CLUSTER_SAPPHIRE.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.SILVER_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_SILVER), 2)
                .unlockedBy("has_ore_silver", has(REOTags.Items.ORES_SILVER)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.TIN_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_TIN), 2)
                .unlockedBy("has_ore_tin", has(REOTags.Items.ORES_TIN)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.URANIUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_URANIUM), 2)
                .unlockedBy("has_ore_uranium", has(REOTags.Items.ORES_URANIUM)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.ZINC_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_ZINC), 2)
                .unlockedBy("has_ore_zinc", has(REOTags.Items.ORES_ZINC)).save(pWriter);


        // Misc
        CrusherRecipeBuilder.generic(REOItems.CHARCOAL_DUST.get(), Ingredient.of(Items.CHARCOAL), 1)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.OBSIDIAN_DIRTY.get(), Ingredient.of(Blocks.OBSIDIAN), 2)
                .unlockedBy(getHasName(Blocks.OBSIDIAN), has(Blocks.OBSIDIAN)).save(pWriter);
        CrusherRecipeBuilder.generic(Blocks.GRAVEL, Ingredient.of(Blocks.COBBLESTONE), 1)
                .unlockedBy(getHasName(Blocks.COBBLESTONE), has(Blocks.COBBLESTONE)).save(pWriter);
        CrusherRecipeBuilder.generic(Blocks.SAND, Ingredient.of(Blocks.GRAVEL), 1)
                .unlockedBy(getHasName(Blocks.GRAVEL), has(Blocks.GRAVEL)).save(pWriter);
        CrusherRecipeBuilder.named(Blocks.SAND, Ingredient.of(Blocks.GRAVEL), 1, "_from_sandstone")
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
        CrusherRecipeBuilder.named(REOItems.ALUMINUM_DIRTY.get(), Ingredient.of(REOItems.ALUMINUM_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.ALUMINUM_INGOT.get()), has(REOItems.ALUMINUM_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.AMETHYST_DIRTY.get(), Ingredient.of(REOItems.AMETHYST.get()), 1, "_from_gem")
                .unlockedBy(getHasName(REOItems.AMETHYST.get()), has(REOItems.AMETHYST.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.COAL_DUST.get(), Ingredient.of(Items.COAL), 1, "_from_coal")
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.COPPER_DIRTY.get(), Ingredient.of(Items.COPPER_INGOT), 1, "_from_ingot")
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.DIAMOND_DIRTY.get(), Ingredient.of(Items.DIAMOND), 1, "_from_ingot")
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.EMERALD_DIRTY.get(), Ingredient.of(Items.EMERALD), 1, "_from_ingot")
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.ENDERITE_DIRTY.get(), Ingredient.of(REOItems.ENDERITE_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.ENDERITE_INGOT.get()), has(REOItems.ENDERITE_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.GOLD_DIRTY.get(), Ingredient.of(Items.GOLD_INGOT), 1, "_from_ingot")
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.IRON_DIRTY.get(), Ingredient.of(Items.IRON_INGOT), 1, "_from_ingot")
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.LEAD_DIRTY.get(), Ingredient.of(REOItems.LEAD_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.LEAD_INGOT.get()), has(REOItems.LEAD_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.NICKEL_DIRTY.get(), Ingredient.of(REOItems.NICKEL_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.NICKEL_INGOT.get()), has(REOItems.NICKEL_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.PERIDOT_DIRTY.get(),Ingredient.of(REOItems.PERIDOT.get()), 1, "_from_gem")
                .unlockedBy(getHasName(REOItems.PERIDOT.get()), has(REOItems.PERIDOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.PLATINUM_DIRTY.get(), Ingredient.of(REOItems.PLATINUM_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.PLATINUM_INGOT.get()), has(REOItems.PLATINUM_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.RUBY_DIRTY.get(), Ingredient.of(REOItems.RUBY.get()), 1, "_from_gem")
                .unlockedBy(getHasName(REOItems.RUBY.get()), has(REOItems.RUBY.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.SAPPHIRE_DIRTY.get(), Ingredient.of(REOItems.SAPPHIRE.get()), 1, "_from_gem")
                .unlockedBy(getHasName(REOItems.SAPPHIRE.get()), has(REOItems.SAPPHIRE.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.SILVER_DIRTY.get(), Ingredient.of(REOItems.SILVER_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.SILVER_INGOT.get()), has(REOItems.SILVER_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.TIN_DIRTY.get(), Ingredient.of(REOItems.TIN_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.TIN_INGOT.get()), has(REOItems.TIN_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.URANIUM_DIRTY.get(), Ingredient.of(REOItems.URANIUM_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.URANIUM_INGOT.get()), has(REOItems.URANIUM_INGOT.get())).save(pWriter);
        CrusherRecipeBuilder.named(REOItems.ZINC_DIRTY.get(), Ingredient.of(REOItems.ZINC_INGOT.get()), 1, "_from_ingot")
                .unlockedBy(getHasName(REOItems.ZINC_INGOT.get()), has(REOItems.ZINC_INGOT.get())).save(pWriter);

        // Alloy Furnace //
        // Dust
        new AlloyFurnaceRecipeBuilder(REOItems.BRASS_DUST.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.COPPER_DUST.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.ZINC_DUST.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.COPPER_DUST.get()), has(REOItems.COPPER_DUST.get()))
                .unlockedBy(getHasName(REOItems.ZINC_DUST.get()), has(REOItems.ZINC_DUST.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.BRONZE_DUST.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.COPPER_DUST.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.TIN_DUST.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.COPPER_DUST.get()), has(REOItems.COPPER_DUST.get()))
                .unlockedBy(getHasName(REOItems.TIN_DUST.get()), has(REOItems.TIN_DUST.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.ELECTRUM_DUST.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.GOLD_DUST.get(), 2)),
                StrictNBTIngredient.of(new ItemStack(REOItems.SILVER_DUST.get(), 2)), 2)
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOItems.GOLD_DUST.get()))
                .unlockedBy(getHasName(REOItems.SILVER_DUST.get()), has(REOItems.SILVER_DUST.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.STEEL_DUST.get(),
                StrictNBTIngredient.of(new ItemStack(REOItems.IRON_DUST.get(), 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.COAL_DUST.get(), 3)), 2)
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOItems.IRON_DUST.get()))
                .unlockedBy(getHasName(REOItems.COAL_DUST.get()), has(REOItems.COAL_DUST.get())).save(pWriter);

        // Ingot
        new AlloyFurnaceRecipeBuilder(REOItems.BRASS_INGOT.get(),
                StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.ZINC_INGOT.get(), 2)), 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.ZINC_INGOT.get()), has(REOItems.ZINC_INGOT.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.BRONZE_INGOT.get(),
                StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 1)),
                StrictNBTIngredient.of(new ItemStack(REOItems.TIN_INGOT.get(), 2)), 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.TIN_INGOT.get()), has(REOItems.TIN_INGOT.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.ELECTRUM_INGOT.get(),
                StrictNBTIngredient.of(new ItemStack(Items.GOLD_INGOT, 2)),
                StrictNBTIngredient.of(new ItemStack(REOItems.SILVER_INGOT.get(), 2)), 2)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(REOItems.SILVER_INGOT.get()), has(REOItems.SILVER_INGOT.get())).save(pWriter);
        new AlloyFurnaceRecipeBuilder(REOItems.STEEL_INGOT.get(),
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
        new CompressorRecipeBuilderBuilder(REOItems.ALUMINUM_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.ALUMINUM_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.ALUMINUM_INGOT.get()), has(REOItems.ALUMINUM_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.AMETHYST_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.AMETHYST.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.AMETHYST.get()), has(REOItems.AMETHYST.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.BRASS_PALTE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.BRASS_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.BRASS_INGOT.get()), has(REOItems.BRASS_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.BRONZE_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.BRONZE_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.BRONZE_INGOT.get()), has(REOItems.BRONZE_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.COPPER_PALTE.get(), StrictNBTIngredient.of(new ItemStack(Items.COPPER_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.DIAMOND_PLATE.get(), StrictNBTIngredient.of(new ItemStack(Items.DIAMOND, 3)) , 1)
                .unlockedBy(getHasName(Items.DIAMOND), has(Items.DIAMOND)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.ELECTRUM_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.ELECTRUM_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.ELECTRUM_INGOT.get()), has(REOItems.ELECTRUM_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.EMERALD_PLATE.get(), StrictNBTIngredient.of(new ItemStack(Items.EMERALD, 3)) , 1)
                .unlockedBy(getHasName(Items.EMERALD), has(Items.EMERALD)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.ENDERITE_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.ENDERITE_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.ENDERITE_INGOT.get()), has(REOItems.ENDERITE_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.GOLD_PLATE.get(), StrictNBTIngredient.of(new ItemStack(Items.GOLD_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.IRON_PLATE.get(), StrictNBTIngredient.of(new ItemStack(Items.IRON_INGOT, 3)) , 1)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.LEAD_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.LEAD_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.LEAD_INGOT.get()), has(REOItems.LEAD_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.NICKEL_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.NICKEL_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.NICKEL_INGOT.get()), has(REOItems.NICKEL_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PERIDOT_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.PERIDOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.PERIDOT.get()), has(REOItems.PERIDOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.PLATINUM_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.PLATINUM_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.PLATINUM_INGOT.get()), has(REOItems.PLATINUM_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.RUBY_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.RUBY.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.RUBY.get()), has(REOItems.RUBY.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.SAPPHIRE_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.SAPPHIRE.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.SAPPHIRE.get()), has(REOItems.SAPPHIRE.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.SILVER_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.SILVER_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.SILVER_INGOT.get()), has(REOItems.SILVER_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.STEEL_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.STEEL_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.STEEL_INGOT.get()), has(REOItems.STEEL_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.TIN_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.TIN_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.TIN_INGOT.get()), has(REOItems.TIN_INGOT.get())).save(pWriter);
        new CompressorRecipeBuilderBuilder(REOItems.ZINC_PLATE.get(), StrictNBTIngredient.of(new ItemStack(REOItems.ZINC_INGOT.get(), 3)) , 1)
                .unlockedBy(getHasName(REOItems.ZINC_INGOT.get()), has(REOItems.ZINC_INGOT.get())).save(pWriter);

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
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.ALUMINUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ALUMINUM), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.ALUMINUM_DIRTY.get()), has(REOTags.Items.DIRTY_ALUMINUM)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.AMETHYST_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_AMETHYST), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.AMETHYST_DIRTY.get()), has(REOTags.Items.DIRTY_AMETHYST)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.BRASS_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_BRASS), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.BRASS_DIRTY.get()), has(REOTags.Items.DIRTY_BRASS)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.BRONZE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_BRONZE), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_BRONZE)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.COPPER_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_COPPER), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.COPPER_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.DIAMOND_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_DIAMOND), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.DIAMOND_DIRTY.get()), has(REOTags.Items.DIRTY_DIAMOND)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.ELECTRUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ELECTRUM), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.ELECTRUM_DIRTY.get()), has(REOTags.Items.DIRTY_ELECTRUM)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.EMERALD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_EMERALD), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.ENDERITE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ENDERITE), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.GOLD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_GOLD), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.IRON_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_IRON), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.LEAD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_LEAD), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.LEAD_DIRTY.get()), has(REOTags.Items.DIRTY_LEAD)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.NICKEL_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_NICKEL), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.NICKEL_DIRTY.get()), has(REOTags.Items.DIRTY_NICKEL)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.OBSIDIAN_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_OBSIDIAN), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DIRTY.get()), has(REOTags.Items.DIRTY_OBSIDIAN)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.PERIDOT_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_PERIDOT), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.PLATINUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_PLATINUM), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.RUBY_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_RUBY), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.SAPPHIRE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_SAPPHIRE), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.SILVER_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_SILVER), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.SILVER_DIRTY.get()), has(REOTags.Items.DIRTY_SILVER)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.STEEL_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_STEEL), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.STEEL_DIRTY.get()), has(REOTags.Items.DIRTY_STEEL)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.TIN_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_TIN), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.URANIUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_URANIUM), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM)).save(pWriter);
        new BasicPurifierRecipeBuilder(RecipeCategory.MISC, REOItems.ZINC_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ZINC), 0.7F, 400)
                .unlockedBy(getHasName(REOItems.ZINC_DIRTY.get()), has(REOTags.Items.DIRTY_ZINC)).save(pWriter);

        // Purifier //
        PurifierRecipeBuilder.generic(REOItems.ALUMINUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ALUMINUM), 1)
                .unlockedBy(getHasName(REOItems.ALUMINUM_DIRTY.get()), has(REOTags.Items.DIRTY_ALUMINUM)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.AMETHYST_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_AMETHYST), 1)
                .unlockedBy(getHasName(REOItems.AMETHYST_DIRTY.get()), has(REOTags.Items.DIRTY_AMETHYST)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.BRASS_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_BRASS), 1)
                .unlockedBy(getHasName(REOItems.BRASS_DIRTY.get()), has(REOTags.Items.DIRTY_BRASS)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.BRONZE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_BRONZE), 1)
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_BRONZE)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.COPPER_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_COPPER), 1)
                .unlockedBy(getHasName(REOItems.COPPER_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.DIAMOND_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_DIAMOND), 1)
                .unlockedBy(getHasName(REOItems.DIAMOND_DIRTY.get()), has(REOTags.Items.DIRTY_DIAMOND)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.ELECTRUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ELECTRUM), 1)
                .unlockedBy(getHasName(REOItems.ELECTRUM_DIRTY.get()), has(REOTags.Items.DIRTY_ELECTRUM)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.EMERALD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_EMERALD), 1)
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.ENDERITE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ENDERITE), 1)
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.GOLD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_GOLD), 1)
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.IRON_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_IRON), 1)
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.LEAD_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_LEAD), 1)
                .unlockedBy(getHasName(REOItems.LEAD_DIRTY.get()), has(REOTags.Items.DIRTY_LEAD)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.NICKEL_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_NICKEL), 1)
                .unlockedBy(getHasName(REOItems.NICKEL_DIRTY.get()), has(REOTags.Items.DIRTY_NICKEL)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.OBSIDIAN_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_OBSIDIAN), 1)
                .unlockedBy(getHasName(REOItems.OBSIDIAN_DIRTY.get()), has(REOTags.Items.DIRTY_OBSIDIAN)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.PERIDOT_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_PERIDOT), 1)
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.PLATINUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_PLATINUM), 1)
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.RUBY_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_RUBY), 1)
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.SAPPHIRE_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_SAPPHIRE), 1)
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.SILVER_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_SILVER), 1)
                .unlockedBy(getHasName(REOItems.SILVER_DIRTY.get()), has(REOTags.Items.DIRTY_SILVER)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.STEEL_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_STEEL), 1)
                .unlockedBy(getHasName(REOItems.STEEL_DIRTY.get()), has(REOTags.Items.DIRTY_STEEL)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.TIN_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_TIN), 1)
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.URANIUM_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_URANIUM), 1)
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM)).save(pWriter);
        PurifierRecipeBuilder.generic(REOItems.ZINC_DUST.get(), Ingredient.of(REOTags.Items.DIRTY_ZINC), 1)
                .unlockedBy(getHasName(REOItems.ZINC_DIRTY.get()), has(REOTags.Items.DIRTY_ZINC)).save(pWriter);

        // Blocks //
        // Storage
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_ALUMINIUM.get(), REOItems.ALUMINUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_BRASS.get(), REOItems.BRASS_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_BRONZE.get(), REOItems.BRONZE_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_ELECTRUM.get(), REOItems.ELECTRUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_ENDERITE.get(), REOItems.ENDERITE_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_LEAD.get(), REOItems.LEAD_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_NICKEL.get(), REOItems.NICKEL_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_PLATINUM.get(), REOItems.PLATINUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_SILVER.get(), REOItems.SILVER_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_STEEL.get(), REOItems.STEEL_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_TIN.get(), REOItems.TIN_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_URANIUM.get(), REOItems.URANIUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_ZINC.get(), REOItems.ZINC_INGOT.get());

        geodeBlockRecipe(pWriter, REOBlocks.BLOCK_PERIDOT.get(), REOItems.PERIDOT_SHARD.get());
        geodeBlockRecipe(pWriter, REOBlocks.BLOCK_RUBY.get(), REOItems.RUBY_SHARD.get());
        geodeBlockRecipe(pWriter, REOBlocks.BLOCK_SAPPHIRE.get(), REOItems.SAPPHIRE_SHARD.get());

        // Raw Storage
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_ENDERITE.get(), REOItems.RAW_ENDERITE.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_LEAD.get(), REOItems.RAW_LEAD.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_NICKEL.get(), REOItems.RAW_NICKEL.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_PLATINUM.get(), REOItems.RAW_PLATINUM.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_SILVER.get(), REOItems.RAW_SILVER.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_TIN.get(), REOItems.RAW_TIN.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_URANIUM.get(), REOItems.RAW_URANIUM.get());
        storageBlockRecipe(pWriter, REOBlocks.BLOCK_RAW_ZINC.get(), REOItems.RAW_ZINC.get());


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
        lampRecipe(pWriter, REOBlocks.LAMP_BLACK.get(), REOItems.BLACK_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_BLUE.get(), REOItems.BLUE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_BROWN.get(), REOItems.BROWN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_CYAN.get(), REOItems.CYAN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_GRAY.get(), REOItems.GRAY_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_GREEN.get(), REOItems.GREEN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIGHTBLUE.get(), REOItems.LIGHT_BLUE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIGHTGRAY.get(), REOItems.LIGHT_GRAY_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_LIME.get(), REOItems.LIME_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_MAGENTA.get(), REOItems.MAGENTA_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_ORANGE.get(), REOItems.ORANGE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_PINK.get(), REOItems.PINK_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_PURPLE.get(), REOItems.PURPLE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_RED.get(), REOItems.RED_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_WHITE.get(), REOItems.WHITE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LAMP_YELLOW.get(), REOItems.YELLOW_LUMINOUS.get());

        // Seeds
        seedRecipe(pWriter, REOItems.BARLEY_SEED.get(), REOItems.BARLEY_PLANT.get());
        seedRecipe(pWriter, REOItems.CAULIFLOWER_SEED.get(), REOItems.CAULIFLOWER.get());
        seedRecipe(pWriter, REOItems.COTTON_SEED.get(), REOItems.COTTON_PLANT.get());
        seedRecipe(pWriter, REOItems.RICE_SEED.get(), REOItems.RICE_PLANT.get());
        seedRecipe(pWriter, REOItems.TOMATO_SEED.get(), REOItems.TOMATO.get());
        seedRecipe(pWriter, REOItems.TOMATO_SEED.get(), REOItems.TOMATO_ROTTEN.get());

        flourRecipe(pWriter, REOItems.WHEAT_FLOUR.get(), Items.WHEAT);
        flourRecipe(pWriter, REOItems.BARLEY_FLOUR.get(), REOItems.BARLEY_PLANT.get());
        breadLikeRecipe(pWriter, Items.BREAD, REOItems.BARLEY_PLANT.get());
        breadLikeRecipe(pWriter, Items.STRING, REOItems.COTTON_PLANT.get());
        breadLikeRecipe(pWriter, REOItems.RICE.get(), REOItems.RICE_PLANT.get());

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

        boatRecipe(pWriter, REOItems.BALSA_BOAT.get(), REOBlocks.PLANKS_BALSA.get());
        chestBoatRecipe(pWriter, REOItems.BALSA_CHEST_BOAT.get(), REOItems.BALSA_BOAT.get());

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

        boatRecipe(pWriter, REOItems.BAOBAB_BOAT.get(), REOBlocks.PLANKS_BAOBAB.get());
        chestBoatRecipe(pWriter, REOItems.BAOBAB_CHEST_BOAT.get(), REOItems.BAOBAB_BOAT.get());

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

        boatRecipe(pWriter, REOItems.HILL_CHERRY_BOAT.get(), REOBlocks.PLANKS_HILL_CHERRY.get());
        chestBoatRecipe(pWriter, REOItems.HILL_CHERRY_CHEST_BOAT.get(), REOItems.HILL_CHERRY_BOAT.get());

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
        chestBoatRecipe(pWriter, REOItems.CHESTNUT_CHEST_BOAT.get(), REOItems.BOAT_CHESTNUT.get());

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

        boatRecipe(pWriter, REOItems.CITRUS_BOAT.get(), REOBlocks.PLANKS_CITRUS.get());
        chestBoatRecipe(pWriter, REOItems.CITRUS_CHEST_BOAT.get(), REOItems.CITRUS_BOAT.get());

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

        boatRecipe(pWriter, REOItems.EBONY_BOAT.get(), REOBlocks.PLANKS_EBONY.get());
        chestBoatRecipe(pWriter, REOItems.EBONY_CHEST_BOAT.get(), REOItems.EBONY_BOAT.get());

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

        boatRecipe(pWriter, REOItems.LARCH_BOAT.get(), REOBlocks.PLANKS_LARCH.get());
        chestBoatRecipe(pWriter, REOItems.LARCH_CHEST_BOAT.get(), REOItems.LARCH_BOAT.get());

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

        boatRecipe(pWriter, REOItems.LIME_BOAT.get(), REOBlocks.PLANKS_LIME.get());
        chestBoatRecipe(pWriter, REOItems.LIME_CHEST_BOAT.get(), REOItems.LIME_BOAT.get());

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

        boatRecipe(pWriter, REOItems.MAHOGANY_BOAT.get(), REOBlocks.PLANKS_MAHOGANY.get());
        chestBoatRecipe(pWriter, REOItems.MAHOGANY_CHEST_BOAT.get(), REOItems.MAHOGANY_BOAT.get());

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

        boatRecipe(pWriter, REOItems.MAPLE_BOAT.get(), REOBlocks.PLANKS_MAPLE.get());
        chestBoatRecipe(pWriter, REOItems.MAPLE_CHEST_BOAT.get(), REOItems.MAPLE_BOAT.get());

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

        boatRecipe(pWriter, REOItems.PALM_BOAT.get(), REOBlocks.PLANKS_PALM.get());
        chestBoatRecipe(pWriter, REOItems.PALM_CHEST_BOAT.get(), REOItems.PALM_BOAT.get());

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

        boatRecipe(pWriter, REOItems.PAPAYA_BOAT.get(), REOBlocks.PLANKS_PAPAYA.get());
        chestBoatRecipe(pWriter, REOItems.PAPAYA_CHEST_BOAT.get(), REOItems.PAPAYA_BOAT.get());

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

        boatRecipe(pWriter, REOItems.PINE_BOAT.get(), REOBlocks.PLANKS_PINE.get());
        chestBoatRecipe(pWriter, REOItems.PINE_CHEST_BOAT.get(), REOItems.PINE_BOAT.get());

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

        boatRecipe(pWriter, REOItems.POPLAR_BOAT.get(), REOBlocks.PLANKS_POPLAR.get());
        chestBoatRecipe(pWriter, REOItems.POPLAR_CHEST_BOAT.get(), REOItems.POPLAR_BOAT.get());

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

        boatRecipe(pWriter, REOItems.REDWOOD_BOAT.get(), REOBlocks.PLANKS_REDWOOD.get());
        chestBoatRecipe(pWriter, REOItems.REDWOOD_CHEST_BOAT.get(), REOItems.REDWOOD_BOAT.get());

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

        boatRecipe(pWriter, REOItems.RUBBER_BOAT.get(), REOBlocks.PLANKS_RUBBER.get());
        chestBoatRecipe(pWriter, REOItems.RUBBER_CHEST_BOAT.get(), REOItems.RUBBER_BOAT.get());

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

        boatRecipe(pWriter, REOItems.TEAK_BOAT.get(), REOBlocks.PLANKS_TEAK.get());
        chestBoatRecipe(pWriter, REOItems.TEAK_CHEST_BOAT.get(), REOItems.TEAK_BOAT.get());

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

        boatRecipe(pWriter, REOItems.WALNUT_BOAT.get(), REOBlocks.PLANKS_WALNUT.get());
        chestBoatRecipe(pWriter, REOItems.WALNUT_CHEST_BOAT.get(), REOItems.WALNUT_BOAT.get());

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

        boatRecipe(pWriter, REOItems.WILLOW_BOAT.get(), REOBlocks.PLANKS_WILLOW.get());
        chestBoatRecipe(pWriter, REOItems.WILLOW_CHEST_BOAT.get(), REOItems.WILLOW_BOAT.get());

        // Tools //
        // Aluminium
        shovelRecipe(pWriter, REOItems.ALUMINIUM_SHOVEL.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.ALUMINIUM_PICKAXE.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        axeRecipe(pWriter, REOItems.ALUMINIUM_AXE.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        hoeRecipe(pWriter, REOItems.ALUMINIUM_HOE.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        swordRecipe(pWriter, REOItems.ALUMINIUM_SWORD.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        hammerRecipe(pWriter, REOItems.ALUMINIUM_HAMMER.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        excavatorRecipe(pWriter, REOItems.ALUMINIUM_EXCAVATOR.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        hatchetRecipe(pWriter, REOItems.ALUMINIUM_HATCHET.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        sickleRecipe(pWriter, REOItems.ALUMINIUM_SICKLE.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        shearsRecipe(pWriter, REOItems.ALUMINIUM_SHEARS.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());

        paxelRecipe(pWriter, REOItems.ALUMINIUM_PAXEL.get(),
                REOItems.ALUMINIUM_AXE.get(), REOItems.ALUMINIUM_SHOVEL.get(), REOItems.ALUMINIUM_PICKAXE.get());
        bowRecipe(pWriter, REOItems.ALUMINIUM_BOW.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());

        // Amethyst
        shovelRecipe(pWriter, REOItems.AMETHYST_SHOVEL.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        pickaxeRecipe(pWriter, REOItems.AMETHYST_PICKAXE.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        axeRecipe(pWriter, REOItems.AMETHYST_AXE.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        hoeRecipe(pWriter, REOItems.AMETHYST_HOE.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        swordRecipe(pWriter, REOItems.AMETHYST_SWORD.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        hammerRecipe(pWriter, REOItems.AMETHYST_HAMMER.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        excavatorRecipe(pWriter, REOItems.AMETHYST_EXCAVATOR.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        hatchetRecipe(pWriter, REOItems.AMETHYST_HATCHET.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        sickleRecipe(pWriter, REOItems.AMETHYST_SICKLE.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        shearsRecipe(pWriter, REOItems.AMETHYST_SHEARS.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());

        paxelRecipe(pWriter, REOItems.AMETHYST_PAXEL.get(),
                REOItems.AMETHYST_AXE.get(), REOItems.AMETHYST_SHOVEL.get(), REOItems.AMETHYST_PICKAXE.get());
        bowRecipe(pWriter, REOItems.AMETHYST_BOW.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());

        // Bronze
        shovelRecipe(pWriter, REOItems.BRONZE_SHOVEL.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.BRONZE_PICKAXE.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        axeRecipe(pWriter, REOItems.BRONZE_AXE.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        hoeRecipe(pWriter, REOItems.BRONZE_HOE.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        swordRecipe(pWriter, REOItems.BRONZE_SWORD.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        hammerRecipe(pWriter, REOItems.BRONZE_HAMMER.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        excavatorRecipe(pWriter, REOItems.BRONZE_EXCAVATOR.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        hatchetRecipe(pWriter, REOItems.BRONZE_HATCHET.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        sickleRecipe(pWriter, REOItems.BRONZE_SICKLE.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        shearsRecipe(pWriter, REOItems.BRONZE_SHEARS.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());

        paxelRecipe(pWriter, REOItems.BRONZE_PAXEL.get(),
                REOItems.BRONZE_AXE.get(), REOItems.BRONZE_SHOVEL.get(), REOItems.BRONZE_PICKAXE.get());
        bowRecipe(pWriter, REOItems.BRONZE_BOW.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());

        // Diamond
        hammerRecipe(pWriter, REOItems.DIAMOND_HAMMER.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);
        excavatorRecipe(pWriter, REOItems.DIAMOND_EXCAVATOR.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);
        hatchetRecipe(pWriter, REOItems.DIAMOND_HATCHET.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);
        sickleRecipe(pWriter, REOItems.DIAMOND_SICKLE.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);
        shearsRecipe(pWriter, REOItems.DIAMOND_SHEARS.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);

        paxelRecipe(pWriter, REOItems.DIAMOND_PAXEL.get(), Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE);
        bowRecipe(pWriter, REOItems.DIAMOND_BOW.get(), Tags.Items.GEMS_DIAMOND, Items.DIAMOND);

        // Enderite
        shovelRecipe(pWriter, REOItems.ENDERITE_SHOVEL.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.ENDERITE_PICKAXE.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        axeRecipe(pWriter, REOItems.ENDERITE_AXE.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        hoeRecipe(pWriter, REOItems.ENDERITE_HOE.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        swordRecipe(pWriter, REOItems.ENDERITE_SWORD.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        hammerRecipe(pWriter, REOItems.ENDERITE_HAMMER.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        excavatorRecipe(pWriter, REOItems.ENDERITE_EXCAVATOR.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        hatchetRecipe(pWriter, REOItems.ENDERITE_HATCHET.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        sickleRecipe(pWriter, REOItems.ENDERITE_SICKLE.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        shearsRecipe(pWriter, REOItems.ENDERITE_SHEARS.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());

        paxelRecipe(pWriter, REOItems.ENDERITE_PAXEL.get(),
                REOItems.ENDERITE_AXE.get(), REOItems.ENDERITE_SHOVEL.get(), REOItems.ENDERITE_PICKAXE.get());
        bowRecipe(pWriter, REOItems.ENDERITE_BOW.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());

        // Golden
        hammerRecipe(pWriter, REOItems.GOLDEN_HAMMER.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);
        excavatorRecipe(pWriter, REOItems.GOLDEN_EXCAVATOR.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);
        hatchetRecipe(pWriter, REOItems.GOLDEN_HATCHET.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);
        sickleRecipe(pWriter, REOItems.GOLDEN_SICKLE.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);
        shearsRecipe(pWriter, REOItems.GOLDEN_SHEARS.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);

        paxelRecipe(pWriter, REOItems.GOLDEN_PAXEL.get(), Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE);
        bowRecipe(pWriter, REOItems.GOLDEN_BOW.get(), Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);

        // Iron
        hammerRecipe(pWriter, REOItems.IRON_HAMMER.get(), Tags.Items.INGOTS_IRON, Items.IRON_INGOT);
        excavatorRecipe(pWriter, REOItems.IRON_EXCAVATOR.get(), Tags.Items.INGOTS_IRON, Items.IRON_INGOT);
        hatchetRecipe(pWriter, REOItems.IRON_HATCHET.get(), Tags.Items.INGOTS_IRON, Items.IRON_INGOT);
        sickleRecipe(pWriter, REOItems.IRON_SICKLE.get(), Tags.Items.INGOTS_IRON, Items.IRON_INGOT);

        paxelRecipe(pWriter, REOItems.IRON_PAXEL.get(), Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_PICKAXE);
        bowRecipe(pWriter, REOItems.IRON_BOW.get(), Tags.Items.INGOTS_IRON, Items.IRON_INGOT);

        // Netherite

        // Peridot
        shovelRecipe(pWriter, REOItems.PERIDOT_SHOVEL.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        pickaxeRecipe(pWriter, REOItems.PERIDOT_PICKAXE.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        axeRecipe(pWriter, REOItems.PERIDOT_AXE.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        hoeRecipe(pWriter, REOItems.PERIDOT_HOE.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        swordRecipe(pWriter, REOItems.PERIDOT_SWORD.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        hammerRecipe(pWriter, REOItems.PERIDOT_HAMMER.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        excavatorRecipe(pWriter, REOItems.PERIDOT_EXCAVATOR.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        hatchetRecipe(pWriter, REOItems.PERIDOT_HATCHET.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        sickleRecipe(pWriter, REOItems.PERIDOT_SICKLE.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        shearsRecipe(pWriter, REOItems.PERIDOT_SHEARS.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());

        paxelRecipe(pWriter, REOItems.PERIDOT_PAXEL.get(),
                REOItems.PERIDOT_AXE.get(), REOItems.PERIDOT_SHOVEL.get(), REOItems.PERIDOT_PICKAXE.get());
        bowRecipe(pWriter, REOItems.PERIDOT_BOW.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());

        // Platinum
        shovelRecipe(pWriter, REOItems.PLATINUM_SHOVEL.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.PLATINUM_PICKAXE.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        axeRecipe(pWriter, REOItems.PLATINUM_AXE.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        hoeRecipe(pWriter, REOItems.PLATINUM_HOE.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        swordRecipe(pWriter, REOItems.PLATINUM_SWORD.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        hammerRecipe(pWriter, REOItems.PLATINUM_HAMMER.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        excavatorRecipe(pWriter, REOItems.PLATINUM_EXCAVATOR.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        hatchetRecipe(pWriter, REOItems.PLATINUM_HATCHET.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        sickleRecipe(pWriter, REOItems.PLATINUM_SICKLE.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        shearsRecipe(pWriter, REOItems.PLATINUM_SHEARS.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());

        paxelRecipe(pWriter, REOItems.PLATINUM_PAXEL.get(),
                REOItems.PLATINUM_AXE.get(), REOItems.PLATINUM_SHOVEL.get(), REOItems.PLATINUM_PICKAXE.get());
        bowRecipe(pWriter, REOItems.PLATINUM_BOW.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());

        // Ruby
        shovelRecipe(pWriter, REOItems.RUBY_SHOVEL.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        pickaxeRecipe(pWriter, REOItems.RUBY_PICKAXE.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        axeRecipe(pWriter, REOItems.RUBY_AXE.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        hoeRecipe(pWriter, REOItems.RUBY_HOE.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        swordRecipe(pWriter, REOItems.RUBY_SWORD.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        hammerRecipe(pWriter, REOItems.RUBY_HAMMER.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        excavatorRecipe(pWriter, REOItems.RUBY_EXCAVATOR.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        hatchetRecipe(pWriter, REOItems.RUBY_HATCHET.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        sickleRecipe(pWriter, REOItems.RUBY_SICKLE.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        shearsRecipe(pWriter, REOItems.RUBY_SHEARS.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());

        paxelRecipe(pWriter, REOItems.RUBY_PAXEL.get(),
                REOItems.RUBY_AXE.get(), REOItems.RUBY_SHOVEL.get(), REOItems.RUBY_PICKAXE.get());
        bowRecipe(pWriter, REOItems.RUBY_BOW.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());

        // Sapphire
        shovelRecipe(pWriter, REOItems.SAPPHIRE_SHOVEL.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        pickaxeRecipe(pWriter, REOItems.SAPPHIRE_PICKAXE.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        axeRecipe(pWriter, REOItems.SAPPHIRE_AXE.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        hoeRecipe(pWriter, REOItems.SAPPHIRE_HOE.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        swordRecipe(pWriter, REOItems.SAPPHIRE_SWORD.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        hammerRecipe(pWriter, REOItems.SAPPHIRE_HAMMER.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        excavatorRecipe(pWriter, REOItems.SAPPHIRE_EXCAVATOR.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        hatchetRecipe(pWriter, REOItems.SAPPHIRE_HATCHET.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        sickleRecipe(pWriter, REOItems.SAPPHIRE_SICKLE.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        shearsRecipe(pWriter, REOItems.SAPPHIRE_SHEARS.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());

        paxelRecipe(pWriter, REOItems.SAPPHIRE_PAXEL.get(),
                REOItems.SAPPHIRE_AXE.get(), REOItems.SAPPHIRE_SHOVEL.get(), REOItems.SAPPHIRE_PICKAXE.get());
        bowRecipe(pWriter, REOItems.SAPPHIRE_BOW.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());

        // Silver
        shovelRecipe(pWriter, REOItems.SILVER_SHOVEL.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.SILVER_PICKAXE.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        axeRecipe(pWriter, REOItems.SILVER_AXE.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        hoeRecipe(pWriter, REOItems.SILVER_HOE.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        swordRecipe(pWriter, REOItems.SILVER_SWORD.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        hammerRecipe(pWriter, REOItems.SILVER_HAMMER.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        excavatorRecipe(pWriter, REOItems.SILVER_EXCAVATOR.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        hatchetRecipe(pWriter, REOItems.SILVER_HATCHET.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        sickleRecipe(pWriter, REOItems.SILVER_SICKLE.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        shearsRecipe(pWriter, REOItems.SILVER_SHEARS.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());

        paxelRecipe(pWriter, REOItems.SILVER_PAXEL.get(),
                REOItems.SILVER_AXE.get(), REOItems.SILVER_SHOVEL.get(), REOItems.SILVER_PICKAXE.get());
        bowRecipe(pWriter, REOItems.SILVER_BOW.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());

        // Steel
        shovelRecipe(pWriter, REOItems.STEEL_SHOVEL.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        pickaxeRecipe(pWriter, REOItems.STEEL_PICKAXE.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        axeRecipe(pWriter, REOItems.STEEL_AXE.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        hoeRecipe(pWriter, REOItems.STEEL_HOE.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        swordRecipe(pWriter, REOItems.STEEL_SWORD.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        hammerRecipe(pWriter, REOItems.STEEL_HAMMER.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        excavatorRecipe(pWriter, REOItems.STEEL_EXCAVATOR.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        hatchetRecipe(pWriter, REOItems.STEEL_HATCHET.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        sickleRecipe(pWriter, REOItems.STEEL_SICKLE.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        shearsRecipe(pWriter, REOItems.STEEL_SHEARS.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());

        paxelRecipe(pWriter, REOItems.STEEL_PAXEL.get(),
                REOItems.STEEL_AXE.get(), REOItems.STEEL_SHOVEL.get(), REOItems.STEEL_PICKAXE.get());
        bowRecipe(pWriter, REOItems.STEEL_BOW.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());

        // Stone
        hammerRecipe(pWriter, REOItems.STONE_HAMMER.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);
        excavatorRecipe(pWriter, REOItems.STONE_EXCAVATOR.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);
        hatchetRecipe(pWriter, REOItems.STONE_HATCHET.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);
        sickleRecipe(pWriter, REOItems.STONE_SICKLE.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);
        shearsRecipe(pWriter, REOItems.STONE_SHEARS.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);

        paxelRecipe(pWriter, REOItems.STONE_PAXEL.get(), Items.STONE_AXE, Items.STONE_SHOVEL, Items.STONE_PICKAXE);
        bowRecipe(pWriter, REOItems.STONE_BOW.get(), ItemTags.STONE_TOOL_MATERIALS, Blocks.COBBLESTONE);

        // Wooden
        hammerRecipe(pWriter, REOItems.WOODEN_HAMMER.get(), ItemTags.PLANKS, Items.OAK_PLANKS);
        excavatorRecipe(pWriter, REOItems.WOODEN_EXCAVATOR.get(), ItemTags.PLANKS, Items.OAK_PLANKS);
        hatchetRecipe(pWriter, REOItems.WOODEN_HATCHET.get(), ItemTags.PLANKS, Items.OAK_PLANKS);
        sickleRecipe(pWriter, REOItems.WOODEN_SICKLE.get(), ItemTags.PLANKS, Items.OAK_PLANKS);
        shearsRecipe(pWriter, REOItems.WOODEN_SHEARS.get(), ItemTags.PLANKS, Items.OAK_PLANKS);

        paxelRecipe(pWriter, REOItems.WOODEN_PAXEL.get(), Items.WOODEN_AXE, Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE);

        // Armour //
        // Aluminium
        helmetRecipe(pWriter, REOItems.ALUMINIUM_HELMET.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        chestplateRecipe(pWriter, REOItems.ALUMINIUM_CHESTPLATE.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        legginsRecipe(pWriter, REOItems.ALUMINIUM_LEGGINGS.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        bootsRecipe(pWriter, REOItems.ALUMINIUM_BOOTS.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.ALUMINIUM_HORSE_ARMOR.get(), REOTags.Items.INGOTS_ALUMINUM, REOItems.ALUMINUM_INGOT.get());

        // Amethyst
        helmetRecipe(pWriter, REOItems.AMETHYST_HELMET.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        chestplateRecipe(pWriter, REOItems.AMETHYST_CHESTPLATE.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        legginsRecipe(pWriter, REOItems.AMETHYST_LEGGINGS.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        bootsRecipe(pWriter, REOItems.AMETHYST_BOOTS.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());
        horseArmorRecipe(pWriter, REOItems.AMETHYST_HORSE_ARMOR.get(), REOTags.Items.GEMS_AMETHYST, REOItems.AMETHYST.get());

        // Bronze
        helmetRecipe(pWriter, REOItems.BRONZE_HELMET.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        chestplateRecipe(pWriter, REOItems.BRONZE_CHESTPLATE.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        legginsRecipe(pWriter, REOItems.BRONZE_LEGGINGS.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        bootsRecipe(pWriter, REOItems.BRONZE_BOOTS.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.BRONZE_HORSE_ARMOR.get(), REOTags.Items.INGOTS_BRONZE, REOItems.BRONZE_INGOT.get());

        // Chain
        helmetRecipe(pWriter, Items.CHAINMAIL_HELMET, REOTags.Items.INGOTS_CHAIN, Items.CHAIN);
        chestplateRecipe(pWriter, Items.CHAINMAIL_CHESTPLATE, REOTags.Items.INGOTS_CHAIN, Items.CHAIN);
        legginsRecipe(pWriter, Items.CHAINMAIL_LEGGINGS, REOTags.Items.INGOTS_CHAIN, Items.CHAIN);
        bootsRecipe(pWriter, Items.CHAINMAIL_BOOTS, REOTags.Items.INGOTS_CHAIN, Items.CHAIN);
        //horseArmorRecipe(pWriter, REOItems.HORSE_ARMOR_CHAINMAIL.get(), REOTags.Items.INGOTS_CHAIN, Items.CHAIN);

        // Enderite
        helmetRecipe(pWriter, REOItems.ENDERITE_HELMET.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        chestplateRecipe(pWriter, REOItems.ENDERITE_CHESTPLATE.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        legginsRecipe(pWriter, REOItems.ENDERITE_LEGGINGS.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        bootsRecipe(pWriter, REOItems.ENDERITE_BOOTS.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.ENDERITE_HORSE_ARMOR.get(), REOTags.Items.INGOTS_ENDERITE, REOItems.ENDERITE_INGOT.get());

        // Peridot
        helmetRecipe(pWriter, REOItems.PERIDOT_HELMET.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        chestplateRecipe(pWriter, REOItems.PERIDOT_CHESTPLATE.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        legginsRecipe(pWriter, REOItems.PERIDOT_LEGGINGS.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        bootsRecipe(pWriter, REOItems.PERIDOT_BOOTS.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());
        horseArmorRecipe(pWriter, REOItems.PERIDOT_HORSE_ARMOR.get(), REOTags.Items.GEMS_PERIDOT, REOItems.PERIDOT.get());

        // Platinum
        helmetRecipe(pWriter, REOItems.PLATINUM_HELMET.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        chestplateRecipe(pWriter, REOItems.PLATINUM_CHESTPLATE.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        legginsRecipe(pWriter, REOItems.PLATINUM_LEGGINGS.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        bootsRecipe(pWriter, REOItems.PLATINUM_BOOTS.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.PLATINUM_HORSE_ARMOR.get(), REOTags.Items.INGOTS_PLATINUM, REOItems.PLATINUM_INGOT.get());

        // Ruby
        helmetRecipe(pWriter, REOItems.RUBY_HELMET.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        chestplateRecipe(pWriter, REOItems.RUBY_CHESTPLATE.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        legginsRecipe(pWriter, REOItems.RUBY_LEGGINGS.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        bootsRecipe(pWriter, REOItems.RUBY_BOOTS.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());
        horseArmorRecipe(pWriter, REOItems.RUBY_HORSE_ARMOR.get(), REOTags.Items.GEMS_RUBY, REOItems.RUBY.get());

        // Sapphire
        helmetRecipe(pWriter, REOItems.SAPPHIRE_HELMET.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        chestplateRecipe(pWriter, REOItems.SAPPHIRE_CHESTPLATE.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        legginsRecipe(pWriter, REOItems.SAPPHIRE_LEGGINGS.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        bootsRecipe(pWriter, REOItems.SAPPHIRE_BOOTS.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());
        horseArmorRecipe(pWriter, REOItems.SAPPHIRE_HORSE_ARMOR.get(), REOTags.Items.GEMS_SAPPHIRE, REOItems.SAPPHIRE.get());

        // Silver
        helmetRecipe(pWriter, REOItems.SILVER_HELMET.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        chestplateRecipe(pWriter, REOItems.SILVER_CHESTPLATE.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        legginsRecipe(pWriter, REOItems.SILVER_LEGGINGS.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        bootsRecipe(pWriter, REOItems.SILVER_BOOTS.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.SILVER_HORSE_ARMOR.get(), REOTags.Items.INGOTS_SILVER, REOItems.SILVER_INGOT.get());

        // Steel
        helmetRecipe(pWriter, REOItems.STEEL_HELMET.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        chestplateRecipe(pWriter, REOItems.STEEL_CHESTPLATE.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        legginsRecipe(pWriter, REOItems.STEEL_LEGGINGS.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        bootsRecipe(pWriter, REOItems.STEEL_BOOTS.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());
        horseArmorRecipe(pWriter, REOItems.STEEL_HORSE_ARMOR.get(), REOTags.Items.INGOTS_STEEL, REOItems.STEEL_INGOT.get());

        // Vanila
        horseArmorRecipe(pWriter,Items.IRON_HORSE_ARMOR, Tags.Items.INGOTS_IRON, Items.IRON_INGOT);
        horseArmorRecipe(pWriter,Items.GOLDEN_HORSE_ARMOR, Tags.Items.INGOTS_GOLD, Items.GOLD_INGOT);
        horseArmorRecipe(pWriter,Items.DIAMOND_HORSE_ARMOR, Tags.Items.GEMS_DIAMOND, Items.DIAMOND);

        // Saddle
        saddleRecipe(pWriter);

        // Items
        // Ingots Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.BRONZE_INGOT.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.NICKEL_INGOT.get(), 3)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.NICKEL_INGOT.get()), has(REOItems.NICKEL_INGOT.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.BRONZE_INGOT.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.BRASS_INGOT.get(), 2)
                .requires(Items.COPPER_INGOT)
                .requires(REOItems.ZINC_INGOT.get(), 3)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .unlockedBy(getHasName(REOItems.ZINC_INGOT.get()), has(REOItems.ZINC_INGOT.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.BRASS_INGOT.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.ELECTRUM_INGOT.get(), 2)
                .requires(Items.GOLD_INGOT, 2)
                .requires(REOItems.SILVER_INGOT.get(), 2)
                .unlockedBy(getHasName(Items.GOLD_INGOT), has(Items.GOLD_INGOT))
                .unlockedBy(getHasName(REOItems.SILVER_INGOT.get()), has(REOItems.SILVER_INGOT.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.ELECTRUM_INGOT.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.STEEL_INGOT.get(), 2)
                .requires(Items.IRON_INGOT)
                .requires(Items.COAL, 3)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.STEEL_INGOT.get()));

        // Dust Alloys
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.BRONZE_DUST.get(), 2)
                .requires(REOItems.COPPER_DUST.get())
                .requires(REOItems.NICKEL_DUST.get(), 3)
                .unlockedBy(getHasName(REOItems.COPPER_DUST.get()), has(REOItems.COPPER_DUST.get()))
                .unlockedBy(getHasName(REOItems.NICKEL_DUST.get()), has(REOItems.NICKEL_DUST.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.BRONZE_DUST.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.BRASS_DUST.get(), 2)
                .requires(REOItems.COPPER_DUST.get())
                .requires(REOItems.ZINC_DUST.get(), 3)
                .unlockedBy(getHasName(REOItems.COPPER_DUST.get()), has(REOItems.COPPER_DUST.get()))
                .unlockedBy(getHasName(REOItems.ZINC_DUST.get()), has(REOItems.ZINC_DUST.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.BRASS_DUST.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.ELECTRUM_DUST.get(), 2)
                .requires(REOItems.GOLD_DUST.get(), 2)
                .requires(REOItems.SILVER_DUST.get(), 2)
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOItems.GOLD_DUST.get()))
                .unlockedBy(getHasName(REOItems.SILVER_DUST.get()), has(REOItems.SILVER_DUST.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.ELECTRUM_DUST.get()));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, REOItems.STEEL_DUST.get(), 2)
                .requires(REOItems.IRON_DUST.get())
                .requires(REOItems.COAL_DUST.get(), 3)
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOItems.IRON_DUST.get()))
                .unlockedBy(getHasName(REOItems.COAL_DUST.get()), has(REOItems.COAL_DUST.get()))
                .save(pWriter, RealEarthOres.MOD_ID + ":items/alloys/" + getItemName(REOItems.STEEL_DUST.get()));

        // Nuggets
        nuggetRecipe(pWriter, REOItems.ALUMINUM_INGOT.get(), REOItems.ALUMINUM_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.AMETHYST.get(), REOItems.AMETHYST_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.BRASS_INGOT.get(), REOItems.BRASS_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.BRONZE_INGOT.get(), REOItems.BRONZE_NUGGET.get());
        nuggetRecipe(pWriter, Items.COPPER_INGOT, REOItems.COPPER_NUGGET.get());
        nuggetRecipe(pWriter, Items.DIAMOND, REOItems.DIAMOND_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.ELECTRUM_INGOT.get(), REOItems.ELECTRUM_NUGGET.get());
        nuggetRecipe(pWriter, Items.EMERALD, REOItems.EMERALD_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.ENDERITE_INGOT.get(), REOItems.ENDERITE_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.LEAD_INGOT.get(), REOItems.LEAD_NUGGET.get());
        nuggetRecipe(pWriter, Items.NETHERITE_INGOT, REOItems.NETHERITE_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.NICKEL_INGOT.get(), REOItems.NICKEL_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.PERIDOT.get(), REOItems.PERIDOT_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.PLATINUM_INGOT.get(), REOItems.PLATINUM_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.RUBY.get(), REOItems.RUBY_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.SAPPHIRE.get(), REOItems.SAPPHIRE_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.SILVER_INGOT.get(), REOItems.SILVER_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.STEEL_INGOT.get(), REOItems.STEEL_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.TIN_INGOT.get(), REOItems.TIN_NUGGET.get());
        nuggetRecipe(pWriter, REOItems.ZINC_INGOT.get(), REOItems.ZINC_NUGGET.get());

        // Ingots
        ingotRecipe(pWriter, REOItems.ALUMINUM_NUGGET.get(), REOItems.ALUMINUM_INGOT.get());
        ingotRecipe(pWriter, REOItems.AMETHYST_NUGGET.get(), REOItems.AMETHYST.get());
        ingotRecipe(pWriter, REOItems.BRASS_NUGGET.get(), REOItems.BRASS_INGOT.get());
        ingotRecipe(pWriter, REOItems.BRONZE_NUGGET.get(), REOItems.BRONZE_INGOT.get());
        ingotRecipe(pWriter, REOItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        ingotRecipe(pWriter, REOItems.DIAMOND_NUGGET.get(), Items.DIAMOND);
        ingotRecipe(pWriter, REOItems.ELECTRUM_NUGGET.get(), REOItems.ELECTRUM_INGOT.get());
        ingotRecipe(pWriter, REOItems.EMERALD_NUGGET.get(), Items.EMERALD);
        ingotRecipe(pWriter, REOItems.ENDERITE_NUGGET.get(), REOItems.ENDERITE_INGOT.get());
        ingotRecipe(pWriter, REOItems.LEAD_NUGGET.get(), REOItems.LEAD_INGOT.get());
        ingotRecipe(pWriter, REOItems.NETHERITE_NUGGET.get(), Items.NETHERITE_INGOT);
        ingotRecipe(pWriter, REOItems.NICKEL_NUGGET.get(), REOItems.NICKEL_INGOT.get());
        ingotRecipe(pWriter, REOItems.PERIDOT_NUGGET.get(), REOItems.PERIDOT.get());
        ingotRecipe(pWriter, REOItems.PLATINUM_NUGGET.get(), REOItems.PLATINUM_INGOT.get());
        ingotRecipe(pWriter, REOItems.RUBY_NUGGET.get(), REOItems.RUBY.get());
        ingotRecipe(pWriter, REOItems.SAPPHIRE_NUGGET.get(), REOItems.SAPPHIRE.get());
        ingotRecipe(pWriter, REOItems.SILVER_NUGGET.get(), REOItems.SILVER_INGOT.get());
        ingotRecipe(pWriter, REOItems.STEEL_NUGGET.get(), REOItems.STEEL_INGOT.get());
        ingotRecipe(pWriter, REOItems.TIN_NUGGET.get(), REOItems.TIN_INGOT.get());
        ingotRecipe(pWriter, REOItems.ZINC_NUGGET.get(), REOItems.ZINC_INGOT.get());

        ingotRecipe(pWriter, REOItems.ALUMINUM_INGOT.get(), REOBlocks.BLOCK_ALUMINIUM.get());
        ingotRecipe(pWriter, REOItems.BRASS_INGOT.get(), REOBlocks.BLOCK_BRASS.get());
        ingotRecipe(pWriter, REOItems.BRONZE_INGOT.get(), REOBlocks.BLOCK_BRONZE.get());
        ingotRecipe(pWriter, REOItems.ELECTRUM_INGOT.get(), REOBlocks.BLOCK_ELECTRUM.get());
        ingotRecipe(pWriter, REOItems.ENDERITE_INGOT.get(), REOBlocks.BLOCK_ENDERITE.get());
        ingotRecipe(pWriter, REOItems.LEAD_INGOT.get(), REOBlocks.BLOCK_LEAD.get());
        ingotRecipe(pWriter, REOItems.NICKEL_INGOT.get(), REOBlocks.BLOCK_NICKEL.get());
        ingotRecipe(pWriter, REOItems.PLATINUM_INGOT.get(), REOBlocks.BLOCK_PLATINUM.get());
        ingotRecipe(pWriter, REOItems.SILVER_INGOT.get(), REOBlocks.BLOCK_SILVER.get());
        ingotRecipe(pWriter, REOItems.STEEL_INGOT.get(), REOBlocks.BLOCK_STEEL.get());
        ingotRecipe(pWriter, REOItems.TIN_INGOT.get(), REOBlocks.BLOCK_TIN.get());
        ingotRecipe(pWriter, REOItems.ZINC_INGOT.get(), REOBlocks.BLOCK_ZINC.get());

        // Luminous Powder
        luminousDustRecipe(pWriter, REOItems.BLACK_LUMINOUS.get(), Items.BLACK_DYE);
        luminousDustRecipe(pWriter, REOItems.BLUE_LUMINOUS.get(), Items.BLUE_DYE);
        luminousDustRecipe(pWriter, REOItems.BROWN_LUMINOUS.get(), Items.BROWN_DYE);
        luminousDustRecipe(pWriter, REOItems.CYAN_LUMINOUS.get(), Items.CYAN_DYE);
        luminousDustRecipe(pWriter, REOItems.GRAY_LUMINOUS.get(), Items.GRAY_DYE);
        luminousDustRecipe(pWriter, REOItems.GREEN_LUMINOUS.get(), Items.GREEN_DYE);
        luminousDustRecipe(pWriter, REOItems.LIGHT_BLUE_LUMINOUS.get(), Items.LIGHT_BLUE_DYE);
        luminousDustRecipe(pWriter, REOItems.LIGHT_GRAY_LUMINOUS.get(), Items.LIGHT_GRAY_DYE);
        luminousDustRecipe(pWriter, REOItems.LIME_LUMINOUS.get(), Items.LIME_DYE);
        luminousDustRecipe(pWriter, REOItems.MAGENTA_LUMINOUS.get(), Items.MAGENTA_DYE);
        luminousDustRecipe(pWriter, REOItems.ORANGE_LUMINOUS.get(), Items.ORANGE_DYE);
        luminousDustRecipe(pWriter, REOItems.PINK_LUMINOUS.get(), Items.PINK_DYE);
        luminousDustRecipe(pWriter, REOItems.PURPLE_LUMINOUS.get(), Items.PURPLE_DYE);
        luminousDustRecipe(pWriter, REOItems.RED_LUMINOUS.get(), Items.RED_DYE);
        luminousDustRecipe(pWriter, REOItems.WHITE_LUMINOUS.get(), Items.WHITE_DYE);
        luminousDustRecipe(pWriter, REOItems.YELLOW_LUMINOUS.get(), Items.YELLOW_DYE);


        // Tech //
        // Gear
        // Base
        woodenGearRecipe(pWriter, REOItems.WOOD_GEAR.get());
        stoneGearRecipe(pWriter, REOItems.STONE_GEAR.get());

        // Tier 1
        tier1GearRecipe(pWriter, REOItems.IRON_GEAR.get(), Items.IRON_INGOT);
        tier1GearRecipe(pWriter, REOItems.ALUMINUM_GEAR.get(), REOItems.ALUMINUM_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.BRASS_GEAR.get(), REOItems.BRASS_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.BRONZE_GEAR.get(), REOItems.BRONZE_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.COPPER_GEAR.get(), Items.COPPER_INGOT);
        tier1GearRecipe(pWriter, REOItems.LEAD_GEAR.get(), REOItems.LEAD_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.NICKEL_GEAR.get(), REOItems.NICKEL_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.SILVER_GEAR.get(), REOItems.SILVER_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.STEEL_GEAR.get(), REOItems.STEEL_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.TIN_GEAR.get(), REOItems.TIN_INGOT.get());
        tier1GearRecipe(pWriter, REOItems.ZINC_GEAR.get(), REOItems.ZINC_INGOT.get());

        // Tier 2
        tier2GearRecipe(pWriter, REOItems.AMETHYST_GEAR.get(), REOItems.AMETHYST.get());
        tier2GearRecipe(pWriter, REOItems.DIAMOND_GEAR.get(), Items.DIAMOND);
        tier2GearRecipe(pWriter, REOItems.ELECTRUM_GEAR.get(), REOItems.ELECTRUM_INGOT.get());
        tier2GearRecipe(pWriter, REOItems.EMERALD_GEAR.get(), Items.EMERALD);
        tier2GearRecipe(pWriter, REOItems.GOLD_GERAR.get(), Items.GOLD_INGOT);
        tier2GearRecipe(pWriter, REOItems.PERIDOT_GEAR.get(), REOItems.PERIDOT.get());
        tier2GearRecipe(pWriter, REOItems.RUBY_GEAR.get(), REOItems.RUBY.get());
        tier2GearRecipe(pWriter, REOItems.SAPPHIRE_GEAR.get(), REOItems.SAPPHIRE.get());

        // Tier 3
        tier3GearRecipe(pWriter, REOItems.ENDERITE_GEAR.get(), REOItems.ENDERITE_INGOT.get());
        tier3GearRecipe(pWriter, REOItems.PLATINUM_GEAR.get(), REOItems.PLATINUM_INGOT.get());

        // Plate
        plateRecipe(pWriter, REOItems.ALUMINUM_PLATE.get(), REOItems.ALUMINUM_INGOT.get());
        plateRecipe(pWriter, REOItems.AMETHYST_PLATE.get(), REOItems.AMETHYST.get());
        plateRecipe(pWriter, REOItems.BRASS_PALTE.get(), REOItems.BRASS_INGOT.get());
        plateRecipe(pWriter, REOItems.BRONZE_PLATE.get(), REOItems.BRONZE_INGOT.get());
        plateRecipe(pWriter, REOItems.COPPER_PALTE.get(), Items.COPPER_INGOT);
        plateRecipe(pWriter, REOItems.DIAMOND_PLATE.get(), Items.DIAMOND);
        plateRecipe(pWriter, REOItems.ELECTRUM_PLATE.get(), REOItems.ELECTRUM_INGOT.get());
        plateRecipe(pWriter, REOItems.EMERALD_PLATE.get(), Items.EMERALD);
        plateRecipe(pWriter, REOItems.ENDERITE_PLATE.get(), REOItems.ENDERITE_INGOT.get());
        plateRecipe(pWriter, REOItems.GOLD_PLATE.get(), Items.GOLD_INGOT);
        plateRecipe(pWriter, REOItems.IRON_PLATE.get(), Items.IRON_INGOT);
        plateRecipe(pWriter, REOItems.LEAD_PLATE.get(), REOItems.LEAD_INGOT.get());
        plateRecipe(pWriter, REOItems.NICKEL_PLATE.get(), REOItems.NICKEL_INGOT.get());
        plateRecipe(pWriter, REOItems.PLATINUM_PLATE.get(), REOItems.PLATINUM_INGOT.get());
        plateRecipe(pWriter, REOItems.PERIDOT_PLATE.get(), REOItems.PERIDOT.get());
        plateRecipe(pWriter, REOItems.RUBY_PLATE.get(), REOItems.RUBY.get());
        plateRecipe(pWriter, REOItems.SAPPHIRE_PLATE.get(), REOItems.SAPPHIRE.get());
        plateRecipe(pWriter, REOItems.SILVER_PLATE.get(), REOItems.SILVER_INGOT.get());
        plateRecipe(pWriter, REOItems.STEEL_PLATE.get(), REOItems.STEEL_INGOT.get());
        plateRecipe(pWriter, REOItems.TIN_PLATE.get(), REOItems.TIN_INGOT.get());
        plateRecipe(pWriter, REOItems.ZINC_PLATE.get(), REOItems.ZINC_INGOT.get());

        // Machines //
        // Coal
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, REOBlocks.KILN.get())
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Blocks.BRICKS)
                .define('B', Blocks.FURNACE)
                .unlockedBy(getHasName(Blocks.FURNACE), has(Blocks.FURNACE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/machine/" + getItemName(REOBlocks.KILN.get()));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, REOBlocks.CRUSHER.get())
                .pattern("AAA")
                .pattern("BCB")
                .pattern("DDD")
                .define('A', Items.FLINT)
                .define('B', Blocks.PISTON)
                .define('C', Blocks.FURNACE)
                .define('D', Blocks.COBBLESTONE)
                .unlockedBy(getHasName(Blocks.FURNACE), has(Blocks.FURNACE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/machine/" + getItemName(REOBlocks.CRUSHER.get()));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, REOBlocks.EXTRACTOR.get())
                .pattern("AAA")
                .pattern("BCB")
                .pattern("AAA")
                .define('A', Blocks.COBBLESTONE)
                .define('B', REOItems.TREE_TAP.get())
                .define('C', Blocks.FURNACE)
                .unlockedBy(getHasName(Blocks.FURNACE), has(Blocks.FURNACE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/machine/" + getItemName(REOBlocks.EXTRACTOR.get()));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, REOBlocks.PURIFIER.get())
                .pattern("AAA")
                .pattern("DCD")
                .pattern("DBD")
                .define('A', Items.IRON_INGOT)
                .define('B', Blocks.CAMPFIRE)
                .define('C', Blocks.FURNACE)
                .define('D', Blocks.COBBLESTONE)
                .unlockedBy(getHasName(Blocks.FURNACE), has(Blocks.FURNACE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/machine/" + getItemName(REOBlocks.PURIFIER.get()));

    }

    protected static void stonecutterRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), RecipeCategory.BUILDING_BLOCKS, pResult, pResultCount)
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID + ":blocks/stonecutter/" + getConversionRecipeName(pResult, pMaterial) + "_stonecutting");
    }


    protected static void slab(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pPressurePlate, ItemLike pMaterial) {
        slabBuilder(pCategory, pPressurePlate, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID + ":blocks/building_blocks/" + getItemName(pPressurePlate));
    }

    protected static void wall(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pWall, ItemLike pMaterial) {
        wallBuilder(pCategory, pWall, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID + ":blocks/building_blocks/" + getItemName(pWall));
    }

    protected static void cut(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pCutResult, ItemLike pMaterial) {
        cutBuilder(pCategory, pCutResult, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID + ":blocks/building_blocks/" + getItemName(pCutResult));
    }

    protected static void shovelRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("S")
                .pattern("S")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void pickaxeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void axeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern("#S")
                .pattern(" S")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void hoeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("##")
                .pattern(" S")
                .pattern(" S")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void swordRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("S")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void hammerRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void excavatorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("#S#")
                .pattern(" S ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }
    protected static void hatchetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("#S ")
                .pattern(" S ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);

    }

    protected static void sickleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern(" # ")
                .pattern("  #")
                .pattern("S# ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void shearsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pItemResult)
                .define('#', pMaterial)
                .pattern(" #")
                .pattern("# ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
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
                .unlockedBy(getHasName(pAxe), has(pAxe))
                .unlockedBy(getHasName(pShovel), has(pShovel))
                .unlockedBy(getHasName(pPickaxe), has(pPickaxe))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void bowRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.STRING)
                .pattern(" #@")
                .pattern("# @")
                .pattern(" #@")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void shieldRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.SHIELD)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/tool/" + pItemResult);
    }

    protected static void helmetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/armor/" + pItemResult);
    }

    protected static void chestplateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/armor/" + pItemResult);
    }

    protected static void legginsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/armor/" + pItemResult);
    }

    protected static void bootsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("# #")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/armor/" + pItemResult);
    }

    protected static void horseArmorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, TagKey<Item> pMaterial, ItemLike pName) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, pItemResult)
                .define('#', pMaterial)
                .define('@', Items.LEATHER_HORSE_ARMOR)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .unlockedBy(getHasName(pName), has(pName))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/horse_armor/" + pItemResult);
    }

    protected static void saddleRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, Items.SADDLE)
                .define('#', Items.LEATHER)
                .define('@', Items.IRON_INGOT)
                .pattern(" # ")
                .pattern("#@#")
                .pattern("@ @")
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/misc/" + Items.SADDLE);
    }

    protected static void nuggetRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/nugget/" + pItemResult);
    }

    protected static void ingotRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pItemResult, 9)
                .requires(pMaterial).group("ingot")
                .unlockedBy(getHasName(pItemResult), has(pItemResult))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/ingot/" + getItemName(pMaterial) + "_into_" + pItemResult);
    }

    protected static void luminousDustRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pDust, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pDust, 9)
                .define('#', pMaterial)
                .define('G', Items.GLOWSTONE_DUST)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/dust/" + pDust);
    }

    protected static void lampRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pLamp, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pLamp)
                .define('#', pMaterial)
                .define('G', Items.REDSTONE_TORCH)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/lamp/" + getItemName(pLamp));
    }

    protected static void stairsRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pItemResult, 4)
                .define('#', pMaterial)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/stairs/" + getItemName(pItemResult));
    }


    protected static void fenceRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("#S#")
                .pattern("#S#")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/fence/" + getItemName(pItemResult));
    }

    protected static void fenceGateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("S#S")
                .pattern("S#S")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/fence_gate/" + getItemName(pItemResult));
    }

    protected static void signRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 3)
                .define('#', pMaterial)
                .define('S', Items.STICK)
                .pattern("###")
                .pattern("###")
                .pattern(" S ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/sign/" + getItemName(pItemResult));
    }

    protected static void hangingSignRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, pItemResult, 6)
                .define('#', pMaterial)
                .define('S', Items.CHAIN)
                .pattern("S S")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/hanging_sign/" + getItemName(pItemResult));
    }

    protected static void doorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult, 3)
                .define('#', pMaterial)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/door/" + getItemName(pItemResult));
    }

    protected static void trapdoorRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult, 2)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/trapdoor/" + getItemName(pItemResult));
    }

    protected static void planksFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pPlanks, Ingredient pLog) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlanks, 4)
                .requires(pLog).group("planks")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/planks/" + getItemName(pPlanks));
    }

    protected static void woodFromLogs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pWood, ItemLike pLog) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pWood, 3)
                .requires(pLog, 4).group("planks")
                .unlockedBy(getHasName(pLog), has(pLog))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/wood/" + getItemName(pWood));
    }


    protected static void resistantRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pWood) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pItemResult)
                .requires(pWood).requires(Items.HONEYCOMB)
                .group("wood")
                .unlockedBy(getHasName(pWood), has(pWood))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/resistant/" + getItemName(pItemResult));
    }

    protected static void buttonRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pPlanks) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, pItemResult)
                .requires(pPlanks).group("planks")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/button/" + getItemName(pItemResult));
    }


    protected static void pressurePlateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pPlanks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.REDSTONE, pItemResult)
                .define('#', pPlanks)
                .pattern("##")
                .unlockedBy(getHasName(pPlanks), has(pPlanks))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":blocks/pressure_plate/" + getItemName(pItemResult));
    }

    protected static void seedRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pItemFrom) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, pItemResult)
                .requires(pItemFrom).group("seeds")
                .unlockedBy(getHasName(pItemFrom), has(pItemFrom))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":items/seeds/" + pItemResult + "_from_" + pItemFrom);
    }

    protected static void flourRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, pItemResult)
                .define('#', pMaterial)
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":items/flour/" + pItemResult);
    }

    protected static void breadLikeRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID + ":items/bread/" + pItemResult);
    }

    protected static void boatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TRANSPORTATION, pItemResult)
                .define('#', pMaterial)
                .pattern("# #")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/boat/" + pItemResult);
    }

    protected static void chestBoatRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pBoat) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.TRANSPORTATION, pItemResult)
                .requires(pBoat).requires(Blocks.CHEST).group("chest_boat")
                .unlockedBy(getHasName(pBoat), has(pBoat))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/chest_boat/" + pItemResult);
    }

    protected static void woodenGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', Items.STICK)
                .pattern(" # ")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/gears/" + pItemResult);
    }

    protected static void stoneGearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', ItemTags.STONE_TOOL_MATERIALS)
                .define('G', REOItems.WOOD_GEAR.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(REOItems.WOOD_GEAR.get()), has(REOItems.WOOD_GEAR.get()))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/gears/" + pItemResult);
    }

    protected static void tier1GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOItems.STONE_GEAR.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/gears/" + pItemResult);
    }

    protected static void tier2GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOItems.IRON_GEAR.get())
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/gears/" + pItemResult);
    }

    protected static void tier3GearRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .define('G', REOTags.Items.GEARS_TIER_GEM)
                .pattern(" # ")
                .pattern("#G#")
                .pattern(" # ")
                .unlockedBy(getHasName(pMaterial), has(pMaterial))
                .save(pFinishedRecipeConsumer, RealEarthOres.MOD_ID +  ":items/gears/" + pItemResult);
    }

    protected static void plateRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pItemResult))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID +  ":items/plate/" + pItemResult);
    }

    protected static void storageBlockRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pMaterial), has(pItemResult))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID +  ":blocks/storage_block/" + getItemName(pItemResult));
    }

    protected static void geodeBlockRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pItemResult, ItemLike pMaterial) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, pItemResult)
                .define('#', pMaterial)
                .pattern("##")
                .pattern("##")
                .unlockedBy(getHasName(pMaterial), has(pItemResult))
                .save(pFinishedRecipeConsumer,  RealEarthOres.MOD_ID +  ":blocks/storage_block/" + getItemName(pItemResult));
    }

}
