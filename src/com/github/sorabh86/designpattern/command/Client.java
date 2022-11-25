package com.github.sorabh86.designpattern.command;

public class Client {
	
	public static void main(String[] args) throws InterruptedException {
		
		EWSService service = new EWSService();
		
		Command c1 = new AddMemberCommand("a@ab.io", "spam", service);
		MailTasksRunner.getInstance().addCommand(c1);

		Command c2 = new AddMemberCommand("b@bc.io", "spam", service);
		MailTasksRunner.getInstance().addCommand(c2);
		
		Thread.sleep(3000);
		MailTasksRunner.getInstance().shutdown();
	}
}
