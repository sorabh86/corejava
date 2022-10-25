package com.github.sorabh86.programs.number;

public class ReverseNumberExample {
	public static void main(String[] args) {
		reverseWhile(89543);
		
		reverseLoop(494832);
		
		int num = 12345;
		int rev = reverseRecursive(num);
		System.out.println(num+" is number, it reverse is "+rev);
	}
	static int res = 0;
	private static int reverseRecursive(int num) {
		if(num == 0) {
			return res;
		}
		if(num > 0) {
			int temp = num % 10;
			res = (res * 10) + temp;
			reverseRecursive(num/10);
		}
		return res;
//			return (num % 10) * (reverseRecursive(num/10));
	}
	private static void reverseLoop(int num) {
		int rev=0;
		for(int k=num; k!=0; k=k/10) {
			rev = (rev * 10) + (k % 10);
		}
		System.out.println("LOOP: The given is "+num+" and reverse is "+rev);
		
	}
	private static int reverseWhile(int num) {
		int num1 = num;
		int reverse = 0;
		while(num1 != 0) {
			int remainder = num1 % 10;
			reverse = (reverse * 10) + remainder;
			num1 /= 10;
		}
		System.out.println("WHILE: The given is "+num+" and reverse is "+reverse);
		return reverse;
	}
}
