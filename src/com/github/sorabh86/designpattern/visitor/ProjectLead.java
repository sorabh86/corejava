package com.github.sorabh86.designpattern.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//Concrete Element
public class ProjectLead extends AbstractEmployee {

	private List<Employee> directReports = new ArrayList<Employee>();
	
	public ProjectLead(String name, Employee... employees) {
		super(name);
		Arrays.stream(employees).forEach(directReports::add);
	}
	
	@Override
	public Collection<Employee> getDirectReports() {
		return directReports;
	}
	

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
