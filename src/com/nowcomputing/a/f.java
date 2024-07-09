package com.nowcomputing.a;

// $FF: synthetic class
class f {
	// $FF: synthetic field
	static final int[] a = new int[Direction.values().length];

	static {
		try {
			a[Direction.LEFT.ordinal()] = 1;
		} catch (NoSuchFieldError var4) {
		}

		try {
			a[Direction.RIGHT.ordinal()] = 2;
		} catch (NoSuchFieldError var3) {
		}

		try {
			a[Direction.UP.ordinal()] = 3;
		} catch (NoSuchFieldError var2) {
		}

		try {
			a[Direction.DOWN.ordinal()] = 4;
		} catch (NoSuchFieldError var1) {
		}

	}
}
