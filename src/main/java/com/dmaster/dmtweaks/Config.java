package com.dmaster.dmtweaks;


import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import sun.security.krb5.internal.Ticket;

import java.io.File;

public class Config {

    public static Configuration configuration;
    public static final String CATEGORY_BOTANIA = "Botania Tweaks";
    public static final String CATERGORY_RECIPE = "Recipe Tweaks";


    public static boolean BotaniaGears = true;
    public static boolean ccWolf = true;
    public static boolean copperPiston = true;
    public static boolean silverPiston = true;
    public static boolean tinPiston = true;
    public static boolean TiConOreDic = true;
    public static boolean copperBucket = true;
    public static boolean silverBucket = true;
    public static boolean tinBucket = true;
    public static boolean slabTweaks = true;
    public static boolean agriJournal = true;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        ccWolf = configuration.getBoolean("Companion Cube Wolf", Configuration.CATEGORY_GENERAL, true, "Enable Wolf Companion Cube");
        BotaniaGears = configuration.getBoolean("Botania Gears", Config.CATEGORY_BOTANIA, true, "Enable Manasteel Gear, Terrasteal Gear, LivingWood Gear, LivingRock Gear");
        copperPiston = configuration.getBoolean("Copper Piston Recipe", Config.CATERGORY_RECIPE, true, "Adds a piston crafting recipe using Copper ingots");
        silverPiston = configuration.getBoolean("Silver Piston Recipe", Config.CATERGORY_RECIPE, true, "Adds a piston crafting recipe using Silver ingots");
        tinPiston = configuration.getBoolean("Tin Piston Recipe", Config.CATERGORY_RECIPE, true, "Adds a piston crafting recipe using Tin ingots");
        TiConOreDic = configuration.getBoolean("TiCon Ore Dictionary Entry's", Configuration.CATEGORY_GENERAL, true, "Adds TiCon blocks to their own separate ore dictionary entry's");
        copperBucket = configuration.getBoolean("Copper Bucket Recipe", Config.CATERGORY_RECIPE, true, "Adds a bucket crafting recipe using Copper ingots");
        silverBucket = configuration.getBoolean("Silver Bucket Recipe", Config.CATERGORY_RECIPE, true, "Adds a bucket crafting recipe using Silver ingots");
        tinBucket = configuration.getBoolean("Tin Bucket Recipe", Config.CATERGORY_RECIPE, true, "Adds a bucket crafting recipe using Tin ingots");
        slabTweaks = configuration.getBoolean("Slab Conversion Recipe", Config.CATERGORY_RECIPE, true, "Allows for slabs to be crafted into their block form");
        agriJournal = configuration.getBoolean("Different Agricraft Journal Recipe", Config.CATERGORY_RECIPE, true, "Different Agricraft Journal using the Hqm book");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Main.MODID))
        {
            loadConfiguration();
        }
    }
}

