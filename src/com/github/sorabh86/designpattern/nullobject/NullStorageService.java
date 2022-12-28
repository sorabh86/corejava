package com.github.sorabh86.designpattern.nullobject;

// Null Object
public class NullStorageService extends StorageService {
	
	@Override
	public void save(Report report) {
		System.out.println("Null object. Doing nothing");
	}
}
