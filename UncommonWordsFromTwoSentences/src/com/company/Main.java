package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        String A = "apple apple";
        String B = "banana";
        System.out.println(Arrays.toString(solution.uncommonFromSentences(A, B)));
    }
}
