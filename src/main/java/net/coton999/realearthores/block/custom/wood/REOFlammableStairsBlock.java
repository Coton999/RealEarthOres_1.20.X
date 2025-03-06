package net.coton999.realearthores.block.custom.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

public class REOFlammableStairsBlock extends StairBlock {

    public final int pFlammability;
    public final int pFireSpreadSpeed;

    public REOFlammableStairsBlock(Supplier<BlockState> state, Properties properties, int pFlammability, int pFireSpreadSpeed) {
        super(state, properties);
        this.pFlammability = pFlammability;
        this.pFireSpreadSpeed = pFireSpreadSpeed;
    }


    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return this.pFlammability; //20
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return this.pFireSpreadSpeed; //5
    }
}
