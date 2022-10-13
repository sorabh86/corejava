package com.github.sorabh86.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int val = 39;
		
		List<String> items = new ArrayList<>();
		items.add("sorabh");
		items.add("value "+val);
		
		System.out.println("Hello World");
		
		items.forEach(i->System.out.println(i));

		
		
	}
}
