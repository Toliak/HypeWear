package com.toliak.hypewear.proxy;

import com.toliak.hypewear.HypeWear;
import com.toliak.hypewear.item.ItemsRegistrator;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
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

    public void registerCustomModelResourceLocation(Item item, int metadata, String name) {
        ModelLoader.setCustomModelResourceLocation(
                item,
                metadata,
                new ModelResourceLocation(
                        HypeWear.MODID + name,
                        "inventory"
                )
        );
    }

}
