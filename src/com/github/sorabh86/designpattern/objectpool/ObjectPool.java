package com.github.sorabh86.designpattern.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Supplier;
import java.util.stream.IntStream;

// The object pool, here we are pre-creating all objects.
public class ObjectPool <T extends IPoolable> {
	
	private BlockingQueue<T> availablePool;
	
	public ObjectPool(Supplier<T> creator, int count) {
		availablePool = new LinkedBlockingDeque<>();
//		for(int i=0; i<count; i++) {
//			availablePool.offer(creator.get());
//		}
		IntStream.range(0, count).forEach(i->availablePool.offer(creator.get()));
	}
	
	// get method must decide what to do if pool is empty.
	// It can create new object and return that or wait until on becomes available
	public T get() {
		System.out.println("get: "+availablePool.toString());
		try {
			return availablePool.take();
		} catch(InterruptedException e) {
			System.err.println("take() was interrupted");
		}
		return null;
	}
	
	public void release(T obj) {
		System.out.println("release: "+availablePool.toString());
		obj.reset();
		try {
			availablePool.put(obj);
		} catch (InterruptedException e) {
			System.err.println("put() was interrupted");
		}
	}
}
