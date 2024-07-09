package com.nowcomputing.e;

public enum Direction {
	LEFT("LEFT", 0), RIGHT("RIGHT", 1), UP("UP", 2), DOWN("DOWN", 3);

	Direction(String text, int index) {

	}

	private static final Direction[] e;

	public static Direction[] a() {
		return (Direction[]) e.clone();
	}

	static {
		e = new Direction[] { LEFT, RIGHT, UP, DOWN };
	}
}
