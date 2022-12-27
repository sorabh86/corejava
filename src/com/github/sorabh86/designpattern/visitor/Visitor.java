package com.github.sorabh86.designpattern.visitor;

// Visitor interface
public interface Visitor {
	
	void visit(Programmer programmer);
	void visit(ProjectLead lead);
	void visit(Manager manager);
	void visit(VicePresident vp);
}
