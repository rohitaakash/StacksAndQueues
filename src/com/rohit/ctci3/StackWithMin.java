package com.rohit.ctci3;

public class StackWithMin {
	private static class Node{
		private int data;
		private int min;
		private Node next;
		private Node(int data, int min) {
			this.data = data;
			this.min = min;
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
		int min = data;
		if(top != null) {
			if(data < top.min) {
				min = data;
			}else {
				min = top.min;
			}
		}
		Node node = new Node(data, min);
		node.next = top;
		top = node;
	}
	
	public int min() {
		return top.min;
	}
	
	public int pop() {
		if(top == null) {
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}
	
	public void printStack() {
		Node temp = top;
		System.out.println("Printing stack");
		while(temp != null) {
			System.out.println(temp.data+ ", " +temp.min);
			temp = temp.next;			
		}
	}
}
