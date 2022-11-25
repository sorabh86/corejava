package com.github.sorabh86.designpattern.facade.email;

public class EmailBuilder {
	
	private Email email = new Email();
	
	public EmailBuilder withTemplate(Template template) {
		this.email.setTemplate(template);
		return this;
	}
	
	public EmailBuilder withStationary(Stationary stationary) {
		this.email.setStationary(stationary);
		return this;
	}
	
	public EmailBuilder forObject(Object object) {
		this.email.setObject(object);
		return this;
	}
	
	public Email build() {
		return this.email;
	}
	
	public Email getEmail() {
		return null;
	}
}
