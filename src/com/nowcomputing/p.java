package com.nowcomputing;

// $FF: synthetic class
class p {
	// $FF: synthetic field
	static final int[] a = new int[OS.values().length];

	static {
		try {
			a[OS.WINDOWS.ordinal()] = 1;
		} catch (NoSuchFieldError var3) {
		}

		try {
			a[OS.OSX.ordinal()] = 2;
		} catch (NoSuchFieldError var2) {
		}

		try {
			a[OS.LINUX.ordinal()] = 3;
		} catch (NoSuchFieldError var1) {
		}

	}
}
