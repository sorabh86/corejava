package com.github.sorabh86.designpattern.observer;

// Concreate observer
public class PriceObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		double total = order.getItemCost();
		if(total >= 200) {
			// give 10USD discount on order amount
			order.setDiscount(10);
		} else if(total >= 500) {
			// give 20USD discount on order amount
			order.setDiscount(20);
		}
	}
	
}
