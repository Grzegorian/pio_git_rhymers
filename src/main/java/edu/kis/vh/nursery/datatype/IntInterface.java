package edu.kis.vh.nursery.datatype;

public interface IntInterface {
	int EMPTY_RHYMER_INDICATOR = 0;
	
	void push(int in);
	
	boolean isEmpty();
	
	boolean isFull();
	
	int top();
	
	int pop();
}
