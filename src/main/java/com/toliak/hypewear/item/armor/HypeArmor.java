package com.toliak.hypewear.item.armor;

import com.toliak.hypewear.HypeWear;
import com.toliak.hypewear.item.ItemModelProvider;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class HypeArmor extends ItemArmor implements ItemModelProvider {
    private String name;

    public HypeArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
        super(material, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public void registerItemModel() {
         HypeWear.proxy.registerItemRenderer(this, 0, name);
    }
}
