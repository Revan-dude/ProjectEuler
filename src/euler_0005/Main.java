package euler_0005;

import java.math.BigInteger;
import java.util.concurrent.*;

public class Main {

    private static final int THREAD_AMOUNT = 1;

    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_AMOUNT);
        CompletionService cs = new ExecutorCompletionService(executor);
        Future<Integer> f = cs.submit(new EulerTask());

        System.out.println(f.get());

        executor.close();
    }
}
