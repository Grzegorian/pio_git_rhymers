package edu.kis.vh.nursery.datatype;

public class IntLinkedList implements IntInterface {
	
	private Node last;
	
	@Override
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	
	@Override
	public boolean isEmpty() {
		return last == null;
	}
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_RHYMER_INDICATOR;
		return last.value;
	}
	
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_RHYMER_INDICATOR;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
	
}
