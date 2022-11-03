package com.github.sorabh86.designpattern.singleton;

public class Client {

	public static void main(String[] args) {
		// Testing EagerSingleton Object
		EagerRegistry registry = EagerRegistry.getInstance();
		EagerRegistry registry2 = EagerRegistry.getInstance();
		System.out.println("registry==registry2, "+((registry==registry2)?"YES":"NO")+"\n");
		
		// Test LazySingleton Double Check Locking Object
		LazyRegistryWithDCL lazy1 = LazyRegistryWithDCL.getInstance();
		LazyRegistryWithDCL lazy2 = LazyRegistryWithDCL.getInstance();
		System.out.println("lazy1==lazy2, "+((lazy1==lazy2)?"YES":"NO")+"\n");
		
		// LazySingleton Lazy Initialization Holder Class
		LazyRegistryIODH single = LazyRegistryIODH.getInstance();
		LazyRegistryIODH single2 = LazyRegistryIODH.getInstance();
		System.out.println("single==single2, "+((single==single2)?"YES":"NO")+"\n");
		
		// Enum singleton
		RegistryEnum enum1 = RegistryEnum.INSTANCE;
		enum1.getConfiguration();
		RegistryEnum enum2 = RegistryEnum.INSTANCE;
		System.out.println("enum1==enum2, "+((enum1==enum2)?"YES":"NO"));
	}

}
