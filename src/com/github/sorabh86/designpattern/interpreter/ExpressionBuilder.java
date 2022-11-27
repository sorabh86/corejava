package com.github.sorabh86.designpattern.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

// Parses & builds abstract syntax tree
public class ExpressionBuilder {

	private Stack<PermissionExpression> permissions = new Stack<>();
	
	private Stack<String> operators = new Stack<>();
	
	public PermissionExpression build(Report report) {
		System.out.println(report.getPermission());
		parse(report.getPermission());
		System.out.println("operators: "+operators);
		System.out.println("permissions: "+permissions);
		buildExpressions();
		System.out.println("operators: "+operators);
		System.out.println("permissions: "+permissions);
		
		if(permissions.size()>1 || !operators.isEmpty()) {
			System.out.println("ERROR");
		}
		return permissions.pop();
	}
	
	private void parse(String permission) {
		StringTokenizer tokenizer = new StringTokenizer(permission.toLowerCase());
		
		while(tokenizer.hasMoreElements()) {
			String token = tokenizer.nextToken();
			switch(token) {
				case "and":
					operators.push("and");
					break;
				case "not":
					operators.push("not");
					break;
				case "or":
					operators.push("or");
					break;
				default:
					permissions.push(new Permission(token));
					break;
			}
		}
		
	}

	private void buildExpressions() {
		while(!operators.isEmpty()) {
			String operator = operators.pop();
			PermissionExpression p1;
			PermissionExpression p2;
			PermissionExpression exp;
			switch(operator) {
				case "not":
					p1 = permissions.pop();
					exp = new NotExpression(p1);
					break;
				case "and":
					p1 = permissions.pop();
					p2 = permissions.pop();
					exp = new AndExpression(p1, p2);
					break;
				case "or":
					p1 = permissions.pop();
					p2 = permissions.pop();
					exp = new OrExpression(p1, p2);
					break;
				default:
					throw new IllegalArgumentException("Unknown operator:"+operator);
			}
			permissions.push(exp);
		}
	}
}
