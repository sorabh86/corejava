package com.github.sorabh86.designpattern.mediator;

// Abstract Colleague
public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	String getControlName();
}
