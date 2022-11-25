package com.github.sorabh86.designpattern.chainofresponsibility;

// Concrete Handler for Manager
public class Manager extends Employee {

	public Manager(LeaveApprover successor) {
		super("Manager", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		switch (application.getType()) {
		case Sick:
			application.approve(getApproverRole());
			return true;
		case LOP:
			if(application.getNoOfDays() <=5) {
				application.approve(getApproverRole());
				return true;
			} else if(application.getNoOfDays() > 5) {
				application.reject(getApproverRole());
				return true;
			}
		case PTO:
			if(application.getNoOfDays() <= 5) {
				application.approve(getApproverRole());
				return true;
			}
		}
		return false;
	}

}
