package com.github.sorabh86.designpattern.interpreter;

//Abstract expression
public interface PermissionExpression {
	
	boolean interpret(User user);
}
