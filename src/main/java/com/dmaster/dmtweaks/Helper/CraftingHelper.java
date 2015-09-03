package com.dmaster.dmtweaks.Helper;

import com.dmaster.dmtweaks.Blocks.Blocks;
import com.dmaster.dmtweaks.Config;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingHelper {

    public static void init(){

        //Agricraft Recipes
        if(Loader.isModLoaded("AgriCraft") && (Loader.isModLoaded("HardcoreQuesting")))
            if (Config.agriJournal) {
                ItemStack journal = GameRegistry.findItemStack("AgriCraft", "journal", 1);
                ItemStack cropSticks = GameRegistry.findItemStack("AgriCraft", "cropsItem", 1);
                ItemStack book = GameRegistry.findItemStack("HardcoreQuesting", "quest_book", 1);
                RecipeRemover.removeAnyRecipe(journal);

                GameRegistry.addRecipe(new ShapedOreRecipe(journal,
                        "CSC", "SBS", "CSC", 'C', cropSticks, 'S', "listAllseed", 'B', book));
            }

        if (Config.ccWolf){
           GameRegistry.addRecipe(new ShapedOreRecipe(Blocks.ccWolf,
                    "WWW", "WBW", "WWW", 'W', "blockCloth", 'B', Parts.bone ));
        }
    }
}

