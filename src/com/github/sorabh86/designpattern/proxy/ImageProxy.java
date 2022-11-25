package com.github.sorabh86.designpattern.proxy;

import javafx.geometry.Point2D;

// Our Proxy class
// This will be a virtual proxy
// Object of this proxy will be standing object, means available as long as possible, 
// and created only when it will be required absolutely necessary.
public class ImageProxy implements Image {

	// reference to real object
	private BitmapImage image;
	private String name;
	
	private Point2D location;
	
	public ImageProxy(String name) {
		this.name = name;
	}
	
	@Override
	public void setLocation(Point2D point2d) {
		if(image != null) { // if created real object
			image.setLocation(point2d);
		} else { // if not created real object
			location = point2d;
		}
	}

	@Override
	public Point2D getLocation() {
		if(image != null) {
			return image.getLocation();
		} else {
			return location;
		}
	}

	@Override
	public void render() {
		if(image == null) {
			image = new BitmapImage(name);
			if(location != null)
				image.setLocation(location);
		}
		image.render();
	}

}
