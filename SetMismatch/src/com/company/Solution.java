package com.company;

import java.util.HashSet;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int[] result = new int[2];
        for (int number: nums) {
            boolean isPresent = hashSet.add(number);
            if (!isPresent) {
                result[0] = number;
            }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!hashSet.contains(i)) {
                result[1] = i;
            }
        }
        return result;
    }
}