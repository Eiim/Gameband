package com.nowcomputing.uistuff;

class UnknownThread extends Thread {
	// $FF: synthetic field
	final MainMenu a;

	UnknownThread(MainMenu var1) {
		this.a = var1;
	}

	public void run() {
		MainMenu.g(this.a);
	}
}
