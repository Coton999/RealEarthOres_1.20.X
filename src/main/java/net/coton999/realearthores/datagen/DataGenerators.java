package net.coton999.realearthores.datagen;


import net.coton999.realearthores.RealEarthOres;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = RealEarthOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new REORecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), REOLootTableProvider.create(packOutput));
        REOBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new REOBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeServer(), new REOBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new REOItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new REOWorldGenProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeClient(), new REOFluidTagsProvider(packOutput, lookupProvider, existingFileHelper));


        generator.addProvider(event.includeServer(), new REOItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
