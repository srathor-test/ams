package recursion;

import org.junit.Test;

public class BinomialCoefficient {

    @Test
    public void test() {
        System.out.println(cofRec(6,2));
        System.out.println(cofRec(6,6));

        System.out.println(cofItr(6,2));
        System.out.println(cofItr(6,6));
    }

    private int cofRec(int n, int k) {
        if(k == 0 || n == k ) {
            return 1;
        }
        return cofRec(n - 1, n - k) + cofRec(n-1, k);
    }

    private int cofItr(int n, int k) {
        if(n < 2 || n==k || n == 0) {
            return 1;
        }
        int c = 1;
        for(int j = 1; j <= k; j++) {
            c = c *(n-j+1)/j;
        }
        return c;
    }
}
