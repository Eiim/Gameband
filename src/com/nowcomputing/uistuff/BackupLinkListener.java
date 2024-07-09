package com.nowcomputing.uistuff;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

class BackupLinkListener implements HyperlinkListener {
	// $FF: synthetic field
	final BackupPanel a;

	BackupLinkListener(BackupPanel var1) {
		this.a = var1;
	}

	@Override
	public void hyperlinkUpdate(HyperlinkEvent var1) {
		if (var1.getEventType() == EventType.ACTIVATED) {
			try {
				this.a(var1.getURL().toURI());
			} catch (Exception var3) {
			}
		}

	}

	private void a(URI var1) throws IOException {
		Desktop var2 = Desktop.getDesktop();
		var2.browse(var1);
	}
}
