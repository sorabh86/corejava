package com.github.sorabh86.designpattern.iterator;

class Client {

	public static void main(String[] args) {
		Iterator<ThemeColor> iterator = ThemeColor.getIterator();
		
		while(iterator.hasNext()) 
			System.out.println(iterator.next());
		
		new MyApp();
		new MyApp2();
	}

}

class MyApp {
	public MyApp() {
		System.out.println("Myapp created");
	}
}

class MyApp2 {
	public MyApp2() {
		System.out.println("MyApp2 created");
	}
}