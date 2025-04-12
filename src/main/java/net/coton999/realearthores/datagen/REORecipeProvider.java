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
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ALUMINUM_ORE.get(), REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), REOBlocks.ALUMINUM_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_ALUMINIUM_ORE.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.COPPER_GRAVEL_ORE.get(), REOBlocks.NETHER_COPPER_ORE.get(),
                        REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES))
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_COPPER))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.COPPER_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.DIAMOND_GRAVEL_ORE.get(), REOBlocks.NETHER_DIAMOND_ORE.get(),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.EMERALD_GRAVEL_ORE.get(), REOBlocks.NETHER_EMERALD_ORE.get(),
                        REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 200)
                .unlockedBy("has_emerald_ores", has(ItemTags.EMERALD_ORES))
                .unlockedBy(getHasName(REOItems.EMERALD_DUST.get()), has(REOTags.Items.DUSTS_EMERALD))
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.EMERALD);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ENDERITE_ORE.get(), REOItems.RAW_ENDERITE.get(),
                        REOItems.ENDERITE_DUST.get(), REOItems.ENDERITE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ENDERITE_INGOT.get(), 1F, 200)
                .unlockedBy("has_enderite_ores", has(REOTags.Items.ORES_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DUST.get()), has(REOTags.Items.DUSTS_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.ENDERITE_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.GOLD_GRAVEL_ORE.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 200)
                .unlockedBy("has_gold_ores", has(ItemTags.GOLD_ORES))
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOTags.Items.DUSTS_GOLD))
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/furnace/" + Items.GOLD_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.IRON_GRAVEL_ORE.get(), REOBlocks.NETHER_IRON_ORE.get(),
                        REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200)
                .unlockedBy("has_iron_ores", has(ItemTags.IRON_ORES))
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOTags.Items.DUSTS_IRON))
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + Items.IRON_INGOT);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.LEAD_ORE.get(), REOBlocks.DEEPSLATE_LEAD_ORE.get(), REOBlocks.LEAD_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_LEAD_ORE.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.NICKEL_ORE.get(), REOBlocks.DEEPSLATE_NICKEL_ORE.get(), REOBlocks.NICKEL_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_NICKEL_ORE.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.PERIDOT_CLUSTER.get(), REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PERIDOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.PERIDOT_CLUSTER.get()), has(REOBlocks.PERIDOT_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.PERIDOT_DUST.get()), has(REOTags.Items.DUSTS_PERIDOT))
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/furnace/" + REOItems.PERIDOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.PLATINUM_ORE.get(), REOBlocks.DEEPSLATE_PLATINUM_ORE.get(), REOBlocks.PLATINUM_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_PLATINUM_ORE.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PLATINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.ORES_PLATINUM))
                .unlockedBy(getHasName(REOItems.RAW_PLATINUM.get()), has(REOTags.Items.RAW_MATERIALS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DUST.get()), has(REOTags.Items.DUSTS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.PLATINUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.RUBY_CLUSTER.get(), REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.RUBY.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.RUBY_CLUSTER.get()), has(REOBlocks.RUBY_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.RUBY_DUST.get()), has(REOTags.Items.DUSTS_RUBY))
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.RUBY.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.SAPPHIRE_CLUSTER.get(), REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SAPPHIRE.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.SAPPHIRE_CLUSTER.get()), has(REOBlocks.SAPPHIRE_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DUST.get()), has(REOTags.Items.DUSTS_SAPPHIRE))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.SAPPHIRE.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.SILVER_ORE.get(), REOBlocks.DEEPSLATE_SILVER_ORE.get(), REOBlocks.SILVER_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_SILVER_ORE.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.TIN_ORE.get(), REOBlocks.TIN_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_TIN_ORE.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.TIN_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_tin_ores", has(REOTags.Items.ORES_TIN))
                .unlockedBy(getHasName(REOItems.RAW_TIN.get()), has(REOTags.Items.RAW_MATERIALS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DUST.get()), has(REOTags.Items.DUSTS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.TIN_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.URANIUM_ORE.get(), REOBlocks.DEEPSLATE_URANIUM_ORE.get(), REOBlocks.URANIUM_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_URANIUM_ORE.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.URANIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.ORES_URANIUM))
                .unlockedBy(getHasName(REOItems.RAW_URANIUM.get()), has(REOTags.Items.RAW_MATERIALS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DUST.get()), has(REOTags.Items.DUSTS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/furnace/" + REOItems.URANIUM_INGOT.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(REOBlocks.ZINC_ORE.get(), REOBlocks.DEEPSLATE_ZINC_ORE.get(), REOBlocks.ZINC_GRAVEL_ORE.get(),
                        REOBlocks.NETHER_ZINC_ORE.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()),
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
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ALUMINUM_ORE.get(), REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), REOBlocks.ALUMINUM_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_ALUMINIUM_ORE.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.COPPER_GRAVEL_ORE.get(), REOBlocks.NETHER_COPPER_ORE.get(),
                                REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()),
                        RecipeCategory.MISC, Items.COPPER_INGOT, 0.7F, 200)
                .unlockedBy("has_copper_ores", has(ItemTags.COPPER_ORES))
                .unlockedBy(getHasName(REOItems.BRONZE_DUST.get()), has(REOTags.Items.DUSTS_COPPER))
                .unlockedBy(getHasName(REOItems.BRONZE_DIRTY.get()), has(REOTags.Items.DIRTY_COPPER))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.COPPER_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.DIAMOND_GRAVEL_ORE.get(), REOBlocks.NETHER_DIAMOND_ORE.get(),
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

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.EMERALD_GRAVEL_ORE.get(), REOBlocks.NETHER_EMERALD_ORE.get(),
                                REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()),
                        RecipeCategory.MISC, Items.EMERALD, 1F, 200)
                .unlockedBy("has_emerald_ores", has(ItemTags.EMERALD_ORES))
                .unlockedBy(getHasName(REOItems.EMERALD_DUST.get()), has(REOTags.Items.DUSTS_EMERALD))
                .unlockedBy(getHasName(REOItems.EMERALD_DIRTY.get()), has(REOTags.Items.DIRTY_EMERALD))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.EMERALD);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ENDERITE_ORE.get(), REOItems.RAW_ENDERITE.get(),
                                REOItems.ENDERITE_DUST.get(), REOItems.ENDERITE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.ENDERITE_INGOT.get(), 1F, 200)
                .unlockedBy("has_enderite_ores", has(REOTags.Items.ORES_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DUST.get()), has(REOTags.Items.DUSTS_ENDERITE))
                .unlockedBy(getHasName(REOItems.ENDERITE_DIRTY.get()), has(REOTags.Items.DIRTY_ENDERITE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.ENDERITE_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.GOLD_GRAVEL_ORE.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()),
                        RecipeCategory.MISC, Items.GOLD_INGOT, 0.7F, 200)
                .unlockedBy("has_gold_ores", has(ItemTags.GOLD_ORES))
                .unlockedBy(getHasName(REOItems.GOLD_DUST.get()), has(REOTags.Items.DUSTS_GOLD))
                .unlockedBy(getHasName(REOItems.GOLD_DIRTY.get()), has(REOTags.Items.DIRTY_GOLD))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/blast_furnace/" + Items.GOLD_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.IRON_GRAVEL_ORE.get(), REOBlocks.NETHER_IRON_ORE.get(),
                                REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()),
                        RecipeCategory.MISC, Items.IRON_INGOT, 0.7F, 200)
                .unlockedBy("has_iron_ores", has(ItemTags.IRON_ORES))
                .unlockedBy(getHasName(REOItems.IRON_DUST.get()), has(REOTags.Items.DUSTS_IRON))
                .unlockedBy(getHasName(REOItems.IRON_DIRTY.get()), has(REOTags.Items.DIRTY_IRON))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + Items.IRON_INGOT);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.LEAD_ORE.get(), REOBlocks.DEEPSLATE_LEAD_ORE.get(), REOBlocks.LEAD_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_LEAD_ORE.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.NICKEL_ORE.get(), REOBlocks.DEEPSLATE_NICKEL_ORE.get(), REOBlocks.NICKEL_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_NICKEL_ORE.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.PERIDOT_CLUSTER.get(), REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PERIDOT.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.PERIDOT_CLUSTER.get()), has(REOBlocks.PERIDOT_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.PERIDOT_DUST.get()), has(REOTags.Items.DUSTS_PERIDOT))
                .unlockedBy(getHasName(REOItems.PERIDOT_DIRTY.get()), has(REOTags.Items.DIRTY_PERIDOT))
                .save(pWriter,RealEarthOres.MOD_ID +  ":blocks/blast_furnace/" + REOItems.PERIDOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.PLATINUM_ORE.get(), REOBlocks.DEEPSLATE_PLATINUM_ORE.get(), REOBlocks.PLATINUM_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_PLATINUM_ORE.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.PLATINUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_platinum_ores", has(REOTags.Items.ORES_PLATINUM))
                .unlockedBy(getHasName(REOItems.RAW_PLATINUM.get()), has(REOTags.Items.RAW_MATERIALS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DUST.get()), has(REOTags.Items.DUSTS_PLATINUM))
                .unlockedBy(getHasName(REOItems.PLATINUM_DIRTY.get()), has(REOTags.Items.DIRTY_PLATINUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.PLATINUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.RUBY_CLUSTER.get(), REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.RUBY.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.RUBY_CLUSTER.get()), has(REOBlocks.RUBY_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.RUBY_DUST.get()), has(REOTags.Items.DUSTS_RUBY))
                .unlockedBy(getHasName(REOItems.RUBY_DIRTY.get()), has(REOTags.Items.DIRTY_RUBY))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.RUBY.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.SAPPHIRE_CLUSTER.get(), REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.SAPPHIRE.get(), 0.7F, 200)
                .unlockedBy(getHasName(REOBlocks.SAPPHIRE_CLUSTER.get()), has(REOBlocks.SAPPHIRE_CLUSTER.get()))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DUST.get()), has(REOTags.Items.DUSTS_SAPPHIRE))
                .unlockedBy(getHasName(REOItems.SAPPHIRE_DIRTY.get()), has(REOTags.Items.DIRTY_SAPPHIRE))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.SAPPHIRE.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.SILVER_ORE.get(), REOBlocks.DEEPSLATE_SILVER_ORE.get(), REOBlocks.SILVER_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_SILVER_ORE.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()),
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

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.TIN_ORE.get(), REOBlocks.TIN_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_TIN_ORE.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.TIN_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_tin_ores", has(REOTags.Items.ORES_TIN))
                .unlockedBy(getHasName(REOItems.RAW_TIN.get()), has(REOTags.Items.RAW_MATERIALS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DUST.get()), has(REOTags.Items.DUSTS_TIN))
                .unlockedBy(getHasName(REOItems.TIN_DIRTY.get()), has(REOTags.Items.DIRTY_TIN))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.TIN_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.URANIUM_ORE.get(), REOBlocks.DEEPSLATE_URANIUM_ORE.get(), REOBlocks.URANIUM_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_URANIUM_ORE.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()),
                        RecipeCategory.MISC, REOItems.URANIUM_INGOT.get(), 0.7F, 200)
                .unlockedBy("has_uranium_ores", has(REOTags.Items.ORES_URANIUM))
                .unlockedBy(getHasName(REOItems.RAW_URANIUM.get()), has(REOTags.Items.RAW_MATERIALS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DUST.get()), has(REOTags.Items.DUSTS_URANIUM))
                .unlockedBy(getHasName(REOItems.URANIUM_DIRTY.get()), has(REOTags.Items.DIRTY_URANIUM))
                .save(pWriter, RealEarthOres.MOD_ID + ":blocks/blast_furnace/" + REOItems.URANIUM_INGOT.get());

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(REOBlocks.ZINC_ORE.get(), REOBlocks.DEEPSLATE_ZINC_ORE.get(), REOBlocks.ZINC_GRAVEL_ORE.get(),
                                REOBlocks.NETHER_ZINC_ORE.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()),
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
                REOBlocks.REDSTONE_GRAVEL_ORE.get(), REOBlocks.NETHER_REDSTONE_ORE.get()), 1)
                .unlockedBy("has_redstone_ore", has(ItemTags.REDSTONE_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COAL, Ingredient.of(Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE,
                REOBlocks.COAL_GRAVEL_ORE.get(), REOBlocks.NETHER_COAL_ORE.get(), REOItems.COAL_DUST.get()), 1)
                .unlockedBy("has_coal_ore", has(ItemTags.COAL_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.EMERALD, Ingredient.of(Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
                REOBlocks.EMERALD_GRAVEL_ORE.get(), REOBlocks.NETHER_EMERALD_ORE.get(), REOItems.EMERALD_DUST.get(), REOItems.EMERALD_DIRTY.get()), 1)
                .unlockedBy("has_emerald_ore", has(ItemTags.EMERALD_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.LAPIS_LAZULI, Ingredient.of(Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE,
                REOBlocks.LAPIS_GRAVEL_ORE.get(), REOBlocks.NETHER_LAPIS_ORE.get()), 1)
                .unlockedBy("has_lapis_ore", has(ItemTags.LAPIS_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.DIAMOND, Ingredient.of(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE,
                REOBlocks.DIAMOND_GRAVEL_ORE.get(), REOBlocks.NETHER_DIAMOND_ORE.get(), REOItems.DIAMOND_DUST.get(), REOItems.DIAMOND_DIRTY.get()), 1)
                .unlockedBy("has_diamond_ore", has(ItemTags.DIAMOND_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.QUARTZ, Ingredient.of(Blocks.NETHER_QUARTZ_ORE), 1)
                .unlockedBy("has_nether_quartz_ore", has(Blocks.NETHER_QUARTZ_ORE)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.IRON_INGOT, Ingredient.of(Items.RAW_IRON, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE,
                REOBlocks.IRON_GRAVEL_ORE.get(), REOBlocks.NETHER_IRON_ORE.get(), REOItems.IRON_DUST.get(), REOItems.IRON_DIRTY.get()), 1)
                .unlockedBy("has_iron_ore", has(ItemTags.IRON_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.COPPER_INGOT, Ingredient.of(Items.RAW_COPPER, Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE,
                REOBlocks.COPPER_GRAVEL_ORE.get(), REOBlocks.NETHER_COPPER_ORE.get(), REOItems.COPPER_DUST.get(), REOItems.COPPER_DIRTY.get()), 1)
                .unlockedBy("has_copper_ore", has(ItemTags.COPPER_ORES)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(Items.GOLD_INGOT, Ingredient.of(Items.RAW_GOLD, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE,
                Blocks.NETHER_GOLD_ORE, REOBlocks.GOLD_GRAVEL_ORE.get(), REOItems.GOLD_DUST.get(), REOItems.GOLD_DIRTY.get()), 1)
                .unlockedBy("has_gold_ore", has(ItemTags.GOLD_ORES)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.ALUMINUM_INGOT.get(), Ingredient.of(REOBlocks.ALUMINUM_ORE.get(), REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                REOBlocks.ALUMINUM_GRAVEL_ORE.get(), REOBlocks.NETHER_ALUMINIUM_ORE.get(), REOItems.RAW_ALUMINIUM.get(), REOItems.ALUMINUM_DUST.get(), REOItems.ALUMINUM_DIRTY.get()), 1)
                .unlockedBy("has_aluminium_ore", has(REOTags.Items.ORES_ALUMINUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.LEAD_INGOT.get(), Ingredient.of(REOBlocks.LEAD_ORE.get(), REOBlocks.DEEPSLATE_LEAD_ORE.get(),
                REOBlocks.LEAD_GRAVEL_ORE.get(), REOBlocks.NETHER_LEAD_ORE.get(), REOItems.RAW_LEAD.get(), REOItems.LEAD_DUST.get(), REOItems.LEAD_DIRTY.get()), 1)
                .unlockedBy("has_lead_ore", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.NICKEL_INGOT.get(), Ingredient.of(REOBlocks.NICKEL_ORE.get(), REOBlocks.DEEPSLATE_NICKEL_ORE.get(),
                REOBlocks.NICKEL_GRAVEL_ORE.get(), REOBlocks.NETHER_NICKEL_ORE.get(), REOItems.RAW_NICKEL.get(), REOItems.NICKEL_DUST.get(), REOItems.NICKEL_DIRTY.get()), 1)
                .unlockedBy("has_nickel_ore", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.PLATINUM_INGOT.get(), Ingredient.of(REOBlocks.PLATINUM_ORE.get(), REOBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                REOBlocks.PLATINUM_GRAVEL_ORE.get(), REOBlocks.NETHER_PLATINUM_ORE.get(), REOItems.RAW_PLATINUM.get(), REOItems.PLATINUM_DUST.get(), REOItems.PLATINUM_DIRTY.get()), 1)
                .unlockedBy("has_platinum_ore", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.SILVER_INGOT.get(), Ingredient.of(REOBlocks.SILVER_ORE.get(), REOBlocks.DEEPSLATE_SILVER_ORE.get(),
                REOBlocks.SILVER_GRAVEL_ORE.get(), REOBlocks.NETHER_SILVER_ORE.get(), REOItems.RAW_SILVER.get(), REOItems.SILVER_DUST.get(), REOItems.SILVER_DIRTY.get()), 1)
                .unlockedBy("has_silver_ore", has(REOTags.Items.ORES_SILVER)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.TIN_INGOT.get(), Ingredient.of(REOBlocks.TIN_ORE.get(),
                REOBlocks.TIN_GRAVEL_ORE.get(), REOBlocks.NETHER_TIN_ORE.get(), REOItems.RAW_TIN.get(), REOItems.TIN_DUST.get(), REOItems.TIN_DIRTY.get()), 1)
                .unlockedBy("has_tin_ore", has(REOTags.Items.ORES_TIN)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.URANIUM_INGOT.get(), Ingredient.of(REOBlocks.URANIUM_ORE.get(), REOBlocks.DEEPSLATE_URANIUM_ORE.get(),
                REOBlocks.URANIUM_GRAVEL_ORE.get(), REOBlocks.NETHER_URANIUM_ORE.get(), REOItems.RAW_URANIUM.get(), REOItems.URANIUM_DUST.get(), REOItems.URANIUM_DIRTY.get()), 1)
                .unlockedBy("has_uranium_ore", has(REOTags.Items.ORES_URANIUM)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.ZINC_INGOT.get(), Ingredient.of(REOBlocks.ZINC_ORE.get(), REOBlocks.DEEPSLATE_ZINC_ORE.get(),
                REOBlocks.ZINC_GRAVEL_ORE.get(), REOBlocks.NETHER_ZINC_ORE.get(), REOItems.RAW_ZINC.get(), REOItems.ZINC_DUST.get(), REOItems.ZINC_DIRTY.get()), 1)
                .unlockedBy("has_zinc_ore", has(REOTags.Items.ORES_ZINC)).save(pWriter);


        new ElectricFurnaceRecipeBuilder(REOItems.AMETHYST.get(), Ingredient.of(Blocks.AMETHYST_CLUSTER, Items.AMETHYST_SHARD,
                REOItems.AMETHYST_DUST.get(), REOItems.AMETHYST_DIRTY.get()), 1)
                .unlockedBy(getHasName(Blocks.AMETHYST_CLUSTER), has(Blocks.AMETHYST_CLUSTER)).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.PERIDOT.get(), Ingredient.of(REOBlocks.PERIDOT_CLUSTER.get(), REOItems.PERIDOT_SHARD.get(),
                REOItems.PERIDOT_DUST.get(), REOItems.PERIDOT_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.PERIDOT_CLUSTER.get()), has(REOBlocks.PERIDOT_CLUSTER.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.RUBY.get(), Ingredient.of(REOBlocks.RUBY_CLUSTER.get(), REOItems.RUBY_SHARD.get(),
                REOItems.RUBY_DUST.get(), REOItems.RUBY_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.RUBY_CLUSTER.get()), has(REOBlocks.RUBY_CLUSTER.get())).save(pWriter);
        new ElectricFurnaceRecipeBuilder(REOItems.SAPPHIRE.get(), Ingredient.of(REOBlocks.SAPPHIRE_CLUSTER.get(), REOItems.SAPPHIRE_SHARD.get(),
                REOItems.SAPPHIRE_DUST.get(), REOItems.SAPPHIRE_DIRTY.get()), 1)
                .unlockedBy(getHasName(REOBlocks.SAPPHIRE_CLUSTER.get()), has(REOBlocks.SAPPHIRE_CLUSTER.get())).save(pWriter);

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
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.ENDERITE_DIRTY.get(), Ingredient.of(REOBlocks.ENDERITE_ORE.get()),
                0.5F, 200).unlockedBy("has_ore_enderite", has(REOBlocks.ENDERITE_ORE.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.GOLD_DIRTY.get(), Ingredient.of(ItemTags.GOLD_ORES),
                0.5F, 200).unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.IRON_DIRTY.get(), Ingredient.of(ItemTags.IRON_ORES),
                0.5F, 200).unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.LEAD_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_LEAD),
                0.5F, 200).unlockedBy("has_ore_lead", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.NICKEL_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_NICKEL),
                0.5F, 200).unlockedBy("has_ore_nickel", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.PERIDOT_DIRTY.get(),Ingredient.of(REOBlocks.PERIDOT_CLUSTER.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.PERIDOT_CLUSTER.get()), has(REOBlocks.PERIDOT_CLUSTER.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.PLATINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_PLATINUM),
                0.5F, 200).unlockedBy("has_ore_platinum", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.RUBY_DIRTY.get(), Ingredient.of(REOBlocks.RUBY_CLUSTER.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.RUBY_CLUSTER.get()), has(REOBlocks.RUBY_CLUSTER.get())).save(pWriter);
        BasicCrusherRecipeBuilder.generic(RecipeCategory.MISC, REOItems.SAPPHIRE_DIRTY.get(), Ingredient.of(REOBlocks.SAPPHIRE_CLUSTER.get()),
                0.5F, 200).unlockedBy(getHasName(REOBlocks.SAPPHIRE_CLUSTER.get()), has(REOBlocks.SAPPHIRE_CLUSTER.get())).save(pWriter);
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
        CrusherRecipeBuilder.generic(REOItems.ENDERITE_DIRTY.get(), Ingredient.of(REOBlocks.ENDERITE_ORE.get()), 2)
                .unlockedBy("has_ore_enderite", has(REOBlocks.ENDERITE_ORE.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.GOLD_DIRTY.get(), Ingredient.of(ItemTags.GOLD_ORES), 2)
                .unlockedBy("has_ore_gold", has(ItemTags.GOLD_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.IRON_DIRTY.get(), Ingredient.of(ItemTags.IRON_ORES), 2)
                .unlockedBy("has_ore_iron", has(ItemTags.IRON_ORES)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.LEAD_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_LEAD), 2)
                .unlockedBy("has_ore_lead", has(REOTags.Items.ORES_LEAD)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.NICKEL_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_NICKEL), 2)
                .unlockedBy("has_ore_nickel", has(REOTags.Items.ORES_NICKEL)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.PERIDOT_DIRTY.get(),Ingredient.of(REOBlocks.PERIDOT_CLUSTER.get()), 2)
                .unlockedBy(getHasName(REOBlocks.PERIDOT_CLUSTER.get()), has(REOBlocks.PERIDOT_CLUSTER.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.PLATINUM_DIRTY.get(), Ingredient.of(REOTags.Items.ORES_PLATINUM), 2)
                .unlockedBy("has_ore_platinum", has(REOTags.Items.ORES_PLATINUM)).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.RUBY_DIRTY.get(), Ingredient.of(REOBlocks.RUBY_CLUSTER.get()), 2)
                .unlockedBy(getHasName(REOBlocks.RUBY_CLUSTER.get()), has(REOBlocks.RUBY_CLUSTER.get())).save(pWriter);
        CrusherRecipeBuilder.generic(REOItems.SAPPHIRE_DIRTY.get(), Ingredient.of(REOBlocks.SAPPHIRE_CLUSTER.get()), 2)
                .unlockedBy(getHasName(REOBlocks.SAPPHIRE_CLUSTER.get()), has(REOBlocks.SAPPHIRE_CLUSTER.get())).save(pWriter);
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
        new SawmillRecipeBuilder(REOBlocks.BALSA_PLANKS.get(), Ingredient.of(REOTags.Items.BALSA_LOGS), 6)
                .unlockedBy("has_balsa_logs", has(REOTags.Items.BALSA_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.BALSA_SLAB.get(), Ingredient.of(REOBlocks.BALSA_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.BALSA_PLANKS.get()), has(REOBlocks.BALSA_PLANKS.get())).save(pWriter);
        // Baobab
        new SawmillRecipeBuilder(REOBlocks.BAOBAB_PLANKS.get(), Ingredient.of(REOTags.Items.BAOBAB_LOGS), 6)
                .unlockedBy("has_baobab_logs", has(REOTags.Items.BAOBAB_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.BAOBAB_SLAB.get(), Ingredient.of(REOBlocks.BAOBAB_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.BAOBAB_PLANKS.get()), has(REOBlocks.BAOBAB_PLANKS.get())).save(pWriter);
        // Hill Cherry
        new SawmillRecipeBuilder(REOBlocks.HILL_CHERRY_PLANKS.get(), Ingredient.of(REOTags.Items.HILL_CHERRY_LOGS), 6)
                .unlockedBy("has_hill_cherry_logs", has(REOTags.Items.HILL_CHERRY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.HILL_CHERRY_SLAB.get(), Ingredient.of(REOBlocks.HILL_CHERRY_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.HILL_CHERRY_PLANKS.get()), has(REOBlocks.HILL_CHERRY_PLANKS.get())).save(pWriter);
        // Chestnut
        new SawmillRecipeBuilder(REOBlocks.CHESTNUT_PLANKS.get(), Ingredient.of(REOTags.Items.CHESTNUT_LOGS), 6)
                .unlockedBy("has_chestnut_logs", has(REOTags.Items.CHESTNUT_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.CHESTNUT_SLAB.get(), Ingredient.of(REOBlocks.CHESTNUT_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.CHESTNUT_PLANKS.get()), has(REOBlocks.CHESTNUT_PLANKS.get())).save(pWriter);
        // Citrus
        new SawmillRecipeBuilder(REOBlocks.CITRUS_PLANKS.get(), Ingredient.of(REOTags.Items.CITRUS_LOGS), 6)
                .unlockedBy("has_citrus_logs", has(REOTags.Items.CITRUS_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.CITRUS_SLAB.get(), Ingredient.of(REOBlocks.CITRUS_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.CITRUS_PLANKS.get()), has(REOBlocks.CITRUS_PLANKS.get())).save(pWriter);
        // Ebony
        new SawmillRecipeBuilder(REOBlocks.EBONY_PLANKS.get(), Ingredient.of(REOTags.Items.EBONY_LOGS), 6)
                .unlockedBy("has_ebony_logs", has(REOTags.Items.EBONY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.EBONY_SLAB.get(), Ingredient.of(REOBlocks.EBONY_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.EBONY_PLANKS.get()), has(REOBlocks.EBONY_PLANKS.get())).save(pWriter);
        // Larch
        new SawmillRecipeBuilder(REOBlocks.LARCH_PLANKS.get(), Ingredient.of(REOTags.Items.LARCH_LOGS), 6)
                .unlockedBy("has_larch_logs", has(REOTags.Items.LARCH_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.LARCH_SLAB.get(), Ingredient.of(REOBlocks.LARCH_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.LARCH_PLANKS.get()), has(REOBlocks.LARCH_PLANKS.get())).save(pWriter);
        // Mahogany
        new SawmillRecipeBuilder(REOBlocks.MAHOGANY_PLANKS.get(), Ingredient.of(REOTags.Items.MAHOGANY_LOGS), 6)
                .unlockedBy("has_mahogany_logs", has(REOTags.Items.MAHOGANY_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.MAHOGANY_SLAB.get(), Ingredient.of(REOBlocks.MAHOGANY_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.MAHOGANY_PLANKS.get()), has(REOBlocks.MAHOGANY_PLANKS.get())).save(pWriter);
        // Maple
        new SawmillRecipeBuilder(REOBlocks.MAPLE_PLANKS.get(), Ingredient.of(REOTags.Items.MAPLE_LOGS), 6)
                .unlockedBy("has_maple_logs", has(REOTags.Items.MAPLE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.MAPLE_SLAB.get(), Ingredient.of(REOBlocks.MAPLE_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.MAPLE_PLANKS.get()), has(REOBlocks.MAPLE_PLANKS.get())).save(pWriter);
        // Palm
        new SawmillRecipeBuilder(REOBlocks.PALM_PLANKS.get(), Ingredient.of(REOTags.Items.PALM_LOGS), 6)
                .unlockedBy("has_palm_logs", has(REOTags.Items.PALM_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.PALM_SLAB.get(), Ingredient.of(REOBlocks.PALM_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PALM_PLANKS.get()), has(REOBlocks.PALM_PLANKS.get())).save(pWriter);
        // Papaya
        new SawmillRecipeBuilder(REOBlocks.PAPAYA_PLANKS.get(), Ingredient.of(REOTags.Items.PAPAYA_LOGS), 6)
                .unlockedBy("has_papaya_logs", has(REOTags.Items.PAPAYA_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.PAPAYA_SLAB.get(), Ingredient.of(REOBlocks.PAPAYA_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PAPAYA_PLANKS.get()), has(REOBlocks.PAPAYA_PLANKS.get())).save(pWriter);
        // Pine
        new SawmillRecipeBuilder(REOBlocks.PINE_PLANKS.get(), Ingredient.of(REOTags.Items.PINE_LOGS), 6)
                .unlockedBy("has_pine_logs", has(REOTags.Items.PINE_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.PINE_SLAB.get(), Ingredient.of(REOBlocks.PINE_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PINE_PLANKS.get()), has(REOBlocks.PINE_PLANKS.get())).save(pWriter);
        // Plum
        new SawmillRecipeBuilder(REOBlocks.PLUM_PLANKS.get(), Ingredient.of(REOTags.Items.PLUM_LOGS), 6)
                .unlockedBy("has_plum_logs", has(REOTags.Items.PLUM_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.PLUM_SLAB.get(), Ingredient.of(REOBlocks.PLUM_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.PLUM_PLANKS.get()), has(REOBlocks.PLUM_PLANKS.get())).save(pWriter);
        // Poplar
        new SawmillRecipeBuilder(REOBlocks.POPLAR_PLANKS.get(), Ingredient.of(REOTags.Items.POPLAR_LOGS), 6)
                .unlockedBy("has_poplar_logs", has(REOTags.Items.POPLAR_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.POPLAR_SLAB.get(), Ingredient.of(REOBlocks.POPLAR_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.POPLAR_PLANKS.get()), has(REOBlocks.POPLAR_PLANKS.get())).save(pWriter);
        // Redwood
        new SawmillRecipeBuilder(REOBlocks.REDWOOD_PLANKS.get(), Ingredient.of(REOTags.Items.REDWOOD_LOGS), 6)
                .unlockedBy("has_redwood_logs", has(REOTags.Items.REDWOOD_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.REDWOOD_SLAB.get(), Ingredient.of(REOBlocks.REDWOOD_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.REDWOOD_PLANKS.get()), has(REOBlocks.REDWOOD_PLANKS.get())).save(pWriter);
        // Rubber
        new SawmillRecipeBuilder(REOBlocks.RUBBER_PLANKS.get(), Ingredient.of(REOTags.Items.RUBBER_LOGS), 6)
                .unlockedBy("has_rubber_logs", has(REOTags.Items.RUBBER_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.RUBBER_SLAB.get(), Ingredient.of(REOBlocks.RUBBER_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.RUBBER_PLANKS.get()), has(REOBlocks.RUBBER_PLANKS.get())).save(pWriter);
        // Teak
        new SawmillRecipeBuilder(REOBlocks.TEAK_PLANKS.get(), Ingredient.of(REOTags.Items.TEAK_LOGS), 6)
                .unlockedBy("has_teak_logs", has(REOTags.Items.TEAK_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.TEAK_SLAB.get(), Ingredient.of(REOBlocks.TEAK_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.TEAK_PLANKS.get()), has(REOBlocks.TEAK_PLANKS.get())).save(pWriter);
        // Walnut
        new SawmillRecipeBuilder(REOBlocks.WALNUT_PLANKS.get(), Ingredient.of(REOTags.Items.WALNUT_LOGS), 6)
                .unlockedBy("has_walnut_logs", has(REOTags.Items.WALNUT_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.WALNUT_SLAB.get(), Ingredient.of(REOBlocks.WALNUT_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.WALNUT_PLANKS.get()), has(REOBlocks.WALNUT_PLANKS.get())).save(pWriter);
        // Willow
        new SawmillRecipeBuilder(REOBlocks.WILLOW_PLANKS.get(), Ingredient.of(REOTags.Items.WILLOW_LOGS), 6)
                .unlockedBy("has_willow_logs", has(REOTags.Items.WILLOW_LOGS)).save(pWriter);
        new SawmillRecipeBuilder(REOBlocks.WILLOW_SLAB.get(), Ingredient.of(REOBlocks.WILLOW_PLANKS.get()), 4)
                .unlockedBy(getHasName(REOBlocks.WILLOW_PLANKS.get()), has(REOBlocks.WILLOW_PLANKS.get())).save(pWriter);


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
        storageBlockRecipe(pWriter, REOBlocks.ALUMINUM_BLOCK.get(), REOItems.ALUMINUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BRASS_BLOCK.get(), REOItems.BRASS_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.BRONZE_BLOCK.get(), REOItems.BRONZE_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.ELECTRUM_BLOCK.get(), REOItems.ELECTRUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.ENDERITE_BLOCK.get(), REOItems.ENDERITE_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.LEAD_BLOCK.get(), REOItems.LEAD_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.NICKEL_BLOCK.get(), REOItems.NICKEL_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.PLATINUM_BLOCK.get(), REOItems.PLATINUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.SILVER_BLOCK.get(), REOItems.SILVER_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.STEEL_BLOCK.get(), REOItems.STEEL_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.TIN_BLOCK.get(), REOItems.TIN_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.URANIUM_BLOCK.get(), REOItems.URANIUM_INGOT.get());
        storageBlockRecipe(pWriter, REOBlocks.ZINC_BLOCK.get(), REOItems.ZINC_INGOT.get());

        geodeBlockRecipe(pWriter, REOBlocks.PERIDOT_BLOCK.get(), REOItems.PERIDOT_SHARD.get());
        geodeBlockRecipe(pWriter, REOBlocks.RUBY_BLOCK.get(), REOItems.RUBY_SHARD.get());
        geodeBlockRecipe(pWriter, REOBlocks.SAPPHIRE_BLOCK.get(), REOItems.SAPPHIRE_SHARD.get());

        // Raw Storage
        storageBlockRecipe(pWriter, REOBlocks.RAW_ALUMINIUM_BLOCK.get(), REOItems.RAW_ALUMINIUM.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_ENDERITE_BLOCK.get(), REOItems.RAW_ENDERITE.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_LEAD_BLOCK.get(), REOItems.RAW_LEAD.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_NICKEL_BLOCK.get(), REOItems.RAW_NICKEL.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_PLATINUM_BLOCK.get(), REOItems.RAW_PLATINUM.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_SILVER_BLOCK.get(), REOItems.RAW_SILVER.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_TIN_BLOCK.get(), REOItems.RAW_TIN.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_URANIUM_BLOCK.get(), REOItems.RAW_URANIUM.get());
        storageBlockRecipe(pWriter, REOBlocks.RAW_ZINC_BLOCK.get(), REOItems.RAW_ZINC.get());

        // Misc
        storageBlockRecipe(pWriter, REOBlocks.WAX_BLOCK.get(), Items.HONEYCOMB);


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
        lampRecipe(pWriter, REOBlocks.BLACK_LAMP.get(), REOItems.BLACK_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.BLUE_LAMP.get(), REOItems.BLUE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.BROWN_LAMP.get(), REOItems.BROWN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.CYAN_LAMP.get(), REOItems.CYAN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.GRAY_LAMP.get(), REOItems.GRAY_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.GREEN_LAMP.get(), REOItems.GREEN_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LIGHT_BLUE_LAMP.get(), REOItems.LIGHT_BLUE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LIGHT_GRAY_LAMP.get(), REOItems.LIGHT_GRAY_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.LIME_LAMP.get(), REOItems.LIME_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.MAGENTA_LAMP.get(), REOItems.MAGENTA_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.ORANGE_LAMP.get(), REOItems.ORANGE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.PINK_LAMP.get(), REOItems.PINK_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.PURPLE_LAMP.get(), REOItems.PURPLE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.RED_LAMP.get(), REOItems.RED_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.WHITE_LAMP.get(), REOItems.WHITE_LUMINOUS.get());
        lampRecipe(pWriter, REOBlocks.YELLOW_LAMP.get(), REOItems.YELLOW_LUMINOUS.get());

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
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_LOG.get(), Blocks.OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get(), Blocks.STRIPPED_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_WOOD.get(), Blocks.OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get(), Blocks.STRIPPED_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_PLANKS.get(), Blocks.OAK_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_STAIRS.get(), Blocks.OAK_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_SLAB.get(), Blocks.OAK_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_FENCE.get(), Blocks.OAK_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_OAK_FENCE_GATE.get(), Blocks.OAK_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_LOG.get(), Blocks.SPRUCE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get(), Blocks.STRIPPED_SPRUCE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_WOOD.get(), Blocks.SPRUCE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get(), Blocks.STRIPPED_SPRUCE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_PLANKS.get(), Blocks.SPRUCE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_STAIRS.get(), Blocks.SPRUCE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_SLAB.get(), Blocks.SPRUCE_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_FENCE.get(), Blocks.SPRUCE_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get(), Blocks.SPRUCE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_LOG.get(), Blocks.BIRCH_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get(), Blocks.STRIPPED_BIRCH_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_WOOD.get(), Blocks.BIRCH_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get(), Blocks.STRIPPED_BIRCH_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_PLANKS.get(), Blocks.BIRCH_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_STAIRS.get(), Blocks.BIRCH_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_SLAB.get(), Blocks.BIRCH_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_FENCE.get(), Blocks.BIRCH_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get(), Blocks.BIRCH_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_LOG.get(), Blocks.JUNGLE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get(), Blocks.STRIPPED_JUNGLE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_WOOD.get(), Blocks.JUNGLE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get(), Blocks.STRIPPED_JUNGLE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_PLANKS.get(), Blocks.JUNGLE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_STAIRS.get(), Blocks.JUNGLE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_SLAB.get(), Blocks.JUNGLE_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_FENCE.get(), Blocks.JUNGLE_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get(), Blocks.JUNGLE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_LOG.get(), Blocks.ACACIA_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get(), Blocks.STRIPPED_ACACIA_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_WOOD.get(), Blocks.ACACIA_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get(), Blocks.STRIPPED_ACACIA_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_PLANKS.get(), Blocks.ACACIA_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_STAIRS.get(), Blocks.ACACIA_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_SLAB.get(), Blocks.ACACIA_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_FENCE.get(), Blocks.ACACIA_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get(), Blocks.ACACIA_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_LOG.get(), Blocks.DARK_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get(), Blocks.STRIPPED_DARK_OAK_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_WOOD.get(), Blocks.DARK_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get(), Blocks.STRIPPED_DARK_OAK_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_PLANKS.get(), Blocks.DARK_OAK_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_STAIRS.get(), Blocks.DARK_OAK_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_SLAB.get(), Blocks.DARK_OAK_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_FENCE.get(), Blocks.DARK_OAK_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get(), Blocks.DARK_OAK_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_LOG.get(), Blocks.MANGROVE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get(), Blocks.STRIPPED_MANGROVE_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_WOOD.get(), Blocks.MANGROVE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get(), Blocks.STRIPPED_MANGROVE_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_PLANKS.get(), Blocks.MANGROVE_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_STAIRS.get(), Blocks.MANGROVE_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_SLAB.get(), Blocks.MANGROVE_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_FENCE.get(), Blocks.MANGROVE_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get(), Blocks.MANGROVE_FENCE_GATE);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_LOG.get(), Blocks.CHERRY_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get(), Blocks.STRIPPED_CHERRY_LOG);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_WOOD.get(), Blocks.CHERRY_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get(), Blocks.STRIPPED_CHERRY_WOOD);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_PLANKS.get(), Blocks.CHERRY_PLANKS);

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_STAIRS.get(), Blocks.CHERRY_STAIRS);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_SLAB.get(), Blocks.CHERRY_SLAB);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_FENCE.get(), Blocks.CHERRY_FENCE);
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHERRY_FENCE_GATE.get(), Blocks.CHERRY_FENCE_GATE);

        // Modded
        // Balsa
        planksFromLogs(pWriter, REOBlocks.BALSA_PLANKS.get(), Ingredient.of(REOTags.Items.BALSA_LOGS));
        woodFromLogs(pWriter, REOBlocks.BALSA_WOOD.get(), REOBlocks.BALSA_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_BALSA_WOOD.get(), REOBlocks.STRIPPED_BALSA_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_LOG.get(), REOBlocks.BALSA_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get(), REOBlocks.STRIPPED_BALSA_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_WOOD.get(), REOBlocks.BALSA_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get(), REOBlocks.STRIPPED_BALSA_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_PLANKS.get(), REOBlocks.BALSA_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_STAIRS.get(), REOBlocks.BALSA_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_SLAB.get(), REOBlocks.BALSA_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_FENCE.get(), REOBlocks.BALSA_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BALSA_FENCE_GATE.get(), REOBlocks.BALSA_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.BALSA_STAIRS.get(), REOBlocks.BALSA_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.BALSA_SLAB.get(), REOBlocks.BALSA_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.BALSA_FENCE.get(), REOBlocks.BALSA_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.BALSA_FENCE_GATE.get(), REOBlocks.BALSA_PLANKS.get());

        signRecipe(pWriter, REOBlocks.BALSA_SIGN.get(), REOBlocks.BALSA_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.BALSA_HANGING_SIGN.get(), REOBlocks.STRIPPED_BALSA_LOG.get());

        buttonRecipe(pWriter, REOBlocks.BALSA_BUTTON.get(), REOBlocks.BALSA_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.BALSA_PRESSURE_PLATE.get(), REOBlocks.BALSA_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.BALSA_DOOR.get(), REOBlocks.BALSA_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.BALSA_TRAPDOOR.get(), REOBlocks.BALSA_PLANKS.get());

        boatRecipe(pWriter, REOItems.BALSA_BOAT.get(), REOBlocks.BALSA_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.BALSA_CHEST_BOAT.get(), REOItems.BALSA_BOAT.get());

        // Baobab
        planksFromLogs(pWriter, REOBlocks.BAOBAB_PLANKS.get(), Ingredient.of(REOTags.Items.BAOBAB_LOGS));
        woodFromLogs(pWriter, REOBlocks.BAOBAB_WOOD.get(), REOBlocks.BAOBAB_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_BAOBAB_WOOD.get(), REOBlocks.STRIPPED_BAOBAB_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_LOG.get(), REOBlocks.BAOBAB_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get(), REOBlocks.STRIPPED_BAOBAB_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_WOOD.get(), REOBlocks.BAOBAB_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get(), REOBlocks.STRIPPED_BAOBAB_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_PLANKS.get(), REOBlocks.BAOBAB_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_STAIRS.get(), REOBlocks.BAOBAB_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_SLAB.get(), REOBlocks.BAOBAB_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_FENCE.get(), REOBlocks.BAOBAB_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get(), REOBlocks.BAOBAB_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.BAOBAB_STAIRS.get(), REOBlocks.BAOBAB_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.BAOBAB_SLAB.get(), REOBlocks.BAOBAB_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.BAOBAB_FENCE.get(), REOBlocks.BAOBAB_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.BAOBAB_FENCE_GATE.get(), REOBlocks.BAOBAB_PLANKS.get());

        signRecipe(pWriter, REOBlocks.BAOBAB_SIGN.get(), REOBlocks.BAOBAB_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.BAOBAB_HANGING_SIGN.get(), REOBlocks.STRIPPED_BAOBAB_LOG.get());

        buttonRecipe(pWriter, REOBlocks.BAOBAB_BUTTON.get(), REOBlocks.BAOBAB_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.BAOBAB_PRESSURE_PLATE.get(), REOBlocks.BAOBAB_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.BAOBAB_DOOR.get(), REOBlocks.BAOBAB_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.BAOBAB_TRAPDOOR.get(), REOBlocks.BAOBAB_PLANKS.get());

        boatRecipe(pWriter, REOItems.BAOBAB_BOAT.get(), REOBlocks.BAOBAB_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.BAOBAB_CHEST_BOAT.get(), REOItems.BAOBAB_BOAT.get());

        // Hill Cherry
        planksFromLogs(pWriter, REOBlocks.HILL_CHERRY_PLANKS.get(), Ingredient.of(REOTags.Items.HILL_CHERRY_LOGS));
        woodFromLogs(pWriter, REOBlocks.HILL_CHERRY_WOOD.get(), REOBlocks.HILL_CHERRY_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_LOG.get(), REOBlocks.HILL_CHERRY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get(), REOBlocks.HILL_CHERRY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get(), REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get(), REOBlocks.HILL_CHERRY_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get(), REOBlocks.HILL_CHERRY_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get(), REOBlocks.HILL_CHERRY_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get(), REOBlocks.HILL_CHERRY_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get(), REOBlocks.HILL_CHERRY_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.HILL_CHERRY_STAIRS.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.HILL_CHERRY_SLAB.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.HILL_CHERRY_FENCE.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.HILL_CHERRY_FENCE_GATE.get(), REOBlocks.HILL_CHERRY_PLANKS.get());

        signRecipe(pWriter, REOBlocks.HILL_CHERRY_SIGN.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.HILL_CHERRY_HANGING_SIGN.get(), REOBlocks.STRIPPED_HILL_CHERRY_LOG.get());

        buttonRecipe(pWriter, REOBlocks.HILL_CHERRY_BUTTON.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get(), REOBlocks.HILL_CHERRY_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.HILL_CHERRY_DOOR.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.HILL_CHERRY_TRAPDOOR.get(), REOBlocks.HILL_CHERRY_PLANKS.get());

        boatRecipe(pWriter, REOItems.HILL_CHERRY_BOAT.get(), REOBlocks.HILL_CHERRY_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.HILL_CHERRY_CHEST_BOAT.get(), REOItems.HILL_CHERRY_BOAT.get());

        // Chestnut
        planksFromLogs(pWriter, REOBlocks.CHESTNUT_PLANKS.get(), Ingredient.of(REOTags.Items.CHESTNUT_LOGS));
        woodFromLogs(pWriter, REOBlocks.CHESTNUT_WOOD.get(), REOBlocks.CHESTNUT_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_CHESTNUT_WOOD.get(), REOBlocks.STRIPPED_CHESTNUT_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_LOG.get(), REOBlocks.CHESTNUT_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get(), REOBlocks.STRIPPED_CHESTNUT_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_WOOD.get(), REOBlocks.CHESTNUT_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get(), REOBlocks.STRIPPED_CHESTNUT_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_PLANKS.get(), REOBlocks.CHESTNUT_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_STAIRS.get(), REOBlocks.CHESTNUT_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_SLAB.get(), REOBlocks.CHESTNUT_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_FENCE.get(), REOBlocks.CHESTNUT_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get(), REOBlocks.CHESTNUT_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.CHESTNUT_STAIRS.get(), REOBlocks.CHESTNUT_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CHESTNUT_SLAB.get(), REOBlocks.CHESTNUT_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.CHESTNUT_FENCE.get(), REOBlocks.CHESTNUT_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.CHESTNUT_FENCE_GATE.get(), REOBlocks.CHESTNUT_PLANKS.get());

        signRecipe(pWriter, REOBlocks.CHESTNUT_SIGN.get(), REOBlocks.CHESTNUT_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.CHESTNUT_HANGING_SIGN.get(), REOBlocks.STRIPPED_CHESTNUT_LOG.get());

        buttonRecipe(pWriter, REOBlocks.CHESTNUT_BUTTON.get(), REOBlocks.CHESTNUT_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.CHESTNUT_PRESSURE_PLATE.get(), REOBlocks.CHESTNUT_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.CHESTNUT_DOOR.get(), REOBlocks.CHESTNUT_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.CHESTNUT_TRAPDOOR.get(), REOBlocks.CHESTNUT_PLANKS.get());

        boatRecipe(pWriter, REOItems.BOAT_CHESTNUT.get(), REOBlocks.CHESTNUT_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.CHESTNUT_CHEST_BOAT.get(), REOItems.BOAT_CHESTNUT.get());

        // Citrus
        planksFromLogs(pWriter, REOBlocks.CITRUS_PLANKS.get(), Ingredient.of(REOTags.Items.CITRUS_LOGS));
        woodFromLogs(pWriter, REOBlocks.CITRUS_WOOD.get(), REOBlocks.CITRUS_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_CITRUS_WOOD.get(), REOBlocks.STRIPPED_CITRUS_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_LOG.get(), REOBlocks.CITRUS_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get(), REOBlocks.STRIPPED_CITRUS_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_WOOD.get(), REOBlocks.CITRUS_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get(), REOBlocks.STRIPPED_CITRUS_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_PLANKS.get(), REOBlocks.CITRUS_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_STAIRS.get(), REOBlocks.CITRUS_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_SLAB.get(), REOBlocks.CITRUS_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_FENCE.get(), REOBlocks.CITRUS_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get(), REOBlocks.CITRUS_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.CITRUS_STAIRS.get(), REOBlocks.CITRUS_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.CITRUS_SLAB.get(), REOBlocks.CITRUS_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.CITRUS_FENCE.get(), REOBlocks.CITRUS_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.CITRUS_FENCE_GATE.get(), REOBlocks.CITRUS_PLANKS.get());

        signRecipe(pWriter, REOBlocks.CITRUS_SIGN.get(), REOBlocks.CITRUS_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.CITRUS_HANGING_SIGN.get(), REOBlocks.STRIPPED_CITRUS_LOG.get());

        buttonRecipe(pWriter, REOBlocks.CITRUS_BUTTON.get(), REOBlocks.CITRUS_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.CITRUS_PRESSURE_PLATE.get(), REOBlocks.CITRUS_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.CITRUS_DOOR.get(), REOBlocks.CITRUS_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.CITRUS_TRAPDOOR.get(), REOBlocks.CITRUS_PLANKS.get());

        boatRecipe(pWriter, REOItems.CITRUS_BOAT.get(), REOBlocks.CITRUS_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.CITRUS_CHEST_BOAT.get(), REOItems.CITRUS_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.EBONY_PLANKS.get(), Ingredient.of(REOTags.Items.EBONY_LOGS));
        woodFromLogs(pWriter, REOBlocks.EBONY_WOOD.get(), REOBlocks.EBONY_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_EBONY_WOOD.get(), REOBlocks.STRIPPED_EBONY_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_LOG.get(), REOBlocks.EBONY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get(), REOBlocks.STRIPPED_EBONY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_WOOD.get(), REOBlocks.EBONY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get(), REOBlocks.STRIPPED_EBONY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_PLANKS.get(), REOBlocks.EBONY_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_STAIRS.get(), REOBlocks.EBONY_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_SLAB.get(), REOBlocks.EBONY_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_FENCE.get(), REOBlocks.EBONY_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_EBONY_FENCE_GATE.get(), REOBlocks.EBONY_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.EBONY_STAIRS.get(), REOBlocks.EBONY_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.EBONY_SLAB.get(), REOBlocks.EBONY_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.EBONY_FENCE.get(), REOBlocks.EBONY_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.EBONY_FENCE_GATE.get(), REOBlocks.EBONY_PLANKS.get());

        signRecipe(pWriter, REOBlocks.EBONY_SIGN.get(), REOBlocks.EBONY_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.EBONY_HANGING_SIGN.get(), REOBlocks.STRIPPED_EBONY_LOG.get());

        buttonRecipe(pWriter, REOBlocks.EBONY_BUTTON.get(), REOBlocks.EBONY_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.EBONY_PRESSURE_PLATE.get(), REOBlocks.EBONY_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.EBONY_DOOR.get(), REOBlocks.EBONY_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.EBONY_TRAPDOOR.get(), REOBlocks.EBONY_PLANKS.get());

        boatRecipe(pWriter, REOItems.EBONY_BOAT.get(), REOBlocks.EBONY_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.EBONY_CHEST_BOAT.get(), REOItems.EBONY_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.LARCH_PLANKS.get(), Ingredient.of(REOTags.Items.LARCH_LOGS));
        woodFromLogs(pWriter, REOBlocks.LARCH_WOOD.get(), REOBlocks.LARCH_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_LARCH_WOOD.get(), REOBlocks.STRIPPED_LARCH_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_LOG.get(), REOBlocks.LARCH_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get(), REOBlocks.STRIPPED_LARCH_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_WOOD.get(), REOBlocks.LARCH_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get(), REOBlocks.STRIPPED_LARCH_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_PLANKS.get(), REOBlocks.LARCH_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_STAIRS.get(), REOBlocks.LARCH_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_SLAB.get(), REOBlocks.LARCH_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_FENCE.get(), REOBlocks.LARCH_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LARCH_FENCE_GATE.get(), REOBlocks.LARCH_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.LARCH_STAIRS.get(), REOBlocks.LARCH_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LARCH_SLAB.get(), REOBlocks.LARCH_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.LARCH_FENCE.get(), REOBlocks.LARCH_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.LARCH_FENCE_GATE.get(), REOBlocks.LARCH_PLANKS.get());

        signRecipe(pWriter, REOBlocks.LARCH_SIGN.get(), REOBlocks.LARCH_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.LARCH_HANGING_SIGN.get(), REOBlocks.STRIPPED_LARCH_LOG.get());

        buttonRecipe(pWriter, REOBlocks.LARCH_BUTTON.get(), REOBlocks.LARCH_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.LARCH_PRESSURE_PLATE.get(), REOBlocks.LARCH_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.LARCH_DOOR.get(), REOBlocks.LARCH_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.LARCH_TRAPDOOR.get(), REOBlocks.LARCH_PLANKS.get());

        boatRecipe(pWriter, REOItems.LARCH_BOAT.get(), REOBlocks.LARCH_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.LARCH_CHEST_BOAT.get(), REOItems.LARCH_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.LIME_PLANKS.get(), Ingredient.of(REOTags.Items.LIME_LOGS));
        woodFromLogs(pWriter, REOBlocks.LIME_WOOD.get(), REOBlocks.LIME_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_LIME_WOOD.get(), REOBlocks.STRIPPED_LIME_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_LOG.get(), REOBlocks.LIME_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get(), REOBlocks.STRIPPED_LIME_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_WOOD.get(), REOBlocks.LIME_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get(), REOBlocks.STRIPPED_LIME_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_PLANKS.get(), REOBlocks.LIME_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_STAIRS.get(), REOBlocks.LIME_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_SLAB.get(), REOBlocks.LIME_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_FENCE.get(), REOBlocks.LIME_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_LIME_FENCE_GATE.get(), REOBlocks.LIME_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.LIME_STAIRS.get(), REOBlocks.LIME_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.LIME_SLAB.get(), REOBlocks.LIME_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.LIME_FENCE.get(), REOBlocks.LIME_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.LIME_FENCE_GATE.get(), REOBlocks.LIME_PLANKS.get());

        signRecipe(pWriter, REOBlocks.LIME_SIGN.get(), REOBlocks.LIME_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.LIME_HANGING_SIGN.get(), REOBlocks.STRIPPED_LIME_LOG.get());

        buttonRecipe(pWriter, REOBlocks.LIME_BUTTON.get(), REOBlocks.LIME_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.LIME_PRESSURE_PLATE.get(), REOBlocks.LIME_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.LIME_DOOR.get(), REOBlocks.LIME_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.LIME_TRAPDOOR.get(), REOBlocks.LIME_PLANKS.get());

        boatRecipe(pWriter, REOItems.LIME_BOAT.get(), REOBlocks.LIME_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.LIME_CHEST_BOAT.get(), REOItems.LIME_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.MAHOGANY_PLANKS.get(), Ingredient.of(REOTags.Items.MAHOGANY_LOGS));
        woodFromLogs(pWriter, REOBlocks.MAHOGANY_WOOD.get(), REOBlocks.MAHOGANY_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_MAHOGANY_WOOD.get(), REOBlocks.STRIPPED_MAHOGANY_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_LOG.get(), REOBlocks.MAHOGANY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get(), REOBlocks.STRIPPED_MAHOGANY_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_WOOD.get(), REOBlocks.MAHOGANY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get(), REOBlocks.STRIPPED_MAHOGANY_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_PLANKS.get(), REOBlocks.MAHOGANY_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_STAIRS.get(), REOBlocks.MAHOGANY_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_SLAB.get(), REOBlocks.MAHOGANY_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_FENCE.get(), REOBlocks.MAHOGANY_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get(), REOBlocks.MAHOGANY_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.MAHOGANY_STAIRS.get(), REOBlocks.MAHOGANY_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MAHOGANY_SLAB.get(), REOBlocks.MAHOGANY_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.MAHOGANY_FENCE.get(), REOBlocks.MAHOGANY_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.MAHOGANY_FENCE_GATE.get(), REOBlocks.MAHOGANY_PLANKS.get());

        signRecipe(pWriter, REOBlocks.MAHOGANY_SIGN.get(), REOBlocks.MAHOGANY_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.MAHOGANY_HANGING_SIGN.get(), REOBlocks.STRIPPED_MAHOGANY_LOG.get());

        buttonRecipe(pWriter, REOBlocks.MAHOGANY_BUTTON.get(), REOBlocks.MAHOGANY_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.MAHOGANY_PRESSURE_PLATE.get(), REOBlocks.MAHOGANY_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.MAHOGANY_DOOR.get(), REOBlocks.MAHOGANY_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.MAHOGANY_TRAPDOOR.get(), REOBlocks.MAHOGANY_PLANKS.get());

        boatRecipe(pWriter, REOItems.MAHOGANY_BOAT.get(), REOBlocks.MAHOGANY_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.MAHOGANY_CHEST_BOAT.get(), REOItems.MAHOGANY_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.MAPLE_PLANKS.get(), Ingredient.of(REOTags.Items.MAPLE_LOGS));
        woodFromLogs(pWriter, REOBlocks.MAPLE_WOOD.get(), REOBlocks.MAPLE_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_MAPLE_WOOD.get(), REOBlocks.STRIPPED_MAPLE_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_LOG.get(), REOBlocks.MAPLE_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get(), REOBlocks.STRIPPED_MAPLE_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_WOOD.get(), REOBlocks.MAPLE_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get(), REOBlocks.STRIPPED_MAPLE_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_PLANKS.get(), REOBlocks.MAPLE_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_STAIRS.get(), REOBlocks.MAPLE_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_SLAB.get(), REOBlocks.MAPLE_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_FENCE.get(), REOBlocks.MAPLE_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get(), REOBlocks.MAPLE_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.MAPLE_STAIRS.get(), REOBlocks.MAPLE_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.MAPLE_SLAB.get(), REOBlocks.MAPLE_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.MAPLE_FENCE.get(), REOBlocks.MAPLE_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.MAPLE_FENCE_GATE.get(), REOBlocks.MAPLE_PLANKS.get());

        signRecipe(pWriter, REOBlocks.MAPLE_SIGN.get(), REOBlocks.MAPLE_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.MAPLE_HANGING_SIGN.get(), REOBlocks.STRIPPED_MAPLE_LOG.get());

        buttonRecipe(pWriter, REOBlocks.MAPLE_BUTTON.get(), REOBlocks.MAPLE_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.MAPLE_PRESSURE_PLATE.get(), REOBlocks.MAPLE_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.MAPLE_DOOR.get(), REOBlocks.MAPLE_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.MAPLE_TRAPDOOR.get(), REOBlocks.MAPLE_PLANKS.get());

        boatRecipe(pWriter, REOItems.MAPLE_BOAT.get(), REOBlocks.MAPLE_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.MAPLE_CHEST_BOAT.get(), REOItems.MAPLE_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PALM_PLANKS.get(), Ingredient.of(REOTags.Items.PALM_LOGS));
        woodFromLogs(pWriter, REOBlocks.PALM_WOOD.get(), REOBlocks.PALM_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_PALM_WOOD.get(), REOBlocks.STRIPPED_PALM_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_LOG.get(), REOBlocks.PALM_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get(), REOBlocks.STRIPPED_PALM_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_WOOD.get(), REOBlocks.PALM_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get(), REOBlocks.STRIPPED_PALM_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_PLANKS.get(), REOBlocks.PALM_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_STAIRS.get(), REOBlocks.PALM_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_SLAB.get(), REOBlocks.PALM_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_FENCE.get(), REOBlocks.PALM_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PALM_FENCE_GATE.get(), REOBlocks.PALM_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.PALM_STAIRS.get(), REOBlocks.PALM_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.PALM_SLAB.get(), REOBlocks.PALM_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.PALM_FENCE.get(), REOBlocks.PALM_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.PALM_FENCE_GATE.get(), REOBlocks.PALM_PLANKS.get());

        signRecipe(pWriter, REOBlocks.PALM_SIGN.get(), REOBlocks.PALM_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.PALM_HANGING_SIGN.get(), REOBlocks.STRIPPED_PALM_LOG.get());

        buttonRecipe(pWriter, REOBlocks.PALM_BUTTON.get(), REOBlocks.PALM_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.PALM_PRESSURE_PLATE.get(), REOBlocks.PALM_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.PALM_DOOR.get(), REOBlocks.PALM_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.PALM_TRAPDOOR.get(), REOBlocks.PALM_PLANKS.get());

        boatRecipe(pWriter, REOItems.PALM_BOAT.get(), REOBlocks.PALM_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.PALM_CHEST_BOAT.get(), REOItems.PALM_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PAPAYA_PLANKS.get(), Ingredient.of(REOTags.Items.PAPAYA_LOGS));
        woodFromLogs(pWriter, REOBlocks.PAPAYA_WOOD.get(), REOBlocks.PAPAYA_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_PAPAYA_WOOD.get(), REOBlocks.STRIPPED_PAPAYA_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_LOG.get(), REOBlocks.PAPAYA_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get(), REOBlocks.STRIPPED_PAPAYA_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_WOOD.get(), REOBlocks.PAPAYA_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get(), REOBlocks.STRIPPED_PAPAYA_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_PLANKS.get(), REOBlocks.PAPAYA_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_STAIRS.get(), REOBlocks.PAPAYA_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_SLAB.get(), REOBlocks.PAPAYA_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_FENCE.get(), REOBlocks.PAPAYA_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get(), REOBlocks.PAPAYA_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.PAPAYA_STAIRS.get(), REOBlocks.PAPAYA_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.PAPAYA_SLAB.get(), REOBlocks.PAPAYA_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.PAPAYA_FENCE.get(), REOBlocks.PAPAYA_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.PAPAYA_FENCE_GATE.get(), REOBlocks.PAPAYA_PLANKS.get());

        signRecipe(pWriter, REOBlocks.PAPAYA_SIGN.get(), REOBlocks.PAPAYA_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.PAPAYA_HANGING_SIGN.get(), REOBlocks.STRIPPED_PAPAYA_LOG.get());

        buttonRecipe(pWriter, REOBlocks.PAPAYA_BUTTON.get(), REOBlocks.PAPAYA_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.PAPAYA_PRESSURE_PLATE.get(), REOBlocks.PAPAYA_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.PAPAYA_DOOR.get(), REOBlocks.PAPAYA_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.PAPAYA_TRAPDOOR.get(), REOBlocks.PAPAYA_PLANKS.get());

        boatRecipe(pWriter, REOItems.PAPAYA_BOAT.get(), REOBlocks.PAPAYA_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.PAPAYA_CHEST_BOAT.get(), REOItems.PAPAYA_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PINE_PLANKS.get(), Ingredient.of(REOTags.Items.PINE_LOGS));
        woodFromLogs(pWriter, REOBlocks.PINE_WOOD.get(), REOBlocks.PINE_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_PINE_WOOD.get(), REOBlocks.STRIPPED_PINE_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_LOG.get(), REOBlocks.PINE_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get(), REOBlocks.STRIPPED_PINE_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_WOOD.get(), REOBlocks.PINE_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get(), REOBlocks.STRIPPED_PINE_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_PLANKS.get(), REOBlocks.PINE_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_STAIRS.get(), REOBlocks.PINE_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_SLAB.get(), REOBlocks.PINE_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_FENCE.get(), REOBlocks.PINE_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PINE_FENCE_GATE.get(), REOBlocks.PINE_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.PINE_STAIRS.get(), REOBlocks.PINE_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.PINE_SLAB.get(), REOBlocks.PINE_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.PINE_FENCE.get(), REOBlocks.PINE_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.PINE_FENCE_GATE.get(), REOBlocks.PINE_PLANKS.get());

        signRecipe(pWriter, REOBlocks.PINE_SIGN.get(), REOBlocks.PINE_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.PINE_HANGING_SIGN.get(), REOBlocks.STRIPPED_PINE_LOG.get());

        buttonRecipe(pWriter, REOBlocks.PINE_BUTTON.get(), REOBlocks.PINE_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.PINE_PRESSURE_PLATE.get(), REOBlocks.PINE_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.PINE_DOOR.get(), REOBlocks.PINE_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.PINE_TRAPDOOR.get(), REOBlocks.PINE_PLANKS.get());

        boatRecipe(pWriter, REOItems.PINE_BOAT.get(), REOBlocks.PINE_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.PINE_CHEST_BOAT.get(), REOItems.PINE_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.PLUM_PLANKS.get(), Ingredient.of(REOTags.Items.PLUM_LOGS));
        woodFromLogs(pWriter, REOBlocks.PLUM_WOOD.get(), REOBlocks.PLUM_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_PLUM_WOOD.get(), REOBlocks.STRIPPED_PLUM_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_LOG.get(), REOBlocks.PLUM_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get(), REOBlocks.STRIPPED_PLUM_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_WOOD.get(), REOBlocks.PLUM_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get(), REOBlocks.STRIPPED_PLUM_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_PLANKS.get(), REOBlocks.PLUM_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_STAIRS.get(), REOBlocks.PLUM_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_SLAB.get(), REOBlocks.PLUM_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_FENCE.get(), REOBlocks.PLUM_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_PLUM_FENCE_GATE.get(), REOBlocks.PLUM_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.PLUM_STAIRS.get(), REOBlocks.PLUM_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.PLUM_SLAB.get(), REOBlocks.PLUM_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.PLUM_FENCE.get(), REOBlocks.PLUM_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.PLUM_FENCE_GATE.get(), REOBlocks.PLUM_PLANKS.get());

        signRecipe(pWriter, REOBlocks.PLUM_SIGN.get(), REOBlocks.PLUM_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.PLUM_HANGING_SIGN.get(), REOBlocks.STRIPPED_PLUM_LOG.get());

        buttonRecipe(pWriter, REOBlocks.PLUM_BUTTON.get(), REOBlocks.PLUM_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.PLUM_PRESSURE_PLATE.get(), REOBlocks.PLUM_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.PLUM_DOOR.get(), REOBlocks.PLUM_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.PLUM_TRAPDOOR.get(), REOBlocks.PLUM_PLANKS.get());

        boatRecipe(pWriter, REOItems.PLUM_BOAT.get(), REOBlocks.PLUM_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.PLUM_CHEST_BOAT.get(), REOItems.PLUM_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.POPLAR_PLANKS.get(), Ingredient.of(REOTags.Items.POPLAR_LOGS));
        woodFromLogs(pWriter, REOBlocks.POPLAR_WOOD.get(), REOBlocks.POPLAR_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_POPLAR_WOOD.get(), REOBlocks.STRIPPED_POPLAR_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_LOG.get(), REOBlocks.POPLAR_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get(), REOBlocks.STRIPPED_POPLAR_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_WOOD.get(), REOBlocks.POPLAR_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get(), REOBlocks.STRIPPED_POPLAR_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_PLANKS.get(), REOBlocks.POPLAR_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_STAIRS.get(), REOBlocks.POPLAR_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_SLAB.get(), REOBlocks.POPLAR_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_FENCE.get(), REOBlocks.POPLAR_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get(), REOBlocks.POPLAR_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.POPLAR_STAIRS.get(), REOBlocks.POPLAR_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.POPLAR_SLAB.get(), REOBlocks.POPLAR_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.POPLAR_FENCE.get(), REOBlocks.POPLAR_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.POPLAR_FENCE_GATE.get(), REOBlocks.POPLAR_PLANKS.get());

        signRecipe(pWriter, REOBlocks.POPLAR_SIGN.get(), REOBlocks.POPLAR_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.POPLAR_HANGING_SIGN.get(), REOBlocks.STRIPPED_POPLAR_LOG.get());

        buttonRecipe(pWriter, REOBlocks.POPLAR_BUTTON.get(), REOBlocks.POPLAR_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.POPLAR_PRESSURE_PLATE.get(), REOBlocks.POPLAR_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.POPLAR_DOOR.get(), REOBlocks.POPLAR_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.POPLAR_TRAPDOOR.get(), REOBlocks.POPLAR_PLANKS.get());

        boatRecipe(pWriter, REOItems.POPLAR_BOAT.get(), REOBlocks.POPLAR_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.POPLAR_CHEST_BOAT.get(), REOItems.POPLAR_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.REDWOOD_PLANKS.get(), Ingredient.of(REOTags.Items.REDWOOD_LOGS));
        woodFromLogs(pWriter, REOBlocks.REDWOOD_WOOD.get(), REOBlocks.REDWOOD_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_REDWOOD_WOOD.get(), REOBlocks.STRIPPED_REDWOOD_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_LOG.get(), REOBlocks.REDWOOD_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get(), REOBlocks.STRIPPED_REDWOOD_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_WOOD.get(), REOBlocks.REDWOOD_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get(), REOBlocks.STRIPPED_REDWOOD_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_PLANKS.get(), REOBlocks.REDWOOD_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_STAIRS.get(), REOBlocks.REDWOOD_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_SLAB.get(), REOBlocks.REDWOOD_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_FENCE.get(), REOBlocks.REDWOOD_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get(), REOBlocks.REDWOOD_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.REDWOOD_STAIRS.get(), REOBlocks.REDWOOD_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.REDWOOD_SLAB.get(), REOBlocks.REDWOOD_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.REDWOOD_FENCE.get(), REOBlocks.REDWOOD_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.REDWOOD_FENCE_GATE.get(), REOBlocks.REDWOOD_PLANKS.get());

        signRecipe(pWriter, REOBlocks.REDWOOD_SIGN.get(), REOBlocks.REDWOOD_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.REDWOOD_HANGING_SIGN.get(), REOBlocks.STRIPPED_REDWOOD_LOG.get());

        buttonRecipe(pWriter, REOBlocks.REDWOOD_BUTTON.get(), REOBlocks.REDWOOD_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.REDWOOD_PRESSURE_PLATE.get(), REOBlocks.REDWOOD_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.REDWOOD_DOOR.get(), REOBlocks.REDWOOD_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.REDWOOD_TRAPDOOR.get(), REOBlocks.REDWOOD_PLANKS.get());

        boatRecipe(pWriter, REOItems.REDWOOD_BOAT.get(), REOBlocks.REDWOOD_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.REDWOOD_CHEST_BOAT.get(), REOItems.REDWOOD_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.RUBBER_PLANKS.get(), Ingredient.of(REOTags.Items.RUBBER_LOGS));
        woodFromLogs(pWriter, REOBlocks.RUBBER_WOOD.get(), REOBlocks.RUBBER_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_RUBBER_WOOD.get(), REOBlocks.STRIPPED_RUBBER_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_LOG.get(), REOBlocks.RUBBER_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get(), REOBlocks.STRIPPED_RUBBER_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_WOOD.get(), REOBlocks.RUBBER_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get(), REOBlocks.STRIPPED_RUBBER_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_PLANKS.get(), REOBlocks.RUBBER_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_STAIRS.get(), REOBlocks.RUBBER_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_SLAB.get(), REOBlocks.RUBBER_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_FENCE.get(), REOBlocks.RUBBER_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get(), REOBlocks.RUBBER_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.RUBBER_STAIRS.get(), REOBlocks.RUBBER_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.RUBBER_SLAB.get(), REOBlocks.RUBBER_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.RUBBER_FENCE.get(), REOBlocks.RUBBER_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.RUBBER_FENCE_GATE.get(), REOBlocks.RUBBER_PLANKS.get());

        signRecipe(pWriter, REOBlocks.RUBBER_SIGN.get(), REOBlocks.RUBBER_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.RUBBER_HANGING_SIGN.get(), REOBlocks.STRIPPED_RUBBER_LOG.get());

        buttonRecipe(pWriter, REOBlocks.RUBBER_BUTTON.get(), REOBlocks.RUBBER_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.RUBBER_PRESSURE_PLATE.get(), REOBlocks.RUBBER_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.RUBBER_DOOR.get(), REOBlocks.RUBBER_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.RUBBER_TRAPDOOR.get(), REOBlocks.RUBBER_PLANKS.get());

        boatRecipe(pWriter, REOItems.RUBBER_BOAT.get(), REOBlocks.RUBBER_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.RUBBER_CHEST_BOAT.get(), REOItems.RUBBER_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.TEAK_PLANKS.get(), Ingredient.of(REOTags.Items.TEAK_LOGS));
        woodFromLogs(pWriter, REOBlocks.TEAK_WOOD.get(), REOBlocks.TEAK_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_TEAK_WOOD.get(), REOBlocks.STRIPPED_TEAK_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_LOG.get(), REOBlocks.TEAK_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get(), REOBlocks.STRIPPED_TEAK_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_WOOD.get(), REOBlocks.TEAK_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get(), REOBlocks.STRIPPED_TEAK_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_PLANKS.get(), REOBlocks.TEAK_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_STAIRS.get(), REOBlocks.TEAK_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_SLAB.get(), REOBlocks.TEAK_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_FENCE.get(), REOBlocks.TEAK_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_TEAK_FENCE_GATE.get(), REOBlocks.TEAK_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.TEAK_STAIRS.get(), REOBlocks.TEAK_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.TEAK_SLAB.get(), REOBlocks.TEAK_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.TEAK_FENCE.get(), REOBlocks.TEAK_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.TEAK_FENCE_GATE.get(), REOBlocks.TEAK_PLANKS.get());

        signRecipe(pWriter, REOBlocks.TEAK_SIGN.get(), REOBlocks.TEAK_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.TEAK_HANGING_SIGN.get(), REOBlocks.STRIPPED_TEAK_LOG.get());

        buttonRecipe(pWriter, REOBlocks.TEAK_BUTTON.get(), REOBlocks.TEAK_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.TEAK_PRESSURE_PLATE.get(), REOBlocks.TEAK_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.TEAK_DOOR.get(), REOBlocks.TEAK_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.TEAK_TRAPDOOR.get(), REOBlocks.TEAK_PLANKS.get());

        boatRecipe(pWriter, REOItems.TEAK_BOAT.get(), REOBlocks.TEAK_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.TEAK_CHEST_BOAT.get(), REOItems.TEAK_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.WALNUT_PLANKS.get(), Ingredient.of(REOTags.Items.WALNUT_LOGS));
        woodFromLogs(pWriter, REOBlocks.WALNUT_WOOD.get(), REOBlocks.WALNUT_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_WALNUT_WOOD.get(), REOBlocks.STRIPPED_WALNUT_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_LOG.get(), REOBlocks.WALNUT_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get(), REOBlocks.STRIPPED_WALNUT_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_WOOD.get(), REOBlocks.WALNUT_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get(), REOBlocks.STRIPPED_WALNUT_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_PLANKS.get(), REOBlocks.WALNUT_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_STAIRS.get(), REOBlocks.WALNUT_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_SLAB.get(), REOBlocks.WALNUT_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_FENCE.get(), REOBlocks.WALNUT_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get(), REOBlocks.WALNUT_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.WALNUT_STAIRS.get(), REOBlocks.WALNUT_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.WALNUT_SLAB.get(), REOBlocks.WALNUT_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.WALNUT_FENCE.get(), REOBlocks.WALNUT_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.WALNUT_FENCE_GATE.get(), REOBlocks.WALNUT_PLANKS.get());

        signRecipe(pWriter, REOBlocks.WALNUT_SIGN.get(), REOBlocks.WALNUT_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.WALNUT_HANGING_SIGN.get(), REOBlocks.STRIPPED_WALNUT_LOG.get());

        buttonRecipe(pWriter, REOBlocks.WALNUT_BUTTON.get(), REOBlocks.WALNUT_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.WALNUT_PRESSURE_PLATE.get(), REOBlocks.WALNUT_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.WALNUT_DOOR.get(), REOBlocks.WALNUT_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.WALNUT_TRAPDOOR.get(), REOBlocks.WALNUT_PLANKS.get());

        boatRecipe(pWriter, REOItems.WALNUT_BOAT.get(), REOBlocks.WALNUT_PLANKS.get());
        chestBoatRecipe(pWriter, REOItems.WALNUT_CHEST_BOAT.get(), REOItems.WALNUT_BOAT.get());

        // Ebony
        planksFromLogs(pWriter, REOBlocks.WILLOW_PLANKS.get(), Ingredient.of(REOTags.Items.WILLOW_LOGS));
        woodFromLogs(pWriter, REOBlocks.WILLOW_WOOD.get(), REOBlocks.WILLOW_LOG.get());
        woodFromLogs(pWriter, REOBlocks.STRIPPED_WILLOW_WOOD.get(), REOBlocks.STRIPPED_WILLOW_LOG.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_LOG.get(), REOBlocks.WILLOW_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get(), REOBlocks.STRIPPED_WILLOW_LOG.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_WOOD.get(), REOBlocks.WILLOW_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get(), REOBlocks.STRIPPED_WILLOW_WOOD.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_PLANKS.get(), REOBlocks.WILLOW_PLANKS.get());

        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_STAIRS.get(), REOBlocks.WILLOW_STAIRS.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_SLAB.get(), REOBlocks.WILLOW_SLAB.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_FENCE.get(), REOBlocks.WILLOW_FENCE.get());
        resistantRecipe(pWriter, REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get(), REOBlocks.WILLOW_FENCE_GATE.get());

        stairsRecipe(pWriter, REOBlocks.WILLOW_STAIRS.get(), REOBlocks.WILLOW_PLANKS.get());
        slab(pWriter, RecipeCategory.BUILDING_BLOCKS, REOBlocks.WILLOW_SLAB.get(), REOBlocks.WILLOW_PLANKS.get());
        fenceRecipe(pWriter, REOBlocks.WILLOW_FENCE.get(), REOBlocks.WILLOW_PLANKS.get());
        fenceGateRecipe(pWriter, REOBlocks.WILLOW_FENCE_GATE.get(), REOBlocks.WILLOW_PLANKS.get());

        signRecipe(pWriter, REOBlocks.WILLOW_SIGN.get(), REOBlocks.WILLOW_PLANKS.get());
        hangingSignRecipe(pWriter, REOBlocks.WILLOW_HANGING_SIGN.get(), REOBlocks.STRIPPED_WILLOW_LOG.get());

        buttonRecipe(pWriter, REOBlocks.WILLOW_BUTTON.get(), REOBlocks.WILLOW_PLANKS.get());
        pressurePlateRecipe(pWriter, REOBlocks.WILLOW_PRESSURE_PLATE.get(), REOBlocks.WILLOW_PLANKS.get());

        doorRecipe(pWriter, REOBlocks.WILLOW_DOOR.get(), REOBlocks.WILLOW_PLANKS.get());
        trapdoorRecipe(pWriter, REOBlocks.WILLOW_TRAPDOOR.get(), REOBlocks.WILLOW_PLANKS.get());

        boatRecipe(pWriter, REOItems.WILLOW_BOAT.get(), REOBlocks.WILLOW_PLANKS.get());
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

        ingotRecipe(pWriter, REOItems.ALUMINUM_INGOT.get(), REOBlocks.ALUMINUM_BLOCK.get());
        ingotRecipe(pWriter, REOItems.BRASS_INGOT.get(), REOBlocks.BRASS_BLOCK.get());
        ingotRecipe(pWriter, REOItems.BRONZE_INGOT.get(), REOBlocks.BRONZE_BLOCK.get());
        ingotRecipe(pWriter, REOItems.ELECTRUM_INGOT.get(), REOBlocks.ELECTRUM_BLOCK.get());
        ingotRecipe(pWriter, REOItems.ENDERITE_INGOT.get(), REOBlocks.ENDERITE_BLOCK.get());
        ingotRecipe(pWriter, REOItems.LEAD_INGOT.get(), REOBlocks.LEAD_BLOCK.get());
        ingotRecipe(pWriter, REOItems.NICKEL_INGOT.get(), REOBlocks.NICKEL_BLOCK.get());
        ingotRecipe(pWriter, REOItems.PLATINUM_INGOT.get(), REOBlocks.PLATINUM_BLOCK.get());
        ingotRecipe(pWriter, REOItems.SILVER_INGOT.get(), REOBlocks.SILVER_BLOCK.get());
        ingotRecipe(pWriter, REOItems.STEEL_INGOT.get(), REOBlocks.STEEL_BLOCK.get());
        ingotRecipe(pWriter, REOItems.TIN_INGOT.get(), REOBlocks.TIN_BLOCK.get());
        ingotRecipe(pWriter, REOItems.ZINC_INGOT.get(), REOBlocks.ZINC_BLOCK.get());

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
