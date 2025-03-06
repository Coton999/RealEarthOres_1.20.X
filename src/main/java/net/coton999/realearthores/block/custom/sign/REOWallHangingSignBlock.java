package net.coton999.realearthores.block.custom.sign;

import net.coton999.realearthores.block.entity.signs.REOHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class REOWallHangingSignBlock extends WallHangingSignBlock {
    public REOWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new REOHangingSignBlockEntity(pPos, pState);
    }
}