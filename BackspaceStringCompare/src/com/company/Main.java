package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Solution solution = new Solution();
        System.out.println("Should be true: " + solution.backspaceCompare("ab#c", "ad#c"));
        System.out.println("Should be true: " + solution.backspaceCompare("ab##", "c#d#"));
        System.out.println("Should be true: " + solution.backspaceCompare("a##c", "#a#c"));
        System.out.println("Should be false: " + solution.backspaceCompare("a#c", "b"));

    }
}
