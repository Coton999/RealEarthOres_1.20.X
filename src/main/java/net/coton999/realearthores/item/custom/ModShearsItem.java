package net.coton999.realearthores.item.custom;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class ModShearsItem extends ShearsItem {


    public ModShearsItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState pBlock) {
        return pBlock.is(Blocks.COBWEB) || pBlock.is(Blocks.REDSTONE_WIRE) || pBlock.is(Blocks.TRIPWIRE) || pBlock.is(BlockTags.LEAVES);
    }
}
