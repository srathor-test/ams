package recursion;

import org.junit.Test;

public class GreatestCommonDivisor {
    @Test
    public void test() {
        System.out.println(euclideanMethod(494, 130));
    }

    private int euclideanMethod(int m, int n) {
        if(m == n) {
            return n;
        } else if( m < n) {
            return euclideanMethod(m, n - m);
        } else {
            return euclideanMethod(m -n, n);
        }
    }
}
