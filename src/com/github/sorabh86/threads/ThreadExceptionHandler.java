package com.github.sorabh86.threads;

public class ThreadExceptionHandler {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				throw new RuntimeException("Intentional Misbehaviour Exception");
			}
		});
		thread.setName("Misbehaving Thread");
		
		// Handle exceptions from thread
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("A critical error happened in thread "+t.getName()+" the error is "+e.getMessage());
			}
		});
		
		thread.start();
	}
}
