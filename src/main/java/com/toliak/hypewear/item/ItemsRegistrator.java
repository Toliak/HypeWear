package com.toliak.hypewear.item;

import com.toliak.hypewear.item.armor.HypeArmor;
import com.toliak.hypewear.item.armor.Materials;
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
                    Materials.white,
                    EntityEquipmentSlot.HEAD,
                    "white_helmet"
            ),
            new HypeArmor(
                    Materials.aggc,
                    EntityEquipmentSlot.CHEST,
                    "aggc_chestplate"
            ),
            new HypeArmor(
                    Materials.castle,
                    EntityEquipmentSlot.CHEST,
                    "castle_chestplate"
            ),
            new HypeArmor(
                    Materials.castle,
                    EntityEquipmentSlot.LEGS,
                    "castle_leggings"
            ),
            new HypeArmor(
                    Materials.baritoneWhite,
                    EntityEquipmentSlot.CHEST,
                    "baritone_white_chestplate"
            ),
            new HypeArmor(
                    Materials.baritone,
                    EntityEquipmentSlot.HEAD,
                    "baritone_helmet"
            ),
            new HypeArmor(
                    Materials.baritone,
                    EntityEquipmentSlot.CHEST,
                    "baritone_chestplate"
            ),
            new HypeArmor(
                    Materials.baritone,
                    EntityEquipmentSlot.LEGS,
                    "baritone_leggings"
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
