package com.zeetronn.wastelands;

import com.zeetronn.wastelands.proxy.CommonProxy;
import com.zeetronn.wastelands.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }
    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {

    }


}
