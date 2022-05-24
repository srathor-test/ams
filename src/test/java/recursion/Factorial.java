package recursion;

import org.junit.Test;

public class Factorial {

    @Test
    public void testRec() {
        System.out.println(f(5));
        System.out.println(fi(5));
    }

    private int f(int n) {
        if(n == 0) {
            return 1;
        }
        return n * f(n -1);
    }

    private int fi(int n) {
        int f = 1;
        for(int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

}
