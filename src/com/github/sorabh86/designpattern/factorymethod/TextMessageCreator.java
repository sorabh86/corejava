package com.github.sorabh86.designpattern.factorymethod;

import com.github.sorabh86.designpattern.factorymethod.message.Message;
import com.github.sorabh86.designpattern.factorymethod.message.TextMessage;

//Provides implementation for creating TextMessage
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMesssage() {
		return new TextMessage();
	}

}
