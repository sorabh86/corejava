package com.github.sorabh86.designpattern.state;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("New order, No processing done");
		return 0;
	}

}
