package com.toliak.hypewear.item;

import com.toliak.hypewear.item.armor.HypeArmor;
import com.toliak.hypewear.item.armor.Materials;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.inventory.EntityEquipmentSlot;

public class ItemsRegistrator {

    /**
     * Define all items here
     */
    private static ItemRegisterInterface[] toRegister = {
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.HEAD,
                    "aggc_helmet"
            ),
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.CHEST,
                    "aggc_chestplate"
            ),
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.LEGS,
                    "aggc_leggings"
            ),
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.FEET,
                    "aggc_boots"
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
