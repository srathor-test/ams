package queue;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestStringQueue {

    /*
        I - Queue
        C - 1) LinkedList 2) AbstractQueue 3) PriorityQueue 4) ArrayDeque
     */
    @Test
    public void testStringQueue() {
        Queue<String> q = new ArrayDeque<>();
        q.add("GB");
        System.out.println(q);
        q.add("DE");
        q.add("FR");
        q.add("ES");

        System.out.println(q);
        System.out.println("peek " + q.peek());
        q.remove();
        System.out.println("after remove peek " + q.peek());
        System.out.println(q);

        System.out.println("peek " + q.peek());
        q.remove();
        System.out.println("after remove peek " + q.peek());
        System.out.println(q);
    }
}
