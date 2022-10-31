package com.github.sorabh86.designpattern.factorymethod;

import com.github.sorabh86.designpattern.factorymethod.message.JSONMessage;
import com.github.sorabh86.designpattern.factorymethod.message.Message;

// Provides implementation for creating JSONMessage
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMesssage() {
		return new JSONMessage();
	}

}
