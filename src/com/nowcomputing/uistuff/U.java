package com.nowcomputing.uistuff;

import java.util.logging.Level;

import com.nowcomputing.Main;

class u implements Runnable {
   // $FF: synthetic field
   final MainMenu a;

   u(MainMenu var1) {
      this.a = var1;
   }

   @Override
public void run() {
      try {
         synchronized(this.a) {
            if (!MainMenu.d(this.a)) {
               Main.a();
               MainMenu.a(this.a, true);
            }
            // TODO
            //MainMenu.e(this.a).g(); // MainMenu.e(MainMenu a) is apparently supposed to return a type of GBComms
         }
      } catch (Throwable var4) {
         MainMenu.g().log(Level.FINE, "Error writing to Gameband", var4);
      }

   }
}
