package com.rohit.ctci3;

public class StackUsingArray {

	private int numberOfStacks = 3;
	private int eachStackCapacity;
	private int[] values = new int[eachStackCapacity*numberOfStacks];
	private int[] stackSize = new int[numberOfStacks];
	
	public StackUsingArray(int eachStackCapacity) {
		this.eachStackCapacity = eachStackCapacity;
	}
	
	public boolean isEmpty(int stackNumber) {
		return stackSize[stackNumber] == 0;
	}
	
	public int peek(int stackNumber) {
		return values[stackNumber*eachStackCapacity];
	}
	
	public int pop(int stackNumber) {
		return values[getTopIndex(stackNumber)];
	}
	
	public void push(int stackNumber, int value) {
		
		if(stackSize[stackNumber] == eachStackCapacity) {
			return;
		}
		
		int topIndex = getTopIndex(stackNumber);
		values[topIndex + 1] = value;
		stackSize[stackNumber] = stackSize[stackNumber] + 1;
	}
	public int getTopIndex(int stackNumber) {
		int offset = stackNumber*eachStackCapacity;
		int topIndex = stackSize[stackNumber];
		return offset + topIndex - 1;
	}
	
	
}
