package net.seraxx.hypernovamod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.seraxx.hypernovamod.HypernovaMod;
import net.seraxx.hypernovamod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HypernovaMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HYPERNOVA_TAB = CREATIVE_MODE_TABS.register("hypernova_tab",
            () ->CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AETHERSALMON.get()))
                    .title(Component.translatable("creativetab.hypernova_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AETHERSALMON.get());
                        output.accept(ModItems.AETHERHALO.get());
                        output.accept(ModItems.AETHEROFFERING.get());
                        output.accept(ModItems.BIGSAUSAGE.get());
                        output.accept(ModItems.COKE.get());
                        output.accept(ModItems.ENDERCREDITCARD.get());
                        output.accept(ModItems.ENDERSALMON.get());
                        output.accept(ModItems.EVILBIGSAUSAGE.get());
                        output.accept(ModItems.EXPERIENCESALMON.get());
                        output.accept(ModItems.GAYBAT.get());
                        output.accept(ModItems.MEAGHANMEAL.get());
                        output.accept(ModItems.SKUNK.get());
                        output.accept(ModItems.SPONGEBOBBOWL.get());
                        output.accept(ModItems.TWILIGHTSALMON.get());
                        output.accept(ModItems.TWILIGHTSPARKLE.get());
                        output.accept(ModItems.WARPEDSALMON.get());
                        output.accept(ModItems.ALIEN_SPAWN_EGG.get());
                        output.accept(ModItems.REFINED_COPPER_INGOT.get());

                        output.accept(ModBlocks.REFINED_COPPER_BLOCK.get());
                        output.accept(ModBlocks.CUT_REFINED_COPPER_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
