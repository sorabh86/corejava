package com.github.sorabh86.basic;

import java.util.Scanner;

public class CalculateAreaExample {

	public static void main(String[] args) {
		areaOfTriangle();
	}

	static void areaOfTriangle() {
		double w,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Area of Triangle ---");
		System.out.print("Enter width: ");
		w = sc.nextDouble();
		System.out.print("Enter height: ");
		h = sc.nextDouble();
		
		double area = (w*h)/2;
		System.out.println("Area of triangle: "+ area);
	}
	
	

}
