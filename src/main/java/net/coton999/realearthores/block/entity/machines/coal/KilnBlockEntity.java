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

    //private Map<Item, Integer> BURN_DURATION_MAP =
    //        Map.of(Items.LAVA_BUCKET, 20000,
    //                Blocks.COAL_BLOCK.asItem(), 16000,
    //                Items.BLAZE_ROD, 2400,
    //                Items.COAL, 1600,
    //                Items.CHARCOAL, 1600);
    //ItemTags.LOGS, 300,
    //ItemTags.BAMBOO_BLOCKS, 300,
    //ItemTags.PLANKS, 300,
    //Blocks.BAMBOO_MOSAIC.asItem(), 300,
    //ItemTags.WOODEN_STAIRS, 300,
    //Blocks.BAMBOO_MOSAIC_STAIRS.asItem(), 300,
    //ItemTags.WOODEN_SLABS, 150,
    //Blocks.BAMBOO_MOSAIC_SLAB.asItem(), 1500,
    //ItemTags.WOODEN_TRAPDOORS, 300,
    //ItemTags.WOODEN_PRESSURE_PLATES, 300,
    //ItemTags.WOODEN_FENCES, 300,
    //ItemTags.FENCE_GATES, 300,
    //Blocks.NOTE_BLOCK.asItem(), 300,
    //Blocks.BOOKSHELF.asItem(), 300,
    //Blocks.CHISELED_BOOKSHELF.asItem(), 300,
    //Blocks.LECTERN.asItem(), 300,
    //Blocks.JUKEBOX.asItem(), 300,
    //Blocks.CHEST.asItem(), 300,
    //Blocks.TRAPPED_CHEST.asItem(), 300,
    //Blocks.CRAFTING_TABLE.asItem(), 300,
    //Blocks.DAYLIGHT_DETECTOR.asItem(), 300,
    //ItemTags.BANNERS, 300,
    //Items.BOW, 300,
    //Items.FISHING_ROD, 300,
    //Blocks.LADDER.asItem(), 300,
    //ItemTags.SIGNS, 200,
    //ItemTags.HANGING_SIGNS, 800,
    //Items.WOODEN_SHOVEL, 200,
    //Items.WOODEN_SWORD, 200,
    //Items.WOODEN_HOE, 200,
    //Items.WOODEN_AXE, 200,
    //Items.WOODEN_PICKAXE, 200,
    //ItemTags.WOODEN_DOORS, 200,
    //ItemTags.BOATS, 1200,
    //ItemTags.WOOL, 100,
    //ItemTags.WOODEN_BUTTONS, 100,
    //Items.STICK, 100,
    //ItemTags.SAPLINGS, 100,
    //ItemTags.WOOL_CARPETS, 67,
    //Blocks.DRIED_KELP_BLOCK.asItem(), 4001,
    //Items.CROSSBOW, 300,
    //Blocks.BAMBOO.asItem(), 50,
    //Blocks.DEAD_BUSH.asItem(), 100,
    //Blocks.SCAFFOLDING.asItem(), 50,
    //Blocks.LOOM.asItem(), 300,
    //Blocks.BARREL.asItem(), 300,
    //Blocks.CARTOGRAPHY_TABLE.asItem(), 300,
    //Blocks.FLETCHING_TABLE.asItem(), 300,
    //Blocks.SMITHING_TABLE.asItem(), 300,
    //Blocks.COMPOSTER.asItem(), 300,
    //Blocks.AZALEA.asItem(), 100,
    //Blocks.FLOWERING_AZALEA.asItem(), 100,
    //Blocks.MANGROVE_ROOTS.asItem(), 300,
    //Items.BOWL, 100);

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