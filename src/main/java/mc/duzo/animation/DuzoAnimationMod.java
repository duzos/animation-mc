package mc.duzo.animation;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.server.network.ServerPlayerEntity;

import mc.duzo.animation.generic.AnimationHolder;
import mc.duzo.animation.generic.AnimationTracker;
import mc.duzo.animation.network.Network;
import mc.duzo.animation.network.PlayAnimationS2CPacket;

public class DuzoAnimationMod implements ModInitializer {
    public static final String MOD_ID = "animation";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("thank you for using duzos animator!");
    }

    // todo - move to better place
    public static void play(ServerPlayerEntity target, AnimationTracker tracker, AnimationHolder animation) {
        Network.toTracking(new PlayAnimationS2CPacket(target, tracker, animation), target);
    }
}