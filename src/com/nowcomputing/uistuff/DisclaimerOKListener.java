package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DisclaimerOKListener implements ActionListener {
	// $FF: synthetic field
	final DisclaimerPanel a;

	DisclaimerOKListener(DisclaimerPanel var1) {
		this.a = var1;
	}

	public void actionPerformed(ActionEvent var1) {
		this.a.c.b();
	}
}
