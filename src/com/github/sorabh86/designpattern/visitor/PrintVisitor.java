package com.github.sorabh86.designpattern.visitor;

import com.github.sorabh86.designpattern.visitor.AppraisalVisitor.Ratings;

// Concrete Visitor
public class PrintVisitor implements Visitor {
	
	@SuppressWarnings("unused")
	private Ratings ratings;
	
	public PrintVisitor() {}
	public PrintVisitor(Ratings ratings) {
		this.ratings = ratings;
	}

	@Override
	public void visit(Programmer programmer) {
		String msg = programmer.getName()+" is a "+programmer.getSkill()+" programmer.";
		msg += getRatings(programmer);
		System.out.println(msg);
	}

	private String getRatings(Employee emp) {
		return " Rating="+emp.getPerformanceRating();
	}
	@Override
	public void visit(ProjectLead lead) {
		String msg = lead.getName()+" is a Project Lead with "+lead.getDirectReports().size()+" programmers reporting.";
		msg += getRatings(lead);
		System.out.println(msg);
	}

	@Override
	public void visit(Manager manager) {
		String msg = manager.getName()+" is a Manager with "+manager.getDirectReports().size()+" leads reporting.";
		msg += getRatings(manager);
		System.out.println(msg);
	}

	@Override
	public void visit(VicePresident vp) {
		String msg = vp.getName()+" is a Vice President with "+vp.getDirectReports().size()+" managers reporting.";
		msg += getRatings(vp);
		System.out.println(msg);
	}

}
