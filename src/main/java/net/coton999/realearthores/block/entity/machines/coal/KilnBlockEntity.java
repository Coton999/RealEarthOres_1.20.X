package net.coton999.realearthores.block.entity.machines.coal;

import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.menu.machines.coal.KilnMenu;
import net.coton999.realearthores.recipe.machines.coal.KilnRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class KilnBlockEntity extends AbstractFurnaceBlockEntity {

    public KilnBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(REOBlockEntities.KILN_BE.get(), pPos, pBlockState, KilnRecipe.Type.INSTANCE);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.realearthores.kiln");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new KilnMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel) {
        return getFuel().getOrDefault(pFuel.getItem(), 0);
    }
}