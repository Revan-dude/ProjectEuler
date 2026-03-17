package euler_0005;

import java.util.concurrent.Callable;

public class EulerTask implements Callable<Integer> {
    private int divisorNum;

    public EulerTask() {
        this.divisorNum = 0;
    }

    @Override
    public Integer call() throws Exception {
        int i = 0;
        while (divisorNum == 0) {
            i += 1;

            if( i % 2 == 0 &&
                i % 3 == 0 &&
                i % 4 == 0 &&
                i % 5 == 0 &&
                i % 6 == 0 &&
                i % 7 == 0 &&
                i % 8 == 0 &&
                i % 9 == 0 &&
                i % 10 == 0 &&
                i % 11 == 0 &&
                i % 12 == 0 &&
                i % 13 == 0 &&
                i % 14 == 0 &&
                i % 15 == 0 &&
                i % 16 == 0 &&
                i % 17 == 0 &&
                i % 18 == 0 &&
                i % 19 == 0 &&
                i % 20 == 0) {
                divisorNum = i;
            }
        }
        return divisorNum;
    }
}
