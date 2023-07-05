package com.github.sorabh86.threads.create;

class WorkerThread extends Thread {

	@Override
	public void run() {
		System.out.println("running: "+this.getName()+" id: "+this.getId());
	}
	
}

public class MainThread {
	public static void main(String[] args) {
		Thread th = new WorkerThread();
		th.start();
	}
}
