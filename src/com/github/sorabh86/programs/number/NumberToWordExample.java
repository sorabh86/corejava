package com.github.sorabh86.programs.number;

public class NumberToWordExample {
	
	static String[] oneDigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
	static String[] twoDigit = {"", ""};
	static String[] multipleOfTens;
	

	public static void main(String[] args) {
		char[] num1 = "1234".toCharArray();
		for(int i=0; i<num1.length; i++)
			System.out.println(num1[i]);
		
		System.out.println(num1);
	}

}
