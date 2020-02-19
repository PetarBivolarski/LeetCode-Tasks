package com.company;

import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int numberOfOccurences = 1;
        // [1,2,2,1,1,3]
        // HashSet 1, 2, 3
        for (int number : arr) {
            if (!hashMap.containsKey(number)) {
                numberOfOccurences = 1;
                hashMap.put(number, numberOfOccurences);
            } else {
                numberOfOccurences = hashMap.get(number);
                numberOfOccurences++;
                hashMap.put(number, numberOfOccurences);
            }
        }
        List<Integer> list = new ArrayList<>(hashMap.values());
        HashSet<Integer> checkForUniqueness = new HashSet<>();
        for (int value: list) {
            boolean check = checkForUniqueness.add(value);
            if (!check) {
                return false;
            }
        }
        return true;
    }
}