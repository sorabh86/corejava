package com.github.sorabh86.designpattern.interpreter;

//Non-terminal expression
public class AndExpression implements PermissionExpression {
	
	private PermissionExpression e1;
	private PermissionExpression e2;
	
	public AndExpression(PermissionExpression e1, PermissionExpression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public boolean interpret(User user) {
		return e1.interpret(user) && e2.interpret(user);
	}

	@Override
	public String toString() {
		return e1 + " AND " + e2;
	}
	
}
