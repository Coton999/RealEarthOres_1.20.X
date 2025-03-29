package net.coton999.realearthores.datagen.loot;

import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.custom.crop.food.BarleyBlock;
import net.coton999.realearthores.block.custom.crop.food.CauliflowerBlock;
import net.coton999.realearthores.block.custom.crop.food.CottonBlock;
import net.coton999.realearthores.block.custom.fruit.*;
import net.coton999.realearthores.item.REOItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class REOBlockLootTables extends BlockLootSubProvider {

    public REOBlockLootTables() {

        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    protected static final LootItemCondition.Builder SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
    protected static final LootItemCondition.Builder HAS_NO_SILK_TOUCH = SILK_TOUCH.invert();
    protected static final LootItemCondition.Builder SHEARS = MatchTool.toolMatches(ItemPredicate.Builder.item()
            .of(Items.SHEARS, REOItems.AMETHYST_SHEARS.get(), REOItems.BRONZE_SHEARS.get(), REOItems.DIAMOND_SHEARS.get(),
                    REOItems.ENDERITE_SHEARS.get(), REOItems.GOLDEN_SHEARS.get(), REOItems.NETHERITE_SHEARS.get(), REOItems.PERIDOT_SHEARS.get(),
                    REOItems.PLATINUM_SHEARS.get(), REOItems.RUBY_SHEARS.get(), REOItems.SAPPHIRE_SHEARS.get(), REOItems.SILVER_SHEARS.get(),
                    REOItems.STEEL_SHEARS.get(), REOItems.STONE_SHEARS.get(), REOItems.WOODEN_SHEARS.get()));
    private static final LootItemCondition.Builder SHEARS_OR_SILK_TOUCH = SHEARS.or(SILK_TOUCH);
    private static final LootItemCondition.Builder NO_SHEARS_OR_SILK_TOUCH = SHEARS_OR_SILK_TOUCH.invert();
    protected static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
    private static final float[] NORMAL_LEAVES_STICK_CHANCES = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

    @Override
    protected void generate() {

        // Building Blocks
        // Marble
        this.add(REOBlocks.MARBLE.get(),
                (block) -> createCobbleDrop(REOBlocks.MARBLE.get(), REOBlocks.MARBLE_COBBLE.get()));
        this.dropSelf(REOBlocks.MARBLE_COBBLE.get());
        this.dropSelf(REOBlocks.MARBLE_COBBLE_MOSSY.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK_MOSSY.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK_CHISELED.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK_CRACKED.get());

        this.dropSelf(REOBlocks.MARBLE_STAIRS.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK_STAIRS.get());
        this.dropSelf(REOBlocks.MARBLE_COBBLE_STAIRS.get());
        this.dropSelf(REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS.get());
        this.add(REOBlocks.MARBLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MARBLE_SLAB.get()));
        this.add(REOBlocks.MARBLE_BRICK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MARBLE_BRICK_SLAB.get()));
        this.add(REOBlocks.MARBLE_COBBLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MARBLE_COBBLE_SLAB.get()));
        this.add(REOBlocks.MARBLE_COBBLE_MOSSY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MARBLE_COBBLE_MOSSY_SLAB.get()));
        this.dropSelf(REOBlocks.MARBLE_WALL.get());
        this.dropSelf(REOBlocks.MARBLE_BRICK_WALL.get());
        this.dropSelf(REOBlocks.MARBLE_COBBLE_WALL.get());
        this.dropSelf(REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get());

        // Limestone
        this.add(REOBlocks.LIMESTONE.get(),
                (block) -> createCobbleDrop(REOBlocks.LIMESTONE.get(), REOBlocks.LIMESTONE_COBBLE.get()));
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE.get());
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE_MOSSY.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK_MOSSY.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK_CHISELED.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK_CRACKED.get());

        this.dropSelf(REOBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK_STAIRS.get());
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE_STAIRS.get());
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS.get());
        this.add(REOBlocks.LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LIMESTONE_SLAB.get()));
        this.add(REOBlocks.LIMESTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LIMESTONE_BRICK_SLAB.get()));
        this.add(REOBlocks.LIMESTONE_COBBLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LIMESTONE_COBBLE_SLAB.get()));
        this.add(REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB.get()));
        this.dropSelf(REOBlocks.LIMESTONE_WALL.get());
        this.dropSelf(REOBlocks.LIMESTONE_BRICK_WALL.get());
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE_WALL.get());
        this.dropSelf(REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get());

        // Calcite
        this.dropSelf(REOBlocks.CALCITE_STAIRS.get());
        this.add(REOBlocks.CALCITE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.CALCITE_SLAB.get()));
        this.dropSelf(REOBlocks.CALCITE_WALL.get());

        // Netherrack
        this.dropSelf(REOBlocks.NETHERRACK_STAIRS.get());
        this.add(REOBlocks.NETHERRACK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.NETHERRACK_SLAB.get()));
        this.dropSelf(REOBlocks.NETHERRACK_WALL.get());

        // Crops //
        this.cropLootTable(REOBlocks.CROP_BARLEY.get(), REOItems.SEED_BARLEY.get(),
                REOItems.PLANT_BARLEY.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CROP_CAULIFLOWER.get(), REOItems.SEED_CAULIFLOWER.get(),
                REOItems.FOOD_CAULIFLOWER.get(), CauliflowerBlock.AGE, CauliflowerBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CROP_COTTON.get(), REOItems.SEED_COTTON.get(),
                REOItems.PLANT_COTTON.get(), CottonBlock.AGE, CottonBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CROP_ONIONS.get(), REOItems.FOOD_ONION.get(),
                REOItems.FOOD_ONION.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CROP_RICE.get(), REOItems.SEED_RICE.get(),
                REOItems.PLANT_RICE.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CROP_TOMATO.get(), REOItems.SEED_TOMATO.get(),
                REOItems.FOOD_TOMATO.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);

        this.dropOther(REOBlocks.WILD_BARLEY.get(), REOItems.SEED_BARLEY.get());
        this.dropOther(REOBlocks.WILD_COTTON.get(), REOItems.SEED_COTTON.get());
        this.dropOther(REOBlocks.WILD_RICE.get(), REOItems.SEED_RICE.get());
        this.dropOther(REOBlocks.WILD_TOMATO.get(), REOItems.SEED_TOMATO.get());


        // Fruit //
        this.cropLootTable(REOBlocks.FRUIT_CITRUS_BLOCK.get(), REOItems.FOOD_LEMON.get(),
                REOItems.FOOD_LEMON.get(), CitrusBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.FRUIT_LIME_BLOCK.get(), REOItems.FOOD_LIME.get(),
                REOItems.FOOD_LIME.get(), LimeBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.FRUIT_PAPAYA_BLOCK.get(), REOItems.FOOD_PAPAYA.get(),
                REOItems.FOOD_PAPAYA.get(), PapayaBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.FRUIT_PEAR_BLOCK.get(), REOItems.FOOD_PEAR.get(),
                REOItems.FOOD_PEAR.get(), PearBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.FRUIT_PLUM_BLOCK.get(), REOItems.FOOD_PLUM.get(),
                REOItems.FOOD_PLUM.get(), PlumBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.FRUIT_WALNUT_BLOCK.get(), REOItems.FOOD_WALNUT.get(),
                REOItems.FOOD_WALNUT.get(), WalnutBlock.AGE, BarleyBlock.MAX_AGE);

        // Berry //
        this.add(REOBlocks.BERRY_BLACKBERRY_BLOCK.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_BLACKBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_BLACKBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        this.add(REOBlocks.BERRY_BLUEBERRY_BLOCK.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_BLUEBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_BLUEBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_BLUEBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_BLUEBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        this.add(REOBlocks.BERRY_RASPBERRY_BLOCK.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_RASPBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BERRY_RASPBERRY_BLOCK.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.FOOD_RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        // Ore Crops


        // Wood
        // Vanilla
        this.dropSelf(REOBlocks.LOG_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_OAK_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_OAK_RESISTANT.get());
        this.add(REOBlocks.SLAB_OAK_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_OAK_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_OAK_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_SPRUCE_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_SPRUCE_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_SPRUCE_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_SPRUCE_RESISTANT.get());
        this.add(REOBlocks.SLAB_SPRUCE_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_SPRUCE_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_SPRUCE_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_SPRUCE_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_BIRCH_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BIRCH_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_BIRCH_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_BIRCH_RESISTANT.get());
        this.add(REOBlocks.SLAB_BIRCH_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_BIRCH_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_BIRCH_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_BIRCH_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_JUNGLE_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_JUNGLE_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_JUNGLE_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_JUNGLE_RESISTANT.get());
        this.add(REOBlocks.SLAB_JUNGLE_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_JUNGLE_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_JUNGLE_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_JUNGLE_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_ACACIA_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_ACACIA_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_ACACIA_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_ACACIA_RESISTANT.get());
        this.add(REOBlocks.SLAB_ACACIA_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_ACACIA_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_ACACIA_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_ACACIA_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_DARK_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_DARK_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_DARK_OAK_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_DARK_OAK_RESISTANT.get());
        this.add(REOBlocks.SLAB_DARK_OAK_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_DARK_OAK_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_DARK_OAK_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_MANGROVE_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MANGROVE_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_MANGROVE_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_MANGROVE_RESISTANT.get());
        this.add(REOBlocks.SLAB_MANGROVE_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_MANGROVE_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_MANGROVE_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_MANGROVE_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_CHERRY_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_CHERRY_RESISTANT.get());
        this.add(REOBlocks.SLAB_CHERRY_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_CHERRY_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_CHERRY_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_BALSA.get());
        this.dropSelf(REOBlocks.WOOD_BALSA.get());
        this.dropSelf(REOBlocks.LOG_BALSA_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_BALSA_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_BALSA.get());

        this.dropSelf(REOBlocks.STAIRS_BALSA.get());
        this.add(REOBlocks.SLAB_BALSA.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_BALSA.get()));
        this.dropSelf(REOBlocks.FENCE_BALSA.get());
        this.dropSelf(REOBlocks.FENCE_GATE_BALSA.get());

        this.dropSelf(REOBlocks.BUTTON_BALSA.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_BALSA.get());

        this.dropSelf(REOBlocks.SAPLING_BALSA.get());
        this.add(REOBlocks.POTTED_SAPLING_BALSA.get(), createPotFlowerItemTable(REOBlocks.SAPLING_BALSA.get()));
        this.add(REOBlocks.LEAVES_BALSA.get(),
                createModLeavesDrops(REOBlocks.LEAVES_BALSA.get(), REOBlocks.SAPLING_BALSA.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_BALSA.get(), block ->
                createSingleItemTable(REOItems.SIGN_BALSA.get()));
        this.add(REOBlocks.SIGN_BALSA_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_BALSA.get()));
        this.add(REOBlocks.SIGN_HANGING_BALSA.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_BALSA.get()));
        this.add(REOBlocks.SIGN_HANGING_BALSA_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_BALSA.get()));

        this.add(REOBlocks.DOOR_BALSA.get(),
                block -> createDoorTable(REOBlocks.DOOR_BALSA.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_BALSA.get());

        this.dropSelf(REOBlocks.LOG_BAOBAB.get());
        this.dropSelf(REOBlocks.WOOD_BAOBAB.get());
        this.dropSelf(REOBlocks.LOG_BAOBAB_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_BAOBAB_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_BAOBAB.get());

        this.dropSelf(REOBlocks.STAIRS_BAOBAB.get());
        this.add(REOBlocks.SLAB_BAOBAB.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_BAOBAB.get()));
        this.dropSelf(REOBlocks.FENCE_BAOBAB.get());
        this.dropSelf(REOBlocks.FENCE_GATE_BAOBAB.get());

        this.dropSelf(REOBlocks.BUTTON_BAOBAB.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_BAOBAB.get());

        this.dropSelf(REOBlocks.SAPLING_BAOBAB.get());
        this.add(REOBlocks.POTTED_SAPLING_BAOBAB.get(), createPotFlowerItemTable(REOBlocks.SAPLING_BAOBAB.get()));
        this.add(REOBlocks.LEAVES_BAOBAB.get(),
                createModLeavesDrops(REOBlocks.LEAVES_BAOBAB.get(), REOBlocks.SAPLING_BAOBAB.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_BAOBAB.get(), block ->
                createSingleItemTable(REOItems.SIGN_BAOBAB.get()));
        this.add(REOBlocks.SIGN_BAOBAB_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_BAOBAB.get()));
        this.add(REOBlocks.SIGN_HANGING_BAOBAB.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_BAOBAB.get()));
        this.add(REOBlocks.SIGN_HANGING_BAOBAB_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_BAOBAB.get()));

        this.add(REOBlocks.DOOR_BAOBAB.get(),
                block -> createDoorTable(REOBlocks.DOOR_BAOBAB.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_BAOBAB.get());

        this.dropSelf(REOBlocks.LOG_HILL_CHERRY.get());
        this.dropSelf(REOBlocks.WOOD_HILL_CHERRY.get());
        this.dropSelf(REOBlocks.LOG_HILL_CHERRY_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_HILL_CHERRY.get());

        this.dropSelf(REOBlocks.STAIRS_HILL_CHERRY.get());
        this.add(REOBlocks.SLAB_HILL_CHERRY.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_HILL_CHERRY.get()));
        this.dropSelf(REOBlocks.FENCE_HILL_CHERRY.get());
        this.dropSelf(REOBlocks.FENCE_GATE_HILL_CHERRY.get());

        this.dropSelf(REOBlocks.BUTTON_HILL_CHERRY.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get());

        this.dropSelf(REOBlocks.SAPLING_HILL_CHERRY.get());
        this.add(REOBlocks.POTTED_SAPLING_HILL_CHERRY.get(), createPotFlowerItemTable(REOBlocks.SAPLING_HILL_CHERRY.get()));
        this.add(REOBlocks.LEAVES_HILL_CHERRY.get(),
                createModLeavesDrops(REOBlocks.LEAVES_HILL_CHERRY.get(), REOBlocks.SAPLING_HILL_CHERRY.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_HILL_CHERRY.get(), block ->
                createSingleItemTable(REOItems.SIGN_HILL_CHERRY.get()));
        this.add(REOBlocks.SIGN_HILL_CHERRY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HILL_CHERRY.get()));
        this.add(REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_HILL_CHERRY.get()));
        this.add(REOBlocks.SIGN_HANGING_HILL_CHERRY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_HILL_CHERRY.get()));

        this.add(REOBlocks.DOOR_HILL_CHERRY.get(),
                block -> createDoorTable(REOBlocks.DOOR_HILL_CHERRY.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_HILL_CHERRY.get());

        this.dropSelf(REOBlocks.LOG_CHESTNUT.get());
        this.dropSelf(REOBlocks.WOOD_CHESTNUT.get());
        this.dropSelf(REOBlocks.LOG_CHESTNUT_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_CHESTNUT_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_CHESTNUT.get());

        this.dropSelf(REOBlocks.STAIRS_CHESTNUT.get());
        this.add(REOBlocks.SLAB_CHESTNUT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_CHESTNUT.get()));
        this.dropSelf(REOBlocks.FENCE_CHESTNUT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_CHESTNUT.get());

        this.dropSelf(REOBlocks.BUTTON_CHESTNUT.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_CHESTNUT.get());

        this.dropSelf(REOBlocks.SAPLING_CHESTNUT.get());
        this.add(REOBlocks.POTTED_SAPLING_CHESTNUT.get(), createPotFlowerItemTable(REOBlocks.SAPLING_CHESTNUT.get()));
        this.add(REOBlocks.LEAVES_CHESTNUT.get(),
                createModLeavesDrops(REOBlocks.LEAVES_CHESTNUT.get(), REOBlocks.SAPLING_CHESTNUT.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_CHESTNUT_FRUIT.get(), REOItems.FOOD_CHESTNUT.get());

        this.add(REOBlocks.SIGN_CHESTNUT.get(), block ->
                createSingleItemTable(REOItems.SIGN_CHESTNUT.get()));
        this.add(REOBlocks.SIGN_CHESTNUT_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_CHESTNUT.get()));
        this.add(REOBlocks.SIGN_HANGING_CHESTNUT.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_CHESTNUT.get()));
        this.add(REOBlocks.SIGN_HANGING_CHESTNUT_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_CHESTNUT.get()));

        this.add(REOBlocks.DOOR_CHESTNUT.get(),
                block -> createDoorTable(REOBlocks.DOOR_CHESTNUT.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_CHESTNUT.get());


        this.dropSelf(REOBlocks.LOG_CITRUS.get());
        this.dropSelf(REOBlocks.WOOD_CITRUS.get());
        this.dropSelf(REOBlocks.LOG_CITRUS_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_CITRUS_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_CITRUS.get());

        this.dropSelf(REOBlocks.STAIRS_CITRUS.get());
        this.add(REOBlocks.SLAB_CITRUS.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_CITRUS.get()));
        this.dropSelf(REOBlocks.FENCE_CITRUS.get());
        this.dropSelf(REOBlocks.FENCE_GATE_CITRUS.get());

        this.dropSelf(REOBlocks.BUTTON_CITRUS.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_CITRUS.get());

        this.dropSelf(REOBlocks.SAPLING_CITRUS.get());
        this.add(REOBlocks.POTTED_SAPLING_CITRUS.get(), createPotFlowerItemTable(REOBlocks.SAPLING_CITRUS.get()));
        this.add(REOBlocks.LEAVES_CITRUS.get(),
                createModLeavesDrops(REOBlocks.LEAVES_CITRUS.get(), REOBlocks.SAPLING_CITRUS.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_CITRUS_FRUIT.get(), REOItems.FOOD_LEMON.get());

        this.add(REOBlocks.SIGN_CITRUS.get(), block ->
                createSingleItemTable(REOItems.SIGN_CITRUS.get()));
        this.add(REOBlocks.SIGN_CITRUS_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_CITRUS.get()));
        this.add(REOBlocks.SIGN_HANGING_CITRUS.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_CITRUS.get()));
        this.add(REOBlocks.SIGN_HANGING_CITRUS_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_CITRUS.get()));

        this.add(REOBlocks.DOOR_CITRUS.get(),
                block -> createDoorTable(REOBlocks.DOOR_CITRUS.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_CITRUS.get());


        this.dropSelf(REOBlocks.LOG_EBONY.get());
        this.dropSelf(REOBlocks.WOOD_EBONY.get());
        this.dropSelf(REOBlocks.LOG_EBONY_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_EBONY_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_EBONY.get());

        this.dropSelf(REOBlocks.STAIRS_EBONY.get());
        this.add(REOBlocks.SLAB_EBONY.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_EBONY.get()));
        this.dropSelf(REOBlocks.FENCE_EBONY.get());
        this.dropSelf(REOBlocks.FENCE_GATE_EBONY.get());

        this.dropSelf(REOBlocks.BUTTON_EBONY.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_EBONY.get());

        this.dropSelf(REOBlocks.SAPLING_EBONY.get());
        this.add(REOBlocks.POTTED_SAPLING_EBONY.get(), createPotFlowerItemTable(REOBlocks.SAPLING_EBONY.get()));
        this.add(REOBlocks.LEAVES_EBONY.get(),
                createModLeavesDrops(REOBlocks.LEAVES_EBONY.get(), REOBlocks.SAPLING_EBONY.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_EBONY.get(), block ->
                createSingleItemTable(REOItems.SIGN_EBONY.get()));
        this.add(REOBlocks.SIGN_EBONY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_EBONY.get()));
        this.add(REOBlocks.SIGN_HANGING_EBONY.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_EBONY.get()));
        this.add(REOBlocks.SIGN_HANGING_EBONY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_EBONY.get()));

        this.add(REOBlocks.DOOR_EBONY.get(),
                block -> createDoorTable(REOBlocks.DOOR_EBONY.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_EBONY.get());


        this.dropSelf(REOBlocks.LOG_LARCH.get());
        this.dropSelf(REOBlocks.WOOD_LARCH.get());
        this.dropSelf(REOBlocks.LOG_LARCH_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_LARCH_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_LARCH.get());

        this.dropSelf(REOBlocks.STAIRS_LARCH.get());
        this.add(REOBlocks.SLAB_LARCH.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_LARCH.get()));
        this.dropSelf(REOBlocks.FENCE_LARCH.get());
        this.dropSelf(REOBlocks.FENCE_GATE_LARCH.get());

        this.dropSelf(REOBlocks.BUTTON_LARCH.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_LARCH.get());

        this.dropSelf(REOBlocks.SAPLING_LARCH.get());
        this.add(REOBlocks.POTTED_SAPLING_LARCH.get(), createPotFlowerItemTable(REOBlocks.SAPLING_LARCH.get()));
        this.add(REOBlocks.LEAVES_LARCH.get(),
                createModLeavesDrops(REOBlocks.LEAVES_LARCH.get(), REOBlocks.SAPLING_LARCH.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_LARCH.get(), block ->
                createSingleItemTable(REOItems.SIGN_LARCH.get()));
        this.add(REOBlocks.SIGN_LARCH_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_LARCH.get()));
        this.add(REOBlocks.SIGN_HANGING_LARCH.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_LARCH.get()));
        this.add(REOBlocks.SIGN_HANGING_LARCH_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_LARCH.get()));

        this.add(REOBlocks.DOOR_LARCH.get(),
                block -> createDoorTable(REOBlocks.DOOR_LARCH.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_LARCH.get());


        this.dropSelf(REOBlocks.LOG_LIME.get());
        this.dropSelf(REOBlocks.WOOD_LIME.get());
        this.dropSelf(REOBlocks.LOG_LIME_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_LIME_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_LIME.get());

        this.dropSelf(REOBlocks.STAIRS_LIME.get());
        this.add(REOBlocks.SLAB_LIME.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_LIME.get()));
        this.dropSelf(REOBlocks.FENCE_LIME.get());
        this.dropSelf(REOBlocks.FENCE_GATE_LIME.get());

        this.dropSelf(REOBlocks.BUTTON_LIME.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_LIME.get());

        this.dropSelf(REOBlocks.SAPLING_LIME.get());
        this.add(REOBlocks.POTTED_SAPLING_LIME.get(), createPotFlowerItemTable(REOBlocks.SAPLING_LIME.get()));
        this.add(REOBlocks.LEAVES_LIME.get(),
                createModLeavesDrops(REOBlocks.LEAVES_LIME.get(), REOBlocks.SAPLING_LIME.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_LIME_FRUIT.get(), REOItems.FOOD_LIME.get());

        this.add(REOBlocks.SIGN_LIME.get(), block ->
                createSingleItemTable(REOItems.SIGN_LIME.get()));
        this.add(REOBlocks.SIGN_LIME_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_LIME.get()));
        this.add(REOBlocks.SIGN_HANGING_LIME.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_LIME.get()));
        this.add(REOBlocks.SIGN_HANGING_LIME_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_LIME.get()));

        this.add(REOBlocks.DOOR_LIME.get(),
                block -> createDoorTable(REOBlocks.DOOR_LIME.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_LIME.get());


        this.dropSelf(REOBlocks.LOG_MAHOGANY.get());
        this.dropSelf(REOBlocks.WOOD_MAHOGANY.get());
        this.dropSelf(REOBlocks.LOG_MAHOGANY_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_MAHOGANY_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_MAHOGANY.get());

        this.dropSelf(REOBlocks.STAIRS_MAHOGANY.get());
        this.add(REOBlocks.SLAB_MAHOGANY.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_MAHOGANY.get()));
        this.dropSelf(REOBlocks.FENCE_MAHOGANY.get());
        this.dropSelf(REOBlocks.FENCE_GATE_MAHOGANY.get());

        this.dropSelf(REOBlocks.BUTTON_MAHOGANY.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_MAHOGANY.get());

        this.dropSelf(REOBlocks.SAPLING_MAHOGANY.get());
        this.add(REOBlocks.POTTED_SAPLING_MAHOGANY.get(), createPotFlowerItemTable(REOBlocks.SAPLING_MAHOGANY.get()));
        this.add(REOBlocks.LEAVES_MAHOGANY.get(),
                createModLeavesDrops(REOBlocks.LEAVES_MAHOGANY.get(), REOBlocks.SAPLING_MAHOGANY.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_MAHOGANY.get(), block ->
                createSingleItemTable(REOItems.SIGN_MAHOGANY.get()));
        this.add(REOBlocks.SIGN_MAHOGANY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_MAHOGANY.get()));
        this.add(REOBlocks.SIGN_HANGING_MAHOGANY.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_MAHOGANY.get()));
        this.add(REOBlocks.SIGN_HANGING_MAHOGANY_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_MAHOGANY.get()));

        this.add(REOBlocks.DOOR_MAHOGANY.get(),
                block -> createDoorTable(REOBlocks.DOOR_MAHOGANY.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_MAHOGANY.get());


        this.dropSelf(REOBlocks.LOG_MAPLE.get());
        this.dropSelf(REOBlocks.WOOD_MAPLE.get());
        this.dropSelf(REOBlocks.LOG_MAPLE_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_MAPLE_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_MAPLE.get());

        this.dropSelf(REOBlocks.STAIRS_MAPLE.get());
        this.add(REOBlocks.SLAB_MAPLE.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_MAPLE.get()));
        this.dropSelf(REOBlocks.FENCE_MAPLE.get());
        this.dropSelf(REOBlocks.FENCE_GATE_MAPLE.get());

        this.dropSelf(REOBlocks.BUTTON_MAPLE.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_MAPLE.get());

        this.dropSelf(REOBlocks.SAPLING_MAPLE.get());
        this.add(REOBlocks.POTTED_SAPLING_MAPLE.get(), createPotFlowerItemTable(REOBlocks.SAPLING_MAPLE.get()));
        this.add(REOBlocks.LEAVES_MAPLE.get(),
                createModLeavesDrops(REOBlocks.LEAVES_MAPLE.get(), REOBlocks.SAPLING_MAPLE.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_MAPLE.get(), block ->
                createSingleItemTable(REOItems.SIGN_MAPLE.get()));
        this.add(REOBlocks.SIGN_MAPLE_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_MAPLE.get()));
        this.add(REOBlocks.SIGN_HANGING_MAPLE.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_MAPLE.get()));
        this.add(REOBlocks.SIGN_HANGING_MAPLE_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_MAPLE.get()));

        this.add(REOBlocks.DOOR_MAPLE.get(),
                block -> createDoorTable(REOBlocks.DOOR_MAPLE.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_MAPLE.get());


        this.dropSelf(REOBlocks.LOG_PALM.get());
        this.dropSelf(REOBlocks.WOOD_PALM.get());
        this.dropSelf(REOBlocks.LOG_PALM_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_PALM_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_PALM.get());

        this.dropSelf(REOBlocks.STAIRS_PALM.get());
        this.add(REOBlocks.SLAB_PALM.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PALM.get()));
        this.dropSelf(REOBlocks.FENCE_PALM.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PALM.get());

        this.dropSelf(REOBlocks.BUTTON_PALM.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_PALM.get());

        this.dropSelf(REOBlocks.SAPLING_PALM.get());
        this.add(REOBlocks.POTTED_SAPLING_PALM.get(), createPotFlowerItemTable(REOBlocks.SAPLING_PALM.get()));
        this.add(REOBlocks.LEAVES_PALM.get(),
                createModLeavesDrops(REOBlocks.LEAVES_PALM.get(), REOBlocks.SAPLING_PALM.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_PALM.get(), block ->
                createSingleItemTable(REOItems.SIGN_PALM.get()));
        this.add(REOBlocks.SIGN_PALM_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_PALM.get()));
        this.add(REOBlocks.SIGN_HANGING_PALM.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PALM.get()));
        this.add(REOBlocks.SIGN_HANGING_PALM_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PALM.get()));

        this.add(REOBlocks.DOOR_PALM.get(),
                block -> createDoorTable(REOBlocks.DOOR_PALM.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_PALM.get());


        this.dropSelf(REOBlocks.LOG_PAPAYA.get());
        this.dropSelf(REOBlocks.WOOD_PAPAYA.get());
        this.dropSelf(REOBlocks.LOG_PAPAYA_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_PAPAYA_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_PAPAYA.get());

        this.dropSelf(REOBlocks.STAIRS_PAPAYA.get());
        this.add(REOBlocks.SLAB_PAPAYA.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PAPAYA.get()));
        this.dropSelf(REOBlocks.FENCE_PAPAYA.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PAPAYA.get());

        this.dropSelf(REOBlocks.BUTTON_PAPAYA.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_PAPAYA.get());

        this.dropSelf(REOBlocks.SAPLING_PAPAYA.get());
        this.add(REOBlocks.POTTED_SAPLING_PAPAYA.get(), createPotFlowerItemTable(REOBlocks.SAPLING_PAPAYA.get()));
        this.add(REOBlocks.LEAVES_PAPAYA.get(),
                createModLeavesDrops(REOBlocks.LEAVES_PAPAYA.get(), REOBlocks.SAPLING_PAPAYA.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_PAPAYA_FRUIT.get(), REOItems.FOOD_PAPAYA.get());

        this.add(REOBlocks.SIGN_PAPAYA.get(), block ->
                createSingleItemTable(REOItems.SIGN_PAPAYA.get()));
        this.add(REOBlocks.SIGN_PAPAYA_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_PAPAYA.get()));
        this.add(REOBlocks.SIGN_HANGING_PAPAYA.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PAPAYA.get()));
        this.add(REOBlocks.SIGN_HANGING_PAPAYA_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PAPAYA.get()));

        this.add(REOBlocks.DOOR_PAPAYA.get(),
                block -> createDoorTable(REOBlocks.DOOR_PAPAYA.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_PAPAYA.get());


        this.dropSelf(REOBlocks.LOG_PINE.get());
        this.dropSelf(REOBlocks.WOOD_PINE.get());
        this.dropSelf(REOBlocks.LOG_PINE_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_PINE_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_PINE.get());

        this.dropSelf(REOBlocks.STAIRS_PINE.get());
        this.add(REOBlocks.SLAB_PINE.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PINE.get()));
        this.dropSelf(REOBlocks.FENCE_PINE.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PINE.get());

        this.dropSelf(REOBlocks.BUTTON_PINE.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_PINE.get());

        this.dropSelf(REOBlocks.SAPLING_PINE.get());
        this.add(REOBlocks.POTTED_SAPLING_PINE.get(), createPotFlowerItemTable(REOBlocks.SAPLING_PINE.get()));
        this.add(REOBlocks.LEAVES_PINE.get(),
                createModLeavesDrops(REOBlocks.LEAVES_PINE.get(), REOBlocks.SAPLING_PINE.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_PINE.get(), block ->
                createSingleItemTable(REOItems.SIGN_PINE.get()));
        this.add(REOBlocks.SIGN_PINE_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_PINE.get()));
        this.add(REOBlocks.SIGN_HANGING_PINE.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PINE.get()));
        this.add(REOBlocks.SIGN_HANGING_PINE_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PINE.get()));

        this.add(REOBlocks.DOOR_PINE.get(),
                block -> createDoorTable(REOBlocks.DOOR_PINE.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_PINE.get());


        this.dropSelf(REOBlocks.LOG_PLUM.get());
        this.dropSelf(REOBlocks.WOOD_PLUM.get());
        this.dropSelf(REOBlocks.LOG_PLUM_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_PLUM_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_PLUM.get());

        this.dropSelf(REOBlocks.STAIRS_PLUM.get());
        this.add(REOBlocks.SLAB_PLUM.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PLUM.get()));
        this.dropSelf(REOBlocks.FENCE_PLUM.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PLUM.get());

        this.dropSelf(REOBlocks.BUTTON_PLUM.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_PLUM.get());

        this.dropSelf(REOBlocks.SAPLING_PLUM.get());
        this.add(REOBlocks.POTTED_SAPLING_PLUM.get(), createPotFlowerItemTable(REOBlocks.SAPLING_PLUM.get()));
        this.add(REOBlocks.LEAVES_PLUM.get(),
                createModLeavesDrops(REOBlocks.LEAVES_PLUM.get(), REOBlocks.SAPLING_PLUM.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_PLUM_FRUIT.get(), REOItems.FOOD_PLUM.get());

        this.add(REOBlocks.SIGN_PLUM.get(), block ->
                createSingleItemTable(REOItems.SIGN_PLUM.get()));
        this.add(REOBlocks.SIGN_PLUM_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_PLUM.get()));
        this.add(REOBlocks.SIGN_HANGING_PLUM.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PLUM.get()));
        this.add(REOBlocks.SIGN_HANGING_PLUM_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_PLUM.get()));

        this.add(REOBlocks.DOOR_PLUM.get(),
                block -> createDoorTable(REOBlocks.DOOR_PLUM.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_PLUM.get());


        this.dropSelf(REOBlocks.LOG_POPLAR.get());
        this.dropSelf(REOBlocks.WOOD_POPLAR.get());
        this.dropSelf(REOBlocks.LOG_POPLAR_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_POPLAR_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_POPLAR.get());

        this.dropSelf(REOBlocks.STAIRS_POPLAR.get());
        this.add(REOBlocks.SLAB_POPLAR.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_POPLAR.get()));
        this.dropSelf(REOBlocks.FENCE_POPLAR.get());
        this.dropSelf(REOBlocks.FENCE_GATE_POPLAR.get());

        this.dropSelf(REOBlocks.BUTTON_POPLAR.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_POPLAR.get());

        this.dropSelf(REOBlocks.SAPLING_POPLAR.get());
        this.add(REOBlocks.POTTED_SAPLING_POPLAR.get(), createPotFlowerItemTable(REOBlocks.SAPLING_POPLAR.get()));
        this.add(REOBlocks.LEAVES_POPLAR.get(),
                createModLeavesDrops(REOBlocks.LEAVES_POPLAR.get(), REOBlocks.SAPLING_POPLAR.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_POPLAR.get(), block ->
                createSingleItemTable(REOItems.SIGN_POPLAR.get()));
        this.add(REOBlocks.SIGN_POPLAR_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_POPLAR.get()));
        this.add(REOBlocks.SIGN_HANGING_POPLAR.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_POPLAR.get()));
        this.add(REOBlocks.SIGN_HANGING_POPLAR_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_POPLAR.get()));

        this.add(REOBlocks.DOOR_POPLAR.get(),
                block -> createDoorTable(REOBlocks.DOOR_POPLAR.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_POPLAR.get());

        this.dropSelf(REOBlocks.LOG_REDWOOD.get());
        this.dropSelf(REOBlocks.WOOD_REDWOOD.get());
        this.dropSelf(REOBlocks.LOG_REDWOOD_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_REDWOOD_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_REDWOOD.get());

        this.dropSelf(REOBlocks.STAIRS_REDWOOD.get());
        this.add(REOBlocks.SLAB_REDWOOD.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_REDWOOD.get()));
        this.dropSelf(REOBlocks.FENCE_REDWOOD.get());
        this.dropSelf(REOBlocks.FENCE_GATE_REDWOOD.get());

        this.dropSelf(REOBlocks.BUTTON_REDWOOD.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_REDWOOD.get());

        this.dropSelf(REOBlocks.SAPLING_REDWOOD.get());
        this.add(REOBlocks.POTTED_SAPLING_REDWOOD.get(), createPotFlowerItemTable(REOBlocks.SAPLING_REDWOOD.get()));
        this.add(REOBlocks.LEAVES_REDWOOD.get(),
                createModLeavesDrops(REOBlocks.LEAVES_REDWOOD.get(), REOBlocks.SAPLING_REDWOOD.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_REDWOOD.get(), block ->
                createSingleItemTable(REOItems.SIGN_REDWOOD.get()));
        this.add(REOBlocks.SIGN_REDWOOD_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_REDWOOD.get()));
        this.add(REOBlocks.SIGN_HANGING_REDWOOD.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_REDWOOD.get()));
        this.add(REOBlocks.SIGN_HANGING_REDWOOD_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_REDWOOD.get()));

        this.add(REOBlocks.DOOR_REDWOOD.get(),
                block -> createDoorTable(REOBlocks.DOOR_REDWOOD.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_REDWOOD.get());



        this.dropSelf(REOBlocks.LOG_RUBBER.get());
        this.dropSelf(REOBlocks.LOG_RUBBER_SAP.get());
        this.dropSelf(REOBlocks.WOOD_RUBBER.get());
        this.dropSelf(REOBlocks.LOG_RUBBER_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_RUBBER_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_RUBBER.get());

        this.dropSelf(REOBlocks.STAIRS_RUBBER.get());
        this.add(REOBlocks.SLAB_RUBBER.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_RUBBER.get()));
        this.dropSelf(REOBlocks.FENCE_RUBBER.get());
        this.dropSelf(REOBlocks.FENCE_GATE_RUBBER.get());

        this.dropSelf(REOBlocks.BUTTON_RUBBER.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_RUBBER.get());

        this.dropSelf(REOBlocks.SAPLING_RUBBER.get());
        this.add(REOBlocks.POTTED_SAPLING_RUBBER.get(), createPotFlowerItemTable(REOBlocks.SAPLING_RUBBER.get()));
        this.add(REOBlocks.LEAVES_RUBBER.get(),
                createModLeavesDrops(REOBlocks.LEAVES_RUBBER.get(), REOBlocks.SAPLING_RUBBER.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_RUBBER.get(), block ->
                createSingleItemTable(REOItems.SIGN_RUBBER.get()));
        this.add(REOBlocks.SIGN_RUBBER_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_RUBBER.get()));
        this.add(REOBlocks.SIGN_HANGING_RUBBER.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_RUBBER.get()));
        this.add(REOBlocks.SIGN_HANGING_RUBBER_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_RUBBER.get()));

        this.add(REOBlocks.DOOR_RUBBER.get(),
                block -> createDoorTable(REOBlocks.DOOR_RUBBER.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_RUBBER.get());


        this.dropSelf(REOBlocks.LOG_TEAK.get());
        this.dropSelf(REOBlocks.WOOD_TEAK.get());
        this.dropSelf(REOBlocks.LOG_TEAK_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_TEAK_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_TEAK.get());

        this.dropSelf(REOBlocks.STAIRS_TEAK.get());
        this.add(REOBlocks.SLAB_TEAK.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_TEAK.get()));
        this.dropSelf(REOBlocks.FENCE_TEAK.get());
        this.dropSelf(REOBlocks.FENCE_GATE_TEAK.get());

        this.dropSelf(REOBlocks.BUTTON_TEAK.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_TEAK.get());

        this.dropSelf(REOBlocks.SAPLING_TEAK.get());
        this.add(REOBlocks.POTTED_SAPLING_TEAK.get(), createPotFlowerItemTable(REOBlocks.SAPLING_TEAK.get()));
        this.add(REOBlocks.LEAVES_TEAK.get(),
                createModLeavesDrops(REOBlocks.LEAVES_TEAK.get(), REOBlocks.SAPLING_TEAK.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_TEAK.get(), block ->
                createSingleItemTable(REOItems.SIGN_TEAK.get()));
        this.add(REOBlocks.SIGN_TEAK_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_TEAK.get()));
        this.add(REOBlocks.SIGN_HANGING_TEAK.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_TEAK.get()));
        this.add(REOBlocks.SIGN_HANGING_TEAK_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_TEAK.get()));

        this.add(REOBlocks.DOOR_TEAK.get(),
                block -> createDoorTable(REOBlocks.DOOR_TEAK.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_TEAK.get());


        this.dropSelf(REOBlocks.LOG_WALNUT.get());
        this.dropSelf(REOBlocks.WOOD_WALNUT.get());
        this.dropSelf(REOBlocks.LOG_WALNUT_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_WALNUT_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_WALNUT.get());

        this.dropSelf(REOBlocks.STAIRS_WALNUT.get());
        this.add(REOBlocks.SLAB_WALNUT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_WALNUT.get()));
        this.dropSelf(REOBlocks.FENCE_WALNUT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_WALNUT.get());

        this.dropSelf(REOBlocks.BUTTON_WALNUT.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_WALNUT.get());

        this.dropSelf(REOBlocks.SAPLING_WALNUT.get());
        this.add(REOBlocks.POTTED_SAPLING_WALNUT.get(), createPotFlowerItemTable(REOBlocks.SAPLING_WALNUT.get()));
        this.add(REOBlocks.LEAVES_WALNUT.get(),
                createModLeavesDrops(REOBlocks.LEAVES_WALNUT.get(), REOBlocks.SAPLING_WALNUT.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LEAVES_WALNUT_FRUIT.get(), REOItems.FOOD_WALNUT.get());

        this.add(REOBlocks.SIGN_WALNUT.get(), block ->
                createSingleItemTable(REOItems.SIGN_WALNUT.get()));
        this.add(REOBlocks.SIGN_WALNUT_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_WALNUT.get()));
        this.add(REOBlocks.SIGN_HANGING_WALNUT.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_WALNUT.get()));
        this.add(REOBlocks.SIGN_HANGING_WALNUT_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_WALNUT.get()));

        this.add(REOBlocks.DOOR_WALNUT.get(),
                block -> createDoorTable(REOBlocks.DOOR_WALNUT.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_WALNUT.get());


        this.dropSelf(REOBlocks.LOG_WILLOW.get());
        this.dropSelf(REOBlocks.WOOD_WILLOW.get());
        this.dropSelf(REOBlocks.LOG_WILLOW_STRIPPED.get());
        this.dropSelf(REOBlocks.WOOD_WILLOW_STRIPPED.get());
        this.dropSelf(REOBlocks.PLANKS_WILLOW.get());

        this.dropSelf(REOBlocks.STAIRS_WILLOW.get());
        this.add(REOBlocks.SLAB_WILLOW.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_WILLOW.get()));
        this.dropSelf(REOBlocks.FENCE_WILLOW.get());
        this.dropSelf(REOBlocks.FENCE_GATE_WILLOW.get());

        this.dropSelf(REOBlocks.BUTTON_WILLOW.get());
        this.dropSelf(REOBlocks.PRESSURE_PLATE_WILLOW.get());

        this.dropSelf(REOBlocks.SAPLING_WILLOW.get());
        this.add(REOBlocks.POTTED_SAPLING_WILLOW.get(), createPotFlowerItemTable(REOBlocks.SAPLING_WILLOW.get()));
        this.add(REOBlocks.LEAVES_WILLOW.get(),
                createModLeavesDrops(REOBlocks.LEAVES_WILLOW.get(), REOBlocks.SAPLING_WILLOW.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.SIGN_WILLOW.get(), block ->
                createSingleItemTable(REOItems.SIGN_WILLOW.get()));
        this.add(REOBlocks.SIGN_WILLOW_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_WILLOW.get()));
        this.add(REOBlocks.SIGN_HANGING_WILLOW.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_WILLOW.get()));
        this.add(REOBlocks.SIGN_HANGING_WILLOW_WALL.get(), block ->
                createSingleItemTable(REOItems.SIGN_HANGING_WILLOW.get()));

        this.add(REOBlocks.DOOR_WILLOW.get(),
                block -> createDoorTable(REOBlocks.DOOR_WILLOW.get()));
        this.dropSelf(REOBlocks.TRAPDOOR_WILLOW.get());


        // Wood - Fire Resistant
        this.dropSelf(REOBlocks.LOG_BALSA_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BALSA_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_BALSA_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_BALSA_RESISTANT.get());
        this.add(REOBlocks.SLAB_BALSA_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_BALSA_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_BALSA_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_BALSA_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_BAOBAB_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BAOBAB_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_BAOBAB_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_BAOBAB_RESISTANT.get());
        this.add(REOBlocks.SLAB_BAOBAB_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_BAOBAB_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_BAOBAB_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_BAOBAB_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_HILL_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_HILL_CHERRY_RESISTANT.get());
        this.add(REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_HILL_CHERRY_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_CHESTNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CHESTNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_CHESTNUT_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_CHESTNUT_RESISTANT.get());
        this.add(REOBlocks.SLAB_CHESTNUT_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_CHESTNUT_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_CHESTNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_CITRUS_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CITRUS_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_CITRUS_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_CITRUS_RESISTANT.get());
        this.add(REOBlocks.SLAB_CITRUS_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_CITRUS_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_CITRUS_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_CITRUS_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_EBONY_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_EBONY_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_EBONY_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_EBONY_RESISTANT.get());
        this.add(REOBlocks.SLAB_EBONY_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_EBONY_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_EBONY_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_EBONY_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_LARCH_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_LARCH_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_LARCH_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_LARCH_RESISTANT.get());
        this.add(REOBlocks.SLAB_LARCH_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_LARCH_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_LARCH_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_LARCH_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_LIME_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_LIME_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_LIME_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_LIME_RESISTANT.get());
        this.add(REOBlocks.SLAB_LIME_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_LIME_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_LIME_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_LIME_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_MAHOGANY_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MAHOGANY_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_MAHOGANY_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_MAHOGANY_RESISTANT.get());
        this.add(REOBlocks.SLAB_MAHOGANY_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_MAHOGANY_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_MAHOGANY_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_MAPLE_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MAPLE_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_MAPLE_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_MAPLE_RESISTANT.get());
        this.add(REOBlocks.SLAB_MAPLE_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_MAPLE_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_MAPLE_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_MAPLE_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_PALM_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PALM_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_PALM_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_PALM_RESISTANT.get());
        this.add(REOBlocks.SLAB_PALM_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PALM_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_PALM_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PALM_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_PAPAYA_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PAPAYA_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_PAPAYA_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_PAPAYA_RESISTANT.get());
        this.add(REOBlocks.SLAB_PAPAYA_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PAPAYA_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_PAPAYA_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PAPAYA_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_PINE_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PINE_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_PINE_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_PINE_RESISTANT.get());
        this.add(REOBlocks.SLAB_PINE_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PINE_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_PINE_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PINE_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_PLUM_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PLUM_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_PLUM_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_PLUM_RESISTANT.get());
        this.add(REOBlocks.SLAB_PLUM_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_PLUM_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_PLUM_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_PLUM_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_POPLAR_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_POPLAR_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_POPLAR_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_POPLAR_RESISTANT.get());
        this.add(REOBlocks.SLAB_POPLAR_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_POPLAR_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_POPLAR_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_POPLAR_RESISTANT.get());

        this.dropSelf(REOBlocks.LOG_REDWOOD_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_REDWOOD_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_REDWOOD_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_REDWOOD_RESISTANT.get());
        this.add(REOBlocks.SLAB_REDWOOD_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_REDWOOD_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_REDWOOD_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_REDWOOD_RESISTANT.get());



        this.dropSelf(REOBlocks.LOG_RUBBER_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_RUBBER_SAP_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_RUBBER_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_RUBBER_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_RUBBER_RESISTANT.get());
        this.add(REOBlocks.SLAB_RUBBER_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_RUBBER_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_RUBBER_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_RUBBER_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_TEAK_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_TEAK_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_TEAK_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_TEAK_RESISTANT.get());
        this.add(REOBlocks.SLAB_TEAK_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_TEAK_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_TEAK_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_TEAK_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_WALNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_WALNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_WALNUT_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_WALNUT_RESISTANT.get());
        this.add(REOBlocks.SLAB_WALNUT_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_WALNUT_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_WALNUT_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_WALNUT_RESISTANT.get());


        this.dropSelf(REOBlocks.LOG_WILLOW_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_WILLOW_RESISTANT.get());
        this.dropSelf(REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get());
        this.dropSelf(REOBlocks.PLANKS_WILLOW_RESISTANT.get());

        this.dropSelf(REOBlocks.STAIRS_WILLOW_RESISTANT.get());
        this.add(REOBlocks.SLAB_WILLOW_RESISTANT.get(),
                block -> createSlabItemTable(REOBlocks.SLAB_WILLOW_RESISTANT.get()));
        this.dropSelf(REOBlocks.FENCE_WILLOW_RESISTANT.get());
        this.dropSelf(REOBlocks.FENCE_GATE_WILLOW_RESISTANT.get());

        // Lamps
        this.dropSelf(REOBlocks.LAMP_BLACK.get());
        this.dropSelf(REOBlocks.LAMP_RED.get());
        this.dropSelf(REOBlocks.LAMP_GREEN.get());
        this.dropSelf(REOBlocks.LAMP_BROWN.get());
        this.dropSelf(REOBlocks.LAMP_PURPLE.get());
        this.dropSelf(REOBlocks.LAMP_CYAN.get());
        this.dropSelf(REOBlocks.LAMP_LIGHTGRAY.get());
        this.dropSelf(REOBlocks.LAMP_GRAY.get());
        this.dropSelf(REOBlocks.LAMP_PINK.get());
        this.dropSelf(REOBlocks.LAMP_LIME.get());
        this.dropSelf(REOBlocks.LAMP_YELLOW.get());
        this.dropSelf(REOBlocks.LAMP_BLUE.get());
        this.dropSelf(REOBlocks.LAMP_LIGHTBLUE.get());
        this.dropSelf(REOBlocks.LAMP_MAGENTA.get());
        this.dropSelf(REOBlocks.LAMP_ORANGE.get());
        this.dropSelf(REOBlocks.LAMP_WHITE.get());

        // Storage
        this.dropSelf(REOBlocks.BLOCK_ALUMINIUM.get());
        this.dropSelf(REOBlocks.BLOCK_BRASS.get());
        this.dropSelf(REOBlocks.BLOCK_BRONZE.get());
        this.dropSelf(REOBlocks.BLOCK_ELECTRUM.get());
        this.dropSelf(REOBlocks.BLOCK_ENDERITE.get());
        this.dropSelf(REOBlocks.BLOCK_LEAD.get());
        this.dropSelf(REOBlocks.BLOCK_NICKEL.get());
        this.dropSelf(REOBlocks.BLOCK_PERIDOT.get());
        this.dropSelf(REOBlocks.BLOCK_PLATINUM.get());
        this.dropSelf(REOBlocks.BLOCK_RUBY.get());
        this.dropSelf(REOBlocks.BLOCK_SAPPHIRE.get());
        this.dropSelf(REOBlocks.BLOCK_SILVER.get());
        this.dropSelf(REOBlocks.BLOCK_STEEL.get());
        this.dropSelf(REOBlocks.BLOCK_TIN.get());
        this.dropSelf(REOBlocks.BLOCK_URANIUM.get());
        this.dropSelf(REOBlocks.BLOCK_ZINC.get());


        // Budding
        this.dropOther(REOBlocks.BUDDING_PERIDOT.get(), Blocks.AIR);
        this.dropOther(REOBlocks.BUDDING_RUBY.get(), Blocks.AIR);
        this.dropOther(REOBlocks.BUDDING_SAPPHIRE.get(), Blocks.AIR);

        // Raw Storage
        this.dropSelf(REOBlocks.BLOCK_RAW_ALUMINIUM.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_ENDERITE.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_LEAD.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_NICKEL.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_PLATINUM.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_SILVER.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_TIN.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_URANIUM.get());
        this.dropSelf(REOBlocks.BLOCK_RAW_ZINC.get());

        // Overworld Ore
        this.add(REOBlocks.ORE_ALUMINIUM.get(),
                (block) -> createOreDrop(REOBlocks.ORE_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.ORE_LEAD.get(),
                (block) -> createOreDrop(REOBlocks.ORE_LEAD.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.ORE_NICKEL.get(),
                (block) -> createOreDrop(REOBlocks.ORE_NICKEL.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.ORE_PLATINUM.get(),
                (block) -> createOreDrop(REOBlocks.ORE_PLATINUM.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.ORE_SILVER.get(),
                (block) -> createOreDrop(REOBlocks.ORE_SILVER.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.ORE_TIN.get(),
                (block) -> createOreDrop(REOBlocks.ORE_TIN.get(), REOItems.RAW_TIN.get()));
        this.add(REOBlocks.ORE_URANIUM.get(),
                (block) -> createOreDrop(REOBlocks.ORE_URANIUM.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.ORE_ZINC.get(),
                (block) -> createOreDrop(REOBlocks.ORE_ZINC.get(), REOItems.RAW_ZINC.get()));

        // Cluster
        this.add(REOBlocks.CLUSTER_PERIDOT.get(),
                (block) -> createNetherOreDrops(REOBlocks.CLUSTER_PERIDOT.get(), REOItems.SHARD_PERIDOT.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_PERIDOT_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_PERIDOT_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_PERIDOT_BUD.get(), Blocks.AIR);

        this.add(REOBlocks.CLUSTER_RUBY.get(),
                (block) -> createNetherOreDrops(REOBlocks.CLUSTER_RUBY.get(), REOItems.SHARD_RUBY.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_RUBY_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_RUBY_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_RUBY_BUD.get(), Blocks.AIR);

        this.add(REOBlocks.CLUSTER_SAPPHIRE.get(),
                (block) -> createNetherOreDrops(REOBlocks.CLUSTER_SAPPHIRE.get(), REOItems.SHARD_SAPPHIRE.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_SAPPHIRE_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_SAPPHIRE_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_SAPPHIRE_BUD.get(), Blocks.AIR);

        // Gravel Ore
        this.add(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.GRAVEL_ORE_COAL.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_COAL.get(), Items.COAL));
        this.add(REOBlocks.GRAVEL_ORE_COPPER.get(),
                (block) -> createNetherOreDrops(REOBlocks.GRAVEL_ORE_COPPER.get(),Items.RAW_COPPER, 5f, 5f));
        this.add(REOBlocks.GRAVEL_ORE_DIAMOND.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_DIAMOND.get(), Items.DIAMOND));
        this.add(REOBlocks.GRAVEL_ORE_EMERALD.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_EMERALD.get(), Items.EMERALD));
        this.add(REOBlocks.GRAVEL_ORE_GOLD.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_GOLD.get(), Items.RAW_GOLD));
        this.add(REOBlocks.GRAVEL_ORE_IRON.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_IRON.get(), Items.RAW_IRON));
        this.add(REOBlocks.GRAVEL_ORE_LAPIS.get(),
                (block) -> createNetherOreDrops(REOBlocks.GRAVEL_ORE_LAPIS.get(),Items.LAPIS_LAZULI, 4f, 9f));
        this.add(REOBlocks.GRAVEL_ORE_LEAD.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_LEAD.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.GRAVEL_ORE_NICKEL.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_NICKEL.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_PLATINUM.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.GRAVEL_ORE_REDSTONE.get(),
                (block) -> createNetherOreDrops(REOBlocks.GRAVEL_ORE_REDSTONE.get(), Items.REDSTONE, 4f, 5f));
        this.add(REOBlocks.GRAVEL_ORE_SILVER.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_SILVER.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.GRAVEL_ORE_TIN.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_TIN.get(), REOItems.RAW_TIN.get()));
        this.add(REOBlocks.GRAVEL_ORE_URANIUM.get(),
                (block) -> createOreDrop(REOBlocks.GRAVEL_ORE_URANIUM.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.GRAVEL_ORE_ZINC.get(),
                (block) -> createOreDrop(REOBlocks.ORE_ZINC.get(), REOItems.RAW_ZINC.get()));

        // Deepslate Ore
        this.add(REOBlocks.DEEPSLATE_ALUMINIUM.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_ALUMINIUM.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.DEEPSLATE_LEAD.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_LEAD.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.DEEPSLATE_NICKEL.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_NICKEL.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.DEEPSLATE_PLATINUM.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_PLATINUM.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.DEEPSLATE_SILVER.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_SILVER.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.DEEPSLATE_URANIUM.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_URANIUM.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.DEEPSLATE_ZINC.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_ZINC.get(), REOItems.RAW_ZINC.get()));

        // Nether Ore
        this.add(REOBlocks.NETHER_ALUMINIUM.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_ALUMINIUM.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_COAL.get(),
                (block) -> createNetherOreDrops(block, Items.COAL, 1F, 4F));
        this.add(REOBlocks.NETHER_COPPER.get(),
                (block) -> createNetherOreDrops(block, Items.RAW_COPPER, 5F, 10F));
        this.add(REOBlocks.NETHER_DIAMOND.get(),
                (block) -> createNetherOreDrops(block, Items.DIAMOND, 1F, 2F));
        this.add(REOBlocks.NETHER_EMERALD.get(),
                (block) -> createNetherOreDrops(block, Items.EMERALD, 1F, 2F));
        this.add(REOBlocks.NETHER_IRON.get(),
                (block) -> createNetherOreDrops(block, Items.IRON_NUGGET, 2F, 6F));
        this.add(REOBlocks.NETHER_LAPIS.get(),
                (block) -> createNetherOreDrops(block, Items.LAPIS_LAZULI, 8F, 18F));
        this.add(REOBlocks.NETHER_LEAD.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_LEAD.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_NICKEL.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_NICKEL.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_PLATINUM.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_PLATINUM.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_REDSTONE.get(),
                (block) -> createNetherOreDrops(block, Items.REDSTONE, 8F, 10F));
        this.add(REOBlocks.NETHER_SILVER.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_SILVER.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_TIN.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_TIN.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_ZINC.get(),
                (block) -> createNetherOreDrops(block, REOItems.NUGGET_ZINC.get(), 2F, 6F));

        this.add(REOBlocks.NETHER_URANIUM.get(),
                (block) -> createOreDrop(REOBlocks.NETHER_URANIUM.get(), REOItems.RAW_URANIUM.get()));

        // End Ore
        this.add(REOBlocks.ORE_ENDERITE.get(),
                (block) -> createOreDrop(REOBlocks.ORE_ENDERITE.get(), REOItems.RAW_ENDERITE.get()));

        // Tech //
        // Machines
        // Coal
        this.dropSelf(REOBlocks.KILN.get());
        this.dropSelf(REOBlocks.CRUSHER.get());
        this.dropSelf(REOBlocks.EXTRACTOR.get());
        this.dropSelf(REOBlocks.PURIFIER.get());


        // Electric
        this.dropSelf(REOBlocks.ELECTRIC_FURNACE.get());
        this.dropSelf(REOBlocks.ELECTRIC_CRUSHER.get());
        this.dropSelf(REOBlocks.ELECTRIC_PURIFIER.get());
        this.dropSelf(REOBlocks.ELECTRIC_ALLOY_FURNACE.get());
        this.dropSelf(REOBlocks.ELECTRIC_SAWMILL.get());
        this.dropSelf(REOBlocks.ELECTRIC_EXTRACTOR.get());
        this.dropSelf(REOBlocks.ELECTRIC_COMPRESSOR.get());
        this.dropSelf(REOBlocks.ELECTRIC_CENTRIFUGE.get());
        this.dropSelf(REOBlocks.ELECTRIC_INDUCTION_FURNACE.get());
        this.dropSelf(REOBlocks.ELECTRIC_TRANSFUSER.get());


    }
    private void cropLootTable(Block pCrop, Item pSeeds, Item pResult, IntegerProperty pInteger, int maxAge) {
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(pCrop)
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(pInteger, maxAge));

        this.add(pCrop, createCropDrops(pCrop, pResult, pSeeds, lootitemcondition$builder));

    }

    protected LootTable.Builder createNetherOreDrops(Block pOre, Item pItem, float pMin, float pMax) {
        return createSilkTouchDispatchTable(pOre,
                this.applyExplosionDecay(pOre,
                        LootItem.lootTableItem(pItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(pMin, pMax)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createBerryBushDrops(Block pOre, Item pItem, float pMin, float pMax) {
        return createSilkTouchDispatchTable(pOre,
                this.applyExplosionDecay(pOre,
                        LootItem.lootTableItem(pItem)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(pMin, pMax)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createCobbleDrop(Block pBlock, Block pDroppedBlock) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(pDroppedBlock)
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.SILK_TOUCH))));
    }

    protected static LootTable.Builder createSilkTouchOrShearsTable(Block pBlock, LootPoolEntryContainer.Builder<?> pBuilder) {
        return createSelfDropDispatchTable(pBlock, SHEARS_OR_SILK_TOUCH, pBuilder);
    }

    protected LootTable.Builder createModLeavesDrops(Block pLeavesBlock, Block pSaplingBlock, float... pChances) {
        return createSilkTouchOrShearsTable(pLeavesBlock, this.applyExplosionCondition(pLeavesBlock, LootItem.lootTableItem(pSaplingBlock))
                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, pChances)))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .when(NO_SHEARS_OR_SILK_TOUCH)
                        .add(this.applyExplosionDecay(pLeavesBlock, LootItem.lootTableItem(Items.STICK)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F))))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, NORMAL_LEAVES_STICK_CHANCES))));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return REOBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}