package net.coton999.realearthores.block.custom.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class REOFlammablePlanksBlock extends Block {

    public final int pFlammability;
    public final int pFireSpreadSpeed;



    public REOFlammablePlanksBlock(Properties pProperties, int pFlammability, int pFireSpreadSpeed) {

        super(pProperties);
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
