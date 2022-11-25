package com.github.sorabh86.designpattern.flyweight;

// A concrete Flyweight. Instance is shared
public class SystemErrorMessage implements ErrorMessage {

	// some error message $errorCode
	private String messageTemplate;
	
	// http://yourdomain.com/page?error=
	private String helpUrlBase;

	public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
		//Load from external resource
		this.messageTemplate = messageTemplate;
		this.helpUrlBase = helpUrlBase;
	}
	
	//combine extrinsic state with intrinsic & use it
	@Override
	public String getText(String code) {
		// combining intrinsic state(messageTemplate) with extrinsic state(code)
		return messageTemplate.replace("$errorCode", code) + helpUrlBase+code;
	}

	
}
