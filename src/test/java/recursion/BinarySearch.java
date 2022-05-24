package recursion;

import org.junit.Test;

public class BinarySearch {

    @Test
    public void testBinarySearch() {
        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int find = binarySearchItr(array, 70);
        System.out.println(find);
        find = binarySearchItr(array, 45);
        System.out.println(find);

        find = binarySearchItr(array, 0);
        System.out.println(find);
    }

    private int binarySearchItr(int[] array, int x) {
        int lo = 0;
        int high = array.length;
        while(lo < high) {
            System.out.println("lo: " + lo + ", high: " + high);
            int mid = (lo + high)/2;
            if(array[mid] == x) {
                return mid;
            } else if(array[mid] < x) {
                lo = mid+1;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    @Test
    public void testBinarySearchRec() {
        int [] array = {-8,10, 20, 30, 40, 50, 60, 70, 80, 90};

        int find = binarySearchRec(array, 10);
        System.out.println(find);
        find = binarySearchRec(array, 90);
        System.out.println(find);

        find = binarySearchRec(array, 50);
        System.out.println(find);

        find = binarySearchRec(array, 0);
        System.out.println(find);

        find = binarySearchRec(array, -9);
        System.out.println(find);

        find = binarySearchRec(array, -8);
        System.out.println(find);
    }

    private int binarySearchRec(int[] array, int i) {
        return binarySearchRecHelper(array, i, 0, array.length - 1);
    }

    private int binarySearchRecHelper(int[] array, int i, int low, int high) {
        if(low > high) {
            return -1;
        }
        int mid = (low+high)/2;
        if(array[mid] == i) {
            return mid;
        } else if( array[mid] < i) {
            return binarySearchRecHelper(array, i, mid+1, high);
        } else {
            return binarySearchRecHelper(array, i, low, mid-1);
        }
    }
}
