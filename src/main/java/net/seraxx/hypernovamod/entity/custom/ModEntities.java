package net.seraxx.hypernovamod.entity.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.seraxx.hypernovamod.HypernovaMod;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HypernovaMod.MOD_ID);

    public static final RegistryObject<EntityType<AlienMerchantEntity>> ALIENMERCHANTENTITY =
            ENTITY_TYPES.register("alienmerchant",
                    () -> EntityType.Builder.of(AlienMerchantEntity::new, MobCategory.CREATURE)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(HypernovaMod.MOD_ID, "alienmerchant").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
