package com.nowcomputing.b.a;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class e implements ChangeListener {
   // $FF: synthetic field
   final CustomDialog a;

   e(CustomDialog var1) {
      this.a = var1;
   }

   @Override
public void stateChanged(ChangeEvent var1) {
      JSpinner var2 = (JSpinner)var1.getSource();
      CustomDialog.a(this.a).removeFrame((Integer)var2.getValue());
      CustomDialog.b(this.a).setMaximum(CustomDialog.a(this.a).getFrameCount() - 1);
      CustomDialog.c(this.a).o().setEnabled(CustomDialog.a(this.a).getFrameCount() > 1);
      CustomDialog.c(this.a).n().setEnabled(CustomDialog.a(this.a).getFrameCount() < 50);
      CustomDialog.c(this.a).q().setEnabled(CustomDialog.a(this.a).getFrameCount() < 50);
   }
}
