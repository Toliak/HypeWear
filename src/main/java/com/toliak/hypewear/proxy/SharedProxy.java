package com.toliak.hypewear.proxy;

import com.toliak.hypewear.item.ItemsRegistrator;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SharedProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ItemsRegistrator.register(this);
    }

    public void init(FMLInitializationEvent event) {
    }

    public void postInit(FMLPostInitializationEvent event) {
    }

    public void registerItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
    }

}
