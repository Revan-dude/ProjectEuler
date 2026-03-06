package euler_0001;

import java.util.concurrent.Callable;

public class EulerTask implements Callable<Integer> {
    private int end;
    private int sum;

    public EulerTask(int end) {
        this.end = end;
    }

    @Override
    public Integer call() throws Exception {
        sum = 0;

        for(int i = 1; i < end; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }

        return sum;
    }
}
