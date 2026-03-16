package euler_0002;

import java.util.concurrent.Callable;

public class EulerTask implements Callable<Long> {

    private long fibNum;
    private long sum;
    private long max;

    public EulerTask(long max) {
        this.max = max;
    }

    @Override
    public Long call() throws Exception {
        long help = 1;
        long help2 = 0;
        sum = 0;

        while (fibNum < max){
            if(fibNum % 2 == 0 && fibNum < 4_000_000) {
                sum += fibNum;
            }

            fibNum = help + help2;
            help2 = help;
            help = fibNum;
        }

        return sum;
    }
}
