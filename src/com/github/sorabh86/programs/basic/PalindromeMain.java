package com.github.sorabh86.programs.basic;

public class PalindromeMain {
	public static void main(String[] args) {
		int number1 = 434;
		System.out.println(isPalindrome(number1)?number1+" is a palindrome":number1+" is not a palindrome");
		int number2 = 4343;
		System.out.println(isPalindrome2(number2)?number2+" is a palindrome":number2+" is not a palindrome");
	}

	private static boolean isPalindrome(int n) {
		int nn = n, sum = 0;
		
		while(n>0) {
			int r = n%10; // remainder
			sum = (sum*10) + r;
			n = n/10;
		}
		
		if(nn==sum) return true;
		else return false;
	}
	
	private static boolean isPalindrome2(int n) {
		String nn = String.valueOf(n); // Convert number to String
		String rn = ""; // reverse string
		int len = nn.length();
		
		for(int i=len-1; i>=0; i--) {
			rn = rn + nn.charAt(i);
		}
		
		if(nn.equals(rn)) return true;
		else return false;
	}
	
	
}
