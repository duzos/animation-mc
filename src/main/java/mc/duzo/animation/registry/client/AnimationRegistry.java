package mc.duzo.animation.registry.client;

import java.util.function.Supplier;

import net.fabricmc.fabric.api.event.registry.FabricRegistryBuilder;

import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;

import mc.duzo.animation.DuzoAnimationMod;
import mc.duzo.animation.generic.AnimationHolder;

public class AnimationRegistry {
    public static final SimpleRegistry<Supplier<AnimationHolder>> REGISTRY = FabricRegistryBuilder.createSimple(RegistryKey.<Supplier<AnimationHolder>>ofRegistry(new Identifier(DuzoAnimationMod.MOD_ID, "animations"))).buildAndRegister();

    public static <T extends Supplier<AnimationHolder>> T register(T entry) {
        return Registry.register(REGISTRY, entry.get().id(), entry);
    }

    public static void init() { }
}
