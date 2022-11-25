package com.github.sorabh86.designpattern.facade.email;

public class OrderEmailTemplate extends Template {
	
	@Override
	public String format(Object obj) {
		return "Order Template";
	}
}
