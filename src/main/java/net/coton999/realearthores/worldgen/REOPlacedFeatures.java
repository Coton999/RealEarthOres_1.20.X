package net.coton999.realearthores.worldgen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ClampedInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class REOPlacedFeatures {

    // Building Blocks //
    public static final ResourceKey<PlacedFeature> MARBLE_PLACED_KEY = createKey("marble_placed");
    public static final ResourceKey<PlacedFeature> LIMESTONE_PLACED_KEY = createKey("limestone_placed");

    // Ore //
    // Overworld
    public static final ResourceKey<PlacedFeature> ALUMINIUM_PLACED_KEY = createKey("aluminium_placed");
    public static final ResourceKey<PlacedFeature> LEAD_PLACED_KEY = createKey("lead_placed");
    public static final ResourceKey<PlacedFeature> NICKEL_PLACED_KEY = createKey("nickel_placed");
    public static final ResourceKey<PlacedFeature> PLATINUM_PLACED_KEY = createKey("platinum_placed");
    public static final ResourceKey<PlacedFeature> SILVER_PLACED_KEY = createKey("silver_placed");
    public static final ResourceKey<PlacedFeature> TIN_PLACED_KEY = createKey("tin_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_PLACED_KEY = createKey("uranium_placed");
    public static final ResourceKey<PlacedFeature> ZINC_PLACED_KEY = createKey("zinc_placed");

    // Nether
    public static final ResourceKey<PlacedFeature> NETHER_ALUMINIUM_PLACED_KEY = createKey("nether_aluminium_placed");
    public static final ResourceKey<PlacedFeature> NETHER_COAL_PLACED_KEY = createKey("nether_coal_placed");
    public static final ResourceKey<PlacedFeature> NETHER_COPPER_PLACED_KEY = createKey("nether_copper_placed");
    public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_PLACED_KEY = createKey("nether_diamond_placed");
    public static final ResourceKey<PlacedFeature> NETHER_EMERALD_PLACED_KEY = createKey("nether_emerald_placed");
    public static final ResourceKey<PlacedFeature> NETHER_IRON_PLACED_KEY = createKey("nether_iron_placed");
    public static final ResourceKey<PlacedFeature> NETHER_LAPIS_PLACED_KEY = createKey("nether_lapis_placed");
    public static final ResourceKey<PlacedFeature> NETHER_LEAD_PLACED_KEY = createKey("nether_lead_placed");
    public static final ResourceKey<PlacedFeature> NETHER_NICKEL_PLACED_KEY = createKey("nether_nickel_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_PLACED_KEY = createKey("nether_platinum_placed");
    public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_PLACED_KEY = createKey("nether_redstone_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_PLACED_KEY = createKey("nether_silver_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TIN_PLACED_KEY = createKey("nether_tin_placed");
    public static final ResourceKey<PlacedFeature> NETHER_URANIUM_PLACED_KEY = createKey("nether_uranium_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ZINC_PLACED_KEY = createKey("nether_zinc_placed");

    // Gravel
    public static final ResourceKey<PlacedFeature> GRAVEL_ALUMINIUM_PLACED_KEY = createKey("gravel_aluminium_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_COAL_PLACED_KEY = createKey("gravel_coal_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_COPPER_PLACED_KEY = createKey("gravel_copper_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_DIAMOND_PLACED_KEY = createKey("gravel_diamond_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_EMERALD_PLACED_KEY = createKey("gravel_emerald_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_GOLD_PLACED_KEY = createKey("gravel_gold_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_IRON_PLACED_KEY = createKey("gravel_iron_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_LAPIS_PLACED_KEY = createKey("gravel_lapis_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_LEAD_PLACED_KEY = createKey("gravel_lead_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_NICKEL_PLACED_KEY = createKey("gravel_nickel_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_PLATINUM_PLACED_KEY = createKey("gravel_platinum_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_REDSTONE_PLACED_KEY = createKey("gravel_redstone_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_SILVER_PLACED_KEY = createKey("gravel_silver_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_TIN_PLACED_KEY = createKey("gravel_tin_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_URANIUM_PLACED_KEY = createKey("gravel_uranium_placed");
    public static final ResourceKey<PlacedFeature> GRAVEL_ZINC_PLACED_KEY = createKey("gravel_zinc_placed");

    // End
    public static final ResourceKey<PlacedFeature> END_ENDERITE_PLACED_KEY = createKey("end_enderite_placed");

    // Geode //
    public static final ResourceKey<PlacedFeature> GEODE_PERIDOT_PLACED_KEY = createKey("geode_peridot_placed");
    public static final ResourceKey<PlacedFeature> GEODE_RUBY_PLACED_KEY = createKey("geode_ruby_placed");
    public static final ResourceKey<PlacedFeature> GEODE_SAPPHIRE_PLACED_KEY = createKey("geode_sapphire_placed");

    // Tree //
    public static final ResourceKey<PlacedFeature> BALSA_PLACED_KEY = createKey("balsa_placed");
    public static final ResourceKey<PlacedFeature> BAOBAB_PLACED_KEY = createKey("baobab_placed");
    public static final ResourceKey<PlacedFeature> HILL_CHERRY_PLACED_KEY = createKey("hill_cherry_placed");
    public static final ResourceKey<PlacedFeature> CHESTNUT_PLACED_KEY = createKey("chestnut_placed");
    public static final ResourceKey<PlacedFeature> CITRUS_PLACED_KEY = createKey("citrus_placed");
    public static final ResourceKey<PlacedFeature> EBONY_PLACED_KEY = createKey("ebony_placed");
    public static final ResourceKey<PlacedFeature> LARCH_PLACED_KEY = createKey("larch_placed");
    public static final ResourceKey<PlacedFeature> LIME_PLACED_KEY = createKey("lime_placed");
    public static final ResourceKey<PlacedFeature> MAHOGANY_PLACED_KEY = createKey("mahogany_placed");
    public static final ResourceKey<PlacedFeature> MAPLE_PLACED_KEY = createKey("maple_placed");
    public static final ResourceKey<PlacedFeature> PALM_PLACED_KEY = createKey("palm_placed");
    public static final ResourceKey<PlacedFeature> PAPAYA_PLACED_KEY = createKey("papaya_placed");
    public static final ResourceKey<PlacedFeature> PINE_PLACED_KEY = createKey("pine_placed");
    public static final ResourceKey<PlacedFeature> PLUM_PLACED_KEY = createKey("plum_placed");
    public static final ResourceKey<PlacedFeature> POPLAR_PLACED_KEY = createKey("poplar_placed");
    public static final ResourceKey<PlacedFeature> REDWOOD_PLACED_KEY = createKey("redwood_placed");
    public static final ResourceKey<PlacedFeature> RUBBER_PLACED_KEY = createKey("rubber_placed");
    public static final ResourceKey<PlacedFeature> TEAK_PLACED_KEY = createKey("teak_placed");
    public static final ResourceKey<PlacedFeature> WALNUT_PLACED_KEY = createKey("walnut_placed");
    public static final ResourceKey<PlacedFeature> WILLOW_PLACED_KEY = createKey("willow_placed");

    // Wild Plant
    public static final ResourceKey<PlacedFeature> WILD_BARLEY_PLACED_KEY = createKey("wild_barley_placed");
    public static final ResourceKey<PlacedFeature> WILD_COTTON_PLACED_KEY = createKey("wild_cotton_placed");
    public static final ResourceKey<PlacedFeature> WILD_RICE_PLACED_KEY = createKey("wild_rice_placed");
    public static final ResourceKey<PlacedFeature> WILD_TOMATO_PLACED_KEY = createKey("wild_tomato_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // Ore //
        // Overworld
        register(context, ALUMINIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_ALUMINIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, LEAD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, NICKEL_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, PLATINUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(9, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, SILVER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(120))));
        register(context, TIN_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));
        register(context, URANIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(16))));
        register(context, ZINC_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));


        // Building
        register(context, MARBLE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_MARBLE_KEY),
                REOOrePlacement.rareOrePlacement(6, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));
        register(context, LIMESTONE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.OVERWORLD_LIMESTONE_KEY),
                REOOrePlacement.rareOrePlacement(6, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(128))));

        // Nether
        register(context, NETHER_ALUMINIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_ALUMINIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_COAL_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_COAL_ORE_KEY),
                REOOrePlacement.commonOrePlacement(20, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_COPPER_ORE_KEY),
                REOOrePlacement.commonOrePlacement(16, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_DIAMOND_ORE_KEY),
                REOOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(56))));
        register(context, NETHER_EMERALD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_EMERALD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_IRON_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_IRON_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_LAPIS_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_LAPIS_ORE_KEY),
                REOOrePlacement.commonOrePlacement(2, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_LEAD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_LEAD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_NICKEL_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_PLATINUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_REDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_REDSTONE_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_SILVER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_TIN_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_TIN_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));
        register(context, NETHER_URANIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(56))));
        register(context, NETHER_ZINC_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.NETHER_ZINC_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(117))));

        // Gravel
        register(context, GRAVEL_ALUMINIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_ALUMINIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_COAL_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_COAL_ORE_KEY),
                REOOrePlacement.commonOrePlacement(20, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_COPPER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_COPPER_ORE_KEY),
                REOOrePlacement.commonOrePlacement(16, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_DIAMOND_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_DIAMOND_ORE_KEY),
                REOOrePlacement.commonOrePlacement(7, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_EMERALD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_EMERALD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_GOLD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_GOLD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_IRON_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_IRON_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_LAPIS_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_LAPIS_ORE_KEY),
                REOOrePlacement.commonOrePlacement(2, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_LEAD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_LEAD_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_NICKEL_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_NICKEL_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_PLATINUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_PLATINUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_REDSTONE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_REDSTONE_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_SILVER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_SILVER_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_TIN_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_TIN_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_URANIUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_URANIUM_ORE_KEY),
                REOOrePlacement.commonOrePlacement(4, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));
        register(context, GRAVEL_ZINC_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GRAVEL_ZINC_ORE_KEY),
                REOOrePlacement.commonOrePlacement(10, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(10), VerticalAnchor.absolute(320))));

        // End
        register(context, END_ENDERITE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.END_ENDERITE_ORE_KEY),
                REOOrePlacement.commonOrePlacement(2, // veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(320))));

        // Geode //
        register(context, GEODE_PERIDOT_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GEODE_PERIDOT_KEY),
                REOOrePlacement.rareOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, GEODE_RUBY_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GEODE_RUBY_KEY),
                REOOrePlacement.rareOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));
        register(context, GEODE_SAPPHIRE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.GEODE_SAPPHIRE_KEY),
                REOOrePlacement.rareOrePlacement(50,
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))));


        // Tree //
        register(context, BALSA_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.BALSA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_BALSA.get())); //                   Gaurenteed        Chance          Extra
        register(context, BAOBAB_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.BAOBAB_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        REOBlocks.SAPLING_BAOBAB.get())); //                   Gaurenteed        Chance          Extra
        register(context, HILL_CHERRY_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.HILL_CHERRY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_HILL_CHERRY.get())); //                   Gaurenteed       Chance      Extra
        register(context, CHESTNUT_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.CHESTNUT_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_CHESTNUT.get())); //                   Gaurenteed       Chance      Extra
        register(context, CITRUS_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.CITRUS_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_CITRUS.get())); //                   Gaurenteed        Chance        Extra
        register(context, EBONY_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.EBONY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 2),
                        REOBlocks.SAPLING_EBONY.get())); //                   Gaurenteed        Chance        Extra
        register(context, LARCH_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.LARCH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_LARCH.get())); //                   Gaurenteed        Chance        Extra
        register(context, LIME_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.LIME_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_LIME.get())); //                   Gaurenteed        Chance        Extra
        register(context, MAHOGANY_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.MAHOGANY_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        REOBlocks.SAPLING_MAHOGANY.get())); //                Gaurenteed       Chance       Extra
        register(context, MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.MAPLE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_MAPLE.get())); //                   Gaurenteed        Chance       Extra
        register(context, PALM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.PALM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 2),
                        REOBlocks.SAPLING_PALM.get())); //                   Gaurenteed        Chance       Extra
        register(context, PAPAYA_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.PAPAYA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_PAPAYA.get())); //                   Gaurenteed        Chance       Extra
        register(context, PINE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.PINE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_PINE.get())); //                   Gaurenteed        Chance       Extra
        register(context, PLUM_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.PLUM_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_PLUM.get())); //                   Gaurenteed        Chance       Extra
        register(context, POPLAR_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.POPLAR_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_POPLAR.get())); //                   Gaurenteed        Chance       Extra
        register(context, REDWOOD_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.REDWOOD_MEGA_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 2),
                        REOBlocks.SAPLING_REDWOOD.get())); //                   Gaurenteed        Chance       Extra
        register(context, RUBBER_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.RUBBER_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 3),
                        REOBlocks.SAPLING_RUBBER.get())); //                   Gaurenteed        Chance       Extra
        register(context, TEAK_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.TEAK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_TEAK.get())); //                   Gaurenteed        Chance       Extra
        register(context, WALNUT_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WALNUT_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 1),
                        REOBlocks.SAPLING_WALNUT.get())); //                   Gaurenteed        Chance       Extra
        register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 2),
                        REOBlocks.SAPLING_WILLOW.get())); //                   Gaurenteed        Chance       Extra

        // Wild Plants
        register(context, WILD_BARLEY_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WILD_BARLEY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WILD_COTTON_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WILD_COTTON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WILD_RICE_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WILD_RICE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
        register(context, WILD_TOMATO_PLACED_KEY, configuredFeatures.getOrThrow(REOConfiguredFeatures.WILD_TOMATO_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(RealEarthOres.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}