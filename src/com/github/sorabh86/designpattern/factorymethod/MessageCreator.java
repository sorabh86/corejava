package com.github.sorabh86.designpattern.factorymethod;

import com.github.sorabh86.designpattern.factorymethod.message.Message;

// This is our abstract creator
// The abstract method createMessage()
// has to be implemented by its subclasses
public abstract class MessageCreator {
	
	// This is called by clients.
	public Message getMessage() {
		Message msg = createMesssage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}
	
	// Factory Method
	// Subclasses must provide implementation for this & return
	// a specific Message subclass
	public abstract Message createMesssage();
}
