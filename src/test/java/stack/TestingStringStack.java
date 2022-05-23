package stack;

import org.junit.Test;

//import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class TestingStringStack {

    @Test
    public  void test() {
        //Deque<String> stack = new ArrayDeque<>();
        Deque<String> stack = new LinkedList<>();
        stack.push("GB");
        stack.push("DE");
        stack.push("FR");
        stack.push("ES");
        status(stack);
        stack.pop();
        status(stack);
    }

    private void status(Deque<String> stack) {
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
