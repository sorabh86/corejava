package com.github.sorabh86.designpattern.prototype;

import javafx.geometry.Point3D;

public class MClient {
	public static void main(String[] args) {
		Swordsman sm1 = new Swordsman();
		sm1.move(new Point3D(-1, 0, 0), 20);
		sm1.attack();
		System.out.println("First: "+sm1);
		
		try {
			Swordsman sm2 = (Swordsman)sm1.clone();
			System.out.println("Cloned: "+sm2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
