package com.github.sorabh86.threads.pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}

public class ThreadPoolExample {
    public static void main(String[] args) {
    	int numOfProcessor = Runtime.getRuntime().availableProcessors();
    	System.out.println("Total cores: "+numOfProcessor);
    	
        Executor executor = Executors.newFixedThreadPool(numOfProcessor);
        for (int i = 0; i < numOfProcessor; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        ((ExecutorService) executor).shutdown();
        while (!((ExecutorService) executor).isTerminated()) {
        	//System.out.println("Closed: "+Thread.currentThread().getName());
        }
        System.out.println("Finished all threads");
    }
}
