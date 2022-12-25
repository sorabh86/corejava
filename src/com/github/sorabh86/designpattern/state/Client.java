package com.github.sorabh86.designpattern.state;

public class Client {

	public static void main(String[] args) {
		Order order = new Order();
		order.paymentSuccessful();
		order.dispatched();
		order.cancel();
	}

}
