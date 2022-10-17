package com.github.sorabh86.programs.basic;

public class ArmstrongMain {
	
	public static void main(String[] args) {
		
		int num = 0;
		while(++num < 10000) {
			if(isArmstrong(num))
			System.out.println(num+(isArmstrong(num)?" is Armstrong Number":" is not Armstrong Number"));
		}
	}
	private static boolean isArmstrong(int num) {
		int digit = 0;
		
		int temp = num;
		while(temp>0) {
			temp = temp/10;
			digit++;
		}
		temp = num;
		int sum = 0;
		while(temp>0) {
			// get last digit
			int lastNum = temp % 10;
			sum += Math.pow(lastNum, digit);
			// remove last digit
			temp = temp / 10;
		}
		
		if(sum == num) return true;
		else return false;
	}
}
