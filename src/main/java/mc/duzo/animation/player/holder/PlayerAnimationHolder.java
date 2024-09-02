package mc.duzo.animation.player.holder;

import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.PlayerEntityModel;

import mc.duzo.animation.generic.AnimationHolder;
import mc.duzo.animation.generic.AnimationInfo;
import mc.duzo.animation.player.PlayerAnimationHelper;

public class PlayerAnimationHolder extends AnimationHolder {

    public PlayerAnimationHolder(Animation anim, AnimationInfo info) {
        super(anim, info);
    }
    public PlayerAnimationHolder(Animation anim) {
        super(anim);
    }

    @Override
    public void update(EntityModel<?> model, float progress, AbstractClientPlayerEntity player) {
        PlayerAnimationHelper.updateAnimation(this.state, this.animation, progress, 1.0f, (PlayerEntityModel<?>) model);

        super.update(model, progress, player);
    }

}
