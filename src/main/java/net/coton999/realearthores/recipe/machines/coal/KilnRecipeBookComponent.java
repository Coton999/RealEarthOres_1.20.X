package net.coton999.realearthores.recipe.machines.coal;


import net.minecraft.client.gui.screens.recipebook.AbstractFurnaceRecipeBookComponent;
import net.minecraft.world.item.Item;

import java.util.Set;

public class KilnRecipeBookComponent extends AbstractFurnaceRecipeBookComponent {

    @Override
    protected Set<Item> getFuelItems() {
        return Set.of();
    }
}