package mc.duzo.animation.generic;

import java.util.HashMap;
import java.util.UUID;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.util.Identifier;

import mc.duzo.animation.registry.Identifiable;
import mc.duzo.animation.registry.client.TrackerRegistry;

public abstract class AnimationTracker<T extends AnimationHolder> implements Identifiable {
    private final Identifier id;
    protected final HashMap<UUID, T> animations = new HashMap<>();

    protected AnimationTracker(Identifier id) {
        this.id = id;
    }
    @Override
    public Identifier id() {
        return id;
    }

    public T get(AbstractClientPlayerEntity entity) {
        UUID uuid = entity.getUuid();

        T anim = animations.get(uuid);

        if (anim != null && anim.isFinished(entity)) {
            clear(uuid);
            return null;
        }

        return anim;
    }
    public void add(UUID uuid, T animation) {
        animations.put(uuid, animation);
    }
    public void clear(UUID uuid) {
        animations.remove(uuid);
    }

    public AnimationTracker<T> register() {
        return TrackerRegistry.register(this);
    }
}
