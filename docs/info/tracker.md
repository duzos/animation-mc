---
title: Animation Tracker
---

# Animation Tracker

## What is this?
The animation tracker is used to track and update animations associated with a player.

## Usage
To create a custom AnimationTracker, simply extend the AnimationTracker class and pass in your custom AnimationHolder to the type.

Ensure the AnimationTracker is registered in the TrackerRegistry by calling `.register()` on the tracker.

## Examples
This mod by default comes with a PlayerAnimationTracker, and in most circumstances this is all you will need.

For further examples, view [Timeless Heroes](https://github.com/Duzos/superhero/blob/master/src/main/java/mc/duzo/timeless/suit/client/animation/SuitAnimationTracker.java) implementation with custom superhero suits.

