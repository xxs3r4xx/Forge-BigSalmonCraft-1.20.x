package net.seraxx.hypernovamod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.entity.custom.AlienMerchantEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.DataTicket;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class AlienModel extends GeoModel<AlienMerchantEntity> {
    @Override
    public ResourceLocation getModelResource(AlienMerchantEntity animatable) {
        return new ResourceLocation(HypernovaMod.MOD_ID, "geo/alienmerchant.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(AlienMerchantEntity animatable) {
        return new ResourceLocation(HypernovaMod.MOD_ID, "textures/entity/grey_alien.png");
    }

    @Override
    public ResourceLocation getAnimationResource(AlienMerchantEntity animatable) {
        return new ResourceLocation(HypernovaMod.MOD_ID, "animations/alienmerchant.animation.json");
    }

    @Override
    public void setCustomAnimations(AlienMerchantEntity animatable, long instanceId, AnimationState<AlienMerchantEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);


        }
    }
}
