package mc.duzo.animation.client;

import net.fabricmc.api.ClientModInitializer;

import mc.duzo.animation.registry.client.TrackerRegistry;

public class DuzoAnimationClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TrackerRegistry.init();
    }
}
