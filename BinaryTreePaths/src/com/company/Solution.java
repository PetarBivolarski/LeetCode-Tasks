package com.company;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>(); // stores the final output
        if (root == null) return result;
        dfs(root, "", result);
        return result;
    }

    // DFS
    private void dfs(TreeNode root, String path, List<String> result) {
        path += root.val;
        // reach a leaf node, completes a path
        if (root.left == null & root.right == null) {
            result.add(path);
            return;
        }
        // recursively checks its left child
        if (root.left != null) dfs(root.left, path + "->", result);
        // recursively checks its right child
        if (root.right != null) dfs(root.right, path + "->", result);
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