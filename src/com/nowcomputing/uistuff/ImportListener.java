package com.nowcomputing.uistuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ImportListener implements ActionListener {
	// $FF: synthetic field
	final D a;

	ImportListener(D var1) {
		this.a = var1;
	}

	public void actionPerformed(ActionEvent var1) {
		D.a(this.a).a(false);
		this.a.c.b();
	}
}
