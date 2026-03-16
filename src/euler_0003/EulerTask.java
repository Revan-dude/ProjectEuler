package euler_0003;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class EulerTask implements Callable<BigInteger> {
    private List<BigInteger> primes;
    private BigInteger end;


    public EulerTask(BigInteger end) {
        this.end = end;
        this.primes = new ArrayList<>();
    }

    @Override
    public BigInteger call() throws Exception {
        BigInteger temp = end;

        for(BigInteger i = BigInteger.TWO; !temp.equals(BigInteger.ONE); i = i.add(BigInteger.ONE)) {
            if(temp.mod(i).equals(BigInteger.ZERO)){
                temp = temp.divide(i);
                primes.add(i);
            }
        }

        return primes.stream().max(BigInteger::compareTo).get();
    }
}
