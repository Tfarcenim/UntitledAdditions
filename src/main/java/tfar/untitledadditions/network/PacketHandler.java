package tfar.untitledadditions.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import tfar.untitledadditions.UntitledAdditions;
import tfar.untitledadditions.network.server.C2SButtonPacket;

public class PacketHandler {

    public static SimpleChannel INSTANCE;

    public static void registerMessages() {

        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(UntitledAdditions.MODID, UntitledAdditions.MODID), () -> "1.0", s -> true, s -> true);

        int i = 0;

        INSTANCE.registerMessage(i++,
                C2SButtonPacket.class,
                C2SButtonPacket::encode,
                C2SButtonPacket::new,
                C2SButtonPacket::handle);
    }

    public static <MSG> void sendToClient(MSG packet, ServerPlayer player) {
        INSTANCE.sendTo(packet, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }

    public static <MSG> void sendToServer(MSG packet) {
        INSTANCE.sendToServer(packet);
    }
}
