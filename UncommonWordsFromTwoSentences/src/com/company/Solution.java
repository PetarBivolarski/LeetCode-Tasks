package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String[] arrayA = A.split(" ");
        String[] arrayB = B.split(" ");
        HashSet<String> hashSetA = new HashSet<>();
        HashSet<String> hashSetB = new HashSet<>();
        for (String letter : arrayA) {
            if (!hashSetA.add(letter)) {
                hashSetB.add(letter);
            }
        }
        for (String letter : arrayB) {
            if (!hashSetB.add(letter)) {
                hashSetA.add(letter);
            }
        }
        HashSet<String> result = new HashSet<>();
        for (String letter : arrayA) {
            if (!hashSetB.contains(letter)) {
                result.add(letter);
            }
        }
        for (String letter : arrayB) {
            if (!hashSetA.contains(letter)) {
                result.add(letter);
            }
        }
        return result.toArray(new String[0]);
    }
}
