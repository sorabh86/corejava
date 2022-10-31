package com.github.sorabh86.designpattern.abstractfactory;

// Represent a concrete product of Google Cloud Platform
public class ComputeEngineInstance implements Instance {

	public ComputeEngineInstance(Capacity capacity) {
		// Map capacity to GCP compute instance types. Use GCP API provision
		System.out.println("Created Google Compute Engine Instance");
	}

	@Override
	public void start() {
		System.out.println("Compute engine started");
	}

	@Override
	public void stop() {
		System.out.println("Compute engine stopped");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached "+storage+" to compute engine instance");
	}

	@Override
	public String toString() {
		return "ComputeEngineInstance";
	}
}
