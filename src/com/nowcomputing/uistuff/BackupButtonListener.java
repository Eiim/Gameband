package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackupButtonListener implements ActionListener {
   // $FF: synthetic field
   final b a;

   BackupButtonListener(b var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      b.a(this.a, var1);
   }
}
