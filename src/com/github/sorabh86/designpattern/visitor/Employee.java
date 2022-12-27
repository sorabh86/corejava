package com.github.sorabh86.designpattern.visitor;

import java.util.Collection;

// Element Interface
// Organizational Structure
public interface Employee {

	int getPerformanceRating();
	void setPerformanceRating(int rating);
	Collection<Employee> getDirectReports();
	int getEmployeeId();
	
	void accept(Visitor visitor);
}
