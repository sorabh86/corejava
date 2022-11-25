package com.github.sorabh86.designpattern.proxy;

import javafx.geometry.Point2D;

public class Client {
	public static void main(String[] args) {
		Image img = ImageFactory.getImage("ABc.bmp");
		img.setLocation(new Point2D(10, 8));
		System.out.println("Image location: "+img.getLocation());
		System.out.println("Rendering Image...");
		img.render();
	}
}
