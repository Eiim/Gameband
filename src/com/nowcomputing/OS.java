package com.nowcomputing;

public enum OS {
	LINUX("linux", new String[] { "linux", "unix" }), WINDOWS("windows", new String[] { "win" }),
	OSX("osx", new String[] { "mac" }), UNKNOWN("unknown", null);

	private final String internalName;
	private final String[] javaNames;

	private OS(String var3, String[] var4) {
		this.internalName = var3;
		this.javaNames = var4 == null ? new String[0] : var4;
	}

	public static OS getOS() {
		String javaName = System.getProperty("os.name").toLowerCase();
		for (OS os : values()) {
			for (String s : os.javaNames) {
				if (s.equals(javaName)) {
					return os;
				}
			}
		}
		return UNKNOWN;
	}

	public String[] b() {
		return this.javaNames;
	}
}
