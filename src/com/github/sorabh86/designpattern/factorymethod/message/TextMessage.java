package com.github.sorabh86.designpattern.factorymethod.message;

public class TextMessage extends Message {

	@Override
	public String getContent() {
		return "Text Message";
	}

}
