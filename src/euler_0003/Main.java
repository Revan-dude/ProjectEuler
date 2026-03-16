package euler_0003;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.*;

public class Main {

    private static final int THREAD_AMOUNT = 1;
    private static final BigInteger MAX = new BigInteger("600851475143");

    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_AMOUNT);
        CompletionService cs = new ExecutorCompletionService(executor);
        Future<BigInteger> f = cs.submit(new EulerTask(MAX));

        System.out.println(f.get());

        executor.close();
    }

}
