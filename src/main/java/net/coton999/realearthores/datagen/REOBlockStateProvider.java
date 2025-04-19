package net.coton999.realearthores.datagen;


import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.custom.bush.BlackberryBlock;
import net.coton999.realearthores.block.custom.bush.BlueberryBlock;
import net.coton999.realearthores.block.custom.bush.RaspberryBlock;
import net.coton999.realearthores.block.custom.crop.food.*;
import net.coton999.realearthores.block.custom.fruit.*;
import net.coton999.realearthores.block.custom.misc.LampBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class REOBlockStateProvider extends BlockStateProvider {
    public REOBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RealEarthOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        // Building Blocks
        // Marble
        simpleBlockWithItem(REOBlocks.MARBLE.get(),
                models().cubeAll("marble", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble")));
        simpleBlockWithItem(REOBlocks.MARBLE_COBBLE.get(),
                models().cubeAll("marble_cobble", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble")));
        simpleBlockWithItem(REOBlocks.MARBLE_COBBLE_MOSSY.get(),
                models().cubeAll("marble_cobble_mossy", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble_mossy")));
        simpleBlockWithItem(REOBlocks.MARBLE_BRICK.get(),
                models().cubeAll("marble_brick", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick")));
        simpleBlockWithItem(REOBlocks.MARBLE_BRICK_MOSSY.get(),
                models().cubeAll("marble_brick_mossy", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick_mossy")));
        simpleBlockWithItem(REOBlocks.MARBLE_BRICK_CHISELED.get(),
                models().cubeAll("marble_chisled", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick_chiseled")));
        simpleBlockWithItem(REOBlocks.MARBLE_BRICK_CRACKED.get(),
                models().cubeAll("marble_cracked", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick_cracked")));

        stairsBlock(((StairBlock) REOBlocks.MARBLE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble"));
        stairsBlock(((StairBlock) REOBlocks.MARBLE_BRICK_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick"));
        stairsBlock(((StairBlock) REOBlocks.MARBLE_COBBLE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble"));
        stairsBlock(((StairBlock) REOBlocks.MARBLE_COBBLE_MOSSY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble_mossy"));

        slabBlock(((SlabBlock) REOBlocks.MARBLE_SLAB.get()),
                blockTexture(REOBlocks.MARBLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble"));
        slabBlock(((SlabBlock) REOBlocks.MARBLE_BRICK_SLAB.get()),
                blockTexture(REOBlocks.MARBLE_BRICK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick"));
        slabBlock(((SlabBlock) REOBlocks.MARBLE_COBBLE_SLAB.get()),
                blockTexture(REOBlocks.MARBLE_COBBLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble"));
        slabBlock(((SlabBlock) REOBlocks.MARBLE_COBBLE_MOSSY_SLAB.get()),
                blockTexture(REOBlocks.MARBLE_COBBLE_MOSSY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble_mossy"));

        wallBlock(((WallBlock) REOBlocks.MARBLE_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble"));
       wallBlock(((WallBlock) REOBlocks.MARBLE_BRICK_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_brick"));
        wallBlock(((WallBlock) REOBlocks.MARBLE_COBBLE_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble"));
        wallBlock(((WallBlock) REOBlocks.MARBLE_COBBLE_MOSSY_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cobble_mossy"));

        // Limestone
        simpleBlockWithItem(REOBlocks.LIMESTONE.get(),
                models().cubeAll("limestone", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_COBBLE.get(),
                models().cubeAll("limestone_cobble", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_COBBLE_MOSSY.get(),
                models().cubeAll("limestone_cobble_mossy", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble_mossy")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_BRICK.get(),
                models().cubeAll("limestone_brick", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_BRICK_MOSSY.get(),
                models().cubeAll("limestone_brick_mossy", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick_mossy")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_BRICK_CHISELED.get(),
                models().cubeAll("limestone_chisled", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick_chiseled")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_BRICK_CRACKED.get(),
                models().cubeAll("limestone_cracked", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick_cracked")));

        stairsBlock(((StairBlock) REOBlocks.LIMESTONE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone"));
        stairsBlock(((StairBlock) REOBlocks.LIMESTONE_BRICK_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick"));
        stairsBlock(((StairBlock) REOBlocks.LIMESTONE_COBBLE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble"));
        stairsBlock(((StairBlock) REOBlocks.LIMESTONE_COBBLE_MOSSY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble_mossy"));

        slabBlock(((SlabBlock) REOBlocks.LIMESTONE_SLAB.get()),
                blockTexture(REOBlocks.LIMESTONE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone"));
        slabBlock(((SlabBlock) REOBlocks.LIMESTONE_BRICK_SLAB.get()),
                blockTexture(REOBlocks.LIMESTONE_BRICK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick"));
        slabBlock(((SlabBlock) REOBlocks.LIMESTONE_COBBLE_SLAB.get()),
                blockTexture(REOBlocks.LIMESTONE_COBBLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble"));
        slabBlock(((SlabBlock) REOBlocks.LIMESTONE_COBBLE_MOSSY_SLAB.get()),
                blockTexture(REOBlocks.LIMESTONE_COBBLE_MOSSY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble_mossy"));

        wallBlock(((WallBlock) REOBlocks.LIMESTONE_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone"));
        wallBlock(((WallBlock) REOBlocks.LIMESTONE_BRICK_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_brick"));
        wallBlock(((WallBlock) REOBlocks.LIMESTONE_COBBLE_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble"));
        wallBlock(((WallBlock) REOBlocks.LIMESTONE_COBBLE_MOSSY_WALL.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cobble_mossy"));

        // Calcite
        stairsBlock(((StairBlock) REOBlocks.CALCITE_STAIRS.get()), blockTexture(Blocks.CALCITE));
        slabBlock(((SlabBlock) REOBlocks.CALCITE_SLAB.get()), blockTexture(Blocks.CALCITE), blockTexture(Blocks.CALCITE));
        wallBlock(((WallBlock) REOBlocks.CALCITE_WALL.get()), blockTexture(Blocks.CALCITE));

        // Netherrack
        stairsBlock(((StairBlock) REOBlocks.NETHERRACK_STAIRS.get()), blockTexture(Blocks.NETHERRACK));
        slabBlock(((SlabBlock) REOBlocks.NETHERRACK_SLAB.get()), blockTexture(Blocks.NETHERRACK), blockTexture(Blocks.NETHERRACK));
        wallBlock(((WallBlock) REOBlocks.NETHERRACK_WALL.get()), blockTexture(Blocks.NETHERRACK));

        // Crops //
        makeBarleyCrop((CropBlock) REOBlocks.BARLEY_CROP.get(), "barley_stage_", "barley_stage_");
        makeCauliflowerCrop((CropBlock) REOBlocks.CAULIFLOWER_CROP.get(), "cauliflower_stage_", "cauliflower_stage_");
        makeCottonCrop((CropBlock) REOBlocks.COTTON_CROP.get(), "cotton_stage_", "cotton_stage_");
        makeOnionsCrop((CropBlock) REOBlocks.ONIONS_CROP.get(), "onions_stage_", "onions_stage_");
        makeRiceCrop((CropBlock) REOBlocks.RICE_CROP.get(), "rice_stage_", "rice_stage_");
        makeTomatoCrop((CropBlock) REOBlocks.TOMATO_CROP.get(), "tomato_stage_", "tomato_stage_");

        wildBlock(REOBlocks.WILD_BARLEY, "wild_barley");
        wildBlock(REOBlocks.WILD_COTTON, "wild_cotton");
        wildBlock(REOBlocks.WILD_RICE, "wild_rice");
        wildBlock(REOBlocks.WILD_TOMATO, "wild_tomato");

        // Fruits //
        makeCitusFruit(REOBlocks.CITRUS_FRUIT.get(), "citrus_stage_", "citrus_stage_");
        makeLimeFruit(REOBlocks.LIME_FRUIT.get(), "lime_stage_", "lime_stage_");
        makePapayaFruit(REOBlocks.PAPAYA_FRUIT.get(), "papaya_stage_", "papaya_stage_");
        makePearFruit(REOBlocks.PEAR_FRUIT.get(), "pear_stage_", "pear_stage_");
        makePlumFruit(REOBlocks.PLUM_FRUIT.get(), "plum_stage_", "plum_stage_");
        makeWalnutFruit(REOBlocks.WALNUT_FRUIT.get(), "walnut_stage_", "walnut_stage_");

        // Berry //
        makeBlackberryBush((SweetBerryBushBlock) REOBlocks.BLACKBERRY_FRUIT.get(), "blackberry_bush_stage_", "blackberry_bush_stage_");
        makeBlueberryBush((SweetBerryBushBlock) REOBlocks.BLUEBERRY_FRUIT.get(), "blueberry_bush_stage_", "blueberry_bush_stage_");
        makeRaspberryBush((SweetBerryBushBlock) REOBlocks.RASPBERRY_FRUIT.get(), "raspberry_bush_stage_", "raspberry_bush_stage_");


        // Wood
        // Vanilla
        // Oak
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_OAK_LOG.get()), blockTexture(Blocks.OAK_LOG),
                new ResourceLocation("block/oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_OAK_WOOD.get()), blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get()), blockTexture(Blocks.STRIPPED_OAK_LOG),
                new ResourceLocation("block/stripped_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get()), blockTexture(Blocks.STRIPPED_OAK_LOG), blockTexture(Blocks.STRIPPED_OAK_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_OAK_LOG.get(),
                models().orientable("log_oak_resistant", blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG),
                        new ResourceLocation("block/oak_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_OAK_WOOD.get(),
                models().cubeAll("wood_oak_resistant", blockTexture(Blocks.OAK_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_OAK_LOG.get(),
                models().orientable("log_oak_stripped_resistant", blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG),
                        new ResourceLocation("block/stripped_oak_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_OAK_WOOD.get(),
                models().cubeAll("wood_oak_stripped_resistant", blockTexture(Blocks.STRIPPED_OAK_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_OAK_PLANKS.get(),
                models().cubeAll("planks_oak_resistant", blockTexture(Blocks.OAK_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_OAK_STAIRS.get()), blockTexture(Blocks.OAK_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_OAK_SLAB.get()), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_OAK_FENCE.get()), blockTexture(Blocks.OAK_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_OAK_FENCE_GATE.get()), blockTexture(Blocks.OAK_PLANKS));

        // Spruce
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_SPRUCE_LOG.get()), blockTexture(Blocks.SPRUCE_LOG),
                new ResourceLocation("block/spruce_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_SPRUCE_WOOD.get()), blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get()), blockTexture(Blocks.STRIPPED_SPRUCE_LOG),
                new ResourceLocation("block/stripped_spruce_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get()), blockTexture(Blocks.STRIPPED_SPRUCE_LOG), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_SPRUCE_LOG.get(),
                models().orientable("log_spruce_resistant", blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG),
                        new ResourceLocation("block/spruce_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_SPRUCE_WOOD.get(),
                models().cubeAll("wood_spruce_resistant", blockTexture(Blocks.SPRUCE_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_SPRUCE_LOG.get(),
                models().orientable("log_spruce_stripped_resistant", blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG),
                        new ResourceLocation("block/stripped_spruce_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_SPRUCE_WOOD.get(),
                models().cubeAll("wood_spruce_stripped_resistant", blockTexture(Blocks.STRIPPED_SPRUCE_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_SPRUCE_PLANKS.get(),
                models().cubeAll("planks_spruce_resistant", blockTexture(Blocks.SPRUCE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_SPRUCE_STAIRS.get()), blockTexture(Blocks.SPRUCE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_SPRUCE_SLAB.get()), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_SPRUCE_FENCE.get()), blockTexture(Blocks.SPRUCE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_SPRUCE_FENCE_GATE.get()), blockTexture(Blocks.SPRUCE_PLANKS));

        // Birch
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BIRCH_LOG.get()), blockTexture(Blocks.BIRCH_LOG),
                new ResourceLocation("block/birch_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BIRCH_WOOD.get()), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get()), blockTexture(Blocks.STRIPPED_BIRCH_LOG),
                new ResourceLocation("block/stripped_birch_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get()), blockTexture(Blocks.STRIPPED_BIRCH_LOG), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_BIRCH_LOG.get(),
                models().orientable("log_birch_resistant", blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG),
                        new ResourceLocation("block/birch_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_BIRCH_WOOD.get(),
                models().cubeAll("wood_birch_resistant", blockTexture(Blocks.BIRCH_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BIRCH_LOG.get(),
                models().orientable("log_birch_stripped_resistant", blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG),
                        new ResourceLocation("block/stripped_birch_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BIRCH_WOOD.get(),
                models().cubeAll("wood_birch_stripped_resistant", blockTexture(Blocks.STRIPPED_BIRCH_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_BIRCH_PLANKS.get(),
                models().cubeAll("planks_birch_resistant", blockTexture(Blocks.BIRCH_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_BIRCH_STAIRS.get()), blockTexture(Blocks.BIRCH_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_BIRCH_SLAB.get()), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_BIRCH_FENCE.get()), blockTexture(Blocks.BIRCH_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_BIRCH_FENCE_GATE.get()), blockTexture(Blocks.BIRCH_PLANKS));

        // Jungle
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_JUNGLE_LOG.get()), blockTexture(Blocks.JUNGLE_LOG),
                new ResourceLocation("block/jungle_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_JUNGLE_WOOD.get()), blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get()), blockTexture(Blocks.STRIPPED_JUNGLE_LOG),
                new ResourceLocation("block/stripped_jungle_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get()), blockTexture(Blocks.STRIPPED_JUNGLE_LOG), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_JUNGLE_LOG.get(),
                models().orientable("log_jungle_resistant", blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG),
                        new ResourceLocation("block/jungle_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_JUNGLE_WOOD.get(),
                models().cubeAll("wood_jungle_resistant", blockTexture(Blocks.JUNGLE_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_JUNGLE_LOG.get(),
                models().orientable("log_jungle_stripped_resistant", blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG),
                        new ResourceLocation("block/stripped_jungle_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_JUNGLE_WOOD.get(),
                models().cubeAll("wood_jungle_stripped_resistant", blockTexture(Blocks.STRIPPED_JUNGLE_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_JUNGLE_PLANKS.get(),
                models().cubeAll("planks_jungle_resistant", blockTexture(Blocks.JUNGLE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_JUNGLE_STAIRS.get()), blockTexture(Blocks.JUNGLE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_JUNGLE_SLAB.get()), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_JUNGLE_FENCE.get()), blockTexture(Blocks.JUNGLE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_JUNGLE_FENCE_GATE.get()), blockTexture(Blocks.JUNGLE_PLANKS));

        // Acacia
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_ACACIA_LOG.get()), blockTexture(Blocks.ACACIA_LOG),
                new ResourceLocation("block/acacia_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_ACACIA_WOOD.get()), blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get()), blockTexture(Blocks.STRIPPED_ACACIA_LOG),
                new ResourceLocation("block/stripped_acacia_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get()), blockTexture(Blocks.STRIPPED_ACACIA_LOG), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_ACACIA_LOG.get(),
                models().orientable("log_acacia_resistant", blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG),
                        new ResourceLocation("block/acacia_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_ACACIA_WOOD.get(),
                models().cubeAll("wood_acacia_resistant", blockTexture(Blocks.ACACIA_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_ACACIA_LOG.get(),
                models().orientable("log_acacia_stripped_resistant", blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG),
                        new ResourceLocation("block/stripped_acacia_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_ACACIA_WOOD.get(),
                models().cubeAll("wood_acacia_stripped_resistant", blockTexture(Blocks.STRIPPED_ACACIA_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_ACACIA_PLANKS.get(),
                models().cubeAll("planks_acacia_resistant", blockTexture(Blocks.ACACIA_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_ACACIA_STAIRS.get()), blockTexture(Blocks.ACACIA_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_ACACIA_SLAB.get()), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_ACACIA_FENCE.get()), blockTexture(Blocks.ACACIA_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_ACACIA_FENCE_GATE.get()), blockTexture(Blocks.ACACIA_PLANKS));

        // Dark Oak
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_DARK_OAK_LOG.get()), blockTexture(Blocks.DARK_OAK_LOG),
                new ResourceLocation("block/dark_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_DARK_OAK_WOOD.get()), blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get()), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG),
                new ResourceLocation("block/stripped_dark_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get()), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_DARK_OAK_LOG.get(),
                models().orientable("log_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG),
                        new ResourceLocation("block/dark_oak_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_DARK_OAK_WOOD.get(),
                models().cubeAll("wood_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_LOG.get(),
                models().orientable("log_dark_oak_stripped_resistant", blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG),
                        new ResourceLocation("block/stripped_dark_oak_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_DARK_OAK_WOOD.get(),
                models().cubeAll("wood_dark_oak_stripped_resistant", blockTexture(Blocks.STRIPPED_DARK_OAK_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_DARK_OAK_PLANKS.get(),
                models().cubeAll("planks_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_DARK_OAK_STAIRS.get()), blockTexture(Blocks.DARK_OAK_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_DARK_OAK_SLAB.get()), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_DARK_OAK_FENCE.get()), blockTexture(Blocks.DARK_OAK_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_DARK_OAK_FENCE_GATE.get()), blockTexture(Blocks.DARK_OAK_PLANKS));

        // Mangrove
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MANGROVE_LOG.get()), blockTexture(Blocks.MANGROVE_LOG),
                new ResourceLocation("block/mangrove_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MANGROVE_WOOD.get()), blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get()), blockTexture(Blocks.STRIPPED_MANGROVE_LOG),
                new ResourceLocation("block/stripped_mangrove_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get()), blockTexture(Blocks.STRIPPED_MANGROVE_LOG), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_MANGROVE_LOG.get(),
                models().orientable("log_mangrove_resistant", blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG),
                        new ResourceLocation("block/mangrove_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_MANGROVE_WOOD.get(),
                models().cubeAll("wood_mangrove_resistant", blockTexture(Blocks.MANGROVE_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MANGROVE_LOG.get(),
                models().orientable("log_mangrove_stripped_resistant", blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG),
                        new ResourceLocation("block/stripped_mangrove_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MANGROVE_WOOD.get(),
                models().cubeAll("wood_mangrove_stripped_resistant", blockTexture(Blocks.STRIPPED_MANGROVE_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_MANGROVE_PLANKS.get(),
                models().cubeAll("planks_mangrove_resistant", blockTexture(Blocks.MANGROVE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_MANGROVE_STAIRS.get()), blockTexture(Blocks.MANGROVE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_MANGROVE_SLAB.get()), blockTexture(Blocks.MANGROVE_PLANKS), blockTexture(Blocks.MANGROVE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_MANGROVE_FENCE.get()), blockTexture(Blocks.MANGROVE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_MANGROVE_FENCE_GATE.get()), blockTexture(Blocks.MANGROVE_PLANKS));

        // Cherry
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CHERRY_LOG.get()), blockTexture(Blocks.CHERRY_LOG),
                new ResourceLocation("block/cherry_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CHERRY_WOOD.get()), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get()), blockTexture(Blocks.STRIPPED_CHERRY_LOG),
                new ResourceLocation("block/stripped_cherry_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get()), blockTexture(Blocks.STRIPPED_CHERRY_LOG), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
        simpleBlockItem(REOBlocks.RESISTANT_CHERRY_LOG.get(),
                models().orientable("log_cherry_resistant", blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG),
                        new ResourceLocation("block/cherry_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_CHERRY_WOOD.get(),
                models().cubeAll("wood_cherry_resistant", blockTexture(Blocks.CHERRY_LOG)));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CHERRY_LOG.get(),
                models().orientable("log_cherry_stripped_resistant", blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG),
                        new ResourceLocation("block/stripped_cherry_log_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CHERRY_WOOD.get(),
                models().cubeAll("wood_cherry_stripped_resistant", blockTexture(Blocks.STRIPPED_CHERRY_LOG)));
        simpleBlockWithItem(REOBlocks.RESISTANT_CHERRY_PLANKS.get(),
                models().cubeAll("planks_cherry_resistant", blockTexture(Blocks.CHERRY_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_CHERRY_STAIRS.get()), blockTexture(Blocks.CHERRY_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_CHERRY_SLAB.get()), blockTexture(Blocks.CHERRY_PLANKS), blockTexture(Blocks.CHERRY_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_CHERRY_FENCE.get()), blockTexture(Blocks.CHERRY_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_CHERRY_FENCE_GATE.get()), blockTexture(Blocks.CHERRY_PLANKS));


        // Modded
        // Balsa
        axisBlock(((RotatedPillarBlock) REOBlocks.BALSA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.BALSA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_BALSA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_BALSA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"));
        simpleBlockItem(REOBlocks.BALSA_LOG.get(), models().orientable("balsa_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top")));
        simpleBlockItem(REOBlocks.BALSA_WOOD.get(), models().cubeAll("balsa_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa")));
        simpleBlockItem(REOBlocks.STRIPPED_BALSA_LOG.get(), models().orientable("stripped_balsa_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top")));
        simpleBlockItem(REOBlocks.STRIPPED_BALSA_WOOD.get(), models().cubeAll("stripped_balsa_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa")));
        simpleBlockWithItem(REOBlocks.BALSA_PLANKS.get(), models().cubeAll("balsa_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa")));

        stairsBlock(((StairBlock) REOBlocks.BALSA_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));
        slabBlock(((SlabBlock) REOBlocks.BALSA_SLAB.get()), blockTexture(REOBlocks.BALSA_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceBlock(((FenceBlock) REOBlocks.BALSA_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.BALSA_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));

        buttonBlock(((ButtonBlock) REOBlocks.BALSA_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.BALSA_PRESSURE_PLATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));

        saplingBlock(REOBlocks.BALSA_SAPLING, "balsa");
        simpleBlockWithItem(REOBlocks.POTTED_BALSA_SAPLING.get(), models().singleTexture("potted_sapling_balsa",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/balsa")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.BALSA_LEAVES.get(), models().cubeAll("balsa_leaves",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/balsa")));

        signBlock(((StandingSignBlock) REOBlocks.BALSA_SIGN.get()), ((WallSignBlock) REOBlocks.BALSA_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        hangingSignBlock(REOBlocks.BALSA_HANGING_SIGN.get(), REOBlocks.BALSA_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.BALSA_DOOR.get()), modLoc("block/door/balsa_lower"),
                modLoc("block/door/balsa_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.BALSA_TRAPDOOR.get()),
                modLoc("block/trapdoor/balsa"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BALSA_LOG.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                        "block/tree/log/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BALSA_WOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                        "block/tree/log/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                        "block/tree/stripped/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                        "block/tree/stripped/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"));
        simpleBlockItem(REOBlocks.RESISTANT_BALSA_LOG.get(), models().orientable("resistant_balsa_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top")));
        simpleBlockItem(REOBlocks.RESISTANT_BALSA_WOOD.get(), models().cubeAll("resistant_balsa_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BALSA_LOG.get(), models().orientable("resistant_stripped_balsa_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BALSA_WOOD.get(), models().cubeAll("resistant_stripped_balsa_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa")));
        simpleBlockWithItem(REOBlocks.RESISTANT_BALSA_PLANKS.get(), models().cubeAll("resistant_balsa_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_BALSA_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_BALSA_SLAB.get()), blockTexture(REOBlocks.BALSA_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_BALSA_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_BALSA_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/balsa"));

        // Baobab
        axisBlock(((RotatedPillarBlock) REOBlocks.BAOBAB_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.BAOBAB_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_BAOBAB_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_BAOBAB_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"));
        simpleBlockItem(REOBlocks.BAOBAB_LOG.get(), models().orientable("baobab_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top")));
        simpleBlockItem(REOBlocks.BAOBAB_WOOD.get(), models().cubeAll("baobab_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab")));
        simpleBlockItem(REOBlocks.STRIPPED_BAOBAB_LOG.get(), models().orientable("stripped_baobab_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top")));
        simpleBlockItem(REOBlocks.STRIPPED_BAOBAB_WOOD.get(), models().cubeAll("stripped_baobab_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab")));
        simpleBlockWithItem(REOBlocks.BAOBAB_PLANKS.get(), models().cubeAll("baobab_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab")));

        stairsBlock(((StairBlock) REOBlocks.BAOBAB_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));
        slabBlock(((SlabBlock) REOBlocks.BAOBAB_SLAB.get()), blockTexture(REOBlocks.BAOBAB_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceBlock(((FenceBlock) REOBlocks.BAOBAB_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.BAOBAB_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));

        buttonBlock(((ButtonBlock) REOBlocks.BAOBAB_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.BAOBAB_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        saplingBlock(REOBlocks.BAOBAB_SAPLING, "baobab");
        simpleBlockWithItem(REOBlocks.POTTED_BAOBAB_SAPLING.get(), models().singleTexture("potted_sapling_baobab",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/baobab")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.BAOBAB_LEAVES.get(), models().cubeAll("baobab_leaves",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/baobab")));

        signBlock(((StandingSignBlock) REOBlocks.BAOBAB_SIGN.get()), ((WallSignBlock) REOBlocks.BAOBAB_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        hangingSignBlock(REOBlocks.BAOBAB_HANGING_SIGN.get(), REOBlocks.BAOBAB_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.BAOBAB_DOOR.get()), modLoc("block/door/baobab_lower"),
                modLoc("block/door/baobab_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.BAOBAB_TRAPDOOR.get()),
                modLoc("block/trapdoor/baobab"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BAOBAB_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_BAOBAB_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"));
        simpleBlockItem(REOBlocks.RESISTANT_BAOBAB_LOG.get(), models().orientable("resistant_baobab_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top")));
        simpleBlockItem(REOBlocks.RESISTANT_BAOBAB_WOOD.get(), models().cubeAll("resistant_baobab_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BAOBAB_LOG.get(), models().orientable("resistant_stripped_baobab_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_BAOBAB_WOOD.get(), models().cubeAll("resistant_stripped_baobab_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab")));
        simpleBlockWithItem(REOBlocks.RESISTANT_BAOBAB_PLANKS.get(), models().cubeAll("resistant_baobab_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_BAOBAB_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_BAOBAB_SLAB.get()), blockTexture(REOBlocks.BAOBAB_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_BAOBAB_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_BAOBAB_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/baobab"));

        // Hill Cherry
        axisBlock(((RotatedPillarBlock) REOBlocks.HILL_CHERRY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.HILL_CHERRY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_HILL_CHERRY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"));
        simpleBlockItem(REOBlocks.HILL_CHERRY_LOG.get(), models().orientable("hill_cherry_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry_top")));
        simpleBlockItem(REOBlocks.HILL_CHERRY_WOOD.get(), models().cubeAll("hill_cherry_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry")));
        simpleBlockItem(REOBlocks.STRIPPED_HILL_CHERRY_LOG.get(), models().orientable("stripped_hill_cherry_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry_top")));
        simpleBlockItem(REOBlocks.STRIPPED_HILL_CHERRY_WOOD.get(), models().cubeAll("stripped_hill_cherry_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry")));
        simpleBlockWithItem(REOBlocks.HILL_CHERRY_PLANKS.get(), models().cubeAll("hill_cherry_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry")));

        stairsBlock(((StairBlock) REOBlocks.HILL_CHERRY_STAIRS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry"));
        slabBlock(((SlabBlock) REOBlocks.HILL_CHERRY_SLAB.get()), blockTexture(REOBlocks.HILL_CHERRY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry"));
        fenceBlock(((FenceBlock) REOBlocks.HILL_CHERRY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.HILL_CHERRY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));

        buttonBlock(((ButtonBlock) REOBlocks.HILL_CHERRY_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.HILL_CHERRY_PRESSURE_PLATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));

        saplingBlock(REOBlocks.HILL_CHERRY_SAPLING, "hill_cherry");
        simpleBlockWithItem(REOBlocks.POTTED_HILL_CHERRY_SAPLING.get(), models().singleTexture("potted_sapling_hill_cherry",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/hill_cherry")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.HILL_CHERRY_LEAVES.get(), models().cubeAll("hill_cherry_leaves",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/hill_cherry")));

        signBlock(((StandingSignBlock) REOBlocks.HILL_CHERRY_SIGN.get()), ((WallSignBlock) REOBlocks.HILL_CHERRY_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry"));

        hangingSignBlock(REOBlocks.HILL_CHERRY_HANGING_SIGN.get(), REOBlocks.HILL_CHERRY_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.HILL_CHERRY_DOOR.get()), modLoc("block/door/hill_cherry_lower"),
                modLoc("block/door/hill_cherry_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.HILL_CHERRY_TRAPDOOR.get()), modLoc("block/trapdoor/hill_cherry"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_HILL_CHERRY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"));
        simpleBlockItem(REOBlocks.RESISTANT_HILL_CHERRY_LOG.get(), models().orientable("resistant_hill_cherry_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry_top")));
        simpleBlockItem(REOBlocks.RESISTANT_HILL_CHERRY_WOOD.get(), models().cubeAll("resistant_hill_cherry_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/hill_cherry")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_LOG.get(), models().orientable("resistant_stripped_hill_cherry_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_HILL_CHERRY_WOOD.get(), models().cubeAll("resistant_stripped_hill_cherry_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/hill_cherry")));
        simpleBlockWithItem(REOBlocks.RESISTANT_HILL_CHERRY_PLANKS.get(), models().cubeAll("resistant_hill_cherry_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_HILL_CHERRY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_HILL_CHERRY_SLAB.get()), blockTexture(REOBlocks.HILL_CHERRY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/hill_cherry"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_HILL_CHERRY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_HILL_CHERRY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/hill_cherry"));

        // Chestnut
        axisBlock(((RotatedPillarBlock) REOBlocks.CHESTNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.CHESTNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_CHESTNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_CHESTNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"));
        simpleBlockItem(REOBlocks.CHESTNUT_LOG.get(), models().orientable("chestnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top")));
        simpleBlockItem(REOBlocks.CHESTNUT_WOOD.get(), models().cubeAll("chestnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut")));
        simpleBlockItem(REOBlocks.STRIPPED_CHESTNUT_LOG.get(), models().orientable("stripped_chestnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top")));
        simpleBlockItem(REOBlocks.STRIPPED_CHESTNUT_WOOD.get(), models().cubeAll("stripped_chestnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut")));
        simpleBlockWithItem(REOBlocks.CHESTNUT_PLANKS.get(), models().cubeAll("chestnut_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut")));

        stairsBlock(((StairBlock) REOBlocks.CHESTNUT_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));
        slabBlock(((SlabBlock) REOBlocks.CHESTNUT_SLAB.get()), blockTexture(REOBlocks.CHESTNUT_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceBlock(((FenceBlock) REOBlocks.CHESTNUT_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.CHESTNUT_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));

        buttonBlock(((ButtonBlock) REOBlocks.CHESTNUT_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.CHESTNUT_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        saplingBlock(REOBlocks.CHESTNUT_SAPLING, "chestnut");
        simpleBlockWithItem(REOBlocks.POTTED_CHESTNUT_SAPLING.get(), models().singleTexture("potted_sapling_chestnut",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/chestnut")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.CHESTNUT_LEAVES.get(), models().cubeAll("chestnut_leaves",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/chestnut")));

        signBlock(((StandingSignBlock) REOBlocks.CHESTNUT_SIGN.get()), ((WallSignBlock) REOBlocks.CHESTNUT_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        hangingSignBlock(REOBlocks.CHESTNUT_HANGING_SIGN.get(), REOBlocks.CHESTNUT_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.CHESTNUT_DOOR.get()), modLoc("block/door/chestnut_lower"),
                modLoc("block/door/chestnut_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.CHESTNUT_TRAPDOOR.get()), modLoc("block/trapdoor/chestnut"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CHESTNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CHESTNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"));
        simpleBlockItem(REOBlocks.RESISTANT_CHESTNUT_LOG.get(), models().orientable("resistant_chestnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top")));
        simpleBlockItem(REOBlocks.RESISTANT_CHESTNUT_WOOD.get(), models().cubeAll("resistant_chestnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_LOG.get(), models().orientable("resistant_stripped_chestnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CHESTNUT_WOOD.get(), models().cubeAll("resistant_stripped_chestnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut")));
        simpleBlockWithItem(REOBlocks.RESISTANT_CHESTNUT_PLANKS.get(), models().cubeAll("resistant_chestnut_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_CHESTNUT_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_CHESTNUT_SLAB.get()), blockTexture(REOBlocks.CHESTNUT_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_CHESTNUT_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_CHESTNUT_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/chestnut"));

        // Citrus
        axisBlock(((RotatedPillarBlock) REOBlocks.CITRUS_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.CITRUS_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_CITRUS_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_CITRUS_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"));
        simpleBlockItem(REOBlocks.CITRUS_LOG.get(), models().orientable("citrus_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top")));
        simpleBlockItem(REOBlocks.CITRUS_WOOD.get(), models().cubeAll("citrus_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus")));
        simpleBlockItem(REOBlocks.STRIPPED_CITRUS_LOG.get(), models().orientable("stripped_citrus_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top")));
        simpleBlockItem(REOBlocks.STRIPPED_CITRUS_WOOD.get(), models().cubeAll("stripped_citrus_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus")));
        simpleBlockWithItem(REOBlocks.CITRUS_PLANKS.get(), models().cubeAll("citrus_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus")));

        stairsBlock(((StairBlock) REOBlocks.CITRUS_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));
        slabBlock(((SlabBlock) REOBlocks.CITRUS_SLAB.get()), blockTexture(REOBlocks.CITRUS_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceBlock(((FenceBlock) REOBlocks.CITRUS_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.CITRUS_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));

        buttonBlock(((ButtonBlock) REOBlocks.CITRUS_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.CITRUS_PRESSURE_PLATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));

        saplingBlock(REOBlocks.CITRUS_SAPLING, "citrus");
        simpleBlockWithItem(REOBlocks.POTTED_CITRUS_SAPLING.get(), models().singleTexture("potted_sapling_citrus",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/citrus")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.CITRUS_LEAVES.get(), models().cubeAll("citrus_leaves",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/citrus")));

        signBlock(((StandingSignBlock) REOBlocks.CITRUS_SIGN.get()), ((WallSignBlock) REOBlocks.CITRUS_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        hangingSignBlock(REOBlocks.CITRUS_HANGING_SIGN.get(), REOBlocks.CITRUS_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.CITRUS_DOOR.get()), modLoc("block/door/citrus_lower"),
                modLoc("block/door/citrus_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.CITRUS_TRAPDOOR.get()), modLoc("block/trapdoor/citrus"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CITRUS_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_CITRUS_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"));
        simpleBlockItem(REOBlocks.RESISTANT_CITRUS_LOG.get(), models().orientable("resistant_citrus_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top")));
        simpleBlockItem(REOBlocks.RESISTANT_CITRUS_WOOD.get(), models().cubeAll("resistant_citrus_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CITRUS_LOG.get(), models().orientable("resistant_stripped_citrus_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_CITRUS_WOOD.get(), models().cubeAll("resistant_stripped_citrus_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus")));
        simpleBlockWithItem(REOBlocks.RESISTANT_CITRUS_PLANKS.get(), models().cubeAll("resistant_citrus_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_CITRUS_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_CITRUS_SLAB.get()), blockTexture(REOBlocks.CITRUS_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_CITRUS_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_CITRUS_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/citrus"));

        // Ebony
        axisBlock(((RotatedPillarBlock) REOBlocks.EBONY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.EBONY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_EBONY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_EBONY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"));
        simpleBlockItem(REOBlocks.EBONY_LOG.get(), models().orientable("ebony_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top")));
        simpleBlockItem(REOBlocks.EBONY_WOOD.get(), models().cubeAll("ebony_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony")));
        simpleBlockItem(REOBlocks.STRIPPED_EBONY_LOG.get(), models().orientable("stripped_ebony_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top")));
        simpleBlockItem(REOBlocks.STRIPPED_EBONY_WOOD.get(), models().cubeAll("stripped_ebony_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony")));
        simpleBlockWithItem(REOBlocks.EBONY_PLANKS.get(), models().cubeAll("ebony_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony")));

        stairsBlock(((StairBlock) REOBlocks.EBONY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));
        slabBlock(((SlabBlock) REOBlocks.EBONY_SLAB.get()), blockTexture(REOBlocks.EBONY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceBlock(((FenceBlock) REOBlocks.EBONY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.EBONY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));

        buttonBlock(((ButtonBlock) REOBlocks.EBONY_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.EBONY_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        saplingBlock(REOBlocks.EBONY_SAPLING, "ebony");
        simpleBlockWithItem(REOBlocks.POTTED_EBONY_SAPLING.get(), models().singleTexture("potted_sapling_ebony",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/ebony")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.EBONY_LEAVES.get(),
                models().cubeAll("ebony_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/ebony")));

        signBlock(((StandingSignBlock) REOBlocks.EBONY_SIGN.get()), ((WallSignBlock) REOBlocks.EBONY_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        hangingSignBlock(REOBlocks.EBONY_HANGING_SIGN.get(), REOBlocks.EBONY_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.EBONY_DOOR.get()), modLoc("block/door/ebony_lower"),
                modLoc("block/door/ebony_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.EBONY_TRAPDOOR.get()), modLoc("block/trapdoor/ebony"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_EBONY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_EBONY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"));
        simpleBlockItem(REOBlocks.RESISTANT_EBONY_LOG.get(), models().orientable("resistant_ebony_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top")));
        simpleBlockItem(REOBlocks.RESISTANT_EBONY_WOOD.get(), models().cubeAll("resistant_ebony_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_EBONY_LOG.get(), models().orientable("resistant_stripped_ebony_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_EBONY_WOOD.get(), models().cubeAll("resistant_stripped_ebony_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony")));
        simpleBlockWithItem(REOBlocks.RESISTANT_EBONY_PLANKS.get(), models().cubeAll("resistant_ebony_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_EBONY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_EBONY_SLAB.get()), blockTexture(REOBlocks.EBONY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_EBONY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_EBONY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/ebony"));

        // Larch
        axisBlock(((RotatedPillarBlock) REOBlocks.LARCH_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LARCH_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_LARCH_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_LARCH_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"));
        simpleBlockItem(REOBlocks.LARCH_LOG.get(), models().orientable("larch_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top")));
        simpleBlockItem(REOBlocks.LARCH_WOOD.get(), models().cubeAll("larch_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch")));
        simpleBlockItem(REOBlocks.STRIPPED_LARCH_LOG.get(), models().orientable("stripped_larch_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top")));
        simpleBlockItem(REOBlocks.STRIPPED_LARCH_WOOD.get(), models().cubeAll("stripped_larch_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch")));
        simpleBlockWithItem(REOBlocks.LARCH_PLANKS.get(), models().cubeAll("larch_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch")));

        stairsBlock(((StairBlock) REOBlocks.LARCH_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));
        slabBlock(((SlabBlock) REOBlocks.LARCH_SLAB.get()), blockTexture(REOBlocks.LARCH_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceBlock(((FenceBlock) REOBlocks.LARCH_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.LARCH_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));

        buttonBlock(((ButtonBlock) REOBlocks.LARCH_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.LARCH_PRESSURE_PLATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));

        saplingBlock(REOBlocks.LARCH_SAPLING, "larch");
        simpleBlockWithItem(REOBlocks.POTTED_LARCH_SAPLING.get(), models().singleTexture("potted_sapling_larch",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/larch")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LARCH_LEAVES.get(),
                models().cubeAll("larch_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/larch")));

        signBlock(((StandingSignBlock) REOBlocks.LARCH_SIGN.get()), ((WallSignBlock) REOBlocks.LARCH_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        hangingSignBlock(REOBlocks.LARCH_HANGING_SIGN.get(), REOBlocks.LARCH_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.LARCH_DOOR.get()), modLoc("block/door/larch_lower"),
                modLoc("block/door/larch_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.LARCH_TRAPDOOR.get()), modLoc("block/trapdoor/larch"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_LARCH_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_LARCH_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"));
        simpleBlockItem(REOBlocks.RESISTANT_LARCH_LOG.get(), models().orientable("resistant_larch_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top")));
        simpleBlockItem(REOBlocks.RESISTANT_LARCH_WOOD.get(), models().cubeAll("resistant_larch_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_LARCH_LOG.get(), models().orientable("resistant_stripped_larch_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_LARCH_WOOD.get(), models().cubeAll("resistant_stripped_larch_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch")));
        simpleBlockWithItem(REOBlocks.RESISTANT_LARCH_PLANKS.get(), models().cubeAll("resistant_larch_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_LARCH_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_LARCH_SLAB.get()), blockTexture(REOBlocks.LARCH_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_LARCH_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_LARCH_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/larch"));

        // Lime
        axisBlock(((RotatedPillarBlock) REOBlocks.LIME_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LIME_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_LIME_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_LIME_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"));
        simpleBlockItem(REOBlocks.LIME_LOG.get(), models().orientable("lime_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top")));
        simpleBlockItem(REOBlocks.LIME_WOOD.get(), models().cubeAll("lime_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime")));
        simpleBlockItem(REOBlocks.STRIPPED_LIME_LOG.get(), models().orientable("stripped_lime_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top")));
        simpleBlockItem(REOBlocks.STRIPPED_LIME_WOOD.get(), models().cubeAll("stripped_lime_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime")));
        simpleBlockWithItem(REOBlocks.LIME_PLANKS.get(), models().cubeAll("lime_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime")));

        stairsBlock(((StairBlock) REOBlocks.LIME_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));
        slabBlock(((SlabBlock) REOBlocks.LIME_SLAB.get()), blockTexture(REOBlocks.LIME_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceBlock(((FenceBlock) REOBlocks.LIME_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.LIME_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));

        buttonBlock(((ButtonBlock) REOBlocks.LIME_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.LIME_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        saplingBlock(REOBlocks.LIME_SAPLING, "lime");
        simpleBlockWithItem(REOBlocks.POTTED_LIME_SAPLING.get(), models().singleTexture("potted_sapling_lime",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/lime")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LIME_LEAVES.get(),
                models().cubeAll("lime_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/lime")));

        signBlock(((StandingSignBlock) REOBlocks.LIME_SIGN.get()), ((WallSignBlock) REOBlocks.LIME_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        hangingSignBlock(REOBlocks.LIME_HANGING_SIGN.get(), REOBlocks.LIME_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.LIME_DOOR.get()), modLoc("block/door/lime_lower"),
                modLoc("block/door/lime_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.LIME_TRAPDOOR.get()), modLoc("block/trapdoor/lime"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_LIME_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_LIME_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"));
        simpleBlockItem(REOBlocks.RESISTANT_LIME_LOG.get(), models().orientable("resistant_lime_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top")));
        simpleBlockItem(REOBlocks.RESISTANT_LIME_WOOD.get(), models().cubeAll("resistant_lime_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_LIME_LOG.get(), models().orientable("resistant_stripped_lime_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_LIME_WOOD.get(), models().cubeAll("resistant_stripped_lime_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime")));
        simpleBlockWithItem(REOBlocks.RESISTANT_LIME_PLANKS.get(), models().cubeAll("resistant_lime_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_LIME_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_LIME_SLAB.get()), blockTexture(REOBlocks.LIME_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_LIME_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_LIME_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/lime"));

        // Mahogany
        axisBlock(((RotatedPillarBlock) REOBlocks.MAHOGANY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.MAHOGANY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_MAHOGANY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_MAHOGANY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"));
        simpleBlockItem(REOBlocks.MAHOGANY_LOG.get(), models().orientable("mahogany_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top")));
        simpleBlockItem(REOBlocks.MAHOGANY_WOOD.get(), models().cubeAll("mahogany_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany")));
        simpleBlockItem(REOBlocks.STRIPPED_MAHOGANY_LOG.get(), models().orientable("stripped_mahogany_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top")));
        simpleBlockItem(REOBlocks.STRIPPED_MAHOGANY_WOOD.get(), models().cubeAll("stripped_mahogany_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany")));
        simpleBlockWithItem(REOBlocks.MAHOGANY_PLANKS.get(), models().cubeAll("mahogany_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany")));

        stairsBlock(((StairBlock) REOBlocks.MAHOGANY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));
        slabBlock(((SlabBlock) REOBlocks.MAHOGANY_SLAB.get()), blockTexture(REOBlocks.MAHOGANY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceBlock(((FenceBlock) REOBlocks.MAHOGANY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.MAHOGANY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));

        buttonBlock(((ButtonBlock) REOBlocks.MAHOGANY_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.MAHOGANY_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        saplingBlock(REOBlocks.MAHOGANY_SAPLING, "mahogany");
        simpleBlockWithItem(REOBlocks.POTTED_MAHOGANY_SAPLING.get(), models().singleTexture("potted_sapling_mahogany",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/mahogany")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.MAHOGANY_LEAVES.get(),
                models().cubeAll("mahogany_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/mahogany")));

        signBlock(((StandingSignBlock) REOBlocks.MAHOGANY_SIGN.get()), ((WallSignBlock) REOBlocks.MAHOGANY_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        hangingSignBlock(REOBlocks.MAHOGANY_HANGING_SIGN.get(), REOBlocks.MAHOGANY_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.MAHOGANY_DOOR.get()), modLoc("block/door/mahogany_lower"),
                modLoc("block/door/mahogany_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.MAHOGANY_TRAPDOOR.get()), modLoc("block/trapdoor/mahogany"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MAHOGANY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MAHOGANY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"));
        simpleBlockItem(REOBlocks.RESISTANT_MAHOGANY_LOG.get(), models().orientable("resistant_mahogany_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top")));
        simpleBlockItem(REOBlocks.RESISTANT_MAHOGANY_WOOD.get(), models().cubeAll("resistant_mahogany_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_LOG.get(), models().orientable("resistant_stripped_mahogany_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MAHOGANY_WOOD.get(), models().cubeAll("resistant_stripped_mahogany_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany")));
        simpleBlockWithItem(REOBlocks.RESISTANT_MAHOGANY_PLANKS.get(), models().cubeAll("resistant_mahogany_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_MAHOGANY_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_MAHOGANY_SLAB.get()), blockTexture(REOBlocks.MAHOGANY_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_MAHOGANY_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_MAHOGANY_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/mahogany"));

        // Maple
        axisBlock(((RotatedPillarBlock) REOBlocks.MAPLE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.MAPLE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_MAPLE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_MAPLE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"));
        simpleBlockItem(REOBlocks.MAPLE_LOG.get(), models().orientable("maple_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top")));
        simpleBlockItem(REOBlocks.MAPLE_WOOD.get(), models().cubeAll("maple_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple")));
        simpleBlockItem(REOBlocks.STRIPPED_MAPLE_LOG.get(), models().orientable("stripped_maple_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top")));
        simpleBlockItem(REOBlocks.STRIPPED_MAPLE_WOOD.get(), models().cubeAll("stripped_maple_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple")));
        simpleBlockWithItem(REOBlocks.MAPLE_PLANKS.get(), models().cubeAll("maple_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple")));

        stairsBlock(((StairBlock) REOBlocks.MAPLE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));
        slabBlock(((SlabBlock) REOBlocks.MAPLE_SLAB.get()), blockTexture(REOBlocks.MAPLE_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceBlock(((FenceBlock) REOBlocks.MAPLE_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.MAPLE_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));

        buttonBlock(((ButtonBlock) REOBlocks.MAPLE_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.MAPLE_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        saplingBlock(REOBlocks.MAPLE_SAPLING, "maple");
        simpleBlockWithItem(REOBlocks.POTTED_MAPLE_SAPLING.get(), models().singleTexture("potted_sapling_maple",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/maple")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.MAPLE_LEAVES.get(),
                models().cubeAll("maple_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/maple")));

        signBlock(((StandingSignBlock) REOBlocks.MAPLE_SIGN.get()), ((WallSignBlock) REOBlocks.MAPLE_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        hangingSignBlock(REOBlocks.MAPLE_HANGING_SIGN.get(), REOBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.MAPLE_DOOR.get()), modLoc("block/door/maple_lower"),
                modLoc("block/door/maple_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.MAPLE_TRAPDOOR.get()), modLoc("block/trapdoor/maple"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MAPLE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_MAPLE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"));
        simpleBlockItem(REOBlocks.RESISTANT_MAPLE_LOG.get(), models().orientable("resistant_maple_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top")));
        simpleBlockItem(REOBlocks.RESISTANT_MAPLE_WOOD.get(), models().cubeAll("resistant_maple_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MAPLE_LOG.get(), models().orientable("resistant_stripped_maple_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_MAPLE_WOOD.get(), models().cubeAll("resistant_stripped_maple_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple")));
        simpleBlockWithItem(REOBlocks.RESISTANT_MAPLE_PLANKS.get(), models().cubeAll("resistant_maple_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_MAPLE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_MAPLE_SLAB.get()), blockTexture(REOBlocks.MAPLE_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_MAPLE_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/maple"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_MAPLE_FENCE_GATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        // Palm
        axisBlock(((RotatedPillarBlock) REOBlocks.PALM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.PALM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PALM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PALM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"));
        simpleBlockItem(REOBlocks.PALM_LOG.get(), models().orientable("palm_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top")));
        simpleBlockItem(REOBlocks.PALM_WOOD.get(), models().cubeAll("palm_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm")));
        simpleBlockItem(REOBlocks.STRIPPED_PALM_LOG.get(), models().orientable("stripped_palm_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top")));
        simpleBlockItem(REOBlocks.STRIPPED_PALM_WOOD.get(), models().cubeAll("stripped_palm_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm")));
        simpleBlockWithItem(REOBlocks.PALM_PLANKS.get(), models().cubeAll("palm_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm")));

        stairsBlock(((StairBlock) REOBlocks.PALM_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));
        slabBlock(((SlabBlock) REOBlocks.PALM_SLAB.get()), blockTexture(REOBlocks.PALM_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceBlock(((FenceBlock) REOBlocks.PALM_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.PALM_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));

        buttonBlock(((ButtonBlock) REOBlocks.PALM_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PALM_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        saplingBlock(REOBlocks.PALM_SAPLING, "palm");
        simpleBlockWithItem(REOBlocks.POTTED_PALM_SAPLING.get(), models().singleTexture("potted_sapling_palm",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/palm")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.PALM_LEAVES.get(),
                models().cubeAll("palm_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/palm")));

        signBlock(((StandingSignBlock) REOBlocks.PALM_SIGN.get()), ((WallSignBlock) REOBlocks.PALM_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        hangingSignBlock(REOBlocks.PALM_HANGING_SIGN.get(), REOBlocks.PALM_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.PALM_DOOR.get()), modLoc("block/door/palm_lower"),
                modLoc("block/door/palm_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.PALM_TRAPDOOR.get()), modLoc("block/trapdoor/palm"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PALM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PALM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"));
        simpleBlockItem(REOBlocks.RESISTANT_PALM_LOG.get(), models().orientable("resistant_palm_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top")));
        simpleBlockItem(REOBlocks.RESISTANT_PALM_WOOD.get(), models().cubeAll("resistant_palm_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PALM_LOG.get(), models().orientable("resistant_stripped_palm_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PALM_WOOD.get(), models().cubeAll("resistant_stripped_palm_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm")));
        simpleBlockWithItem(REOBlocks.RESISTANT_PALM_PLANKS.get(), models().cubeAll("resistant_palm_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_PALM_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_PALM_SLAB.get()), blockTexture(REOBlocks.PALM_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_PALM_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_PALM_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/palm"));

        // Papaya
        axisBlock(((RotatedPillarBlock) REOBlocks.PAPAYA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.PAPAYA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PAPAYA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PAPAYA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"));
        simpleBlockItem(REOBlocks.PAPAYA_LOG.get(), models().orientable("papaya_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top")));
        simpleBlockItem(REOBlocks.PAPAYA_WOOD.get(), models().cubeAll("papaya_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya")));
        simpleBlockItem(REOBlocks.STRIPPED_PAPAYA_LOG.get(), models().orientable("stripped_papaya_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top")));
        simpleBlockItem(REOBlocks.STRIPPED_PAPAYA_WOOD.get(), models().cubeAll("stripped_papaya_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya")));
        simpleBlockWithItem(REOBlocks.PAPAYA_PLANKS.get(), models().cubeAll("papaya_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya")));

        stairsBlock(((StairBlock) REOBlocks.PAPAYA_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));
        slabBlock(((SlabBlock) REOBlocks.PAPAYA_SLAB.get()), blockTexture(REOBlocks.PAPAYA_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceBlock(((FenceBlock) REOBlocks.PAPAYA_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.PAPAYA_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));

        buttonBlock(((ButtonBlock) REOBlocks.PAPAYA_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PAPAYA_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        saplingBlock(REOBlocks.PAPAYA_SAPLING, "papaya");
        simpleBlockWithItem(REOBlocks.POTTED_PAPAYA_SAPLING.get(), models().singleTexture("potted_sapling_papaya",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/papaya")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.PAPAYA_LEAVES.get(),
                models().cubeAll("papaya_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/papaya")));

        signBlock(((StandingSignBlock) REOBlocks.PAPAYA_SIGN.get()), ((WallSignBlock) REOBlocks.PAPAYA_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        hangingSignBlock(REOBlocks.PAPAYA_HANGING_SIGN.get(), REOBlocks.PAPAYA_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.PAPAYA_DOOR.get()), modLoc("block/door/papaya_lower"),
                modLoc("block/door/papaya_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.PAPAYA_TRAPDOOR.get()), modLoc("block/trapdoor/papaya"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PAPAYA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PAPAYA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"));
        simpleBlockItem(REOBlocks.RESISTANT_PAPAYA_LOG.get(), models().orientable("resistant_papaya_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top")));
        simpleBlockItem(REOBlocks.RESISTANT_PAPAYA_WOOD.get(), models().cubeAll("resistant_papaya_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PAPAYA_LOG.get(), models().orientable("resistant_stripped_papaya_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PAPAYA_WOOD.get(), models().cubeAll("resistant_stripped_papaya_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya")));
        simpleBlockWithItem(REOBlocks.RESISTANT_PAPAYA_PLANKS.get(), models().cubeAll("resistant_papaya_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_PAPAYA_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_PAPAYA_SLAB.get()), blockTexture(REOBlocks.PAPAYA_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_PAPAYA_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_PAPAYA_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/papaya"));

        // Pine
        axisBlock(((RotatedPillarBlock) REOBlocks.PINE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.PINE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PINE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PINE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"));
        simpleBlockItem(REOBlocks.PINE_LOG.get(), models().orientable("pine_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top")));
        simpleBlockItem(REOBlocks.PINE_WOOD.get(), models().cubeAll("pine_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine")));
        simpleBlockItem(REOBlocks.STRIPPED_PINE_LOG.get(), models().orientable("stripped_pine_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top")));
        simpleBlockItem(REOBlocks.STRIPPED_PINE_WOOD.get(), models().cubeAll("stripped_pine_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine")));
        simpleBlockWithItem(REOBlocks.PINE_PLANKS.get(), models().cubeAll("pine_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine")));

        stairsBlock(((StairBlock) REOBlocks.PINE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));
        slabBlock(((SlabBlock) REOBlocks.PINE_SLAB.get()), blockTexture(REOBlocks.PINE_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceBlock(((FenceBlock) REOBlocks.PINE_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.PINE_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));

        buttonBlock(((ButtonBlock) REOBlocks.PINE_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PINE_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        saplingBlock(REOBlocks.PINE_SAPLING, "pine");
        simpleBlockWithItem(REOBlocks.POTTED_PINE_SAPLING.get(), models().singleTexture("potted_sapling_pine",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/pine")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.PINE_LEAVES.get(),
                models().cubeAll("pine_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/pine")));

        signBlock(((StandingSignBlock) REOBlocks.PINE_SIGN.get()), ((WallSignBlock) REOBlocks.PINE_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        hangingSignBlock(REOBlocks.PINE_HANGING_SIGN.get(), REOBlocks.PINE_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.PINE_DOOR.get()), modLoc("block/door/pine_lower"),
                modLoc("block/door/pine_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.PINE_TRAPDOOR.get()), modLoc("block/trapdoor/pine"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PINE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PINE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"));
        simpleBlockItem(REOBlocks.RESISTANT_PINE_LOG.get(), models().orientable("resistant_pine_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top")));
        simpleBlockItem(REOBlocks.RESISTANT_PINE_WOOD.get(), models().cubeAll("resistant_pine_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PINE_LOG.get(), models().orientable("resistant_stripped_pine_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PINE_WOOD.get(), models().cubeAll("resistant_stripped_pine_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine")));
        simpleBlockWithItem(REOBlocks.RESISTANT_PINE_PLANKS.get(), models().cubeAll("resistant_pine_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_PINE_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_PINE_SLAB.get()), blockTexture(REOBlocks.PINE_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_PINE_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_PINE_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/pine"));

        // Plum
        axisBlock(((RotatedPillarBlock) REOBlocks.PLUM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.PLUM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PLUM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_PLUM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"));
        simpleBlockItem(REOBlocks.PLUM_LOG.get(), models().orientable("plum_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top")));
        simpleBlockItem(REOBlocks.PLUM_WOOD.get(), models().cubeAll("plum_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum")));
        simpleBlockItem(REOBlocks.STRIPPED_PLUM_LOG.get(), models().orientable("stripped_plum_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top")));
        simpleBlockItem(REOBlocks.STRIPPED_PLUM_WOOD.get(), models().cubeAll("stripped_plum_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum")));
        simpleBlockWithItem(REOBlocks.PLUM_PLANKS.get(), models().cubeAll("plum_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum")));

        stairsBlock(((StairBlock) REOBlocks.PLUM_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));
        slabBlock(((SlabBlock) REOBlocks.PLUM_SLAB.get()), blockTexture(REOBlocks.PLUM_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceBlock(((FenceBlock) REOBlocks.PLUM_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.PLUM_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));

        buttonBlock(((ButtonBlock) REOBlocks.PLUM_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PLUM_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        saplingBlock(REOBlocks.PLUM_SAPLING, "plum");
        simpleBlockWithItem(REOBlocks.POTTED_PLUM_SAPLING.get(), models().singleTexture("potted_sapling_plum",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/plum")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.PLUM_LEAVES.get(),
                models().cubeAll("plum_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/plum")));

        signBlock(((StandingSignBlock) REOBlocks.PLUM_SIGN.get()), ((WallSignBlock) REOBlocks.PLUM_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        hangingSignBlock(REOBlocks.PLUM_HANGING_SIGN.get(), REOBlocks.PLUM_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.PLUM_DOOR.get()), modLoc("block/door/plum_lower"),
                modLoc("block/door/plum_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.PLUM_TRAPDOOR.get()), modLoc("block/trapdoor/plum"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PLUM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_PLUM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"));
        simpleBlockItem(REOBlocks.RESISTANT_PLUM_LOG.get(), models().orientable("resistant_plum_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top")));
        simpleBlockItem(REOBlocks.RESISTANT_PLUM_WOOD.get(), models().cubeAll("resistant_plum_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PLUM_LOG.get(), models().orientable("resistant_stripped_plum_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_PLUM_WOOD.get(), models().cubeAll("resistant_stripped_plum_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum")));
        simpleBlockWithItem(REOBlocks.RESISTANT_PLUM_PLANKS.get(), models().cubeAll("resistant_plum_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_PLUM_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_PLUM_SLAB.get()), blockTexture(REOBlocks.PLUM_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_PLUM_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_PLUM_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/plum"));

        // Poplar
        axisBlock(((RotatedPillarBlock) REOBlocks.POPLAR_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.POPLAR_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_POPLAR_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_POPLAR_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"));
        simpleBlockItem(REOBlocks.POPLAR_LOG.get(), models().orientable("poplar_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top")));
        simpleBlockItem(REOBlocks.POPLAR_WOOD.get(), models().cubeAll("poplar_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar")));
        simpleBlockItem(REOBlocks.STRIPPED_POPLAR_LOG.get(), models().orientable("stripped_poplar_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top")));
        simpleBlockItem(REOBlocks.STRIPPED_POPLAR_WOOD.get(), models().cubeAll("stripped_poplar_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar")));
        simpleBlockWithItem(REOBlocks.POPLAR_PLANKS.get(), models().cubeAll("poplar_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar")));

        stairsBlock(((StairBlock) REOBlocks.POPLAR_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));
        slabBlock(((SlabBlock) REOBlocks.POPLAR_SLAB.get()), blockTexture(REOBlocks.POPLAR_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceBlock(((FenceBlock) REOBlocks.POPLAR_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.POPLAR_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));

        buttonBlock(((ButtonBlock) REOBlocks.POPLAR_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.POPLAR_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        saplingBlock(REOBlocks.POPLAR_SAPLING, "poplar");
        simpleBlockWithItem(REOBlocks.POTTED_POPLAR_SAPLING.get(), models().singleTexture("potted_sapling_poplar",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/poplar")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.POPLAR_LEAVES.get(),
                models().cubeAll("poplar_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/poplar")));

        signBlock(((StandingSignBlock) REOBlocks.POPLAR_SIGN.get()), ((WallSignBlock) REOBlocks.POPLAR_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        hangingSignBlock(REOBlocks.POPLAR_HANGING_SIGN.get(), REOBlocks.POPLAR_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.POPLAR_DOOR.get()), modLoc("block/door/poplar_lower"),
                modLoc("block/door/poplar_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.POPLAR_TRAPDOOR.get()), modLoc("block/trapdoor/poplar"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_POPLAR_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_POPLAR_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"));
        simpleBlockItem(REOBlocks.RESISTANT_POPLAR_LOG.get(), models().orientable("resistant_poplar_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top")));
        simpleBlockItem(REOBlocks.RESISTANT_POPLAR_WOOD.get(), models().cubeAll("resistant_poplar_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_POPLAR_LOG.get(), models().orientable("resistant_stripped_poplar_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_POPLAR_WOOD.get(), models().cubeAll("resistant_stripped_poplar_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar")));
        simpleBlockWithItem(REOBlocks.RESISTANT_POPLAR_PLANKS.get(), models().cubeAll("resistant_poplar_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_POPLAR_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_POPLAR_SLAB.get()), blockTexture(REOBlocks.POPLAR_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_POPLAR_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_POPLAR_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/poplar"));

        // Redwood
        axisBlock(((RotatedPillarBlock) REOBlocks.REDWOOD_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.REDWOOD_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_REDWOOD_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_REDWOOD_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"));
        simpleBlockItem(REOBlocks.REDWOOD_LOG.get(), models().orientable("redwood_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top")));
        simpleBlockItem(REOBlocks.REDWOOD_WOOD.get(), models().cubeAll("redwood_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood")));
        simpleBlockItem(REOBlocks.STRIPPED_REDWOOD_LOG.get(), models().orientable("stripped_redwood_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top")));
        simpleBlockItem(REOBlocks.STRIPPED_REDWOOD_WOOD.get(), models().cubeAll("stripped_redwood_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood")));
        simpleBlockWithItem(REOBlocks.REDWOOD_PLANKS.get(), models().cubeAll("redwood_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood")));

        stairsBlock(((StairBlock) REOBlocks.REDWOOD_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));
        slabBlock(((SlabBlock) REOBlocks.REDWOOD_SLAB.get()), blockTexture(REOBlocks.REDWOOD_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceBlock(((FenceBlock) REOBlocks.REDWOOD_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.REDWOOD_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));

        buttonBlock(((ButtonBlock) REOBlocks.REDWOOD_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.REDWOOD_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        saplingBlock(REOBlocks.REDWOOD_SAPLING, "redwood");
        simpleBlockWithItem(REOBlocks.POTTED_REDWOOD_SAPLING.get(), models().singleTexture("potted_sapling_redwood",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/redwood")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.REDWOOD_LEAVES.get(),
                models().cubeAll("redwood_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/redwood")));

        signBlock(((StandingSignBlock) REOBlocks.REDWOOD_SIGN.get()), ((WallSignBlock) REOBlocks.REDWOOD_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        hangingSignBlock(REOBlocks.REDWOOD_HANGING_SIGN.get(), REOBlocks.REDWOOD_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.REDWOOD_DOOR.get()), modLoc("block/door/redwood_lower"),
                modLoc("block/door/redwood_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.REDWOOD_TRAPDOOR.get()), modLoc("block/trapdoor/redwood"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_REDWOOD_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_REDWOOD_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"));
        simpleBlockItem(REOBlocks.RESISTANT_REDWOOD_LOG.get(), models().orientable("resistant_redwood_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top")));
        simpleBlockItem(REOBlocks.RESISTANT_REDWOOD_WOOD.get(), models().cubeAll("resistant_redwood_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_REDWOOD_LOG.get(), models().orientable("resistant_stripped_redwood_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_REDWOOD_WOOD.get(), models().cubeAll("resistant_stripped_redwood_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood")));
        simpleBlockWithItem(REOBlocks.RESISTANT_REDWOOD_PLANKS.get(), models().cubeAll("resistant_redwood_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_REDWOOD_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_REDWOOD_SLAB.get()), blockTexture(REOBlocks.REDWOOD_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_REDWOOD_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_REDWOOD_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/redwood"));

        // Rubber
        axisBlock(((RotatedPillarBlock) REOBlocks.RUBBER_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RUBBER_LOG_SAP.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RUBBER_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RUBBER_WOOD_SAP.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_sap"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_RUBBER_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_RUBBER_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"));
        simpleBlockItem(REOBlocks.RUBBER_LOG.get(), models().orientable("rubber_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top")));
        simpleBlockItem(REOBlocks.RUBBER_LOG_SAP.get(), models().orientable("rubber_log_sap",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_sap"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top")));
        simpleBlockItem(REOBlocks.RUBBER_WOOD.get(), models().cubeAll("rubber_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber")));
        simpleBlockItem(REOBlocks.RUBBER_WOOD_SAP.get(), models().cubeAll("rubber_wood_sap",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_sap")));
        simpleBlockItem(REOBlocks.STRIPPED_RUBBER_LOG.get(), models().orientable("stripped_rubber_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top")));
        simpleBlockItem(REOBlocks.STRIPPED_RUBBER_WOOD.get(), models().cubeAll("stripped_rubber_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber")));
        simpleBlockWithItem(REOBlocks.RUBBER_PLANKS.get(), models().cubeAll("rubber_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber")));

        stairsBlock(((StairBlock) REOBlocks.RUBBER_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));
        slabBlock(((SlabBlock) REOBlocks.RUBBER_SLAB.get()), blockTexture(REOBlocks.RUBBER_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceBlock(((FenceBlock) REOBlocks.RUBBER_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RUBBER_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));

        buttonBlock(((ButtonBlock) REOBlocks.RUBBER_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.RUBBER_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        saplingBlock(REOBlocks.RUBBER_SAPLING, "rubber");
        simpleBlockWithItem(REOBlocks.POTTED_RUBBER_SAPLING.get(), models().singleTexture("potted_sapling_rubber",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/rubber")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.RUBBER_LEAVES.get(),
                models().cubeAll("rubber_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/rubber")));

        signBlock(((StandingSignBlock) REOBlocks.RUBBER_SIGN.get()), ((WallSignBlock) REOBlocks.RUBBER_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        hangingSignBlock(REOBlocks.RUBBER_HANGING_SIGN.get(), REOBlocks.RUBBER_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.RUBBER_DOOR.get()), modLoc("block/door/rubber_lower"),
                modLoc("block/door/rubber_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.RUBBER_TRAPDOOR.get()), modLoc("block/trapdoor/rubber"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_RUBBER_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_RUBBER_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"));
        simpleBlockItem(REOBlocks.RESISTANT_RUBBER_LOG.get(), models().orientable("resistant_rubber_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top")));
        simpleBlockItem(REOBlocks.RESISTANT_RUBBER_WOOD.get(), models().cubeAll("resistant_rubber_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_RUBBER_LOG.get(), models().orientable("resistant_stripped_rubber_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_RUBBER_WOOD.get(), models().cubeAll("resistant_stripped_rubber_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber")));
        simpleBlockWithItem(REOBlocks.RESISTANT_RUBBER_PLANKS.get(), models().cubeAll("resistant_rubber_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_RUBBER_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_RUBBER_SLAB.get()), blockTexture(REOBlocks.RUBBER_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_RUBBER_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_RUBBER_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/rubber"));

        // Teak
        axisBlock(((RotatedPillarBlock) REOBlocks.TEAK_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.TEAK_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_TEAK_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_TEAK_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"));
        simpleBlockItem(REOBlocks.TEAK_LOG.get(), models().orientable("teak_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top")));
        simpleBlockItem(REOBlocks.TEAK_WOOD.get(), models().cubeAll("teak_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak")));
        simpleBlockItem(REOBlocks.STRIPPED_TEAK_LOG.get(), models().orientable("stripped_teak_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top")));
        simpleBlockItem(REOBlocks.STRIPPED_TEAK_WOOD.get(), models().cubeAll("stripped_teak_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak")));
        simpleBlockWithItem(REOBlocks.TEAK_PLANKS.get(), models().cubeAll("teak_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak")));

        stairsBlock(((StairBlock) REOBlocks.TEAK_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));
        slabBlock(((SlabBlock) REOBlocks.TEAK_SLAB.get()), blockTexture(REOBlocks.TEAK_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceBlock(((FenceBlock) REOBlocks.TEAK_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.TEAK_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));

        buttonBlock(((ButtonBlock) REOBlocks.TEAK_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.TEAK_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        saplingBlock(REOBlocks.TEAK_SAPLING, "teak");
        simpleBlockWithItem(REOBlocks.POTTED_TEAK_SAPLING.get(), models().singleTexture("potted_sapling_teak",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/teak")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.TEAK_LEAVES.get(),
                models().cubeAll("teak_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/teak")));

        signBlock(((StandingSignBlock) REOBlocks.TEAK_SIGN.get()), ((WallSignBlock) REOBlocks.TEAK_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        hangingSignBlock(REOBlocks.TEAK_HANGING_SIGN.get(), REOBlocks.TEAK_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.TEAK_DOOR.get()), modLoc("block/door/teak_lower"),
                modLoc("block/door/teak_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TEAK_TRAPDOOR.get()), modLoc("block/trapdoor/teak"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_TEAK_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_TEAK_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"));
        simpleBlockItem(REOBlocks.RESISTANT_TEAK_LOG.get(), models().orientable("resistant_teak_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top")));
        simpleBlockItem(REOBlocks.RESISTANT_TEAK_WOOD.get(), models().cubeAll("resistant_teak_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_TEAK_LOG.get(), models().orientable("resistant_stripped_teak_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_TEAK_WOOD.get(), models().cubeAll("resistant_stripped_teak_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak")));
        simpleBlockWithItem(REOBlocks.RESISTANT_TEAK_PLANKS.get(), models().cubeAll("resistant_teak_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_TEAK_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_TEAK_SLAB.get()), blockTexture(REOBlocks.TEAK_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_TEAK_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/teak"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_TEAK_FENCE_GATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        // Walnut
        axisBlock(((RotatedPillarBlock) REOBlocks.WALNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WALNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_WALNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_WALNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"));
        simpleBlockItem(REOBlocks.WALNUT_LOG.get(), models().orientable("walnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top")));
        simpleBlockItem(REOBlocks.WALNUT_WOOD.get(), models().cubeAll("walnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut")));
        simpleBlockItem(REOBlocks.STRIPPED_WALNUT_LOG.get(), models().orientable("stripped_walnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top")));
        simpleBlockItem(REOBlocks.STRIPPED_WALNUT_WOOD.get(), models().cubeAll("stripped_walnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut")));
        simpleBlockWithItem(REOBlocks.WALNUT_PLANKS.get(), models().cubeAll("walnut_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut")));

        stairsBlock(((StairBlock) REOBlocks.WALNUT_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));
        slabBlock(((SlabBlock) REOBlocks.WALNUT_SLAB.get()), blockTexture(REOBlocks.WALNUT_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceBlock(((FenceBlock) REOBlocks.WALNUT_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.WALNUT_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));

        buttonBlock(((ButtonBlock) REOBlocks.WALNUT_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.WALNUT_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        saplingBlock(REOBlocks.WALNUT_SAPLING, "walnut");
        simpleBlockWithItem(REOBlocks.POTTED_WALNUT_SAPLING.get(), models().singleTexture("potted_sapling_walnut",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/walnut")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.WALNUT_LEAVES.get(),
                models().cubeAll("walnut_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/walnut")));

        signBlock(((StandingSignBlock) REOBlocks.WALNUT_SIGN.get()), ((WallSignBlock) REOBlocks.WALNUT_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        hangingSignBlock(REOBlocks.WALNUT_HANGING_SIGN.get(), REOBlocks.WALNUT_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.WALNUT_DOOR.get()), modLoc("block/door/walnut_lower"),
                modLoc("block/door/walnut_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.WALNUT_TRAPDOOR.get()), modLoc("block/trapdoor/walnut"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_WALNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_WALNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"));
        simpleBlockItem(REOBlocks.RESISTANT_WALNUT_LOG.get(), models().orientable("resistant_walnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top")));
        simpleBlockItem(REOBlocks.RESISTANT_WALNUT_WOOD.get(), models().cubeAll("resistant_walnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_WALNUT_LOG.get(), models().orientable("resistant_stripped_walnut_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_WALNUT_WOOD.get(), models().cubeAll("resistant_stripped_walnut_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut")));
        simpleBlockWithItem(REOBlocks.RESISTANT_WALNUT_PLANKS.get(), models().cubeAll("resistant_walnut_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_WALNUT_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_WALNUT_SLAB.get()), blockTexture(REOBlocks.WALNUT_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_WALNUT_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_WALNUT_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/walnut"));

        // Willow
        axisBlock(((RotatedPillarBlock) REOBlocks.WILLOW_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WILLOW_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.STRIPPED_WILLOW_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"));
        simpleBlockItem(REOBlocks.WILLOW_LOG.get(), models().orientable("willow_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top")));
        simpleBlockItem(REOBlocks.WILLOW_WOOD.get(), models().cubeAll("willow_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow")));
        simpleBlockItem(REOBlocks.STRIPPED_WILLOW_LOG.get(), models().orientable("stripped_willow_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top")));
        simpleBlockItem(REOBlocks.STRIPPED_WILLOW_WOOD.get(), models().cubeAll("stripped_willow_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow")));
        simpleBlockWithItem(REOBlocks.WILLOW_PLANKS.get(), models().cubeAll("willow_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow")));

        stairsBlock(((StairBlock) REOBlocks.WILLOW_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));
        slabBlock(((SlabBlock) REOBlocks.WILLOW_SLAB.get()), blockTexture(REOBlocks.WILLOW_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceBlock(((FenceBlock) REOBlocks.WILLOW_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.WILLOW_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));

        buttonBlock(((ButtonBlock) REOBlocks.WILLOW_BUTTON.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.WILLOW_PRESSURE_PLATE.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        saplingBlock(REOBlocks.WILLOW_SAPLING, "willow");
        simpleBlockWithItem(REOBlocks.POTTED_WILLOW_SAPLING.get(), models().singleTexture("potted_sapling_willow",
                new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/willow")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.WILLOW_LEAVES.get(),
                models().cubeAll("willow_leaves", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/willow")));

        signBlock(((StandingSignBlock) REOBlocks.WILLOW_SIGN.get()), ((WallSignBlock) REOBlocks.WILLOW_WALL_SIGN.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        hangingSignBlock(REOBlocks.WILLOW_HANGING_SIGN.get(), REOBlocks.WILLOW_WALL_HANGING_SIGN.get(),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.WILLOW_DOOR.get()), modLoc("block/door/willow_lower"),
                modLoc("block/door/willow_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.WILLOW_TRAPDOOR.get()), modLoc("block/trapdoor/willow"),
                true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_WILLOW_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_WILLOW_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"));
        simpleBlockItem(REOBlocks.RESISTANT_WILLOW_LOG.get(), models().orientable("resistant_willow_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top")));
        simpleBlockItem(REOBlocks.RESISTANT_WILLOW_WOOD.get(), models().cubeAll("resistant_willow_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_WILLOW_LOG.get(), models().orientable("resistant_stripped_willow_log",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top")));
        simpleBlockItem(REOBlocks.RESISTANT_STRIPPED_WILLOW_WOOD.get(), models().cubeAll("resistant_stripped_willow_wood",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow")));
        simpleBlockWithItem(REOBlocks.RESISTANT_WILLOW_PLANKS.get(), models().cubeAll("resistant_willow_planks",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow")));

        stairsBlock(((StairBlock) REOBlocks.RESISTANT_WILLOW_STAIRS.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));
        slabBlock(((SlabBlock) REOBlocks.RESISTANT_WILLOW_SLAB.get()), blockTexture(REOBlocks.WILLOW_PLANKS.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceBlock(((FenceBlock) REOBlocks.RESISTANT_WILLOW_FENCE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.RESISTANT_WILLOW_FENCE_GATE.get()), new ResourceLocation(RealEarthOres.MOD_ID,
                "block/tree/planks/willow"));

        // Lamp
        addLampVariants(REOBlocks.BLACK_LAMP.get());
        addLampVariants(REOBlocks.RED_LAMP.get());
        addLampVariants(REOBlocks.GREEN_LAMP.get());
        addLampVariants(REOBlocks.BROWN_LAMP.get());
        addLampVariants(REOBlocks.PURPLE_LAMP.get());
        addLampVariants(REOBlocks.CYAN_LAMP.get());
        addLampVariants(REOBlocks.LIGHT_GRAY_LAMP.get());
        addLampVariants(REOBlocks.GRAY_LAMP.get());
        addLampVariants(REOBlocks.PINK_LAMP.get());
        addLampVariants(REOBlocks.LIME_LAMP.get());
        addLampVariants(REOBlocks.YELLOW_LAMP.get());
        addLampVariants(REOBlocks.BLUE_LAMP.get());
        addLampVariants(REOBlocks.LIGHT_BLUE_LAMP.get());
        addLampVariants(REOBlocks.MAGENTA_LAMP.get());
        addLampVariants(REOBlocks.ORANGE_LAMP.get());
        addLampVariants(REOBlocks.WHITE_LAMP.get());

        // Overworld Ore
        simpleBlockWithItem(REOBlocks.ALUMINUM_ORE.get(),
                models().cubeAll("ore_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/aluminium")));
        simpleBlockWithItem(REOBlocks.LEAD_ORE.get(),
                models().cubeAll("ore_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/lead")));
        simpleBlockWithItem(REOBlocks.NICKEL_ORE.get(),
                models().cubeAll("ore_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/nickel")));
        simpleBlockWithItem(REOBlocks.PLATINUM_ORE.get(),
                models().cubeAll("ore_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/platinum")));
        simpleBlockWithItem(REOBlocks.SILVER_ORE.get(),
                models().cubeAll("ore_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/silver")));
        simpleBlockWithItem(REOBlocks.TIN_ORE.get(),
                models().cubeAll("ore_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/tin")));
        simpleBlockWithItem(REOBlocks.URANIUM_ORE.get(),
                models().cubeAll("ore_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/uranium")));
        simpleBlockWithItem(REOBlocks.ZINC_ORE.get(),
                models().cubeAll("ore_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/zinc")));

        // Gravel Ore
        simpleBlockWithItem(REOBlocks.ALUMINUM_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/aluminium")));
        simpleBlockWithItem(REOBlocks.COAL_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_coal", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/coal")));
        simpleBlockWithItem(REOBlocks.COPPER_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_copper", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/copper")));
        simpleBlockWithItem(REOBlocks.DIAMOND_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_diamond", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/diamond")));
        simpleBlockWithItem(REOBlocks.EMERALD_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_emerald", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/emerald")));
        simpleBlockWithItem(REOBlocks.GOLD_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_gold", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/gold")));
        simpleBlockWithItem(REOBlocks.IRON_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_iron", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/iron")));
        simpleBlockWithItem(REOBlocks.LAPIS_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_lapis", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/lapis")));
        simpleBlockWithItem(REOBlocks.LEAD_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/lead")));
        simpleBlockWithItem(REOBlocks.NICKEL_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/nickel")));
        simpleBlockWithItem(REOBlocks.PLATINUM_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/platinum")));
        simpleBlockWithItem(REOBlocks.REDSTONE_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_redstone", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/redstone")));
        simpleBlockWithItem(REOBlocks.SILVER_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/silver")));
        simpleBlockWithItem(REOBlocks.TIN_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/tin")));
        simpleBlockWithItem(REOBlocks.URANIUM_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/uranium")));
        simpleBlockWithItem(REOBlocks.ZINC_GRAVEL_ORE.get(),
                models().cubeAll("gravel_ore_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/zinc")));

        // Depslate Ore
        simpleBlockWithItem(REOBlocks.DEEPSLATE_ALUMINIUM_ORE.get(),
                models().cubeAll("deepslate_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/aluminium")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_LEAD_ORE.get(),
                models().cubeAll("deepslate_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/lead")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_NICKEL_ORE.get(),
                models().cubeAll("deepslate_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/nickel")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                models().cubeAll("deepslate_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/platinum")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_SILVER_ORE.get(),
                models().cubeAll("deepslate_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/silver")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_URANIUM_ORE.get(),
                models().cubeAll("deepslate_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/uranium")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_ZINC_ORE.get(),
                models().cubeAll("deepslate_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/zinc")));

        // Nether Ore
        simpleBlockWithItem(REOBlocks.NETHER_ALUMINIUM_ORE.get(),
                models().cubeAll("nether_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/aluminium")));
        simpleBlockWithItem(REOBlocks.NETHER_COAL_ORE.get(),
                models().cubeAll("nether_coal", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/coal")));
        simpleBlockWithItem(REOBlocks.NETHER_COPPER_ORE.get(),
                models().cubeAll("nether_copper", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/copper")));
        simpleBlockWithItem(REOBlocks.NETHER_DIAMOND_ORE.get(),
                models().cubeAll("nether_diamond", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/diamond")));
        simpleBlockWithItem(REOBlocks.NETHER_EMERALD_ORE.get(),
                models().cubeAll("nether_emerald", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/emerald")));
        simpleBlockWithItem(REOBlocks.NETHER_IRON_ORE.get(),
                models().cubeAll("nether_iron", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/iron")));
        simpleBlockWithItem(REOBlocks.NETHER_LAPIS_ORE.get(),
                models().cubeAll("nether_lapis", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/lapis")));
        simpleBlockWithItem(REOBlocks.NETHER_LEAD_ORE.get(),
                models().cubeAll("nether_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/lead")));
        simpleBlockWithItem(REOBlocks.NETHER_NICKEL_ORE.get(),
                models().cubeAll("nether_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/nickel")));
        simpleBlockWithItem(REOBlocks.NETHER_PLATINUM_ORE.get(),
                models().cubeAll("nether_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/platinum")));
        simpleBlockWithItem(REOBlocks.NETHER_REDSTONE_ORE.get(),
                models().cubeAll("nether_redstone", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/redstone")));
        simpleBlockWithItem(REOBlocks.NETHER_SILVER_ORE.get(),
                models().cubeAll("nether_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/silver")));
        simpleBlockWithItem(REOBlocks.NETHER_TIN_ORE.get(),
                models().cubeAll("nether_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/tin")));
        simpleBlockWithItem(REOBlocks.NETHER_URANIUM_ORE.get(),
                models().cubeAll("nether_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/uranium")));
        simpleBlockWithItem(REOBlocks.NETHER_ZINC_ORE.get(),
                models().cubeAll("nether_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/zinc")));

        // End Ore
        simpleBlockWithItem(REOBlocks.ENDERITE_ORE.get(),
                models().cubeAll("end_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/end/enderite")));

        // Storage
        simpleBlockWithItem(REOBlocks.ALUMINUM_BLOCK.get(),
                models().cubeAll("block_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/aluminium")));
        simpleBlockWithItem(REOBlocks.BRASS_BLOCK.get(),
                models().cubeAll("block_brass", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/brass")));
        simpleBlockWithItem(REOBlocks.BRONZE_BLOCK.get(),
                models().cubeAll("block_bronze", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/bronze")));
        simpleBlockWithItem(REOBlocks.ELECTRUM_BLOCK.get(),
                models().cubeAll("block_electrum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/electrum")));
        simpleBlockWithItem(REOBlocks.ENDERITE_BLOCK.get(),
                models().cubeAll("block_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/enderite")));
        simpleBlockWithItem(REOBlocks.LEAD_BLOCK.get(),
                models().cubeAll("block_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/lead")));
        simpleBlockWithItem(REOBlocks.NICKEL_BLOCK.get(),
                models().cubeAll("block_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/nickel")));
        simpleBlockWithItem(REOBlocks.PERIDOT_BLOCK.get(),
                models().cubeAll("block_peridot", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/peridot")));
        simpleBlockWithItem(REOBlocks.PLATINUM_BLOCK.get(),
                models().cubeAll("block_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/platinum")));
        simpleBlockWithItem(REOBlocks.RUBY_BLOCK.get(),
                models().cubeAll("block_ruby", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/ruby")));
        simpleBlockWithItem(REOBlocks.SAPPHIRE_BLOCK.get(),
                models().cubeAll("block_sapphire", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/sapphire")));
        simpleBlockWithItem(REOBlocks.SILVER_BLOCK.get(),
                models().cubeAll("block_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/silver")));
        simpleBlockWithItem(REOBlocks.STEEL_BLOCK.get(),
                models().cubeAll("block_steel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/steel")));
        simpleBlockWithItem(REOBlocks.TIN_BLOCK.get(),
                models().cubeAll("block_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/tin")));
        simpleBlockWithItem(REOBlocks.URANIUM_BLOCK.get(),
                models().cubeAll("block_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/uranium")));
        simpleBlockWithItem(REOBlocks.ZINC_BLOCK.get(),
                models().cubeAll("block_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/zinc")));

        // Raw Storage
        simpleBlockWithItem(REOBlocks.RAW_ALUMINIUM_BLOCK.get(),
                models().cubeAll("block_raw_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/aluminium")));
        simpleBlockWithItem(REOBlocks.RAW_ENDERITE_BLOCK.get(),
                models().cubeAll("block_raw_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/enderite")));
        simpleBlockWithItem(REOBlocks.RAW_LEAD_BLOCK.get(),
                models().cubeAll("block_raw_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/lead")));
        simpleBlockWithItem(REOBlocks.RAW_NICKEL_BLOCK.get(),
                models().cubeAll("block_raw_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/nickel")));
        simpleBlockWithItem(REOBlocks.RAW_PLATINUM_BLOCK.get(),
                models().cubeAll("block_raw_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/platinum")));
        simpleBlockWithItem(REOBlocks.RAW_SILVER_BLOCK.get(),
                models().cubeAll("block_raw_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/silver")));
        simpleBlockWithItem(REOBlocks.RAW_TIN_BLOCK.get(),
                models().cubeAll("block_raw_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/tin")));
        simpleBlockWithItem(REOBlocks.RAW_URANIUM_BLOCK.get(),
                models().cubeAll("block_raw_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/uranium")));
        simpleBlockWithItem(REOBlocks.RAW_ZINC_BLOCK.get(),
                models().cubeAll("block_raw_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/zinc")));


        // Budding
        simpleBlockWithItem(REOBlocks.BUDDING_PERIDOT.get(),
                models().cubeAll("budding_peridot", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/budding/peridot")));
        simpleBlockWithItem(REOBlocks.BUDDING_RUBY.get(),
                models().cubeAll("budding_ruby", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/budding/ruby")));
        simpleBlockWithItem(REOBlocks.BUDDING_SAPPHIRE.get(),
                models().cubeAll("budding_sapphire", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/budding/sapphire")));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private void addLampVariants(Block block) {
        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder()
                .modelFile(lampBlock(block, state.getValue(LampBlock.CLICKED)))
                .build());
    }

    private BlockModelBuilder lampBlock (Block block, boolean clicked) {
        String texture = ForgeRegistries.BLOCKS.getKey(block).getPath();
        String litKey = clicked ? "_on" : "";
        String modelName = texture + litKey;
        return models().cubeAll(modelName, modLoc("block/lamp/" + texture + litKey));
    }

    private void colourLeavesBlock(RegistryObject<Block> blockRegistryObject, String texture) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/" + texture)).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject, String texture) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/" + texture)).renderType("cutout"));
    }

    private void wildBlock(RegistryObject<Block> blockRegistryObject, String texture) {
        simpleBlock(blockRegistryObject.get(),
                models().crop(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + texture)).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    public void makeBlackberryBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> blackberryStates(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] blackberryStates(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(BlackberryBlock.AGE),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/berry_bush/" + textureName + state.getValue(BlackberryBlock.AGE))).renderType("cutout"));

        return models;
    }

    public void makeBlueberryBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> blueberryStates(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] blueberryStates(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(BlueberryBlock.AGE),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/berry_bush/" + textureName + state.getValue(BlackberryBlock.AGE))).renderType("cutout"));

        return models;
    }

    public void makeRaspberryBush(SweetBerryBushBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> raspberryStates(state, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] raspberryStates(BlockState state, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(RaspberryBlock.AGE),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/berry_bush/" + textureName + state.getValue(BlackberryBlock.AGE))).renderType("cutout"));

        return models;
    }

    public void makeBarleyCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> barleyStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] barleyStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BarleyBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((BarleyBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;

    }

    public void makeCauliflowerCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cauliflowerStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cauliflowerStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CauliflowerBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((CauliflowerBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;

    }    public void makeCottonCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cottonStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cottonStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CottonBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((CottonBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }    public void makeOnionsCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> onionsStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] onionsStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OnionsBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((OnionsBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }    public void makeRiceCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> riceStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] riceStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((RiceBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((RiceBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeTomatoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tomatoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tomatoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TomatoBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/crops/" + textureName + state.getValue(((TomatoBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeCitusFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> citrusStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] citrusStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((CitrusBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((CitrusBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeLimeFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> limeStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] limeStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((LimeBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((LimeBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makePapayaFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> papayaStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] papayaStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((PapayaBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((PapayaBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makePearFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> pearStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] pearStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((PearBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((PearBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makePlumFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> plumStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] plumStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((PlumBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((PlumBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeWalnutFruit(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> walnutStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] walnutStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((WalnutBlock) block).getAgeProperty()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/fruit/" + textureName + state.getValue(((WalnutBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

}