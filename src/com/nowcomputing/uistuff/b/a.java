package com.nowcomputing.uistuff.b;

import java.io.File;

import com.nowcomputing.AnimatedImage;
import com.nowcomputing.Image;
import com.nowcomputing.LocaleUtil;
import com.nowcomputing.a.ImagePlayer;
import com.nowcomputing.e.Transition;
import com.nowcomputing.pixelfurnace.Animation;
import com.nowcomputing.pixelfurnace.RawAnimation;
import com.nowcomputing.uistuff.apackage.t;

public class a extends e {
	private RawAnimation a;
	private ImagePlayer g;

	public a(t var1, RawAnimation var2) {
		super(var1, LocaleUtil.getLocalizedString("ANIMATION"));
		this.a = var2;
		this.g = new ImagePlayer();
		var2.a(this.g);
		this.b().b(com.nowcomputing.e.c.animateRight(Transition.none));
		var2.i().b(new Image(20, 7));
		this.i();
		this.f();
	}

	@Override
	public Animation b() {
		return this.a;
	}

	public void a(File var1) {
		this.g.a(var1);
	}

	@Override
	public void a(AnimatedImage var1) {
		this.g.a(var1);
	}

	@Override
	public AnimatedImage c() {
		return this.g.h();
	}

	@Override
	public void a(Transition var1) {
	}
}
