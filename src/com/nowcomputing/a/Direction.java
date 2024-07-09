package com.nowcomputing.a;

import com.nowcomputing.LocaleUtil;

public enum Direction {
	LEFT("LEFT"), RIGHT("RIGHT"), UP("UP"), DOWN("DOWN");

	private String text;

	public static Direction[] a() {
		// return (Direction[])f.clone(); Not sure what that was supposed to mean
		return new Direction[] { LEFT, RIGHT, UP, DOWN }; // TODO: check order
	}

	Direction(String var3) {
		this.text = var3;
	}

	@Override
	public String toString() {
		return LocaleUtil.getLocalizedString(this.text);
	}
}
