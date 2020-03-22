package com.toliak.hypewear.item.armor;

import com.toliak.hypewear.HypeWear;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {
    public static final int DURABILITY = 5;
    public static final int[] REDUCTION = {1, 3, 2, 1};
    public static final int ENCHANTABILITY = 1;
    public static final SoundEvent SOUND = SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    public static final float TOUGHNESS = 0;

    public static final ItemArmor.ArmorMaterial aggc = EnumHelper.addArmorMaterial(
            "AGGC",
            HypeWear.MODID + ":aggc",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );
    public static final ItemArmor.ArmorMaterial aggcChestplate = EnumHelper.addArmorMaterial(
            "AGGC",
            HypeWear.MODID + ":aggc_chestplate",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

    public static final ItemArmor.ArmorMaterial black = EnumHelper.addArmorMaterial(
            "BLACK",
            HypeWear.MODID + ":black",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

    public static final ItemArmor.ArmorMaterial white = EnumHelper.addArmorMaterial(
            "WHITE",
            HypeWear.MODID + ":white",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

    public static final ItemArmor.ArmorMaterial castle = EnumHelper.addArmorMaterial(
            "CASTLE",
            HypeWear.MODID + ":castle",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

    public static final ItemArmor.ArmorMaterial baritoneWhite = EnumHelper.addArmorMaterial(
            "BARITONE_WHITE",
            HypeWear.MODID + ":baritone_white",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

    public static final ItemArmor.ArmorMaterial baritone = EnumHelper.addArmorMaterial(
            "BARITONE",
            HypeWear.MODID + ":baritone",
            DURABILITY,
            REDUCTION,
            ENCHANTABILITY,
            SOUND,
            TOUGHNESS
    );

}
