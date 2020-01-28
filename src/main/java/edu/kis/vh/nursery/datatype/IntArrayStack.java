package edu.kis.vh.nursery.datatype;

public class IntArrayStack implements IntInterface {
	
	private final int MAX_SIZE = 12;
	
	private final int[] number = new int[MAX_SIZE];
	
	private int amountOfNumbers = EMPTY_RHYMER_INDICATOR;
	
	@Override
	public void push(int in) {
		if (!isFull())
			number[++amountOfNumbers] = in;
	}
	
	@Override
	public boolean isEmpty() {
		return amountOfNumbers == EMPTY_RHYMER_INDICATOR;
	}
	
	@Override
	public boolean isFull() {
		return amountOfNumbers == MAX_SIZE - 1;
	}
	
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_RHYMER_INDICATOR;
		return number[amountOfNumbers];
	}
	
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_RHYMER_INDICATOR;
		return number[amountOfNumbers--];
	}
	
}
