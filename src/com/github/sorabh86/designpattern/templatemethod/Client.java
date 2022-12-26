package com.github.sorabh86.designpattern.templatemethod;

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		Order order = new Order("10001");
		order.addItem("Soda", 2.50);
		order.addItem("Sandwitch", 11.90);
		order.addItem("Pizza", 23.55);
		
		OrderPrinter printer = new TextPrinter();
		printer.printOrder(order, "10001.txt");

		printer = new HtmlPrinter();
		printer.printOrder(order, "10001.html");
	}

}
