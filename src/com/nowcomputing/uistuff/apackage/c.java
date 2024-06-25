package com.nowcomputing.uistuff.apackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import com.nowcomputing.e.Transition;

class c implements ActionListener {
   // $FF: synthetic field
   final p a;
   // $FF: synthetic field
   final a b;

   c(a var1, p var2) {
      this.b = var1;
      this.a = var2;
   }

   @Override
public void actionPerformed(ActionEvent var1) {
      JComboBox var2 = (JComboBox)var1.getSource();
      Transition var3 = (Transition)var2.getSelectedItem();
      this.a.e();
      this.a.g().a(var3);
      this.a.d(true);
      if (this.a.d().isVisible()) {
         this.a.f();
      }

   }
}
