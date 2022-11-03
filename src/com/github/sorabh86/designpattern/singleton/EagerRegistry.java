package com.github.sorabh86.designpattern.singleton;

// This class uses eager initialization of singleton instance
public class EagerRegistry {

	public EagerRegistry() {}
	
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}

}
