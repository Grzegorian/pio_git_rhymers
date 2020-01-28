package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datatype.IntArrayStack;

public class DefaultCountingOutRhymer {
	IntArrayStack intArrayStack;
	
	public DefaultCountingOutRhymer() {
		this.intArrayStack = new IntArrayStack();
	}
	
	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}
	
	public void countIn(int in) {
		intArrayStack.push(in);
	}
	
	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}
	
	public boolean isFull() {
		return intArrayStack.isFull();
	}
	
	public int peekaBoo() {
		return intArrayStack.top();
	}
	
	public int countOut() {
		return intArrayStack.pop();
	}
}
