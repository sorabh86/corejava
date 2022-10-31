package com.github.sorabh86.designpattern.abstractfactory;

// Represents a concrete product in Google Cloud Platform
public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int capacityInMb) {
		// Use Google Cloud Platform API
		System.out.println("Allocated "+capacityInMb+" on Google Cloud Storage");
	}

	@Override
	public String getId() {
		return "gcpcs1";
	}

	@Override
	public String toString() {
		return "GoogleCloudStorage";
	}

}
