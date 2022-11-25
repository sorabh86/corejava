package com.github.sorabh86.designpattern.proxy.dynamicproxy;

import com.github.sorabh86.designpattern.proxy.Image;

import javafx.geometry.Point2D;

public class Client {
	public static void main(String[] args) {
		
		Image img = ImageFactory.getImage("ABC.bmp");
		img.setLocation(new Point2D(-10, 10));
		img.getLocation();
		System.out.println("-----------");
		img.render();
		
	}
}
