package net.coton999.realearthores.menu.machines.coal;


import net.coton999.realearthores.menu.REOMenuTypes;
import net.coton999.realearthores.recipe.machines.coal.BasicCrusherRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;

public class BasicCrusherMenu extends AbstractFurnaceMenu {
    public BasicCrusherMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public BasicCrusherMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(REOMenuTypes.BASIC_CRUSHER_MENU.get(), BasicCrusherRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public BasicCrusherMenu(int pContainerId, Inventory pPlayerInventory) {
        super(REOMenuTypes.BASIC_CRUSHER_MENU.get(), BasicCrusherRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }



    @Override
    protected boolean isFuel(ItemStack pStack) {
        return true;
    }
}