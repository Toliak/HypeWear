package com.toliak.hypewear.proxy;

import com.toliak.hypewear.HypeWear;
import com.toliak.hypewear.item.ItemsRegistrator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends SharedProxy {

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

}