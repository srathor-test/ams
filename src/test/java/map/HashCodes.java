package map;

import org.junit.Test;

public class HashCodes {

    /*
        Generating key/hashes

        1. linear probing
        2. quadratic probing

        another solution
        separate chaining(buckets)
     */
    @Test
    public void testHashCode() {
        printHashcode("Rad");
        printHashcode("Uhr");
        printHashcode("Ohr");
        printHashcode("Tor");
        printHashcode("Hut");
        printHashcode("Tag");
    }

    private void printHashcode(String word) {
        System.out.printf("%s: %s%n", word, word.hashCode());
    }

    @Test
    public void testingHash() {
        printHash("Rad");
        printHash("Uhr");
        printHash("Ohr");
        printHash("Tor");
        printHash("Hut");
        printHash("Tag");
    }
    private void printHash(String word) {
        System.out.printf("%s: %s%n", word, (new TestHashing().hash(word)));
    }
    class TestHashing {
        private static final int MASK = 0x7FFFFFFF; // = 2^32-1
        private static final int CAPACITY = 1100;

        // linear probing
        public int hash(Object object) {
            return (object.hashCode() & MASK) % CAPACITY;
        }
    }
}
