package com.github.sorabh86.designpattern.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

import com.github.sorabh86.designpattern.proxy.Image;

// Factory to get image object
public class ImageFactory {
	// We'll provide proxy to caller instead of real object
	
	public static Image getImage(String filename) {
		return (Image)Proxy.newProxyInstance(
				ImageFactory.class.getClassLoader(), 
				new Class[] {Image.class}, 
				new ImageInvocationHandler(filename));
	}
}
