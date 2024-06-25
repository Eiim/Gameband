package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

class J extends AbstractAction {
   // $FF: synthetic field
   final ErrorPanel a;

   J(ErrorPanel var1) {
      this.a = var1;
   }

   @Override
public void actionPerformed(ActionEvent var1) {
      this.a.dispose();
   }
}
