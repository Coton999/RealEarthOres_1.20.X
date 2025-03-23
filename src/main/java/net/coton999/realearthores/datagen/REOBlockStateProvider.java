package net.coton999.realearthores.datagen;


import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.custom.misc.LampBlock;
import net.coton999.realearthores.block.custom.bush.BlackberryBlock;
import net.coton999.realearthores.block.custom.bush.BlueberryBlock;
import net.coton999.realearthores.block.custom.bush.RaspberryBlock;
import net.coton999.realearthores.block.custom.crop.food.*;
import net.coton999.realearthores.block.custom.fruit.*;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.*;
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
        simpleBlockWithItem(REOBlocks.MARBLE_CHISELED.get(),
                models().cubeAll("marble_chisled", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_chiseled")));
        simpleBlockWithItem(REOBlocks.MARBLE_CRACKED.get(),
                models().cubeAll("marble_cracked", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/marble/marble_cracked")));

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
        simpleBlockWithItem(REOBlocks.LIMESTONE_CHISELED.get(),
                models().cubeAll("limestone_chisled", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_chiseled")));
        simpleBlockWithItem(REOBlocks.LIMESTONE_CRACKED.get(),
                models().cubeAll("limestone_cracked", new ResourceLocation(RealEarthOres.MOD_ID, "block/building_blocks/limestone/limestone_cracked")));

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
        makeBarleyCrop((CropBlock) REOBlocks.CROP_BARLEY.get(), "barley_stage_", "barley_stage_");
        makeCauliflowerCrop((CropBlock) REOBlocks.CROP_CAULIFLOWER.get(), "cauliflower_stage_", "cauliflower_stage_");
        makeCottonCrop((CropBlock) REOBlocks.CROP_COTTON.get(), "cotton_stage_", "cotton_stage_");
        makeOnionsCrop((CropBlock) REOBlocks.CROP_ONIONS.get(), "onions_stage_", "onions_stage_");
        makeRiceCrop((CropBlock) REOBlocks.CROP_RICE.get(), "rice_stage_", "rice_stage_");
        makeTomatoCrop((CropBlock) REOBlocks.CROP_TOMATO.get(), "tomato_stage_", "tomato_stage_");

        wildBlock(REOBlocks.WILD_BARLEY, "wild_barley");
        wildBlock(REOBlocks.WILD_COTTON, "wild_cotton");
        wildBlock(REOBlocks.WILD_RICE, "wild_rice");
        wildBlock(REOBlocks.WILD_TOMATO, "wild_tomato");

        // Fruits //
        makeCitusFruit(REOBlocks.FRUIT_CITRUS_BLOCK.get(), "citrus_stage_", "citrus_stage_");
        makeLimeFruit(REOBlocks.FRUIT_LIME_BLOCK.get(), "lime_stage_", "lime_stage_");
        makePapayaFruit(REOBlocks.FRUIT_PAPAYA_BLOCK.get(), "papaya_stage_", "papaya_stage_");
        makePearFruit(REOBlocks.FRUIT_PEAR_BLOCK.get(), "pear_stage_", "pear_stage_");
        makePlumFruit(REOBlocks.FRUIT_PLUM_BLOCK.get(), "plum_stage_", "plum_stage_");
        makeWalnutFruit(REOBlocks.FRUIT_WALNUT_BLOCK.get(), "walnut_stage_", "walnut_stage_");

        // Berry //
        makeBlackberryBush((SweetBerryBushBlock) REOBlocks.BERRY_BLACKBERRY_BLOCK.get(), "blackberry_bush_stage_", "blackberry_bush_stage_");
        makeBlueberryBush((SweetBerryBushBlock) REOBlocks.BERRY_BLUEBERRY_BLOCK.get(), "blueberry_bush_stage_", "blueberry_bush_stage_");
        makeRaspberryBush((SweetBerryBushBlock) REOBlocks.BERRY_RASPBERRY_BLOCK.get(), "raspberry_bush_stage_", "raspberry_bush_stage_");


        // Wood
        // Vanilla
        // Oak
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_LOG),
                new ResourceLocation("block/oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_OAK_LOG),
                new ResourceLocation("block/stripped_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_OAK_LOG), blockTexture(Blocks.STRIPPED_OAK_LOG));
        simpleBlockItem(REOBlocks.LOG_OAK_RESISTANT.get(),
                models().orientable("log_oak_resistant", blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG),
                        new ResourceLocation("block/oak_log_top")));
        simpleBlockItem(REOBlocks.WOOD_OAK_RESISTANT.get(),
                models().cubeAll("wood_oak_resistant", blockTexture(Blocks.OAK_LOG)));
        simpleBlockItem(REOBlocks.LOG_OAK_STRIPPED_RESISTANT.get(),
                models().orientable("log_oak_stripped_resistant", blockTexture(Blocks.OAK_LOG), blockTexture(Blocks.OAK_LOG),
                        new ResourceLocation("block/stripped_oak_log_top")));
        simpleBlockItem(REOBlocks.WOOD_OAK_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_oak_stripped_resistant", blockTexture(Blocks.STRIPPED_OAK_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_OAK_RESISTANT.get(),
                models().cubeAll("planks_oak_resistant", blockTexture(Blocks.OAK_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_PLANKS), blockTexture(Blocks.OAK_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_OAK_RESISTANT.get()), blockTexture(Blocks.OAK_PLANKS));

        // Spruce
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_LOG),
                new ResourceLocation("block/spruce_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_SPRUCE_LOG),
                new ResourceLocation("block/stripped_spruce_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_SPRUCE_LOG), blockTexture(Blocks.STRIPPED_SPRUCE_LOG));
        simpleBlockItem(REOBlocks.LOG_SPRUCE_RESISTANT.get(),
                models().orientable("log_spruce_resistant", blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG),
                        new ResourceLocation("block/spruce_log_top")));
        simpleBlockItem(REOBlocks.WOOD_SPRUCE_RESISTANT.get(),
                models().cubeAll("wood_spruce_resistant", blockTexture(Blocks.SPRUCE_LOG)));
        simpleBlockItem(REOBlocks.LOG_SPRUCE_STRIPPED_RESISTANT.get(),
                models().orientable("log_spruce_stripped_resistant", blockTexture(Blocks.SPRUCE_LOG), blockTexture(Blocks.SPRUCE_LOG),
                        new ResourceLocation("block/stripped_spruce_log_top")));
        simpleBlockItem(REOBlocks.WOOD_SPRUCE_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_spruce_stripped_resistant", blockTexture(Blocks.STRIPPED_SPRUCE_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_SPRUCE_RESISTANT.get(),
                models().cubeAll("planks_spruce_resistant", blockTexture(Blocks.SPRUCE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_PLANKS), blockTexture(Blocks.SPRUCE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_SPRUCE_RESISTANT.get()), blockTexture(Blocks.SPRUCE_PLANKS));

        // Birch
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_LOG),
                new ResourceLocation("block/birch_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_BIRCH_LOG),
                new ResourceLocation("block/stripped_birch_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_BIRCH_LOG), blockTexture(Blocks.STRIPPED_BIRCH_LOG));
        simpleBlockItem(REOBlocks.LOG_BIRCH_RESISTANT.get(),
                models().orientable("log_birch_resistant", blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG),
                        new ResourceLocation("block/birch_log_top")));
        simpleBlockItem(REOBlocks.WOOD_BIRCH_RESISTANT.get(),
                models().cubeAll("wood_birch_resistant", blockTexture(Blocks.BIRCH_LOG)));
        simpleBlockItem(REOBlocks.LOG_BIRCH_STRIPPED_RESISTANT.get(),
                models().orientable("log_birch_stripped_resistant", blockTexture(Blocks.BIRCH_LOG), blockTexture(Blocks.BIRCH_LOG),
                        new ResourceLocation("block/stripped_birch_log_top")));
        simpleBlockItem(REOBlocks.WOOD_BIRCH_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_birch_stripped_resistant", blockTexture(Blocks.STRIPPED_BIRCH_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_BIRCH_RESISTANT.get(),
                models().cubeAll("planks_birch_resistant", blockTexture(Blocks.BIRCH_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_PLANKS), blockTexture(Blocks.BIRCH_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_BIRCH_RESISTANT.get()), blockTexture(Blocks.BIRCH_PLANKS));

        // Jungle
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_LOG),
                new ResourceLocation("block/jungle_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_JUNGLE_LOG),
                new ResourceLocation("block/stripped_jungle_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_JUNGLE_LOG), blockTexture(Blocks.STRIPPED_JUNGLE_LOG));
        simpleBlockItem(REOBlocks.LOG_JUNGLE_RESISTANT.get(),
                models().orientable("log_jungle_resistant", blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG),
                        new ResourceLocation("block/jungle_log_top")));
        simpleBlockItem(REOBlocks.WOOD_JUNGLE_RESISTANT.get(),
                models().cubeAll("wood_jungle_resistant", blockTexture(Blocks.JUNGLE_LOG)));
        simpleBlockItem(REOBlocks.LOG_JUNGLE_STRIPPED_RESISTANT.get(),
                models().orientable("log_jungle_stripped_resistant", blockTexture(Blocks.JUNGLE_LOG), blockTexture(Blocks.JUNGLE_LOG),
                        new ResourceLocation("block/stripped_jungle_log_top")));
        simpleBlockItem(REOBlocks.WOOD_JUNGLE_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_jungle_stripped_resistant", blockTexture(Blocks.STRIPPED_JUNGLE_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_JUNGLE_RESISTANT.get(),
                models().cubeAll("planks_jungle_resistant", blockTexture(Blocks.JUNGLE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_PLANKS), blockTexture(Blocks.JUNGLE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_JUNGLE_RESISTANT.get()), blockTexture(Blocks.JUNGLE_PLANKS));

        // Acacia
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_LOG),
                new ResourceLocation("block/acacia_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_ACACIA_LOG),
                new ResourceLocation("block/stripped_acacia_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_ACACIA_LOG), blockTexture(Blocks.STRIPPED_ACACIA_LOG));
        simpleBlockItem(REOBlocks.LOG_ACACIA_RESISTANT.get(),
                models().orientable("log_acacia_resistant", blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG),
                        new ResourceLocation("block/acacia_log_top")));
        simpleBlockItem(REOBlocks.WOOD_ACACIA_RESISTANT.get(),
                models().cubeAll("wood_acacia_resistant", blockTexture(Blocks.ACACIA_LOG)));
        simpleBlockItem(REOBlocks.LOG_ACACIA_STRIPPED_RESISTANT.get(),
                models().orientable("log_acacia_stripped_resistant", blockTexture(Blocks.ACACIA_LOG), blockTexture(Blocks.ACACIA_LOG),
                        new ResourceLocation("block/stripped_acacia_log_top")));
        simpleBlockItem(REOBlocks.WOOD_ACACIA_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_acacia_stripped_resistant", blockTexture(Blocks.STRIPPED_ACACIA_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_ACACIA_RESISTANT.get(),
                models().cubeAll("planks_acacia_resistant", blockTexture(Blocks.ACACIA_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_PLANKS), blockTexture(Blocks.ACACIA_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_ACACIA_RESISTANT.get()), blockTexture(Blocks.ACACIA_PLANKS));

        // Dark Oak
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_LOG),
                new ResourceLocation("block/dark_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG),
                new ResourceLocation("block/stripped_dark_oak_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG), blockTexture(Blocks.STRIPPED_DARK_OAK_LOG));
        simpleBlockItem(REOBlocks.LOG_DARK_OAK_RESISTANT.get(),
                models().orientable("log_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG),
                        new ResourceLocation("block/dark_oak_log_top")));
        simpleBlockItem(REOBlocks.WOOD_DARK_OAK_RESISTANT.get(),
                models().cubeAll("wood_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_LOG)));
        simpleBlockItem(REOBlocks.LOG_DARK_OAK_STRIPPED_RESISTANT.get(),
                models().orientable("log_dark_oak_stripped_resistant", blockTexture(Blocks.DARK_OAK_LOG), blockTexture(Blocks.DARK_OAK_LOG),
                        new ResourceLocation("block/stripped_dark_oak_log_top")));
        simpleBlockItem(REOBlocks.WOOD_DARK_OAK_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_dark_oak_stripped_resistant", blockTexture(Blocks.STRIPPED_DARK_OAK_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_DARK_OAK_RESISTANT.get(),
                models().cubeAll("planks_dark_oak_resistant", blockTexture(Blocks.DARK_OAK_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_PLANKS), blockTexture(Blocks.DARK_OAK_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_DARK_OAK_RESISTANT.get()), blockTexture(Blocks.DARK_OAK_PLANKS));

        // Mangrove
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_LOG),
                new ResourceLocation("block/mangrove_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_MANGROVE_LOG),
                new ResourceLocation("block/stripped_mangrove_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_MANGROVE_LOG), blockTexture(Blocks.STRIPPED_MANGROVE_LOG));
        simpleBlockItem(REOBlocks.LOG_MANGROVE_RESISTANT.get(),
                models().orientable("log_mangrove_resistant", blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG),
                        new ResourceLocation("block/mangrove_log_top")));
        simpleBlockItem(REOBlocks.WOOD_MANGROVE_RESISTANT.get(),
                models().cubeAll("wood_mangrove_resistant", blockTexture(Blocks.MANGROVE_LOG)));
        simpleBlockItem(REOBlocks.LOG_MANGROVE_STRIPPED_RESISTANT.get(),
                models().orientable("log_mangrove_stripped_resistant", blockTexture(Blocks.MANGROVE_LOG), blockTexture(Blocks.MANGROVE_LOG),
                        new ResourceLocation("block/stripped_mangrove_log_top")));
        simpleBlockItem(REOBlocks.WOOD_MANGROVE_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_mangrove_stripped_resistant", blockTexture(Blocks.STRIPPED_MANGROVE_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_MANGROVE_RESISTANT.get(),
                models().cubeAll("planks_mangrove_resistant", blockTexture(Blocks.MANGROVE_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_PLANKS), blockTexture(Blocks.MANGROVE_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_MANGROVE_RESISTANT.get()), blockTexture(Blocks.MANGROVE_PLANKS));

        // Cherry
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_LOG),
                new ResourceLocation("block/cherry_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_CHERRY_LOG),
                new ResourceLocation("block/stripped_cherry_log_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get()), blockTexture(Blocks.STRIPPED_CHERRY_LOG), blockTexture(Blocks.STRIPPED_CHERRY_LOG));
        simpleBlockItem(REOBlocks.LOG_CHERRY_RESISTANT.get(),
                models().orientable("log_cherry_resistant", blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG),
                        new ResourceLocation("block/cherry_log_top")));
        simpleBlockItem(REOBlocks.WOOD_CHERRY_RESISTANT.get(),
                models().cubeAll("wood_cherry_resistant", blockTexture(Blocks.CHERRY_LOG)));
        simpleBlockItem(REOBlocks.LOG_CHERRY_STRIPPED_RESISTANT.get(),
                models().orientable("log_cherry_stripped_resistant", blockTexture(Blocks.CHERRY_LOG), blockTexture(Blocks.CHERRY_LOG),
                        new ResourceLocation("block/stripped_cherry_log_top")));
        simpleBlockItem(REOBlocks.WOOD_CHERRY_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_cherry_stripped_resistant", blockTexture(Blocks.STRIPPED_CHERRY_LOG)));
        simpleBlockWithItem(REOBlocks.PLANKS_CHERRY_RESISTANT.get(),
                models().cubeAll("planks_cherry_resistant", blockTexture(Blocks.CHERRY_PLANKS)));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_PLANKS));
        slabBlock(((SlabBlock) REOBlocks.SLAB_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_PLANKS), blockTexture(Blocks.CHERRY_PLANKS));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_PLANKS));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_CHERRY_RESISTANT.get()), blockTexture(Blocks.CHERRY_PLANKS));


        // Modded
        // Balsa
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BALSA_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BALSA_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"));
        simpleBlockItem(REOBlocks.LOG_BALSA.get(),
                models().orientable("log_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top")));
        simpleBlockItem(REOBlocks.WOOD_BALSA.get(),
                models().cubeAll("wood_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa")));
        simpleBlockItem(REOBlocks.LOG_BALSA_STRIPPED.get(),
                models().orientable("log_balsa_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top")));
        simpleBlockItem(REOBlocks.WOOD_BALSA_STRIPPED.get(),
                models().cubeAll("wood_balsa_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa")));
        simpleBlockWithItem(REOBlocks.PLANKS_BALSA.get(),
                models().cubeAll("planks_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_BALSA.get()), blockTexture(REOBlocks.PLANKS_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        saplingBlock(REOBlocks.SAPLING_BALSA, "balsa");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_BALSA.get(), models().singleTexture("potted_sapling_balsa", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/balsa")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_BALSA.get(),
                models().cubeAll("leaves_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/balsa")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_BALSA.get()), ((WallSignBlock) REOBlocks.SIGN_BALSA_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_BALSA.get(), REOBlocks.SIGN_HANGING_BALSA_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_BALSA.get()), modLoc("block/door/balsa_lower"), modLoc("block/door/balsa_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_BALSA.get()), modLoc("block/trapdoor/trapdoor_balsa"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BALSA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BALSA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"));
        simpleBlockItem(REOBlocks.LOG_BALSA_RESISTANT.get(),
                models().orientable("log_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa_top")));
        simpleBlockItem(REOBlocks.WOOD_BALSA_RESISTANT.get(),
                models().cubeAll("wood_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/balsa")));
        simpleBlockItem(REOBlocks.LOG_BALSA_STRIPPED_RESISTANT.get(),
                models().orientable("log_balsa_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa_top")));
        simpleBlockItem(REOBlocks.WOOD_BALSA_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_balsa_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/balsa")));
        simpleBlockWithItem(REOBlocks.PLANKS_BALSA_RESISTANT.get(),
                models().cubeAll("planks_balsa", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_BALSA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_BALSA_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_BALSA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_BALSA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_BALSA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/balsa"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BAOBAB_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BAOBAB_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"));
        simpleBlockItem(REOBlocks.LOG_BAOBAB.get(),
                models().orientable("log_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top")));
        simpleBlockItem(REOBlocks.WOOD_BAOBAB.get(),
                models().cubeAll("wood_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab")));
        simpleBlockItem(REOBlocks.LOG_BAOBAB_STRIPPED.get(),
                models().orientable("log_baobab_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top")));
        simpleBlockItem(REOBlocks.WOOD_BAOBAB_STRIPPED.get(),
                models().cubeAll("wood_baobab_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab")));
        simpleBlockWithItem(REOBlocks.PLANKS_BAOBAB.get(),
                models().cubeAll("planks_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_BAOBAB.get()), blockTexture(REOBlocks.PLANKS_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));


        saplingBlock(REOBlocks.SAPLING_BAOBAB, "baobab");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_BAOBAB.get(), models().singleTexture("potted_sapling_baobab", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/baobab")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_BAOBAB.get(),
                models().cubeAll("leaves_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/baobab")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_BAOBAB.get()), ((WallSignBlock) REOBlocks.SIGN_BAOBAB_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_BAOBAB.get(), REOBlocks.SIGN_HANGING_BAOBAB_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_BAOBAB.get()), modLoc("block/door/baobab_lower"), modLoc("block/door/baobab_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_BAOBAB.get()), modLoc("block/trapdoor/trapdoor_baobab"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BAOBAB_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BAOBAB_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"));
        simpleBlockItem(REOBlocks.LOG_BAOBAB_RESISTANT.get(),
                models().orientable("log_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab_top")));
        simpleBlockItem(REOBlocks.WOOD_BAOBAB_RESISTANT.get(),
                models().cubeAll("wood_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/baobab")));
        simpleBlockItem(REOBlocks.LOG_BAOBAB_STRIPPED_RESISTANT.get(),
                models().orientable("log_baobab_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab_top")));
        simpleBlockItem(REOBlocks.WOOD_BAOBAB_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_baobab_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/baobab")));
        simpleBlockWithItem(REOBlocks.PLANKS_BAOBAB_RESISTANT.get(),
                models().cubeAll("planks_baobab", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_BAOBAB_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_BAOBAB_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_BAOBAB.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_BAOBAB_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_BAOBAB_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/baobab"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_HILL_CHERRY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"));
        simpleBlockItem(REOBlocks.LOG_HILL_CHERRY.get(),
                models().orientable("log_hill_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry_top")));
        simpleBlockItem(REOBlocks.WOOD_HILL_CHERRY.get(),
                models().cubeAll("wood_hill_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry")));
        simpleBlockItem(REOBlocks.LOG_HILL_CHERRY_STRIPPED.get(),
                models().orientable("log_hill_cherry_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry_top")));
        simpleBlockItem(REOBlocks.WOOD_HILL_CHERRY_STRIPPED.get(),
                models().cubeAll("wood_hill_cherry_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry")));
        simpleBlockWithItem(REOBlocks.PLANKS_HILL_CHERRY.get(),
                models().cubeAll("planks_hill_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_HILL_CHERRY.get()), blockTexture(REOBlocks.PLANKS_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));


        saplingBlock(REOBlocks.SAPLING_HILL_CHERRY, "cherry");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_HILL_CHERRY.get(), models().singleTexture("potted_sapling_cherry", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/cherry")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_HILL_CHERRY.get(),
                models().cubeAll("leaves_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/cherry")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_HILL_CHERRY.get()), ((WallSignBlock) REOBlocks.SIGN_HILL_CHERRY_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_HILL_CHERRY.get(), REOBlocks.SIGN_HANGING_HILL_CHERRY_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_HILL_CHERRY.get()), modLoc("block/door/cherry_lower"), modLoc("block/door/cherry_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_HILL_CHERRY.get()), modLoc("block/trapdoor/trapdoor_cherry"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_HILL_CHERRY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"));
        simpleBlockItem(REOBlocks.LOG_HILL_CHERRY_RESISTANT.get(),
                models().orientable("log_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry_top")));
        simpleBlockItem(REOBlocks.WOOD_HILL_CHERRY_RESISTANT.get(),
                models().cubeAll("wood_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/cherry")));
        simpleBlockItem(REOBlocks.LOG_HILL_CHERRY_STRIPPED_RESISTANT.get(),
                models().orientable("log_cherry_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry_top")));
        simpleBlockItem(REOBlocks.WOOD_HILL_CHERRY_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_cherry_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/cherry")));
        simpleBlockWithItem(REOBlocks.PLANKS_HILL_CHERRY_RESISTANT.get(),
                models().cubeAll("planks_cherry", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_HILL_CHERRY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_HILL_CHERRY_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_HILL_CHERRY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_HILL_CHERRY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_HILL_CHERRY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/cherry"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHESTNUT_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHESTNUT_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"));
        simpleBlockItem(REOBlocks.LOG_CHESTNUT.get(),
                models().orientable("log_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top")));
        simpleBlockItem(REOBlocks.WOOD_CHESTNUT.get(),
                models().cubeAll("wood_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut")));
        simpleBlockItem(REOBlocks.LOG_CHESTNUT_STRIPPED.get(),
                models().orientable("log_chestnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top")));
        simpleBlockItem(REOBlocks.WOOD_CHESTNUT_STRIPPED.get(),
                models().cubeAll("wood_chestnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut")));
        simpleBlockWithItem(REOBlocks.PLANKS_CHESTNUT.get(),
                models().cubeAll("planks_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_CHESTNUT.get()), blockTexture(REOBlocks.PLANKS_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));


        saplingBlock(REOBlocks.SAPLING_CHESTNUT, "chestnut");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_CHESTNUT.get(), models().singleTexture("potted_sapling_chestnut", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/chestnut")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_CHESTNUT, "chestnut");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_CHESTNUT.get()), ((WallSignBlock) REOBlocks.SIGN_CHESTNUT_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_CHESTNUT.get(), REOBlocks.SIGN_HANGING_CHESTNUT_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_CHESTNUT.get()), modLoc("block/door/chestnut_lower"), modLoc("block/door/chestnut_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_CHESTNUT.get()), modLoc("block/trapdoor/trapdoor_chestnut"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHESTNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHESTNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"));
        simpleBlockItem(REOBlocks.LOG_CHESTNUT_RESISTANT.get(),
                models().orientable("log_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut_top")));
        simpleBlockItem(REOBlocks.WOOD_CHESTNUT_RESISTANT.get(),
                models().cubeAll("wood_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/chestnut")));
        simpleBlockItem(REOBlocks.LOG_CHESTNUT_STRIPPED_RESISTANT.get(),
                models().orientable("log_chestnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut_top")));
        simpleBlockItem(REOBlocks.WOOD_CHESTNUT_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_chestnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/chestnut")));
        simpleBlockWithItem(REOBlocks.PLANKS_CHESTNUT_RESISTANT.get(),
                models().cubeAll("planks_chestnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_CHESTNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_CHESTNUT_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_CHESTNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_CHESTNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_CHESTNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/chestnut"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CITRUS_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CITRUS_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"));
        simpleBlockItem(REOBlocks.LOG_CITRUS.get(),
                models().orientable("log_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top")));
        simpleBlockItem(REOBlocks.WOOD_CITRUS.get(),
                models().cubeAll("wood_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus")));
        simpleBlockItem(REOBlocks.LOG_CITRUS_STRIPPED.get(),
                models().orientable("log_citrus_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top")));
        simpleBlockItem(REOBlocks.WOOD_CITRUS_STRIPPED.get(),
                models().cubeAll("wood_citrus_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus")));
        simpleBlockWithItem(REOBlocks.PLANKS_CITRUS.get(),
                models().cubeAll("planks_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_CITRUS.get()), blockTexture(REOBlocks.PLANKS_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));


        saplingBlock(REOBlocks.SAPLING_CITRUS, "citrus");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_CITRUS.get(), models().singleTexture("potted_sapling_citrus", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/citrus")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_CITRUS, "citrus");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_CITRUS.get()), ((WallSignBlock) REOBlocks.SIGN_CITRUS_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_CITRUS.get(), REOBlocks.SIGN_HANGING_CITRUS_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_CITRUS.get()), modLoc("block/door/citrus_lower"), modLoc("block/door/citrus_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_CITRUS.get()), modLoc("block/trapdoor/trapdoor_citrus"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CITRUS_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CITRUS_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"));
        simpleBlockItem(REOBlocks.LOG_CITRUS_RESISTANT.get(),
                models().orientable("log_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus_top")));
        simpleBlockItem(REOBlocks.WOOD_CITRUS_RESISTANT.get(),
                models().cubeAll("wood_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/citrus")));
        simpleBlockItem(REOBlocks.LOG_CITRUS_STRIPPED_RESISTANT.get(),
                models().orientable("log_citrus_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus_top")));
        simpleBlockItem(REOBlocks.WOOD_CITRUS_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_citrus_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/citrus")));
        simpleBlockWithItem(REOBlocks.PLANKS_CITRUS_RESISTANT.get(),
                models().cubeAll("planks_citrus", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_CITRUS_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_CITRUS_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_CITRUS.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_CITRUS_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_CITRUS_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/citrus"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_EBONY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_EBONY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"));
        simpleBlockItem(REOBlocks.LOG_EBONY.get(),
                models().orientable("log_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top")));
        simpleBlockItem(REOBlocks.WOOD_EBONY.get(),
                models().cubeAll("wood_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony")));
        simpleBlockItem(REOBlocks.LOG_EBONY_STRIPPED.get(),
                models().orientable("log_ebony_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top")));
        simpleBlockItem(REOBlocks.WOOD_EBONY_STRIPPED.get(),
                models().cubeAll("wood_ebony_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony")));
        simpleBlockWithItem(REOBlocks.PLANKS_EBONY.get(),
                models().cubeAll("planks_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_EBONY.get()), blockTexture(REOBlocks.PLANKS_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));


        saplingBlock(REOBlocks.SAPLING_EBONY, "ebony");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_EBONY.get(), models().singleTexture("potted_sapling_ebony", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/ebony")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_EBONY.get(),
                models().cubeAll("leaves_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/ebony")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_EBONY.get()), ((WallSignBlock) REOBlocks.SIGN_EBONY_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_EBONY.get(), REOBlocks.SIGN_HANGING_EBONY_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_EBONY.get()), modLoc("block/door/ebony_lower"), modLoc("block/door/ebony_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_EBONY.get()), modLoc("block/trapdoor/trapdoor_ebony"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_EBONY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_EBONY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"));
        simpleBlockItem(REOBlocks.LOG_EBONY_RESISTANT.get(),
                models().orientable("log_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony_top")));
        simpleBlockItem(REOBlocks.WOOD_EBONY_RESISTANT.get(),
                models().cubeAll("wood_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/ebony")));
        simpleBlockItem(REOBlocks.LOG_EBONY_STRIPPED_RESISTANT.get(),
                models().orientable("log_ebony_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony_top")));
        simpleBlockItem(REOBlocks.WOOD_EBONY_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_ebony_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/ebony")));
        simpleBlockWithItem(REOBlocks.PLANKS_EBONY_RESISTANT.get(),
                models().cubeAll("planks_ebony", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_EBONY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_EBONY_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_EBONY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_EBONY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_EBONY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/ebony"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LARCH_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LARCH_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"));
        simpleBlockItem(REOBlocks.LOG_LARCH.get(),
                models().orientable("log_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top")));
        simpleBlockItem(REOBlocks.WOOD_LARCH.get(),
                models().cubeAll("wood_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch")));
        simpleBlockItem(REOBlocks.LOG_LARCH_STRIPPED.get(),
                models().orientable("log_larch_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top")));
        simpleBlockItem(REOBlocks.WOOD_LARCH_STRIPPED.get(),
                models().cubeAll("wood_larch_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch")));
        simpleBlockWithItem(REOBlocks.PLANKS_LARCH.get(),
                models().cubeAll("planks_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_LARCH.get()), blockTexture(REOBlocks.PLANKS_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));


        saplingBlock(REOBlocks.SAPLING_LARCH, "larch");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_LARCH.get(), models().singleTexture("potted_sapling_larch", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/larch")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_LARCH.get(),
                models().cubeAll("leaves_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/larch")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_LARCH.get()), ((WallSignBlock) REOBlocks.SIGN_LARCH_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_LARCH.get(), REOBlocks.SIGN_HANGING_LARCH_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_LARCH.get()), modLoc("block/door/larch_lower"), modLoc("block/door/larch_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_LARCH.get()), modLoc("block/trapdoor/trapdoor_larch"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LARCH_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LARCH_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"));
        simpleBlockItem(REOBlocks.LOG_LARCH_RESISTANT.get(),
                models().orientable("log_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch_top")));
        simpleBlockItem(REOBlocks.WOOD_LARCH_RESISTANT.get(),
                models().cubeAll("wood_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/larch")));
        simpleBlockItem(REOBlocks.LOG_LARCH_STRIPPED_RESISTANT.get(),
                models().orientable("log_larch_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch_top")));
        simpleBlockItem(REOBlocks.WOOD_LARCH_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_larch_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/larch")));
        simpleBlockWithItem(REOBlocks.PLANKS_LARCH_RESISTANT.get(),
                models().cubeAll("planks_larch", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_LARCH_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_LARCH_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_LARCH.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_LARCH_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_LARCH_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/larch"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LIME_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LIME_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"));
        simpleBlockItem(REOBlocks.LOG_LIME.get(),
                models().orientable("log_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top")));
        simpleBlockItem(REOBlocks.WOOD_LIME.get(),
                models().cubeAll("wood_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime")));
        simpleBlockItem(REOBlocks.LOG_LIME_STRIPPED.get(),
                models().orientable("log_lime_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top")));
        simpleBlockItem(REOBlocks.WOOD_LIME_STRIPPED.get(),
                models().cubeAll("wood_lime_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime")));
        simpleBlockWithItem(REOBlocks.PLANKS_LIME.get(),
                models().cubeAll("planks_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_LIME.get()), blockTexture(REOBlocks.PLANKS_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));


        saplingBlock(REOBlocks.SAPLING_LIME, "lime");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_LIME.get(), models().singleTexture("potted_sapling_lime", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/lime")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_LIME, "lime");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_LIME.get()), ((WallSignBlock) REOBlocks.SIGN_LIME_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_LIME.get(), REOBlocks.SIGN_HANGING_LIME_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_LIME.get()), modLoc("block/door/lime_lower"), modLoc("block/door/lime_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_LIME.get()), modLoc("block/trapdoor/trapdoor_lime"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LIME_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LIME_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"));
        simpleBlockItem(REOBlocks.LOG_LIME_RESISTANT.get(),
                models().orientable("log_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime_top")));
        simpleBlockItem(REOBlocks.WOOD_LIME_RESISTANT.get(),
                models().cubeAll("wood_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/lime")));
        simpleBlockItem(REOBlocks.LOG_LIME_STRIPPED_RESISTANT.get(),
                models().orientable("log_lime_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime_top")));
        simpleBlockItem(REOBlocks.WOOD_LIME_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_lime_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/lime")));
        simpleBlockWithItem(REOBlocks.PLANKS_LIME_RESISTANT.get(),
                models().cubeAll("planks_lime", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_LIME_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_LIME_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_LIME.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_LIME_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_LIME_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/lime"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAHOGANY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAHOGANY_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"));
        simpleBlockItem(REOBlocks.LOG_MAHOGANY.get(),
                models().orientable("log_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top")));
        simpleBlockItem(REOBlocks.WOOD_MAHOGANY.get(),
                models().cubeAll("wood_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany")));
        simpleBlockItem(REOBlocks.LOG_MAHOGANY_STRIPPED.get(),
                models().orientable("log_mahogany_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top")));
        simpleBlockItem(REOBlocks.WOOD_MAHOGANY_STRIPPED.get(),
                models().cubeAll("wood_mahogany_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany")));
        simpleBlockWithItem(REOBlocks.PLANKS_MAHOGANY.get(),
                models().cubeAll("planks_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_MAHOGANY.get()), blockTexture(REOBlocks.PLANKS_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));


        saplingBlock(REOBlocks.SAPLING_MAHOGANY, "mahogany");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_MAHOGANY.get(), models().singleTexture("potted_sapling_mahogany", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/mahogany")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_MAHOGANY.get(),
                models().cubeAll("leaves_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/mahogany")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_MAHOGANY.get()), ((WallSignBlock) REOBlocks.SIGN_MAHOGANY_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_MAHOGANY.get(), REOBlocks.SIGN_HANGING_MAHOGANY_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_MAHOGANY.get()), modLoc("block/door/mahogany_lower"), modLoc("block/door/mahogany_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_MAHOGANY.get()), modLoc("block/trapdoor/trapdoor_mahogany"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAHOGANY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAHOGANY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"));
        simpleBlockItem(REOBlocks.LOG_MAHOGANY_RESISTANT.get(),
                models().orientable("log_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany_top")));
        simpleBlockItem(REOBlocks.WOOD_MAHOGANY_RESISTANT.get(),
                models().cubeAll("wood_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/mahogany")));
        simpleBlockItem(REOBlocks.LOG_MAHOGANY_STRIPPED_RESISTANT.get(),
                models().orientable("log_mahogany_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany_top")));
        simpleBlockItem(REOBlocks.WOOD_MAHOGANY_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_mahogany_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/mahogany")));
        simpleBlockWithItem(REOBlocks.PLANKS_MAHOGANY_RESISTANT.get(),
                models().cubeAll("planks_mahogany", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_MAHOGANY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_MAHOGANY_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_MAHOGANY.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_MAHOGANY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_MAHOGANY_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/mahogany"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAPLE_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAPLE_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"));
        simpleBlockItem(REOBlocks.LOG_MAPLE.get(),
                models().orientable("log_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top")));
        simpleBlockItem(REOBlocks.WOOD_MAPLE.get(),
                models().cubeAll("wood_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple")));
        simpleBlockItem(REOBlocks.LOG_MAPLE_STRIPPED.get(),
                models().orientable("log_maple_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top")));
        simpleBlockItem(REOBlocks.WOOD_MAPLE_STRIPPED.get(),
                models().cubeAll("wood_maple_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple")));
        simpleBlockWithItem(REOBlocks.PLANKS_MAPLE.get(),
                models().cubeAll("planks_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_MAPLE.get()), blockTexture(REOBlocks.PLANKS_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        saplingBlock(REOBlocks.SAPLING_MAPLE, "maple");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_MAPLE.get(), models().singleTexture("potted_sapling_maple", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/maple")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_MAPLE.get(),
                models().cubeAll("leaves_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/maple")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_MAPLE.get()), ((WallSignBlock) REOBlocks.SIGN_MAPLE_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_MAPLE.get(), REOBlocks.SIGN_HANGING_MAPLE_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_MAPLE.get()), modLoc("block/door/maple_lower"), modLoc("block/door/maple_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_MAPLE.get()), modLoc("block/trapdoor/trapdoor_maple"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAPLE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAPLE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"));
        simpleBlockItem(REOBlocks.LOG_MAPLE_RESISTANT.get(),
                models().orientable("log_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple_top")));
        simpleBlockItem(REOBlocks.WOOD_MAPLE_RESISTANT.get(),
                models().cubeAll("wood_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/maple")));
        simpleBlockItem(REOBlocks.LOG_MAPLE_STRIPPED_RESISTANT.get(),
                models().orientable("log_maple_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple_top")));
        simpleBlockItem(REOBlocks.WOOD_MAPLE_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_maple_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/maple")));
        simpleBlockWithItem(REOBlocks.PLANKS_MAPLE_RESISTANT.get(),
                models().cubeAll("planks_maple", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_MAPLE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_MAPLE_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_MAPLE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_MAPLE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_MAPLE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/maple"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PALM_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PALM_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"));
        simpleBlockItem(REOBlocks.LOG_PALM.get(),
                models().orientable("log_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top")));
        simpleBlockItem(REOBlocks.WOOD_PALM.get(),
                models().cubeAll("wood_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm")));
        simpleBlockItem(REOBlocks.LOG_PALM_STRIPPED.get(),
                models().orientable("log_palm_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top")));
        simpleBlockItem(REOBlocks.WOOD_PALM_STRIPPED.get(),
                models().cubeAll("wood_palm_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm")));
        simpleBlockWithItem(REOBlocks.PLANKS_PALM.get(),
                models().cubeAll("planks_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PALM.get()), blockTexture(REOBlocks.PLANKS_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        saplingBlock(REOBlocks.SAPLING_PALM, "palm");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_PALM.get(), models().singleTexture("potted_sapling_palm", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/palm")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_PALM.get(),
                models().cubeAll("leaves_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/palm")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_PALM.get()), ((WallSignBlock) REOBlocks.SIGN_PALM_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_PALM.get(), REOBlocks.SIGN_HANGING_PALM_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_PALM.get()), modLoc("block/door/palm_lower"), modLoc("block/door/palm_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_PALM.get()), modLoc("block/trapdoor/trapdoor_palm"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PALM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PALM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"));
        simpleBlockItem(REOBlocks.LOG_PALM_RESISTANT.get(),
                models().orientable("log_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm_top")));
        simpleBlockItem(REOBlocks.WOOD_PALM_RESISTANT.get(),
                models().cubeAll("wood_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/palm")));
        simpleBlockItem(REOBlocks.LOG_PALM_STRIPPED_RESISTANT.get(),
                models().orientable("log_palm_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm_top")));
        simpleBlockItem(REOBlocks.WOOD_PALM_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_palm_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/palm")));
        simpleBlockWithItem(REOBlocks.PLANKS_PALM_RESISTANT.get(),
                models().cubeAll("planks_palm", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PALM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PALM_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_PALM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PALM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PALM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/palm"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PAPAYA_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PAPAYA_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"));
        simpleBlockItem(REOBlocks.LOG_PAPAYA.get(),
                models().orientable("log_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top")));
        simpleBlockItem(REOBlocks.WOOD_PAPAYA.get(),
                models().cubeAll("wood_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya")));
        simpleBlockItem(REOBlocks.LOG_PAPAYA_STRIPPED.get(),
                models().orientable("log_papaya_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top")));
        simpleBlockItem(REOBlocks.WOOD_PAPAYA_STRIPPED.get(),
                models().cubeAll("wood_papaya_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya")));
        simpleBlockWithItem(REOBlocks.PLANKS_PAPAYA.get(),
                models().cubeAll("planks_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PAPAYA.get()), blockTexture(REOBlocks.PLANKS_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        saplingBlock(REOBlocks.SAPLING_PAPAYA, "papaya");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_PAPAYA.get(), models().singleTexture("potted_sapling_papaya", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/papaya")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_PAPAYA, "papaya");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_PAPAYA.get()), ((WallSignBlock) REOBlocks.SIGN_PAPAYA_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_PAPAYA.get(), REOBlocks.SIGN_HANGING_PAPAYA_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_PAPAYA.get()), modLoc("block/door/papaya_lower"), modLoc("block/door/papaya_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_PAPAYA.get()), modLoc("block/trapdoor/trapdoor_papaya"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PAPAYA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PAPAYA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"));
        simpleBlockItem(REOBlocks.LOG_PAPAYA_RESISTANT.get(),
                models().orientable("log_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya_top")));
        simpleBlockItem(REOBlocks.WOOD_PAPAYA_RESISTANT.get(),
                models().cubeAll("wood_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/papaya")));
        simpleBlockItem(REOBlocks.LOG_PAPAYA_STRIPPED_RESISTANT.get(),
                models().orientable("log_papaya_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya_top")));
        simpleBlockItem(REOBlocks.WOOD_PAPAYA_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_papaya_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/papaya")));
        simpleBlockWithItem(REOBlocks.PLANKS_PAPAYA_RESISTANT.get(),
                models().cubeAll("planks_papaya", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PAPAYA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PAPAYA_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_PAPAYA.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PAPAYA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PAPAYA_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/papaya"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PINE_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PINE_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"));
        simpleBlockItem(REOBlocks.LOG_PINE.get(),
                models().orientable("log_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top")));
        simpleBlockItem(REOBlocks.WOOD_PINE.get(),
                models().cubeAll("wood_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine")));
        simpleBlockItem(REOBlocks.LOG_PINE_STRIPPED.get(),
                models().orientable("log_pine_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top")));
        simpleBlockItem(REOBlocks.WOOD_PINE_STRIPPED.get(),
                models().cubeAll("wood_pine_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine")));
        simpleBlockWithItem(REOBlocks.PLANKS_PINE.get(),
                models().cubeAll("planks_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PINE.get()), blockTexture(REOBlocks.PLANKS_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        saplingBlock(REOBlocks.SAPLING_PINE, "pine");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_PINE.get(), models().singleTexture("potted_sapling_pine", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/pine")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_PINE.get(),
                models().cubeAll("leaves_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/pine")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_PINE.get()), ((WallSignBlock) REOBlocks.SIGN_PINE_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_PINE.get(), REOBlocks.SIGN_HANGING_PINE_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_PINE.get()), modLoc("block/door/pine_lower"), modLoc("block/door/pine_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_PINE.get()), modLoc("block/trapdoor/trapdoor_pine"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PINE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PINE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"));
        simpleBlockItem(REOBlocks.LOG_PINE_RESISTANT.get(),
                models().orientable("log_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine_top")));
        simpleBlockItem(REOBlocks.WOOD_PINE_RESISTANT.get(),
                models().cubeAll("wood_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/pine")));
        simpleBlockItem(REOBlocks.LOG_PINE_STRIPPED_RESISTANT.get(),
                models().orientable("log_pine_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine_top")));
        simpleBlockItem(REOBlocks.WOOD_PINE_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_pine_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/pine")));
        simpleBlockWithItem(REOBlocks.PLANKS_PINE_RESISTANT.get(),
                models().cubeAll("planks_pine", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PINE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PINE_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_PINE.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PINE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PINE_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/pine"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PLUM_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PLUM_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"));
        simpleBlockItem(REOBlocks.LOG_PLUM.get(),
                models().orientable("log_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top")));
        simpleBlockItem(REOBlocks.WOOD_PLUM.get(),
                models().cubeAll("wood_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum")));
        simpleBlockItem(REOBlocks.LOG_PLUM_STRIPPED.get(),
                models().orientable("log_plum_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top")));
        simpleBlockItem(REOBlocks.WOOD_PLUM_STRIPPED.get(),
                models().cubeAll("wood_plum_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum")));
        simpleBlockWithItem(REOBlocks.PLANKS_PLUM.get(),
                models().cubeAll("planks_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PLUM.get()), blockTexture(REOBlocks.PLANKS_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        saplingBlock(REOBlocks.SAPLING_PLUM, "plum");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_PLUM.get(), models().singleTexture("potted_sapling_plum", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/plum")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_PLUM, "plum");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_PLUM.get()), ((WallSignBlock) REOBlocks.SIGN_PLUM_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_PLUM.get(), REOBlocks.SIGN_HANGING_PLUM_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_PLUM.get()), modLoc("block/door/plum_lower"), modLoc("block/door/plum_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_PLUM.get()), modLoc("block/trapdoor/trapdoor_plum"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PLUM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PLUM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"));
        simpleBlockItem(REOBlocks.LOG_PLUM_RESISTANT.get(),
                models().orientable("log_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum_top")));
        simpleBlockItem(REOBlocks.WOOD_PLUM_RESISTANT.get(),
                models().cubeAll("wood_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/plum")));
        simpleBlockItem(REOBlocks.LOG_PLUM_STRIPPED_RESISTANT.get(),
                models().orientable("log_plum_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum_top")));
        simpleBlockItem(REOBlocks.WOOD_PLUM_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_plum_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/plum")));
        simpleBlockWithItem(REOBlocks.PLANKS_PLUM_RESISTANT.get(),
                models().cubeAll("planks_plum", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_PLUM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_PLUM_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_PLUM.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_PLUM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_PLUM_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/plum"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_POPLAR_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_POPLAR_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"));
        simpleBlockItem(REOBlocks.LOG_POPLAR.get(),
                models().orientable("log_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top")));
        simpleBlockItem(REOBlocks.WOOD_POPLAR.get(),
                models().cubeAll("wood_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar")));
        simpleBlockItem(REOBlocks.LOG_POPLAR_STRIPPED.get(),
                models().orientable("log_poplar_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top")));
        simpleBlockItem(REOBlocks.WOOD_POPLAR_STRIPPED.get(),
                models().cubeAll("wood_poplar_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar")));
        simpleBlockWithItem(REOBlocks.PLANKS_POPLAR.get(),
                models().cubeAll("planks_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_POPLAR.get()), blockTexture(REOBlocks.PLANKS_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        saplingBlock(REOBlocks.SAPLING_POPLAR, "poplar");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_POPLAR.get(), models().singleTexture("potted_sapling_poplar", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/poplar")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_POPLAR.get(),
                models().cubeAll("leaves_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/poplar")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_POPLAR.get()), ((WallSignBlock) REOBlocks.SIGN_POPLAR_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_POPLAR.get(), REOBlocks.SIGN_HANGING_POPLAR_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_POPLAR.get()), modLoc("block/door/poplar_lower"), modLoc("block/door/poplar_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_POPLAR.get()), modLoc("block/trapdoor/trapdoor_poplar"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_POPLAR_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_POPLAR_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"));
        simpleBlockItem(REOBlocks.LOG_POPLAR_RESISTANT.get(),
                models().orientable("log_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar_top")));
        simpleBlockItem(REOBlocks.WOOD_POPLAR_RESISTANT.get(),
                models().cubeAll("wood_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/poplar")));
        simpleBlockItem(REOBlocks.LOG_POPLAR_STRIPPED_RESISTANT.get(),
                models().orientable("log_poplar_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar_top")));
        simpleBlockItem(REOBlocks.WOOD_POPLAR_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_poplar_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/poplar")));
        simpleBlockWithItem(REOBlocks.PLANKS_POPLAR_RESISTANT.get(),
                models().cubeAll("planks_poplar", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_POPLAR_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_POPLAR_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_POPLAR.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_POPLAR_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_POPLAR_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/poplar"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_REDWOOD_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_REDWOOD_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"));
        simpleBlockItem(REOBlocks.LOG_REDWOOD.get(),
                models().orientable("log_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top")));
        simpleBlockItem(REOBlocks.WOOD_REDWOOD.get(),
                models().cubeAll("wood_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood")));
        simpleBlockItem(REOBlocks.LOG_REDWOOD_STRIPPED.get(),
                models().orientable("log_redwood_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top")));
        simpleBlockItem(REOBlocks.WOOD_REDWOOD_STRIPPED.get(),
                models().cubeAll("wood_redwood_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood")));
        simpleBlockWithItem(REOBlocks.PLANKS_REDWOOD.get(),
                models().cubeAll("planks_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_REDWOOD.get()), blockTexture(REOBlocks.PLANKS_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        saplingBlock(REOBlocks.SAPLING_REDWOOD, "redwood");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_REDWOOD.get(), models().singleTexture("potted_sapling_redwood", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/redwood")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_REDWOOD.get(),
                models().cubeAll("leaves_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/redwood")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_REDWOOD.get()), ((WallSignBlock) REOBlocks.SIGN_REDWOOD_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_REDWOOD.get(), REOBlocks.SIGN_HANGING_REDWOOD_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_REDWOOD.get()), modLoc("block/door/redwood_lower"), modLoc("block/door/redwood_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_REDWOOD.get()), modLoc("block/trapdoor/trapdoor_redwood"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_REDWOOD_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_REDWOOD_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"));
        simpleBlockItem(REOBlocks.LOG_REDWOOD_RESISTANT.get(),
                models().orientable("log_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood_top")));
        simpleBlockItem(REOBlocks.WOOD_REDWOOD_RESISTANT.get(),
                models().cubeAll("wood_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/redwood")));
        simpleBlockItem(REOBlocks.LOG_REDWOOD_STRIPPED_RESISTANT.get(),
                models().orientable("log_redwood_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood_top")));
        simpleBlockItem(REOBlocks.WOOD_REDWOOD_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_redwood_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/redwood")));
        simpleBlockWithItem(REOBlocks.PLANKS_REDWOOD_RESISTANT.get(),
                models().cubeAll("planks_redwood", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_REDWOOD_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_REDWOOD_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_REDWOOD.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_REDWOOD_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_REDWOOD_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/redwood"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER_SAP.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_sap"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_RUBBER_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"));
        simpleBlockItem(REOBlocks.LOG_RUBBER.get(),
                models().orientable("log_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top")));
        simpleBlockItem(REOBlocks.WOOD_RUBBER.get(),
                models().cubeAll("wood_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber")));
        simpleBlockItem(REOBlocks.LOG_RUBBER_STRIPPED.get(),
                models().orientable("log_rubber_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top")));
        simpleBlockItem(REOBlocks.WOOD_RUBBER_STRIPPED.get(),
                models().cubeAll("wood_rubber_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber")));
        simpleBlockWithItem(REOBlocks.PLANKS_RUBBER.get(),
                models().cubeAll("planks_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_RUBBER.get()), blockTexture(REOBlocks.PLANKS_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        saplingBlock(REOBlocks.SAPLING_RUBBER, "rubber");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_RUBBER.get(), models().singleTexture("potted_sapling_rubber", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/rubber")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_RUBBER.get(),
                models().cubeAll("leaves_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/rubber")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_RUBBER.get()), ((WallSignBlock) REOBlocks.SIGN_RUBBER_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_RUBBER.get(), REOBlocks.SIGN_HANGING_RUBBER_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_RUBBER.get()), modLoc("block/door/rubber_lower"), modLoc("block/door/rubber_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_RUBBER.get()), modLoc("block/trapdoor/trapdoor_rubber"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER_SAP_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_sap"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_RUBBER_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"));
        simpleBlockItem(REOBlocks.LOG_RUBBER_RESISTANT.get(),
                models().orientable("log_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber_top")));
        simpleBlockItem(REOBlocks.WOOD_RUBBER_RESISTANT.get(),
                models().cubeAll("wood_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/rubber")));
        simpleBlockItem(REOBlocks.LOG_RUBBER_STRIPPED_RESISTANT.get(),
                models().orientable("log_rubber_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber_top")));
        simpleBlockItem(REOBlocks.WOOD_RUBBER_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_rubber_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/rubber")));
        simpleBlockWithItem(REOBlocks.PLANKS_RUBBER_RESISTANT.get(),
                models().cubeAll("planks_rubber", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_RUBBER_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_RUBBER_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_RUBBER.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_RUBBER_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_RUBBER_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/rubber"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_TEAK_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_TEAK_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"));
        simpleBlockItem(REOBlocks.LOG_TEAK.get(),
                models().orientable("log_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top")));
        simpleBlockItem(REOBlocks.WOOD_TEAK.get(),
                models().cubeAll("wood_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak")));
        simpleBlockItem(REOBlocks.LOG_TEAK_STRIPPED.get(),
                models().orientable("log_teak_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top")));
        simpleBlockItem(REOBlocks.WOOD_TEAK_STRIPPED.get(),
                models().cubeAll("wood_teak_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak")));
        simpleBlockWithItem(REOBlocks.PLANKS_TEAK.get(),
                models().cubeAll("planks_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_TEAK.get()), blockTexture(REOBlocks.PLANKS_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        saplingBlock(REOBlocks.SAPLING_TEAK, "teak");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_TEAK.get(), models().singleTexture("potted_sapling_teak", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/teak")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_TEAK.get(),
                models().cubeAll("leaves_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/teak")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_TEAK.get()), ((WallSignBlock) REOBlocks.SIGN_TEAK_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_TEAK.get(), REOBlocks.SIGN_HANGING_TEAK_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_TEAK.get()), modLoc("block/door/teak_lower"), modLoc("block/door/teak_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_TEAK.get()), modLoc("block/trapdoor/trapdoor_teak"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_TEAK_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_TEAK_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"));
        simpleBlockItem(REOBlocks.LOG_TEAK_RESISTANT.get(),
                models().orientable("log_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak_top")));
        simpleBlockItem(REOBlocks.WOOD_TEAK_RESISTANT.get(),
                models().cubeAll("wood_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/teak")));
        simpleBlockItem(REOBlocks.LOG_TEAK_STRIPPED_RESISTANT.get(),
                models().orientable("log_teak_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak_top")));
        simpleBlockItem(REOBlocks.WOOD_TEAK_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_teak_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/teak")));
        simpleBlockWithItem(REOBlocks.PLANKS_TEAK_RESISTANT.get(),
                models().cubeAll("planks_teak", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_TEAK_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_TEAK_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_TEAK.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_TEAK_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_TEAK_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/teak"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WALNUT_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WALNUT_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"));
        simpleBlockItem(REOBlocks.LOG_WALNUT.get(),
                models().orientable("log_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top")));
        simpleBlockItem(REOBlocks.WOOD_WALNUT.get(),
                models().cubeAll("wood_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut")));
        simpleBlockItem(REOBlocks.LOG_WALNUT_STRIPPED.get(),
                models().orientable("log_walnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top")));
        simpleBlockItem(REOBlocks.WOOD_WALNUT_STRIPPED.get(),
                models().cubeAll("wood_walnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut")));
        simpleBlockWithItem(REOBlocks.PLANKS_WALNUT.get(),
                models().cubeAll("planks_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_WALNUT.get()), blockTexture(REOBlocks.PLANKS_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        saplingBlock(REOBlocks.SAPLING_WALNUT, "walnut");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_WALNUT.get(), models().singleTexture("potted_sapling_walnut", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/walnut")).renderType("cutout"));

        colourLeavesBlock(REOBlocks.LEAVES_WALNUT, "walnut");

        signBlock(((StandingSignBlock) REOBlocks.SIGN_WALNUT.get()), ((WallSignBlock) REOBlocks.SIGN_WALNUT_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_WALNUT.get(), REOBlocks.SIGN_HANGING_WALNUT_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_WALNUT.get()), modLoc("block/door/walnut_lower"), modLoc("block/door/walnut_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_WALNUT.get()), modLoc("block/trapdoor/trapdoor_walnut"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WALNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WALNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"));
        simpleBlockItem(REOBlocks.LOG_WALNUT_RESISTANT.get(),
                models().orientable("log_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut_top")));
        simpleBlockItem(REOBlocks.WOOD_WALNUT_RESISTANT.get(),
                models().cubeAll("wood_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/walnut")));
        simpleBlockItem(REOBlocks.LOG_WALNUT_STRIPPED_RESISTANT.get(),
                models().orientable("log_walnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut_top")));
        simpleBlockItem(REOBlocks.WOOD_WALNUT_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_walnut_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/walnut")));
        simpleBlockWithItem(REOBlocks.PLANKS_WALNUT_RESISTANT.get(),
                models().cubeAll("planks_walnut", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_WALNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_WALNUT_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_WALNUT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_WALNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_WALNUT_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/walnut"));

        //
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WILLOW_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WILLOW_STRIPPED.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"));
        simpleBlockItem(REOBlocks.LOG_WILLOW.get(),
                models().orientable("log_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top")));
        simpleBlockItem(REOBlocks.WOOD_WILLOW.get(),
                models().cubeAll("wood_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow")));
        simpleBlockItem(REOBlocks.LOG_WILLOW_STRIPPED.get(),
                models().orientable("log_willow_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top")));
        simpleBlockItem(REOBlocks.WOOD_WILLOW_STRIPPED.get(),
                models().cubeAll("wood_willow_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow")));
        simpleBlockWithItem(REOBlocks.PLANKS_WILLOW.get(),
                models().cubeAll("planks_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_WILLOW.get()), blockTexture(REOBlocks.PLANKS_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        buttonBlock(((ButtonBlock) REOBlocks.BUTTON_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        pressurePlateBlock(((PressurePlateBlock) REOBlocks.PRESSURE_PLATE_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        saplingBlock(REOBlocks.SAPLING_WILLOW, "willow");
        simpleBlockWithItem(REOBlocks.POTTED_SAPLING_WILLOW.get(), models().singleTexture("potted_sapling_willow", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/sapling/willow")).renderType("cutout"));

        simpleBlockWithItem(REOBlocks.LEAVES_WILLOW.get(),
                models().cubeAll("leaves_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/leaves/willow")));

        signBlock(((StandingSignBlock) REOBlocks.SIGN_WILLOW.get()), ((WallSignBlock) REOBlocks.SIGN_WILLOW_WALL.get()),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        hangingSignBlock(REOBlocks.SIGN_HANGING_WILLOW.get(), REOBlocks.SIGN_HANGING_WILLOW_WALL.get(), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));

        doorBlockWithRenderType(((DoorBlock) REOBlocks.DOOR_WILLOW.get()), modLoc("block/door/willow_lower"), modLoc("block/door/willow_upper"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) REOBlocks.TRAPDOOR_WILLOW.get()), modLoc("block/trapdoor/trapdoor_willow"), true, "cutout");

        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WILLOW_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WILLOW_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"));
        axisBlock(((RotatedPillarBlock) REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top"));
        axisBlock(((RotatedPillarBlock) REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"));
        simpleBlockItem(REOBlocks.LOG_WILLOW_RESISTANT.get(),
                models().orientable("log_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow_top")));
        simpleBlockItem(REOBlocks.WOOD_WILLOW_RESISTANT.get(),
                models().cubeAll("wood_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/log/willow")));
        simpleBlockItem(REOBlocks.LOG_WILLOW_STRIPPED_RESISTANT.get(),
                models().orientable("log_willow_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"),
                        new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow"), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow_top")));
        simpleBlockItem(REOBlocks.WOOD_WILLOW_STRIPPED_RESISTANT.get(),
                models().cubeAll("wood_willow_stripped", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/stripped/willow")));
        simpleBlockWithItem(REOBlocks.PLANKS_WILLOW_RESISTANT.get(),
                models().cubeAll("planks_willow", new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow")));

        stairsBlock(((StairBlock) REOBlocks.STAIRS_WILLOW_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        slabBlock(((SlabBlock) REOBlocks.SLAB_WILLOW_RESISTANT.get()), blockTexture(REOBlocks.PLANKS_WILLOW.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceBlock(((FenceBlock) REOBlocks.FENCE_WILLOW_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));
        fenceGateBlock(((FenceGateBlock) REOBlocks.FENCE_GATE_WILLOW_RESISTANT.get()), new ResourceLocation(RealEarthOres.MOD_ID, "block/tree/planks/willow"));


        // Lamp
        addLampVariants(REOBlocks.LAMP_BLACK.get());
        addLampVariants(REOBlocks.LAMP_RED.get());
        addLampVariants(REOBlocks.LAMP_GREEN.get());
        addLampVariants(REOBlocks.LAMP_BROWN.get());
        addLampVariants(REOBlocks.LAMP_PURPLE.get());
        addLampVariants(REOBlocks.LAMP_CYAN.get());
        addLampVariants(REOBlocks.LAMP_LIGHTGRAY.get());
        addLampVariants(REOBlocks.LAMP_GRAY.get());
        addLampVariants(REOBlocks.LAMP_PINK.get());
        addLampVariants(REOBlocks.LAMP_LIME.get());
        addLampVariants(REOBlocks.LAMP_YELLOW.get());
        addLampVariants(REOBlocks.LAMP_BLUE.get());
        addLampVariants(REOBlocks.LAMP_LIGHTBLUE.get());
        addLampVariants(REOBlocks.LAMP_MAGENTA.get());
        addLampVariants(REOBlocks.LAMP_ORANGE.get());
        addLampVariants(REOBlocks.LAMP_WHITE.get());

        // Overworld Ore
        simpleBlockWithItem(REOBlocks.ORE_ALUMINIUM.get(),
                models().cubeAll("ore_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/aluminium")));
        simpleBlockWithItem(REOBlocks.ORE_LEAD.get(),
                models().cubeAll("ore_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/lead")));
        simpleBlockWithItem(REOBlocks.ORE_NICKEL.get(),
                models().cubeAll("ore_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/nickel")));
        simpleBlockWithItem(REOBlocks.ORE_PLATINUM.get(),
                models().cubeAll("ore_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/platinum")));
        simpleBlockWithItem(REOBlocks.ORE_SILVER.get(),
                models().cubeAll("ore_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/silver")));
        simpleBlockWithItem(REOBlocks.ORE_TIN.get(),
                models().cubeAll("ore_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/tin")));
        simpleBlockWithItem(REOBlocks.ORE_URANIUM.get(),
                models().cubeAll("ore_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/uranium")));
        simpleBlockWithItem(REOBlocks.ORE_ZINC.get(),
                models().cubeAll("ore_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/overworld/zinc")));

        // Gravel Ore
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_ALUMINIUM.get(),
                models().cubeAll("gravel_ore_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/aluminium")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_COAL.get(),
                models().cubeAll("gravel_ore_coal", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/coal")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_COPPER.get(),
                models().cubeAll("gravel_ore_copper", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/copper")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_DIAMOND.get(),
                models().cubeAll("gravel_ore_diamond", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/diamond")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_EMERALD.get(),
                models().cubeAll("gravel_ore_emerald", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/emerald")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_GOLD.get(),
                models().cubeAll("gravel_ore_gold", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/gold")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_IRON.get(),
                models().cubeAll("gravel_ore_iron", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/iron")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_LAPIS.get(),
                models().cubeAll("gravel_ore_lapis", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/lapis")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_LEAD.get(),
                models().cubeAll("gravel_ore_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/lead")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_NICKEL.get(),
                models().cubeAll("gravel_ore_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/nickel")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_PLATINUM.get(),
                models().cubeAll("gravel_ore_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/platinum")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_REDSTONE.get(),
                models().cubeAll("gravel_ore_redstone", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/redstone")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_SILVER.get(),
                models().cubeAll("gravel_ore_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/silver")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_TIN.get(),
                models().cubeAll("gravel_ore_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/tin")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_URANIUM.get(),
                models().cubeAll("gravel_ore_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/uranium")));
        simpleBlockWithItem(REOBlocks.GRAVEL_ORE_ZINC.get(),
                models().cubeAll("gravel_ore_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/gravel/zinc")));

        // Depslate Ore
        simpleBlockWithItem(REOBlocks.DEEPSLATE_ALUMINIUM.get(),
                models().cubeAll("deepslate_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/aluminium")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_LEAD.get(),
                models().cubeAll("deepslate_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/lead")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_NICKEL.get(),
                models().cubeAll("deepslate_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/nickel")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_PLATINUM.get(),
                models().cubeAll("deepslate_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/platinum")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_SILVER.get(),
                models().cubeAll("deepslate_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/silver")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_URANIUM.get(),
                models().cubeAll("deepslate_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/uranium")));
        simpleBlockWithItem(REOBlocks.DEEPSLATE_ZINC.get(),
                models().cubeAll("deepslate_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/deepslate/zinc")));

        // Nether Ore
        simpleBlockWithItem(REOBlocks.NETHER_ALUMINIUM.get(),
                models().cubeAll("nether_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/aluminium")));
        simpleBlockWithItem(REOBlocks.NETHER_COAL.get(),
                models().cubeAll("nether_coal", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/coal")));
        simpleBlockWithItem(REOBlocks.NETHER_COPPER.get(),
                models().cubeAll("nether_copper", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/copper")));
        simpleBlockWithItem(REOBlocks.NETHER_DIAMOND.get(),
                models().cubeAll("nether_diamond", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/diamond")));
        simpleBlockWithItem(REOBlocks.NETHER_EMERALD.get(),
                models().cubeAll("nether_emerald", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/emerald")));
        simpleBlockWithItem(REOBlocks.NETHER_IRON.get(),
                models().cubeAll("nether_iron", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/iron")));
        simpleBlockWithItem(REOBlocks.NETHER_LAPIS.get(),
                models().cubeAll("nether_lapis", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/lapis")));
        simpleBlockWithItem(REOBlocks.NETHER_LEAD.get(),
                models().cubeAll("nether_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/lead")));
        simpleBlockWithItem(REOBlocks.NETHER_NICKEL.get(),
                models().cubeAll("nether_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/nickel")));
        simpleBlockWithItem(REOBlocks.NETHER_PLATINUM.get(),
                models().cubeAll("nether_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/platinum")));
        simpleBlockWithItem(REOBlocks.NETHER_REDSTONE.get(),
                models().cubeAll("nether_redstone", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/redstone")));
        simpleBlockWithItem(REOBlocks.NETHER_SILVER.get(),
                models().cubeAll("nether_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/silver")));
        simpleBlockWithItem(REOBlocks.NETHER_TIN.get(),
                models().cubeAll("nether_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/tin")));
        simpleBlockWithItem(REOBlocks.NETHER_URANIUM.get(),
                models().cubeAll("nether_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/uranium")));
        simpleBlockWithItem(REOBlocks.NETHER_ZINC.get(),
                models().cubeAll("nether_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/nether/zinc")));

        // End Ore
        simpleBlockWithItem(REOBlocks.ORE_ENDERITE.get(),
                models().cubeAll("end_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/ores/end/enderite")));

        // Storage
        simpleBlockWithItem(REOBlocks.BLOCK_ALUMINIUM.get(),
                models().cubeAll("block_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/aluminium")));
        simpleBlockWithItem(REOBlocks.BLOCK_BRASS.get(),
                models().cubeAll("block_brass", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/brass")));
        simpleBlockWithItem(REOBlocks.BLOCK_BRONZE.get(),
                models().cubeAll("block_bronze", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/bronze")));
        simpleBlockWithItem(REOBlocks.BLOCK_ELECTRUM.get(),
                models().cubeAll("block_electrum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/electrum")));
        simpleBlockWithItem(REOBlocks.BLOCK_ENDERITE.get(),
                models().cubeAll("block_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/enderite")));
        simpleBlockWithItem(REOBlocks.BLOCK_LEAD.get(),
                models().cubeAll("block_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/lead")));
        simpleBlockWithItem(REOBlocks.BLOCK_NICKEL.get(),
                models().cubeAll("block_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/nickel")));
        simpleBlockWithItem(REOBlocks.BLOCK_PERIDOT.get(),
                models().cubeAll("block_peridot", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/peridot")));
        simpleBlockWithItem(REOBlocks.BLOCK_PLATINUM.get(),
                models().cubeAll("block_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/platinum")));
        simpleBlockWithItem(REOBlocks.BLOCK_RUBY.get(),
                models().cubeAll("block_ruby", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/ruby")));
        simpleBlockWithItem(REOBlocks.BLOCK_SAPPHIRE.get(),
                models().cubeAll("block_sapphire", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/sapphire")));
        simpleBlockWithItem(REOBlocks.BLOCK_SILVER.get(),
                models().cubeAll("block_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/silver")));
        simpleBlockWithItem(REOBlocks.BLOCK_STEEL.get(),
                models().cubeAll("block_steel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/steel")));
        simpleBlockWithItem(REOBlocks.BLOCK_TIN.get(),
                models().cubeAll("block_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/tin")));
        simpleBlockWithItem(REOBlocks.BLOCK_URANIUM.get(),
                models().cubeAll("block_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/uranium")));
        simpleBlockWithItem(REOBlocks.BLOCK_ZINC.get(),
                models().cubeAll("block_zinc", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/zinc")));

        // Raw Storage
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_ALUMINIUM.get(),
                models().cubeAll("block_raw_aluminium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/aluminium")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_ENDERITE.get(),
                models().cubeAll("block_raw_enderite", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/enderite")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_LEAD.get(),
                models().cubeAll("block_raw_lead", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/lead")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_NICKEL.get(),
                models().cubeAll("block_raw_nickel", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/nickel")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_PLATINUM.get(),
                models().cubeAll("block_raw_platinum", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/platinum")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_SILVER.get(),
                models().cubeAll("block_raw_silver", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/silver")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_TIN.get(),
                models().cubeAll("block_raw_tin", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/tin")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_URANIUM.get(),
                models().cubeAll("block_raw_uranium", new ResourceLocation(RealEarthOres.MOD_ID, "block/storage/raw/uranium")));
        simpleBlockWithItem(REOBlocks.BLOCK_RAW_ZINC.get(),
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