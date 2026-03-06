package euler_0000;

import java.util.concurrent.*;

public class Main {

    private static final int NUM_THREADS = 12;
    private static final int MAX = 480_000;

    static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        CompletionService<Long> cs = new ExecutorCompletionService<>(executor);

        cs.submit(new EulerTask(1, MAX));

        Future<Long> f = cs.take();

        System.out.println(f.get());

        executor.shutdown();
    }



}
