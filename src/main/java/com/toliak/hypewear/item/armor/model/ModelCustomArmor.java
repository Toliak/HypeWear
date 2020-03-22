package com.toliak.hypewear.item.armor.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCustomArmor extends ModelBiped {

    public ModelRenderer leftArmCube;
    public ModelRenderer bodyCube;
    public ModelRenderer rightArmCube;

    public ModelCustomArmor(float scale) {
        super(scale, 0, 64, 64);

        this.textureWidth = 64;
        this.textureHeight = 64;

        this.leftArmCube = new ModelRenderer(this, 40, 48);
        this.leftArmCube.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArmCube.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.1F);
        this.rightArmCube = new ModelRenderer(this, 0, 48);
        this.rightArmCube.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArmCube.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.1F);
        this.bodyCube = new ModelRenderer(this, 16, 48);
        this.bodyCube.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyCube.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.1F);

        this.bipedBody.addChild(bodyCube);
        this.bipedLeftArm.addChild(leftArmCube);
        this.bipedRightArm.addChild(rightArmCube);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
}

