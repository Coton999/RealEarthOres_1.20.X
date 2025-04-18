package net.coton999.realearthores.block.entity.signs;

import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class REOSignBlockEntity extends SignBlockEntity {
    public REOSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(REOBlockEntities.MOD_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return REOBlockEntities.MOD_SIGN.get();
    }
}
