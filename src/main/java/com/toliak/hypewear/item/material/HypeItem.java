package com.toliak.hypewear.item.material;

import com.toliak.hypewear.item.ItemRegisterInterface;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.item.Item;

public class HypeItem extends Item implements ItemRegisterInterface {
    private String name;

    public HypeItem(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerItem(SharedProxy proxy) {
        proxy.registerItem(this);
    }

    @Override
    public void registerItemModel(ClientProxy proxy) {
        proxy.registerItemRenderer(this, 0, this.name);
    }

    @Override
    public void registerItemCustomModel(ClientProxy proxy) {

    }
}
