package com.github.sorabh86.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorsExample {
	private BufferedReader br;

	public OperatorsExample() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public int getInputInt(String message) {
		System.out.print(message);
		try {
			return Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			return getInputInt("Invalid Number, Enter again: ");
		}
	}
	public String getInputString(String message) {
		System.out.print(message);
		try {
			return br.readLine();
		} catch (IOException e) {
			return getInputString("Invalid String, Enter again: ");
		}
	}
	private int[] getNumbers() {
		int res[] = new int[2];
		res[0] = getInputInt("Please Enter first Number: ");
		res[1] = getInputInt("Please Enter second Number: ");
		return res;
	}
	
	public void add() {
		int[] num = getNumbers();
		System.out.println(num[0]+" + "+num[1]+" = "+(num[0]+num[1]));
	}

	public void substract() {
		int[] num = getNumbers();
		System.out.println(num[0]+" - "+num[1]+" = "+(num[0]-num[1]));
	}

	public void multiply() {
		int[] num = getNumbers();
		System.out.println(num[0]+" X "+num[1]+" = "+(num[0]*num[1]));
	}

	public void divide() {
		int[] num = getNumbers();
		System.out.println(num[0]+" / "+num[1]+" = "+(num[0]/num[1]));
	}

	public static void main(String[] args) {
		OperatorsExample oe = new OperatorsExample();
		
		while(true) {
			System.out.println("Commandline Calculator");
			int operation = oe.getInputInt("1: Addition \n"
					+ "2: Substraction \n"
					+ "3: Division \n"
					+ "4: Multiplication \n"
					+ "0: Exit Program \n"
					+ "Choose Operation: ");
			switch(operation) {
				case 1: oe.add();
					oe.getInputString("Press enter for Main Menu: ");
					break;
				case 2: oe.substract();
					oe.getInputString("Press enter for Main Menu: ");
					break;
				case 3: oe.divide();
					oe.getInputString("Press enter for Main Menu: ");
					break;
				case 4: oe.multiply();
					oe.getInputString("Press enter for Main Menu: ");
					break;
				case 0: System.out.println("Program Exit");
					System.exit(0);
			}
		}
		
	}

}
