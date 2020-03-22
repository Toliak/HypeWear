package com.toliak.hypewear.item.armor;

import com.toliak.hypewear.item.ItemRegisterInterface;
import com.toliak.hypewear.item.armor.model.ModelCustomArmor;
import com.toliak.hypewear.proxy.ClientProxy;
import com.toliak.hypewear.proxy.SharedProxy;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

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

    @Nullable
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
        if (!stack.isEmpty()) {
            if (stack.getItem() instanceof ItemArmor) {
                ModelCustomArmor armorModel = new ModelCustomArmor(1.0f);

//                armorModel.bipedRightLeg.showModel = slot == EntityEquipmentSlot.CHEST;
//                armorModel.bipedLeftLeg.showModel = slot == EntityEquipmentSlot.CHEST;

                armorModel.bipedBody.showModel = slot == EntityEquipmentSlot.CHEST;

                armorModel.isSneak = defaultModel.isSneak;
                armorModel.isRiding = defaultModel.isRiding;
                armorModel.isChild = defaultModel.isChild;
                armorModel.rightArmPose = defaultModel.rightArmPose;
                armorModel.leftArmPose = defaultModel.leftArmPose;

                return armorModel;
            }
        }
        return null;
    }
}
