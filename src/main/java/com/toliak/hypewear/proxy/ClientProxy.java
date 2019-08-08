package com.toliak.hypewear.proxy;

import com.toliak.hypewear.HypeWear;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(
                item,
                meta,
                new ModelResourceLocation(HypeWear.MODID + ":" + id, "inventory")
        );
    }

    @Override
    public void registerRenderers() {

    }
}