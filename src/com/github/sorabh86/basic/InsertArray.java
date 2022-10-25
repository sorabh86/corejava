package com.github.sorabh86.basic;

import java.util.Scanner;

import com.github.sorabh86.basic.utils.ArrayPrint;

public class InsertArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Choose the size of array.
		System.out.println("Please, define size of an array: ");
		int size = sc.nextInt();
		
		// create your array
		int arr[] = new int[size];
		ArrayPrint.print("Your array ", arr);
		
		// Insert elements in array one by one [iterative]
		System.out.println("Please, insert elements of array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print("Item "+i+": ");
			if (sc.hasNextInt())
				arr[i] = sc.nextInt();
			else
				System.out.print("Try Again:" + i);
		} 
		ArrayPrint.print(arr);
		
		// Insert element by picking index
		System.out.print("Please, Choose a number between 0 to "+(size-1)+": ");
		int index = sc.nextInt();
		System.out.print("Enter a Value for index["+index+"]: ");
		int value = sc.nextInt();
		arr[index] = value;
		ArrayPrint.print("Your Update Array is ", arr);
		
		sc.close();
		

	}

}
