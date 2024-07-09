package com.nowcomputing.uistuff;

import com.nowcomputing.LocaleUtil;
import com.nowcomputing.ResetAction;

public abstract class at extends ImagePanel implements ResetAction {
	protected ar c;

	protected at(String var1) {
		this.setName(var1);
		LocaleUtil.a((ResetAction) this);
	}

	public void a(ar var1) {
		this.c = var1;
	}

	public void e() {
	}

	public boolean b() {
		return true;
	}

	public void reset() {
		this.removeAll();
		this.a();
	}

	protected abstract void a();
}
