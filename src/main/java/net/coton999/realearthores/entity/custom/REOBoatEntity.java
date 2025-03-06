package net.coton999.realearthores.entity.custom;

import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.entity.REOEntities;
import net.coton999.realearthores.item.REOItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.function.IntFunction;

public class REOBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public REOBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public REOBoatEntity(Level level, double pX, double pY, double pZ) {
        this(REOEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case BALSA -> REOItems.BOAT_BALSA.get();
            case BAOBAB -> REOItems.BOAT_BAOBAB.get();
            case HILL_CHERRY -> REOItems.BOAT_HILL_CHERRY.get();
            case CHESTNUT -> REOItems.BOAT_CHESTNUT.get();
            case CITRUS -> REOItems.BOAT_CITRUS.get();
            case EBONY -> REOItems.BOAT_EBONY.get();
            case LARCH -> REOItems.BOAT_LARCH.get();
            case LIME -> REOItems.BOAT_LIME.get();
            case MAHOGANY -> REOItems.BOAT_MAHOGANY.get();
            case MAPLE -> REOItems.BOAT_MAPLE.get();
            case PALM -> REOItems.BOAT_PALM.get();
            case PAPAYA -> REOItems.BOAT_PAPAYA.get();
            case PINE -> REOItems.BOAT_PINE.get();
            case PLUM -> REOItems.BOAT_PLUM.get();
            case POPLAR -> REOItems.BOAT_POPLAR.get();
            case REDWOOD -> REOItems.BOAT_REDWOOD.get();
            case RUBBER -> REOItems.BOAT_RUBBER.get();
            case TEAK -> REOItems.BOAT_TEAK.get();
            case WALNUT -> REOItems.BOAT_WALNUT.get();
            case WILLOW -> REOItems.BOAT_WILLOW.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_ID_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE, Type.BALSA.ordinal());
    }

    protected void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }

    public static enum Type implements StringRepresentable {
        BALSA(REOBlocks.PLANKS_BALSA.get(), "balsa"),
        BAOBAB(REOBlocks.PLANKS_BAOBAB.get(), "baobab"),
        HILL_CHERRY(REOBlocks.PLANKS_HILL_CHERRY.get(), "hill_cherry"),
        CHESTNUT(REOBlocks.PLANKS_CHESTNUT.get(), "chestnut"),
        CITRUS(REOBlocks.PLANKS_CITRUS.get(), "citrus"),
        EBONY(REOBlocks.PLANKS_EBONY.get(), "ebony"),
        LARCH(REOBlocks.PLANKS_LARCH.get(), "larch"),
        LIME(REOBlocks.PLANKS_LIME.get(), "lime"),
        MAHOGANY(REOBlocks.PLANKS_MAHOGANY.get(), "mahogany"),
        MAPLE(REOBlocks.PLANKS_MAPLE.get(), "maple"),
        PALM(REOBlocks.PLANKS_PALM.get(), "palm"),
        PAPAYA(REOBlocks.PLANKS_PAPAYA.get(), "papaya"),
        PINE(REOBlocks.PLANKS_PINE.get(), "pine"),
        PLUM(REOBlocks.PLANKS_PLUM.get(), "plum"),
        POPLAR(REOBlocks.PLANKS_POPLAR.get(), "poplar"),
        REDWOOD(REOBlocks.PLANKS_REDWOOD.get(), "redwood"),
        RUBBER(REOBlocks.PLANKS_RUBBER.get(), "rubber"),
        TEAK(REOBlocks.PLANKS_TEAK.get(), "teak"),
        WALNUT(REOBlocks.PLANKS_WALNUT.get(), "walnut"),
        WILLOW(REOBlocks.PLANKS_WILLOW.get(), "willow");

        private final String name;
        private final Block planks;
        public static final StringRepresentable.EnumCodec<REOBoatEntity.Type> CODEC = StringRepresentable.fromEnum(REOBoatEntity.Type::values);
        private static final IntFunction<Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
            this.name = pName;
            this.planks = pPlanks;
        }

        public String getSerializedName() {
            return this.name;
        }

        public String getName() {
            return this.name;
        }

        public Block getPlanks() {
            return this.planks;
        }

        public String toString() {
            return this.name;
        }

        /**
         * Get a boat type by its enum ordinal
         */
        public static REOBoatEntity.Type byId(int pId) {
            return BY_ID.apply(pId);
        }

        public static REOBoatEntity.Type byName(String pName) {
            return CODEC.byName(pName, BALSA);
        }
    }
}