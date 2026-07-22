package com.coding.collections.stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "(((";

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
            if (stack.isEmpty()){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }
        }
    }
}
