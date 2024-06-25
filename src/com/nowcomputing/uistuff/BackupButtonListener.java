package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackupButtonListener implements ActionListener {
   // $FF: synthetic field
   final BackupPanel a;

   BackupButtonListener(BackupPanel var1) {
      this.a = var1;
   }

   public void actionPerformed(ActionEvent var1) {
      BackupPanel.a(this.a, var1);
   }
}
