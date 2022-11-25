package com.github.sorabh86.designpattern.facade.email;

public class Mailer {
	
	private static Mailer mailer = new Mailer();
	
	public boolean send(Email email) {
		// some email code
		return (Math.random()>=0.5)?true:false;
	}
	
	public static Mailer getMailer() {
		return mailer;
	}
}
