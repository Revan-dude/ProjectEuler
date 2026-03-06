package euler_0000;

import java.util.concurrent.Callable;

public class EulerTask implements Callable<Long> {

    public EulerTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    private int start;
    private int end;

    @Override
    public Long call() throws Exception {
        long sumOdd = 0L;

        for(long i = start; i <= end; i++) {
            if((i * i) % 2 != 0) {
                sumOdd += i * i;
            }
        }

        return sumOdd;
    }

}
