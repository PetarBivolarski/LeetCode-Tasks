package com.company;

import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            hashSet.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (hashSet.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}