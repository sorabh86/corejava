package com.github.sorabh86.designpattern.visitor;

import java.util.Date;
import java.util.Random;

public class Client {
	
	public static void main(String[] args) {
		Employee emps = buildOrganization();
		Visitor visitor = new PrintVisitor();
		
		visitOrgStructure(emps, visitor);
		
		// Perform fake appraisal
		System.out.println("*************************************");
		appraisal(emps, new Random(new Date().getTime()));
		
		AppraisalVisitor visitor2 = new AppraisalVisitor();
		//Carry out final appraisal where we consider team performance
		visitOrgStructure(emps, visitor2);
		
		//Create new print visitor with final ratings taken from appraisal visitor
		visitor = new PrintVisitor(visitor2.getFinalRatings());
		visitOrgStructure(emps, visitor);
		
	}
	
	private static void appraisal(Employee emp, Random random) {
		int rating = random.nextInt(6);
		emp.setPerformanceRating(rating < 1 ? 1 : rating);
		emp.getDirectReports().forEach(r->appraisal(r, random));
	}

	private static Employee buildOrganization() {
		Programmer p1 = new Programmer("Sorabh", "C++");
		Programmer p2 = new Programmer("Sandeep", "Java");
		Programmer p3 = new Programmer("Vivek", "C#");
		Programmer p4 = new Programmer("Rahul", "Node");
		
		ProjectLead pl1 = new ProjectLead("Gaurav", p1,p2);
		ProjectLead pl2 = new ProjectLead("Prabhat", p3, p4);
		
		Manager m1 = new Manager("Neeraj", pl1);
		Manager m2 = new Manager("Pankaj", pl2);
		
		VicePresident vp = new VicePresident("Subhash", m1,m2);
		
		return vp;
	}
	
	private static void visitOrgStructure(Employee emp, Visitor visitor) {
		emp.accept(visitor);
		emp.getDirectReports().forEach(e->visitOrgStructure(e, visitor));
	}
}
