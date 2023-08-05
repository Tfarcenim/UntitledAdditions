package tfar.untitledadditions.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import tfar.untitledadditions.datagen.data.ModRecipeProvider;

public class ModDatagen {

    public static void gatherData(GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        boolean server = e.includeServer();
        generator.addProvider(server,new ModRecipeProvider(packOutput));
    }
}
