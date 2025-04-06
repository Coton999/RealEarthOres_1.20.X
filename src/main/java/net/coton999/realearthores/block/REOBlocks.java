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
    public static final RegistryObject<Block> BLOCK_ALUMINIUM = registerBlock("block_aluminium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BLOCK_BRASS = registerBlock("block_brass",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BLOCK_BRONZE = registerBlock("block_bronze",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BLOCK_ELECTRUM = registerBlock("block_electrum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(4f)));
    public static final RegistryObject<Block> BLOCK_ENDERITE = registerBlock("block_enderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_LEAD = registerBlock("block_lead",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_NICKEL = registerBlock("block_nickel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_PERIDOT = registerBlock("block_peridot",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> BLOCK_PLATINUM = registerBlock("block_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_RUBY = registerBlock("block_ruby",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> BLOCK_SAPPHIRE = registerBlock("block_sapphire",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5f)));
    public static final RegistryObject<Block> BLOCK_SILVER = registerBlock("block_silver",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_STEEL = registerBlock("block_steel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_TIN = registerBlock("block_tin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_URANIUM = registerBlock("block_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(4f)));
    public static final RegistryObject<Block> BLOCK_ZINC = registerBlock("block_zinc",
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
    public static final RegistryObject<Block> BLOCK_RAW_ALUMINIUM = registerBlock("block_raw_aluminium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_ENDERITE = registerBlock("block_raw_enderite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_LEAD = registerBlock("block_raw_lead",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_NICKEL = registerBlock("block_raw_nickel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_PLATINUM = registerBlock("block_raw_platinum",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_SILVER = registerBlock("block_raw_silver",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_TIN = registerBlock("block_raw_tin",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_URANIUM = registerBlock("block_raw_uranium",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));
    public static final RegistryObject<Block> BLOCK_RAW_ZINC = registerBlock("block_raw_zinc",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(5f)));

    // Overworld Ores
    public static final RegistryObject<Block> ORE_ALUMINIUM = registerBlock("ore_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_LEAD = registerBlock("ore_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_NICKEL = registerBlock("ore_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_PLATINUM = registerBlock("ore_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_SILVER = registerBlock("ore_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_TIN = registerBlock("ore_tin",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_URANIUM = registerBlock("ore_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ORE_ZINC = registerBlock("ore_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f), UniformInt.of(2, 6)));

    // Cluster
    public static final RegistryObject<Block> CLUSTER_PERIDOT = registerBlock("cluster_peridot",
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


    public static final RegistryObject<Block> CLUSTER_RUBY = registerBlock("cluster_ruby",
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


    public static final RegistryObject<Block> CLUSTER_SAPPHIRE = registerBlock("cluster_sapphire",
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
    public static final RegistryObject<Block> GRAVEL_ORE_ALUMINIUM = registerBlock("gravel_ore_aluminium",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_COAL = registerBlock("gravel_ore_coal",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_COPPER = registerBlock("gravel_ore_copper",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_DIAMOND = registerBlock("gravel_ore_diamond",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_EMERALD = registerBlock("gravel_ore_emerald",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_GOLD = registerBlock("gravel_ore_gold",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_IRON = registerBlock("gravel_ore_iron",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_LAPIS = registerBlock("gravel_ore_lapis",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_LEAD = registerBlock("gravel_ore_lead",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_NICKEL = registerBlock("gravel_ore_nickel",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_PLATINUM = registerBlock("gravel_ore_platinum",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_REDSTONE = registerBlock("gravel_ore_redstone",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_SILVER = registerBlock("gravel_ore_silver",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_TIN = registerBlock("gravel_ore_tin",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_URANIUM = registerBlock("gravel_ore_uranium",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAVEL_ORE_ZINC = registerBlock("gravel_ore_zinc",
            () -> new GravelOreBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .sound(SoundType.GRAVEL).strength(3f), UniformInt.of(2, 6)));

    // Deepslate Ores
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM = registerBlock("deepslate_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_LEAD = registerBlock("deepslate_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_NICKEL = registerBlock("deepslate_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM = registerBlock("deepslate_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER = registerBlock("deepslate_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_URANIUM = registerBlock("deepslate_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE)
                    .strength(4.5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ZINC = registerBlock("deepslate_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .sound(SoundType.DEEPSLATE).strength(4.5f), UniformInt.of(2, 6)));

    // Nether Ore
    public static final RegistryObject<Block> NETHER_ALUMINIUM = registerBlock("nether_aluminium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_COAL = registerBlock("nether_coal",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_COPPER = registerBlock("nether_copper",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_DIAMOND = registerBlock("nether_diamond",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_EMERALD = registerBlock("nether_emerald",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_IRON = registerBlock("nether_iron",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_LAPIS = registerBlock("nether_lapis",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_LEAD = registerBlock("nether_lead",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_NICKEL = registerBlock("nether_nickel",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_PLATINUM = registerBlock("nether_platinum",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_REDSTONE = registerBlock("nether_redstone",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_SILVER = registerBlock("nether_silver",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_TIN = registerBlock("nether_tin",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_URANIUM = registerBlock("nether_uranium",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(5f), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NETHER_ZINC = registerBlock("nether_zinc",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .sound(SoundType.NETHER_ORE).strength(3f), UniformInt.of(2, 6)));

    // End Ore
    public static final RegistryObject<Block> ORE_ENDERITE = registerBlock("ore_enderite",
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
    public static final RegistryObject<Block> LAMP_BLACK = registerBlock("lamp_black",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_RED = registerBlock("lamp_red",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_GREEN = registerBlock("lamp_green",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_BROWN = registerBlock("lamp_brown",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_PURPLE = registerBlock("lamp_purple",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_CYAN = registerBlock("lamp_cyan",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_LIGHTGRAY = registerBlock("lamp_lightgray",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_GRAY = registerBlock("lamp_gray",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_PINK = registerBlock("lamp_pink",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_LIME = registerBlock("lamp_lime",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_YELLOW = registerBlock("lamp_yellow",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_BLUE = registerBlock("lamp_blue",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_LIGHTBLUE = registerBlock("lamp_lightblue",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_MAGENTA = registerBlock("lamp_magenta",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_ORANGE = registerBlock("lamp_orange",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LAMP_WHITE = registerBlock("lamp_white",
            () -> new LampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)
                    .strength(0.3F).sound(SoundType.GLASS)));

    // Crops //
    // Ores
    //public static final RegistryObject<Block> CROP_ALUMINIUM = BLOCKS.register("crop_aluminium",
    //        () -> new OreCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    // Food
    public static final RegistryObject<Block> CROP_BARLEY = BLOCKS.register("crop_barley",
            () -> new BarleyBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CROP_CAULIFLOWER = BLOCKS.register("crop_cauliflower",
            () -> new CauliflowerBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CROP_COTTON = BLOCKS.register("crop_cotton",
            () -> new CottonBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CROP_ONIONS = BLOCKS.register("crop_onions",
            () -> new OnionsBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CROP_RICE = BLOCKS.register("crop_rice",
            () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CROP_TOMATO = BLOCKS.register("crop_tomato",
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
    public static final RegistryObject<Block> FRUIT_CITRUS_BLOCK = BLOCKS.register("fruit_citrus_block",
            () -> new CitrusBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> FRUIT_LIME_BLOCK = BLOCKS.register("fruit_lime_block",
            () -> new LimeBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> FRUIT_PAPAYA_BLOCK = BLOCKS.register("fruit_papaya_block",
            () -> new PapayaBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> FRUIT_PEAR_BLOCK = BLOCKS.register("fruit_pear_block",
            () -> new PearBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> FRUIT_PLUM_BLOCK = BLOCKS.register("fruit_plum_block",
            () -> new PlumBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));
    public static final RegistryObject<Block> FRUIT_WALNUT_BLOCK = BLOCKS.register("fruit_walnut_block",
            () -> new WalnutBlock(BlockBehaviour.Properties.copy(Blocks.POTATOES).noOcclusion().noCollission()));

    // Berry
    public static final RegistryObject<Block> BERRY_BLACKBERRY_BLOCK = BLOCKS.register("berry_blackberry_block",
            () -> new BlackberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> BERRY_BLUEBERRY_BLOCK = BLOCKS.register("berry_blueberry_block",
            () -> new BlueberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> BERRY_RASPBERRY_BLOCK = BLOCKS.register("berry_raspberry_block",
            () -> new RaspberryBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH)));

    // Wood
    // Vanilla
    public static final RegistryObject<Block> LOG_OAK_RESISTANT = registerBlock("log_oak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_OAK_RESISTANT = registerBlock("wood_oak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_OAK_STRIPPED_RESISTANT = registerBlock("log_oak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_OAK_STRIPPED_RESISTANT = registerBlock("wood_oak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_OAK_RESISTANT = registerBlock("planks_oak_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> STAIRS_OAK_RESISTANT = registerBlock("stairs_oak_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_OAK_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_OAK_RESISTANT = registerBlock("slab_oak_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_OAK_RESISTANT = registerBlock("fence_oak_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_OAK_RESISTANT = registerBlock("fence_gate_oak_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_SPRUCE_RESISTANT = registerBlock("log_spruce_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_SPRUCE_RESISTANT = registerBlock("wood_spruce_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_SPRUCE_STRIPPED_RESISTANT = registerBlock("log_spruce_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_SPRUCE_STRIPPED_RESISTANT = registerBlock("wood_spruce_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_SPRUCE_RESISTANT = registerBlock("planks_spruce_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> STAIRS_SPRUCE_RESISTANT = registerBlock("stairs_spruce_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_SPRUCE_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_SPRUCE_RESISTANT = registerBlock("slab_spruce_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_SPRUCE_RESISTANT = registerBlock("fence_spruce_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_SPRUCE_RESISTANT = registerBlock("fence_gate_spruce_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_BIRCH_RESISTANT = registerBlock("log_birch_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BIRCH_RESISTANT = registerBlock("wood_birch_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_BIRCH_STRIPPED_RESISTANT = registerBlock("log_birch_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BIRCH_STRIPPED_RESISTANT = registerBlock("wood_birch_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_BIRCH_RESISTANT = registerBlock("planks_birch_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> STAIRS_BIRCH_RESISTANT = registerBlock("stairs_birch_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_BIRCH_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_BIRCH_RESISTANT = registerBlock("slab_birch_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_BIRCH_RESISTANT = registerBlock("fence_birch_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_BIRCH_RESISTANT = registerBlock("fence_gate_birch_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_JUNGLE_RESISTANT = registerBlock("log_jungle_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_JUNGLE_RESISTANT = registerBlock("wood_jungle_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_JUNGLE_STRIPPED_RESISTANT = registerBlock("log_jungle_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_JUNGLE_STRIPPED_RESISTANT = registerBlock("wood_jungle_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_JUNGLE_RESISTANT = registerBlock("planks_jungle_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> STAIRS_JUNGLE_RESISTANT = registerBlock("stairs_jungle_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_JUNGLE_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_JUNGLE_RESISTANT = registerBlock("slab_jungle_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_JUNGLE_RESISTANT = registerBlock("fence_jungle_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_JUNGLE_RESISTANT = registerBlock("fence_gate_jungle_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_ACACIA_RESISTANT = registerBlock("log_acacia_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_ACACIA_RESISTANT = registerBlock("wood_acacia_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_ACACIA_STRIPPED_RESISTANT = registerBlock("log_acacia_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_ACACIA_STRIPPED_RESISTANT = registerBlock("wood_acacia_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_ACACIA_RESISTANT = registerBlock("planks_acacia_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> STAIRS_ACACIA_RESISTANT = registerBlock("stairs_acacia_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_ACACIA_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_ACACIA_RESISTANT = registerBlock("slab_acacia_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_ACACIA_RESISTANT = registerBlock("fence_acacia_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_ACACIA_RESISTANT = registerBlock("fence_gate_acacia_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_DARK_OAK_RESISTANT = registerBlock("log_dark_oak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_DARK_OAK_RESISTANT = registerBlock("wood_dark_oak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_DARK_OAK_STRIPPED_RESISTANT = registerBlock("log_dark_oak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_DARK_OAK_STRIPPED_RESISTANT = registerBlock("wood_dark_oak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_DARK_OAK_RESISTANT = registerBlock("planks_dark_oak_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> STAIRS_DARK_OAK_RESISTANT = registerBlock("stairs_dark_oak_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_DARK_OAK_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_DARK_OAK_RESISTANT = registerBlock("slab_dark_oak_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_DARK_OAK_RESISTANT = registerBlock("fence_dark_oak_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_DARK_OAK_RESISTANT = registerBlock("fence_gate_dark_oak_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_MANGROVE_RESISTANT = registerBlock("log_mangrove_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MANGROVE_RESISTANT = registerBlock("wood_mangrove_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_MANGROVE_STRIPPED_RESISTANT = registerBlock("log_mangrove_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MANGROVE_STRIPPED_RESISTANT = registerBlock("wood_mangrove_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_MANGROVE_RESISTANT = registerBlock("planks_mangrove_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> STAIRS_MANGROVE_RESISTANT = registerBlock("stairs_mangrove_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_MANGROVE_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_MANGROVE_RESISTANT = registerBlock("slab_mangrove_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_MANGROVE_RESISTANT = registerBlock("fence_mangrove_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_MANGROVE_RESISTANT = registerBlock("fence_gate_mangrove_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_CHERRY_RESISTANT = registerBlock("log_cherry_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHERRY_RESISTANT = registerBlock("wood_cherry_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_CHERRY_STRIPPED_RESISTANT = registerBlock("log_cherry_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHERRY_STRIPPED_RESISTANT = registerBlock("wood_cherry_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_CHERRY_RESISTANT = registerBlock("planks_cherry_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> STAIRS_CHERRY_RESISTANT = registerBlock("stairs_cherry_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_CHERRY_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_CHERRY_RESISTANT = registerBlock("slab_cherry_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_CHERRY_RESISTANT = registerBlock("fence_cherry_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_CHERRY_RESISTANT = registerBlock("fence_gate_cherry_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> LOG_BALSA = registerBlock("log_balsa",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_BALSA_RESISTANT = registerBlock("log_balsa_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BALSA = registerBlock("wood_balsa",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_BALSA_RESISTANT = registerBlock("wood_balsa_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_BALSA_STRIPPED = registerBlock("log_balsa_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_BALSA_STRIPPED_RESISTANT = registerBlock("log_balsa_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BALSA_STRIPPED = registerBlock("wood_balsa_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_BALSA_STRIPPED_RESISTANT = registerBlock("wood_balsa_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_BALSA = registerBlock("planks_balsa",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_BALSA_RESISTANT = registerBlock("planks_balsa_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_BALSA = registerBlock("sapling_balsa",
            () -> new SaplingBlock(new BalsaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_BALSA = BLOCKS.register("potted_sapling_balsa",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_BALSA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_BALSA = registerBlock("leaves_balsa",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_BALSA = registerBlock("stairs_balsa",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_BALSA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_BALSA_RESISTANT = registerBlock("stairs_balsa_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_BALSA_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_BALSA = registerBlock("slab_balsa",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_BALSA_RESISTANT = registerBlock("slab_balsa_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_BALSA = registerBlock("fence_balsa",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_BALSA_RESISTANT = registerBlock("fence_balsa_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_BALSA = registerBlock("fence_gate_balsa",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_BALSA_RESISTANT = registerBlock("fence_gate_balsa_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_BALSA = registerBlock("button_balsa",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_BALSA = registerBlock("pressure_plate_balsa",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_BALSA = BLOCKS.register("sign_balsa",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.BALSA));
    public static final RegistryObject<Block> SIGN_BALSA_WALL = BLOCKS.register("sign_balsa_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.BALSA));

    public static final RegistryObject<Block> SIGN_HANGING_BALSA = BLOCKS.register("sign_hanging_balsa",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.BALSA));
    public static final RegistryObject<Block> SIGN_HANGING_BALSA_WALL = BLOCKS.register("sign_hanging_balsa_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.BALSA));

    public static final RegistryObject<Block> DOOR_BALSA = registerBlock("door_balsa",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_BALSA = registerBlock("trapdoor_balsa",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_BAOBAB = registerBlock("log_baobab",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_BAOBAB_RESISTANT = registerBlock("log_baobab_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BAOBAB = registerBlock("wood_baobab",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_BAOBAB_RESISTANT = registerBlock("wood_baobab_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_BAOBAB_STRIPPED = registerBlock("log_baobab_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_BAOBAB_STRIPPED_RESISTANT = registerBlock("log_baobab_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_BAOBAB_STRIPPED = registerBlock("wood_baobab_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_BAOBAB_STRIPPED_RESISTANT = registerBlock("wood_baobab_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_BAOBAB = registerBlock("planks_baobab",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_BAOBAB_RESISTANT = registerBlock("planks_baobab_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_BAOBAB = registerBlock("sapling_baobab",
            () -> new REOSaplingBlock(new BaobabTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.SAND));
    public static final RegistryObject<Block> POTTED_SAPLING_BAOBAB = BLOCKS.register("potted_sapling_baobab",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_BAOBAB,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_BAOBAB = registerBlock("leaves_baobab",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_BAOBAB = registerBlock("stairs_baobab",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_BAOBAB.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_BAOBAB_RESISTANT = registerBlock("stairs_baobab_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_BAOBAB_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_BAOBAB = registerBlock("slab_baobab",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_BAOBAB_RESISTANT = registerBlock("slab_baobab_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_BAOBAB = registerBlock("fence_baobab",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_BAOBAB_RESISTANT = registerBlock("fence_baobab_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_BAOBAB = registerBlock("fence_gate_baobab",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_BAOBAB_RESISTANT = registerBlock("fence_gate_baobab_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_BAOBAB = registerBlock("button_baobab",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_BAOBAB = registerBlock("pressure_plate_baobab",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_BAOBAB = BLOCKS.register("sign_baobab",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.BAOBAB));
    public static final RegistryObject<Block> SIGN_BAOBAB_WALL = BLOCKS.register("sign_baobab_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.BAOBAB));

    public static final RegistryObject<Block> SIGN_HANGING_BAOBAB = BLOCKS.register("sign_hanging_baobab",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.BAOBAB));
    public static final RegistryObject<Block> SIGN_HANGING_BAOBAB_WALL = BLOCKS.register("sign_hanging_baobab_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.BAOBAB));

    public static final RegistryObject<Block> DOOR_BAOBAB = registerBlock("door_baobab",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_BAOBAB = registerBlock("trapdoor_baobab",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_HILL_CHERRY = registerBlock("log_hill_cherry",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_HILL_CHERRY_RESISTANT = registerBlock("log_hill_cherry_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_HILL_CHERRY = registerBlock("wood_hill_cherry",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_HILL_CHERRY_RESISTANT = registerBlock("wood_hill_cherry_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_HILL_CHERRY_STRIPPED = registerBlock("log_hill_cherry_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_HILL_CHERRY_STRIPPED_RESISTANT = registerBlock("log_hill_cherry_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_HILL_CHERRY_STRIPPED = registerBlock("wood_hill_cherry_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_HILL_CHERRY_STRIPPED_RESISTANT = registerBlock("wood_hill_cherry_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_HILL_CHERRY = registerBlock("planks_hill_cherry",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_HILL_CHERRY_RESISTANT = registerBlock("planks_hill_cherry_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_HILL_CHERRY = registerBlock("sapling_hill_cherry",
            () -> new SaplingBlock(new HillCherryTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_HILL_CHERRY = BLOCKS.register("potted_hill_sapling_cherry",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_HILL_CHERRY,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_HILL_CHERRY = registerBlock("leaves_hill_cherry",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_HILL_CHERRY = registerBlock("stairs_hill_cherry",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_HILL_CHERRY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_HILL_CHERRY_RESISTANT = registerBlock("stairs_hill_cherry_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_HILL_CHERRY = registerBlock("slab_hill_cherry",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_HILL_CHERRY_RESISTANT = registerBlock("slab_hill_cherry_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_HILL_CHERRY = registerBlock("fence_hill_cherry",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_HILL_CHERRY_RESISTANT = registerBlock("fence_hill_cherry_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_HILL_CHERRY = registerBlock("fence_gate_hill_cherry",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_HILL_CHERRY_RESISTANT = registerBlock("fence_gate_hill_cherry_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_HILL_CHERRY = registerBlock("button_hill_cherry",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_HILL_CHERRY = registerBlock("pressure_plate_hill_cherry",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_HILL_CHERRY = BLOCKS.register("sign_hill_cherry",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.HILL_CHERRY));
    public static final RegistryObject<Block> SIGN_HILL_CHERRY_WALL = BLOCKS.register("sign_hill_cherry_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.HILL_CHERRY));

    public static final RegistryObject<Block> SIGN_HANGING_HILL_CHERRY = BLOCKS.register("sign_hanging_hill_cherry",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.HILL_CHERRY));
    public static final RegistryObject<Block> SIGN_HANGING_HILL_CHERRY_WALL = BLOCKS.register("sign_hanging_hill_cherry_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.HILL_CHERRY));

    public static final RegistryObject<Block> DOOR_HILL_CHERRY = registerBlock("door_hill_cherry",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_HILL_CHERRY = registerBlock("trapdoor_hill_cherry",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_CHESTNUT = registerBlock("log_chestnut",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_CHESTNUT_RESISTANT = registerBlock("log_chestnut_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHESTNUT = registerBlock("wood_chestnut",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHESTNUT_RESISTANT = registerBlock("wood_chestnut_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_CHESTNUT_STRIPPED = registerBlock("log_chestnut_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_CHESTNUT_STRIPPED_RESISTANT = registerBlock("log_chestnut_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHESTNUT_STRIPPED = registerBlock("wood_chestnut_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_CHESTNUT_STRIPPED_RESISTANT = registerBlock("wood_chestnut_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_CHESTNUT = registerBlock("planks_chestnut",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_CHESTNUT_RESISTANT = registerBlock("planks_chestnut_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_CHESTNUT = registerBlock("sapling_chestnut",
            () -> new SaplingBlock(new ChestnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_CHESTNUT = BLOCKS.register("potted_sapling_chestnut",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_CHESTNUT,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_CHESTNUT = registerBlock("leaves_chestnut",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_CHESTNUT_FRUIT = registerBlock("leaves_chestnut_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_CHESTNUT = registerBlock("stairs_chestnut",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_CHESTNUT.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_CHESTNUT_RESISTANT = registerBlock("stairs_chestnut_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_CHESTNUT_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_CHESTNUT = registerBlock("slab_chestnut",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_CHESTNUT_RESISTANT = registerBlock("slab_chestnut_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_CHESTNUT = registerBlock("fence_chestnut",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_CHESTNUT_RESISTANT = registerBlock("fence_chestnut_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_CHESTNUT = registerBlock("fence_gate_chestnut",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_CHESTNUT_RESISTANT = registerBlock("fence_gate_chestnut_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_CHESTNUT = registerBlock("button_chestnut",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_CHESTNUT = registerBlock("pressure_plate_chestnut",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_CHESTNUT = BLOCKS.register("sign_chestnut",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.CHESTNUT));
    public static final RegistryObject<Block> SIGN_CHESTNUT_WALL = BLOCKS.register("sign_chestnut_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.CHESTNUT));

    public static final RegistryObject<Block> SIGN_HANGING_CHESTNUT = BLOCKS.register("sign_hanging_chestnut",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.CHESTNUT));
    public static final RegistryObject<Block> SIGN_HANGING_CHESTNUT_WALL = BLOCKS.register("sign_hanging_chestnut_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.CHESTNUT));

    public static final RegistryObject<Block> DOOR_CHESTNUT = registerBlock("door_chestnut",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_CHESTNUT = registerBlock("trapdoor_chestnut",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_CITRUS = registerBlock("log_citrus",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_CITRUS_RESISTANT = registerBlock("log_citrus_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CITRUS = registerBlock("wood_citrus",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_CITRUS_RESISTANT = registerBlock("wood_citrus_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_CITRUS_STRIPPED = registerBlock("log_citrus_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_CITRUS_STRIPPED_RESISTANT = registerBlock("log_citrus_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_CITRUS_STRIPPED = registerBlock("wood_citrus_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_CITRUS_STRIPPED_RESISTANT = registerBlock("wood_citrus_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_CITRUS = registerBlock("planks_citrus",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_CITRUS_RESISTANT = registerBlock("planks_citrus_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_CITRUS = registerBlock("sapling_citrus",
            () -> new SaplingBlock(new CitrusTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_CITRUS = BLOCKS.register("potted_sapling_citrus",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_CITRUS,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_CITRUS = registerBlock("leaves_citrus",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_CITRUS_FRUIT = registerBlock("leaves_citrus_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_CITRUS = registerBlock("stairs_citrus",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_CITRUS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_CITRUS_RESISTANT = registerBlock("stairs_citrus_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_CITRUS_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_CITRUS = registerBlock("slab_citrus",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_CITRUS_RESISTANT = registerBlock("slab_citrus_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_CITRUS = registerBlock("fence_citrus",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_CITRUS_RESISTANT = registerBlock("fence_citrus_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_CITRUS = registerBlock("fence_gate_citrus",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_CITRUS_RESISTANT = registerBlock("fence_gate_citrus_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_CITRUS = registerBlock("button_citrus",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_CITRUS = registerBlock("pressure_plate_citrus",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_CITRUS = BLOCKS.register("sign_citrus",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.CITRUS));
    public static final RegistryObject<Block> SIGN_CITRUS_WALL = BLOCKS.register("sign_citrus_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.CITRUS));

    public static final RegistryObject<Block> SIGN_HANGING_CITRUS = BLOCKS.register("sign_hanging_citrus",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.CITRUS));
    public static final RegistryObject<Block> SIGN_HANGING_CITRUS_WALL = BLOCKS.register("sign_hanging_citrus_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.CITRUS));

    public static final RegistryObject<Block> DOOR_CITRUS = registerBlock("door_citrus",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_CITRUS = registerBlock("trapdoor_citrus",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_EBONY = registerBlock("log_ebony",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_EBONY_RESISTANT = registerBlock("log_ebony_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_EBONY = registerBlock("wood_ebony",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_EBONY_RESISTANT = registerBlock("wood_ebony_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_EBONY_STRIPPED = registerBlock("log_ebony_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_EBONY_STRIPPED_RESISTANT = registerBlock("log_ebony_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_EBONY_STRIPPED = registerBlock("wood_ebony_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_EBONY_STRIPPED_RESISTANT = registerBlock("wood_ebony_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_EBONY = registerBlock("planks_ebony",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_EBONY_RESISTANT = registerBlock("planks_ebony_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_EBONY = registerBlock("sapling_ebony",
            () -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_EBONY = BLOCKS.register("potted_sapling_ebony",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_EBONY,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_EBONY = registerBlock("leaves_ebony",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_EBONY = registerBlock("stairs_ebony",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_EBONY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_EBONY_RESISTANT = registerBlock("stairs_ebony_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_EBONY_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_EBONY = registerBlock("slab_ebony",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_EBONY_RESISTANT = registerBlock("slab_ebony_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_EBONY = registerBlock("fence_ebony",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_EBONY_RESISTANT = registerBlock("fence_ebony_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_EBONY = registerBlock("fence_gate_ebony",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_EBONY_RESISTANT = registerBlock("fence_gate_ebony_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_EBONY = registerBlock("button_ebony",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_EBONY = registerBlock("pressure_plate_ebony",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_EBONY = BLOCKS.register("sign_ebony",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.EBONY));
    public static final RegistryObject<Block> SIGN_EBONY_WALL = BLOCKS.register("sign_ebony_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.EBONY));

    public static final RegistryObject<Block> SIGN_HANGING_EBONY = BLOCKS.register("sign_hanging_ebony",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.EBONY));
    public static final RegistryObject<Block> SIGN_HANGING_EBONY_WALL = BLOCKS.register("sign_hanging_ebony_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.EBONY));

    public static final RegistryObject<Block> DOOR_EBONY = registerBlock("door_ebony",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_EBONY = registerBlock("trapdoor_ebony",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_LARCH = registerBlock("log_larch",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_LARCH_RESISTANT = registerBlock("log_larch_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_LARCH = registerBlock("wood_larch",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_LARCH_RESISTANT = registerBlock("wood_larch_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_LARCH_STRIPPED = registerBlock("log_larch_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_LARCH_STRIPPED_RESISTANT = registerBlock("log_larch_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_LARCH_STRIPPED = registerBlock("wood_larch_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_LARCH_STRIPPED_RESISTANT = registerBlock("wood_larch_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_LARCH = registerBlock("planks_larch",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_LARCH_RESISTANT = registerBlock("planks_larch_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_LARCH = registerBlock("sapling_larch",
            () -> new SaplingBlock(new LarchTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_LARCH = BLOCKS.register("potted_sapling_larch",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_LARCH,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_LARCH = registerBlock("leaves_larch",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_LARCH = registerBlock("stairs_larch",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_LARCH.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_LARCH_RESISTANT = registerBlock("stairs_larch_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_LARCH_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_LARCH = registerBlock("slab_larch",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_LARCH_RESISTANT = registerBlock("slab_larch_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_LARCH = registerBlock("fence_larch",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_LARCH_RESISTANT = registerBlock("fence_larch_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_LARCH = registerBlock("fence_gate_larch",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_LARCH_RESISTANT = registerBlock("fence_gate_larch_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_LARCH = registerBlock("button_larch",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_LARCH = registerBlock("pressure_plate_larch",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_LARCH = BLOCKS.register("sign_larch",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.LARCH));
    public static final RegistryObject<Block> SIGN_LARCH_WALL = BLOCKS.register("sign_larch_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.LARCH));

    public static final RegistryObject<Block> SIGN_HANGING_LARCH = BLOCKS.register("sign_hanging_larch",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.LARCH));
    public static final RegistryObject<Block> SIGN_HANGING_LARCH_WALL = BLOCKS.register("sign_hanging_larch_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.LARCH));

    public static final RegistryObject<Block> DOOR_LARCH = registerBlock("door_larch",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_LARCH = registerBlock("trapdoor_larch",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_LIME = registerBlock("log_lime",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_LIME_RESISTANT = registerBlock("log_lime_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_LIME = registerBlock("wood_lime",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_LIME_RESISTANT = registerBlock("wood_lime_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_LIME_STRIPPED = registerBlock("log_lime_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_LIME_STRIPPED_RESISTANT = registerBlock("log_lime_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_LIME_STRIPPED = registerBlock("wood_lime_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_LIME_STRIPPED_RESISTANT = registerBlock("wood_lime_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_LIME = registerBlock("planks_lime",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_LIME_RESISTANT = registerBlock("planks_lime_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_LIME = registerBlock("sapling_lime",
            () -> new SaplingBlock(new LimeTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_LIME = BLOCKS.register("potted_sapling_lime",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_LIME,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_LIME = registerBlock("leaves_lime",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_LIME_FRUIT = registerBlock("leaves_lime_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_LIME = registerBlock("stairs_lime",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_LIME.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_LIME_RESISTANT = registerBlock("stairs_lime_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_LIME_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_LIME = registerBlock("slab_lime",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_LIME_RESISTANT = registerBlock("slab_lime_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_LIME = registerBlock("fence_lime",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_LIME_RESISTANT = registerBlock("fence_lime_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_LIME = registerBlock("fence_gate_lime",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_LIME_RESISTANT = registerBlock("fence_gate_lime_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_LIME = registerBlock("button_lime",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_LIME = registerBlock("pressure_plate_lime",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_LIME = BLOCKS.register("sign_lime",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.LIME));
    public static final RegistryObject<Block> SIGN_LIME_WALL = BLOCKS.register("sign_lime_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.LIME));

    public static final RegistryObject<Block> SIGN_HANGING_LIME = BLOCKS.register("sign_hanging_lime",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.LIME));
    public static final RegistryObject<Block> SIGN_HANGING_LIME_WALL = BLOCKS.register("sign_hanging_lime_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.LIME));

    public static final RegistryObject<Block> DOOR_LIME = registerBlock("door_lime",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_LIME = registerBlock("trapdoor_lime",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_MAHOGANY = registerBlock("log_mahogany",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_MAHOGANY_RESISTANT = registerBlock("log_mahogany_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAHOGANY = registerBlock("wood_mahogany",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAHOGANY_RESISTANT = registerBlock("wood_mahogany_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_MAHOGANY_STRIPPED = registerBlock("log_mahogany_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_MAHOGANY_STRIPPED_RESISTANT = registerBlock("log_mahogany_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAHOGANY_STRIPPED = registerBlock("wood_mahogany_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAHOGANY_STRIPPED_RESISTANT = registerBlock("wood_mahogany_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_MAHOGANY = registerBlock("planks_mahogany",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_MAHOGANY_RESISTANT = registerBlock("planks_mahogany_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_MAHOGANY = registerBlock("sapling_mahogany",
            () -> new SaplingBlock(new MahoganyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_MAHOGANY = BLOCKS.register("potted_sapling_mahogany",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_MAHOGANY,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_MAHOGANY = registerBlock("leaves_mahogany",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_MAHOGANY = registerBlock("stairs_mahogany",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_MAHOGANY.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_MAHOGANY_RESISTANT = registerBlock("stairs_mahogany_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_MAHOGANY_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_MAHOGANY = registerBlock("slab_mahogany",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_MAHOGANY_RESISTANT = registerBlock("slab_mahogany_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_MAHOGANY = registerBlock("fence_mahogany",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_MAHOGANY_RESISTANT = registerBlock("fence_mahogany_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_MAHOGANY = registerBlock("fence_gate_mahogany",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_MAHOGANY_RESISTANT = registerBlock("fence_gate_mahogany_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_MAHOGANY = registerBlock("button_mahogany",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_MAHOGANY = registerBlock("pressure_plate_mahogany",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_MAHOGANY = BLOCKS.register("sign_mahogany",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> SIGN_MAHOGANY_WALL = BLOCKS.register("sign_mahogany_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.MAHOGANY));

    public static final RegistryObject<Block> SIGN_HANGING_MAHOGANY = BLOCKS.register("sign_hanging_mahogany",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.MAHOGANY));
    public static final RegistryObject<Block> SIGN_HANGING_MAHOGANY_WALL = BLOCKS.register("sign_hanging_mahogany_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.MAHOGANY));

    public static final RegistryObject<Block> DOOR_MAHOGANY = registerBlock("door_mahogany",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_MAHOGANY = registerBlock("trapdoor_mahogany",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_MAPLE = registerBlock("log_maple",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_MAPLE_RESISTANT = registerBlock("log_maple_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAPLE = registerBlock("wood_maple",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAPLE_RESISTANT = registerBlock("wood_maple_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_MAPLE_STRIPPED = registerBlock("log_maple_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_MAPLE_STRIPPED_RESISTANT = registerBlock("log_maple_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAPLE_STRIPPED = registerBlock("wood_maple_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_MAPLE_STRIPPED_RESISTANT = registerBlock("wood_maple_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_MAPLE = registerBlock("planks_maple",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_MAPLE_RESISTANT = registerBlock("planks_maple_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_MAPLE = registerBlock("sapling_maple",
            () -> new SaplingBlock(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_MAPLE = BLOCKS.register("potted_sapling_maple",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_MAPLE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_MAPLE = registerBlock("leaves_maple",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_MAPLE = registerBlock("stairs_maple",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_MAPLE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_MAPLE_RESISTANT = registerBlock("stairs_maple_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_MAPLE_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_MAPLE = registerBlock("slab_maple",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_MAPLE_RESISTANT = registerBlock("slab_maple_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_MAPLE = registerBlock("fence_maple",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_MAPLE_RESISTANT = registerBlock("fence_maple_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_MAPLE = registerBlock("fence_gate_maple",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_MAPLE_RESISTANT = registerBlock("fence_gate_maple_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_MAPLE = registerBlock("button_maple",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_MAPLE = registerBlock("pressure_plate_maple",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_MAPLE = BLOCKS.register("sign_maple",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.MAPLE));
    public static final RegistryObject<Block> SIGN_MAPLE_WALL = BLOCKS.register("sign_maple_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.MAPLE));

    public static final RegistryObject<Block> SIGN_HANGING_MAPLE = BLOCKS.register("sign_hanging_maple",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.MAPLE));
    public static final RegistryObject<Block> SIGN_HANGING_MAPLE_WALL = BLOCKS.register("sign_hanging_maple_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.MAPLE));

    public static final RegistryObject<Block> DOOR_MAPLE = registerBlock("door_maple",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_MAPLE = registerBlock("trapdoor_maple",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_PALM = registerBlock("log_palm",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PALM_RESISTANT = registerBlock("log_palm_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PALM = registerBlock("wood_palm",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PALM_RESISTANT = registerBlock("wood_palm_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_PALM_STRIPPED = registerBlock("log_palm_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PALM_STRIPPED_RESISTANT = registerBlock("log_palm_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PALM_STRIPPED = registerBlock("wood_palm_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PALM_STRIPPED_RESISTANT = registerBlock("wood_palm_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_PALM = registerBlock("planks_palm",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_PALM_RESISTANT = registerBlock("planks_palm_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_PALM = registerBlock("sapling_palm",
            () -> new REOSaplingBlock(new PalmTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING), () -> Blocks.SAND));
    public static final RegistryObject<Block> POTTED_SAPLING_PALM = BLOCKS.register("potted_sapling_palm",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_PALM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_PALM = registerBlock("leaves_palm",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_PALM = registerBlock("stairs_palm",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_PALM.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_PALM_RESISTANT = registerBlock("stairs_palm_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_PALM_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_PALM = registerBlock("slab_palm",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_PALM_RESISTANT = registerBlock("slab_palm_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_PALM = registerBlock("fence_palm",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_PALM_RESISTANT = registerBlock("fence_palm_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_PALM = registerBlock("fence_gate_palm",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_PALM_RESISTANT = registerBlock("fence_gate_palm_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_PALM = registerBlock("button_palm",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_PALM = registerBlock("pressure_plate_palm",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_PALM = BLOCKS.register("sign_palm",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PALM));
    public static final RegistryObject<Block> SIGN_PALM_WALL = BLOCKS.register("sign_palm_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PALM));

    public static final RegistryObject<Block> SIGN_HANGING_PALM = BLOCKS.register("sign_hanging_palm",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PALM));
    public static final RegistryObject<Block> SIGN_HANGING_PALM_WALL = BLOCKS.register("sign_hanging_palm_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PALM));

    public static final RegistryObject<Block> DOOR_PALM = registerBlock("door_palm",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_PALM = registerBlock("trapdoor_palm",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_PAPAYA = registerBlock("log_papaya",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PAPAYA_RESISTANT = registerBlock("log_papaya_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PAPAYA = registerBlock("wood_papaya",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PAPAYA_RESISTANT = registerBlock("wood_papaya_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_PAPAYA_STRIPPED = registerBlock("log_papaya_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PAPAYA_STRIPPED_RESISTANT = registerBlock("log_papaya_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PAPAYA_STRIPPED = registerBlock("wood_papaya_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PAPAYA_STRIPPED_RESISTANT = registerBlock("wood_papaya_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_PAPAYA = registerBlock("planks_papaya",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_PAPAYA_RESISTANT = registerBlock("planks_papaya_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_PAPAYA = registerBlock("sapling_papaya",
            () -> new SaplingBlock(new PapayaTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_PAPAYA = BLOCKS.register("potted_sapling_papaya",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_PAPAYA,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_PAPAYA = registerBlock("leaves_papaya",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_PAPAYA_FRUIT = registerBlock("leaves_papaya_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_PAPAYA = registerBlock("stairs_papaya",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_PAPAYA.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_PAPAYA_RESISTANT = registerBlock("stairs_papaya_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_PAPAYA_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_PAPAYA = registerBlock("slab_papaya",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_PAPAYA_RESISTANT = registerBlock("slab_papaya_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_PAPAYA = registerBlock("fence_papaya",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_PAPAYA_RESISTANT = registerBlock("fence_papaya_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_PAPAYA = registerBlock("fence_gate_papaya",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_PAPAYA_RESISTANT = registerBlock("fence_gate_papaya_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_PAPAYA = registerBlock("button_papaya",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_PAPAYA = registerBlock("pressure_plate_papaya",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_PAPAYA = BLOCKS.register("sign_papaya",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PAPAYA));
    public static final RegistryObject<Block> SIGN_PAPAYA_WALL = BLOCKS.register("sign_papaya_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PAPAYA));

    public static final RegistryObject<Block> SIGN_HANGING_PAPAYA = BLOCKS.register("sign_hanging_papaya",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PAPAYA));
    public static final RegistryObject<Block> SIGN_HANGING_PAPAYA_WALL = BLOCKS.register("sign_hanging_papaya_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PAPAYA));

    public static final RegistryObject<Block> DOOR_PAPAYA = registerBlock("door_papaya",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_PAPAYA = registerBlock("trapdoor_papaya",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_PINE = registerBlock("log_pine",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PINE_RESISTANT = registerBlock("log_pine_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PINE = registerBlock("wood_pine",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PINE_RESISTANT = registerBlock("wood_pine_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_PINE_STRIPPED = registerBlock("log_pine_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PINE_STRIPPED_RESISTANT = registerBlock("log_pine_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PINE_STRIPPED = registerBlock("wood_pine_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PINE_STRIPPED_RESISTANT = registerBlock("wood_pine_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_PINE = registerBlock("planks_pine",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_PINE_RESISTANT = registerBlock("planks_pine_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_PINE = registerBlock("sapling_pine",
            () -> new SaplingBlock(new PineTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_PINE = BLOCKS.register("potted_sapling_pine",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_PINE,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_PINE = registerBlock("leaves_pine",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_PINE = registerBlock("stairs_pine",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_PINE.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_PINE_RESISTANT = registerBlock("stairs_pine_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_PINE_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_PINE = registerBlock("slab_pine",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_PINE_RESISTANT = registerBlock("slab_pine_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_PINE = registerBlock("fence_pine",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_PINE_RESISTANT = registerBlock("fence_pine_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_PINE = registerBlock("fence_gate_pine",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_PINE_RESISTANT = registerBlock("fence_gate_pine_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_PINE = registerBlock("button_pine",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_PINE = registerBlock("pressure_plate_pine",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_PINE = BLOCKS.register("sign_pine",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PINE));
    public static final RegistryObject<Block> SIGN_PINE_WALL = BLOCKS.register("sign_pine_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PINE));

    public static final RegistryObject<Block> SIGN_HANGING_PINE = BLOCKS.register("sign_hanging_pine",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PINE));
    public static final RegistryObject<Block> SIGN_HANGING_PINE_WALL = BLOCKS.register("sign_hanging_pine_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PINE));

    public static final RegistryObject<Block> DOOR_PINE = registerBlock("door_pine",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_PINE = registerBlock("trapdoor_pine",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_PLUM = registerBlock("log_plum",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PLUM_RESISTANT = registerBlock("log_plum_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PLUM = registerBlock("wood_plum",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PLUM_RESISTANT = registerBlock("wood_plum_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_PLUM_STRIPPED = registerBlock("log_plum_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_PLUM_STRIPPED_RESISTANT = registerBlock("log_plum_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_PLUM_STRIPPED = registerBlock("wood_plum_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_PLUM_STRIPPED_RESISTANT = registerBlock("wood_plum_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_PLUM = registerBlock("planks_plum",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_PLUM_RESISTANT = registerBlock("planks_plum_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_PLUM = registerBlock("sapling_plum",
            () -> new SaplingBlock(new PlumTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_PLUM = BLOCKS.register("potted_sapling_plum",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_PLUM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_PLUM = registerBlock("leaves_plum",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_PLUM_FRUIT = registerBlock("leaves_plum_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_PLUM = registerBlock("stairs_plum",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_PLUM.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_PLUM_RESISTANT = registerBlock("stairs_plum_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_PLUM_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_PLUM = registerBlock("slab_plum",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_PLUM_RESISTANT = registerBlock("slab_plum_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_PLUM = registerBlock("fence_plum",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_PLUM_RESISTANT = registerBlock("fence_plum_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_PLUM = registerBlock("fence_gate_plum",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_PLUM_RESISTANT = registerBlock("fence_gate_plum_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_PLUM = registerBlock("button_plum",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_PLUM = registerBlock("pressure_plate_plum",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_PLUM = BLOCKS.register("sign_plum",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.PLUM));
    public static final RegistryObject<Block> SIGN_PLUM_WALL = BLOCKS.register("sign_plum_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.PLUM));

    public static final RegistryObject<Block> SIGN_HANGING_PLUM = BLOCKS.register("sign_hanging_plum",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.PLUM));
    public static final RegistryObject<Block> SIGN_HANGING_PLUM_WALL = BLOCKS.register("sign_hanging_plum_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.PLUM));

    public static final RegistryObject<Block> DOOR_PLUM = registerBlock("door_plum",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_PLUM = registerBlock("trapdoor_plum",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_POPLAR = registerBlock("log_poplar",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_POPLAR_RESISTANT = registerBlock("log_poplar_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_POPLAR = registerBlock("wood_poplar",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_POPLAR_RESISTANT = registerBlock("wood_poplar_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_POPLAR_STRIPPED = registerBlock("log_poplar_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_POPLAR_STRIPPED_RESISTANT = registerBlock("log_poplar_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_POPLAR_STRIPPED = registerBlock("wood_poplar_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_POPLAR_STRIPPED_RESISTANT = registerBlock("wood_poplar_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_POPLAR = registerBlock("planks_poplar",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_POPLAR_RESISTANT = registerBlock("planks_poplar_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_POPLAR = registerBlock("sapling_poplar",
            () -> new SaplingBlock(new PoplarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_POPLAR = BLOCKS.register("potted_sapling_poplar",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_POPLAR,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_POPLAR = registerBlock("leaves_poplar",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_POPLAR = registerBlock("stairs_poplar",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_POPLAR.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_POPLAR_RESISTANT = registerBlock("stairs_poplar_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_POPLAR_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_POPLAR = registerBlock("slab_poplar",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_POPLAR_RESISTANT = registerBlock("slab_poplar_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_POPLAR = registerBlock("fence_poplar",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_POPLAR_RESISTANT = registerBlock("fence_poplar_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_POPLAR = registerBlock("fence_gate_poplar",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_POPLAR_RESISTANT = registerBlock("fence_gate_poplar_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_POPLAR = registerBlock("button_poplar",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_POPLAR = registerBlock("pressure_plate_poplar",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_POPLAR = BLOCKS.register("sign_poplar",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.POPLAR));
    public static final RegistryObject<Block> SIGN_POPLAR_WALL = BLOCKS.register("sign_poplar_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.POPLAR));

    public static final RegistryObject<Block> SIGN_HANGING_POPLAR = BLOCKS.register("sign_hanging_poplar",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.POPLAR));
    public static final RegistryObject<Block> SIGN_HANGING_POPLAR_WALL = BLOCKS.register("sign_hanging_poplar_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.POPLAR));

    public static final RegistryObject<Block> DOOR_POPLAR = registerBlock("door_poplar",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_POPLAR = registerBlock("trapdoor_poplar",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_REDWOOD = registerBlock("log_redwood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_REDWOOD_RESISTANT = registerBlock("log_redwood_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_REDWOOD = registerBlock("wood_redwood",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_REDWOOD_RESISTANT = registerBlock("wood_redwood_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_REDWOOD_STRIPPED = registerBlock("log_redwood_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_REDWOOD_STRIPPED_RESISTANT = registerBlock("log_redwood_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_REDWOOD_STRIPPED = registerBlock("wood_redwood_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_REDWOOD_STRIPPED_RESISTANT = registerBlock("wood_redwood_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_REDWOOD = registerBlock("planks_redwood",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_REDWOOD_RESISTANT = registerBlock("planks_redwood_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_REDWOOD = registerBlock("sapling_redwood",
            () -> new SaplingBlock(new RedwoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_REDWOOD = BLOCKS.register("potted_sapling_redwood",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_REDWOOD,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_REDWOOD = registerBlock("leaves_redwood",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_REDWOOD = registerBlock("stairs_redwood",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_REDWOOD.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_REDWOOD_RESISTANT = registerBlock("stairs_redwood_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_REDWOOD_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_REDWOOD = registerBlock("slab_redwood",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_REDWOOD_RESISTANT = registerBlock("slab_redwood_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_REDWOOD = registerBlock("fence_redwood",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_REDWOOD_RESISTANT = registerBlock("fence_redwood_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_REDWOOD = registerBlock("fence_gate_redwood",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_REDWOOD_RESISTANT = registerBlock("fence_gate_redwood_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_REDWOOD = registerBlock("button_redwood",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_REDWOOD = registerBlock("pressure_plate_redwood",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_REDWOOD = BLOCKS.register("sign_redwood",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.REDWOOD));
    public static final RegistryObject<Block> SIGN_REDWOOD_WALL = BLOCKS.register("sign_redwood_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.REDWOOD));

    public static final RegistryObject<Block> SIGN_HANGING_REDWOOD = BLOCKS.register("sign_hanging_redwood",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.REDWOOD));
    public static final RegistryObject<Block> SIGN_HANGING_REDWOOD_WALL = BLOCKS.register("sign_hanging_redwood_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.REDWOOD));

    public static final RegistryObject<Block> DOOR_REDWOOD = registerBlock("door_redwood",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_REDWOOD = registerBlock("trapdoor_redwood",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_RUBBER = registerBlock("log_rubber",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_RUBBER_SAP = registerBlock("log_rubber_sap",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_RUBBER_RESISTANT = registerBlock("log_rubber_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_RUBBER_SAP_RESISTANT = registerBlock("log_rubber_sap_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_RUBBER = registerBlock("wood_rubber",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_RUBBER_RESISTANT = registerBlock("wood_rubber_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_RUBBER_STRIPPED = registerBlock("log_rubber_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_RUBBER_STRIPPED_RESISTANT = registerBlock("log_rubber_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_RUBBER_STRIPPED = registerBlock("wood_rubber_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_RUBBER_STRIPPED_RESISTANT = registerBlock("wood_rubber_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_RUBBER = registerBlock("planks_rubber",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_RUBBER_RESISTANT = registerBlock("planks_rubber_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_RUBBER = registerBlock("sapling_rubber",
            () -> new SaplingBlock(new RubberTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_RUBBER = BLOCKS.register("potted_sapling_rubber",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_RUBBER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_RUBBER = registerBlock("leaves_rubber",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_RUBBER = registerBlock("stairs_rubber",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_RUBBER.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_RUBBER_RESISTANT = registerBlock("stairs_rubber_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_RUBBER_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_RUBBER = registerBlock("slab_rubber",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_RUBBER_RESISTANT = registerBlock("slab_rubber_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_RUBBER = registerBlock("fence_rubber",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_RUBBER_RESISTANT = registerBlock("fence_rubber_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_RUBBER = registerBlock("fence_gate_rubber",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_RUBBER_RESISTANT = registerBlock("fence_gate_rubber_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_RUBBER = registerBlock("button_rubber",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_RUBBER = registerBlock("pressure_plate_rubber",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_RUBBER = BLOCKS.register("sign_rubber",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.RUBBER));
    public static final RegistryObject<Block> SIGN_RUBBER_WALL = BLOCKS.register("sign_rubber_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.RUBBER));

    public static final RegistryObject<Block> SIGN_HANGING_RUBBER = BLOCKS.register("sign_hanging_rubber",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.RUBBER));
    public static final RegistryObject<Block> SIGN_HANGING_RUBBER_WALL = BLOCKS.register("sign_hanging_rubber_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.RUBBER));

    public static final RegistryObject<Block> DOOR_RUBBER = registerBlock("door_rubber",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_RUBBER = registerBlock("trapdoor_rubber",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_TEAK = registerBlock("log_teak",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_TEAK_RESISTANT = registerBlock("log_teak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_TEAK = registerBlock("wood_teak",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_TEAK_RESISTANT = registerBlock("wood_teak_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_TEAK_STRIPPED = registerBlock("log_teak_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_TEAK_STRIPPED_RESISTANT = registerBlock("log_teak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_TEAK_STRIPPED = registerBlock("wood_teak_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_TEAK_STRIPPED_RESISTANT = registerBlock("wood_teak_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_TEAK = registerBlock("planks_teak",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_TEAK_RESISTANT = registerBlock("planks_teak_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_TEAK = registerBlock("sapling_teak",
            () -> new SaplingBlock(new TeakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_TEAK = BLOCKS.register("potted_sapling_teak",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_TEAK,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_TEAK = registerBlock("leaves_teak",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_TEAK = registerBlock("stairs_teak",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_TEAK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_TEAK_RESISTANT = registerBlock("stairs_teak_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_TEAK_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_TEAK = registerBlock("slab_teak",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_TEAK_RESISTANT = registerBlock("slab_teak_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_TEAK = registerBlock("fence_teak",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_TEAK_RESISTANT = registerBlock("fence_teak_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_TEAK = registerBlock("fence_gate_teak",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_TEAK_RESISTANT = registerBlock("fence_gate_teak_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_TEAK = registerBlock("button_teak",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_TEAK = registerBlock("pressure_plate_teak",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_TEAK = BLOCKS.register("sign_teak",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.TEAK));
    public static final RegistryObject<Block> SIGN_TEAK_WALL = BLOCKS.register("sign_teak_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.TEAK));

    public static final RegistryObject<Block> SIGN_HANGING_TEAK = BLOCKS.register("sign_hanging_teak",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.TEAK));
    public static final RegistryObject<Block> SIGN_HANGING_TEAK_WALL = BLOCKS.register("sign_hanging_teak_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.TEAK));

    public static final RegistryObject<Block> DOOR_TEAK = registerBlock("door_teak",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_TEAK = registerBlock("trapdoor_teak",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_WALNUT = registerBlock("log_walnut",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_WALNUT_RESISTANT = registerBlock("log_walnut_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_WALNUT = registerBlock("wood_walnut",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_WALNUT_RESISTANT = registerBlock("wood_walnut_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_WALNUT_STRIPPED = registerBlock("log_walnut_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_WALNUT_STRIPPED_RESISTANT = registerBlock("log_walnut_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_WALNUT_STRIPPED = registerBlock("wood_walnut_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_WALNUT_STRIPPED_RESISTANT = registerBlock("wood_walnut_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_WALNUT = registerBlock("planks_walnut",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_WALNUT_RESISTANT = registerBlock("planks_walnut_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_WALNUT = registerBlock("sapling_walnut",
            () -> new SaplingBlock(new WalnutTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_WALNUT = BLOCKS.register("potted_sapling_walnut",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_WALNUT,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_WALNUT = registerBlock("leaves_walnut",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> LEAVES_WALNUT_FRUIT = registerBlock("leaves_walnut_fruit",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_WALNUT = registerBlock("stairs_walnut",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_WALNUT.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_WALNUT_RESISTANT = registerBlock("stairs_walnut_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_WALNUT_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_WALNUT = registerBlock("slab_walnut",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_WALNUT_RESISTANT = registerBlock("slab_walnut_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_WALNUT = registerBlock("fence_walnut",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_WALNUT_RESISTANT = registerBlock("fence_walnut_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_WALNUT = registerBlock("fence_gate_walnut",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_WALNUT_RESISTANT = registerBlock("fence_gate_walnut_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_WALNUT = registerBlock("button_walnut",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_WALNUT = registerBlock("pressure_plate_walnut",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_WALNUT = BLOCKS.register("sign_walnut",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.WALNUT));
    public static final RegistryObject<Block> SIGN_WALNUT_WALL = BLOCKS.register("sign_walnut_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.WALNUT));

    public static final RegistryObject<Block> SIGN_HANGING_WALNUT = BLOCKS.register("sign_hanging_walnut",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.WALNUT));
    public static final RegistryObject<Block> SIGN_HANGING_WALNUT_WALL = BLOCKS.register("sign_hanging_walnut_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.WALNUT));

    public static final RegistryObject<Block> DOOR_WALNUT = registerBlock("door_walnut",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_WALNUT = registerBlock("trapdoor_walnut",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

    //
    public static final RegistryObject<Block> LOG_WILLOW = registerBlock("log_willow",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_WILLOW_RESISTANT = registerBlock("log_willow_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_WILLOW = registerBlock("wood_willow",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_WILLOW_RESISTANT = registerBlock("wood_willow_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> LOG_WILLOW_STRIPPED = registerBlock("log_willow_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> LOG_WILLOW_STRIPPED_RESISTANT = registerBlock("log_willow_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> WOOD_WILLOW_STRIPPED = registerBlock("wood_willow_stripped",
            () -> new REOFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> WOOD_WILLOW_STRIPPED_RESISTANT = registerBlock("wood_willow_stripped_resistant",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> PLANKS_WILLOW = registerBlock("planks_willow",
            () -> new REOFlammablePlanksBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS), 20, 5));
    public static final RegistryObject<Block> PLANKS_WILLOW_RESISTANT = registerBlock("planks_willow_resistant",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> SAPLING_WILLOW = registerBlock("sapling_willow",
            () -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> POTTED_SAPLING_WILLOW = BLOCKS.register("potted_sapling_willow",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), REOBlocks.SAPLING_WILLOW,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_OAK_SAPLING).noOcclusion()));
    public static final RegistryObject<Block> LEAVES_WILLOW = registerBlock("leaves_willow",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> STAIRS_WILLOW = registerBlock("stairs_willow",
            () -> new REOFlammableStairsBlock(() -> REOBlocks.PLANKS_WILLOW.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> STAIRS_WILLOW_RESISTANT = registerBlock("stairs_willow_resistant",
            () -> new StairBlock(() -> REOBlocks.PLANKS_WILLOW_RESISTANT.get()
                    .defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SLAB_WILLOW = registerBlock("slab_willow",
            () -> new REOFlammableSlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> SLAB_WILLOW_RESISTANT = registerBlock("slab_willow_resistant",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_WILLOW = registerBlock("fence_willow",
            () -> new REOFlammableFenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD), 20, 5));
    public static final RegistryObject<Block> FENCE_WILLOW_RESISTANT = registerBlock("fence_willow_resistant",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> FENCE_GATE_WILLOW = registerBlock("fence_gate_willow",
            () -> new REOFlammableFenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE, 20, 5));
    public static final RegistryObject<Block> FENCE_GATE_WILLOW_RESISTANT = registerBlock("fence_gate_willow_resistant",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    .sound(SoundType.WOOD), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> BUTTON_WILLOW = registerBlock("button_willow",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON).sound(SoundType.WOOD),
                    BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> PRESSURE_PLATE_WILLOW = registerBlock("pressure_plate_willow",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD), BlockSetType.OAK));

    public static final RegistryObject<Block> SIGN_WILLOW = BLOCKS.register("sign_willow",
            () -> new REOStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), REOWoodTypes.WILLOW));
    public static final RegistryObject<Block> SIGN_WILLOW_WALL = BLOCKS.register("sign_willow_wall",
            () -> new REOWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), REOWoodTypes.WILLOW));

    public static final RegistryObject<Block> SIGN_HANGING_WILLOW = BLOCKS.register("sign_hanging_willow",
            () -> new REOHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), REOWoodTypes.WILLOW));
    public static final RegistryObject<Block> SIGN_HANGING_WILLOW_WALL = BLOCKS.register("sign_hanging_willow_wall",
            () -> new REOWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), REOWoodTypes.WILLOW));

    public static final RegistryObject<Block> DOOR_WILLOW = registerBlock("door_willow",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> TRAPDOOR_WILLOW = registerBlock("trapdoor_willow",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).noOcclusion(), BlockSetType.OAK));

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