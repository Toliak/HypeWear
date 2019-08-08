package com.toliak.hypewear.item;

import com.toliak.hypewear.HypeWear;
import com.toliak.hypewear.item.armor.HypeArmor;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static HypeArmor hypeHelmet = new HypeArmor(
            HypeWear.hypeArmorMaterial,
            EntityEquipmentSlot.HEAD,
            "g"
    );

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                hypeHelmet
        );
    }

    public static void registerModels() {
        hypeHelmet.registerItemModel();
    }

}
