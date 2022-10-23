package com.github.sorabh86.basic;

public class ClassLoaderExample {
	
	public static void main(String[] args) {
		
		Class<ClassLoaderExample> c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());
		
		System.out.println(String.class.getClassLoader());
	}
}
