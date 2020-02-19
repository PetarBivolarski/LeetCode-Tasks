package com.company;

import java.util.*;

public class Solution2 {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : A.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        for (String word : B.split(" ")) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        List<String> list = new LinkedList<>();
        for (String word : count.keySet()) {
            if (count.get(word) == 1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
