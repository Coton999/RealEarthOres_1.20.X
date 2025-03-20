package net.coton999.realearthores.menu;

import net.coton999.realearthores.RealEarthOres;
import net.coton999.realearthores.menu.machines.coal.*;
import net.coton999.realearthores.menu.machines.electric.*;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class REOMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, RealEarthOres.MOD_ID);

    // Coal
    public static final RegistryObject<MenuType<KilnMenu>> KILN_MENU =
            registerMenuType(KilnMenu::new, "kiln_menu");

    public static final RegistryObject<MenuType<BasicCrusherMenu>> BASIC_CRUSHER_MENU =
            registerMenuType(BasicCrusherMenu::new, "basic_crusher_menu");

    public static final RegistryObject<MenuType<BasicExtractorMenu>> BASIC_EXTRACTOR_MENU =
            registerMenuType(BasicExtractorMenu::new, "basic_extractor_menu");

    public static final RegistryObject<MenuType<BasicCompressorMenu>> BASIC_COMPRESSOR_MENU =
            registerMenuType(BasicCompressorMenu::new, "basic_compressor_menu");

    // Electric
    public static final RegistryObject<MenuType<ElectricFurnaceMenu>> ELECTRIC_FURNACE_MENU =
            registerMenuType(ElectricFurnaceMenu::new, "electric_furnace_menu");

    public static final RegistryObject<MenuType<CrusherMenu>> CRUSHER_MENU =
            registerMenuType(CrusherMenu::new, "crusher_menu");

    public static final RegistryObject<MenuType<PurifierMenu>> PURIFIER_MENU =
            registerMenuType(PurifierMenu::new, "purifier_menu");

    public static final RegistryObject<MenuType<AlloyFurnaceMenu>> ALLOY_FURNACE_MENU =
            registerMenuType(AlloyFurnaceMenu::new, "alloy_furnace_menu");

    public static final RegistryObject<MenuType<SawmillMenu>> SAWMILL_MENU =
            registerMenuType(SawmillMenu::new, "sawmill_menu");

    public static final RegistryObject<MenuType<ExtractorMenu>> EXTRACTOR_MENU =
            registerMenuType(ExtractorMenu::new, "extractor_menu");

    public static final RegistryObject<MenuType<CompressorMenu>> COMPRESSOR_MENU =
            registerMenuType(CompressorMenu::new, "compressor_menu");

    public static final RegistryObject<MenuType<CentrifugeMenu>> CENTRIFUGE_MENU =
            registerMenuType(CentrifugeMenu::new, "centrifuge_menu");

    public static final RegistryObject<MenuType<InductionFurnaceMenu>> INDUCTION_FURNACE_MENU =
            registerMenuType(InductionFurnaceMenu::new, "induction_furnace_menu");

    public static final RegistryObject<MenuType<TransfuserMenu>> TRANSFUSER_MENU =
            registerMenuType(TransfuserMenu::new, "transfuser_menu");


    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}