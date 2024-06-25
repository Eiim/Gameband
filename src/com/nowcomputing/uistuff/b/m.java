package com.nowcomputing.uistuff.b;

import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.a.duality;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.ImageAnimation;
import com.nowcomputing.uistuff.apackage.t;

public class m extends e {
   private ImageAnimation a;
   private com.nowcomputing.a.g g;

   public m(t var1, ImageAnimation var2, boolean var3) {
      super(var1, LocaleUtil.getLocalizedString("ANIMATION"));
      this.a = var2;
      this.g = new com.nowcomputing.a.g();
      this.a.a(this.g);
      this.a(com.nowcomputing.e.Transition.none);
      this.a.h().b(new Image(20, 7));
      this.a.i().b(new Image(20, 7));
      this.g.a(var2.b(), duality.a, 0, 20);
      this.f();
   }

   public Animation b() {
      return this.a;
   }
}
