package net.coton999.realearthores;

import com.mojang.logging.LogUtils;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.block.entity.REOBlockEntities;
import net.coton999.realearthores.config.REOConfig;
import net.coton999.realearthores.entity.REOEntities;
import net.coton999.realearthores.entity.client.REOBoatRenderer;
import net.coton999.realearthores.fluid.REOFluidTypes;
import net.coton999.realearthores.fluid.REOFluids;
import net.coton999.realearthores.item.REOCreativeModeTabs;
import net.coton999.realearthores.item.REOItemProperties;
import net.coton999.realearthores.item.REOItems;
import net.coton999.realearthores.recipe.REORecipes;
import net.coton999.realearthores.menu.REOMenuTypes;
import net.coton999.realearthores.screen.machines.coal.KilnScreen;
import net.coton999.realearthores.screen.machines.electric.*;
import net.coton999.realearthores.util.REOWoodTypes;
import net.coton999.realearthores.worldgen.tree.REOFoliagePlacers;
import net.coton999.realearthores.worldgen.tree.REOTrunkPlacers;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RealEarthOres.MOD_ID)
public class RealEarthOres {
    public static final String MOD_ID = "realearthores";
    private static final Logger LOGGER = LogUtils.getLogger();

    public RealEarthOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        REOCreativeModeTabs.register(modEventBus);

        REOItems.register(modEventBus);
        REOBlocks.register(modEventBus);

        REOFluids.register(modEventBus);
        REOFluidTypes.register(modEventBus);

        REOBlockEntities.register(modEventBus);
        REOMenuTypes.register(modEventBus);

        REOEntities.register(modEventBus);
        REORecipes.register(modEventBus);

        REOTrunkPlacers.register(modEventBus);
        REOFoliagePlacers.register(modEventBus);

