package net.coton999.realearthores.item;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class REOItemProperties {
    public static void addCustomItemProperties() {
        ItemProperties.register(REOItems.AMETHYST_SHIELD.get(), new ResourceLocation("blocking"), (p_174575_, p_174576_, p_174577_, p_174578_) -> {
            return p_174577_ != null && p_174577_.isUsingItem() && p_174577_.getUseItem() == p_174575_ ? 1.0F : 0.0F;
        });

        makeBow(REOItems.ALUMINIUM_BOW.get());
        makeBow(REOItems.AMETHYST_BOW.get());
        makeBow(REOItems.BRONZE_BOW.get());
        makeBow(REOItems.DIAMOND_BOW.get());
        makeBow(REOItems.ENDERITE_BOW.get());
        makeBow(REOItems.GOLDEN_BOW.get());
        makeBow(REOItems.IRON_BOW.get());
        makeBow(REOItems.NETHERITE_BOW.get());
        makeBow(REOItems.PERIDOT_BOW.get());
        makeBow(REOItems.PLATINUM_BOW.get());
        makeBow(REOItems.RUBY_BOW.get());
        makeBow(REOItems.SAPPHIRE_BOW.get());
        makeBow(REOItems.SILVER_BOW.get());
        makeBow(REOItems.STEEL_BOW.get());
        makeBow(REOItems.STONE_BOW.get());

    }

    private static void makeBow(Item item) {
        ItemProperties.register(item, new ResourceLocation("pull"), (p_174635_, p_174636_, p_174637_, p_174638_) -> {
            if (p_174637_ == null) {
                return 0.0F;
            } else {
                return p_174637_.getUseItem() != p_174635_ ? 0.0F : (float)(p_174635_.getUseDuration() - p_174637_.getUseItemRemainingTicks()) / 20.0F;
            }
        });
        ItemProperties.register(item, new ResourceLocation("pulling"), (p_174630_, p_174631_, p_174632_, p_174633_) -> {
            return p_174632_ != null && p_174632_.isUsingItem() && p_174632_.getUseItem() == p_174630_ ? 1.0F : 0.0F;
        });
    }
}