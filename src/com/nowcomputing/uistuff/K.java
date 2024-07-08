package com.nowcomputing.uistuff;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;

import com.nowcomputing.pixelfurnace.GBComms;

class k implements ActionListener {
   // $FF: synthetic field
   final i a;

   k(i var1) {
      this.a = var1;
   }

   @Override
public void actionPerformed(ActionEvent var1) {
      this.a.setCursor(Cursor.getPredefinedCursor(3));

      try {
         GBComms var2 = new GBComms();
         var2.ReadData();
         var2.i();
         var2.j();
         var2.setOrientation(i.a(this.a));
         var2.setGamebandTimezone();
         var2.setGamebandTime();
      } catch (Throwable var6) {
         i.d().log(Level.WARNING, "Error configuring Gameband", var6);
         var6.printStackTrace();
      } finally {
         this.a.setCursor(Cursor.getDefaultCursor());
      }

      this.a.c.b();
   }
}
