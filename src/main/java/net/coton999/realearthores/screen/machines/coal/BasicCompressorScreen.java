package net.coton999.realearthores.screen.machines.coal;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.menu.machines.coal.BasicCompressorMenu;
import net.coton999.realearthores.menu.machines.coal.KilnMenu;
import net.coton999.realearthores.recipe.machines.coal.KilnRecipeBookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class BasicCompressorScreen extends AbstractFurnaceScreen<BasicCompressorMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(RealEarthOres.MOD_ID, "textures/gui/container/machine/coal/machine.png");

    public BasicCompressorScreen(BasicCompressorMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new KilnRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}