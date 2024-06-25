package com.nowcomputing.b.a;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class i implements ChangeListener {
   // $FF: synthetic field
   final CustomDialog a;

   i(CustomDialog var1) {
      this.a = var1;
   }

   @Override
public void stateChanged(ChangeEvent var1) {
      JSlider var2 = (JSlider)var1.getSource();
      CustomDialog.a(this.a, var2.getValue());
      this.a.z();
      this.a.a(CustomDialog.d(this.a));
   }
}
