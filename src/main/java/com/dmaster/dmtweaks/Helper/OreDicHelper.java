package com.dmaster.dmtweaks.Helper;

import com.dmaster.dmtweaks.Config;
import cpw.mods.fml.common.Loader;
import net.minecraftforge.oredict.OreDictionary;

public class OreDicHelper {

    public static void preInit(){

    }

    public static void init(){
        if (Loader.isModLoaded("TConstruct") && Config.TiConOreDic)
        {
            OreDictionary.registerOre("stenciltable", Parts.stencil1);
            OreDictionary.registerOre("stenciltable", Parts.stencil2);
            OreDictionary.registerOre("stenciltable", Parts.stencil3);
            OreDictionary.registerOre("stenciltable", Parts.stencil4);

            OreDictionary.registerOre("toolstation", Parts.toolstation);

            OreDictionary.registerOre("partbuilder", Parts.partbuilder);
            OreDictionary.registerOre("partbuilder", Parts.partbuilder2);
            OreDictionary.registerOre("partbuilder", Parts.partbuilder3);
            OreDictionary.registerOre("partbuilder", Parts.partbuilder4);

            OreDictionary.registerOre("toolforge", Parts.toolforge);
            OreDictionary.registerOre("toolforge", Parts.toolforge1);
            OreDictionary.registerOre("toolforge", Parts.toolforge2);
            OreDictionary.registerOre("toolforge", Parts.toolforge3);
            OreDictionary.registerOre("toolforge", Parts.toolforge4);
            OreDictionary.registerOre("toolforge", Parts.toolforge5);
            OreDictionary.registerOre("toolforge", Parts.toolforge6);
            OreDictionary.registerOre("toolforge", Parts.toolforge7);
            OreDictionary.registerOre("toolforge", Parts.toolforge8);
            OreDictionary.registerOre("toolforge", Parts.toolforge9);
            OreDictionary.registerOre("toolforge", Parts.toolforge10);
            OreDictionary.registerOre("toolforge", Parts.toolforge11);
            OreDictionary.registerOre("toolforge", Parts.toolforge12);
            OreDictionary.registerOre("toolforge", Parts.toolforge13);


        }
    }
}
