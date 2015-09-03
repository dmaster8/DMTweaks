package com.dmaster.dmtweaks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Tab{
    public static CreativeTabs tabDMTweaks;

    public static void init(){
        tabDMTweaks = new CreativeTabs("tabDMTweaks") {
            @Override
            public Item getTabIconItem() {
                return Items.fish;
            }
        };
    }
}

