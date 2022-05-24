package recursion;

import org.junit.Test;

public class TowerOfHanoi {

    @Test
    public void test() {
        HanoiTowers(2, 'A', 'B', 'C');
    }

    private void HanoiTowers(int n, char x, char y, char z) {
        if(n==1) {
            System.out.printf("%c to peg %c.%n", x,z);
        } else {
            HanoiTowers(n - 1, x, z, y);
            HanoiTowers(1, x, y, z);
            HanoiTowers(n - 1, y, x, z);
        }
    }
}
