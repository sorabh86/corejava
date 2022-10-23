package com.github.sorabh86.basic;

import java.util.Scanner;

public class MultiplicationTableExample {
	public static void main(String[] args) {
		
		System.out.println("--- Print a Table ---");
		System.out.println("Please Enter a Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Table of "+n+" number is");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = "+(n*i));
		}
		
		sc.close();
	}
}
