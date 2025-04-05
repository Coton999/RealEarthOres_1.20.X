package net.coton999.realearthores.block.entity.machines.electric;

import net.coton999.realearthores.block.custom.machines.electric.CrusherBlock;
import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.menu.machines.electric.CrusherMenu;
import net.coton999.realearthores.recipe.machines.electric.CrusherRecipe;
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

public class CrusherBE extends BlockEntity implements MenuProvider {

    private final ItemStackHandler itemHandler = new ItemStackHandler(4){
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }

        @Override
        public boolean isItemValid(int slot, @NotNull ItemStack stack) {
            ItemStack fuel = itemHandler.getStackInSlot(FUEL_SLOT);
            return switch (slot) {
                case 0, 1 -> true;
                case 2 -> false;
                case 3 -> stack.getItem() == REOItems.CAPACITOR_ULTIMATE.get() ||
                        stack.getItem() == REOItems.CAPACITOR_ADVANCED.get() ||
                        stack.getItem() == REOItems.CAPACITOR_BASIC.get();
                default -> super.isItemValid(slot, stack);
            };
        }
    };

    private static final int FUEL_SLOT = 0;
    private static final int INPUT_SLOT = 1;
    private static final int OUTPUT_SLOT = 2;
    private static final int CAPACITOR_SLOT = 3;

    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();
    private final Map<Direction, LazyOptional<WrappedHandler>> directionWrappedHandlerMap =
            new InventoryDirectionWrapper(itemHandler,
                    new InventoryDirectionEntry(Direction.DOWN, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.NORTH, INPUT_SLOT, true),
                    new InventoryDirectionEntry(Direction.SOUTH, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.EAST, OUTPUT_SLOT, false),
                    new InventoryDirectionEntry(Direction.WEST, INPUT_SLOT, true),
                    new InventoryDirectionEntry(Direction.UP, INPUT_SLOT, true)).directionsMap;

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

    public CrusherBE(BlockPos pPos, BlockState pBlockState) {
        super(REOBlockEntities.ELECTRIC_CRUSHER_BE.get(), pPos, pBlockState);
        this.data = new ContainerData() {
            @Override
            public int get(int pIndex) {
                return switch (pIndex) {
                    case 0 -> CrusherBE.this.progress;
                    case 1 -> CrusherBE.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int pIndex, int pValue) {
                switch (pIndex) {
                    case 0 -> CrusherBE.this.progress = pValue;
                    case 1 -> CrusherBE.this.maxProgress = pValue;
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
        return Component.translatable("block.realearthores.electric_crusher");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new CrusherMenu(pContainerId, pPlayerInventory, this, this.data);
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
                Direction localDir = this.getBlockState().getValue(CrusherBlock.FACING);

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
        pTag.putInt("electric_crusher.progress", progress);
        pTag.putInt("energy", ENERGY_STORAGE.getEnergyStored());
        pTag.putInt("burning", burnTime);

        super.saveAdditional(pTag);
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        itemHandler.deserializeNBT(pTag.getCompound("inventory"));
        progress = pTag.getInt("electric_crusher.progress");
        ENERGY_STORAGE.setEnergy(pTag.getInt("energy"));
        burnTime = pTag.getInt("burning");

    }

    public void tick(Level level, BlockPos pPos, BlockState pState) {
        generateEnergy(); // This is a "placeholder" for getting energy through wires or similar
        if (ENERGY_STORAGE.getEnergyStored() == 32000) {
            distributeEnergy();
        }

        if (isOutputSlotEmptyOrReceivable() && hasRecipe()) {
            level.setBlock(pPos, pState.setValue(CrusherBlock.LIT, Boolean.TRUE), 3);
            increaseCraftingProcess();
            extractEnergy();
            setChanged(level, pPos, pState);

            if (hasProgressFinished()) {
                level.setBlock(pPos, pState.setValue(CrusherBlock.LIT, Boolean.FALSE), 3);
                craftItem();
                resetProgress();
            }
        } else {
            level.setBlock(pPos, pState.setValue(CrusherBlock.LIT, Boolean.FALSE), 3);
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
        if (getBlockState().getValue(CrusherBlock.LIT) != burnTime > 0) {
            level.setBlockAndUpdate(getBlockPos(), getBlockState().setValue(CrusherBlock.LIT, burnTime > 0));
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
        Optional<CrusherRecipe> recipe = getCurrentRecipe();
        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        this.itemHandler.extractItem(INPUT_SLOT, 1, false);

        this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(resultItem.getItem(),
                this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + resultItem.getCount()));
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private boolean hasProgressFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProcess() {
        this.progress++;
    }

    private boolean hasRecipe() {
        Optional<CrusherRecipe> recipe = getCurrentRecipe();

        if (recipe.isEmpty()) {
            return false;
        }

        maxProgress = getMaxProgress();

        ItemStack resultItem = recipe.get().getResultItem(getLevel().registryAccess());

        return canInsertAmountIntoOutputSlot(resultItem.getCount())
                && canInsertItemIntoOutputSlot(resultItem.getItem()) && hasEnoughEnergyToCraft();
    }

    private boolean hasEnoughEnergyToCraft() {
        return this.ENERGY_STORAGE.getEnergyStored() >= maxProgress;
    }

    private Optional<CrusherRecipe> getCurrentRecipe() {
        SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
        for(int i = 0; i < this.itemHandler.getSlots(); i++) {
            inventory.setItem(i, this.itemHandler.getStackInSlot(i));
        }

        return this.level.getRecipeManager().getRecipeFor(CrusherRecipe.Type.INSTANCE, inventory, level);
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