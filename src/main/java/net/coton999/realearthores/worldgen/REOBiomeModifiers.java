package net.coton999.realearthores.worldgen;

import net.coton999.realearthores.RealEarthOres;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class REOBiomeModifiers {

    // Ores //
    // Overworld
    public static final ResourceKey<BiomeModifier> ADD_ALUMINIUM_ORE = registerKey("add_aluminium_ore");
    public static final ResourceKey<BiomeModifier> ADD_LEAD_ORE = registerKey("add_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_NICKEL_ORE = registerKey("add_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("add_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_URANIUM_ORE = registerKey("add_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_ZINC_ORE = registerKey("add_zinc_ore");

    // Building
    public static final ResourceKey<BiomeModifier> ADD_MARBLE = registerKey("add_marble");
    public static final ResourceKey<BiomeModifier> ADD_LIMESTONE = registerKey("add_limestone");

    // Nether
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ALUMINIUM_ORE = registerKey("add_nether_aluminium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_COAL_ORE = registerKey("add_nether_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_COPPER_ORE = registerKey("add_nether_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_DIAMOND_ORE = registerKey("add_nether_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_EMERALD_ORE = registerKey("add_nether_emerald_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_IRON_ORE = registerKey("add_nether_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LAPIS_ORE = registerKey("add_nether_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_LEAD_ORE = registerKey("add_nether_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_NICKEL_ORE = registerKey("add_nether_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = registerKey("add_nether_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_REDSTONE_ORE = registerKey("add_nether_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = registerKey("add_nether_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_TIN_ORE = registerKey("add_nether_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_URANIUM_ORE = registerKey("add_nether_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ZINC_ORE = registerKey("add_nether_zinc_ore");

    // Gravel
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_ALUMINIUM_ORE = registerKey("add_gravel_aluminium_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_COAL_ORE = registerKey("add_gravel_coal_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_COPPER_ORE = registerKey("add_gravel_copper_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_DIAMOND_ORE = registerKey("add_gravel_diamond_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_EMERALD_ORE = registerKey("add_gravel_emerald_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_GOLD_ORE = registerKey("add_gravel_gold_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_IRON_ORE = registerKey("add_gravel_iron_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_LAPIS_ORE = registerKey("add_gravel_lapis_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_LEAD_ORE = registerKey("add_gravel_lead_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_NICKEL_ORE = registerKey("add_gravel_nickel_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_PLATINUM_ORE = registerKey("add_gravel_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_REDSTONE_ORE = registerKey("add_gravel_redstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_SILVER_ORE = registerKey("add_gravel_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_TIN_ORE = registerKey("add_gravel_tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_URANIUM_ORE = registerKey("add_gravel_uranium_ore");
    public static final ResourceKey<BiomeModifier> ADD_GRAVEL_ZINC_ORE = registerKey("add_gravel_zinc_ore");

    // End
    public static final ResourceKey<BiomeModifier> ADD_ENDERITE_ORE = registerKey("add_enderite_ore");

    // Geode
    public static final ResourceKey<BiomeModifier> ADD_GEODE_PERIDOT_ORE = registerKey("add_geode_peridot_ore");
    public static final ResourceKey<BiomeModifier> ADD_GEODE_RUBY_ORE = registerKey("add_geode_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_GEODE_SAPPHIRE_ORE = registerKey("add_geode_sapphire_ore");


    // Tree //
    public static final ResourceKey<BiomeModifier> ADD_TREE_BALSA = registerKey("add_tree_balsa");
    public static final ResourceKey<BiomeModifier> ADD_TREE_BAOBAB = registerKey("add_tree_baobab");
    public static final ResourceKey<BiomeModifier> ADD_TREE_HILL_CHERRY = registerKey("add_tree_hill_cherry");
    public static final ResourceKey<BiomeModifier> ADD_TREE_CHESTNUT = registerKey("add_tree_chestnut");
    public static final ResourceKey<BiomeModifier> ADD_TREE_CITRUS = registerKey("add_tree_citrus");
    public static final ResourceKey<BiomeModifier> ADD_TREE_EBONY = registerKey("add_tree_ebony");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LARCH = registerKey("add_tree_larch");
    public static final ResourceKey<BiomeModifier> ADD_TREE_LIME = registerKey("add_tree_lime");
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAHOGANY = registerKey("add_tree_mahogany");
    public static final ResourceKey<BiomeModifier> ADD_TREE_MAPLE = registerKey("add_tree_maple");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PALM = registerKey("add_tree_palm");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PAPAYA = registerKey("add_tree_papaya");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PINE = registerKey("add_tree_pine");
    public static final ResourceKey<BiomeModifier> ADD_TREE_PLUM = registerKey("add_tree_plum");
    public static final ResourceKey<BiomeModifier> ADD_TREE_POPLAR = registerKey("add_tree_poplar");
    public static final ResourceKey<BiomeModifier> ADD_TREE_REDWOOD = registerKey("add_tree_redwood");
    public static final ResourceKey<BiomeModifier> ADD_TREE_RUBBER = registerKey("add_tree_rubber");
    public static final ResourceKey<BiomeModifier> ADD_TREE_TEAK = registerKey("add_tree_teak");
    public static final ResourceKey<BiomeModifier> ADD_TREE_WALNUT = registerKey("add_tree_walnut");
    public static final ResourceKey<BiomeModifier> ADD_TREE_WILLOW = registerKey("add_tree_willow");

    // Wild Plants //
    public static final ResourceKey<BiomeModifier> ADD_WILD_BARLEY = registerKey("add_wild_barley");
    public static final ResourceKey<BiomeModifier> ADD_WILD_COTTON = registerKey("add_wild_cotton");
    public static final ResourceKey<BiomeModifier> ADD_WILD_RICE = registerKey("add_wild_rice");
    public static final ResourceKey<BiomeModifier> ADD_WILD_TOMATO = registerKey("add_wild_tomato");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Building //
        context.register(ADD_MARBLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.MARBLE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LIMESTONE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.LIMESTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Ores //
        // Overworld //
        context.register(ADD_ALUMINIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.ALUMINIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.LEAD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NICKEL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NICKEL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.PLATINUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.SILVER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.TIN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_URANIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.URANIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_ZINC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.ZINC_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Nether //
        context.register(ADD_NETHER_ALUMINIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_ALUMINIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_COAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_COAL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_COPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_DIAMOND_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_EMERALD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.BASALT_DELTAS)),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_EMERALD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_IRON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_LAPIS_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_LAPIS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_LEAD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_NICKEL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_NICKEL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_PLATINUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_REDSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_REDSTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_SILVER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_TIN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_URANIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_URANIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_ZINC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.NETHER_ZINC_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Gravel //
        context.register(ADD_GRAVEL_ALUMINIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_ALUMINIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_COAL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_COAL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_COPPER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_COPPER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_DIAMOND_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_DIAMOND_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_EMERALD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_EMERALD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_GOLD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_GOLD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_IRON_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_IRON_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_LAPIS_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_LAPIS_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_LEAD_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_LEAD_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_NICKEL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_NICKEL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_PLATINUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_REDSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_REDSTONE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_SILVER_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_TIN_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_URANIUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_URANIUM_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GRAVEL_ZINC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GRAVEL_ZINC_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // End //
        context.register(ADD_ENDERITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.END_ENDERITE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Geode //
        context.register(ADD_GEODE_PERIDOT_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GEODE_PERIDOT_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GEODE_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GEODE_RUBY_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_GEODE_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.GEODE_SAPPHIRE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        // Tree //
        context.register(ADD_TREE_BALSA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.BALSA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_BAOBAB, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DESERT),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.BAOBAB_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_HILL_CHERRY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.HILL_CHERRY_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_CHESTNUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_WET),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.CHESTNUT_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_CITRUS, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.CITRUS_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_EBONY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.EBONY_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_LARCH, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_COLD),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.LARCH_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_LIME, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.LIME_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_MAHOGANY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.MAHOGANY_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_MAPLE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_TAIGA),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.MAPLE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_PALM, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.PALM_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_PAPAYA, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_HOT),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.PAPAYA_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_PINE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_SNOWY),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.PINE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_PLUM, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.PLUM_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_POPLAR, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.POPLAR_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_REDWOOD, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_DENSE),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.REDWOOD_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_RUBBER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.RUBBER_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_TEAK, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(Tags.Biomes.IS_PLAINS),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.TEAK_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_WALNUT, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WALNUT_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_TREE_WILLOW, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WILLOW_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        // Wild Plants
        context.register(ADD_WILD_BARLEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_SAVANNA),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WILD_BARLEY_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WILD_COTTON, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WILD_COTTON_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WILD_RICE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_RIVER),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WILD_RICE_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
        context.register(ADD_WILD_TOMATO, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_JUNGLE),
                HolderSet.direct(placedFeatures.getOrThrow(REOPlacedFeatures.WILD_TOMATO_PLACED_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(RealEarthOres.MOD_ID, name));
    }
}