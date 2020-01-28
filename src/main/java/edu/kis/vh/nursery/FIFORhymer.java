package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datatype.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public final DefaultCountingOutRhymer TEMP = new DefaultCountingOutRhymer();
    
    public FIFORhymer() {
    }
    
    public FIFORhymer(IntArrayStack intArrayStack) {
        super(intArrayStack);
    }
    
    @Override
    public int countOut() {
        while (!callCheck())

            TEMP.countIn(super.countOut());

        int ret = TEMP.countOut();

        while (!TEMP.callCheck())
            // asdasd
            countIn(TEMP.countOut());

        return ret;
    }
}
