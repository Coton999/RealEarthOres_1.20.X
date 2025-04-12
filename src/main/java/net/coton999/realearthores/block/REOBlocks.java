package net.coton999.realearthores.block;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.custom.bush.BlackberryBlock;
import net.coton999.realearthores.block.custom.bush.BlueberryBlock;
import net.coton999.realearthores.block.custom.bush.RaspberryBlock;
import net.coton999.realearthores.block.custom.cluster.BuddingPeridotBlock;
import net.coton999.realearthores.block.custom.cluster.BuddingRubyBlock;
import net.coton999.realearthores.block.custom.cluster.BuddingSapphireBlock;
import net.coton999.realearthores.block.custom.cluster.ClusterBlock;
import net.coton999.realearthores.block.custom.crop.food.*;
import net.coton999.realearthores.block.custom.fruit.*;
import net.coton999.realearthores.block.custom.machines.coal.BasicCrusherBlock;
import net.coton999.realearthores.block.custom.machines.coal.BasicExtractorBlock;
import net.coton999.realearthores.block.custom.machines.coal.BasicPurifierBlock;
import net.coton999.realearthores.block.custom.machines.coal.KilnBlock;
import net.coton999.realearthores.block.custom.machines.electric.*;
import net.coton999.realearthores.block.custom.machines.generator.CoalGenBlock;
import net.coton999.realearthores.block.custom.misc.GravelOreBlock;
import net.coton999.realearthores.block.custom.misc.LampBlock;
import net.coton999.realearthores.block.custom.sign.REOHangingSignBlock;
import net.coton999.realearthores.block.custom.sign.REOStandingSignBlock;
import net.coton999.realearthores.block.custom.sign.REOWallHangingSignBlock;
import net.coton999.realearthores.block.custom.sign.REOWallSignBlock;
import net.coton999.realearthores.block.custom.wood.*;
import net.coton999.realearthores.fluid.REOFluids;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.util.REOWoodTypes;
import net.coton999.realearthores.worldgen.tree.grower.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class REOBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RealEarthOres.MOD_ID);

    // Building Blocks
    //Marble
    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> MARBLE_COBBLE = registerBlock("marble_cobble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops().strength(2f)));
    public static final RegistryObject<Block> MARBLE_COBBLE_MOSSY = registerBlock("marble_cobble_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).requiresCorrectToolForDrops().strength(2f)));
    public static final RegistryObject<Block> MARBLE_BRICK = registerBlock("marble_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> MARBLE_BRICK_MOSSY = registerBlock("marble_brick_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> MARBLE_BRICK_CHISELED = registerBlock("marble_brick_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> MARBLE_BRICK_CRACKED = registerBlock("marble_brick_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));

    public static final RegistryObject<Block> MARBLE_STAIRS = registerBlock("marble_stairs",
            () -> new StairBlock(() -> REOBlocks.MARBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            () -> new StairBlock(() -> REOBlocks.MARBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_STAIRS = registerBlock("marble_cobble_stairs",
            () -> new StairBlock(() -> REOBlocks.MARBLE_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_MOSSY_STAIRS = registerBlock("marble_cobble_mossy_stairs",
            () -> new StairBlock(() -> REOBlocks.MARBLE_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_STAIRS).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MARBLE_SLAB = registerBlock("marble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_SLAB = registerBlock("marble_cobble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_MOSSY_SLAB = registerBlock("marble_cobble_mossy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> MARBLE_WALL = registerBlock("marble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_WALL = registerBlock("marble_cobble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MARBLE_COBBLE_MOSSY_WALL = registerBlock("marble_cobble_mossy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_WALL).sound(SoundType.STONE)));


    // Limestone
    public static final RegistryObject<Block> LIMESTONE = registerBlock("limestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE = registerBlock("limestone_cobble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops().strength(2f)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_MOSSY = registerBlock("limestone_cobble_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE).requiresCorrectToolForDrops().strength(2f)));
    public static final RegistryObject<Block> LIMESTONE_BRICK = registerBlock("limestone_brick",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_MOSSY = registerBlock("limestone_brick_mossy",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CHISELED = registerBlock("limestone_brick_chiseled",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CRACKED = registerBlock("limestone_brick_cracked",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).requiresCorrectToolForDrops().strength(1.5f)));

    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(() -> REOBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs",
            () -> new StairBlock(() -> REOBlocks.LIMESTONE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_STAIRS = registerBlock("limestone_cobble_stairs",
            () -> new StairBlock(() -> REOBlocks.LIMESTONE_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_MOSSY_STAIRS = registerBlock("limestone_cobble_mossy_stairs",
            () -> new StairBlock(() -> REOBlocks.LIMESTONE_COBBLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_STAIRS).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_SLAB = registerBlock("limestone_cobble_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_MOSSY_SLAB = registerBlock("limestone_cobble_mossy_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_WALL = registerBlock("limestone_cobble_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE_WALL).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIMESTONE_COBBLE_MOSSY_WALL = registerBlock("limestone_cobble_mossy_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE_WALL).sound(SoundType.STONE)));

    // Calcite
    public static final RegistryObject<Block> CALCITE_STAIRS = registerBlock("calcite_stairs",
            () -> new StairBlock(Blocks.CALCITE::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_STAIRS).sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_SLAB).sound(SoundType.CALCITE)));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICK_WALL).sound(SoundType.CALCITE)));

    // Netherrack
    public static final RegistryObject<Block> NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            () -> new StairBlock(Blocks.NETHERRACK::defaultBlockState,
                    BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));
    public static final RegistryObject<Block> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK)));

    // Storage
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("block_aluminium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BRASS_BLOCK = registerBlock("block_brass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("block_bronze",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> ELECTRUM_BLOCK = registerBlock("block_electrum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> ENDERITE_BLOCK = registerBlock("block_enderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("block_lead",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("block_nickel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("block_peridot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("block_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("block_ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("block_sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("block_silver",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("block_steel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("block_tin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("block_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> ZINC_BLOCK = registerBlock("block_zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));

    // Budding
    public static final RegistryObject<Block> BUDDING_PERIDOT = registerBlock("budding_peridot",
            () -> new BuddingPeridotBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)
                    .pushReaction(PushReaction.DESTROY).randomTicks()));
    public static final RegistryObject<Block> BUDDING_RUBY = registerBlock("budding_ruby",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)
                    .pushReaction(PushReaction.DESTROY).randomTicks()));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE = registerBlock("budding_sapphire",
            () -> new BuddingSapphireBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)
                    .pushReaction(PushReaction.DESTROY).randomTicks()));

    // Raw Storage
    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = registerBlock("block_raw_aluminium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_ENDERITE_BLOCK = registerBlock("block_raw_enderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("block_raw_lead",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = registerBlock("block_raw_nickel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = registerBlock("block_raw_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("block_raw_silver",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("block_raw_tin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("block_raw_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = registerBlock("block_raw_zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));

    // Overworld Ores
    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("ore_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("ore_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NICKEL_ORE = registerBlock("ore_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("ore_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("ore_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("ore_tin",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("ore_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ZINC_ORE = registerBlock("ore_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));

    // Cluster
    public static final RegistryObject<Block> PERIDOT_CLUSTER = registerBlock("cluster_peridot",
            () -> new ClusterBlock(7, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).randomTicks()
                            .pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> LARGE_PERIDOT_BUD = registerBlock("large_peridot_bud",
            () -> new ClusterBlock(5, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion()));
    public static final RegistryObject<Block> MEDIUM_PERIDOT_BUD = registerBlock("medium_peridot_bud",
            () -> new ClusterBlock(4, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion()));
    public static final RegistryObject<Block> SMALL_PERIDOT_BUD = registerBlock("small_peridot_bud",
            () -> new ClusterBlock(3, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion()));


    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("cluster_ruby",
            () -> new ClusterBlock(7, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).randomTicks()
                            .pushReaction(PushReaction.DESTROY).noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud",
            () -> new ClusterBlock(5, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud",
            () -> new ClusterBlock(4, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud",
            () -> new ClusterBlock(3, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));


    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("cluster_sapphire",
            () -> new ClusterBlock(7, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).randomTicks()
                            .pushReaction(PushReaction.DESTROY).noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud",
            () -> new ClusterBlock(5, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud",
            () -> new ClusterBlock(4, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud",
            () -> new ClusterBlock(3, 3,
                    BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).pushReaction(PushReaction.DESTROY).forceSolidOn().noOcclusion().strength(1.5F)));

    // Gravel Ores
    public static final RegistryObject<Block> ALUMINUM_GRAVEL_ORE = registerBlock("gravel_ore_aluminium",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> COAL_GRAVEL_ORE = registerBlock("gravel_ore_coal",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> COPPER_GRAVEL_ORE = registerBlock("gravel_ore_copper",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DIAMOND_GRAVEL_ORE = registerBlock("gravel_ore_diamond",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> EMERALD_GRAVEL_ORE = registerBlock("gravel_ore_emerald",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GOLD_GRAVEL_ORE = registerBlock("gravel_ore_gold",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> IRON_GRAVEL_ORE = registerBlock("gravel_ore_iron",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> LAPIS_GRAVEL_ORE = registerBlock("gravel_ore_lapis",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> LEAD_GRAVEL_ORE = registerBlock("gravel_ore_lead",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NICKEL_GRAVEL_ORE = registerBlock("gravel_ore_nickel",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> PLATINUM_GRAVEL_ORE = registerBlock("gravel_ore_platinum",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> REDSTONE_GRAVEL_ORE = registerBlock("gravel_ore_redstone",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> SILVER_GRAVEL_ORE = registerBlock("gravel_ore_silver",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> TIN_GRAVEL_ORE = registerBlock("gravel_ore_tin",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> URANIUM_GRAVEL_ORE = registerBlock("gravel_ore_uranium",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ZINC_GRAVEL_ORE = registerBlock("gravel_ore_zinc",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));

    // Deepslate Ores
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = registerBlock("deepslate_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE).strength(4.5f), UniformInt.of(2, 6)));

    // Nether Ore
    public static final RegistryObject<Block> NETHER_ALUMINIUM_ORE = registerBlock("nether_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_COAL_ORE = registerBlock("nether_coal",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_COPPER_ORE = registerBlock("nether_copper",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_DIAMOND_ORE = registerBlock("nether_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_EMERALD_ORE = registerBlock("nether_emerald",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_IRON_ORE = registerBlock("nether_iron",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_LAPIS_ORE = registerBlock("nether_lapis",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_LEAD_ORE = registerBlock("nether_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_NICKEL_ORE = registerBlock("nether_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_PLATINUM_ORE = registerBlock("nether_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_REDSTONE_ORE = registerBlock("nether_redstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_SILVER_ORE = registerBlock("nether_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_TIN_ORE = registerBlock("nether_tin",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_URANIUM_ORE = registerBlock("nether_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_ZINC_ORE = registerBlock("nether_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));

    // End Ore
    public static final RegistryObject<Block> ENDERITE_ORE = registerBlock("ore_enderite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(5f), UniformInt.of(2, 6)));

    // Motlen Metals
    public static final RegistryObject<LiquidBlock> MOLTEN_ALUMINIUM_BLOCK = registerBlock("molten_aluminium_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_ALUMINIUM_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_AMETHYST_BLOCK = registerBlock("molten_amethyst_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_AMETHYST_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRASS_BLOCK = registerBlock("molten_brass_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_BRASS_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_BRONZE_BLOCK = registerBlock("molten_bronze_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_BRONZE_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COAL_BLOCK = registerBlock("molten_coal_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_COAL_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = registerBlock("molten_copper_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_COPPER_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_DIAMOND_BLOCK = registerBlock("molten_diamond_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_DIAMOND_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ELECTRUM_BLOCK = registerBlock("molten_electrum_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_ELECTRUM_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_EMERALD_BLOCK = registerBlock("molten_emerald_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_EMERALD_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ENDERITE_BLOCK = registerBlock("molten_enderite_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_ENDERITE_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = registerBlock("molten_gold_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_GOLD_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = registerBlock("molten_iron_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_IRON_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LAPIS_BLOCK = registerBlock("molten_lapis_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_LAPIS_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_LEAD_BLOCK = registerBlock("molten_lead_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_LEAD_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_NICKEL_BLOCK = registerBlock("molten_nickel_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_NICKEL_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PERIDOT_BLOCK = registerBlock("molten_peridot_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_PERIDOT_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_PLATINUM_BLOCK = registerBlock("molten_platinum_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_PLATINUM_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_REDSTONE_BLOCK = registerBlock("molten_redstone_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_REDSTONE_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_RUBY_BLOCK = registerBlock("molten_ruby_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_RUBY_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SAPPHIRE_BLOCK = registerBlock("molten_sapphire_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_SAPPHIRE_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_SILVER_BLOCK = registerBlock("molten_silver_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_SILVER_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_STEEL_BLOCK = registerBlock("molten_steel_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_STEEL_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_TIN_BLOCK = registerBlock("molten_tin_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_TIN_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_URANIUM_BLOCK = registerBlock("molten_uranium_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_URANIUM_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));
    public static final RegistryObject<LiquidBlock> MOLTEN_ZINC_BLOCK = registerBlock("molten_zinc_block",
            () -> new LiquidBlock(REOFluids.MOLTEN_ZINC_SOURCE,BlockBehaviour.Properties.copy(Blocks.LAVA)
                    .replaceable().noCollission().noLootTable().sound(SoundType.EMPTY)));

    // Lamp
    public static final RegistryObject<Block> BLACK_LAMP = registerBlock("lamp_black",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> RED_LAMP = registerBlock("lamp_red",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREEN_LAMP = registerBlock("lamp_green",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BROWN_LAMP = registerBlock("lamp_brown",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PURPLE_LAMP = registerBlock("lamp_purple",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> CYAN_LAMP = registerBlock("lamp_cyan",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_LAMP = registerBlock("lamp_lightblue",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_LAMP = registerBlock("lamp_lightgray",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GRAY_LAMP = registerBlock("lamp_gray",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PINK_LAMP = registerBlock("lamp_pink",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIME_LAMP = registerBlock("lamp_lime",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> YELLOW_LAMP = registerBlock("lamp_yellow",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_LAMP = registerBlock("lamp_blue",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MAGENTA_LAMP = registerBlock("lamp_magenta",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ORANGE_LAMP = registerBlock("lamp_orange",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> WHITE_LAMP = registerBlock("lamp_white",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));

    // Crops //
    // Ores
    //public static final RegistryObject<Block> ALUMINIUM_CROP = BLOCKS.register("crop_aluminium",
    //        () -> new OreCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    // Food
    public static final RegistryObject<Block> BARLEY_CROP = BLOCKS.register("crop_barley",
            () -> new BarleyBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CAULIFLOWER_CROP = BLOCKS.register("crop_cauliflower",
            () -> new CauliflowerBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> COTTON_CROP = BLOCKS.register("crop_cotton",
            () -> new CottonBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> ONIONS_CROP = BLOCKS.register("crop_onions",
            () -> new OnionsBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> RICE_CROP = BLOCKS.register("crop_rice",
            () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("crop_tomato",
            () -> new TomatoBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_BARLEY = registerBlock("wild_barley",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WILD_COTTON = registerBlock("wild_cotton",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WILD_RICE = registerBlock("wild_rice",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WILD_TOMATO = registerBlock("wild_tomato",
            () -> new BushBlock(BlockBehaviour.Properties.copy(Blocks.DEAD_BUSH).noOcclusion().noCollission()));

    // Fruit
    public static final RegistryObject<Block> CITRUS_FRUIT = BLOCKS.register("fruit_citrus_block",
            () -> new CitrusBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> LIME_FRUIT = BLOCKS.register("fruit_lime_block",
            () -> new LimeBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PAPAYA_FRUIT = BLOCKS.register("fruit_papaya_block",
            () -> new PapayaBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PEAR_FRUIT = BLOCKS.register("fruit_pear_block",
            () -> new PearBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> PLUM_FRUIT = BLOCKS.register("fruit_plum_block",
            () -> new PlumBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WALNUT_FRUIT = BLOCKS.register("fruit_walnut_block",
            () -> new WalnutBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));

    // Berry
    public static final RegistryObject<Block> BLACKBERRY_FRUIT = BLOCKS.register("berry_blackberry_block",
            () -> new BlackberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> BLUEBERRY_FRUIT = BLOCKS.register("berry_blueberry_block",
            () -> new BlueberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> RASPBERRY_FRUIT = BLOCKS.register("berry_raspberry_block",
            () -> new RaspberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));


    // Wood //
    // Vanilla
    public static final RegistryObject<Block> RESISTANT_OAK_LOG = registerBlock("resistant_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_OAK_WOOD = registerBlock("resistant_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_OAK_LOG = registerBlock("resistant_stripped_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_OAK_WOOD = registerBlock("resistant_stripped_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_OAK_PLANKS = registerBlock("resistant_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_OAK_STAIRS = registerBlock("resistant_oak_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_OAK_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_OAK_SLAB = registerBlock("resistant_oak",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_OAK_FENCE = registerBlock("resistant_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_OAK_FENCE_GATE = registerBlock("resistant_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_SPRUCE_LOG = registerBlock("resistant_spruce_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_SPRUCE_WOOD = registerBlock("resistant_spruce_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_SPRUCE_LOG = registerBlock("resistant_stripped_spruce_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_SPRUCE_WOOD = registerBlock("resistant_stripped_spruce_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_SPRUCE_PLANKS = registerBlock("resistant_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_SPRUCE_STAIRS = registerBlock("resistant_spruce_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_SPRUCE_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_SPRUCE_SLAB = registerBlock("resistant_spruce_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_SPRUCE_FENCE = registerBlock("resistant_spruce_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_SPRUCE_FENCE_GATE = registerBlock("resistant_spruce_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_BIRCH_LOG = registerBlock("resistant_birch_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BIRCH_WOOD = registerBlock("resistant_birch_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BIRCH_LOG = registerBlock("resistant_stripped_birch_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BIRCH_WOOD = registerBlock("resistant_stripped_birch_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BIRCH_PLANKS = registerBlock("birch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_BIRCH_STAIRS = registerBlock("resistant_birch_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_BIRCH_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_BIRCH_SLAB = registerBlock("resistant_birch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_BIRCH_FENCE = registerBlock("resistant_birch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_BIRCH_FENCE_GATE = registerBlock("resistant_birch_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_JUNGLE_LOG = registerBlock("resistant_jungle_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_JUNGLE_WOOD = registerBlock("resistant_jungle_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_JUNGLE_LOG = registerBlock("resistant_stripped_jungle_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_JUNGLE_WOOD = registerBlock("resistant_stripped_jungle_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_JUNGLE_PLANKS = registerBlock("resistant_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_JUNGLE_STAIRS = registerBlock("resistant_jungle_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_JUNGLE_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_JUNGLE_SLAB = registerBlock("resistant_jungle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_JUNGLE_FENCE = registerBlock("resistant_jungle_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_JUNGLE_FENCE_GATE = registerBlock("resistant_jungle_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_ACACIA_LOG = registerBlock("resistant_acacia_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_ACACIA_WOOD = registerBlock("resistant_acacia_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_ACACIA_LOG = registerBlock("resistant_stripped_acacia_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_ACACIA_WOOD = registerBlock("resistant_stripped_acacia_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_ACACIA_PLANKS = registerBlock("resistant_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_ACACIA_STAIRS = registerBlock("resistant_acacia_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_ACACIA_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_ACACIA_SLAB = registerBlock("resistant_acacia_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_ACACIA_FENCE = registerBlock("resistant_acacia_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_ACACIA_FENCE_GATE = registerBlock("resistant_acacia_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_DARK_OAK_LOG = registerBlock("resistant_dark_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_DARK_OAK_WOOD = registerBlock("resistant_dark_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_DARK_OAK_LOG = registerBlock("resistant_stripped_dark_oak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_DARK_OAK_WOOD = registerBlock("resistant_stripped_dark_oak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_DARK_OAK_PLANKS = registerBlock("resistant_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_DARK_OAK_STAIRS = registerBlock("resistant_dark_oak_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_DARK_OAK_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_DARK_OAK_SLAB = registerBlock("resistant_dark_oak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_DARK_OAK_FENCE = registerBlock("resistant_dark_oak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_DARK_OAK_FENCE_GATE = registerBlock("resistant_dark_oak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_MANGROVE_LOG = registerBlock("resistant_mangrove_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MANGROVE_WOOD = registerBlock("resistant_mangrove_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MANGROVE_LOG = registerBlock("resistant_stripped_mangrove_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MANGROVE_WOOD = registerBlock("resistant_stripped_mangrove_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MANGROVE_PLANKS = registerBlock("resistant_mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_MANGROVE_STAIRS = registerBlock("resistant_mangrove_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_MANGROVE_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_MANGROVE_SLAB = registerBlock("resistant_mangrove_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_MANGROVE_FENCE = registerBlock("resistant_mangrove_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_MANGROVE_FENCE_GATE = registerBlock("resistant_mangrove_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RESISTANT_CHERRY_LOG = registerBlock("resistant_cherry_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CHERRY_WOOD = registerBlock("resistant_cherry_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CHERRY_LOG = registerBlock("resistant_stripped_cherry_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CHERRY_WOOD = registerBlock("resistant_stripped_cherry_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CHERRY_PLANKS = registerBlock("resistant_cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> RESISTANT_CHERRY_STAIRS = registerBlock("resistant_cherry_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_CHERRY_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_CHERRY_SLAB = registerBlock("resistant_cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_CHERRY_FENCE = registerBlock("resistant_cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RESISTANT_CHERRY_FENCE_GATE = registerBlock("resistant_cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    // Modded
    public static final RegistryObject<Block> BALSA_LOG = registerBlock("balsa_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BALSA_LOG = registerBlock("resistant_balsa_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> BALSA_WOOD = registerBlock("balsa_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BALSA_WOOD = registerBlock("resistant_balsa_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BALSA_LOG = registerBlock("stripped_balsa_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BALSA_LOG = registerBlock("resistant_stripped_balsa_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BALSA_WOOD = registerBlock("stripped_balsa_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BALSA_WOOD = registerBlock("resistant_stripped_balsa_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> BALSA_PLANKS = registerBlock("balsa_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BALSA_PLANKS = registerBlock("resistant_balsa_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BALSA_SAPLING = registerBlock("balsa_sapling",
            () -> new SaplingBlock(new BalsaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_BALSA_SAPLING = BLOCKS.register("potted_sapling_balsa",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.BALSA_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> BALSA_LEAVES = registerBlock("balsa_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> BALSA_STAIRS = registerBlock("balsa_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.BALSA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BALSA_STAIRS = registerBlock("resistant_balsa_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_BALSA_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BALSA_SLAB = registerBlock("balsa_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BALSA_SLAB = registerBlock("resistant_balsa_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BALSA_FENCE = registerBlock("balsa_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BALSA_FENCE = registerBlock("resistant_balsa_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BALSA_FENCE_GATE = registerBlock("balsa_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_BALSA_FENCE_GATE = registerBlock("resistant_balsa_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BALSA_BUTTON = registerBlock("balsa_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BALSA_PRESSURE_PLATE = registerBlock("balsa_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> BALSA_SIGN = BLOCKS.register("balsa_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.BALSA));
    public static final RegistryObject<Block> BALSA_WALL_SIGN = BLOCKS.register("balsa_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.BALSA));

    public static final RegistryObject<Block> BALSA_HANGING_SIGN = BLOCKS.register("balsa_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.BALSA));
    public static final RegistryObject<Block> BALSA_WALL_HANGING_SIGN = BLOCKS.register("balsa_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.BALSA));

    public static final RegistryObject<Block> BALSA_DOOR = registerBlock("balsa_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> BALSA_TRAPDOOR = registerBlock("balsa_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> BAOBAB_LOG = registerBlock("baobab_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_LOG = registerBlock("resistant_baobab_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> BAOBAB_WOOD = registerBlock("baobab_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_WOOD = registerBlock("resistant_baobab_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BAOBAB_LOG = registerBlock("resistant_stripped_baobab_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_BAOBAB_WOOD = registerBlock("resistant_stripped_baobab_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> BAOBAB_PLANKS = registerBlock("baobab_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_PLANKS = registerBlock("resistant_baobab_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> BAOBAB_SAPLING = registerBlock("baobab_sapling",
            () -> new REOSaplingBlock(new BaobabTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.SAND));
    public static final RegistryObject<Block> POTTED_BAOBAB_SAPLING = BLOCKS.register("potted_sapling_baobab",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.BAOBAB_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> BAOBAB_LEAVES = registerBlock("baobab_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> BAOBAB_STAIRS = registerBlock("baobab_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.BAOBAB_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_STAIRS = registerBlock("resistant_baobab_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_BAOBAB_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAOBAB_SLAB = registerBlock("baobab_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_SLAB = registerBlock("resistant_baobab_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAOBAB_FENCE = registerBlock("baobab_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_FENCE = registerBlock("resistant_baobab_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_BAOBAB_FENCE_GATE = registerBlock("resistant_baobab_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BAOBAB_BUTTON = registerBlock("baobab_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> BAOBAB_SIGN = BLOCKS.register("baobab_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_SIGN = BLOCKS.register("baobab_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.BAOBAB));

    public static final RegistryObject<Block> BAOBAB_HANGING_SIGN = BLOCKS.register("baobab_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.BAOBAB));
    public static final RegistryObject<Block> BAOBAB_WALL_HANGING_SIGN = BLOCKS.register("baobab_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.BAOBAB));

    public static final RegistryObject<Block> BAOBAB_DOOR = registerBlock("baobab_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> BAOBAB_TRAPDOOR = registerBlock("baobab_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> HILL_CHERRY_LOG = registerBlock("hill_cherry_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_LOG = registerBlock("resistant_hill_cherry_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> HILL_CHERRY_WOOD = registerBlock("hill_cherry_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_WOOD = registerBlock("resistant_hill_cherry_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HILL_CHERRY_LOG = registerBlock("stripped_hill_cherry_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_HILL_CHERRY_LOG = registerBlock("resistant_stripped_hill_cherry_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_HILL_CHERRY_WOOD = registerBlock("stripped_hill_cherry_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_HILL_CHERRY_WOOD = registerBlock("resistant_stripped_hill_cherry_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> HILL_CHERRY_PLANKS = registerBlock("hill_cherry_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_PLANKS = registerBlock("resistant_hill_cherry_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> HILL_CHERRY_SAPLING = registerBlock("hill_cherry_sapling",
            () -> new SaplingBlock(new HillCherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_HILL_CHERRY_SAPLING = BLOCKS.register("potted_hill_sapling_cherry",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.HILL_CHERRY_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> HILL_CHERRY_LEAVES = registerBlock("hill_cherry_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> HILL_CHERRY_STAIRS = registerBlock("hill_cherry_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.HILL_CHERRY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_STAIRS = registerBlock("resistant_hill_cherry_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HILL_CHERRY_SLAB = registerBlock("hill_cherry_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_SLAB = registerBlock("resistant_hill_cherry_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HILL_CHERRY_FENCE = registerBlock("hill_cherry_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_FENCE = registerBlock("resistant_hill_cherry_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> HILL_CHERRY_FENCE_GATE = registerBlock("hill_cherry_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_HILL_CHERRY_FENCE_GATE = registerBlock("resistant_hill_cherry_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> HILL_CHERRY_BUTTON = registerBlock("hill_cherry_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> HILL_CHERRY_PRESSURE_PLATE = registerBlock("hill_cherry_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> HILL_CHERRY_SIGN = BLOCKS.register("hill_cherry_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.HILL_CHERRY));
    public static final RegistryObject<Block> HILL_CHERRY_WALL_SIGN = BLOCKS.register("hill_cherry_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.HILL_CHERRY));

    public static final RegistryObject<Block> HILL_CHERRY_HANGING_SIGN = BLOCKS.register("hill_cherry_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.HILL_CHERRY));
    public static final RegistryObject<Block> HILL_CHERRY_WALL_HANGING_SIGN = BLOCKS.register("hill_cherry_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.HILL_CHERRY));

    public static final RegistryObject<Block> HILL_CHERRY_DOOR = registerBlock("hill_cherry_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> HILL_CHERRY_TRAPDOOR = registerBlock("hill_cherry_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> CHESTNUT_LOG = registerBlock("chestnut_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_LOG = registerBlock("resistant_chestnut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CHESTNUT_WOOD = registerBlock("chestnut_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_WOOD = registerBlock("resistant_chestnut_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CHESTNUT_LOG = registerBlock("resistant_stripped_chestnut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CHESTNUT_WOOD = registerBlock("resistant_stripped_chestnut_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_PLANKS = registerBlock("resistant_chestnut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            () -> new SaplingBlock(new ChestnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_CHESTNUT_SAPLING = BLOCKS.register("potted_sapling_chestnut",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.CHESTNUT_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CHESTNUT_FRUIT_LEAVES = registerBlock("chestnut_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CHESTNUT_STAIRS = registerBlock("chestnut_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.CHESTNUT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_STAIRS = registerBlock("resistant_chestnut_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_CHESTNUT_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHESTNUT_SLAB = registerBlock("chestnut_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_SLAB = registerBlock("resistant_chestnut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHESTNUT_FENCE = registerBlock("chestnut_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_FENCE = registerBlock("resistant_chestnut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHESTNUT_FENCE_GATE = registerBlock("chestnut_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_CHESTNUT_FENCE_GATE = registerBlock("resistant_chestnut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> CHESTNUT_BUTTON = registerBlock("chestnut_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CHESTNUT_PRESSURE_PLATE = registerBlock("chestnut_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> CHESTNUT_SIGN = BLOCKS.register("chestnut_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.CHESTNUT));
    public static final RegistryObject<Block> CHESTNUT_WALL_SIGN = BLOCKS.register("chestnut_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.CHESTNUT));

    public static final RegistryObject<Block> CHESTNUT_HANGING_SIGN = BLOCKS.register("chestnut_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.CHESTNUT));
    public static final RegistryObject<Block> CHESTNUT_WALL_HANGING_SIGN = BLOCKS.register("chestnut_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.CHESTNUT));

    public static final RegistryObject<Block> CHESTNUT_DOOR = registerBlock("chestnut_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CHESTNUT_TRAPDOOR = registerBlock("chestnut_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> CITRUS_LOG = registerBlock("citrus_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CITRUS_LOG = registerBlock("resistant_citrus_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> CITRUS_WOOD = registerBlock("citrus_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_CITRUS_WOOD = registerBlock("resistant_citrus_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CITRUS_LOG = registerBlock("stripped_citrus_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CITRUS_LOG = registerBlock("resistant_stripped_citrus_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_CITRUS_WOOD = registerBlock("stripped_citrus_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_CITRUS_WOOD = registerBlock("resistant_stripped_citrus_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> CITRUS_PLANKS = registerBlock("citrus_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CITRUS_PLANKS = registerBlock("resistant_citrus_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> CITRUS_SAPLING = registerBlock("citrus_sapling",
            () -> new SaplingBlock(new CitrusTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_CITRUS_SAPLING = BLOCKS.register("potted_sapling_citrus",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.CITRUS_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> CITRUS_LEAVES = registerBlock("citrus_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CITRUS_FRUIT_LEAVES = registerBlock("citrus_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> CITRUS_STAIRS = registerBlock("citrus_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.CITRUS_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CITRUS_STAIRS = registerBlock("resistant_citrus_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_CITRUS_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CITRUS_SLAB = registerBlock("citrus_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CITRUS_SLAB = registerBlock("resistant_citrus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CITRUS_FENCE = registerBlock("citrus_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_CITRUS_FENCE = registerBlock("resistant_citrus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CITRUS_FENCE_GATE = registerBlock("citrus_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_CITRUS_FENCE_GATE = registerBlock("resistant_citrus_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> CITRUS_BUTTON = registerBlock("citrus_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> CITRUS_PRESSURE_PLATE = registerBlock("citrus_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> CITRUS_SIGN = BLOCKS.register("citrus_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.CITRUS));
    public static final RegistryObject<Block> CITRUS_WALL_SIGN = BLOCKS.register("citrus_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.CITRUS));

    public static final RegistryObject<Block> CITRUS_HANGING_SIGN = BLOCKS.register("citrus_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.CITRUS));
    public static final RegistryObject<Block> CITRUS_WALL_HANGING_SIGN = BLOCKS.register("citrus_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.CITRUS));

    public static final RegistryObject<Block> CITRUS_DOOR = registerBlock("citrus_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> CITRUS_TRAPDOOR = registerBlock("citrus_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_EBONY_LOG = registerBlock("resistant_ebony_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_EBONY_WOOD = registerBlock("resistant_ebony_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_EBONY_LOG = registerBlock("resistant_stripped_ebony_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_EBONY_WOOD = registerBlock("resistant_stripped_ebony_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_EBONY_PLANKS = registerBlock("resistant_ebony_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_EBONY_SAPLING = BLOCKS.register("potted_sapling_ebony",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.EBONY_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> EBONY_STAIRS = registerBlock("ebony_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.EBONY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_EBONY_STAIRS = registerBlock("resistant_ebony_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_EBONY_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_SLAB = registerBlock("ebony_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_EBONY_SLAB = registerBlock("resistant_ebony_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_FENCE = registerBlock("ebony_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_EBONY_FENCE = registerBlock("resistant_ebony_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_EBONY_FENCE_GATE = registerBlock("resistant_ebony_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> EBONY_BUTTON = registerBlock("ebony_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> EBONY_SIGN = BLOCKS.register("ebony_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.EBONY));
    public static final RegistryObject<Block> EBONY_WALL_SIGN = BLOCKS.register("ebony_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.EBONY));

    public static final RegistryObject<Block> EBONY_HANGING_SIGN = BLOCKS.register("ebony_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.EBONY));
    public static final RegistryObject<Block> EBONY_WALL_HANGING_SIGN = BLOCKS.register("ebony_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.EBONY));

    public static final RegistryObject<Block> EBONY_DOOR = registerBlock("ebony_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LARCH_LOG = registerBlock("larch_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_LARCH_LOG = registerBlock("resistant_larch_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LARCH_WOOD = registerBlock("larch_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_LARCH_WOOD = registerBlock("resistant_larch_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_LARCH_LOG = registerBlock("stripped_larch_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_LARCH_LOG = registerBlock("resistant_stripped_larch_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_LARCH_WOOD = registerBlock("stripped_larch_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_LARCH_WOOD = registerBlock("resistant_stripped_larch_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LARCH_PLANKS = registerBlock("larch_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LARCH_PLANKS = registerBlock("resistant_larch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> LARCH_SAPLING = registerBlock("larch_sapling",
            () -> new SaplingBlock(new LarchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_LARCH_SAPLING = BLOCKS.register("potted_sapling_larch",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.LARCH_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LARCH_LEAVES = registerBlock("larch_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LARCH_STAIRS = registerBlock("larch_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.LARCH_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LARCH_STAIRS = registerBlock("resistant_larch_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_LARCH_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARCH_SLAB = registerBlock("larch_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LARCH_SLAB = registerBlock("resistant_larch_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARCH_FENCE = registerBlock("larch_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LARCH_FENCE = registerBlock("resistant_larch_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LARCH_FENCE_GATE = registerBlock("larch_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_LARCH_FENCE_GATE = registerBlock("resistant_larch_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LARCH_BUTTON = registerBlock("larch_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LARCH_PRESSURE_PLATE = registerBlock("larch_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> LARCH_SIGN = BLOCKS.register("larch_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_SIGN = BLOCKS.register("larch_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.LARCH));

    public static final RegistryObject<Block> LARCH_HANGING_SIGN = BLOCKS.register("larch_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.LARCH));
    public static final RegistryObject<Block> LARCH_WALL_HANGING_SIGN = BLOCKS.register("larch_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.LARCH));

    public static final RegistryObject<Block> LARCH_DOOR = registerBlock("larch_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> LARCH_TRAPDOOR = registerBlock("larch_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LIME_LOG = registerBlock("lime_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_LIME_LOG = registerBlock("resistant_lime_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LIME_WOOD = registerBlock("lime_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_LIME_WOOD = registerBlock("resistant_lime_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_LIME_LOG = registerBlock("stripped_lime_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_LIME_LOG = registerBlock("resistant_stripped_lime_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_LIME_WOOD = registerBlock("stripped_lime_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_LIME_WOOD = registerBlock("resistant_stripped_lime_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LIME_PLANKS = registerBlock("lime_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LIME_PLANKS = registerBlock("resistant_lime_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> LIME_SAPLING = registerBlock("lime_sapling",
            () -> new SaplingBlock(new LimeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_LIME_SAPLING = BLOCKS.register("potted_sapling_lime",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.LIME_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LIME_LEAVES = registerBlock("lime_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LIME_FRUIT_LEAVES = registerBlock("lime_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> LIME_STAIRS = registerBlock("lime_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.LIME_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LIME_STAIRS = registerBlock("resistant_lime_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_LIME_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_SLAB = registerBlock("lime_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LIME_SLAB = registerBlock("resistant_lime_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_FENCE = registerBlock("lime_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_LIME_FENCE = registerBlock("resistant_lime_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LIME_FENCE_GATE = registerBlock("lime_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_LIME_FENCE_GATE = registerBlock("resistant_lime_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LIME_BUTTON = registerBlock("lime_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> LIME_PRESSURE_PLATE = registerBlock("lime_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> LIME_SIGN = BLOCKS.register("lime_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.LIME));
    public static final RegistryObject<Block> LIME_WALL_SIGN = BLOCKS.register("lime_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.LIME));

    public static final RegistryObject<Block> LIME_HANGING_SIGN = BLOCKS.register("lime_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.LIME));
    public static final RegistryObject<Block> LIME_WALL_HANGING_SIGN = BLOCKS.register("lime_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.LIME));

    public static final RegistryObject<Block> LIME_DOOR = registerBlock("lime_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> LIME_TRAPDOOR = registerBlock("lime_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> MAHOGANY_LOG = registerBlock("mahogany_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_LOG = registerBlock("resistant_mahogany_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> MAHOGANY_WOOD = registerBlock("mahogany_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_WOOD = registerBlock("resistant_mahogany_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_LOG = registerBlock("stripped_mahogany_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MAHOGANY_LOG = registerBlock("resistant_stripped_mahogany_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAHOGANY_WOOD = registerBlock("stripped_mahogany_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MAHOGANY_WOOD = registerBlock("resistant_stripped_mahogany_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> MAHOGANY_PLANKS = registerBlock("mahogany_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_PLANKS = registerBlock("resistant_mahogany_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> MAHOGANY_SAPLING = registerBlock("mahogany_sapling",
            () -> new SaplingBlock(new MahoganyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_MAHOGANY_SAPLING = BLOCKS.register("potted_sapling_mahogany",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.MAHOGANY_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> MAHOGANY_LEAVES = registerBlock("mahogany_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MAHOGANY_STAIRS = registerBlock("mahogany_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.MAHOGANY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_STAIRS = registerBlock("resistant_mahogany_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_MAHOGANY_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_SLAB = registerBlock("mahogany_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_SLAB = registerBlock("resistant_mahogany_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_FENCE = registerBlock("mahogany_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_FENCE = registerBlock("resistant_mahogany_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAHOGANY_FENCE_GATE = registerBlock("mahogany_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAHOGANY_FENCE_GATE = registerBlock("resistant_mahogany_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> MAHOGANY_BUTTON = registerBlock("mahogany_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> MAHOGANY_PRESSURE_PLATE = registerBlock("mahogany_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> MAHOGANY_SIGN = BLOCKS.register("mahogany_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_WALL_SIGN = BLOCKS.register("mahogany_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.MAHOGANY));

    public static final RegistryObject<Block> MAHOGANY_HANGING_SIGN = BLOCKS.register("mahogany_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> MAHOGANY_WALL_HANGING_SIGN = BLOCKS.register("mahogany_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.MAHOGANY));

    public static final RegistryObject<Block> MAHOGANY_DOOR = registerBlock("mahogany_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> MAHOGANY_TRAPDOOR = registerBlock("mahogany_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MAPLE_LOG = registerBlock("resistant_maple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_MAPLE_WOOD = registerBlock("resistant_maple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MAPLE_LOG = registerBlock("resistant_stripped_maple_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_MAPLE_WOOD = registerBlock("resistant_stripped_maple_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAPLE_PLANKS = registerBlock("resistant_maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_MAPLE_SAPLING = BLOCKS.register("potted_sapling_maple",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.MAPLE_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> MAPLE_STAIRS = registerBlock("maple_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.MAPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAPLE_STAIRS = registerBlock("resistant_maple_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_MAPLE_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAPLE_SLAB = registerBlock("maple_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAPLE_SLAB = registerBlock("resistant_maple_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAPLE_FENCE = registerBlock("maple_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAPLE_FENCE = registerBlock("resistant_maple_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_MAPLE_FENCE_GATE = registerBlock("resistant_maple_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> MAPLE_BUTTON = registerBlock("maple_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_HANGING_SIGN = BLOCKS.register("maple_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.MAPLE));
    public static final RegistryObject<Block> MAPLE_WALL_HANGING_SIGN = BLOCKS.register("maple_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_DOOR = registerBlock("maple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> PALM_LOG = registerBlock("palm_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PALM_LOG = registerBlock("resistant_palm_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PALM_WOOD = registerBlock("palm_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PALM_WOOD = registerBlock("resistant_palm_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PALM_LOG = registerBlock("resistant_stripped_palm_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PALM_WOOD = registerBlock("resistant_stripped_palm_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PALM_PLANKS = registerBlock("palm_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PALM_PLANKS = registerBlock("resistant_palm_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> PALM_SAPLING = registerBlock("palm_sapling",
            () -> new REOSaplingBlock(new PalmTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.SAND));
    public static final RegistryObject<Block> POTTED_PALM_SAPLING = BLOCKS.register("potted_sapling_palm",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.PALM_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> PALM_LEAVES = registerBlock("palm_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PALM_STAIRS = registerBlock("palm_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PALM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PALM_STAIRS = registerBlock("resistant_palm_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_PALM_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_SLAB = registerBlock("palm_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PALM_SLAB = registerBlock("resistant_palm_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_FENCE = registerBlock("palm_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PALM_FENCE = registerBlock("resistant_palm_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_PALM_FENCE_GATE = registerBlock("resistant_palm_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PALM_BUTTON = registerBlock("palm_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> PALM_SIGN = BLOCKS.register("palm_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_SIGN = BLOCKS.register("palm_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PALM));

    public static final RegistryObject<Block> PALM_HANGING_SIGN = BLOCKS.register("palm_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PALM));
    public static final RegistryObject<Block> PALM_WALL_HANGING_SIGN = BLOCKS.register("palm_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PALM));

    public static final RegistryObject<Block> PALM_DOOR = registerBlock("palm_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PALM_TRAPDOOR = registerBlock("palm_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> PAPAYA_LOG = registerBlock("papaya_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_LOG = registerBlock("resistant_papaya_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PAPAYA_WOOD = registerBlock("papaya_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_WOOD = registerBlock("resistant_papaya_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAPAYA_LOG = registerBlock("stripped_papaya_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PAPAYA_LOG = registerBlock("resistant_stripped_papaya_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PAPAYA_WOOD = registerBlock("stripped_papaya_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PAPAYA_WOOD = registerBlock("resistant_stripped_papaya_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PAPAYA_PLANKS = registerBlock("papaya_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_PLANKS = registerBlock("resistant_papaya_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> PAPAYA_SAPLING = registerBlock("papaya_sapling",
            () -> new SaplingBlock(new PapayaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PAPAYA_SAPLING = BLOCKS.register("potted_sapling_papaya",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.PAPAYA_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> PAPAYA_LEAVES = registerBlock("papaya_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PAPAYA_FRUIT_LEAVES = registerBlock("papaya_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PAPAYA_STAIRS = registerBlock("papaya_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PAPAYA_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_STAIRS = registerBlock("resistant_papaya_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_PAPAYA_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PAPAYA_SLAB = registerBlock("papaya_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_SLAB = registerBlock("resistant_papaya_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PAPAYA_FENCE = registerBlock("papaya_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_FENCE = registerBlock("resistant_papaya_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PAPAYA_FENCE_GATE = registerBlock("papaya_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_PAPAYA_FENCE_GATE = registerBlock("resistant_papaya_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PAPAYA_BUTTON = registerBlock("papaya_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PAPAYA_PRESSURE_PLATE = registerBlock("papaya_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> PAPAYA_SIGN = BLOCKS.register("papaya_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PAPAYA));
    public static final RegistryObject<Block> PAPAYA_WALL_SIGN = BLOCKS.register("papaya_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PAPAYA));

    public static final RegistryObject<Block> PAPAYA_HANGING_SIGN = BLOCKS.register("papaya_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PAPAYA));
    public static final RegistryObject<Block> PAPAYA_WALL_HANGING_SIGN = BLOCKS.register("papaya_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PAPAYA));

    public static final RegistryObject<Block> PAPAYA_DOOR = registerBlock("papaya_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PAPAYA_TRAPDOOR = registerBlock("papaya_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> PINE_LOG = registerBlock("pine_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PINE_LOG = registerBlock("resistant_pine_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PINE_WOOD = registerBlock("pine_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PINE_WOOD = registerBlock("resistant_pine_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PINE_LOG = registerBlock("resistant_stripped_pine_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PINE_WOOD = registerBlock("resistant_stripped_pine_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PINE_PLANKS = registerBlock("pine_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PINE_PLANKS = registerBlock("resistant_pine_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> PINE_SAPLING = registerBlock("pine_sapling",
            () -> new SaplingBlock(new PineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PINE_SAPLING = BLOCKS.register("potted_sapling_pine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.PINE_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> PINE_LEAVES = registerBlock("pine_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PINE_STAIRS = registerBlock("pine_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PINE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PINE_STAIRS = registerBlock("resistant_pine_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_PINE_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINE_SLAB = registerBlock("pine_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PINE_SLAB = registerBlock("resistant_pine_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINE_FENCE = registerBlock("pine_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PINE_FENCE = registerBlock("resistant_pine_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINE_FENCE_GATE = registerBlock("pine_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_PINE_FENCE_GATE = registerBlock("resistant_pine_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PINE_BUTTON = registerBlock("pine_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> PINE_SIGN = BLOCKS.register("pine_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_SIGN = BLOCKS.register("pine_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PINE));

    public static final RegistryObject<Block> PINE_HANGING_SIGN = BLOCKS.register("pine_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PINE));
    public static final RegistryObject<Block> PINE_WALL_HANGING_SIGN = BLOCKS.register("pine_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PINE));

    public static final RegistryObject<Block> PINE_DOOR = registerBlock("pine_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PINE_TRAPDOOR = registerBlock("pine_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> PLUM_LOG = registerBlock("plum_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PLUM_LOG = registerBlock("resistant_plum_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> PLUM_WOOD = registerBlock("plum_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_PLUM_WOOD = registerBlock("resistant_plum_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PLUM_LOG = registerBlock("stripped_plum_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PLUM_LOG = registerBlock("resistant_stripped_plum_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_PLUM_WOOD = registerBlock("stripped_plum_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_PLUM_WOOD = registerBlock("resistant_stripped_plum_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLUM_PLANKS = registerBlock("plum_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PLUM_PLANKS = registerBlock("resistant_plum_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> PLUM_SAPLING = registerBlock("plum_sapling",
            () -> new SaplingBlock(new PlumTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_PLUM_SAPLING = BLOCKS.register("potted_sapling_plum",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.PLUM_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> PLUM_LEAVES = registerBlock("plum_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> PLUM_FRUIT_LEAVES = registerBlock("plum_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> PLUM_STAIRS = registerBlock("plum_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLUM_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PLUM_STAIRS = registerBlock("resistant_plum_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_PLUM_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PLUM_SLAB = registerBlock("plum_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PLUM_SLAB = registerBlock("resistant_plum_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PLUM_FENCE = registerBlock("plum_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_PLUM_FENCE = registerBlock("resistant_plum_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PLUM_FENCE_GATE = registerBlock("plum_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_PLUM_FENCE_GATE = registerBlock("resistant_plum_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> PLUM_BUTTON = registerBlock("plum_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PLUM_PRESSURE_PLATE = registerBlock("plum_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> PLUM_SIGN = BLOCKS.register("plum_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PLUM));
    public static final RegistryObject<Block> PLUM_WALL_SIGN = BLOCKS.register("plum_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PLUM));

    public static final RegistryObject<Block> PLUM_HANGING_SIGN = BLOCKS.register("plum_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PLUM));
    public static final RegistryObject<Block> PLUM_WALL_HANGING_SIGN = BLOCKS.register("plum_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PLUM));

    public static final RegistryObject<Block> PLUM_DOOR = registerBlock("plum_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> PLUM_TRAPDOOR = registerBlock("plum_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> POPLAR_LOG = registerBlock("poplar_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_POPLAR_LOG = registerBlock("resistant_poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> POPLAR_WOOD = registerBlock("poplar_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_POPLAR_WOOD = registerBlock("resistant_poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_LOG = registerBlock("stripped_poplar_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_POPLAR_LOG = registerBlock("resistant_stripped_poplar_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_POPLAR_WOOD = registerBlock("stripped_poplar_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_POPLAR_WOOD = registerBlock("resistant_stripped_poplar_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> POPLAR_PLANKS = registerBlock("poplar_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_POPLAR_PLANKS = registerBlock("resistant_poplar_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> POPLAR_SAPLING = registerBlock("poplar_sapling",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_POPLAR_SAPLING = BLOCKS.register("potted_sapling_poplar",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.POPLAR_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> POPLAR_LEAVES = registerBlock("poplar_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> POPLAR_STAIRS = registerBlock("poplar_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.POPLAR_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_POPLAR_STAIRS = registerBlock("resistant_poplar_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_POPLAR_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> POPLAR_SLAB = registerBlock("poplar_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_POPLAR_SLAB = registerBlock("resistant_poplar_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> POPLAR_FENCE = registerBlock("poplar_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_POPLAR_FENCE = registerBlock("resistant_poplar_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> POPLAR_FENCE_GATE = registerBlock("poplar_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_POPLAR_FENCE_GATE = registerBlock("resistant_poplar_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> POPLAR_BUTTON = registerBlock("poplar_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> POPLAR_PRESSURE_PLATE = registerBlock("poplar_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> POPLAR_SIGN = BLOCKS.register("poplar_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.POPLAR));
    public static final RegistryObject<Block> POPLAR_WALL_SIGN = BLOCKS.register("poplar_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.POPLAR));

    public static final RegistryObject<Block> POPLAR_HANGING_SIGN = BLOCKS.register("poplar_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.POPLAR));
    public static final RegistryObject<Block> POPLAR_WALL_HANGING_SIGN = BLOCKS.register("poplar_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.POPLAR));

    public static final RegistryObject<Block> POPLAR_DOOR = registerBlock("poplar_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> POPLAR_TRAPDOOR = registerBlock("poplar_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> REDWOOD_LOG = registerBlock("redwood_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_LOG = registerBlock("resistant_redwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> REDWOOD_WOOD = registerBlock("redwood_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_WOOD = registerBlock("resistant_redwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_REDWOOD_LOG = registerBlock("resistant_stripped_redwood_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_REDWOOD_WOOD = registerBlock("resistant_stripped_redwood_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> REDWOOD_PLANKS = registerBlock("redwood_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_PLANKS = registerBlock("resistant_redwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> REDWOOD_SAPLING = registerBlock("redwood_sapling",
            () -> new SaplingBlock(new RedwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_REDWOOD_SAPLING = BLOCKS.register("potted_sapling_redwood",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.REDWOOD_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> REDWOOD_LEAVES = registerBlock("redwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> REDWOOD_STAIRS = registerBlock("redwood_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.REDWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_STAIRS = registerBlock("resistant_redwood_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_REDWOOD_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_SLAB = registerBlock("redwood_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_SLAB = registerBlock("resistant_redwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_FENCE = registerBlock("redwood_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_FENCE = registerBlock("resistant_redwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_REDWOOD_FENCE_GATE = registerBlock("resistant_redwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> REDWOOD_BUTTON = registerBlock("redwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> REDWOOD_SIGN = BLOCKS.register("redwood_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.REDWOOD));
    public static final RegistryObject<Block> REDWOOD_WALL_SIGN = BLOCKS.register("redwood_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.REDWOOD));

    public static final RegistryObject<Block> REDWOOD_HANGING_SIGN = BLOCKS.register("redwood_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.REDWOOD));
    public static final RegistryObject<Block> REDWOOD_WALL_HANGING_SIGN = BLOCKS.register("redwood_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.REDWOOD));

    public static final RegistryObject<Block> REDWOOD_DOOR = registerBlock("redwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> RUBBER_LOG = registerBlock("rubber_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RUBBER_LOG_SAP = registerBlock("rubber_log_sap",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_RUBBER_LOG = registerBlock("resistant_rubber_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RUBBER_WOOD = registerBlock("rubber_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RUBBER_WOOD_SAP = registerBlock("rubber_wood_sap",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_RUBBER_WOOD = registerBlock("resistant_rubber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_LOG = registerBlock("stripped_rubber_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_RUBBER_LOG = registerBlock("resistant_stripped_rubber_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_RUBBER_WOOD = registerBlock("stripped_rubber_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_RUBBER_WOOD = registerBlock("resistant_stripped_rubber_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RUBBER_PLANKS = registerBlock("rubber_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_RUBBER_PLANKS = registerBlock("resistant_rubber_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> RUBBER_SAPLING = registerBlock("rubber_sapling",
            () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_RUBBER_SAPLING = BLOCKS.register("potted_sapling_rubber",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.RUBBER_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> RUBBER_LEAVES = registerBlock("rubber_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> RUBBER_STAIRS = registerBlock("rubber_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.RUBBER_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_RUBBER_STAIRS = registerBlock("resistant_rubber_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_RUBBER_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_SLAB = registerBlock("rubber_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_RUBBER_SLAB = registerBlock("resistant_rubber_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_FENCE = registerBlock("rubber_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_RUBBER_FENCE = registerBlock("resistant_rubber_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RUBBER_FENCE_GATE = registerBlock("rubber_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_RUBBER_FENCE_GATE = registerBlock("resistant_rubber_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> RUBBER_BUTTON = registerBlock("rubber_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> RUBBER_PRESSURE_PLATE = registerBlock("rubber_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> RUBBER_SIGN = BLOCKS.register("rubber_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.RUBBER));
    public static final RegistryObject<Block> RUBBER_WALL_SIGN = BLOCKS.register("rubber_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.RUBBER));

    public static final RegistryObject<Block> RUBBER_HANGING_SIGN = BLOCKS.register("rubber_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.RUBBER));
    public static final RegistryObject<Block> RUBBER_WALL_HANGING_SIGN = BLOCKS.register("rubber_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.RUBBER));

    public static final RegistryObject<Block> RUBBER_DOOR = registerBlock("rubber_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> RUBBER_TRAPDOOR = registerBlock("rubber_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> TEAK_LOG = registerBlock("teak_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_TEAK_LOG = registerBlock("resistant_teak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> TEAK_WOOD = registerBlock("teak_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_TEAK_WOOD = registerBlock("resistant_teak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_TEAK_LOG = registerBlock("stripped_teak_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_TEAK_LOG = registerBlock("resistant_stripped_teak_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_TEAK_WOOD = registerBlock("stripped_teak_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_TEAK_WOOD = registerBlock("resistant_stripped_teak_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> TEAK_PLANKS = registerBlock("teak_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_TEAK_PLANKS = registerBlock("resistant_teak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> TEAK_SAPLING = registerBlock("teak_sapling",
            () -> new SaplingBlock(new TeakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_TEAK_SAPLING = BLOCKS.register("potted_sapling_teak",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.TEAK_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> TEAK_LEAVES = registerBlock("teak_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> TEAK_STAIRS = registerBlock("teak_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.TEAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_TEAK_STAIRS = registerBlock("resistant_teak_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_TEAK_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TEAK_SLAB = registerBlock("teak_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_TEAK_SLAB = registerBlock("resistant_teak_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TEAK_FENCE = registerBlock("teak_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_TEAK_FENCE = registerBlock("resistant_teak_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TEAK_FENCE_GATE = registerBlock("teak_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_TEAK_FENCE_GATE = registerBlock("resistant_teak_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> TEAK_BUTTON = registerBlock("teak_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> TEAK_PRESSURE_PLATE = registerBlock("teak_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> TEAK_SIGN = BLOCKS.register("teak_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_WALL_SIGN = BLOCKS.register("teak_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.TEAK));

    public static final RegistryObject<Block> TEAK_HANGING_SIGN = BLOCKS.register("teak_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.TEAK));
    public static final RegistryObject<Block> TEAK_WALL_HANGING_SIGN = BLOCKS.register("teak_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.TEAK));

    public static final RegistryObject<Block> TEAK_DOOR = registerBlock("teak_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TEAK_TRAPDOOR = registerBlock("teak_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> WALNUT_LOG = registerBlock("walnut_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_WALNUT_LOG = registerBlock("resistant_walnut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WALNUT_WOOD = registerBlock("walnut_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_WALNUT_WOOD = registerBlock("resistant_walnut_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WALNUT_LOG = registerBlock("stripped_walnut_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_WALNUT_LOG = registerBlock("resistant_stripped_walnut_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WALNUT_WOOD = registerBlock("stripped_walnut_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_WALNUT_WOOD = registerBlock("resistant_stripped_walnut_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WALNUT_PLANKS = registerBlock("walnut_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WALNUT_PLANKS = registerBlock("resistant_walnut_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> WALNUT_SAPLING = registerBlock("walnut_sapling",
            () -> new SaplingBlock(new WalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_WALNUT_SAPLING = BLOCKS.register("potted_sapling_walnut",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.WALNUT_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> WALNUT_LEAVES = registerBlock("walnut_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WALNUT_FRUIT_LEAVES = registerBlock("walnut_fruit_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> WALNUT_STAIRS = registerBlock("walnut_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.WALNUT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WALNUT_STAIRS = registerBlock("resistant_walnut_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_WALNUT_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WALNUT_SLAB = registerBlock("walnut_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WALNUT_SLAB = registerBlock("resistant_walnut_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WALNUT_FENCE = registerBlock("walnut_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WALNUT_FENCE = registerBlock("resistant_walnut_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WALNUT_FENCE_GATE = registerBlock("walnut_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_WALNUT_FENCE_GATE = registerBlock("resistant_walnut_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WALNUT_BUTTON = registerBlock("walnut_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WALNUT_PRESSURE_PLATE = registerBlock("walnut_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> WALNUT_SIGN = BLOCKS.register("walnut_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_WALL_SIGN = BLOCKS.register("walnut_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.WALNUT));

    public static final RegistryObject<Block> WALNUT_HANGING_SIGN = BLOCKS.register("walnut_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.WALNUT));
    public static final RegistryObject<Block> WALNUT_WALL_HANGING_SIGN = BLOCKS.register("walnut_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.WALNUT));

    public static final RegistryObject<Block> WALNUT_DOOR = registerBlock("walnut_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WALNUT_TRAPDOOR = registerBlock("walnut_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_WILLOW_LOG = registerBlock("resistant_willow_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_WILLOW_WOOD = registerBlock("resistant_willow_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_WILLOW_LOG = registerBlock("resistant_stripped_willow_log",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> RESISTANT_STRIPPED_WILLOW_WOOD = registerBlock("resistant_stripped_willow_wood",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WILLOW_PLANKS = registerBlock("resistant_willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_WILLOW_SAPLING = BLOCKS.register("potted_sapling_willow",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.WILLOW_SAPLING,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> WILLOW_STAIRS = registerBlock("willow_stairs",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WILLOW_STAIRS = registerBlock("resistant_willow_stairs",
            () -> new StairBlock(() -> REOBlocks.RESISTANT_WILLOW_PLANKS.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_SLAB = registerBlock("willow_slab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WILLOW_SLAB = registerBlock("resistant_willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_FENCE = registerBlock("willow_fence",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> RESISTANT_WILLOW_FENCE = registerBlock("resistant_willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> RESISTANT_WILLOW_FENCE_GATE = registerBlock("resistant_willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> WILLOW_BUTTON = registerBlock("willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> WILLOW_SIGN = BLOCKS.register("willow_sign",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_WALL_SIGN = BLOCKS.register("willow_wall_sign",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_HANGING_SIGN = BLOCKS.register("willow_hanging_sign",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.WILLOW));
    public static final RegistryObject<Block> WILLOW_WALL_HANGING_SIGN = BLOCKS.register("willow_wall_hanging_sign",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.WILLOW));

    public static final RegistryObject<Block> WILLOW_DOOR = registerBlock("willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));



    // Misc //
    public static final RegistryObject<Block> WAX_BLOCK = registerBlock("wax_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    // Tech//
    // Machines
    // Coal
    public static final RegistryObject<Block> KILN = registerBlock("kiln",
            () -> new KilnBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .lightLevel((state) -> state.getValue(KilnBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> CRUSHER = registerBlock("crusher",
            () -> new BasicCrusherBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .lightLevel((state) -> state.getValue(BasicCrusherBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> EXTRACTOR = registerBlock("extractor",
            () -> new BasicExtractorBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .lightLevel((state) -> state.getValue(BasicExtractorBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> PURIFIER = registerBlock("purifier",
            () -> new BasicPurifierBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .lightLevel((state) -> state.getValue(BasicPurifierBlock.LIT) ? 13 : 0).noOcclusion()));

    // Electric
    public static final RegistryObject<Block> ELECTRIC_FURNACE = registerBlock("electric_furnace",
            () -> new ElectricFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(ElectricFurnaceBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_CRUSHER = registerBlock("electric_crusher",
            () -> new CrusherBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(CrusherBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_PURIFIER = registerBlock("electric_purifier",
            () -> new PurifierBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(PurifierBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_ALLOY_FURNACE = registerBlock("electric_alloy_furnace",
            () -> new AlloyFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(AlloyFurnaceBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_SAWMILL = registerBlock("electric_sawmill",
            () -> new SawmillBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(SawmillBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_EXTRACTOR = registerBlock("electric_extractor",
            () -> new ExtractorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(ExtractorBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_COMPRESSOR = registerBlock("electric_compressor",
            () -> new CompressorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(CompressorBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_CENTRIFUGE = registerBlock("electric_centrifuge",
            () -> new CentrifugeBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(CentrifugeBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_INDUCTION_FURNACE = registerBlock("electric_induction_furnace",
            () -> new InductionFurnaceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(InductionFurnaceBlock.LIT) ? 13 : 0).noOcclusion()));
    public static final RegistryObject<Block> ELECTRIC_TRANSFUSER = registerBlock("electric_transfuser",
            () -> new TransfuserBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> state.getValue(TransfuserBlock.LIT) ? 13 : 0).noOcclusion()));

    // Generator
    public static final RegistryObject<Block> COAL_GENERATOR = registerBlock("coal_generator",
            () -> new CoalGenBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)
                    .lightLevel((state) -> state.getValue(CoalGenBlock.LIT) ? 13 : 0).noOcclusion()));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return REOItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}