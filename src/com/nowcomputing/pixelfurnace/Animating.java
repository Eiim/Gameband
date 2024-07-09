package com.nowcomputing.pixelfurnace;

class Animating implements Runnable {
   // $FF: synthetic field
   final Animation animation;

   Animating(Animation animation) {
      this.animation = animation;
   }

   @Override
public void run() {
      animation.Animating.startTimer();
   }
}
