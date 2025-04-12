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
            case BALSA -> REOItems.BALSA_BOAT.get();
            case BAOBAB -> REOItems.BAOBAB_BOAT.get();
            case HILL_CHERRY -> REOItems.HILL_CHERRY_BOAT.get();
            case CHESTNUT -> REOItems.BOAT_CHESTNUT.get();
            case CITRUS -> REOItems.CITRUS_BOAT.get();
            case EBONY -> REOItems.EBONY_BOAT.get();
            case LARCH -> REOItems.LARCH_BOAT.get();
            case LIME -> REOItems.LIME_BOAT.get();
            case MAHOGANY -> REOItems.MAHOGANY_BOAT.get();
            case MAPLE -> REOItems.MAPLE_BOAT.get();
            case PALM -> REOItems.PALM_BOAT.get();
            case PAPAYA -> REOItems.PAPAYA_BOAT.get();
            case PINE -> REOItems.PINE_BOAT.get();
            case PLUM -> REOItems.PLUM_BOAT.get();
            case POPLAR -> REOItems.POPLAR_BOAT.get();
            case REDWOOD -> REOItems.REDWOOD_BOAT.get();
            case RUBBER -> REOItems.RUBBER_BOAT.get();
            case TEAK -> REOItems.TEAK_BOAT.get();
            case WALNUT -> REOItems.WALNUT_BOAT.get();
            case WILLOW -> REOItems.WILLOW_BOAT.get();
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
        BALSA(REOBlocks.BALSA_PLANKS.get(), "balsa"),
        BAOBAB(REOBlocks.BAOBAB_PLANKS.get(), "baobab"),
        HILL_CHERRY(REOBlocks.HILL_CHERRY_PLANKS.get(), "hill_cherry"),
        CHESTNUT(REOBlocks.CHESTNUT_PLANKS.get(), "chestnut"),
        CITRUS(REOBlocks.CITRUS_PLANKS.get(), "citrus"),
        EBONY(REOBlocks.EBONY_PLANKS.get(), "ebony"),
        LARCH(REOBlocks.LARCH_PLANKS.get(), "larch"),
        LIME(REOBlocks.LIME_PLANKS.get(), "lime"),
        MAHOGANY(REOBlocks.MAHOGANY_PLANKS.get(), "mahogany"),
        MAPLE(REOBlocks.MAPLE_PLANKS.get(), "maple"),
        PALM(REOBlocks.PALM_PLANKS.get(), "palm"),
        PAPAYA(REOBlocks.PAPAYA_PLANKS.get(), "papaya"),
        PINE(REOBlocks.PINE_PLANKS.get(), "pine"),
        PLUM(REOBlocks.PLUM_PLANKS.get(), "plum"),
        POPLAR(REOBlocks.POPLAR_PLANKS.get(), "poplar"),
        REDWOOD(REOBlocks.REDWOOD_PLANKS.get(), "redwood"),
        RUBBER(REOBlocks.RUBBER_PLANKS.get(), "rubber"),
        TEAK(REOBlocks.TEAK_PLANKS.get(), "teak"),
        WALNUT(REOBlocks.WALNUT_PLANKS.get(), "walnut"),
        WILLOW(REOBlocks.WILLOW_PLANKS.get(), "willow");

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