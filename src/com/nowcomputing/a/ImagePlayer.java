package com.nowcomputing.a;

import java.io.File;

import com.nowcomputing.AnimatedImage;
import com.nowcomputing.Image;

public class ImagePlayer extends Transition { // My guess is as good as yours buddy
   private AnimatedImage animatedImage;
   private int e;

   @Override
protected void disable() {
      super.disable();
      this.e = 0;
   }

   @Override
public void startTimer() {
      if (this.animatedImage != null && this.animatedImage.getFrameCount() > 0) {
         super.startTimer();
      }

   }

   @Override
public boolean isEmpty() {
      return this.e < this.animatedImage.getFrameCount();
   }

   @Override
public Image e() {
      Image var1 = null;
      if (this.e == this.animatedImage.getFrameCount()) {
         this.setBool(true);
      } else {
         var1 = this.animatedImage.getFrame(this.e++);
      }

      return var1;
   }

   public void a(File var1) {
      this.a(AnimatedImage.LoadFromFile(var1));
   }

   public void a(AnimatedImage var1) {
      this.animatedImage = var1;
      if (this.animatedImage.getFrameCount() > 0) {
         this.a(this.animatedImage.getInt());
      }

      this.e = 0;
   }

   public AnimatedImage h() {
      return this.animatedImage;
   }
}
