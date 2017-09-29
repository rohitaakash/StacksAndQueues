package com.rohit.ctci3;

public class Stack {
	private static class Node{
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
			this.next=null;
		}
	}
	
	private Node top;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		if(top == null) {
			return -1;
		}
		
		return top.data;
	}
	
	public void push(int data) {		
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	public int pop() {
		if(top == null) {
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}
	
}
