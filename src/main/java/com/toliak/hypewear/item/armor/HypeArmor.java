package com.toliak.hypewear.item.armor;

import com.toliak.hypewear.item.ItemRegisterInterface;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class HypeArmor extends ItemArmor implements ItemRegisterInterface {
    private String name;

    public HypeArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
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
        proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public void registerItemCustomModel(ClientProxy proxy) {

    }
}
