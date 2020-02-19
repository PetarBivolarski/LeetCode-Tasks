package com.company;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }
        return rangeSumBst(root, L, R);
    }

    public int rangeSumBst(TreeNode node, int l, int r) {
        if (node == null) {
            return 0;
        }
        int sum = 0;
        if (node.val < l) {
            return sum += rangeSumBst(node.right, l, r);
        }
        if (node.val > r) {
            return sum += rangeSumBst(node.left, l, r);
        }
        int left = rangeSumBst(node.left, l, r);
        int right = rangeSumBst(node.right, l, r);
        sum = left + right + node.val;
        return sum;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}