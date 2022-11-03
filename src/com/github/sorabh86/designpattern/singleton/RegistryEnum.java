package com.github.sorabh86.designpattern.singleton;

// Java 1.5 and above support enum.
// It handles serialization using java's in-built mechanism and still single instance
public enum RegistryEnum {
	
	INSTANCE;
	
	public void getConfiguration() {
		System.out.println("Configration on RegistryEnum");
	}
}
