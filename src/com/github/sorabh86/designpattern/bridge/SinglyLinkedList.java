package com.github.sorabh86.designpattern.bridge;

// A concrete implementor
// This implementation is a classic LinkedList using nodes
public class SinglyLinkedList<T> implements LinkedList<T> {
	
	private class Node {
		private Object data;
		private Node next;
		private Node prev;
		
		private Node(Object data) {
			this.data = data;
		}
	}

	private int size;
	private Node top;
	private Node last;
	
	@Override
	public void addFirst(T element) {
		if(top==null && last==null) {
			last = top = new Node(element);
		} else {
			Node temp = top;
			top = new Node(element);
			top.next = temp;
		}
		size++;
	}

	@Override
	public T removeFirst() {
		if(top==null) return null;
		
		@SuppressWarnings("unchecked")
		T temp = (T)top.data;
		
		if(top.next != null) {
			top = top.next;
		} else {
			top = null;
			last = null;
		}
		size--;
		return temp;
	}

	@Override
	public void addLast(T element) {
		if(top==null && last==null) {
			last = top = new Node(element);
		} else {
			System.out.println("last:"+last.data);
			Node temp = last;
			last = new Node(element);
			last.prev = temp;
			temp.next = last;
		}
		
		size++;
	}

	@Override
	public T removeLast() {
		if(last==null) return null;
		
		@SuppressWarnings("unchecked")
		T temp = (T)last.data;
		
		last = null;
		last.prev.next = null;
		
		size--;
		return temp;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public void print() {
		Node temp = top;
		System.out.print("["+temp.data);
		while(temp.next!=null) {
			temp = temp.next;
			System.out.print(","+temp.data);
		}
		System.out.println("]");
	}

}
