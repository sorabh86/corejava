package com.github.sorabh86.basic;

import java.util.Scanner;

public class FibonacciExample {

	public static void main(String[] args) {
		int range;
		System.out.println("Input range of Fibonacci Number");
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		try {
			range = sc.nextInt();
			sc.close();
		} catch(Exception e) {
			main(null);
			return;
		}
		
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		
		for(int i=2; i<range; i++) {
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}

}
