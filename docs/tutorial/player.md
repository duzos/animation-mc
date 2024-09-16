---
title: Player Animations
---

# Playing animations on a Player

## Blockbench
You will need to create a custom animation on [this player model](https://github.com/Duzos/animation-mc/blob/master/src/main/java/mc/duzo/animation/player/PlayerModel.bbmodel) and export it to yarn mappings

![exporting from blockbench](img/export.png)

Store this exported animation in a class, for example `ModPlayerAnimations`

## Registering

In your `ModPlayerAnimations` class create a `public static void` method called `init` and leave its body empty.

Call this `init` method in the client initializer (onInitializeClient)

Now, create a static variable similar to this one 

```
public static final Supplier<PlayerAnimationHolder> MY_ANIMATION = AnimationRegistry.instance().register(() -> new PlayerAnimationHolder(new Identifier(MyMod.MOD_ID, "my_animation"), ModPlayerAnimations.MY_ANIMATION_KEYFRAMES));
```

This registers the animation to the mod and it can now be used.

AnimationInfo can be passed into the constructor to modify the animation.

## Using the animation

Now that the animation has been registered we can use it.

When you want the animation to play, call:

```
DuzoAnimationMod.play(player, TrackerRegistry.PLAYER, MY_ANIMATION.get());
```

and it should play!