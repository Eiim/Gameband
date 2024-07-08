package com.nowcomputing.uistuff;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.concurrent.CountDownLatch;

import javax.swing.JFrame;

import com.codeminders.hidapi2.ClassPathLibraryLoader;
import com.nowcomputing.PathUtils;

public class ai extends JFrame implements as {
   private CountDownLatch b = new CountDownLatch(1);
   protected boolean a;
   private aq c;

   public ai() {
      ClassPathLibraryLoader.loadNativeHIDLibrary(PathUtils.getLibPath());
      this.c = new aq();
      this.getContentPane().add(this.c);
      this.c.a(this);
      this.c.a((new ao()));
      this.c.a((new f()));
      this.c.a((new i()));
      G var1 = new G();
      if (var1.a()) {
         this.c.a((new D(var1)));
      }

      this.c.a((new DisclaimerPanel()));
      this.c.a((new o()));
      this.c.b(new ag());
      this.c.b();
      this.setDefaultCloseOperation(0);
      this.setResizable(false);
      this.pack();
      Insets var2 = this.getInsets();
      Dimension var3 = new Dimension(800 + var2.left + var2.right, 600 + var2.top + var2.bottom);
      this.setMinimumSize(var3);
      this.setMaximumSize(var3);
      this.setLocationRelativeTo((Component)null);
      this.addWindowListener(new aj(this));
   }

   public void a() {
      try {
         this.b.await();
      } catch (InterruptedException var2) {
      }

   }

   private void b() {
      this.b.countDown();
      this.dispose();
   }

   @Override
public void a(at var1) {
      this.a = true;
      this.b();
   }

   @Override
public void b(at var1) {
      this.b();
   }

   // $FF: synthetic method
   static aq a(ai var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void b(ai var0) {
      var0.b();
   }
}
