package com.github.sorabh86.designpattern.facade.email;

public class Stationary {
	public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
