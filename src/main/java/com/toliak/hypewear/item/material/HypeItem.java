package com.toliak.hypewear.item.material;

import com.sun.istack.internal.NotNull;
import com.toliak.hypewear.item.ItemRegisterInterface;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

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
