package com.company;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return c;
            } else {
                hashMap.put(c, hashMap.get(c) - 1);
            }
        }

        return '|';
    }
}