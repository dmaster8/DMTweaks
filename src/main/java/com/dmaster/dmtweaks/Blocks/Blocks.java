package com.dmaster.dmtweaks.Blocks;

import com.dmaster.dmtweaks.Config;
import com.dmaster.dmtweaks.Helper.Parts;
import com.dmaster.dmtweaks.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Blocks {

    public static baseBlock invGlass;
    public static ccWolf ccWolf;

    public static void init(){
        getBlocks();
    }

    public static void getBlocks(){
        invGlass = (baseBlock)new baseBlock().setBlockUnbreakable().setBlockName("invGlass").setBlockTextureName(Main.MODID + ":/invGlass");
        GameRegistry.registerBlock(invGlass, invGlass.getUnlocalizedName());

        if (Config.ccWolf){
            ccWolf = new ccWolf();
            GameRegistry.registerBlock(ccWolf, ccWolf.getUnlocalizedName());

            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ccWolf),
                    "WWW", "WBW", "WWW", 'W', "wool", 'B', Parts.bone));
        }
    }
}

