package com.github.sorabh86.programs.basic;

public class NumberPatternMain {
	public static void main(String[] args) {
//		pattern1(7);
//		pattern2(7);
//		pattern3(7);
//		pattern4(7);
//		pattern5(7);
//		pattern6(7);
//		pattern7(7);
		pattern8(9);
	}
	
	static void pattern8(int row) {
		System.out.println("Decrement Down-Left Number Pattern:");
		
		boolean flag = true;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(flag)
					System.out.print("1");
				else 
					System.out.print("0");
				flag = !flag;
			}
			
			System.out.println();
			if(row%2==0)
				flag = !flag;
		}
	}
	
	static void pattern7(int row) {
		System.out.println("Decrement Down-Left Number Pattern:");
		
		for(int i=1; i<=row; i++) {
			
			for(int j=i; j>=1; j--)
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
	
	static void pattern6(int row) {
		System.out.println("Decrement Column Number Pattern:");
		
		for(int i=row; i>0; i--) {
			
			for(int j=row; j>=i; j--)
				System.out.print(j+" ");
			
			System.out.println();
		}
	}
	
	static void pattern5(int row) {
		System.out.println("Downward increment Number Pattern:");
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=i; j++)
				System.out.print(i+" ");
			
			System.out.println();
		}
	}
	
	static void pattern4(int row) {
		System.out.println("Palindrome Diamond Number Pattern:");

		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= row - i; j++) 
				System.out.print(" ");
			
			for (int k = i; k >= 1; k--) 
				System.out.print(k);
			
			for (int l = 2; l <= i; l++) 
				System.out.print(l);
			
			System.out.println();
		}
		
		for (int i = (row-1); i >= 1; i--) {
			
			for (int j = 0; j <= row-i-1; j++) 
				System.out.print(" ");
			
			for (int k = i; k >= 1; k--) 
				System.out.print(k);
			
			for (int l = 2; l <= i; l++) 
				System.out.print(l);
			
			System.out.println();
		}
	}

	static void pattern3(int row) {
		System.out.println("Increment Down Upper Pyrimid Number Pattern:");

		for (int i = 0; i <= row; i++) {

			int n = 1, j;
			for (j = 1; j <= 2 * (row - i); j++)
				System.out.print(" ");

			for (j = 0; j <= i; j++) {
//				System.out.print(" "+n+" ");				
				System.out.printf("%4d", n);
				n = n * (i - j) / (j + 1);
			}

			System.out.println();
		}
	}

	static void pattern2(int row) {
		System.out.println("Increment Number Pattern:");

		for (int i = 1, count = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" " + count++ + " ");
			}

			System.out.println();
		}
	}

	static void pattern1(int row) {
		System.out.println("Increment Left Column Number Pattern:");

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}

			System.out.println();
		}

	}

}
