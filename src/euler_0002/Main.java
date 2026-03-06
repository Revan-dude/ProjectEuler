package euler_0002;

import euler_0001.EulerTask;

import java.util.concurrent.*;

public class Main {

    private static final int THREAD_AMOUNT = 1;
    private y

    static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_AMOUNT);
        CompletionService cs = new ExecutorCompletionService(executor);

        Future<Integer> f = cs.submit(new EulerTask(MAX));
    }
}
