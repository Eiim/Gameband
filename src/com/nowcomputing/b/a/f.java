package com.nowcomputing.b.a;

import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class f implements ChangeListener {
	// $FF: synthetic field
	final CustomDialog a;

	f(CustomDialog var1) {
		this.a = var1;
	}

	@Override
	public void stateChanged(ChangeEvent var1) {
		JSpinner var2 = (JSpinner) var1.getSource();
		CustomDialog.a(this.a).setInt((Integer) var2.getValue());
	}
}
