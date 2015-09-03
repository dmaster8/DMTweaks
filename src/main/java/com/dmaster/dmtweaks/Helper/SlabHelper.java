package com.dmaster.dmtweaks.Helper;

import com.dmaster.dmtweaks.Config;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class SlabHelper {


    public static void init() {

        if (Config.slabTweaks) {
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone), new ItemStack(Blocks.stone_slab), new ItemStack(Blocks.stone_slab));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone), new ItemStack(Blocks.stone_slab, 1, 1), new ItemStack(Blocks.stone_slab,1, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.stone_slab, 1, 3), new ItemStack(Blocks.stone_slab,1, 3));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brick_block), new ItemStack(Blocks.stone_slab, 1, 4), new ItemStack(Blocks.stone_slab,1, 4));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick), new ItemStack(Blocks.stone_slab, 1, 5), new ItemStack(Blocks.stone_slab,1, 5));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.nether_brick), new ItemStack(Blocks.stone_slab, 1, 6), new ItemStack(Blocks.stone_slab,1, 6));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block), new ItemStack(Blocks.stone_slab, 1, 7), new ItemStack(Blocks.stone_slab,1, 7));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks), new ItemStack(Blocks.wooden_slab), new ItemStack(Blocks.wooden_slab));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 1), new ItemStack(Blocks.wooden_slab, 1, 1), new ItemStack(Blocks.wooden_slab, 1, 1));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 2), new ItemStack(Blocks.wooden_slab, 1, 2), new ItemStack(Blocks.wooden_slab, 1, 2));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 3), new ItemStack(Blocks.wooden_slab, 1, 3), new ItemStack(Blocks.wooden_slab, 1, 3));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 4), new ItemStack(Blocks.wooden_slab, 1, 4), new ItemStack(Blocks.wooden_slab, 1, 4));
            GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1, 5), new ItemStack(Blocks.wooden_slab, 1, 5), new ItemStack(Blocks.wooden_slab, 1, 5));
        }
    }
}


