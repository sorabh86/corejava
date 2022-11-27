package com.github.sorabh86.designpattern.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// context
public class User {
	
	private List<String> permissions;
	
	private String username;
	
	public User(String username, String... permissions) {
		this.username = username;
		this.permissions = new ArrayList<>();
		Stream.of(permissions).forEach(
				p->this.permissions.add(p.toLowerCase()));
	}
	
	public List<String> getPermissions() {
		return permissions;
	}
	
	public String getUsername() {
		return username;
	}
}
