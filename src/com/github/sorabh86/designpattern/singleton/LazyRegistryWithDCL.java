package com.github.sorabh86.designpattern.singleton;

// This class demonstrates singleton pattern using Double checked Locking or "classic" singleton.
// This is also a lazy initializing singleton.
// Although this implementation solves the multi-threading issue with lazy initialization using
// volatile and double check locking, the volatile keyword is guaranteed to work only after JVMs
// starting with version 1.5 and later.
public class LazyRegistryWithDCL {

	private LazyRegistryWithDCL() {}
	
	// volatile keyword for fixing thread locking, implementation above java 1.5
	private static volatile LazyRegistryWithDCL INSTANCE;
	
	public static LazyRegistryWithDCL getInstance() {
		if(INSTANCE == null) {
			// Threads Locking if used
			synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
		return INSTANCE;
	}
}
