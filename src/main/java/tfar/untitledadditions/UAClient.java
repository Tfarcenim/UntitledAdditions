package tfar.untitledadditions;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.EnchantmentScreen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.ScreenEvent;
import tfar.untitledadditions.network.server.C2SButtonPacket;

public class UAClient {

    public static void guiOpen(ScreenEvent.Init.Post e) {
        Screen screen = e.getScreen();
        if (screen instanceof EnchantmentScreen enchantmentScreen) {
            e.addListener(Button.builder(Component.literal("R"),pButton -> C2SButtonPacket.send())
                    .pos(enchantmentScreen.getGuiLeft()+5,enchantmentScreen.getGuiTop()+20).size(14,14).build());
        }
    }
}
