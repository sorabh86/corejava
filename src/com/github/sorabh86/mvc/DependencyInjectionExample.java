package com.github.sorabh86.mvc;

//Service interface
interface MessageService {
	void sendMessage(String message, String recipient);
}

//Service implementation
class EmailService implements MessageService {
	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("Email message: " + message + " sent to " + recipient);
	}
}

//Client
class MyApplication {
	private MessageService service;

	public MyApplication(MessageService svc) {
		this.service = svc;
	}

	public void send(String message, String recipient) {
		this.service.sendMessage(message, recipient);
	}
}

//Injector
class MessageServiceInjector {
	public MyApplication getApplication() {
		return new MyApplication(new EmailService());
	}
}

public class DependencyInjectionExample {
	public static void main(String[] args) {
		String message = "Hello World";
		String recipient = "john@example.com";

		// Use email service
		MessageServiceInjector injector = new MessageServiceInjector();
		MyApplication app = injector.getApplication();
		app.send(message, recipient);
	}
}
