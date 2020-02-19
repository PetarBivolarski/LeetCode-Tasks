package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        System.out.println("Should be 30: " + solution.calPoints(new String[] {"5","2","C","D","+"}));
        System.out.println("Should be 27: " + solution.calPoints(new String[] {"5","-2","4","C","D","9","+","+"}));
    }
}
