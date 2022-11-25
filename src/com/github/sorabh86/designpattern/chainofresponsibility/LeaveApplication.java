package com.github.sorabh86.designpattern.chainofresponsibility;

import java.time.LocalDate;
import java.time.Period;

// Represents a request in our chain of responsibility
public class LeaveApplication {

	public enum Type {
		Sick, // Sick Leave
		PTO,  // Paid time off
		LOP   // Loss Of Pay
	}
	
	public enum Status {
		Pending,
		Approved,
		Rejected
	}
	
	private Type type;
	
	private LocalDate from;
	private LocalDate to;
	private String processedBy;
	private Status status;
	
	public LeaveApplication() {}
	
	public LeaveApplication(Type type, LocalDate from, LocalDate to) {
		this.type = type;
		this.from = from;
		this.to = to;
		this.status = Status.Pending;
	}
	
	public void approve(String role) {
		status = Status.Approved;
		processedBy = role;
	}
	public void reject(String role) {
		status = Status.Rejected;
		processedBy = role;
	}
	
	public int getNoOfDays() {
		return Period.between(to, from).getDays();
	}
	
	public Type getType() {
		return this.type;
	}
	
	public static LeaveApplicationBuilder getBuilder() {
		return new LeaveApplicationBuilder();
	}
	
	@Override
	public String toString() {
		String typeName = "";
		if(type == Type.Sick)
			typeName = "Sick Leave";
		else if( type==Type.PTO)
			typeName = "Paid time off";
		else if(type==Type.LOP)
			typeName = "Loss Of Pay";
		
		String process = "";
		if(processedBy!=null)
			process = " processed by "+processedBy;
		
		return typeName + " (from " + from + " - " + to + ") of "+getNoOfDays()
			+" days"+process+" is "+status;
	}

	// LeaveApplication Builder class
	public static class LeaveApplicationBuilder {
		
		private Type type;
		private LocalDate to;
		private LocalDate from;
		
		public LeaveApplicationBuilder withType(Type type) {
			this.type = type;
			return this;
		}
		public LeaveApplicationBuilder to(LocalDate to) {
			this.to = to;
			return this;
		}
		public LeaveApplicationBuilder from(LocalDate from) {
			this.from = from;
			return this;
		}
		
		public LeaveApplication build() {
			return new LeaveApplication(type, to, from);
		}
		
	}
}
