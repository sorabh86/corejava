package com.github.sorabh86.basic;

import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, copyNum;
		
		try {
			System.out.println("Check Palindrome Number");
			System.out.print("Enter your number: ");
			num = sc.nextInt();
			sc.close();
		} catch (Exception e) {
			System.out.println("Invalid, Try Again!!!");
			main(null);
			return;
		}
		
		copyNum = num;
		int res = 0;
		while(copyNum > 0) {
			int a = copyNum % 10;
			res = (res*10)+a;
			copyNum = copyNum / 10;
//			System.out.print("a:"+a+" , ");
//			System.out.print("b:"+b+" , ");
//			System.out.println("copyNum:"+copyNum+" num:"+num);
		}
		
		if(num == res)
			System.out.println(num+" is a palindrome number.");
		else 
			System.out.println(num+" is not a palindrome number.");
		
	}

}
