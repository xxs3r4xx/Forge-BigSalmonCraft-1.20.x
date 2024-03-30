package net.seraxx.hypernovamod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.resources.ResourceLocation;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.entity.custom.AlienMerchantEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class AlienRenderer extends GeoEntityRenderer<AlienMerchantEntity> {
    public AlienRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AlienModel());
    }

    @Override
    public ResourceLocation getTextureLocation(AlienMerchantEntity animatable) {
        return new ResourceLocation(HypernovaMod.MOD_ID,"textures/entity/grey_alien.png");
    }

    @Override
    public void render(AlienMerchantEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.2f,0.2f,0.2f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);

    }
}
