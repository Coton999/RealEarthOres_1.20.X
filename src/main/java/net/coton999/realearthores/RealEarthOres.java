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
import net.coton999.realearthores.menu.REOMenuTypes;
import net.coton999.realearthores.recipe.REORecipes;
import net.coton999.realearthores.screen.machines.coal.BasicCrusherScreen;
import net.coton999.realearthores.screen.machines.coal.BasicExtractorScreen;
import net.coton999.realearthores.screen.machines.coal.BasicPurifierScreen;
import net.coton999.realearthores.screen.machines.coal.KilnScreen;
import net.coton999.realearthores.screen.machines.electric.*;
import net.coton999.realearthores.screen.machines.generator.CoalGenScreen;
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
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.BALSA_SAPLING.getId(), REOBlocks.POTTED_BALSA_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.BAOBAB_SAPLING.getId(), REOBlocks.POTTED_BAOBAB_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.HILL_CHERRY_SAPLING.getId(), REOBlocks.POTTED_HILL_CHERRY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.CHESTNUT_SAPLING.getId(), REOBlocks.POTTED_CHESTNUT_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.CITRUS_SAPLING.getId(), REOBlocks.POTTED_CITRUS_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.EBONY_SAPLING.getId(), REOBlocks.POTTED_EBONY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.LARCH_SAPLING.getId(), REOBlocks.POTTED_LARCH_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.LIME_SAPLING.getId(), REOBlocks.POTTED_LIME_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.MAHOGANY_SAPLING.getId(), REOBlocks.POTTED_MAHOGANY_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.MAPLE_SAPLING.getId(), REOBlocks.POTTED_MAPLE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.PALM_SAPLING.getId(), REOBlocks.POTTED_PALM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.PAPAYA_SAPLING.getId(), REOBlocks.POTTED_PAPAYA_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.PINE_SAPLING.getId(), REOBlocks.POTTED_PINE_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.PLUM_SAPLING.getId(), REOBlocks.POTTED_PLUM_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.POPLAR_SAPLING.getId(), REOBlocks.POTTED_POPLAR_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.REDWOOD_SAPLING.getId(), REOBlocks.POTTED_REDWOOD_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.RUBBER_SAPLING.getId(), REOBlocks.POTTED_RUBBER_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.TEAK_SAPLING.getId(), REOBlocks.POTTED_TEAK_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.WALNUT_SAPLING.getId(), REOBlocks.POTTED_WALNUT_SAPLING);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(REOBlocks.WILLOW_SAPLING.getId(), REOBlocks.POTTED_WILLOW_SAPLING);
        });

        event.enqueueWork(() -> {
            // Leaves
            ComposterBlock.COMPOSTABLES.put(REOBlocks.BALSA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.BAOBAB_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.CHESTNUT_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.CITRUS_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.EBONY_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LARCH_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LIME_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.MAHOGANY_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.MAPLE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PALM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PAPAYA_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PINE_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PLUM_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.POPLAR_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.REDWOOD_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.RUBBER_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.TEAK_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.WALNUT_LEAVES.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.WILLOW_LEAVES.get().asItem(), 0.3F);

            // Sapling
            ComposterBlock.COMPOSTABLES.put(REOBlocks.BALSA_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.BAOBAB_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.CHESTNUT_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.CITRUS_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.EBONY_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LARCH_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.LIME_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.MAHOGANY_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.MAPLE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PALM_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PAPAYA_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PINE_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.PLUM_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.POPLAR_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.REDWOOD_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.RUBBER_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.TEAK_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.WALNUT_SAPLING.get().asItem(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOBlocks.WILLOW_SAPLING.get().asItem(), 0.3F);

            // Seeds
            ComposterBlock.COMPOSTABLES.put(REOItems.BARLEY_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.CAULIFLOWER_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.COTTON_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.RICE_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.STRAWBERRY_SEED.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(REOItems.TOMATO_SEED.get(), 0.3F);

            // Crops
            ComposterBlock.COMPOSTABLES.put(REOItems.BARLEY_PLANT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.RICE_PLANT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.COTTON_PLANT.get(), 0.65F);

            // Food //
            // Fruit
            ComposterBlock.COMPOSTABLES.put(REOItems.CHERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.CHESTNUT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.DATES.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.LEMON.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.LIME.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PAPAYA.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PEACH.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PEAR.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.PLUM.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.WALNUT.get(), 0.65F);

            // Veg
            ComposterBlock.COMPOSTABLES.put(REOItems.CAULIFLOWER.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.ONION.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.RICE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.TOMATO.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.TOMATO_ROTTEN.get(), 0.65F);

            // Berries
            ComposterBlock.COMPOSTABLES.put(REOItems.BLACKBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.BLUEBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.RASPBERRY.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(REOItems.STRAWBERRY.get(), 0.65F);

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

            // Machines //
            // Coal
            MenuScreens.register(REOMenuTypes.KILN_MENU.get(), KilnScreen::new);
            MenuScreens.register(REOMenuTypes.BASIC_CRUSHER_MENU.get(), BasicCrusherScreen::new);
            MenuScreens.register(REOMenuTypes.BASIC_PURIFIER_MENU.get(), BasicPurifierScreen::new);
            MenuScreens.register(REOMenuTypes.BASIC_EXTRACTOR_MENU.get(), BasicExtractorScreen::new);

            // Electric
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

            // Generators //
            MenuScreens.register(REOMenuTypes.COAL_GENERATOR_MENU.get(), CoalGenScreen::new);

        }
    }
}