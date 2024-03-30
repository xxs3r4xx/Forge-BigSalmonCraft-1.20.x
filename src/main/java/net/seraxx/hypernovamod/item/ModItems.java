package net.seraxx.hypernovamod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.entity.custom.ModEntities;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HypernovaMod.MOD_ID);

    public static final RegistryObject<Item> AETHERHALO = ITEMS.register("aetherhalo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AETHERSALMON = ITEMS.register("aethersalmon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AETHEROFFERING = ITEMS.register("aetheroffering",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIGSAUSAGE = ITEMS.register("bigsausage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COKE = ITEMS.register("coke",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERCREDITCARD = ITEMS.register("endercreditcard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EXPERIENCESALMON = ITEMS.register("experiencesalmon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENDERSALMON = ITEMS.register("endersalmon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GAYBAT = ITEMS.register("gaybat",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EVILBIGSAUSAGE = ITEMS.register("evilbigsausage",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MEAGHANMEAL = ITEMS.register("meaghanmeal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKUNK = ITEMS.register("skunk",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SPONGEBOBBOWL = ITEMS.register("spongebobbowl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHTSALMON = ITEMS.register("twilightsalmon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TWILIGHTSPARKLE = ITEMS.register("twilightsparkle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WARPEDSALMON = ITEMS.register("warpedsalmon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALIEN_SPAWN_EGG = ITEMS.register("alienmerchantspawnegg",
            () -> new ForgeSpawnEggItem(ModEntities.ALIENMERCHANTENTITY, 636363, 636363,
                    new Item.Properties()));
    public static final RegistryObject<Item> REFINED_COPPER_INGOT = ITEMS.register("refinedcopperingot",
            () -> new Item((new Item.Properties())));





    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
