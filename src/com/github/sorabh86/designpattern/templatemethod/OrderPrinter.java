package com.github.sorabh86.designpattern.templatemethod;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Abstract base class defines the template method
public abstract class OrderPrinter {
	
	//Template method. Defines algorithm using steps defined as abstract methods.
	public final void printOrder(Order order, String filename) throws FileNotFoundException {
		// try with resources
		try(PrintWriter writer = new PrintWriter(filename)) {
			
			writer.println(start());
			writer.println(formatOrderNumber(order));
			writer.println(formatItems(order));
			writer.println(formatTotal(order));
			writer.println(end());
		}
	}

	// Methods below are steps used in template method
	protected abstract String start();
	
	protected abstract String formatOrderNumber(Order order);

	protected abstract String formatItems(Order order);

	protected abstract String formatTotal(Order order);
	
	protected abstract String end();
}
