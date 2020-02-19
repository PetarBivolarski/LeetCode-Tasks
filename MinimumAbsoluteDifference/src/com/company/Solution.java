package com.company;


import java.lang.reflect.Array;
import java.util.*;

class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff < min) {
                min = diff;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (diff == min) {
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return result;
    }


//    public int getMinimumDifference(TreeNode root) {
//        int[] input = new int[2];
//        input[0] = Integer.MAX_VALUE;
//        input[1] = Integer.MAX_VALUE;
//        inOrderTraversal(root, input);
//        return input[0];
//    }
//
//    private void inOrderTraversal(TreeNode current, int[] input) {
//        if (current == null) return;
//        inOrderTraversal(current.left, input);
//        if (input[1] != Integer.MAX_VALUE) input[0] = Math.min(input[0], Math.abs(input[1] - current.val));
//        input[1] = current.val;
//        inOrderTraversal(current.right, input);
//    }
//
//
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode(int x) {
//            val = x;
//        }
//    }

}