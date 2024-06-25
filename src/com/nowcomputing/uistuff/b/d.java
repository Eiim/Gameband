package com.nowcomputing.uistuff.b;

import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.a.duality;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.FreeSpaceAnimation;
import com.nowcomputing.uistuff.apackage.t;

public class d extends e {
   private FreeSpaceAnimation a;
   private com.nowcomputing.a.g g;

   public d(t var1, FreeSpaceAnimation var2) {
      super(var1, LocaleUtil.getLocalizedString("FREE_SPACE"));
      this.a = var2;
      this.h();
      this.g = new com.nowcomputing.a.g();
      var2.a(this.g);
   }

   @Override
public Animation b() {
      return this.a;
   }

   @Override
public void d() {
      String var1 = this.a.b();
      this.a(this.e.d().c());
      Image var2 = Image.FromFile(var1);
      this.a.h().b(var2);
      Image var3 = new Image(20, 7);
      var3.gentlyCoerceImageIntoHole(var2, var2.getWidth() - 20, 0, 20, 7, 0, 0);
      this.a.i().a(var3);
      this.a.i().b(new Image(20, 7));
      this.g.a(var1, duality.b, 1000, 20, true);
      super.d();
   }
}
