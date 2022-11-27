package com.github.sorabh86.basic._08algo;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		int number, res=1;
		
		System.out.print("Please enter a number: ");
		Scanner sc = new Scanner(System.in);
		try {
			number = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Try Again with a number");
			main(null);
			sc.close();
			return;
		}
		
		if(number<0) {
			System.out.println("Please Enter Positive number!!!");
		} else {
			for (int i = 1; i <= number ; i++) {
				res *= i;
			}
			System.out.println("Result: "+res);
		}
		
		sc.close();
	}

}
