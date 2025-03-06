package net.coton999.realearthores.fluid;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.block.REOBlocks;
import net.coton999.realearthores.item.REOItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class REOFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, RealEarthOres.MOD_ID);


    // Source & Flowing Registry
    public static final RegistryObject<FlowingFluid> MOLTEN_ALUMINIUM_SOURCE = FLUIDS.register("molten_aluminium_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_ALUMINIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ALUMINIUM_FLOWING = FLUIDS.register("molten_aluminium_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_ALUMINIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_AMETHYST_SOURCE = FLUIDS.register("molten_amethyst_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_AMETHYST_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_AMETHYST_FLOWING = FLUIDS.register("molten_amethyst_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_AMETHYST_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_SOURCE = FLUIDS.register("molten_brass_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_BRASS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BRASS_FLOWING = FLUIDS.register("molten_brass_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_BRASS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_BRONZE_SOURCE = FLUIDS.register("molten_bronze_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_BRONZE_FLOWING = FLUIDS.register("molten_bronze_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_BRONZE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_COAL_SOURCE = FLUIDS.register("molten_coal_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_COAL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_COAL_FLOWING = FLUIDS.register("molten_coal_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_COAL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_SOURCE = FLUIDS.register("molten_copper_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_COPPER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_COPPER_FLOWING = FLUIDS.register("molten_copper_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_SOURCE = FLUIDS.register("molten_diamond_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_DIAMOND_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_DIAMOND_FLOWING = FLUIDS.register("molten_diamond_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_DIAMOND_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_ELECTRUM_SOURCE = FLUIDS.register("molten_electrum_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ELECTRUM_FLOWING = FLUIDS.register("molten_electrum_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_ELECTRUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_EMERALD_SOURCE = FLUIDS.register("molten_emerald_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_EMERALD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_EMERALD_FLOWING = FLUIDS.register("molten_emerald_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_EMERALD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_ENDERITE_SOURCE = FLUIDS.register("molten_enderite_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_ENDERITE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ENDERITE_FLOWING = FLUIDS.register("molten_enderite_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_ENDERITE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_SOURCE = FLUIDS.register("molten_gold_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_GOLD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_GOLD_FLOWING = FLUIDS.register("molten_gold_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_SOURCE = FLUIDS.register("molten_iron_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_IRON_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_IRON_FLOWING = FLUIDS.register("molten_iron_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_LAPIS_SOURCE = FLUIDS.register("molten_lapis_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_LAPIS_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_LAPIS_FLOWING = FLUIDS.register("molten_lapis_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_LAPIS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_LEAD_SOURCE = FLUIDS.register("molten_lead_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_LEAD_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_LEAD_FLOWING = FLUIDS.register("molten_lead_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_LEAD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_NICKEL_SOURCE = FLUIDS.register("molten_nickel_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_NICKEL_FLOWING = FLUIDS.register("molten_nickel_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_NICKEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_PERIDOT_SOURCE = FLUIDS.register("molten_peridot_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_PERIDOT_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_PERIDOT_FLOWING = FLUIDS.register("molten_peridot_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_PERIDOT_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_PLATINUM_SOURCE = FLUIDS.register("molten_platinum_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_PLATINUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_PLATINUM_FLOWING = FLUIDS.register("molten_platinum_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_PLATINUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_REDSTONE_SOURCE = FLUIDS.register("molten_redstone_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_REDSTONE_FLOWING = FLUIDS.register("molten_redstone_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_REDSTONE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_RUBY_SOURCE = FLUIDS.register("molten_ruby_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_RUBY_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_RUBY_FLOWING = FLUIDS.register("molten_ruby_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_RUBY_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_SAPPHIRE_SOURCE = FLUIDS.register("molten_sapphire_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_SAPPHIRE_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_SAPPHIRE_FLOWING = FLUIDS.register("molten_sapphire_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_SAPPHIRE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_SILVER_SOURCE = FLUIDS.register("molten_silver_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_SILVER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_SILVER_FLOWING = FLUIDS.register("molten_silver_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_SILVER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_STEEL_SOURCE = FLUIDS.register("molten_steel_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_STEEL_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_STEEL_FLOWING = FLUIDS.register("molten_steel_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_STEEL_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_TIN_SOURCE = FLUIDS.register("molten_tin_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_TIN_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_TIN_FLOWING = FLUIDS.register("molten_tin_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_TIN_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_URANIUM_SOURCE = FLUIDS.register("molten_uranium_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_URANIUM_FLOWING = FLUIDS.register("molten_uranium_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_URANIUM_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_SOURCE = FLUIDS.register("molten_zinc_source",
            () -> new ForgeFlowingFluid.Source(REOFluids.MOLTEN_ZINC_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> MOLTEN_ZINC_FLOWING = FLUIDS.register("molten_zinc_flowing",
            () -> new ForgeFlowingFluid.Flowing(REOFluids.MOLTEN_ZINC_FLUID_PROPERTIES));


    // Fluid Properties
    public static final ForgeFlowingFluid.Properties MOLTEN_ALUMINIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_ALUMINIUM_FLUID_TYPE, MOLTEN_ALUMINIUM_SOURCE, MOLTEN_ALUMINIUM_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_ALUMINIUM_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_ALUMINIUM);

    public static final ForgeFlowingFluid.Properties MOLTEN_AMETHYST_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_AMETHYST_FLUID_TYPE, MOLTEN_AMETHYST_SOURCE, MOLTEN_AMETHYST_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_AMETHYST_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_AMETHYST);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRASS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_BRASS_FLUID_TYPE, MOLTEN_BRASS_SOURCE, MOLTEN_BRASS_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_BRASS_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_BRASS);

    public static final ForgeFlowingFluid.Properties MOLTEN_BRONZE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_BRONZE_FLUID_TYPE, MOLTEN_BRONZE_SOURCE, MOLTEN_BRONZE_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_BRONZE_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_BRONZE);

    public static final ForgeFlowingFluid.Properties MOLTEN_COAL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_COAL_FLUID_TYPE, MOLTEN_COAL_SOURCE, MOLTEN_COAL_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_COAL_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_COAL);

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_COPPER_FLUID_TYPE, MOLTEN_COPPER_SOURCE, MOLTEN_COPPER_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_COPPER);

    public static final ForgeFlowingFluid.Properties MOLTEN_DIAMOND_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_DIAMOND_FLUID_TYPE, MOLTEN_DIAMOND_SOURCE, MOLTEN_DIAMOND_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_DIAMOND_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_DIAMOND);

    public static final ForgeFlowingFluid.Properties MOLTEN_ELECTRUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_ELECTRUM_FLUID_TYPE, MOLTEN_ELECTRUM_SOURCE, MOLTEN_ELECTRUM_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_ELECTRUM_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_ELECTRUM);

    public static final ForgeFlowingFluid.Properties MOLTEN_EMERALD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_EMERALD_FLUID_TYPE, MOLTEN_EMERALD_SOURCE, MOLTEN_EMERALD_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_EMERALD_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_EMERALD);

    public static final ForgeFlowingFluid.Properties MOLTEN_ENDERITE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_ENDERITE_FLUID_TYPE, MOLTEN_ENDERITE_SOURCE, MOLTEN_ENDERITE_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_ENDERITE_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_ENDERITE);

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_GOLD_FLUID_TYPE, MOLTEN_GOLD_SOURCE, MOLTEN_GOLD_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_GOLD);

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_IRON_FLUID_TYPE, MOLTEN_IRON_SOURCE, MOLTEN_IRON_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_IRON_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_IRON);

    public static final ForgeFlowingFluid.Properties MOLTEN_LAPIS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_LAPIS_FLUID_TYPE, MOLTEN_LAPIS_SOURCE, MOLTEN_LAPIS_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_LAPIS_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_LAPIS);

    public static final ForgeFlowingFluid.Properties MOLTEN_LEAD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_LEAD_FLUID_TYPE, MOLTEN_LEAD_SOURCE, MOLTEN_LEAD_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_LEAD_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_LEAD);

    public static final ForgeFlowingFluid.Properties MOLTEN_NICKEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_NICKEL_FLUID_TYPE, MOLTEN_NICKEL_SOURCE, MOLTEN_NICKEL_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_NICKEL_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_NICKEL);

    public static final ForgeFlowingFluid.Properties MOLTEN_PERIDOT_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_PERIDOT_FLUID_TYPE, MOLTEN_PERIDOT_SOURCE, MOLTEN_PERIDOT_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_PERIDOT_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_PERIDOT);

    public static final ForgeFlowingFluid.Properties MOLTEN_PLATINUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_PLATINUM_FLUID_TYPE, MOLTEN_PLATINUM_SOURCE, MOLTEN_PLATINUM_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_PLATINUM_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_PLATINUM);

    public static final ForgeFlowingFluid.Properties MOLTEN_REDSTONE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_REDSTONE_FLUID_TYPE, MOLTEN_REDSTONE_SOURCE, MOLTEN_REDSTONE_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_REDSTONE_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_REDSTONE);

    public static final ForgeFlowingFluid.Properties MOLTEN_RUBY_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_RUBY_FLUID_TYPE, MOLTEN_RUBY_SOURCE, MOLTEN_RUBY_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_RUBY_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_RUBY);

    public static final ForgeFlowingFluid.Properties MOLTEN_SAPPHIRE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_SAPPHIRE_FLUID_TYPE, MOLTEN_SAPPHIRE_SOURCE, MOLTEN_SAPPHIRE_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_SAPPHIRE_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_SAPPHIRE);

    public static final ForgeFlowingFluid.Properties MOLTEN_SILVER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_SILVER_FLUID_TYPE, MOLTEN_SILVER_SOURCE, MOLTEN_SILVER_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_SILVER_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_SILVER);

    public static final ForgeFlowingFluid.Properties MOLTEN_STEEL_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_STEEL_FLUID_TYPE, MOLTEN_STEEL_SOURCE, MOLTEN_STEEL_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_STEEL_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_STEEL);

    public static final ForgeFlowingFluid.Properties MOLTEN_TIN_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_TIN_FLUID_TYPE, MOLTEN_TIN_SOURCE, MOLTEN_TIN_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_TIN_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_TIN);

    public static final ForgeFlowingFluid.Properties MOLTEN_URANIUM_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_URANIUM_FLUID_TYPE, MOLTEN_URANIUM_SOURCE, MOLTEN_URANIUM_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_URANIUM_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_URANIUM);

    public static final ForgeFlowingFluid.Properties MOLTEN_ZINC_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            REOFluidTypes.MOLTEN_ZINC_FLUID_TYPE, MOLTEN_ZINC_SOURCE, MOLTEN_ZINC_FLOWING)
            .slopeFindDistance(4).levelDecreasePerBlock(2).tickRate(40).block(REOBlocks.MOLTEN_ZINC_BLOCK)
            .bucket(REOItems.BUCKET_MOLTEN_ZINC);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}