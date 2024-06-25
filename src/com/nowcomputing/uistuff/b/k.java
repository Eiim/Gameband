package com.nowcomputing.uistuff.b;

import com.nowcomputing.AnimatedImage;
import com.nowcomputing.a.ImagePlayer;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.RawAnimation;
import com.nowcomputing.uistuff.apackage.t;

public class k extends e {
   private RawAnimation a;
   private ImagePlayer g;

   public k(t var1, String var2, RawAnimation var3) {
      super(var1, var2);
      this.a = var3;
      this.g = new ImagePlayer();
      var3.a(this.g);
      this.f();
   }

   @Override
public Animation b() {
      return this.a;
   }

   @Override
public void a(AnimatedImage var1) {
      this.g.a(var1);
   }

   @Override
public AnimatedImage c() {
      return this.g.h();
   }
}
