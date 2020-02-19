package com.company;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //ab aa
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hashMap.containsKey(s.charAt(i))) {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
            }
            Character putStatus = hashMap.put(s.charAt(i), t.charAt(i));
            if (putStatus != null) {
                if (!putStatus.equals(t.charAt(i))) {
                    return false;
                }
            }
        }
        return true;


    }
}