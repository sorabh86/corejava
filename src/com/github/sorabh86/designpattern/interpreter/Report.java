package com.github.sorabh86.designpattern.interpreter;

public class Report {
	
	private String name;
	//"NOT ADMIN", "FINANCE_USER AND ADMIN", "EDITOR OR SUBSCRIBER"
	private String permission;
	
	public Report(String name, String permission) {
		this.name = name;
		this.permission = permission;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPermission() {
		return permission;
	}
}
