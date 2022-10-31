package com.github.sorabh86.designpattern.abstractfactory;

// Abstract factory with methods defined for each object type.
public interface ResourceFactory {
	
	Instance createInstance(Instance.Capacity capacity);
	Storage createStorage(int capInMb);
}
