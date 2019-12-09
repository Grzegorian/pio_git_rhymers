package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public final defaultCountingOutRhymer TEMP = new defaultCountingOutRhymer();

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
