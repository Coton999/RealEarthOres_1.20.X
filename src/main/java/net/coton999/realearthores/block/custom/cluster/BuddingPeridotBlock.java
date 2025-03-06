package net.coton999.realearthores.block.custom.cluster;

import net.coton999.realearthores.block.REOBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;

public class BuddingPeridotBlock extends AmethystBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingPeridotBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (pRandom.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[pRandom.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pPos.relative(direction);
            BlockState blockstate = pLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = REOBlocks.SMALL_PERIDOT_BUD.get();
            } else if (blockstate.is(REOBlocks.SMALL_PERIDOT_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = REOBlocks.MEDIUM_PERIDOT_BUD.get();
            } else if (blockstate.is(REOBlocks.MEDIUM_PERIDOT_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = REOBlocks.LARGE_PERIDOT_BUD.get();
            } else if (blockstate.is(REOBlocks.LARGE_PERIDOT_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = REOBlocks.CLUSTER_PERIDOT.get();
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED, Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                pLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }

    public static boolean canClusterGrowAtState(BlockState pState) {
        return pState.isAir() || pState.is(Blocks.WATER) && pState.getFluidState().getAmount() == 8;
    }
}
