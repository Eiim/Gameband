package com.nowcomputing.uistuff.apackage;

import com.nowcomputing.a.Direction;

// $FF: synthetic class
class n {
	// $FF: synthetic field
	static final int[] a = new int[Direction.a().length];

	static {
		try {
			a[Direction.UP.ordinal()] = 1;
		} catch (NoSuchFieldError var4) {
		}

		try {
			a[Direction.DOWN.ordinal()] = 2;
		} catch (NoSuchFieldError var3) {
		}

		try {
			a[Direction.LEFT.ordinal()] = 3;
		} catch (NoSuchFieldError var2) {
		}

		try {
			a[Direction.RIGHT.ordinal()] = 4;
		} catch (NoSuchFieldError var1) {
		}

	}
}
