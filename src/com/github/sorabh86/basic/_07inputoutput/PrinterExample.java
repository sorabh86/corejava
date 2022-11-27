package com.github.sorabh86.basic._07inputoutput;

import java.io.PrintWriter;

public class PrinterExample {

	public static void main(String[] args) {
		// Basic print
		System.out.println("Hello World");
		System.out.println();
		
		// Print using PrintWriter
		PrintWriter pw = new PrintWriter(System.out, true);
		String str = PrintWriter.class.toString();
		pw.println("This is a "+str);
		pw.println();

		int num1 = 15, num2 = 9, result1, result2, result3, result4;
		// Basic arthimetic operations
		result1 = num1 + num2;
		result2 = num1 * num2;
		result3 = num1 / num2;
		result4 = num1 - num2;
		System.out.println("Addition ("+num1+"+"+num2+") = "+ result1);
		System.out.println("Multiplication ("+num1+"X"+num2+") = "+ result2);
		System.out.println("Division ("+num1+"/"+num2+") = "+ result3);
		System.out.println("Subtraction ("+num1+"-"+num2+") = "+ result4);
	}

}
