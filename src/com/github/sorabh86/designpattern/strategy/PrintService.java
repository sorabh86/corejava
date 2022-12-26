package com.github.sorabh86.designpattern.strategy;

import java.util.LinkedList;

// Context class
public class PrintService {
	
	private OrderPrinter printer;
	
	public PrintService(OrderPrinter printer) {
		this.printer = printer;
	}

	public void printOrders(LinkedList<Order> orders) {
		printer.print(orders);
	}

}
