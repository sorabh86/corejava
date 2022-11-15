package com.github.sorabh86.designpattern.bridge;

// A refined abstraction
public class Queue<T> implements FifoCollection<T> {

	private LinkedList<T> list;
	
	// We provide the implementation instance to use
	public Queue(LinkedList<T> list) {
		this.list = list;
	}
	
	@Override
	public int size() {
		return this.list.getSize();
	}

	@Override
	public void offer(T element) {
		list.addLast(element);
	}

	@Override
	public T poll() {
		return list.removeFirst();
	}
	
}
