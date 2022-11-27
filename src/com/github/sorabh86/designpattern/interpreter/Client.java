package com.github.sorabh86.designpattern.interpreter;

public class Client {
	
	public static void main(String[] args) {
		
		Report report1 = new Report("Testing Report", "TESTER AND NOT ADMINISTRATOR");
		ExpressionBuilder builder = new ExpressionBuilder();
		
		PermissionExpression exp = builder.build(report1);
		System.out.println("Build Expression: "+exp);
		
		User user1 = new User("Sorabh", "USER", "ADMINISTRATOR");
		System.out.println("User["+user1.getUsername()+"] access testing report: "+ exp.interpret(user1));

		User user2 = new User("Neeraj", "USER", "TESTER");
		System.out.println("User["+user2.getUsername()+"] access testing report: "+ exp.interpret(user2));
		
	}
}
