package com.github.sorabh86.designpattern.facade.email;

public class TemplateFactory {

	public enum TemplateType {
		Email
	}
	
	public static Template createTemplateFor(TemplateType type) {
		return null;// new Template();
	}
}
