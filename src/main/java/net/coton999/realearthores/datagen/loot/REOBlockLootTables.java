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
        this.cropLootTable(REOBlocks.BARLEY_CROP.get(), REOItems.BARLEY_SEED.get(),
                REOItems.BARLEY_PLANT.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.CAULIFLOWER_CROP.get(), REOItems.CAULIFLOWER_SEED.get(),
                REOItems.CAULIFLOWER.get(), CauliflowerBlock.AGE, CauliflowerBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.COTTON_CROP.get(), REOItems.COTTON_SEED.get(),
                REOItems.COTTON_PLANT.get(), CottonBlock.AGE, CottonBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.ONIONS_CROP.get(), REOItems.ONION.get(),
                REOItems.ONION.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.RICE_CROP.get(), REOItems.RICE_SEED.get(),
                REOItems.RICE_PLANT.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.TOMATO_CROP.get(), REOItems.TOMATO_SEED.get(),
                REOItems.TOMATO.get(), BarleyBlock.AGE, BarleyBlock.MAX_AGE);

        this.dropOther(REOBlocks.WILD_BARLEY.get(), REOItems.BARLEY_SEED.get());
        this.dropOther(REOBlocks.WILD_COTTON.get(), REOItems.COTTON_SEED.get());
        this.dropOther(REOBlocks.WILD_RICE.get(), REOItems.RICE_SEED.get());
        this.dropOther(REOBlocks.WILD_TOMATO.get(), REOItems.TOMATO_SEED.get());


        // Fruit //
        this.cropLootTable(REOBlocks.CITRUS_FRUIT.get(), REOItems.LEMON.get(),
                REOItems.LEMON.get(), CitrusBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.LIME_FRUIT.get(), REOItems.LIME.get(),
                REOItems.LIME.get(), LimeBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.PAPAYA_FRUIT.get(), REOItems.PAPAYA.get(),
                REOItems.PAPAYA.get(), PapayaBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.PEAR_FRUIT.get(), REOItems.PEAR.get(),
                REOItems.PEAR.get(), PearBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.PLUM_FRUIT.get(), REOItems.PLUM.get(),
                REOItems.PLUM.get(), PlumBlock.AGE, BarleyBlock.MAX_AGE);
        this.cropLootTable(REOBlocks.WALNUT_FRUIT.get(), REOItems.WALNUT.get(),
                REOItems.WALNUT.get(), WalnutBlock.AGE, BarleyBlock.MAX_AGE);

        // Berry //
        this.add(REOBlocks.BLACKBERRY_FRUIT.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BLACKBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BLACKBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.BLACKBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        this.add(REOBlocks.BLUEBERRY_FRUIT.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BLUEBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.BLUEBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.BLUEBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.BLUEBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        this.add(REOBlocks.RASPBERRY_FRUIT.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.RASPBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(REOItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(REOBlocks.RASPBERRY_FRUIT.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(REOItems.RASPBERRY.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                )));

        // Ore Crops


        // Wood
        // Vanilla
        this.dropSelf(REOBlocks.RESISTANT_OAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_OAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_OAK_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_OAK_STAIRS.get());
        this.add(REOBlocks.RESISTANT_OAK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_OAK_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_OAK_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_OAK_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_STAIRS.get());
        this.add(REOBlocks.RESISTANT_SPRUCE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_SPRUCE_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_BIRCH_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_BIRCH_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_BIRCH_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_BIRCH_STAIRS.get());
        this.add(REOBlocks.RESISTANT_BIRCH_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_BIRCH_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_BIRCH_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_STAIRS.get());
        this.add(REOBlocks.RESISTANT_JUNGLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_JUNGLE_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_ACACIA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_ACACIA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_ACACIA_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_ACACIA_STAIRS.get());
        this.add(REOBlocks.RESISTANT_ACACIA_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_ACACIA_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_ACACIA_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_STAIRS.get());
        this.add(REOBlocks.RESISTANT_DARK_OAK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_DARK_OAK_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_STAIRS.get());
        this.add(REOBlocks.RESISTANT_MANGROVE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_MANGROVE_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RESISTANT_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_CHERRY_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_CHERRY_STAIRS.get());
        this.add(REOBlocks.RESISTANT_CHERRY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_CHERRY_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_CHERRY_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_CHERRY_FENCE_GATE.get());

        this.dropSelf(REOBlocks.BALSA_LOG.get());
        this.dropSelf(REOBlocks.BALSA_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_BALSA_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_BALSA_WOOD.get());
        this.dropSelf(REOBlocks.BALSA_PLANKS.get());

        this.dropSelf(REOBlocks.BALSA_STAIRS.get());
        this.add(REOBlocks.BALSA_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.BALSA_SLAB.get()));
        this.dropSelf(REOBlocks.BALSA_FENCE.get());
        this.dropSelf(REOBlocks.BALSA_FENCE_GATE.get());

        this.dropSelf(REOBlocks.BALSA_BUTTON.get());
        this.dropSelf(REOBlocks.BALSA_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.BALSA_SAPLING.get());
        this.add(REOBlocks.POTTED_BALSA_SAPLING.get(), createPotFlowerItemTable(REOBlocks.BALSA_SAPLING.get()));
        this.add(REOBlocks.BALSA_LEAVES.get(),
                createModLeavesDrops(REOBlocks.BALSA_LEAVES.get(), REOBlocks.BALSA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.BALSA_SIGN.get(), block ->
                createSingleItemTable(REOItems.BALSA_SIGN.get()));
        this.add(REOBlocks.BALSA_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.BALSA_SIGN.get()));
        this.add(REOBlocks.BALSA_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.BALSA_HANGING_SIGN.get()));
        this.add(REOBlocks.BALSA_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.BALSA_HANGING_SIGN.get()));

        this.add(REOBlocks.BALSA_DOOR.get(),
                block -> createDoorTable(REOBlocks.BALSA_DOOR.get()));
        this.dropSelf(REOBlocks.BALSA_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_BALSA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_BALSA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_BALSA_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_BALSA_STAIRS.get());
        this.add(REOBlocks.RESISTANT_BALSA_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_BALSA_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_BALSA_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_BALSA_FENCE_GATE.get());

        this.dropSelf(REOBlocks.BAOBAB_LOG.get());
        this.dropSelf(REOBlocks.BAOBAB_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_BAOBAB_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_BAOBAB_WOOD.get());
        this.dropSelf(REOBlocks.BAOBAB_PLANKS.get());

        this.dropSelf(REOBlocks.BAOBAB_STAIRS.get());
        this.add(REOBlocks.BAOBAB_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.BAOBAB_SLAB.get()));
        this.dropSelf(REOBlocks.BAOBAB_FENCE.get());
        this.dropSelf(REOBlocks.BAOBAB_FENCE_GATE.get());

        this.dropSelf(REOBlocks.BAOBAB_BUTTON.get());
        this.dropSelf(REOBlocks.BAOBAB_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.BAOBAB_SAPLING.get());
        this.add(REOBlocks.POTTED_BAOBAB_SAPLING.get(), createPotFlowerItemTable(REOBlocks.BAOBAB_SAPLING.get()));
        this.add(REOBlocks.BAOBAB_LEAVES.get(),
                createModLeavesDrops(REOBlocks.BAOBAB_LEAVES.get(), REOBlocks.BAOBAB_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.BAOBAB_SIGN.get(), block ->
                createSingleItemTable(REOItems.BAOBAB_SIGN.get()));
        this.add(REOBlocks.BAOBAB_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.BAOBAB_SIGN.get()));
        this.add(REOBlocks.BAOBAB_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.BAOBAB_HANGING_SIGN.get()));
        this.add(REOBlocks.BAOBAB_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.BAOBAB_HANGING_SIGN.get()));

        this.add(REOBlocks.BAOBAB_DOOR.get(),
                block -> createDoorTable(REOBlocks.BAOBAB_DOOR.get()));
        this.dropSelf(REOBlocks.BAOBAB_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_STAIRS.get());
        this.add(REOBlocks.RESISTANT_BAOBAB_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_BAOBAB_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get());

        this.dropSelf(REOBlocks.HILL_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.HILL_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_HILL_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.HILL_CHERRY_PLANKS.get());

        this.dropSelf(REOBlocks.HILL_CHERRY_STAIRS.get());
        this.add(REOBlocks.HILL_CHERRY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.HILL_CHERRY_SLAB.get()));
        this.dropSelf(REOBlocks.HILL_CHERRY_FENCE.get());
        this.dropSelf(REOBlocks.HILL_CHERRY_FENCE_GATE.get());

        this.dropSelf(REOBlocks.HILL_CHERRY_BUTTON.get());
        this.dropSelf(REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.HILL_CHERRY_SAPLING.get());
        this.add(REOBlocks.POTTED_HILL_CHERRY_SAPLING.get(), createPotFlowerItemTable(REOBlocks.HILL_CHERRY_SAPLING.get()));
        this.add(REOBlocks.HILL_CHERRY_LEAVES.get(),
                createModLeavesDrops(REOBlocks.HILL_CHERRY_LEAVES.get(), REOBlocks.HILL_CHERRY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.HILL_CHERRY_SIGN.get(), block ->
                createSingleItemTable(REOItems.HILL_CHERRY_SIGN.get()));
        this.add(REOBlocks.HILL_CHERRY_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.HILL_CHERRY_SIGN.get()));
        this.add(REOBlocks.HILL_CHERRY_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.HILL_CHERRY_HANGING_SIGN.get()));
        this.add(REOBlocks.HILL_CHERRY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.HILL_CHERRY_HANGING_SIGN.get()));

        this.add(REOBlocks.HILL_CHERRY_DOOR.get(),
                block -> createDoorTable(REOBlocks.HILL_CHERRY_DOOR.get()));
        this.dropSelf(REOBlocks.HILL_CHERRY_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get());
        this.add(REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get());

        this.dropSelf(REOBlocks.CHESTNUT_LOG.get());
        this.dropSelf(REOBlocks.CHESTNUT_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_CHESTNUT_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_CHESTNUT_WOOD.get());
        this.dropSelf(REOBlocks.CHESTNUT_PLANKS.get());

        this.dropSelf(REOBlocks.CHESTNUT_STAIRS.get());
        this.add(REOBlocks.CHESTNUT_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.CHESTNUT_SLAB.get()));
        this.dropSelf(REOBlocks.CHESTNUT_FENCE.get());
        this.dropSelf(REOBlocks.CHESTNUT_FENCE_GATE.get());

        this.dropSelf(REOBlocks.CHESTNUT_BUTTON.get());
        this.dropSelf(REOBlocks.CHESTNUT_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.CHESTNUT_SAPLING.get());
        this.add(REOBlocks.POTTED_CHESTNUT_SAPLING.get(), createPotFlowerItemTable(REOBlocks.CHESTNUT_SAPLING.get()));
        this.add(REOBlocks.CHESTNUT_LEAVES.get(),
                createModLeavesDrops(REOBlocks.CHESTNUT_LEAVES.get(), REOBlocks.CHESTNUT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.CHESTNUT_FRUIT_LEAVES.get(), REOItems.CHESTNUT.get());

        this.add(REOBlocks.CHESTNUT_SIGN.get(), block ->
                createSingleItemTable(REOItems.CHESTNUT_SIGN.get()));
        this.add(REOBlocks.CHESTNUT_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.CHESTNUT_SIGN.get()));
        this.add(REOBlocks.CHESTNUT_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.CHESTNUT_HANGING_SIGN.get()));
        this.add(REOBlocks.CHESTNUT_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.CHESTNUT_HANGING_SIGN.get()));

        this.add(REOBlocks.CHESTNUT_DOOR.get(),
                block -> createDoorTable(REOBlocks.CHESTNUT_DOOR.get()));
        this.dropSelf(REOBlocks.CHESTNUT_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_STAIRS.get());
        this.add(REOBlocks.RESISTANT_CHESTNUT_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_CHESTNUT_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get());


        this.dropSelf(REOBlocks.CITRUS_LOG.get());
        this.dropSelf(REOBlocks.CITRUS_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_CITRUS_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_CITRUS_WOOD.get());
        this.dropSelf(REOBlocks.CITRUS_PLANKS.get());

        this.dropSelf(REOBlocks.CITRUS_STAIRS.get());
        this.add(REOBlocks.CITRUS_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.CITRUS_SLAB.get()));
        this.dropSelf(REOBlocks.CITRUS_FENCE.get());
        this.dropSelf(REOBlocks.CITRUS_FENCE_GATE.get());

        this.dropSelf(REOBlocks.CITRUS_BUTTON.get());
        this.dropSelf(REOBlocks.CITRUS_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.CITRUS_SAPLING.get());
        this.add(REOBlocks.POTTED_CITRUS_SAPLING.get(), createPotFlowerItemTable(REOBlocks.CITRUS_SAPLING.get()));
        this.add(REOBlocks.CITRUS_LEAVES.get(),
                createModLeavesDrops(REOBlocks.CITRUS_LEAVES.get(), REOBlocks.CITRUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.CITRUS_FRUIT_LEAVES.get(), REOItems.LEMON.get());

        this.add(REOBlocks.CITRUS_SIGN.get(), block ->
                createSingleItemTable(REOItems.CITRUS_SIGN.get()));
        this.add(REOBlocks.CITRUS_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.CITRUS_SIGN.get()));
        this.add(REOBlocks.CITRUS_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.CITRUS_HANGING_SIGN.get()));
        this.add(REOBlocks.CITRUS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.CITRUS_HANGING_SIGN.get()));

        this.add(REOBlocks.CITRUS_DOOR.get(),
                block -> createDoorTable(REOBlocks.CITRUS_DOOR.get()));
        this.dropSelf(REOBlocks.CITRUS_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_CITRUS_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_CITRUS_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_CITRUS_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_CITRUS_STAIRS.get());
        this.add(REOBlocks.RESISTANT_CITRUS_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_CITRUS_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_CITRUS_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get());


        this.dropSelf(REOBlocks.EBONY_LOG.get());
        this.dropSelf(REOBlocks.EBONY_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_EBONY_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_EBONY_WOOD.get());
        this.dropSelf(REOBlocks.EBONY_PLANKS.get());

        this.dropSelf(REOBlocks.EBONY_STAIRS.get());
        this.add(REOBlocks.EBONY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.EBONY_SLAB.get()));
        this.dropSelf(REOBlocks.EBONY_FENCE.get());
        this.dropSelf(REOBlocks.EBONY_FENCE_GATE.get());

        this.dropSelf(REOBlocks.EBONY_BUTTON.get());
        this.dropSelf(REOBlocks.EBONY_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.EBONY_SAPLING.get());
        this.add(REOBlocks.POTTED_EBONY_SAPLING.get(), createPotFlowerItemTable(REOBlocks.EBONY_SAPLING.get()));
        this.add(REOBlocks.EBONY_LEAVES.get(),
                createModLeavesDrops(REOBlocks.EBONY_LEAVES.get(), REOBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.EBONY_SIGN.get(), block ->
                createSingleItemTable(REOItems.EBONY_SIGN.get()));
        this.add(REOBlocks.EBONY_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.EBONY_SIGN.get()));
        this.add(REOBlocks.EBONY_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.EBONY_HANGING_SIGN.get()));
        this.add(REOBlocks.EBONY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.EBONY_HANGING_SIGN.get()));

        this.add(REOBlocks.EBONY_DOOR.get(),
                block -> createDoorTable(REOBlocks.EBONY_DOOR.get()));
        this.dropSelf(REOBlocks.EBONY_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_EBONY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_EBONY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_EBONY_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_EBONY_STAIRS.get());
        this.add(REOBlocks.RESISTANT_EBONY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_EBONY_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_EBONY_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_EBONY_FENCE_GATE.get());


        this.dropSelf(REOBlocks.LARCH_LOG.get());
        this.dropSelf(REOBlocks.LARCH_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_LARCH_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_LARCH_WOOD.get());
        this.dropSelf(REOBlocks.LARCH_PLANKS.get());

        this.dropSelf(REOBlocks.LARCH_STAIRS.get());
        this.add(REOBlocks.LARCH_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LARCH_SLAB.get()));
        this.dropSelf(REOBlocks.LARCH_FENCE.get());
        this.dropSelf(REOBlocks.LARCH_FENCE_GATE.get());

        this.dropSelf(REOBlocks.LARCH_BUTTON.get());
        this.dropSelf(REOBlocks.LARCH_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.LARCH_SAPLING.get());
        this.add(REOBlocks.POTTED_LARCH_SAPLING.get(), createPotFlowerItemTable(REOBlocks.LARCH_SAPLING.get()));
        this.add(REOBlocks.LARCH_LEAVES.get(),
                createModLeavesDrops(REOBlocks.LARCH_LEAVES.get(), REOBlocks.LARCH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.LARCH_SIGN.get(), block ->
                createSingleItemTable(REOItems.LARCH_SIGN.get()));
        this.add(REOBlocks.LARCH_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.LARCH_SIGN.get()));
        this.add(REOBlocks.LARCH_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.LARCH_HANGING_SIGN.get()));
        this.add(REOBlocks.LARCH_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.LARCH_HANGING_SIGN.get()));

        this.add(REOBlocks.LARCH_DOOR.get(),
                block -> createDoorTable(REOBlocks.LARCH_DOOR.get()));
        this.dropSelf(REOBlocks.LARCH_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_LARCH_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_LARCH_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_LARCH_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_LARCH_STAIRS.get());
        this.add(REOBlocks.RESISTANT_LARCH_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_LARCH_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_LARCH_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_LARCH_FENCE_GATE.get());


        this.dropSelf(REOBlocks.LIME_LOG.get());
        this.dropSelf(REOBlocks.LIME_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_LIME_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_LIME_WOOD.get());
        this.dropSelf(REOBlocks.LIME_PLANKS.get());

        this.dropSelf(REOBlocks.LIME_STAIRS.get());
        this.add(REOBlocks.LIME_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.LIME_SLAB.get()));
        this.dropSelf(REOBlocks.LIME_FENCE.get());
        this.dropSelf(REOBlocks.LIME_FENCE_GATE.get());

        this.dropSelf(REOBlocks.LIME_BUTTON.get());
        this.dropSelf(REOBlocks.LIME_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.LIME_SAPLING.get());
        this.add(REOBlocks.POTTED_LIME_SAPLING.get(), createPotFlowerItemTable(REOBlocks.LIME_SAPLING.get()));
        this.add(REOBlocks.LIME_LEAVES.get(),
                createModLeavesDrops(REOBlocks.LIME_LEAVES.get(), REOBlocks.LIME_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.LIME_FRUIT_LEAVES.get(), REOItems.LIME.get());

        this.add(REOBlocks.LIME_SIGN.get(), block ->
                createSingleItemTable(REOItems.LIME_SIGN.get()));
        this.add(REOBlocks.LIME_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.LIME_SIGN.get()));
        this.add(REOBlocks.LIME_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.LIME_HANGING_SIGN.get()));
        this.add(REOBlocks.LIME_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.LIME_HANGING_SIGN.get()));

        this.add(REOBlocks.LIME_DOOR.get(),
                block -> createDoorTable(REOBlocks.LIME_DOOR.get()));
        this.dropSelf(REOBlocks.LIME_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_LIME_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_LIME_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_LIME_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_LIME_STAIRS.get());
        this.add(REOBlocks.RESISTANT_LIME_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_LIME_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_LIME_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_LIME_FENCE_GATE.get());


        this.dropSelf(REOBlocks.MAHOGANY_LOG.get());
        this.dropSelf(REOBlocks.MAHOGANY_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_MAHOGANY_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_MAHOGANY_WOOD.get());
        this.dropSelf(REOBlocks.MAHOGANY_PLANKS.get());

        this.dropSelf(REOBlocks.MAHOGANY_STAIRS.get());
        this.add(REOBlocks.MAHOGANY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MAHOGANY_SLAB.get()));
        this.dropSelf(REOBlocks.MAHOGANY_FENCE.get());
        this.dropSelf(REOBlocks.MAHOGANY_FENCE_GATE.get());

        this.dropSelf(REOBlocks.MAHOGANY_BUTTON.get());
        this.dropSelf(REOBlocks.MAHOGANY_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.MAHOGANY_SAPLING.get());
        this.add(REOBlocks.POTTED_MAHOGANY_SAPLING.get(), createPotFlowerItemTable(REOBlocks.MAHOGANY_SAPLING.get()));
        this.add(REOBlocks.MAHOGANY_LEAVES.get(),
                createModLeavesDrops(REOBlocks.MAHOGANY_LEAVES.get(), REOBlocks.MAHOGANY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.MAHOGANY_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAHOGANY_SIGN.get()));
        this.add(REOBlocks.MAHOGANY_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAHOGANY_SIGN.get()));
        this.add(REOBlocks.MAHOGANY_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAHOGANY_HANGING_SIGN.get()));
        this.add(REOBlocks.MAHOGANY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAHOGANY_HANGING_SIGN.get()));

        this.add(REOBlocks.MAHOGANY_DOOR.get(),
                block -> createDoorTable(REOBlocks.MAHOGANY_DOOR.get()));
        this.dropSelf(REOBlocks.MAHOGANY_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_STAIRS.get());
        this.add(REOBlocks.RESISTANT_MAHOGANY_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_MAHOGANY_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get());


        this.dropSelf(REOBlocks.MAPLE_LOG.get());
        this.dropSelf(REOBlocks.MAPLE_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_MAPLE_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_MAPLE_WOOD.get());
        this.dropSelf(REOBlocks.MAPLE_PLANKS.get());

        this.dropSelf(REOBlocks.MAPLE_STAIRS.get());
        this.add(REOBlocks.MAPLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.MAPLE_SLAB.get()));
        this.dropSelf(REOBlocks.MAPLE_FENCE.get());
        this.dropSelf(REOBlocks.MAPLE_FENCE_GATE.get());

        this.dropSelf(REOBlocks.MAPLE_BUTTON.get());
        this.dropSelf(REOBlocks.MAPLE_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.MAPLE_SAPLING.get());
        this.add(REOBlocks.POTTED_MAPLE_SAPLING.get(), createPotFlowerItemTable(REOBlocks.MAPLE_SAPLING.get()));
        this.add(REOBlocks.MAPLE_LEAVES.get(),
                createModLeavesDrops(REOBlocks.MAPLE_LEAVES.get(), REOBlocks.MAPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.MAPLE_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAPLE_SIGN.get()));
        this.add(REOBlocks.MAPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAPLE_SIGN.get()));
        this.add(REOBlocks.MAPLE_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAPLE_HANGING_SIGN.get()));
        this.add(REOBlocks.MAPLE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.MAPLE_HANGING_SIGN.get()));

        this.add(REOBlocks.MAPLE_DOOR.get(),
                block -> createDoorTable(REOBlocks.MAPLE_DOOR.get()));
        this.dropSelf(REOBlocks.MAPLE_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_MAPLE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_MAPLE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_MAPLE_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_MAPLE_STAIRS.get());
        this.add(REOBlocks.RESISTANT_MAPLE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_MAPLE_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_MAPLE_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get());


        this.dropSelf(REOBlocks.PALM_LOG.get());
        this.dropSelf(REOBlocks.PALM_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_PALM_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_PALM_WOOD.get());
        this.dropSelf(REOBlocks.PALM_PLANKS.get());

        this.dropSelf(REOBlocks.PALM_STAIRS.get());
        this.add(REOBlocks.PALM_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.PALM_SLAB.get()));
        this.dropSelf(REOBlocks.PALM_FENCE.get());
        this.dropSelf(REOBlocks.PALM_FENCE_GATE.get());

        this.dropSelf(REOBlocks.PALM_BUTTON.get());
        this.dropSelf(REOBlocks.PALM_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.PALM_SAPLING.get());
        this.add(REOBlocks.POTTED_PALM_SAPLING.get(), createPotFlowerItemTable(REOBlocks.PALM_SAPLING.get()));
        this.add(REOBlocks.PALM_LEAVES.get(),
                createModLeavesDrops(REOBlocks.PALM_LEAVES.get(), REOBlocks.PALM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.PALM_SIGN.get(), block ->
                createSingleItemTable(REOItems.PALM_SIGN.get()));
        this.add(REOBlocks.PALM_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.PALM_SIGN.get()));
        this.add(REOBlocks.PALM_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PALM_HANGING_SIGN.get()));
        this.add(REOBlocks.PALM_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PALM_HANGING_SIGN.get()));

        this.add(REOBlocks.PALM_DOOR.get(),
                block -> createDoorTable(REOBlocks.PALM_DOOR.get()));
        this.dropSelf(REOBlocks.PALM_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_PALM_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_PALM_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_PALM_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_PALM_STAIRS.get());
        this.add(REOBlocks.RESISTANT_PALM_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_PALM_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_PALM_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_PALM_FENCE_GATE.get());


        this.dropSelf(REOBlocks.PAPAYA_LOG.get());
        this.dropSelf(REOBlocks.PAPAYA_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_PAPAYA_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_PAPAYA_WOOD.get());
        this.dropSelf(REOBlocks.PAPAYA_PLANKS.get());

        this.dropSelf(REOBlocks.PAPAYA_STAIRS.get());
        this.add(REOBlocks.PAPAYA_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.PAPAYA_SLAB.get()));
        this.dropSelf(REOBlocks.PAPAYA_FENCE.get());
        this.dropSelf(REOBlocks.PAPAYA_FENCE_GATE.get());

        this.dropSelf(REOBlocks.PAPAYA_BUTTON.get());
        this.dropSelf(REOBlocks.PAPAYA_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.PAPAYA_SAPLING.get());
        this.add(REOBlocks.POTTED_PAPAYA_SAPLING.get(), createPotFlowerItemTable(REOBlocks.PAPAYA_SAPLING.get()));
        this.add(REOBlocks.PAPAYA_LEAVES.get(),
                createModLeavesDrops(REOBlocks.PAPAYA_LEAVES.get(), REOBlocks.PAPAYA_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.PAPAYA_FRUIT_LEAVES.get(), REOItems.PAPAYA.get());

        this.add(REOBlocks.PAPAYA_SIGN.get(), block ->
                createSingleItemTable(REOItems.PAPAYA_SIGN.get()));
        this.add(REOBlocks.PAPAYA_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.PAPAYA_SIGN.get()));
        this.add(REOBlocks.PAPAYA_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PAPAYA_HANGING_SIGN.get()));
        this.add(REOBlocks.PAPAYA_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PAPAYA_HANGING_SIGN.get()));

        this.add(REOBlocks.PAPAYA_DOOR.get(),
                block -> createDoorTable(REOBlocks.PAPAYA_DOOR.get()));
        this.dropSelf(REOBlocks.PAPAYA_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_STAIRS.get());
        this.add(REOBlocks.RESISTANT_PAPAYA_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_PAPAYA_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get());


        this.dropSelf(REOBlocks.PINE_LOG.get());
        this.dropSelf(REOBlocks.PINE_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_PINE_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_PINE_WOOD.get());
        this.dropSelf(REOBlocks.PINE_PLANKS.get());

        this.dropSelf(REOBlocks.PINE_STAIRS.get());
        this.add(REOBlocks.PINE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.PINE_SLAB.get()));
        this.dropSelf(REOBlocks.PINE_FENCE.get());
        this.dropSelf(REOBlocks.PINE_FENCE_GATE.get());

        this.dropSelf(REOBlocks.PINE_BUTTON.get());
        this.dropSelf(REOBlocks.PINE_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.PINE_SAPLING.get());
        this.add(REOBlocks.POTTED_PINE_SAPLING.get(), createPotFlowerItemTable(REOBlocks.PINE_SAPLING.get()));
        this.add(REOBlocks.PINE_LEAVES.get(),
                createModLeavesDrops(REOBlocks.PINE_LEAVES.get(), REOBlocks.PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.PINE_SIGN.get(), block ->
                createSingleItemTable(REOItems.PINE_SIGN.get()));
        this.add(REOBlocks.PINE_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.PINE_SIGN.get()));
        this.add(REOBlocks.PINE_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PINE_HANGING_SIGN.get()));
        this.add(REOBlocks.PINE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PINE_HANGING_SIGN.get()));

        this.add(REOBlocks.PINE_DOOR.get(),
                block -> createDoorTable(REOBlocks.PINE_DOOR.get()));
        this.dropSelf(REOBlocks.PINE_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_PINE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_PINE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_PINE_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_PINE_STAIRS.get());
        this.add(REOBlocks.RESISTANT_PINE_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_PINE_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_PINE_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_PINE_FENCE_GATE.get());


        this.dropSelf(REOBlocks.PLUM_LOG.get());
        this.dropSelf(REOBlocks.PLUM_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_PLUM_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_PLUM_WOOD.get());
        this.dropSelf(REOBlocks.PLUM_PLANKS.get());

        this.dropSelf(REOBlocks.PLUM_STAIRS.get());
        this.add(REOBlocks.PLUM_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.PLUM_SLAB.get()));
        this.dropSelf(REOBlocks.PLUM_FENCE.get());
        this.dropSelf(REOBlocks.PLUM_FENCE_GATE.get());

        this.dropSelf(REOBlocks.PLUM_BUTTON.get());
        this.dropSelf(REOBlocks.PLUM_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.PLUM_SAPLING.get());
        this.add(REOBlocks.POTTED_PLUM_SAPLING.get(), createPotFlowerItemTable(REOBlocks.PLUM_SAPLING.get()));
        this.add(REOBlocks.PLUM_LEAVES.get(),
                createModLeavesDrops(REOBlocks.PLUM_LEAVES.get(), REOBlocks.PLUM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.PLUM_FRUIT_LEAVES.get(), REOItems.PLUM.get());

        this.add(REOBlocks.PLUM_SIGN.get(), block ->
                createSingleItemTable(REOItems.PLUM_SIGN.get()));
        this.add(REOBlocks.PLUM_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.PLUM_SIGN.get()));
        this.add(REOBlocks.PLUM_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PLUM_HANGING_SIGN.get()));
        this.add(REOBlocks.PLUM_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.PLUM_HANGING_SIGN.get()));

        this.add(REOBlocks.PLUM_DOOR.get(),
                block -> createDoorTable(REOBlocks.PLUM_DOOR.get()));
        this.dropSelf(REOBlocks.PLUM_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_PLUM_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_PLUM_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_PLUM_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_PLUM_STAIRS.get());
        this.add(REOBlocks.RESISTANT_PLUM_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_PLUM_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_PLUM_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_PLUM_FENCE_GATE.get());


        this.dropSelf(REOBlocks.POPLAR_LOG.get());
        this.dropSelf(REOBlocks.POPLAR_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_POPLAR_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_POPLAR_WOOD.get());
        this.dropSelf(REOBlocks.POPLAR_PLANKS.get());

        this.dropSelf(REOBlocks.POPLAR_STAIRS.get());
        this.add(REOBlocks.POPLAR_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.POPLAR_SLAB.get()));
        this.dropSelf(REOBlocks.POPLAR_FENCE.get());
        this.dropSelf(REOBlocks.POPLAR_FENCE_GATE.get());

        this.dropSelf(REOBlocks.POPLAR_BUTTON.get());
        this.dropSelf(REOBlocks.POPLAR_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.POPLAR_SAPLING.get());
        this.add(REOBlocks.POTTED_POPLAR_SAPLING.get(), createPotFlowerItemTable(REOBlocks.POPLAR_SAPLING.get()));
        this.add(REOBlocks.POPLAR_LEAVES.get(),
                createModLeavesDrops(REOBlocks.POPLAR_LEAVES.get(), REOBlocks.POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.POPLAR_SIGN.get(), block ->
                createSingleItemTable(REOItems.POPLAR_SIGN.get()));
        this.add(REOBlocks.POPLAR_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.POPLAR_SIGN.get()));
        this.add(REOBlocks.POPLAR_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.POPLAR_HANGING_SIGN.get()));
        this.add(REOBlocks.POPLAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.POPLAR_HANGING_SIGN.get()));

        this.add(REOBlocks.POPLAR_DOOR.get(),
                block -> createDoorTable(REOBlocks.POPLAR_DOOR.get()));
        this.dropSelf(REOBlocks.POPLAR_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_POPLAR_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_POPLAR_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_POPLAR_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_POPLAR_STAIRS.get());
        this.add(REOBlocks.RESISTANT_POPLAR_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_POPLAR_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_POPLAR_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get());


        this.dropSelf(REOBlocks.REDWOOD_LOG.get());
        this.dropSelf(REOBlocks.REDWOOD_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_REDWOOD_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_REDWOOD_WOOD.get());
        this.dropSelf(REOBlocks.REDWOOD_PLANKS.get());

        this.dropSelf(REOBlocks.REDWOOD_STAIRS.get());
        this.add(REOBlocks.REDWOOD_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.REDWOOD_SLAB.get()));
        this.dropSelf(REOBlocks.REDWOOD_FENCE.get());
        this.dropSelf(REOBlocks.REDWOOD_FENCE_GATE.get());

        this.dropSelf(REOBlocks.REDWOOD_BUTTON.get());
        this.dropSelf(REOBlocks.REDWOOD_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.REDWOOD_SAPLING.get());
        this.add(REOBlocks.POTTED_REDWOOD_SAPLING.get(), createPotFlowerItemTable(REOBlocks.REDWOOD_SAPLING.get()));
        this.add(REOBlocks.REDWOOD_LEAVES.get(),
                createModLeavesDrops(REOBlocks.REDWOOD_LEAVES.get(), REOBlocks.REDWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.REDWOOD_SIGN.get(), block ->
                createSingleItemTable(REOItems.REDWOOD_SIGN.get()));
        this.add(REOBlocks.REDWOOD_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.REDWOOD_SIGN.get()));
        this.add(REOBlocks.REDWOOD_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.REDWOOD_HANGING_SIGN.get()));
        this.add(REOBlocks.REDWOOD_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.REDWOOD_HANGING_SIGN.get()));

        this.add(REOBlocks.REDWOOD_DOOR.get(),
                block -> createDoorTable(REOBlocks.REDWOOD_DOOR.get()));
        this.dropSelf(REOBlocks.REDWOOD_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_STAIRS.get());
        this.add(REOBlocks.RESISTANT_REDWOOD_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_REDWOOD_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get());


        this.dropSelf(REOBlocks.RUBBER_LOG.get());
        this.dropSelf(REOBlocks.RUBBER_LOG_SAP.get());
        this.dropSelf(REOBlocks.RUBBER_WOOD.get());
        this.dropSelf(REOBlocks.RUBBER_WOOD_SAP.get());
        this.dropSelf(REOBlocks.STRIPPED_RUBBER_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_RUBBER_WOOD.get());
        this.dropSelf(REOBlocks.RUBBER_PLANKS.get());

        this.dropSelf(REOBlocks.RUBBER_STAIRS.get());
        this.add(REOBlocks.RUBBER_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RUBBER_SLAB.get()));
        this.dropSelf(REOBlocks.RUBBER_FENCE.get());
        this.dropSelf(REOBlocks.RUBBER_FENCE_GATE.get());

        this.dropSelf(REOBlocks.RUBBER_BUTTON.get());
        this.dropSelf(REOBlocks.RUBBER_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.RUBBER_SAPLING.get());
        this.add(REOBlocks.POTTED_RUBBER_SAPLING.get(), createPotFlowerItemTable(REOBlocks.RUBBER_SAPLING.get()));
        this.add(REOBlocks.RUBBER_LEAVES.get(),
                createModLeavesDrops(REOBlocks.RUBBER_LEAVES.get(), REOBlocks.RUBBER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.RUBBER_SIGN.get(), block ->
                createSingleItemTable(REOItems.RUBBER_SIGN.get()));
        this.add(REOBlocks.RUBBER_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.RUBBER_SIGN.get()));
        this.add(REOBlocks.RUBBER_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.RUBBER_HANGING_SIGN.get()));
        this.add(REOBlocks.RUBBER_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.RUBBER_HANGING_SIGN.get()));

        this.add(REOBlocks.RUBBER_DOOR.get(),
                block -> createDoorTable(REOBlocks.RUBBER_DOOR.get()));
        this.dropSelf(REOBlocks.RUBBER_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_RUBBER_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_RUBBER_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_RUBBER_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_RUBBER_STAIRS.get());
        this.add(REOBlocks.RESISTANT_RUBBER_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_RUBBER_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_RUBBER_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get());


        this.dropSelf(REOBlocks.TEAK_LOG.get());
        this.dropSelf(REOBlocks.TEAK_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_TEAK_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_TEAK_WOOD.get());
        this.dropSelf(REOBlocks.TEAK_PLANKS.get());

        this.dropSelf(REOBlocks.TEAK_STAIRS.get());
        this.add(REOBlocks.TEAK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.TEAK_SLAB.get()));
        this.dropSelf(REOBlocks.TEAK_FENCE.get());
        this.dropSelf(REOBlocks.TEAK_FENCE_GATE.get());

        this.dropSelf(REOBlocks.TEAK_BUTTON.get());
        this.dropSelf(REOBlocks.TEAK_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.TEAK_SAPLING.get());
        this.add(REOBlocks.POTTED_TEAK_SAPLING.get(), createPotFlowerItemTable(REOBlocks.TEAK_SAPLING.get()));
        this.add(REOBlocks.TEAK_LEAVES.get(),
                createModLeavesDrops(REOBlocks.TEAK_LEAVES.get(), REOBlocks.TEAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.TEAK_SIGN.get(), block ->
                createSingleItemTable(REOItems.TEAK_SIGN.get()));
        this.add(REOBlocks.TEAK_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.TEAK_SIGN.get()));
        this.add(REOBlocks.TEAK_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.TEAK_HANGING_SIGN.get()));
        this.add(REOBlocks.TEAK_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.TEAK_HANGING_SIGN.get()));

        this.add(REOBlocks.TEAK_DOOR.get(),
                block -> createDoorTable(REOBlocks.TEAK_DOOR.get()));
        this.dropSelf(REOBlocks.TEAK_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_TEAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_TEAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_TEAK_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_TEAK_STAIRS.get());
        this.add(REOBlocks.RESISTANT_TEAK_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_TEAK_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_TEAK_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_TEAK_FENCE_GATE.get());


        this.dropSelf(REOBlocks.WALNUT_LOG.get());
        this.dropSelf(REOBlocks.WALNUT_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_WALNUT_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_WALNUT_WOOD.get());
        this.dropSelf(REOBlocks.WALNUT_PLANKS.get());

        this.dropSelf(REOBlocks.WALNUT_STAIRS.get());
        this.add(REOBlocks.WALNUT_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.WALNUT_SLAB.get()));
        this.dropSelf(REOBlocks.WALNUT_FENCE.get());
        this.dropSelf(REOBlocks.WALNUT_FENCE_GATE.get());

        this.dropSelf(REOBlocks.WALNUT_BUTTON.get());
        this.dropSelf(REOBlocks.WALNUT_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.WALNUT_SAPLING.get());
        this.add(REOBlocks.POTTED_WALNUT_SAPLING.get(), createPotFlowerItemTable(REOBlocks.WALNUT_SAPLING.get()));
        this.add(REOBlocks.WALNUT_LEAVES.get(),
                createModLeavesDrops(REOBlocks.WALNUT_LEAVES.get(), REOBlocks.WALNUT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropOther(REOBlocks.WALNUT_FRUIT_LEAVES.get(), REOItems.WALNUT.get());

        this.add(REOBlocks.WALNUT_SIGN.get(), block ->
                createSingleItemTable(REOItems.WALNUT_SIGN.get()));
        this.add(REOBlocks.WALNUT_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.WALNUT_SIGN.get()));
        this.add(REOBlocks.WALNUT_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.WALNUT_HANGING_SIGN.get()));
        this.add(REOBlocks.WALNUT_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.WALNUT_HANGING_SIGN.get()));

        this.add(REOBlocks.WALNUT_DOOR.get(),
                block -> createDoorTable(REOBlocks.WALNUT_DOOR.get()));
        this.dropSelf(REOBlocks.WALNUT_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_WALNUT_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_WALNUT_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_WALNUT_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_WALNUT_STAIRS.get());
        this.add(REOBlocks.RESISTANT_WALNUT_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_WALNUT_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_WALNUT_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get());


        this.dropSelf(REOBlocks.WILLOW_LOG.get());
        this.dropSelf(REOBlocks.WILLOW_WOOD.get());
        this.dropSelf(REOBlocks.STRIPPED_WILLOW_LOG.get());
        this.dropSelf(REOBlocks.STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(REOBlocks.WILLOW_PLANKS.get());

        this.dropSelf(REOBlocks.WILLOW_STAIRS.get());
        this.add(REOBlocks.WILLOW_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.WILLOW_SLAB.get()));
        this.dropSelf(REOBlocks.WILLOW_FENCE.get());
        this.dropSelf(REOBlocks.WILLOW_FENCE_GATE.get());

        this.dropSelf(REOBlocks.WILLOW_BUTTON.get());
        this.dropSelf(REOBlocks.WILLOW_PRESSURE_PLATE.get());

        this.dropSelf(REOBlocks.WILLOW_SAPLING.get());
        this.add(REOBlocks.POTTED_WILLOW_SAPLING.get(), createPotFlowerItemTable(REOBlocks.WILLOW_SAPLING.get()));
        this.add(REOBlocks.WILLOW_LEAVES.get(),
                createModLeavesDrops(REOBlocks.WILLOW_LEAVES.get(), REOBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(REOBlocks.WILLOW_SIGN.get(), block ->
                createSingleItemTable(REOItems.WILLOW_SIGN.get()));
        this.add(REOBlocks.WILLOW_WALL_SIGN.get(), block ->
                createSingleItemTable(REOItems.WILLOW_SIGN.get()));
        this.add(REOBlocks.WILLOW_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.WILLOW_HANGING_SIGN.get()));
        this.add(REOBlocks.WILLOW_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(REOItems.WILLOW_HANGING_SIGN.get()));

        this.add(REOBlocks.WILLOW_DOOR.get(),
                block -> createDoorTable(REOBlocks.WILLOW_DOOR.get()));
        this.dropSelf(REOBlocks.WILLOW_TRAPDOOR.get());

        this.dropSelf(REOBlocks.RESISTANT_WILLOW_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_WILLOW_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get());
        this.dropSelf(REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get());
        this.dropSelf(REOBlocks.RESISTANT_WILLOW_PLANKS.get());

        this.dropSelf(REOBlocks.RESISTANT_WILLOW_STAIRS.get());
        this.add(REOBlocks.RESISTANT_WILLOW_SLAB.get(),
                block -> createSlabItemTable(REOBlocks.RESISTANT_WILLOW_SLAB.get()));
        this.dropSelf(REOBlocks.RESISTANT_WILLOW_FENCE.get());
        this.dropSelf(REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get());


        // Lamps
        this.dropSelf(REOBlocks.BLACK_LAMP.get());
        this.dropSelf(REOBlocks.RED_LAMP.get());
        this.dropSelf(REOBlocks.GREEN_LAMP.get());
        this.dropSelf(REOBlocks.BROWN_LAMP.get());
        this.dropSelf(REOBlocks.PURPLE_LAMP.get());
        this.dropSelf(REOBlocks.CYAN_LAMP.get());
        this.dropSelf(REOBlocks.LIGHT_GRAY_LAMP.get());
        this.dropSelf(REOBlocks.GRAY_LAMP.get());
        this.dropSelf(REOBlocks.PINK_LAMP.get());
        this.dropSelf(REOBlocks.LIME_LAMP.get());
        this.dropSelf(REOBlocks.YELLOW_LAMP.get());
        this.dropSelf(REOBlocks.BLUE_LAMP.get());
        this.dropSelf(REOBlocks.LIGHT_BLUE_LAMP.get());
        this.dropSelf(REOBlocks.MAGENTA_LAMP.get());
        this.dropSelf(REOBlocks.ORANGE_LAMP.get());
        this.dropSelf(REOBlocks.WHITE_LAMP.get());

        // Storage
        this.dropSelf(REOBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(REOBlocks.BRASS_BLOCK.get());
        this.dropSelf(REOBlocks.BRONZE_BLOCK.get());
        this.dropSelf(REOBlocks.ELECTRUM_BLOCK.get());
        this.dropSelf(REOBlocks.ENDERITE_BLOCK.get());
        this.dropSelf(REOBlocks.LEAD_BLOCK.get());
        this.dropSelf(REOBlocks.NICKEL_BLOCK.get());
        this.dropSelf(REOBlocks.PERIDOT_BLOCK.get());
        this.dropSelf(REOBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(REOBlocks.RUBY_BLOCK.get());
        this.dropSelf(REOBlocks.SAPPHIRE_BLOCK.get());
        this.dropSelf(REOBlocks.SILVER_BLOCK.get());
        this.dropSelf(REOBlocks.STEEL_BLOCK.get());
        this.dropSelf(REOBlocks.TIN_BLOCK.get());
        this.dropSelf(REOBlocks.URANIUM_BLOCK.get());
        this.dropSelf(REOBlocks.ZINC_BLOCK.get());


        // Budding
        this.dropOther(REOBlocks.BUDDING_PERIDOT.get(), Blocks.AIR);
        this.dropOther(REOBlocks.BUDDING_RUBY.get(), Blocks.AIR);
        this.dropOther(REOBlocks.BUDDING_SAPPHIRE.get(), Blocks.AIR);

        // Raw Storage
        this.dropSelf(REOBlocks.RAW_ALUMINIUM_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_ENDERITE_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_NICKEL_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_PLATINUM_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_URANIUM_BLOCK.get());
        this.dropSelf(REOBlocks.RAW_ZINC_BLOCK.get());

        // Overworld Ore
        this.add(REOBlocks.ALUMINUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.ALUMINUM_ORE.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.LEAD_ORE.get(),
                (block) -> createOreDrop(REOBlocks.LEAD_ORE.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.NICKEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.NICKEL_ORE.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.PLATINUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.PLATINUM_ORE.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.SILVER_ORE.get(),
                (block) -> createOreDrop(REOBlocks.SILVER_ORE.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.TIN_ORE.get(),
                (block) -> createOreDrop(REOBlocks.TIN_ORE.get(), REOItems.RAW_TIN.get()));
        this.add(REOBlocks.URANIUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.URANIUM_ORE.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.ZINC_ORE.get(),
                (block) -> createOreDrop(REOBlocks.ZINC_ORE.get(), REOItems.RAW_ZINC.get()));

        // Cluster
        this.add(REOBlocks.PERIDOT_CLUSTER.get(),
                (block) -> createNetherOreDrops(REOBlocks.PERIDOT_CLUSTER.get(), REOItems.PERIDOT_SHARD.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_PERIDOT_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_PERIDOT_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_PERIDOT_BUD.get(), Blocks.AIR);

        this.add(REOBlocks.RUBY_CLUSTER.get(),
                (block) -> createNetherOreDrops(REOBlocks.RUBY_CLUSTER.get(), REOItems.RUBY_SHARD.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_RUBY_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_RUBY_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_RUBY_BUD.get(), Blocks.AIR);

        this.add(REOBlocks.SAPPHIRE_CLUSTER.get(),
                (block) -> createNetherOreDrops(REOBlocks.SAPPHIRE_CLUSTER.get(), REOItems.SAPPHIRE_SHARD.get(), 4f, 4f));
        this.dropOther(REOBlocks.LARGE_SAPPHIRE_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.MEDIUM_SAPPHIRE_BUD.get(), Blocks.AIR);
        this.dropOther(REOBlocks.SMALL_SAPPHIRE_BUD.get(), Blocks.AIR);

        // Gravel Ore
        this.add(REOBlocks.ALUMINUM_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.ALUMINUM_GRAVEL_ORE.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.COAL_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.COAL_GRAVEL_ORE.get(), Items.COAL));
        this.add(REOBlocks.COPPER_GRAVEL_ORE.get(),
                (block) -> createNetherOreDrops(REOBlocks.COPPER_GRAVEL_ORE.get(),Items.RAW_COPPER, 5f, 5f));
        this.add(REOBlocks.DIAMOND_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DIAMOND_GRAVEL_ORE.get(), Items.DIAMOND));
        this.add(REOBlocks.EMERALD_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.EMERALD_GRAVEL_ORE.get(), Items.EMERALD));
        this.add(REOBlocks.GOLD_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.GOLD_GRAVEL_ORE.get(), Items.RAW_GOLD));
        this.add(REOBlocks.IRON_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.IRON_GRAVEL_ORE.get(), Items.RAW_IRON));
        this.add(REOBlocks.LAPIS_GRAVEL_ORE.get(),
                (block) -> createNetherOreDrops(REOBlocks.LAPIS_GRAVEL_ORE.get(),Items.LAPIS_LAZULI, 4f, 9f));
        this.add(REOBlocks.LEAD_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.LEAD_GRAVEL_ORE.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.NICKEL_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.NICKEL_GRAVEL_ORE.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.PLATINUM_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.PLATINUM_GRAVEL_ORE.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.REDSTONE_GRAVEL_ORE.get(),
                (block) -> createNetherOreDrops(REOBlocks.REDSTONE_GRAVEL_ORE.get(), Items.REDSTONE, 4f, 5f));
        this.add(REOBlocks.SILVER_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.SILVER_GRAVEL_ORE.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.TIN_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.TIN_GRAVEL_ORE.get(), REOItems.RAW_TIN.get()));
        this.add(REOBlocks.URANIUM_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.URANIUM_GRAVEL_ORE.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.ZINC_GRAVEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.ZINC_ORE.get(), REOItems.RAW_ZINC.get()));

        // Deepslate Ore
        this.add(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(), REOItems.RAW_ALUMINIUM.get()));
        this.add(REOBlocks.DEEPSLATE_LEAD_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_LEAD_ORE.get(), REOItems.RAW_LEAD.get()));
        this.add(REOBlocks.DEEPSLATE_NICKEL_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_NICKEL_ORE.get(), REOItems.RAW_NICKEL.get()));
        this.add(REOBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_PLATINUM_ORE.get(), REOItems.RAW_PLATINUM.get()));
        this.add(REOBlocks.DEEPSLATE_SILVER_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_SILVER_ORE.get(), REOItems.RAW_SILVER.get()));
        this.add(REOBlocks.DEEPSLATE_URANIUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_URANIUM_ORE.get(), REOItems.RAW_URANIUM.get()));
        this.add(REOBlocks.DEEPSLATE_ZINC_ORE.get(),
                (block) -> createOreDrop(REOBlocks.DEEPSLATE_ZINC_ORE.get(), REOItems.RAW_ZINC.get()));

        // Nether Ore
        this.add(REOBlocks.NETHER_ALUMINIUM_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.ALUMINUM_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_COAL_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.COAL, 1F, 4F));
        this.add(REOBlocks.NETHER_COPPER_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.RAW_COPPER, 5F, 10F));
        this.add(REOBlocks.NETHER_DIAMOND_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.DIAMOND, 1F, 2F));
        this.add(REOBlocks.NETHER_EMERALD_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.EMERALD, 1F, 2F));
        this.add(REOBlocks.NETHER_IRON_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.IRON_NUGGET, 2F, 6F));
        this.add(REOBlocks.NETHER_LAPIS_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.LAPIS_LAZULI, 8F, 18F));
        this.add(REOBlocks.NETHER_LEAD_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.LEAD_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_NICKEL_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.NICKEL_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_PLATINUM_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.PLATINUM_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_REDSTONE_ORE.get(),
                (block) -> createNetherOreDrops(block, Items.REDSTONE, 8F, 10F));
        this.add(REOBlocks.NETHER_SILVER_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.SILVER_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_TIN_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.TIN_NUGGET.get(), 2F, 6F));
        this.add(REOBlocks.NETHER_ZINC_ORE.get(),
                (block) -> createNetherOreDrops(block, REOItems.ZINC_NUGGET.get(), 2F, 6F));

        this.add(REOBlocks.NETHER_URANIUM_ORE.get(),
                (block) -> createOreDrop(REOBlocks.NETHER_URANIUM_ORE.get(), REOItems.RAW_URANIUM.get()));

        // End Ore
        this.add(REOBlocks.ENDERITE_ORE.get(),
                (block) -> createOreDrop(REOBlocks.ENDERITE_ORE.get(), REOItems.RAW_ENDERITE.get()));


        // Misc //
        this.dropSelf(REOBlocks.WAX_BLOCK.get());

        // Tech //
        // Machines
        // Coal
        this.dropSelf(REOBlocks.KILN.get());
        this.dropSelf(REOBlocks.CRUSHER.get());
        this.dropSelf(REOBlocks.EXTRACTOR.get());
        this.dropSelf(REOBlocks.PURIFIER.get());

        // Electric
        // Basic
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

        // Generator
        this.dropSelf(REOBlocks.COAL_GENERATOR.get());


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