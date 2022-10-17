package com.github.sorabh86.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintMatrixExample {
	
	static BufferedReader br;

	public static void main(String[] args) {
		br = new BufferedReader(new InputStreamReader(System.in));
		welcomeScreen();
	}
	
	static void welcomeScreen() {
		System.out.println("\n");
		System.out.println("----------------- Matrix Example -----------------------");
		System.out.println("Choose a Programs:");
		System.out.println("1. Print Matrix");
		System.out.println("2. Add Matrices");
		System.out.println("3. Substract Matrices");
		System.out.println("0. Exit Program");
		
		try {
			switch(br.readLine()) {
				case "1": printMatrix();
					break;
				case "2": addMatrix();
					break;
				case "3": substractMatrix();
					break;
				case "0": exitProgram("Closed");
					break;
				default: System.out.println("Try Again!!!");
			}
		} catch (IOException e) {
			exitProgram("Input value are invalid!!");
		}
		
	}
	
	static int[][] inputMatrix() {
		int[][] mat = new int[2][2];
		int x,y,n;
		
		for(x=0, n=1; x<2; x++)
			for(y=0; y<2; y++) {
				System.out.print("Your Numer "+n+": ");
				n++;
				try {
					mat[x][y] = Integer.parseInt(br.readLine());
				} catch (NumberFormatException | IOException e) {
					System.out.println("Invalid Number!!");
					y--; n--;
					continue;
				}	
			}
		return mat;
	}
	
	static void exitProgram(String str) {
		System.out.println("Program Exit: "+str);
		System.exit(0);
	}

	static void printMatrix() {
		System.out.println("Running Matrix Printing:");
		int num1[][] = new int[3][3];
		// taking input to user
		System.out.println("Please enter 9 integer value:");
		for(int x=0, n=1; x<3; x++) {
			for(int y=0; y<3; y++) {
				try {
					System.out.print("Enter Number "+(n)+": ");
					n++;
					num1[x][y] = Integer.parseInt(br.readLine());
				} catch (NumberFormatException | IOException e) {
					System.out.println("Invalid Number!!");
					y--; n--;
					continue;
				}
			}
		}
		
		System.out.println("Your Matrix is: ");
		// printing matrix
		for(int x=0; x<num1.length; x++) {
			System.out.print("|");
			for(int y=0; y<num1[x].length; y++)
				System.out.print(" "+num1[x][y]+" ");
			System.out.println("|");
		}
		
		welcomeScreen();
	}
	static void addMatrix() {
		System.out.println("Running Matrix Addition 2x2:");
		int[][] mat1 = new int[2][2];
		int mat2[][] = new int[2][2];
		int res[][] = new int[2][2];
		
		int x,y,n;
		
		System.out.println("Please Enter First Matrix");
		mat1 = inputMatrix();
		
		System.out.println("Please Enter Second Matrix ");
		mat2 = inputMatrix();
		
		// calculate Matrix addition
		System.out.println("Result:");
		String result="";
//		String mat1Str = "[";
//		String mat2Str = "[";
//		String resStr = "[";
		for(x=0; x<2; x++) {
//			mat1Str += "(";
//			mat2Str += "(";
//			resStr += "(";
			String s1 = "| ";
			String s2 = "| ";
			String s3 = "| ";
			
			for(y=0; y<2; y++) {
				res[x][y] += mat1[x][y] + mat2[x][y];
				s1 += mat1[x][y]+' ';
				s2 += mat2[x][y]+' ';
				s3 += res[x][y]+' ';
//				mat1Str += mat1[x][y]+",";
//				mat2Str += mat2[x][y]+",";
//				resStr += res[x][y]+",";
			}
			result += s1 +" | + " +s2 + " | = "+s3+" |\n";
//			mat1Str += ")";
//			mat2Str += ")";
//			resStr += ")";
		}
//		mat1Str += "]";
//		mat2Str += "]";
//		resStr += "]";
		
//		System.out.println(mat1Str+" + "+mat2Str+" = "+resStr);
		System.out.println(result);
		
		welcomeScreen();
	}
	
	static void substractMatrix() {
		System.out.println("Running Matrix Substraction 2x2:");
		int[][] mat1 = new int[2][2];
		int mat2[][] = new int[2][2];
		int res[][] = new int[2][2];
		
		System.out.println("Please Enter First Matrix");
		mat1 = inputMatrix();
		System.out.println("Please Enter Second Matrix");
		mat2 = inputMatrix();
		
		// calculation
		System.out.println(mat1.length);
		
		welcomeScreen();
	}

}
