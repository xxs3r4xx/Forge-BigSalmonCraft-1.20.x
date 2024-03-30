package net.seraxx.hypernovamod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.entity.custom.AlienMerchantEntity;
import net.seraxx.hypernovamod.entity.custom.ModEntities;

@Mod.EventBusSubscriber(modid = HypernovaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ALIENMERCHANTENTITY.get(), AlienMerchantEntity.setAttributes());
    }


}
