package net.coton999.realearthores.event;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.entity.client.REOModelLayers;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RealEarthOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class REOEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {

        event.registerLayerDefinition(REOModelLayers.BOAT_BALSA_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_BAOBAB_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_HILL_CHERRY_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_CHESTNUT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_CITRUS_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_EBONY_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_LARCH_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_LIME_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_MAHOGANY_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_MAPLE_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PALM_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PAPAYA_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PINE_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PLUM_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_POPLAR_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_REDWOOD_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_RUBBER_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_TEAK_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_WALNUT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_WILLOW_LAYER, BoatModel::createBodyModel);


        event.registerLayerDefinition(REOModelLayers.BOAT_BALSA_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_BAOBAB_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_HILL_CHERRY_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_CHESTNUT_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_CITRUS_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_EBONY_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_LARCH_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_LIME_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_MAHOGANY_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_MAPLE_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PALM_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PAPAYA_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PINE_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_PLUM_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_POPLAR_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_REDWOOD_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_RUBBER_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_TEAK_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_WALNUT_CHEST_LAYER, ChestBoatModel::createBodyModel);
        event.registerLayerDefinition(REOModelLayers.BOAT_WILLOW_CHEST_LAYER, ChestBoatModel::createBodyModel);

    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {

        event.registerBlockEntityRenderer(REOBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(REOBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @SubscribeEvent
    public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event) {
        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
                pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(),
                REOBlocks.LEAVES_CHESTNUT.get(), REOBlocks.LEAVES_CITRUS.get(), REOBlocks.LEAVES_LIME.get(),
                REOBlocks.LEAVES_PAPAYA.get(), REOBlocks.LEAVES_PLUM.get(), REOBlocks.LEAVES_WALNUT.get());
    }

    @SubscribeEvent
    public static void registerColoredItems(RegisterColorHandlersEvent.Item event) {
        event.register((pStack, pTintIndex) -> {
            BlockState state = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, null, null, pTintIndex);
        }, REOBlocks.LEAVES_CHESTNUT.get(), REOBlocks.LEAVES_CITRUS.get(), REOBlocks.LEAVES_LIME.get(),
                REOBlocks.LEAVES_PAPAYA.get(), REOBlocks.LEAVES_PLUM.get(), REOBlocks.LEAVES_WALNUT.get());
    }
}