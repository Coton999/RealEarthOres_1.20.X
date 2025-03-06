package net.coton999.realearthores.block.custom.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockState;

public class REOFlammableFenceGateBlock extends FenceGateBlock {

    public final int pFlammability;
    public final int pFireSpreadSpeed;

    public REOFlammableFenceGateBlock(Properties props, SoundEvent openSound, SoundEvent closeSound, int pFlammability, int pFireSpreadSpeed) {
        super(props, openSound, closeSound);
        this.pFlammability = pFlammability;
        this.pFireSpreadSpeed = pFireSpreadSpeed;
    }


    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return this.pFlammability; //60
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {

        return this.pFireSpreadSpeed; //30
    }
}
