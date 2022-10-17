package com.github.sorabh86.basic;

class MyClass {
	char c;
	public MyClass(char c) {
		this.c = c;
	}
	
	// This method calls when garbage collector 
	// find that no reference of object exist
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Garbage Collector on "+c);
	}
	
}

public class FinalizeExample {

	public static void main(String[] args) {
		MyClass c1 = new MyClass('A');
		MyClass c2 = new MyClass('B');
		
		c2 = c1;
		c1 = c2;
		System.gc();
		System.out.println("Finalize Method override Example");

	}

}
