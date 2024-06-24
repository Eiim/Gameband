package com.nowcomputing.uistuff;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class PopupCloseListener extends WindowAdapter {
   // $FF: synthetic field
   final GamebandPopup a;

   PopupCloseListener(GamebandPopup var1) {
      this.a = var1;
   }

   public void windowClosing(WindowEvent var1) {
      this.a.a(-1);
   }
}
