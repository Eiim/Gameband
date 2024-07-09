package com.nowcomputing.uistuff;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class GamebandDialogListener extends WindowAdapter {
	// $FF: synthetic field
	final GamebandDialog a;

	GamebandDialogListener(GamebandDialog var1) {
		this.a = var1;
	}

	public void windowClosing(WindowEvent var1) {
		this.a.ok();
	}
}
