package com.github.sorabh86.uniqueid;

import java.util.Date;

class UniqueIdGenerator {
	
}

public class RandomNumberByDate {
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		int unique_id= (int) ((new Date().getTime() / 1000L) % Integer.MAX_VALUE); 
		System.out.println(unique_id);
	}
}
