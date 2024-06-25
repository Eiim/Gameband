package com.nowcomputing.uistuff;

class ad implements Runnable {
   // $FF: synthetic field
   final a.AbstractMinecraftLauncher a;
   // $FF: synthetic field
   final ac b;

   ad(ac var1, a.AbstractMinecraftLauncher var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
public void run() {
      this.b.a.a(this.a);
   }
}
