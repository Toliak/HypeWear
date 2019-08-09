package com.toliak.hypewear;

import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = HypeWear.MODID, name = HypeWear.NAME, version = HypeWear.VERSION)
public class HypeWear {
    public static final String MODID = "hypewear";
    public static final String NAME = "Hype Wear";
    public static final String VERSION = "1.0";

    @SidedProxy(serverSide = "com.toliak.hypewear.proxy.ServerProxy", clientSide = "com.toliak.hypewear.proxy.ClientProxy")
    public static SharedProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
