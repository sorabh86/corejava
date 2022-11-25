package com.github.sorabh86.designpattern.facade.email;

public class Email {
	private Template template;
	private Stationary stationary;
	private Object object;
	
	public Template getTemplate() {
		return template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

	public Stationary getStationary() {
		return stationary;
	}

	public void setStationary(Stationary stationary) {
		this.stationary = stationary;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
