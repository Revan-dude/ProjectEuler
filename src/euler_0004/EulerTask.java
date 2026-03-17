package euler_0004;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EulerTask implements Callable<List<Integer>> {
    private int start;
    private int end;
    private List<Integer> palindromes;

    public EulerTask(int start, int end) {
        this.start = start;
        this.end = end;
        this.palindromes = new ArrayList<>();
    }


    @Override
    public List<Integer> call() throws Exception {
        for(int i = start; i < end; i++){
            for(int j = 100; j < 1000; j++) {
                if (palindromeChecker(i * j)){
                    palindromes.add(i * j);
                }
            }
        }

        return palindromes;
    }

    private boolean palindromeChecker(int num) {
        StringBuilder reversedNum = new StringBuilder();
        List<Integer> integers = new ArrayList<>();

        for(int i = 0; i < String.valueOf(num).length(); i++) {
            integers.add(Integer.parseInt(String.valueOf(num).charAt(i) + ""));
        }

        integers.reversed().stream()
                .forEach(reversedNum::append);


        return num == Integer.parseInt(reversedNum.toString());
    }
}
