package com.github.sorabh86.basic._07inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Console application that take a radius of a circle and tell you area of circle.
public class CircleArea {
	public static void main(String[] args) {
		int radius = 0;
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("Enter Radius of Circle: ");
			
			radius = Integer.parseInt(br.readLine());
			
			double area = Math.PI * (radius * radius);
			
			System.out.println("Area of circle: "+area);
			
			double circumfrance = 2 * Math.PI * radius;
			
			System.out.println("Circumfrance (or) perimeter of circle: "+ circumfrance);
			
			
		} catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
