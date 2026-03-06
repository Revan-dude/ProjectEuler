package euler_0001;

import java.util.concurrent.*;

public class Main {

    private static final int THREAD_AMOUNT = 1;
    private static final int MAX = 1000;

    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_AMOUNT);
        CompletionService cs = new ExecutorCompletionService(executor);

        Future<Integer> f = cs.submit(new EulerTask(MAX));

        System.out.println(f.get());

        executor.shutdown();
    }
}
