package com.toliak.hypewear.item;

import com.toliak.hypewear.item.armor.HypeArmor;
import com.toliak.hypewear.item.armor.Materials;
import com.toliak.hypewear.item.material.HypeItem;
import com.toliak.hypewear.item.material.HypeItemMaterial;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemsRegistrator {

    /**
     * Define all items here
     */
    private static ItemRegisterInterface[] toRegister = {
            new HypeItemMaterial("hype_material"),
            new HypeArmor(
                    Materials.black,
                    EntityEquipmentSlot.HEAD,
                    "black_helmet"
            ),
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.CHEST,
                    "aggc_chestplate"
            ),
            new HypeArmor(
                    Materials.castle,
                    EntityEquipmentSlot.LEGS,
                    "castle_leggings"
            ),
    };

    public static void register(SharedProxy proxy) {
        for (ItemRegisterInterface item : toRegister) {
            item.registerItem(proxy);
        }
    }

    public static void registerRender(ClientProxy proxy) {
        for (ItemRegisterInterface item : toRegister) {
            item.registerItemModel(proxy);
        }
    }
}
