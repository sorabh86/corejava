package com.github.sorabh86.designpattern.objectpool;

import javafx.geometry.Point2D;

public class MClient {
	
	// create the pool with 5 objects
	public static final ObjectPool<Bitmap> bitmapPool = 
			new ObjectPool<>(()->new Bitmap("Logo.bmp"), 5);
	
	public static void main(String[] args) {
		// get objects from pool and use them as regular objects
		Bitmap b1 = bitmapPool.get();
		b1.setLocation(new Point2D(10, 10));
		Bitmap b2 = bitmapPool.get();
		b2.setLocation(new Point2D(-10, 0));
		
		// do your operations
		b1.draw();
		b2.draw();
		
		// return object bact to pool
		bitmapPool.release(b1);
		bitmapPool.release(b2);
		
	}

}
