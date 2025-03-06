package net.coton999.realearthores.item;

import net.coton999.realearthores.RealEarthOres;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum REOArmourMaterials implements ArmorMaterial {
    ALUMINIUM("aluminium", 15, new int[]{ 1, 5, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(REOItems.INGOT_ALUMINIUM.get())),
    AMETHYST("amethyst", 15, new int[]{ 1, 4, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.of(REOItems.GEM_AMETHYST.get())),
    BRONZE("bronze", 26, new int[]{ 3, 5, 6, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 0f, 0f, () -> Ingredient.of(REOItems.INGOT_BRONZE.get())),
    ENDERITE("enderite", 37, new int[]{ 3, 6, 8, 3 }, 15,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 3f, 0.25f, () -> Ingredient.of(REOItems.INGOT_ENDERITE.get())),
    PERIDOT("peridot", 15, new int[]{ 1, 4, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.of(REOItems.GEM_PERIDOT.get())),
    PLATINUM("platinum", 33, new int[]{ 3, 6, 8, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 1f, 0f, () -> Ingredient.of(REOItems.INGOT_PLATINUM.get())),
    RUBY("ruby", 15, new int[]{ 1, 4, 5, 2 }, 12,
         SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.of(REOItems.GEM_RUBY.get())),
    SAPPHIRE("sapphire", 15, new int[]{ 1, 4, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 0f, 0f, () -> Ingredient.of(REOItems.GEM_SAPPHIRE.get())),
    SILVER("silver", 7, new int[]{ 1, 3, 5, 2 }, 25,
            SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(REOItems.INGOT_SILVER.get())),
    STEEL("steel", 26, new int[]{ 2, 6, 7, 2 }, 20,
         SoundEvents.ARMOR_EQUIP_CHAIN, 1f, 0f, () -> Ingredient.of(REOItems.INGOT_STEEL.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    REOArmourMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                       float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return RealEarthOres.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}