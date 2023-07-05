package com.github.sorabh86.threads.create;

public class RunnableThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new Thread(new Runnable() {	
			@Override
			public void run() {				
				System.out.println("We are in thread: "+Thread.currentThread().getName());
				System.out.println("Current Priority: "+Thread.currentThread().getPriority());
			}
		});
		// Setting thread name
		thread.setName("Worker1");
		// Setting priority
		thread.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("We are executing thread: "+Thread.currentThread().getName()+" -------- before start thread");
		thread.start();
		System.out.println("We are executing thread: "+Thread.currentThread().getName()+" -------- after start thread");
		
		// Thread will not schedule for 10seconds
		Thread.sleep(10000);
	}
}
