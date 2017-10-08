package com.rohit.ctci3;

public class Queue {
	private static class Node{
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int peek() {
		if(head == null) {
			return -1;
		}
		return head.data;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		
		if(tail != null) {
			tail.next = node;
		}
		tail = node;
		
		if(head == null) {
			head = node;
		}
	}
	
	public int remove() {
		if(head == null) {
			return -1;
		}
		int data = head.data;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		return data;
	}
	
	public void printQueue() {
		Node temp = head;
		System.out.println("Printing queue");
		while(temp!=null) {
			System.out.print(temp.data);
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");
			}
		}
		System.out.println();
		
	}
}
