package com.github.sorabh86.dsa.rotatearray;
/* Rotate an array of n elements to the 
right by k steps. 
For example, with n = 7 and k = 3, 
the array [1,2,3,4,5,6,7] is 
rotated to [5,6,7,1,2,3,4] */

public class RotateArrayProg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArray(arr);
        rotate(arr, 3);
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
    	System.out.print("[ ");
    	for(int i=0; i<arr.length; i++) {
    		System.out.print(arr[i]);
    		if(i!=arr.length-1) System.out.print(", ");
    	}
    	System.out.println(" ]");
    }

    // brute force rotate
    public static void rotate(int[] nums, int rotateCount) {
        if(rotateCount > nums.length)
            rotateCount = rotateCount % nums.length;

        int[] result = new int[nums.length];
        for(int i=0; i < rotateCount; i++){
            result[i] = nums[nums.length-rotateCount+i];
        }

        int j=0;
        for(int i=rotateCount; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
    }

    // bubble rotate
    public static void rotatebuble(int[] arr, int order) {

    }
}