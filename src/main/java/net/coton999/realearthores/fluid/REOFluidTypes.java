package net.coton999.realearthores.fluid;

import net.coton999.realearthores.RealEarthOres;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class REOFluidTypes {
    public static final ResourceLocation MOLTEN_METAL_STILL_RL = new ResourceLocation(RealEarthOres.MOD_ID, "block/fluid/molten_metal");
    public static final ResourceLocation MOLTEN_METAL_FLOWING_RL = new ResourceLocation(RealEarthOres.MOD_ID, "block/fluid/molten_metal_flow");
    public static final ResourceLocation LIQUID_STONE_STILL_RL = new ResourceLocation(RealEarthOres.MOD_ID, "block/fluid/liquid_stone");
    public static final ResourceLocation LIQUID_STONE_FLOWING_RL = new ResourceLocation(RealEarthOres.MOD_ID, "block/fluid/liquid_stone_flow");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, RealEarthOres.MOD_ID);

    public static final RegistryObject<FluidType> MOLTEN_ALUMINIUM_FLUID_TYPE = registerFluidType("molten_aluminium_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1FBC6FC,
                    new Vector3f(251f / 255f, 198f / 255f, 252f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_AMETHYST_FLUID_TYPE = registerFluidType("molten_amethyst_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA17A5BB5,
                    new Vector3f(122f / 255f, 91f / 255f, 181f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_BRASS_FLUID_TYPE = registerFluidType("molten_brass_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1FBD172,
                    new Vector3f(251f / 255f, 209f / 255f, 114f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_BRONZE_FLUID_TYPE = registerFluidType("molten_bronze_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1E98935,
                    new Vector3f(233f / 255f, 137f / 255f, 53f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_COAL_FLUID_TYPE = registerFluidType("molten_coal_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA1101015,
                    new Vector3f(16f / 255f, 16f / 255f, 21f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE = registerFluidType("molten_copper_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1E0734D,
                    new Vector3f(224f / 255f, 115f / 255f, 77f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_DIAMOND_FLUID_TYPE = registerFluidType("molten_diamond_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA11ED0D6,
                    new Vector3f(30f / 255f, 208f / 255f, 214f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_ELECTRUM_FLUID_TYPE = registerFluidType("molten_electrum_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1DECB38,
                    new Vector3f(222f / 255f, 203f / 255f, 56f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_EMERALD_FLUID_TYPE = registerFluidType("molten_emerald_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA117C544,
                    new Vector3f(23f / 255f, 197f / 255f, 68f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_ENDERITE_FLUID_TYPE = registerFluidType("molten_enderite_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA16D42B7,
                    new Vector3f(109f / 255f, 66f / 255f, 183f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_GOLD_FLUID_TYPE = registerFluidType("molten_gold_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1D1D116,
                    new Vector3f(209f / 255f, 209f / 255f, 22f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_IRON_FLUID_TYPE = registerFluidType("molten_iron_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1D8AF93,
                    new Vector3f(216f / 255f, 175f / 255f, 147f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_LAPIS_FLUID_TYPE = registerFluidType("molten_lapis_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA10C399F,
                    new Vector3f(12f / 255f, 57f / 255f, 159f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_LEAD_FLUID_TYPE = registerFluidType("molten_lead_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA3C4359,
                    new Vector3f(60f / 255f, 67f / 255f, 89f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_NICKEL_FLUID_TYPE = registerFluidType("molten_nickel_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1E0D495,
                    new Vector3f(224f / 255f, 212f / 255f, 149f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_PERIDOT_FLUID_TYPE = registerFluidType("molten_peridot_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA16CB55B,
                    new Vector3f(108f / 255f, 181f / 255f, 91f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_PLATINUM_FLUID_TYPE = registerFluidType("molten_platinum_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA171E6ED,
                    new Vector3f(113f / 255f, 230f / 255f, 237f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_REDSTONE_FLUID_TYPE = registerFluidType("molten_redstone_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA1F71C1C,
                    new Vector3f(247f / 255f, 28f / 255f, 28f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_RUBY_FLUID_TYPE = registerFluidType("molten_ruby_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA1B55B6C,
                    new Vector3f(181f / 255f, 91f / 255f, 108f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_SAPPHIRE_FLUID_TYPE = registerFluidType("molten_sapphire_fluid",
            new REOBaseFluidType(LIQUID_STONE_STILL_RL, LIQUID_STONE_FLOWING_RL, 0xA15B75B5,
                    new Vector3f(91f / 255f, 117f / 255f, 181f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_SILVER_FLUID_TYPE = registerFluidType("molten_silver_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1DDEDF5,
                    new Vector3f(221f / 255f, 237f / 255f, 245f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_STEEL_FLUID_TYPE = registerFluidType("molten_steel_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA17B777E,
                    new Vector3f(123f / 255f, 119f / 255f, 126f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_TIN_FLUID_TYPE = registerFluidType("molten_tin_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA1A0A0A0,
                    new Vector3f(160f / 255f, 160f / 255f, 160f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_URANIUM_FLUID_TYPE = registerFluidType("molten_uranium_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA12E6D21,
                    new Vector3f(46f / 255f, 109f / 255f, 33f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));

    public static final RegistryObject<FluidType> MOLTEN_ZINC_FLUID_TYPE = registerFluidType("molten_zinc_fluid",
            new REOBaseFluidType(MOLTEN_METAL_STILL_RL, MOLTEN_METAL_FLOWING_RL, 0xA16AB7A5,
                    new Vector3f(106f / 255f, 183f / 255f, 165f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(1000).density(1000).temperature(1000)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)));



    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}