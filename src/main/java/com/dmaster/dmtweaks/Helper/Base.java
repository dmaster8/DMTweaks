package com.dmaster.dmtweaks.Helper;

import cpw.mods.fml.common.registry.ItemStackHolderInjector;

public class Base {
    public static void preInit(){

    }

    public static void init() {
        ItemStackHolderInjector.INSTANCE.inject();

    }


    public static void postInit(){

    }
}

