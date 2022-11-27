package com.github.sorabh86.basic._03utils;

public class ArrayPrint {
	public static void print(String str, int[] x) {
		System.out.print(str+" [");
		
		for(int i=0; i<x.length; i++) 
			System.out.print(x[i]+(i!=(x.length-1)?",":""));
		
		System.out.println("]");
	}
	public static void print(int[] x) {
		System.out.print("[");
		
		for(int i=0; i<x.length; i++) 
			System.out.print(x[i]+(i!=(x.length-1)?",":""));
		
		System.out.println("]");
	}
}
