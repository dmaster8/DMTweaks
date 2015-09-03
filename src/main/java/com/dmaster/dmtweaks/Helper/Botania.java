package com.dmaster.dmtweaks.Helper;

import com.dmaster.dmtweaks.Config;
import com.dmaster.dmtweaks.Main;
import com.dmaster.dmtweaks.Tab;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Botania {

    public static Item manaGear, terraGear, lWoodGear, lRockGear;

    public static void preInit()
    {

    }

    public static void init()
    {
        if (Config.BotaniaGears){
            Gears();
        }

        getComponents();
        addRecipes();
        getItems();


    }

    private static void addRecipes(){
        ItemStackHolderInjector.INSTANCE.inject();
    }

    private static void getComponents(){

    }

    private static void getItems(){

    }

    public static void  Gears(){
        manaGear = new Item().setUnlocalizedName("manaGear").setTextureName(Main.MODID + ":manaGear").setCreativeTab(Tab.tabDMTweaks);
        GameRegistry.registerItem(manaGear, manaGear.getUnlocalizedName());
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Botania.manaGear),
                "XMX", "MIM", "XMX", 'M', "ingotManasteel", 'I', "ingotIron"));

        terraGear = new Item().setUnlocalizedName("terraGear").setTextureName(Main.MODID + ":terraGear").setCreativeTab(Tab.tabDMTweaks);
        GameRegistry.registerItem(terraGear, terraGear.getUnlocalizedName());
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Botania.terraGear),
                "XTX", "TIT", "XTX", 'T', "ingotTerrasteel", 'I', "ingotIron"));

        lWoodGear = new Item().setUnlocalizedName("lWoodGear").setTextureName(Main.MODID + ":lWoodGear").setCreativeTab(Tab.tabDMTweaks);
        GameRegistry.registerItem(lWoodGear, lWoodGear.getUnlocalizedName());
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Botania.lWoodGear),
                "XWX", "WIW", "XWX", 'W', "livingwood", 'I', "ingotIron"));

        lRockGear = new Item().setUnlocalizedName("lRockGear").setTextureName(Main.MODID + ":lRockGear").setCreativeTab(Tab.tabDMTweaks);
        GameRegistry.registerItem(lRockGear, lRockGear.getUnlocalizedName());
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Botania.lRockGear),
                "XRX", "RIR", "XRX", 'R', "livingrock", 'I', "ingotIron"));





    }

    public static void postInit()
    {

    }
}

