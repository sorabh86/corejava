package com.github.sorabh86.designpattern.facade;

public class Order {
	
	private String txn_id;
	private float amount;
	
	public Order(String txn_id, float amount) {
		this.txn_id = txn_id;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [id=" + txn_id + ", amount=" + amount + "]";
	}
}
