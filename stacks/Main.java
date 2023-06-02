package stacks;

import java.util.Stack;

public class Main{

    public static void main(String[] args) {

        // last in first out (LIFO)
        
        Stack<String> stack = new Stack<String>();

        stack.push("Ricardo");
        stack.push("Madeleine");
        stack.push("Carlos");
        stack.push("Gabriela");
        stack.push("Estela");

        System.out.println(stack);

        stack.pop();

        System.out.println(stack.peek());

        System.out.println(stack.search("Madeleine"));
    }
}