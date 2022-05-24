package recursion;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Fibonacci {

    @Test
    public void testFib() throws InterruptedException {
        long start = System.currentTimeMillis();
        long limit = 30;
      for(long i = 0; i < limit; i++) {
            System.out.printf("%d, ", fib(i));
        }
       // TimeUnit.SECONDS.sleep(5);
        long end = System.currentTimeMillis();
        System.out.println("runtime: " + (end - start));

        Map<Long, Long> memo = new HashMap<>();
        start = System.currentTimeMillis();
        for(long i = 0; i < limit; i++) {
            System.out.printf("%d, ", fibDP(i, memo));
        }
        // TimeUnit.SECONDS.sleep(5);
        end = System.currentTimeMillis();
        System.out.println("runtime: " + (end - start));

    }

    private long fib(long n) {
        if(n < 2) {
            return n;
        }

        return fib(n -1) + fib(n-2);
    }

    private long fibDP(Long n, Map<Long, Long> memo)  {
        if(n < 2) {
            return n;
        }
        Long x ;
        Long  y;

        x = memo.get(n-1);
        if(x == null) {
            x = fib(n - 1);
            memo.put(n-1, x);
        }

        y = memo.get(n-2);
        if(y == null) {
            y = fib(n - 2);
            memo.put(n-2, y);
        }

        return  x + y;
    }
}
