package net.coton999.realearthores.entity.custom;

import net.coton999.realearthores.entity.REOEntities;
import net.coton999.realearthores.item.REOItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class REOChestBoatEntity extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public REOChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public REOChestBoatEntity(Level pLevel, double pX, double pY, double pZ) {
        this(REOEntities.MOD_CHEST_BOAT.get(), pLevel);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        switch (getModVariant()) {
            case BALSA -> {
                return REOItems.BOAT_BALSA_CHEST.get();
            }
            case BAOBAB -> {
                return REOItems.BOAT_BAOBAB_CHEST.get();
            }
            case HILL_CHERRY -> {
                return REOItems.BOAT_HILL_CHERRY_CHEST.get();
            }
            case CHESTNUT -> {
                return REOItems.BOAT_CHESTNUT_CHEST.get();
            }
            case CITRUS -> {
                return REOItems.BOAT_CITRUS_CHEST.get();
            }
            case EBONY -> {
                return REOItems.BOAT_EBONY_CHEST.get();
            }
            case LARCH -> {
                return REOItems.BOAT_LARCH_CHEST.get();
            }
            case LIME -> {
                return REOItems.BOAT_LIME_CHEST.get();
            }
            case MAHOGANY -> {
                return REOItems.BOAT_MAHOGANY_CHEST.get();
            }
            case MAPLE -> {
                return REOItems.BOAT_MAPLE_CHEST.get();
            }
            case PALM -> {
                return REOItems.BOAT_PALM_CHEST.get();
            }
            case PAPAYA -> {
                return REOItems.BOAT_PAPAYA_CHEST.get();
            }
            case PINE -> {
                return REOItems.BOAT_PINE_CHEST.get();
            }
            case PLUM -> {
                return REOItems.BOAT_PLUM_CHEST.get();
            }
            case POPLAR -> {
                return REOItems.BOAT_POPLAR_CHEST.get();
            }
            case REDWOOD -> {
                return REOItems.BOAT_REDWOOD_CHEST.get();
            }
            case RUBBER -> {
                return REOItems.BOAT_RUBBER_CHEST.get();
            }
            case TEAK -> {
                return REOItems.BOAT_TEAK_CHEST.get();
            }
            case WALNUT -> {
                return REOItems.BOAT_WALNUT_CHEST.get();
            }
            case WILLOW -> {
                return REOItems.BOAT_WILLOW_CHEST.get();
            }
        }
        return super.getDropItem();
    }

    public void setVariant(REOBoatEntity.Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, REOBoatEntity.Type.PINE.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(REOBoatEntity.Type.byName(pCompound.getString("Type")));
        }
    }

    public REOBoatEntity.Type getModVariant() {
        return REOBoatEntity.Type.byId(this.entityData.get(DATA_ID_TYPE));
    }
}
