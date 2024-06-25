package com.nowcomputing;

import java.io.IOException;
import java.util.concurrent.Callable;

class y implements Callable {
   // $FF: synthetic field
   final UpdateThread a;

   y(UpdateThread var1) {
      this.a = var1;
   }

   public Void a() throws IOException {
      if (MinecraftDownloader.a(this.a.a)) {
         return null;
      } else {
         MinecraftDownloader.a(this.a.a, 0L);
         MinecraftDownloader.b(this.a.a, 0L);
         this.a.a.d();
         return null;
      }
   }

   // $FF: synthetic method
   @Override
public Object call() throws IOException {
      return this.a();
   }
}
