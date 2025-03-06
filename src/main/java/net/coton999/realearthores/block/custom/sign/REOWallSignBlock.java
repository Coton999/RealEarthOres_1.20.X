package net.coton999.realearthores.block.custom.sign;

import net.coton999.realearthores.block.entity.signs.REOSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class REOWallSignBlock extends WallSignBlock {
    public REOWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new REOSignBlockEntity(pPos, pState);
    }
}