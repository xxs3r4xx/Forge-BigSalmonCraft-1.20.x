package net.seraxx.hypernovamod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.seraxx.hypernovamod.block.ModBlocks;
import net.seraxx.hypernovamod.entity.client.AlienRenderer;
import net.seraxx.hypernovamod.entity.custom.ModEntities;
import net.seraxx.hypernovamod.item.ModCreativeModeTabs;
import net.seraxx.hypernovamod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HypernovaMod.MOD_ID)
public class HypernovaMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "hypernovamod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public HypernovaMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);


    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {}

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.AETHERHALO);
            event.accept(ModItems.AETHERSALMON);
            event.accept(ModItems.AETHEROFFERING);
            event.accept(ModItems.BIGSAUSAGE);
            event.accept(ModItems.COKE);
            event.accept(ModItems.ENDERCREDITCARD);
            event.accept(ModItems.ENDERSALMON);
            event.accept(ModItems.EVILBIGSAUSAGE);
            event.accept(ModItems.EXPERIENCESALMON);
            event.accept(ModItems.GAYBAT);
            event.accept(ModItems.MEAGHANMEAL);
            event.accept(ModItems.SKUNK);
            event.accept(ModItems.SPONGEBOBBOWL);
            event.accept(ModItems.TWILIGHTSALMON);
            event.accept(ModItems.TWILIGHTSPARKLE);
            event.accept(ModItems.WARPEDSALMON);
            event.accept(ModBlocks.CUT_REFINED_COPPER_BLOCK);
            event.accept(ModBlocks.REFINED_COPPER_BLOCK);


        }
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){
            EntityRenderers.register(ModEntities.ALIENMERCHANTENTITY.get(), AlienRenderer::new);



        }



    }
}
