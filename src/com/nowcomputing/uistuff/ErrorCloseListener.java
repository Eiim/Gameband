package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ErrorCloseListener implements ActionListener {
	// $FF: synthetic field
	final ErrorPanel a;

	ErrorCloseListener(ErrorPanel var1) {
		this.a = var1;
	}

	public void actionPerformed(ActionEvent var1) {
		this.a.dispose();
	}
}
