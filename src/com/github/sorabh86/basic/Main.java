package com.github.sorabh86.basic;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static String name ="sorabh";
	
	void display() {
		System.out.println("Main: "+name);
	}

	public static void main(String[] args) {
		int val = 39;
		
		List<String> items = new ArrayList<>();
		items.add("sorabh");
		items.add("value "+val);
		
		System.out.println("Hello World");
		
		items.forEach(i->System.out.println(i));

		// calling static variable
		Main m = new Main();
		System.out.println(Main.name);
		Main.name = "Neeraj";
		m.display();
		
	}
}
