package com.dmaster.dmtweaks.Helper;

import com.dmaster.dmtweaks.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class TE_Intergration{

    public static void preInit() {

    }

    public static void init(){
        ItemStackHolderInjector.INSTANCE.inject();

        if(Config.tinPiston){
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
                    "WWW",
                    "CIC",
                    "CRC",
                    'W', "plankWood",
                    'C', "cobblestone",
                    'I', "ingotTin",
                    'R', "dustRedstone"));
        }

        if (Config.copperPiston) {
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
                    "WWW",
                    "CIC",
                    "CRC",
                    'W',"plankWood",
                    'C', "cobblestone",
                    'I', "ingotCopper",
                    'R', "dustRedstone"));
        }

        if(Config.silverPiston){
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.piston,
                    "WWW",
                    "CIC",
                    "CRC",
                    'W',"plankWood",
                    'C', "cobblestone",
                    'I', "ingotSilver",
                    'R', "dustRedstone"));

        }

        if (Config.tinBucket){
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.bucket,
                    "TXT",
                    "XTX",
                    "XXX",
                    'T', "ingotTin"));
        }

        if(Config.copperBucket){
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.bucket,
                    "CXC",
                    "XCX",
                    "XXX",
                    'C', "ingotCopper"));
        }

        if(Config.silverBucket){
            GameRegistry.addRecipe(new ShapedOreRecipe(Parts.bucket,
                    "SXS",
                    "XSX",
                    "XXX",
                    'S', "ingotSilver"));
        }


    }

    public static void postInit(){

    }
}

