package tfar.untitledadditions;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tfar.untitledadditions.datagen.ModDatagen;
import tfar.untitledadditions.network.PacketHandler;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UntitledAdditions.MODID)
public class UntitledAdditions {
    public static final String MODID = "untitledadditions";
    // Directly reference a slf4j logger

    public UntitledAdditions() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupClient);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModDatagen::gatherData);
    }

    private void setup(final FMLCommonSetupEvent event) {
        PacketHandler.registerMessages();
    }

    private void setupClient(final FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(UAClient::guiOpen);
    }
}
