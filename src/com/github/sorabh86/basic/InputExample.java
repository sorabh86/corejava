package com.github.sorabh86.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) {
		
		int num1, num2, output;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.println("Enter a Number: ");
			num1 = Integer.parseInt(br.readLine());
			System.out.println("Enter another Number: ");
			num2 = Integer.parseInt(br.readLine());
			output = num1 + num2;
			System.out.println("Result is: "+ output);
		} catch (NumberFormatException | IOException e) {
			System.err.println("Invalid Number.");			
		}
		
	}

}
