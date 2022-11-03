package com.github.sorabh86.designpattern.factorymethod.message;

// This class represents interface for our product which is a message
// Implementations will be specific to content type.
public abstract class Message {
	
	public abstract String getContent();
	
	public void addDefaultHeaders() {
		//@TODO Your default headers code
	}
	
	public void encrypt() {
		//@TODO Encrypt the content code
	}
}