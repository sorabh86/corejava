package com.github.sorabh86.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelConsonantExample {
	
	static char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Print a alphabet to check between Vowel/Consonant");
			System.out.print("Your Alphabet: ");
			char c = (char)br.read();
			
			for (int i = 0; i < vowels.length; i++) {
				if(vowels[i] == c) {
					System.out.println(c+" is a Vowel.");
					System.exit(0);
				}
			}
			System.out.println(c+" is a Consonant.");
			
		} catch (IOException e) {
			System.err.println("No Stream Found!!");
		}
	}

}
