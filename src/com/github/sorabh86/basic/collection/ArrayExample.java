package com.github.sorabh86.basic.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,6,7,-2,9,8);
		
		reverseArray(list);
		minArray(list);
		maxArray(list);
		
		mergeTwoArray();
	}

	private static void mergeTwoArray() {
		String arr1[] = {"He", "She", "You", "We", "They"};
		String arr2[] = {"I", "Us", "X", "Y", "Z"};
		
		List<String> list = new ArrayList<>(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		
		Object[] arr3 = list.toArray();
		System.out.println(Arrays.toString(arr3));
	}

	private static void maxArray(List<Integer> list) {
		System.out.println("Maximum Value in Array: "+Collections.max(list));
	}

	private static void minArray(List<Integer> list) {
		System.out.println("Minimum Value in Array: "+Collections.min(list));
	}

	private static void reverseArray(List<Integer> list) {
		
		System.out.println("Before Reverse: "+list.toString());
		Collections.reverse(list);
		System.out.println("After Reverse: "+list.toString());
	}
	
	
}
