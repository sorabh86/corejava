package com.github.sorabh86.designpattern.chainofresponsibility;

import com.github.sorabh86.designpattern.chainofresponsibility.LeaveApplication.Type;

public class Director extends Employee {

	public Director(LeaveApprover successor) {
		super("Director", successor);
	}

	@Override
	protected boolean processRequest(LeaveApplication application) {
		if(application.getType() == Type.PTO) {
			application.approve(getApproverRole());
			return true;
		}
		if(application.getNoOfDays() >= 30) {
			application.reject(getApproverRole());
			return true;
		}
		return false;
	}

}
