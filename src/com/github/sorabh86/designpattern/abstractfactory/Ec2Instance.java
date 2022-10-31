package com.github.sorabh86.designpattern.abstractfactory;

// Represents a concrete product in Amazon Web Services
public class Ec2Instance implements Instance {

	public Ec2Instance(Capacity capacity) {
		// Map capacity to ec2 instance types. Use AWS API provision
		System.out.println("Created Ec2Instance");
	}

	@Override
	public void start() {
		System.out.println("Ec2Instance started");
	}

	@Override
	public void stop() {
		System.out.println("Ec2Instance stopped");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached "+storage+" to Ec2Instance");
	}

	@Override
	public String toString() {
		return "Ec2Instance";
	}

}
