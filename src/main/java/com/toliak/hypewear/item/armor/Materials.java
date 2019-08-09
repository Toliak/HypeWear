package com.toliak.hypewear.item.armor;

import com.toliak.hypewear.HypeWear;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static ItemArmor.ArmorMaterial aggc = EnumHelper.addArmorMaterial(
            "AGGC",
            HypeWear.MODID + ":aggc",
            15,
            new int[]{1, 3, 2, 1},
            1,
            SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            0.0F
    );
}
