package com.github.sorabh86.designpattern.factorymethod;

import com.github.sorabh86.designpattern.factorymethod.message.Message;

public class MClient {

	public static void main(String[] args) {
		// User creator to create a product,
		// choice of creator determines
		// type of product created
		printMessage(new JSONMessageCreator());
		
		// Create another product using another creator
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg.getContent());
	}

}
