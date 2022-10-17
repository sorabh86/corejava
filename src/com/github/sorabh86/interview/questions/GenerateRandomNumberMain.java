package com.github.sorabh86.interview.questions;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumberMain {

	public static void main(String[] args) {
		// random number
		System.out.println("Method: "+Math.random());
		System.out.println("");
		
		// range randome number
		int start = 10;
		int end = 50;
		System.out.print("Method Range Algo: \n");
		for(int i=0; i<50; i++)
			System.out.print((Math.random() * (end - start + 1) + start)+" ");
		System.out.println("\n");
		
		// Random Class
		Random rand = new Random();
		System.out.println("Random Class (int): "+rand.nextInt(100000));
		System.out.println("Random Class (double): "+rand.nextDouble());
		System.out.println("Random Class (float): "+rand.nextFloat());
		System.out.println("Random Class (boolean): "+rand.nextBoolean());
		System.out.println("");
		
		// ThreadLocalRandom
		System.out.println("Class ThreadLocalRandom (int): "+ThreadLocalRandom.current().nextInt());
		System.out.println("Class ThreadLocalRandom (double): "+ThreadLocalRandom.current().nextDouble());
		System.out.println("Class ThreadLocalRandom (float): "+ThreadLocalRandom.current().nextFloat());
		System.out.println("Class ThreadLocalRandom (bool): "+ThreadLocalRandom.current().nextBoolean());
		
	}

}
