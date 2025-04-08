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
                return REOItems.BALSA_CHEST_BOAT.get();
            }
            case BAOBAB -> {
                return REOItems.BAOBAB_CHEST_BOAT.get();
            }
            case HILL_CHERRY -> {
                return REOItems.HILL_CHERRY_CHEST_BOAT.get();
            }
            case CHESTNUT -> {
                return REOItems.CHESTNUT_CHEST_BOAT.get();
            }
            case CITRUS -> {
                return REOItems.CITRUS_CHEST_BOAT.get();
            }
            case EBONY -> {
                return REOItems.EBONY_CHEST_BOAT.get();
            }
            case LARCH -> {
                return REOItems.LARCH_CHEST_BOAT.get();
            }
            case LIME -> {
                return REOItems.LIME_CHEST_BOAT.get();
            }
            case MAHOGANY -> {
                return REOItems.MAHOGANY_CHEST_BOAT.get();
            }
            case MAPLE -> {
                return REOItems.MAPLE_CHEST_BOAT.get();
            }
            case PALM -> {
                return REOItems.PALM_CHEST_BOAT.get();
            }
            case PAPAYA -> {
                return REOItems.PAPAYA_CHEST_BOAT.get();
            }
            case PINE -> {
                return REOItems.PINE_CHEST_BOAT.get();
            }
            case PLUM -> {
                return REOItems.PLUM_CHEST_BOAT.get();
            }
            case POPLAR -> {
                return REOItems.POPLAR_CHEST_BOAT.get();
            }
            case REDWOOD -> {
                return REOItems.REDWOOD_CHEST_BOAT.get();
            }
            case RUBBER -> {
                return REOItems.RUBBER_CHEST_BOAT.get();
            }
            case TEAK -> {
                return REOItems.TEAK_CHEST_BOAT.get();
            }
            case WALNUT -> {
                return REOItems.WALNUT_CHEST_BOAT.get();
            }
            case WILLOW -> {
                return REOItems.WILLOW_CHEST_BOAT.get();
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
