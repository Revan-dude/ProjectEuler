package euler_0004;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;

public class Main {

    private static final int THREAD_AMOUNT = 16;
    private static final int MAX = 1000;
    private static final int MIN = 100;



    static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_AMOUNT);
        CompletionService cs = new ExecutorCompletionService(executor);

        List<EulerTask> tasks = new ArrayList<>();
        int maxPalindrome = 0;

        for(int i = 0; i < THREAD_AMOUNT; i++){
            int chunk = (MAX-MIN) / THREAD_AMOUNT;
            tasks.add(new EulerTask(MIN + i * chunk, MIN + (i + 1) * chunk));
        }

        List<Future<List<Integer>>> results = executor.invokeAll(tasks);

        for(Future<List<Integer>> f : results){
            int maxVal = f.get().stream().max(Comparator.comparing(Integer::intValue)).get();

            if(maxVal > maxPalindrome) {
                maxPalindrome = maxVal;
            }
        }

        System.out.println("Highest Palindrome is: " + maxPalindrome);
    }
}
