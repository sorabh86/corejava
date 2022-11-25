package com.github.sorabh86.designpattern.flyweight;

import com.github.sorabh86.designpattern.flyweight.ErrorMessageFactory.ErrorType;

public class Client {
	public static void main(String[] args) {
		SystemErrorMessage msg1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
		// Client provides extrinsic state to flyweight
		System.out.println(msg1.getText("2322"));
		
		//Unshared flywight
		UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance().getUserBannedMessage("9393");
		System.out.println(msg2.getText(null));
	}
}
