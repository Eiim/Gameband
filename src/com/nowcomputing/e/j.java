package com.nowcomputing.e;

import com.nowcomputing.Image;

public class j extends imageTransition {
	protected int g;
	protected Direction h;
	private Hand i;

	public j(Hand var1) {
		this.h = Direction.a;
		this.i = var1;
		this.speed = 1;
	}

	@Override
	protected void disable() {
		switch (k.a[this.h.ordinal()]) {
		case 1:
			this.g = 20;
			break;
		case 2:
			this.g = this.endImage.getWidth();
			break;
		case 3:
		case 4:
			this.g = this.endImage.getHeight();
			break;
		}
		super.disable();
	}

	@Override
	public Image e() {
		Image d = null;
		this.g--;
		switch (k.a[this.h.ordinal()]) {
		case 1:
			if (this.i == Hand.right) {
				d = a(this.endImage, this.g, 0);
				break;
			}
			d = a(this.startImage, 0 - 20 - this.g, 0);
			break;
		case 2:
			if (this.i == Hand.right) {
				d = a(this.endImage, -this.g, 0);
				break;
			}
			d = a(this.startImage, 20 - this.g, 0);
			break;
		case 3:
			if (this.i == Hand.right) {
				d = a(this.endImage, 0, this.g);
				break;
			}
			d = a(this.startImage, 0, 0 - 7 - this.g);
			break;
		case 4:
			if (this.i == Hand.right) {
				d = a(this.endImage, 0, -this.g);
				break;
			}
			d = a(this.startImage, 0, 7 - this.g);
			break;
		}
		if (this.g == 0) {
			setBool(true);
		}
		return d;
	}

	@Override
	public boolean isEmpty() {
		if (this.endImage != null) {
			return this.g > 0;
		} else {
			return false;
		}
	}

	protected Image a(Image var1, int var2, int var3) {
		Image var4 = new Image(20, 7);
		var4.ramImageInForcefully(var1, var2, var3);
		return var4;
	}
}
