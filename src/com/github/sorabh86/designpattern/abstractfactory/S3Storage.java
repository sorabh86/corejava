package com.github.sorabh86.designpattern.abstractfactory;

public class S3Storage implements Storage {
	
	public S3Storage(int capacityInMb) {
		// Use AWS s3 API
		System.out.println("Allocated "+capacityInMb+" on S3");
	}

	@Override
	public String getId() {
		return "S31";
	}

	@Override
	public String toString() {
		return "S3Storage";
	}

}
