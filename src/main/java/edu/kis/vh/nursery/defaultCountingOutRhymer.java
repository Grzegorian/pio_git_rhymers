package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private final int SIZE = 12;
    private final int MAX = 11;
    private final int MINUS = -1;

    private final int[] NUMBERS = new int[SIZE];

    public int total = MINUS;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaBoo() {
        if (callCheck())
            return MINUS;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS;
        return NUMBERS[total--];
    }

}
