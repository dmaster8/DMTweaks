package com.dmaster.dmtweaks.Blocks;

import com.dmaster.dmtweaks.Tab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class baseBlock extends Block {
    public baseBlock(){
        super(Material.iron);
        setCreativeTab(Tab.tabDMTweaks);
    }

    public boolean isOpaqueCube(){
        return false;
    }

}

