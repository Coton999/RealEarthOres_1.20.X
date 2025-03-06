package net.coton999.realearthores.datagen;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.fluid.REOFluids;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class REOFluidTagsProvider extends FluidTagsProvider {
    public REOFluidTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, RealEarthOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(FluidTags.LAVA)
                .add(REOFluids.MOLTEN_ALUMINIUM_SOURCE.get()) .add(REOFluids.MOLTEN_ALUMINIUM_FLOWING.get())
                .add(REOFluids.MOLTEN_AMETHYST_SOURCE.get()) .add(REOFluids.MOLTEN_AMETHYST_FLOWING.get())
                .add(REOFluids.MOLTEN_BRASS_SOURCE.get()) .add(REOFluids.MOLTEN_BRASS_FLOWING.get())
                .add(REOFluids.MOLTEN_BRONZE_SOURCE.get()) .add(REOFluids.MOLTEN_BRONZE_FLOWING.get())
                .add(REOFluids.MOLTEN_COAL_SOURCE.get()) .add(REOFluids.MOLTEN_COAL_FLOWING.get())
                .add(REOFluids.MOLTEN_COPPER_SOURCE.get()) .add(REOFluids.MOLTEN_COPPER_FLOWING.get())
                .add(REOFluids.MOLTEN_DIAMOND_SOURCE.get()) .add(REOFluids.MOLTEN_DIAMOND_FLOWING.get())
                .add(REOFluids.MOLTEN_ELECTRUM_SOURCE.get()) .add(REOFluids.MOLTEN_ELECTRUM_FLOWING.get())
                .add(REOFluids.MOLTEN_EMERALD_SOURCE.get()) .add(REOFluids.MOLTEN_EMERALD_FLOWING.get())
                .add(REOFluids.MOLTEN_ENDERITE_SOURCE.get()) .add(REOFluids.MOLTEN_ENDERITE_FLOWING.get())
                .add(REOFluids.MOLTEN_GOLD_SOURCE.get()) .add(REOFluids.MOLTEN_GOLD_FLOWING.get())
                .add(REOFluids.MOLTEN_IRON_SOURCE.get()) .add(REOFluids.MOLTEN_IRON_FLOWING.get())
                .add(REOFluids.MOLTEN_LAPIS_SOURCE.get()) .add(REOFluids.MOLTEN_LAPIS_FLOWING.get())
                .add(REOFluids.MOLTEN_LEAD_SOURCE.get()) .add(REOFluids.MOLTEN_LEAD_FLOWING.get())
                .add(REOFluids.MOLTEN_NICKEL_SOURCE.get()) .add(REOFluids.MOLTEN_NICKEL_FLOWING.get())
                .add(REOFluids.MOLTEN_PERIDOT_SOURCE.get()) .add(REOFluids.MOLTEN_PERIDOT_FLOWING.get())
                .add(REOFluids.MOLTEN_REDSTONE_SOURCE.get()) .add(REOFluids.MOLTEN_REDSTONE_FLOWING.get())
                .add(REOFluids.MOLTEN_RUBY_SOURCE.get()) .add(REOFluids.MOLTEN_RUBY_FLOWING.get())
                .add(REOFluids.MOLTEN_SAPPHIRE_SOURCE.get()) .add(REOFluids.MOLTEN_SAPPHIRE_FLOWING.get())
                .add(REOFluids.MOLTEN_SILVER_SOURCE.get()) .add(REOFluids.MOLTEN_SILVER_FLOWING.get())
                .add(REOFluids.MOLTEN_STEEL_SOURCE.get()) .add(REOFluids.MOLTEN_STEEL_FLOWING.get())
                .add(REOFluids.MOLTEN_TIN_SOURCE.get()) .add(REOFluids.MOLTEN_TIN_FLOWING.get())
                .add(REOFluids.MOLTEN_URANIUM_SOURCE.get()) .add(REOFluids.MOLTEN_URANIUM_FLOWING.get())
                .add(REOFluids.MOLTEN_ZINC_SOURCE.get()) .add(REOFluids.MOLTEN_ZINC_FLOWING.get())

        ;
    }
}
