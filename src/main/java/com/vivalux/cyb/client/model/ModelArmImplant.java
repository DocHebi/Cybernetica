// Date: 18/05/2014 11:56:57
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package com.vivalux.cyb.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelArmImplant extends ModelBiped
{
  
    ModelRenderer SideTop;
    ModelRenderer SideBottom;
    ModelRenderer FrontTop;
    ModelRenderer FrontBottom;
    ModelRenderer BackTop;
    ModelRenderer BackBottom;
    ModelRenderer Augment1;
    ModelRenderer Augment2;
    ModelRenderer Augment3;
    ModelRenderer Finger1;
    ModelRenderer Finger1Bottom;
    ModelRenderer Finger2;
    ModelRenderer Finger2Bottom;
    ModelRenderer Finger3;
    ModelRenderer Finger3Bottom;
    ModelRenderer Top;
    ModelRenderer LeftTop;
    ModelRenderer LeftBottom;
    ModelRenderer Augment4;
    ModelRenderer Bottom;
  
  public ModelArmImplant()
  {
    textureWidth = 64;
    textureHeight = 64;
    
    int yOffset = -2;
    int xOffset = 5;
    
    SideTop = new ModelRenderer(this, 11, 29);
      SideTop.addBox(-9F+xOffset, 0F+yOffset, -2F, 1, 4, 4);
      SideTop.setRotationPoint(0F, 0F, 0F);
      SideTop.setTextureSize(64, 32);
      SideTop.mirror = true;
      setRotation(SideTop, 0F, 0F, 0F);
      
      SideBottom = new ModelRenderer(this, 11, 44);
      SideBottom.addBox(-9F+xOffset, 8F+yOffset, -2F, 1, 4, 4);
      SideBottom.setRotationPoint(0F, 0F, 0F);
      SideBottom.setTextureSize(64, 32);
      SideBottom.mirror = true;
      setRotation(SideBottom, 0F, 0F, 0F);
      
      FrontTop = new ModelRenderer(this, 0, 12);
      FrontTop.addBox(-8F+xOffset, 0F+yOffset, -3F, 4, 4, 1);
      FrontTop.setRotationPoint(0F, 0F, 0F);
      FrontTop.setTextureSize(64, 32);
      FrontTop.mirror = true;
      setRotation(FrontTop, 0F, 0F, 0F);
      
      FrontBottom = new ModelRenderer(this, 0, 23);
      FrontBottom.addBox(-8F+xOffset, 8F+yOffset, -3F, 4, 4, 1);
      FrontBottom.setRotationPoint(0F, 0F, 0F);
      FrontBottom.setTextureSize(64, 32);
      FrontBottom.mirror = true;
      setRotation(FrontBottom, 0F, 0F, 0F);
      
      BackTop = new ModelRenderer(this, 11, 12);
      BackTop.addBox(-8F+xOffset, 0F+yOffset, 2F, 4, 4, 1);
      BackTop.setRotationPoint(0F, 0F, 0F);
      BackTop.setTextureSize(64, 32);
      BackTop.mirror = true;
      setRotation(BackTop, 0F, 0F, 0F);
      
      BackBottom = new ModelRenderer(this, 11, 23);
      BackBottom.addBox(-8F+xOffset, 8F+yOffset, 2F, 4, 4, 1);
      BackBottom.setRotationPoint(0F, 0F, 0F);
      BackBottom.setTextureSize(64, 32);
      BackBottom.mirror = true;
      setRotation(BackBottom, 0F, 0F, 0F);
      
      Augment1 = new ModelRenderer(this, 2, 17);
      Augment1.addBox(-7F+xOffset, 4F+yOffset, -3F, 2, 5, 1);
      Augment1.setRotationPoint(0F, 0F, 0F);
      Augment1.setTextureSize(64, 32);
      Augment1.mirror = true;
      setRotation(Augment1, 0F, 0F, 0F);
      
      Augment2 = new ModelRenderer(this, 13, 37);
      Augment2.addBox(-9F+xOffset, 4F+yOffset, -1F, 1, 5, 2);
      Augment2.setRotationPoint(0F, 0F, 0F);
      Augment2.setTextureSize(64, 32);
      Augment2.mirror = true;
      setRotation(Augment2, 0F, 0F, 0F);
      
      Augment3 = new ModelRenderer(this, 13, 17);
      Augment3.addBox(-7F+xOffset, 4F+yOffset, 2F, 2, 5, 1);
      Augment3.setRotationPoint(0F, 0F, 0F);
      Augment3.setTextureSize(64, 32);
      Augment3.mirror = true;
      setRotation(Augment3, 0F, 0F, 0F);
      
      Finger1 = new ModelRenderer(this, 27, 0);
      Finger1.addBox(-8F+xOffset, 12F+yOffset, -2F, 1, 1, 1);
      Finger1.setRotationPoint(0F, 0F, 0F);
      Finger1.setTextureSize(64, 32);
      Finger1.mirror = true;
      setRotation(Finger1, 0.0174533F, 0F, 0F);
      
      Finger1Bottom = new ModelRenderer(this, 27, 2);
      Finger1Bottom.addBox(-11F+xOffset, 10F+yOffset, -2F, 1, 3, 1);
      Finger1Bottom.setRotationPoint(0F, 0F, 0F);
      Finger1Bottom.setTextureSize(64, 32);
      Finger1Bottom.mirror = true;
      setRotation(Finger1Bottom, 0F, 0F, -0.2602503F);
      
      Finger2 = new ModelRenderer(this, 22, 0);
      Finger2.addBox(-8F+xOffset, 12F+yOffset, 1F, 1, 1, 1);
      Finger2.setRotationPoint(0F, 0F, 0F);
      Finger2.setTextureSize(64, 32);
      Finger2.mirror = true;
      setRotation(Finger2, 0.0174533F, 0F, 0F);
      
      Finger2Bottom = new ModelRenderer(this, 22, 2);
      Finger2Bottom.addBox(-11F+xOffset, 10F+yOffset, 1F, 1, 3, 1);
      Finger2Bottom.setRotationPoint(0F, 0F, 0F);
      Finger2Bottom.setTextureSize(64, 32);
      Finger2Bottom.mirror = true;
      setRotation(Finger2Bottom, 0F, 0F, -0.2602503F);
      
      Finger3 = new ModelRenderer(this, 17, 0);
      Finger3.addBox(-5F+xOffset, 12F+yOffset, -1F, 1, 1, 1);
      Finger3.setRotationPoint(0F, 0F, 0F);
      Finger3.setTextureSize(64, 32);
      Finger3.mirror = true;
      setRotation(Finger3, 0.0174533F, 0F, 0F);
      
      Finger3Bottom = new ModelRenderer(this, 17, 2);
      Finger3Bottom.addBox(-2F+xOffset, 12F+yOffset, -1F, 1, 3, 1);
      Finger3Bottom.setRotationPoint(0F, 0F, 0F);
      Finger3Bottom.setTextureSize(64, 32);
      Finger3Bottom.mirror = true;
      setRotation(Finger3Bottom, 0F, 0F, 0.2633485F);
      
      Top = new ModelRenderer(this, 0, 0);
      Top.addBox(-8F+xOffset, -1F+yOffset, -2F, 4, 1, 4);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      
      LeftTop = new ModelRenderer(this, 0, 29);
      LeftTop.addBox(-4F+xOffset, 0F+yOffset, -2F, 1, 4, 4);
      LeftTop.setRotationPoint(0F, 0F, 0F);
      LeftTop.setTextureSize(64, 32);
      LeftTop.mirror = true;
      setRotation(LeftTop, 0F, 0F, 0F);
      
      LeftBottom = new ModelRenderer(this, 0, 44);
      LeftBottom.addBox(-4F+xOffset, 8F+yOffset, -2F, 1, 4, 4);
      LeftBottom.setRotationPoint(0F, 0F, 0F);
      LeftBottom.setTextureSize(64, 32);
      LeftBottom.mirror = true;
      setRotation(LeftBottom, 0F, 0F, 0F);
      
      Augment4 = new ModelRenderer(this, 2, 37);
      Augment4.addBox(-4F+xOffset, 4F+yOffset, -1F, 1, 5, 2);
      Augment4.setRotationPoint(0F, 0F, 0F);
      Augment4.setTextureSize(64, 32);
      Augment4.mirror = true;
      setRotation(Augment4, 0F, 0F, 0F);
      
      Bottom = new ModelRenderer(this, 0, 6);
      Bottom.addBox(-8F+xOffset, 11F, -2F, 4, 1, 4);
      Bottom.setRotationPoint(0F, 0F, 0F);
      Bottom.setTextureSize(64, 32);
      Bottom.mirror = true;
      setRotation(Bottom, 0F, 0F, 0F);
      
      this.bipedRightArm.addChild(SideTop);
      this.bipedRightArm.addChild(SideBottom);
      this.bipedRightArm.addChild(FrontTop);
      this.bipedRightArm.addChild(FrontBottom);
      this.bipedRightArm.addChild(BackTop);
      this.bipedRightArm.addChild(BackBottom);
      this.bipedRightArm.addChild(Augment1);
      this.bipedRightArm.addChild(Augment2);
      this.bipedRightArm.addChild(Augment3);
      this.bipedRightArm.addChild(Finger1);
      this.bipedRightArm.addChild(Finger1Bottom);
      this.bipedRightArm.addChild(Finger2);
      this.bipedRightArm.addChild(Finger2Bottom);
      this.bipedRightArm.addChild(Finger3);
      this.bipedRightArm.addChild(Finger3Bottom);
      this.bipedRightArm.addChild(Top);
      this.bipedRightArm.addChild(LeftTop);
      this.bipedRightArm.addChild(LeftBottom);
      this.bipedRightArm.addChild(Augment4);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
   /* 
    SideTop.render(f5);
    SideBottom.render(f5);
    FrontTop.render(f5);
    FrontBottom.render(f5);
    BackTop.render(f5);
    BackBottom.render(f5);
    Augment1.render(f5);
    Augment2.render(f5);
    Augment3.render(f5);
    Finger3.render(f5);
    Finger3Bottom.render(f5);
    Finger2.render(f5);
    Finger2Bottom.render(f5);
    Finger3.render(f5);
    Finger3Bottom.render(f5);
    Top.render(f5);
    LeftTop.render(f5);
    LeftBottom.render(f5);
    Augment4.render(f5);
    Bottom.render(f5);
    */
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}