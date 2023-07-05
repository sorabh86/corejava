package com.github.sorabh86.basic._05dates;

import java.util.Date;

public class DateObject {
	
	public static void main(String[] args) {
		Date dt = new Date();
		
		System.out.println(dt.toString());
		System.out.println(dt.toGMTString());
		System.out.println(dt.toLocaleString());
		System.out.println(dt.toInstant());
	}
}
