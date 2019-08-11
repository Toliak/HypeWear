package com.toliak.hypewear.proxy;

import com.toliak.hypewear.HypeWear;
import com.toliak.hypewear.item.ItemsRegistrator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends SharedProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);

        ItemsRegistrator.registerCustomModel(this);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

        ItemsRegistrator.registerRender(this);
    }

    public void registerItemRenderer(Item item, int meta, String name) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                item,
                meta,
                new ModelResourceLocation(HypeWear.MODID + ":" + name, "inventory")
        );
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