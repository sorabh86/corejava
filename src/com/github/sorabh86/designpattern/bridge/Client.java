package com.github.sorabh86.designpattern.bridge;

public class Client {
	public static void main(String[] args) {

		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());

		collection.offer(10);
		collection.offer(20);
		collection.offer(30);
		collection.offer(40);
		collection.offer(50);

		System.out.println("Added " + collection.size());

		System.out.println(collection.poll()); // 10
		System.out.println(collection.poll()); // 20
		System.out.println(collection.poll()); // 30
		System.out.println(collection.poll()); // 40
		System.out.println(collection.poll()); // 50

	}

	@SuppressWarnings("unused")
	private static void testLinkListAlgo() {
		LinkedList<Integer> list = new SinglyLinkedList<>();
		list.addLast(2);
		list.addLast(3);
		list.addFirst(1);
		list.addLast(9);
		list.addFirst(0);
		list.print();

		System.out.println("Remove:" + list.removeLast());
		System.out.println("Remove:" + list.removeFirst());
		list.print();
	}
}
