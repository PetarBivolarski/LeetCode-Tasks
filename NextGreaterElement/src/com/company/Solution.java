package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
//    Java 10 lines linear time complexity O(n) with explanation
//    Key observation:
//    Suppose we have a decreasing sequence followed by a greater number
//    For example [5, 4, 3, 2, 1, 6] then the greater number 6 is the next greater element for all previous numbers in the sequence
//
//    We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than stack.peek() we pop all elements less than x and for all the popped ones, their next greater element is x
//    For example [9, 8, 7, 3, 2, 1, 6]
//    The stack will first contain [9, 8, 7, 3, 2, 1] and then we see 6 which is greater than 1 so we pop 1 2 3 whose next greater element should be 6

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++) {
            findNums[i] = map.getOrDefault(findNums[i], -1);
        }
        return findNums;
    }

//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        Stack<Integer> stack1 = new Stack<>();
//        for (int number : nums1) {
//            stack1.push(number);
//        }
//        Stack<Integer> stack2 = new Stack<>();
//        for (int number : nums2) {
//            stack2.push(number);
//        }
//        int[] result = new int[nums1.length];
//        for (int i = 0; i < stack1.size(); i++) {
//            int indexOfSubsetNumberInSet = stack2.indexOf(stack1.get(i));
//            final int currentNumber = stack1.get(i);
//            if ((indexOfSubsetNumberInSet + 1 < stack2.size())) {
//                result[i] = stack2.stream().skip(indexOfSubsetNumberInSet)
//                        .filter(number -> number > currentNumber)
//                        .findFirst().orElse(-1);
//            } else {
//                result[i] = -1;
//            }
//        }
//        return result;
//    }
}