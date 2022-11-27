package com.github.sorabh86.designpattern.interpreter;

// Terminal expression
public class Permission implements PermissionExpression {

	private String permission;
	
	public Permission(String permission) {
		this.permission = permission.toLowerCase();
	}
	
	@Override
	public boolean interpret(User user) {
		// TODO: please implement it in better way
		return user.getPermissions().contains(permission);
	}

	@Override
	public String toString() {
		return permission;
	}
	
}
