---
title: Animation Info
---

# Animation Info

## What is this?

This is information for an animation to read and apply to the player while its running.

It can be passed into the constructor of an AnimationHolder

## Modifiers

Currently, this info modifies 4 parts:

### RenderType
- Defines which parts of the player should be rendered.

### Perspective
- The camera perspective the player should be forced into, eg third person front

### Movement
- Whether the player is allowed to move while this animation runs

### Transform
- Whether to reset the entire model or just the targeted parts

**Any of these modifiers can be null if they are not needed.**