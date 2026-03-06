package euler_0002;

import java.util.concurrent.Callable;

public class EulerTask implements Callable<Long> {

    private long fibNum;
    private long sum;
    private long max;

    public EulerTask() {

    }

    @Override
    public Long call() throws Exception {
        long help = 1;

        while (fibNum < max){
            if(fibNum % 2 == 0) {
                sum += fibNum;
            }


            fibNum = fibNum + help;
            help = fibNum;

            System.out.println(fibNum);

        }

        return sum;
    }
}
