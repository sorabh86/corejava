package com.github.sorabh86.designpattern.strategy;

import java.util.Collection;

// Strategy class
public interface OrderPrinter {

	void print(Collection<Order> orders);
}