        REOConfig.register();

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }


    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_BALSA.getId(), REOBlocks.POTTED_SAPLING_BALSA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_BAOBAB.getId(), REOBlocks.POTTED_SAPLING_BAOBAB);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_HILL_CHERRY.getId(), REOBlocks.POTTED_SAPLING_HILL_CHERRY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_CHESTNUT.getId(), REOBlocks.POTTED_SAPLING_CHESTNUT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_CITRUS.getId(), REOBlocks.POTTED_SAPLING_CITRUS);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_EBONY.getId(), REOBlocks.POTTED_SAPLING_EBONY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_LARCH.getId(), REOBlocks.POTTED_SAPLING_LARCH);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_LIME.getId(), REOBlocks.POTTED_SAPLING_LIME);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_MAHOGANY.getId(), REOBlocks.POTTED_SAPLING_MAHOGANY);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_MAPLE.getId(), REOBlocks.POTTED_SAPLING_MAPLE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_PALM.getId(), REOBlocks.POTTED_SAPLING_PALM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_PAPAYA.getId(), REOBlocks.POTTED_SAPLING_PAPAYA);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_PINE.getId(), REOBlocks.POTTED_SAPLING_PINE);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_PLUM.getId(), REOBlocks.POTTED_SAPLING_PLUM);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_POPLAR.getId(), REOBlocks.POTTED_SAPLING_POPLAR);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_REDWOOD.getId(), REOBlocks.POTTED_SAPLING_REDWOOD);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_RUBBER.getId(), REOBlocks.POTTED_SAPLING_RUBBER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_TEAK.getId(), REOBlocks.POTTED_SAPLING_TEAK);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_WALNUT.getId(), REOBlocks.POTTED_SAPLING_WALNUT);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.SAPLING_WILLOW.getId(), REOBlocks.POTTED_SAPLING_WILLOW);
        });

        event.enqueueWork(() -> {
            // Leaves
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_BALSA.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_BAOBAB.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_CHESTNUT.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_CITRUS.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_EBONY.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_LARCH.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_LIME.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_MAHOGANY.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_MAPLE.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_PALM.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_PAPAYA.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_PINE.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_PLUM.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_POPLAR.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_REDWOOD.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_RUBBER.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_TEAK.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_WALNUT.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LEAVES_WILLOW.get().asItem(), 0.3F);

            // Sapling
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_BALSA.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_BAOBAB.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_CHESTNUT.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_CITRUS.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_EBONY.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_LARCH.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_LIME.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_MAHOGANY.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_MAPLE.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_PALM.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_PAPAYA.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_PINE.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_PLUM.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_POPLAR.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_REDWOOD.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_RUBBER.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_TEAK.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_WALNUT.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.SAPLING_WILLOW.get().asItem(), 0.3F);

            // Seeds
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_BARLEY.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_CAULIFLOWER.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_COTTON.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_RICE.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_STRAWBERRY.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.SEED_TOMATO.get(), 0.3F);

            // Crops
            ComposterBlock.COMPOSTABLES.put(REOItems.PLANT_BARLEY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PLANT_RICE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PLANT_COTTON.get(), 0.65F);

            // Food //
            // Fruit
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_CHERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_CHESTNUT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_DATES.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_LEMON.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_LIME.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_PAPAYA.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_PEACH.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_PEAR.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_PLUM.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_WALNUT.get(), 0.65F);

            // Veg
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_CAULIFLOWER.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_ONION.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_RICE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_TOMATO.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_TOMATO_ROTTEN.get(), 0.65F);

            // Berries
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_BLACKBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_BLUEBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_RASPBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.FOOD_STRAWBERRY.get(), 0.65F);

        });

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            REOItemProperties.addCustomItemProperties();

            Sheets.addWoodType(REOWoodTypes.BALSA);
            Sheets.addWoodType(REOWoodTypes.BAOBAB);
            Sheets.addWoodType(REOWoodTypes.HILL_CHERRY);
            Sheets.addWoodType(REOWoodTypes.CHESTNUT);
            Sheets.addWoodType(REOWoodTypes.CITRUS);
            Sheets.addWoodType(REOWoodTypes.EBONY);
            Sheets.addWoodType(REOWoodTypes.LARCH);
            Sheets.addWoodType(REOWoodTypes.LIME);
            Sheets.addWoodType(REOWoodTypes.MAHOGANY);
            Sheets.addWoodType(REOWoodTypes.MAPLE);
            Sheets.addWoodType(REOWoodTypes.PALM);
            Sheets.addWoodType(REOWoodTypes.PAPAYA);
            Sheets.addWoodType(REOWoodTypes.PINE);
            Sheets.addWoodType(REOWoodTypes.PLUM);
            Sheets.addWoodType(REOWoodTypes.POPLAR);
            Sheets.addWoodType(REOWoodTypes.REDWOOD);
            Sheets.addWoodType(REOWoodTypes.RUBBER);
            Sheets.addWoodType(REOWoodTypes.TEAK);
            Sheets.addWoodType(REOWoodTypes.WALNUT);
            Sheets.addWoodType(REOWoodTypes.WILLOW);


            EntityRenderers.register(REOEntities.MOD_BOAT.get(), pContext -> new REOBoatRenderer(pContext, false));
            EntityRenderers.register(REOEntities.MOD_CHEST_BOAT.get(), pContext -> new REOBoatRenderer(pContext, true));

            MenuScreens.register(REOMenuTypes.KILN_MENU.get(), KilnScreen::new);

            MenuScreens.register(REOMenuTypes.ELECTRIC_FURNACE_MENU.get(), ElectricFurnaceScreen::new);
            MenuScreens.register(REOMenuTypes.CRUSHER_MENU.get(), CrusherScreen::new);
            MenuScreens.register(REOMenuTypes.PURIFIER_MENU.get(), PurifierScreen::new);
            MenuScreens.register(REOMenuTypes.ALLOY_FURNACE_MENU.get(), AlloyFurnaceScreen::new);
            MenuScreens.register(REOMenuTypes.SAWMILL_MENU.get(), SawmillScreen::new);
            MenuScreens.register(REOMenuTypes.EXTRACTOR_MENU.get(), ExtractorScreen::new);
            MenuScreens.register(REOMenuTypes.COMPRESSOR_MENU.get(), CompressorScreen::new);
            MenuScreens.register(REOMenuTypes.CENTRIFUGE_MENU.get(), CentrifugeScreen::new);
            MenuScreens.register(REOMenuTypes.INDUCTION_FURNACE_MENU.get(), InductionFurnaceScreen::new);
            MenuScreens.register(REOMenuTypes.TRANSFUSER_MENU.get(), TransfuserScreen::new);

        }
    }
}