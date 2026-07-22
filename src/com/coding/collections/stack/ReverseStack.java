package com.coding.collections.stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.empty()) {
            reversedStack.push(stack.pop());
        }
        System.out.println("Reversed Stack : " + reversedStack);
    }
}
