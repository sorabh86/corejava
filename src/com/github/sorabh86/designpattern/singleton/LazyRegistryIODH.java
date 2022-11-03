package com.github.sorabh86.designpattern.singleton;


// Signleton pattern using lazy initialization holder class. This ensures that, 
// we have a lazy initialization without worrying about synchronization.
public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("LazyRegistryIODH.constructor method called!!");
	}
	
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH(); 
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}
}
