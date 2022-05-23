package stack;

import org.junit.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class InfixToPostfix {
    @Test
    public void infixToPostfix() {
        String arthExpr = "( 80 - 30 ) * ( 40 + 50 / 10 )";
        System.out.println(arthExpr);
        //convert to postfix
        String postFix = getPostFixString(arthExpr);
        System.out.println(postFix);
        //evaluate
        Integer result = evaluatePostfix(postFix);
        System.out.println(result);
    }

    private Integer evaluatePostfix(String postFix) {
        Scanner scanner = new Scanner(postFix);
        Deque<Integer> stack = new LinkedList<>();
        Integer result = 0;
        while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                stack.push(scanner.nextInt());
            } else {
                String str = scanner.next();
                if("+-*/".indexOf(str) >= 0) {
                    //char ch = str.charAt(0);
                    int y = stack.pop();
                    int x = stack.pop();
                    int z = 0;
                    switch(str) {
                        case "+":
                            z = x + y;
                            stack.push(z);
                            break;
                        case "-":
                            z = x - y;
                            stack.push(z);
                            break;
                        case "*":
                            z = x * y;
                            stack.push(z);
                            break;
                        case "/":
                            z = x / y;
                            stack.push(z);
                            break;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            result = stack.pop();
        } else {
            result = null;
        }
        return result;
    }

    private String getPostFixString(String infix) {
        Deque<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(infix);
        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                sb.append(scanner.nextInt() + " ");
            } else {
                String str = scanner.next();
                if ("+-*/".indexOf(str) >= 0) {
                    stack.push(str);
                } else if (str.equals(")")) {
                    sb.append(stack.pop() + " ");
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        return sb.toString();
    }
}
