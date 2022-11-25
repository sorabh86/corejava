package com.github.sorabh86.designpattern.chainofresponsibility;

import java.time.LocalDate;

import com.github.sorabh86.designpattern.chainofresponsibility.LeaveApplication.Type;

public class Client {
	public static void main(String[] args) {
		// Chain of responsibility
		LeaveApprover approver = createChain();
		
		// This application must be approved by ProjectLead
		LeaveApplication application = LeaveApplication
				.getBuilder().withType(Type.Sick)
				.from(LocalDate.of(2018, 11, 2))
				.to(LocalDate.of(2018, 11, 4))
				.build();
		System.out.println("before: "+application);
		approver.processLeaveApplication(application);
		System.out.println("after: "+application);
		
		System.out.println("-------------------");
		// This application must be approved by Manager
		application = LeaveApplication
				.getBuilder().withType(Type.LOP)
				.from(LocalDate.of(2018, 11, 2))
				.to(LocalDate.of(2018, 11, 22))
				.build();
		System.out.println("before: "+application);
		approver.processLeaveApplication(application);
		System.out.println("after: "+application);

		System.out.println("-------------------");
		// This application must be approved by Director
		application = LeaveApplication
				.getBuilder().withType(Type.PTO)
				.from(LocalDate.of(2018, 11, 2))
				.to(LocalDate.of(2018, 12, 26))
				.build();
		System.out.println("before: "+application);
		approver.processLeaveApplication(application);
		System.out.println("after: "+application);
	}
	
	private static LeaveApprover createChain() {
		Director director = new Director(null);
		Manager manager = new Manager(director);
		ProjectLead lead = new ProjectLead(manager);
		return lead;
	}
}
