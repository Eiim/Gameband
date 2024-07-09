package com.nowcomputing;

// $FF: synthetic class
class OSDetected {
	// $FF: synthetic field
	static final int[] a = new int[OS.values().length];

	static {
		try {
			a[OS.OSX.ordinal()] = 1;
		} catch (NoSuchFieldError var4) {
		}

		try {
			a[OS.WINDOWS.ordinal()] = 2;
		} catch (NoSuchFieldError var3) {
		}

		try {
			a[OS.LINUX.ordinal()] = 3;
		} catch (NoSuchFieldError var2) {
		}

		try {
			a[OS.UNKNOWN.ordinal()] = 4;
		} catch (NoSuchFieldError var1) {
		}

	}
}
