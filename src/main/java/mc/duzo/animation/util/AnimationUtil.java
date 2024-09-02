package mc.duzo.animation.util;

import net.minecraft.client.network.AbstractClientPlayerEntity;

import mc.duzo.animation.generic.AnimationHolder;
import mc.duzo.animation.generic.AnimationInfo;
import mc.duzo.animation.generic.AnimationTracker;
import mc.duzo.animation.registry.client.TrackerRegistry;


public class AnimationUtil {
    public static AnimationInfo getInfo(AbstractClientPlayerEntity player) {
        for (AnimationTracker tracker : TrackerRegistry.REGISTRY) {
            AnimationHolder holder = tracker.get(player);
            if (holder == null) continue;

            return holder.getInfo();
        }

        return null;
    }

    public static boolean isRunningAnimations(AbstractClientPlayerEntity player) {
        return getInfo(player) != null;
    }
}
