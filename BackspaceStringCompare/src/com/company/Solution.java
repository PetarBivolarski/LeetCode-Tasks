package com.company;

import java.util.Stack;

public class Solution {

    private String buildStack(String X) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < X.length(); i++) {
            char currentElement = X.charAt(i);
            stack.push(currentElement);
            if (currentElement == '#' && !stack.isEmpty()) {
                stack.pop();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        return String.valueOf(stack);
    }

    public boolean backspaceCompare(String S, String T) {
        return buildStack(S).equals(buildStack(T));
    }
}