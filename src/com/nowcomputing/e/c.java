package com.nowcomputing.e;

public class c {
	public static final TransitionType DEFAULT_TRANSITION = TransitionType.rain;

	public static imageTransition animateRight(TransitionType var0) {
		if (var0.equals(TransitionType.none)) {
			return new e(Hand.right);
		} else if (var0.equals(TransitionType.dissolve)) {
			return new i();
		} else if (var0.equals(TransitionType.scroll)) {
			return new j(Hand.right);
		} else {
			return var0.equals(TransitionType.rain) ? new g(Hand.right) : null;
		}
	}

	public static imageTransition animateLeft(TransitionType var0) {
		if (var0.equals(TransitionType.none)) {
			return new e(Hand.left);
		} else if (var0.equals(TransitionType.dissolve)) {
			return new i();
		} else if (var0.equals(TransitionType.scroll)) {
			return new j(Hand.left);
		} else {
			return var0.equals(TransitionType.rain) ? new g(Hand.left) : null;
		}
	}

	public static TransitionType getTransition(int transitionNum) {
		if (transitionNum == 0) {
			return TransitionType.none;
		} else if (transitionNum == 1) {
			return TransitionType.scroll;
		} else if (transitionNum == 2) {
			return TransitionType.dissolve;
		} else {
			return transitionNum == 3 ? TransitionType.rain : null;
		}
	}
}
