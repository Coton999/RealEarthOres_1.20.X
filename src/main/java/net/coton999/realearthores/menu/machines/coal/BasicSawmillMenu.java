package net.coton999.realearthores.menu.machines.coal;


import net.coton999.realearthores.menu.REOMenuTypes;
import net.coton999.realearthores.recipe.machines.coal.BasicSawmillRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;

public class BasicSawmillMenu extends AbstractFurnaceMenu {
    public BasicSawmillMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public BasicSawmillMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(REOMenuTypes.BASIC_SAWMILL_MENU.get(), BasicSawmillRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public BasicSawmillMenu(int pContainerId, Inventory pPlayerInventory) {
        super(REOMenuTypes.BASIC_SAWMILL_MENU.get(), BasicSawmillRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }



    @Override
    protected boolean isFuel(ItemStack pStack) {
        return true;
    }
}