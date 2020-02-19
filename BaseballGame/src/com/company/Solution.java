package com.company;

import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> symbols = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                symbols.pop();
            } else if (ops[i].equals("D")) {
                symbols.push(symbols.peek() * 2);
            } else if (ops[i].equals("+")) {
                int pointsFromPlus = symbols.peek() + symbols.get(symbols.size() - 2);
                symbols.push(pointsFromPlus);
            } else {
                symbols.push(Integer.parseInt(ops[i]));
            }
        }
        return symbols.stream().reduce(0, Integer::sum);
    }
}