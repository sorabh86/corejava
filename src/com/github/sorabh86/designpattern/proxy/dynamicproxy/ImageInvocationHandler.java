package com.github.sorabh86.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.github.sorabh86.designpattern.proxy.BitmapImage;
import com.github.sorabh86.designpattern.proxy.Image;

import javafx.geometry.Point2D;

// Implement invocation handler.
public class ImageInvocationHandler implements InvocationHandler{

	private String filename;
	private Point2D location;
	private BitmapImage image;
	private static final Method setLocationMethod;
	private static final Method getLocationMethod;
	private static final Method renderMethod;
	
	//Cache Methods for later comparison
	static {
		try {
			// Getting the signature, 
			// to identify which method is called
			setLocationMethod = Image.class.getMethod(
					"setLocation", new Class[] {Point2D.class});
			getLocationMethod = Image.class.getMethod(
					"getLocation", new Class[] {});
			renderMethod = Image.class.getMethod(
					"render", new Class[] {});	
		} catch(NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}
	
	public ImageInvocationHandler(String filename) {
		this.filename = filename;
	}

	// this method will be called every time any of method's called
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// You can implement proxy logic here
		System.out.println("Invocation of method: "+method.getName());
		if(setLocationMethod.equals(method)) {
			return handleSetLocation(args); 
		}else if(getLocationMethod.equals(method)) {
			return handleGetLocation(); 			
		}else if(renderMethod.equals(method)) {
			return handleRender();
		}
		return null;
	}
	
	// We create real object only when we really need it
	private Object handleRender() {
		if(image == null) {
			image = new BitmapImage(filename);
			if(location != null)
				image.setLocation(location);
		}
		image.render();
		return null;
	}
	
	private Point2D handleGetLocation() {
		if(image != null) {
			return image.getLocation();
		} else {
			return this.location;
		}
	}
	
	private Object handleSetLocation(Object[] args) {
		if(image != null) {
			image.setLocation((Point2D)args[0]); // get the first argument
		} else {
			this.location = (Point2D)args[0];
		}
		return null;
	}
}
