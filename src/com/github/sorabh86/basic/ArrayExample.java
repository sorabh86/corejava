package com.github.sorabh86.basic;

import java.util.Arrays;

import com.github.sorabh86.basic.utils.ArrayPrint;

public class ArrayExample {

	public static void main(String[] args) {
		
		int x[] = {3,8,4,-3,4,8,2,9,-7};
		ArrayPrint.print("Your Array is:", x);
		
		// Array Sort Method
		int lower = 0; //start index of array
		int upper = x.length; //end index of array
		sort(x, lower, upper);
		ArrayPrint.print(x);
		
		// Sorting Array
		Arrays.sort(x);
		ArrayPrint.print("The Sorted Array is:", x);
		System.out.println();
		
		// Search Array
		int number = 8;
		int index = Arrays.binarySearch(x, number);
		System.out.println(number+" is found at the index: "+index);
	}
	
	/**
	 * This is a MergeSort Algorithm - divide and conquer
	 * @param x :array
	 * @param lower :lower index of array
	 * @param upper :upper index of array
	 */
	private static void sort(int[] x, int lower, int upper) {
		int length = upper - lower;
		
		if(length <= 1) 
			return;
		
		
	}

	

}
