package com.nowcomputing.uistuff;

import com.nowcomputing.Utils;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class G {
   static final Logger a = Logger.getLogger(Utils.class.getName());
   private File b = b();
   private boolean c;

   public G() {
      a.log(Level.FINE, "Local Minecraft dir = " + this.b);
   }

   public boolean a() {
      return this.c() && (new File(this.b, "saves")).exists();
   }

   public void a(boolean var1) {
      this.c = var1;
   }

   private boolean c() {
      return this.b != null && this.b.exists() && this.b.isDirectory();
   }

   public static File b() {
    String str2;
    String str3;
    String str1 = System.getProperty("user.home", ".");
    switch (H.a[S.b().ordinal()]) {
      case 1:
        return new File(str1, ".minecraft/");
      case 2:
        str2 = System.getenv("APPDATA");
        str3 = (str2 != null) ? str2 : str1;
        return new File(str3, ".minecraft");
      case 3:
        return new File(str1, "Library/Application Support/minecraft");
    } 
    return null;
   }
}
