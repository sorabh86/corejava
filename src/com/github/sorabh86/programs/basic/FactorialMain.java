package com.github.sorabh86.programs.basic;

public class FactorialMain {
	public static void main(String[] args) {
		int num = 9;
		System.out.println("Factorial of "+num+" is "+factorial(num));
		System.out.println("Factorial of "+num+" is "+factorialRecursive(num));		
	}

	private static int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	static int factorialRecursive(int num) {
		if(num==0) return 1;
		else return (num*factorialRecursive(num-1));
	}
}
