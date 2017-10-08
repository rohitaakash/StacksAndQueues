package com.rohit.ctci3;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(56);
		queue.add(28);
		queue.add(95);
		queue.add(39);
		queue.add(87);		
		queue.printQueue();
		
		queue.remove();
		queue.printQueue();
		
		Stack stack = new Stack();
		
		stack.push(56);
		stack.push(28);
		stack.push(95);
		stack.push(39);
		stack.push(87);		
		stack.printStack();
		
		stack.pop();
		stack.printStack();
		
		StackWithMin stackMin = new StackWithMin();
		stackMin.push(56);
		stackMin.push(95);
		stackMin.push(39);
		stackMin.push(87);
		stackMin.push(28);
		stackMin.printStack();
		System.out.println(stackMin.min());
		
		stackMin.pop();
		stackMin.printStack();		
		System.out.println(stackMin.min());
		
		SetOfStacks set = new SetOfStacks();
		set.push(56);
		set.push(95);
		set.push(39);
		set.push(87);
		set.push(28);
		set.push(56);
		set.push(95);
		set.push(39);
		set.push(87);
		set.push(28);
		set.printSet();
		set.pop();
		set.printSet();
		set.popAtIndex(0);
		set.printSet();
			
	}
}
