package com.github.sorabh86.programs.basic;

public class FibonacciMain {
	
	static int n1=0, n2=1, n3=0;
	public static void main(String[] args) {
		
		System.out.println("Printing (iterative)");
		System.out.println(0 + " - " + n1);
		System.out.println(1 + " - " + n2);
		fibonacci(10);
		
		n1=0; n2=1; n3=0;
		System.out.println("Printing (recursive)");
		System.out.println(0 + " - " + n1); // first number printed
		System.out.println(1 + " - " + n2); // second number printed
		fibonacciRecursive(2, 20-2); // minus 2 in count, rest of number printed
	}

	/**
	 * Calculating fibonacci number recursively.
	 * @param count
	 */
	private static void fibonacciRecursive(int start, int end) {
		if(end<=0) System.out.println("count is <=0, only input natural number");

		n3 = n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.println(start + " - " + n3 + " - " + end);
		start++;
		end--;
		if(end>0)
			fibonacciRecursive(start, end);
	}

	/**
	 * Calculate fibonacci Number iteratively
	 * @param count
	 */
	private static void fibonacci(int count) {
		if(count<=0) System.out.println("count is <= 0");
		
		for(int i=2; i<count; i++) {
			n3 =  n1+n2;
			System.out.println(i + " - "+ n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
	
	
	
	
}
