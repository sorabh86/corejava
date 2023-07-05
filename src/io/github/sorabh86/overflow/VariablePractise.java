package io.github.sorabh86.overflow;

public class VariablePractise {
	public static void main(String[] args) {
		System.out.println("Check byte overflow:");
		byte b2 = (byte) (-128 - 1);
		System.out.println(b2);
	}
}
