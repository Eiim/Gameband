package com.nowcomputing.uistuff.b;

import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.a.Direction;
import com.nowcomputing.e.Transition;
import com.nowcomputing.pixelfurnace.RawAnimation;
import com.nowcomputing.uistuff.apackage.t;

public class j extends k {
	public j(t var1, RawAnimation var2, Image var3, Direction var4, boolean var5) {
		super(var1, LocaleUtil.getLocalizedString("ANIMATION"), var2);
		com.nowcomputing.a.e var6 = new com.nowcomputing.a.e(var4, var5);
		var6.a(var3);
		this.a(var6.i());
	}

	@Override
	public void a(Transition var1) {
	}
}
