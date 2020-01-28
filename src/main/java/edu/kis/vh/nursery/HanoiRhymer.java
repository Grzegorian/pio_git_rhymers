package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datatype.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;
    
    public HanoiRhymer(int totalRejected) {
        this.totalRejected = totalRejected;
    }
    
    public HanoiRhymer(IntArrayStack intArrayStack, int totalRejected) {
        super(intArrayStack);
        this.totalRejected = totalRejected;
    }
    
    public int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
// alt + strzalka przełącza pomiędzy otwartymi plikami
// dasdasd