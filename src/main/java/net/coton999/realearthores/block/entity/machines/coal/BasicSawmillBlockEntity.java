package net.coton999.realearthores.block.entity.machines.coal;

import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.menu.machines.coal.BasicSawmillMenu;
import net.coton999.realearthores.menu.machines.coal.KilnMenu;
import net.coton999.realearthores.recipe.machines.coal.BasicSawmillRecipe;
import net.coton999.realearthores.recipe.machines.coal.KilnRecipe;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BasicSawmillBlockEntity extends AbstractFurnaceBlockEntity {

    public BasicSawmillBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(REOBlockEntities.BASIC_SAWMILL_BE.get(), pPos, pBlockState, BasicSawmillRecipe.Type.INSTANCE);
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("block.realearthores.sawmill");
    }

    @Override
    protected AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory) {
        return new BasicSawmillMenu(pContainerId, pInventory, this, dataAccess);
    }

    @Override
    protected int getBurnDuration(ItemStack pFuel) {
        return getFuel().getOrDefault(pFuel.getItem(), 0);
    }
}