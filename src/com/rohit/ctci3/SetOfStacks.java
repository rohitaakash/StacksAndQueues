package com.rohit.ctci3;

import java.util.ArrayList;

public class SetOfStacks extends Stack{

	private ArrayList<Stack> setOfStacks = new ArrayList<>();
	private int threshold = 5;
	private int sizeOfSet;
	private int elements;
	
	public boolean isEmpty() {
		return setOfStacks.isEmpty();
	}
	
	public void push(int data) {
		if(isEmpty() || elements%threshold == 0) {
			sizeOfSet++;
			Stack stack = new Stack();
			stack.push(data);
			setOfStacks.add(stack);
			setOfStacks.get(sizeOfSet-1).printStack();
		}else {
			setOfStacks.get(sizeOfSet-1).push(data);
		}
		elements++;
	}
	
	public int pop() {
		if(setOfStacks.get(sizeOfSet-1).isEmpty()) {
			setOfStacks.remove(sizeOfSet-1);
			sizeOfSet--;
		}
		elements--;
		return setOfStacks.get(sizeOfSet-1).pop();
		
	}
	
	public int popAtIndex(int index) {
		if(setOfStacks.get(index).isEmpty()) {
			return -1;
		}
		elements--;
		return setOfStacks.get(index).pop();
	}
	
	public void printSet() {
		for(Stack s: setOfStacks) {
			s.printStack();
		}
	}
	
	
}
