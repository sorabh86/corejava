package com.github.sorabh86.designpattern.decorator;

public class Client {

	public static void main(String[] args) {
		Message msg = new TextMessage("My Text <message> is here!!");
		System.out.println(msg.getContent());
		
		Message decorator = new HtmlEncodedMessage(msg);
		System.out.println(decorator.getContent());
		
		decorator = new Base64EncodedMessage(decorator);
		System.out.println(decorator.getContent());
	}
}
