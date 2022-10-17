package com.github.sorabh86.programs.basic;

public class PrimeNumberMain {
	public static void main(String[] args) {
		for(int i=0; i<30; i++) {
			System.out.print("<"+i+">");

			if(isPrimeNumber(i)) 
				System.out.print(i+" is prime.(default)");
			if(isPrimeNumber2(i)) 
				System.out.print(i+" is prime.(alternate)");
			
			System.out.print("</"+i+"> \n");
		}
	}

	private static boolean isPrimeNumber(int n) {
		if(n <= 1) return false;
		
		double m = n/2;
		System.out.print("default: "+ m);
		
		for(int i=2; i <= m; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	private static boolean isPrimeNumber2(int n) {
		if(n <= 1) return false;
		
		double m = Math.sqrt(n);
		System.out.print("alternate: "+ m);
		
		for(int i=2; i <= m; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
