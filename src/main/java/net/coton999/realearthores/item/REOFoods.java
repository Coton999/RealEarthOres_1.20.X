package net.coton999.realearthores.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class REOFoods {

    public static final FoodProperties BERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.1F).build();
    public static final FoodProperties VEGETABLE = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.6f).build();
    public static final FoodProperties NUT = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).build();
    public static final FoodProperties FRUIT = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.3F).build();
    public static final FoodProperties RICE = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.6f).build();
    public static final FoodProperties TOMATO_ROTTEN = new FoodProperties.Builder().nutrition(3)
            .saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.5f)
            .build();
}
