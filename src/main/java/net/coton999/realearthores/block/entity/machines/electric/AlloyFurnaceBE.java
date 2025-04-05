package net.coton999.realearthores.block.entity.machines.electric;

import net.coton999.realearthores.block.custom.machines.electric.AlloyFurnaceBlock;
import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.menu.machines.electric.AlloyFurnaceMenu;
import net.coton999.realearthores.recipe.machines.electric.AlloyFurnaceRecipe;
import net.coton999.realearthores.util.energy.REOEnergyStorage;
import net.coton999.realearthores.util.inventory.InventoryDirectionEntry;
import net.coton999.realearthores.util.inventory.InventoryDirectionWrapper;
import net.coton999.realearthores.util.inventory.WrappedHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class AlloyFurnaceBE extends BlockEntity implements MenuProvider {
    private final ItemStackHandler itemHandler = new ItemStackHandler(5) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            return switch (slot) {
                case 0, 1, 2 -> true;
                case 3 -> false;
                case 4 -> stack.getItem() == REOItems.CAPACITOR_ULTIMATE.get() ||
                        stack.getItem() == REOItems.CAPACITOR_ADVANCED.get() ||
                        stack.getItem() == REOItems.CAPACITOR_BASIC.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private static final int FUEL_SLOT = 0;
    private static final int INPUT_SLOT_1 = 1;
    private static final int INPUT_SLOT_2 = 2;
    private static final int OUTPUT_SLOT = 3;
    private static final int CAPACITOR_SLOT = 4;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            new InventoryDirectionWrapper(itemHandler,
                    new InventoryDirectionEntry(Direction.DOWN, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.NORTH, INPUT_SLOT_1, true),
                    new InventoryDirectionEntry(Direction.SOUTH, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.EAST, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.WEST, INPUT_SLOT_1, true),
                    new InventoryDirectionEntry(Direction.UP, INPUT_SLOT_1, true)).directionsMap;

    private LazyOptional<IEnergyStorage> lazyEnergyHandler = LazyOptional.empty();


    protected final ContainerData data;
    private int progress = 0;
    private int maxProgress = getMaxProgress();

    private int getMaxProgress(){
        if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_ULTIMATE.get()){
            return 50;
        } if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_ADVANCED.get()) {
            return 100;
        } if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_BASIC.get()) {
            return 150;
        } else {
            return 200;
        }
    }

    public final REOEnergyStorage ENERGY_STORAGE = createEnergyStorage();

    private REOEnergyStorage createEnergyStorage() {
        return new REOEnergyStorage(32000, 200) {
            @Override
            public void onEnergyChanged() {
                setChanged();
                getLevel().sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        };
    }

    public AlloyFurnaceBE(BlockPos pPos, BlockState pBlockState) {
        super(REOBlockEntities.ELECTRIC_ALLOY_FURNACE_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> AlloyFurnaceBE.this.progress;
                    case 1 -> AlloyFurnaceBE.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> AlloyFurnaceBE.this.progress = pValue;
                    case 1 -> AlloyFurnaceBE.this.maxProgress = pValue;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    public IEnergyStorage getEnergyStorage() {
        return this.ENERGY_STORAGE;
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }

        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.realearthores.electric_alloy_furnace");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new AlloyFurnaceMenu(pContainerId, pPlayerInventory, this, this.data);
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ENERGY) {
            return lazyEnergyHandler.cast();
        }

        if(cap == ForgeCapabilities.ITEM_HANDLER) {
            if(side == null) {
                return lazyItemHandler.cast();
            }

            if(directionWrappedHandlerMap.containsKey(side)) {
                Direction localDir = this.getBlockState().getValue(AlloyFurnaceBlock.FACING);

                if(side == Direction.DOWN ||side == Direction.UP) {
                    return directionWrappedHandlerMap.get(side).cast();
                }

                return switch (localDir) {
                    case EAST -> directionWrappedHandlerMap.get(side.getClockWise()).cast();
                    case SOUTH -> directionWrappedHandlerMap.get(side).cast();
                    case WEST -> directionWrappedHandlerMap.get(side.getCounterClockWise()).cast();
                    default -> directionWrappedHandlerMap.get(side.getOpposite()).cast();
                };
            }
        }

        return super.getCapability(cap, side);
    }

    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(() -> itemHandler);
        lazyEnergyHandler = LazyOptional.of(() -> ENERGY_STORAGE);
    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
        lazyEnergyHandler.invalidate();
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        pTag.put("inventory", itemHandler.serializeNBT());
        pTag.putInt("alloy_furnace.progress", progress);
        pTag.putInt("energy", ENERGY_STORAGE.getEnergyStored());
        pTag.putInt("burning", burnTime);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("alloy_furnace.progress");
        ENERGY_STORAGE.setEnergy(pTag.getInt("energy"));
        burnTime = pTag.getInt("burning");

    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {
        generateEnergy(); // This is a "placeholder" for getting energy through wires or similar
        if (ENERGY_STORAGE.getEnergyStored() == 32000) {
            distributeEnergy();
        }

        if (isOutputSlotEmptyOrReceivable() && hasRecipe()) {
            level.setBlock(pPos, pState.setValue(AlloyFurnaceBlock.LIT, Boolean.TRUE), 3);
            increaseCraftingProgress();
            extractEnergy();
            setChanged(level, pPos, pState);

            if (hasProgressFinished()) {
                level.setBlock(pPos, pState.setValue(AlloyFurnaceBlock.LIT, Boolean.FALSE), 3);
                craftItem();
                resetProgress();
            }
        } else {
            level.setBlock(pPos, pState.setValue(AlloyFurnaceBlock.LIT, Boolean.FALSE), 3);
            resetProgress();
        }
    }

    private void extractEnergy() {
        if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_ULTIMATE.get()) {
            this.ENERGY_STORAGE.extractEnergy(10, false);
        } if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_ADVANCED.get()) {
            this.ENERGY_STORAGE.extractEnergy(4, false);
        } if (this.itemHandler.getStackInSlot(CAPACITOR_SLOT).getItem() == REOItems.CAPACITOR_BASIC.get()) {
            this.ENERGY_STORAGE.extractEnergy(2, false);
        } else {
            this.ENERGY_STORAGE.extractEnergy(1, false);
        }
    }

    private int burnTime;

    // Check if we have a burnable item in the inventory and if so generate energy
    private void generateEnergy() {
        if (ENERGY_STORAGE.getEnergyStored() < ENERGY_STORAGE.getMaxEnergyStored()) {
            if (burnTime <= 0) {
                ItemStack fuel = itemHandler.getStackInSlot(FUEL_SLOT);
                if (fuel.isEmpty()) {
                    // No fuel
                    return;
                }
                setBurnTime(ForgeHooks.getBurnTime(fuel, RecipeType.SMELTING));
                if (burnTime <= 0) {
                    // Not a fuel
                    return;
                }
                itemHandler.extractItem(FUEL_SLOT, 1, false);
            } else {
                setBurnTime(burnTime-1);
                ENERGY_STORAGE.receiveEnergy(5, false);
            }
            setChanged();
        }
    }

    private void setBurnTime(int pBurnTime) {
        if (pBurnTime == burnTime) {
            return;
        }
        burnTime = pBurnTime;
        if (getBlockState().getValue(AlloyFurnaceBlock.LIT) != burnTime > 0) {
            level.setBlockAndUpdate(getBlockPos(), getBlockState().setValue(AlloyFurnaceBlock.LIT, burnTime > 0));
        }
        setChanged();
    }

    private void distributeEnergy() {
        // Check all sides of the block and send energy if that block supports the energy capability
        for (Direction direction : Direction.values()) {
            if (ENERGY_STORAGE.getEnergyStored() <= 0) {
                return;
            }
            BlockEntity be = level.getBlockEntity(getBlockPos().relative(direction));
            if (be != null) {
                be.getCapability(ForgeCapabilities.ENERGY).map(e -> {
                    if (e.canReceive()) {
                        int received = e.receiveEnergy(Math.min(ENERGY_STORAGE.getEnergyStored(), 200), false);
                        ENERGY_STORAGE.extractEnergy(received, false);
                        setChanged();
                        return received;
                    }
                    return 0;
                });
            }
        }
    }

    private void craftItem() {
        Optional<AlloyFurnaceRecipe> recipe = getCurrentRecipe();
        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        if (this.itemHandler.getStackInSlot(INPUT_SLOT_1).getItem() == REOItems.DUST_GOLD.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_1).getItem() == Items.GOLD_INGOT){
            this.itemHandler.extractItem(INPUT_SLOT_1, 2, false);
        } else {
            this.itemHandler.extractItem(INPUT_SLOT_1, 1, false);
        }

        if (this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_ZINC.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_TIN.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_SILVER.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_ZINC.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_TIN.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_SILVER.get()){
        this.itemHandler.extractItem(INPUT_SLOT_2, 2, false);
        }
        else if (this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_COAL.get() ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == Items.COAL) {
            this.itemHandler.extractItem(INPUT_SLOT_2, 3, false);
        } else {
            this.itemHandler.extractItem(INPUT_SLOT_2, 1, false);
        }

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(resultItem.getItem(),
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + resultItem.getCount()));
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private boolean hasProgressFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress() {
        this.progress++;
    }

    private boolean hasRecipe() {
        Optional<AlloyFurnaceRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }
        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        return canInsertAmountIntoOutputSlot(resultItem.getCount())
                && canInsertItemIntoOutputSlot(resultItem.getItem()) && hasEnoughEnergyToCraft() && hasInputsToCraft();
    }

    private boolean hasEnoughEnergyToCraft() {
        return this.ENERGY_STORAGE.getEnergyStored() >= maxProgress;
    }

    private boolean hasInputsToCraft() {
        if (this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_TIN.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_ZINC.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_COAL.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 3 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_TIN.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_ZINC.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == Items.COAL && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 3){
            return true;
        } else return this.itemHandler.getStackInSlot(INPUT_SLOT_1).getItem() == REOItems.DUST_GOLD.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_1).getCount() >= 2 &&
                        this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.DUST_SILVER.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2 ||
                this.itemHandler.getStackInSlot(INPUT_SLOT_1).getItem() == Items.GOLD_INGOT && this.itemHandler.getStackInSlot(INPUT_SLOT_1).getCount() >= 2 &&
                        this.itemHandler.getStackInSlot(INPUT_SLOT_2).getItem() == REOItems.INGOT_SILVER.get() && this.itemHandler.getStackInSlot(INPUT_SLOT_2).getCount() >= 2;
    }

    private Optional<AlloyFurnaceRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for(int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        return this.level.getRecipeManager().getRecipeFor(AlloyFurnaceRecipe.Type.INSTANCE, inventory, level);
    }

    private boolean canInsertItemIntoOutputSlot(Item item) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() || this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(item);
    }

    private boolean canInsertAmountIntoOutputSlot(int count) {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize() >=
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + count;
    }

    private boolean isOutputSlotEmptyOrReceivable() {
        return this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty() ||
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() < this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        super.onDataPacket(net, pkt);
    }
}