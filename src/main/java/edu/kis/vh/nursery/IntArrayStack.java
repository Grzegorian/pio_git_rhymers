package edu.kis.vh.nursery;

public class IntArrayStack  {
	
	private final int MAX_SIZE = 12;
	private final int EMPTY_RHYMER_INDICATOR = -1;
	private final int DEFAULT_VALUE = -1;
	
	private final int[] number = new int[MAX_SIZE];
	
	public int total = EMPTY_RHYMER_INDICATOR;
	
	public void countIn(int in) {
		if (!isFull())
			number[++total] = in;
	}
	
	public boolean callCheck() {
		return total == EMPTY_RHYMER_INDICATOR;
	}
	
	public boolean isFull() {
		return total == MAX_SIZE - 1;
	}
	
	protected int peekaBoo() {
		if (callCheck())
			return DEFAULT_VALUE;
		return number[total];
	}
	
	public int countOut() {
		if (callCheck())
			return DEFAULT_VALUE;
		return number[total--];
	}
	
}
