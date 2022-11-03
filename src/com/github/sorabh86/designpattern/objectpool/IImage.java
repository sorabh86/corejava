package com.github.sorabh86.designpattern.objectpool;

import javafx.geometry.Point2D;

// Represents our abstract reusable
public interface IImage extends IPoolable {
	void draw();
	Point2D getLocation();
	void setLocation(Point2D location);
}
