package com.dmaster.dmtweaks;


import com.dmaster.dmtweaks.Blocks.Blocks;
import com.dmaster.dmtweaks.Helper.*;
import com.dmaster.dmtweaks.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;
import net.minecraft.block.Block;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
public class Main {
    public static final String MODID = "dmtweaks";
    public static final String NAME = "DMTweaks";
    public static final String VERSION = "0.1.0";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Tab.init();
        Base.init();

        Config.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new Config());
        ItemStackHolderInjector.INSTANCE.inject();
        if (Loader.isModLoaded("Botania"))
        {
            Botania.preInit();
        }

        if (Loader.isModLoaded("ThermalExpansion"))
        {
            TE_Intergration.preInit();
        }

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init (FMLInitializationEvent event)
    {
        ItemStackHolderInjector.INSTANCE.inject();
        Blocks.init();
        OreDicHelper.init();
        SlabHelper.init();
        CraftingHelper.init();
        if (Loader.isModLoaded("Botania"))
        {
            Botania.init();
        }

        if (Loader.isModLoaded("ThermalExpansion"))
        {
            TE_Intergration.init();
        }

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        ItemStackHolderInjector.INSTANCE.inject();
        if (Loader.isModLoaded("Botania"))
        {
            Botania.postInit();
        }

        if (Loader.isModLoaded("ThermalExpansion"))
        {
            TE_Intergration.postInit();
        }

        LogHelper.info("Post Initialization Complete");
    }

}


