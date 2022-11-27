package com.github.sorabh86.designpattern.interpreter;

//Non terminal expression
public class OrExpression implements PermissionExpression {
	
	private PermissionExpression e1;
	private PermissionExpression e2;
	
	public OrExpression(PermissionExpression e1, PermissionExpression e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public boolean interpret(User user) {
		return e1.interpret(user) || e2.interpret(user);
	}
	

	@Override
	public String toString() {
		return e1 + " OR " + e2;
	}
}
