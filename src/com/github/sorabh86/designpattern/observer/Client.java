package com.github.sorabh86.designpattern.observer;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("txn_340");
		PriceObserver price = new PriceObserver();
		
		order.attach(price);
		
		order.addItem(33);
		order.addItem(189);
		System.out.println(order);
		
	}

}
