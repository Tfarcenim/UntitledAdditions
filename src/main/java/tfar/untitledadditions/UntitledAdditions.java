package tfar.untitledadditions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UntitledAdditions.MODID)
public class UntitledAdditions {
    public static final String MODID = "untitledadditions";
    // Directly reference a slf4j logger

    public UntitledAdditions() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
