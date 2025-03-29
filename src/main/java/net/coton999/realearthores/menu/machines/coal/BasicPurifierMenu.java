package net.coton999.realearthores.menu.machines.coal;


import net.coton999.realearthores.menu.REOMenuTypes;
import net.coton999.realearthores.recipe.machines.coal.BasicPurifierRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;

public class BasicPurifierMenu extends AbstractFurnaceMenu {
    public BasicPurifierMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public BasicPurifierMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(REOMenuTypes.BASIC_PURIFIER_MENU.get(), BasicPurifierRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public BasicPurifierMenu(int pContainerId, Inventory pPlayerInventory) {
        super(REOMenuTypes.BASIC_PURIFIER_MENU.get(), BasicPurifierRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }



    @Override
    protected boolean isFuel(ItemStack pStack) {
        return true;
    }
}