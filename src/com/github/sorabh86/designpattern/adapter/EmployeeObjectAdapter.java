package com.github.sorabh86.designpattern.adapter;

// An object adapter. Using composition to translate interface
public class EmployeeObjectAdapter implements ICustomer {
	
	private Employee adapter;
	
	public EmployeeObjectAdapter(Employee adapter) {
		this.adapter = adapter;
	}
	
	@Override
	public String getName() {
		return adapter.getFullName();
	}

	@Override
	public String getDesignation() {
		return adapter.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adapter.getOfficeLocation();
	}
	
}
