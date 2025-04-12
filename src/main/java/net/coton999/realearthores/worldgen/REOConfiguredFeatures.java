package net.coton999.realearthores.worldgen;

import com.google.common.collect.ImmutableList;
import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.worldgen.tree.foliage.*;
import net.coton999.realearthores.worldgen.tree.trunk.BaobabTrunkPlacer;
import net.coton999.realearthores.worldgen.tree.trunk.EbonyTrunkPlacer;
import net.coton999.realearthores.worldgen.tree.trunk.RedwoodMegaTrunkPlacer;
import net.coton999.realearthores.worldgen.tree.trunk.RedwoodTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaJungleFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class REOConfiguredFeatures {

    // Ore //
    // Overworld
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");

    // Building
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBLE_KEY = registerKey("marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIMESTONE_KEY = registerKey("limeston");

    // Nether
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINIUM_ORE_KEY = registerKey("nether_aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE_KEY = registerKey("nether_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE_KEY = registerKey("nether_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE_KEY = registerKey("nether_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE_KEY = registerKey("nether_enerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE_KEY = registerKey("nether_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE_KEY = registerKey("nether_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE_KEY = registerKey("nether_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE_KEY = registerKey("nether_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE_KEY = registerKey("nether_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZINC_ORE_KEY = registerKey("nether_zinc_ore");

    // End
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ENDERITE_ORE_KEY = registerKey("end_enderite_ore");

    // Gravel
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_ALUMINIUM_ORE_KEY = registerKey("gravel_aluminium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_COAL_ORE_KEY = registerKey("gravel_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_COPPER_ORE_KEY = registerKey("gravel_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_DIAMOND_ORE_KEY = registerKey("gravel_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_EMERALD_ORE_KEY = registerKey("gravel_enerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_GOLD_ORE_KEY = registerKey("gravel_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_IRON_ORE_KEY = registerKey("gravel_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_LAPIS_ORE_KEY = registerKey("gravel_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_LEAD_ORE_KEY = registerKey("gravel_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_NICKEL_ORE_KEY = registerKey("gravel_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_PLATINUM_ORE_KEY = registerKey("gravel_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_REDSTONE_ORE_KEY = registerKey("gravel_redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_SILVER_ORE_KEY = registerKey("gravel_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_TIN_ORE_KEY = registerKey("gravel_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_URANIUM_ORE_KEY = registerKey("gravel_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAVEL_ZINC_ORE_KEY = registerKey("gravel_zinc_ore");

    // Geode
    public static final ResourceKey<ConfiguredFeature<?, ?>> GEODE_PERIDOT_KEY = registerKey("geode_peridot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GEODE_RUBY_KEY = registerKey("geode_ruby");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GEODE_SAPPHIRE_KEY = registerKey("geode_sapphire");

    // Tree //
    public static final ResourceKey<ConfiguredFeature<?, ?>> BALSA_KEY = registerKey("tree_balsa");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAOBAB_KEY = registerKey("tree_baobab");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HILL_CHERRY_KEY = registerKey("tree_hill_cherry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHESTNUT_KEY = registerKey("tree_chestnut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRUS_KEY = registerKey("tree_citrus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("tree_ebony");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LARCH_KEY = registerKey("tree_larch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_KEY = registerKey("tree_lime");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("tree_mahogany");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_KEY = registerKey("tree_maple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PALM_KEY = registerKey("tree_palm");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PAPAYA_KEY = registerKey("tree_papaya");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("tree_pine");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PLUM_KEY = registerKey("tree_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> POPLAR_KEY = registerKey("tree_poplar");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("tree_redwood");
    public static final ResourceKey<ConfiguredFeature<?, ?>> REDWOOD_MEGA_KEY = registerKey("tree_redwood_mega");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBBER_KEY = registerKey("tree_rubber");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TEAK_KEY = registerKey("tree_teak");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WALNUT_KEY = registerKey("tree_walnut");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("tree_willow");

    // Wild Plants
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_BARLEY_KEY = registerKey("wild_barley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_COTTON_KEY = registerKey("wild_cotton");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_RICE_KEY = registerKey("wild_rice");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_TOMATO_KEY = registerKey("wild_tomato");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        // Ore //
        // Overworld
        List<OreConfiguration.TargetBlockState> overworldAluminiumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.ALUMINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.NICKEL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.TIN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.URANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, REOBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()));

        // Building
        List<OreConfiguration.TargetBlockState> overworldMarble = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.MARBLE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldLimestone = List.of(OreConfiguration.target(stoneReplaceables,
                        REOBlocks.LIMESTONE.get().defaultBlockState()));

        // Overworld
        register(context, OVERWORLD_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminiumOres, 9));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, 9));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres, 9));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 4));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 9));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 9));
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres, 8, 0.5f));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres, 9));

        // Building
        register(context, OVERWORLD_MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldMarble, 64));
        register(context, OVERWORLD_LIMESTONE_KEY, Feature.ORE, new OreConfiguration(overworldLimestone, 64));

        // Nether
        register(context, NETHER_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_ALUMINIUM_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_COAL_ORE.get().defaultBlockState(), 17));
        register(context, NETHER_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_COPPER_ORE.get().defaultBlockState(), 10));
        register(context, NETHER_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_DIAMOND_ORE.get().defaultBlockState(), 8, 0.5f));
        register(context, NETHER_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_EMERALD_ORE.get().defaultBlockState(), 3));
        register(context, NETHER_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_IRON_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_LAPIS_ORE.get().defaultBlockState(), 2));
        register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_LEAD_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_NICKEL_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_PLATINUM_ORE.get().defaultBlockState(), 4));
        register(context, NETHER_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_REDSTONE_ORE.get().defaultBlockState(), 8));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_TIN_ORE.get().defaultBlockState(), 9));
        register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_URANIUM_ORE.get().defaultBlockState(), 8, 0.5f));
        register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                REOBlocks.NETHER_ZINC_ORE.get().defaultBlockState(), 9));

        // Gravel
        register(context, GRAVEL_ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.ALUMINUM_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_COAL_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.COAL_GRAVEL_ORE.get().defaultBlockState(), 17));
        register(context, GRAVEL_COPPER_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.COPPER_GRAVEL_ORE.get().defaultBlockState(), 10));
        register(context, GRAVEL_DIAMOND_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.DIAMOND_GRAVEL_ORE.get().defaultBlockState(), 8, 0.5f));
        register(context, GRAVEL_EMERALD_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.EMERALD_GRAVEL_ORE.get().defaultBlockState(), 3));
        register(context, GRAVEL_GOLD_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.GOLD_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_IRON_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.IRON_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_LAPIS_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.LAPIS_GRAVEL_ORE.get().defaultBlockState(), 2));
        register(context, GRAVEL_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.LEAD_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.NICKEL_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.PLATINUM_GRAVEL_ORE.get().defaultBlockState(), 4));
        register(context, GRAVEL_REDSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.REDSTONE_GRAVEL_ORE.get().defaultBlockState(), 8));
        register(context, GRAVEL_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.SILVER_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.TIN_GRAVEL_ORE.get().defaultBlockState(), 9));
        register(context, GRAVEL_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.URANIUM_GRAVEL_ORE.get().defaultBlockState(), 8, 0.5f));
        register(context, GRAVEL_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                REOBlocks.ZINC_GRAVEL_ORE.get().defaultBlockState(), 9));

        // End
        register(context, END_ENDERITE_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceables,
                REOBlocks.ENDERITE_ORE.get().defaultBlockState(), 2));

        // Geode //
        register(context, GEODE_PERIDOT_KEY, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(REOBlocks.PERIDOT_BLOCK.get()),
                BlockStateProvider.simple(REOBlocks.BUDDING_PERIDOT.get()),
                BlockStateProvider.simple(REOBlocks.MARBLE.get()),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(REOBlocks.PERIDOT_CLUSTER.get().defaultBlockState(),
                        REOBlocks.LARGE_PERIDOT_BUD.get().defaultBlockState(),
                        REOBlocks.MEDIUM_PERIDOT_BUD.get().defaultBlockState(),
                        REOBlocks.SMALL_PERIDOT_BUD.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                true, UniformInt.of(3, 8),
                UniformInt.of(4, 6), UniformInt.of(3, 4),
                -16, 16, 0.05D, 1));

        register(context, GEODE_RUBY_KEY, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(REOBlocks.RUBY_BLOCK.get()),
                        BlockStateProvider.simple(REOBlocks.BUDDING_RUBY.get()),
                        BlockStateProvider.simple(REOBlocks.LIMESTONE.get()),
                        BlockStateProvider.simple(Blocks.BLACKSTONE),
                        List.of(REOBlocks.RUBY_CLUSTER.get().defaultBlockState(),
                                REOBlocks.LARGE_RUBY_BUD.get().defaultBlockState(),
                                REOBlocks.MEDIUM_RUBY_BUD.get().defaultBlockState(),
                                REOBlocks.SMALL_RUBY_BUD.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                true, UniformInt.of(3, 8),
                UniformInt.of(4, 6), UniformInt.of(3, 4),
                -16, 16, 0.05D, 1));

        register(context, GEODE_SAPPHIRE_KEY, Feature.GEODE, new GeodeConfiguration(
                new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(REOBlocks.SAPPHIRE_BLOCK.get()),
                        BlockStateProvider.simple(REOBlocks.BUDDING_SAPPHIRE.get()),
                        BlockStateProvider.simple(Blocks.POLISHED_DIORITE),
                        BlockStateProvider.simple(Blocks.BASALT),
                        List.of(REOBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState(),
                                REOBlocks.LARGE_SAPPHIRE_BUD.get().defaultBlockState(),
                                REOBlocks.MEDIUM_SAPPHIRE_BUD.get().defaultBlockState(),
                                REOBlocks.SMALL_SAPPHIRE_BUD.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D,
                true, UniformInt.of(3, 8),
                UniformInt.of(4, 6), UniformInt.of(3, 4),
                -16, 16, 0.05D, 1));

        // Tree //
        // Balsa
        register(context, BALSA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.BALSA_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.BALSA_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Baobab
        register(context, BAOBAB_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.BAOBAB_LOG.get()),
                new BaobabTrunkPlacer(3, 1, 1),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.BAOBAB_LEAVES.get()),
                new BaobabFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 1, 2))
                .dirt(BlockStateProvider.simple(Blocks.SAND)).build());

        // Hill Cherry
        register(context, HILL_CHERRY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.HILL_CHERRY_LOG.get()),
                new StraightTrunkPlacer(3, 1, 1),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.HILL_CHERRY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 1, 2)).build());

        // Chestnut
        register(context, CHESTNUT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.CHESTNUT_LOG.get()),
                new StraightTrunkPlacer(5, 2, 3),
                //                       Height   Random Extra Height A & B
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.CHESTNUT_LEAVES.get().defaultBlockState(), 4)
                        .add(REOBlocks.CHESTNUT_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Citrus
        register(context, CITRUS_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.CITRUS_LOG.get()),
                new StraightTrunkPlacer(4, 2, 0),

                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.CITRUS_LEAVES.get().defaultBlockState(), 5)
                        .add(REOBlocks.CITRUS_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Ebony
        register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.EBONY_LOG.get()),
                new EbonyTrunkPlacer(5, 1, 2),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.EBONY_LEAVES.get()),
                new EbonyFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Larch
        register(context, LARCH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.LARCH_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.LARCH_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Lime
        register(context, LIME_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.LIME_LOG.get()),
                new StraightTrunkPlacer(5, 2, 3),
                //                       Height   Random Extra Height A & B
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.LIME_LEAVES.get().defaultBlockState(), 5)
                        .add(REOBlocks.LIME_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Mahogany
        register(context, MAHOGANY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.MAHOGANY_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.MAHOGANY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Maple
        register(context, MAPLE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.MAPLE_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.MAPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Palm
        register(context, PALM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.PALM_LOG.get()),
                new StraightTrunkPlacer(4, 1, 2),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.PALM_LEAVES.get()),
                new PalmFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 3),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2))
                .dirt(BlockStateProvider.simple(Blocks.SAND)).build());

        // Papaya
        register(context, PAPAYA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.PAPAYA_LOG.get()),
                new ForkingTrunkPlacer(5, 2, 2),
                //                       Height   Random Extra Height A & B
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.PAPAYA_LEAVES.get().defaultBlockState(), 5)
                        .add(REOBlocks.PAPAYA_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                //                                            Radius                       Height
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        // Pine
        register(context, PINE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.PINE_LOG.get()),
                new StraightTrunkPlacer(8, 4, 5),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.PINE_LEAVES.get()),
                new REOPineFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 1, 2)).build());

        // Plum
        register(context, PLUM_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.PLUM_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.PLUM_LEAVES.get().defaultBlockState(), 5)
                        .add(REOBlocks.PLUM_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Poplar
        register(context, POPLAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.POPLAR_LOG.get()),
                new StraightTrunkPlacer(6, 1, 2),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.POPLAR_LEAVES.get()),
                new PoplarFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Redwood
        register(context, REDWOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.REDWOOD_LOG.get()),
                new RedwoodTrunkPlacer(8, 2, 5),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.REDWOOD_LEAVES.get()),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Redwood - Mega
        register(context, REDWOOD_MEGA_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.REDWOOD_LOG.get()),
                new RedwoodMegaTrunkPlacer(10, 2, 5),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.REDWOOD_LEAVES.get()),
                new MegaJungleFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 2),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Rubber
        register(context, RUBBER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.RUBBER_LOG.get().defaultBlockState(), 4)
                        .add(REOBlocks.RUBBER_LOG_SAP.get().defaultBlockState(), 1)),
                new StraightTrunkPlacer(4, 1, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.RUBBER_LEAVES.get()),
                new RubberFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), 0),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Teak
        register(context, TEAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.TEAK_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.TEAK_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Walnut
        register(context, WALNUT_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.WALNUT_LOG.get()),
                new StraightTrunkPlacer(5, 2, 3),
                //                       Height   Random Extra Height A & B
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder()
                        .add(REOBlocks.WALNUT_LEAVES.get().defaultBlockState(), 4)
                        .add(REOBlocks.WALNUT_FRUIT_LEAVES.get().defaultBlockState(), 1)),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2)).build());

        // Willow
        register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(REOBlocks.WILLOW_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                //                       Height   Random Extra Height A & B
                BlockStateProvider.simple(REOBlocks.WILLOW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                //                                     Radius                      Offset         Height
                new TwoLayersFeatureSize(1, 0, 2))
                .decorators(ImmutableList.of(TrunkVineDecorator.INSTANCE, new LeaveVineDecorator(0.75F))).build());

        // Wild Plants //
        register(context, WILD_BARLEY_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(REOBlocks.WILD_BARLEY.get())))));
        register(context, WILD_COTTON_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(REOBlocks.WILD_COTTON.get())))));
        register(context, WILD_RICE_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(REOBlocks.WILD_RICE.get())))));
        register(context, WILD_TOMATO_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(REOBlocks.WILD_TOMATO.get())))));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(RealEarthOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
