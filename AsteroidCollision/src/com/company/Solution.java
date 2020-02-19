package com.company;

import java.util.EmptyStackException;
import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else if (asteroids[i] < 0) {
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else {
                    int lastPopped = 0;
                    while (!stack.isEmpty() && Math.abs(asteroids[i]) >= stack.peek() && stack.peek() > 0) {
                        if (Math.abs(asteroids[i]) == stack.peek()) {
                            stack.pop();
                            lastPopped = Integer.MAX_VALUE;
                            break;
                        } else {
                            lastPopped = stack.pop();
                        }
                    }
                    if (!stack.isEmpty() && stack.peek() < 0 && Math.abs(asteroids[i]) > lastPopped) {
                        stack.push(asteroids[i]);
                    } else if (stack.isEmpty() && Math.abs(asteroids[i]) > lastPopped) {
                        stack.push(asteroids[i]);
                    }
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}