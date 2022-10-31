package com.github.sorabh86.designpattern.factorymethod.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON\":[{\"message\":\"JSON Message\"}]}";
	}

}
