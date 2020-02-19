package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        System.out.println("Should be true: " + solution.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
        System.out.println("Should be true: " + solution.lemonadeChange(new int[]{5, 5, 10}));
        System.out.println("Should be false: " + solution.lemonadeChange(new int[]{10, 10}));
        System.out.println("Should be false: " + solution.lemonadeChange(new int[]{5,5,10,10,20}));
    }
}
