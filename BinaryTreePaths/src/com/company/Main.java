package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Solution solution = new Solution();
        Solution.TreeNode treeNode1 = new Solution.TreeNode(1);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(2);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(3);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(solution.binaryTreePaths(treeNode1));
    }
}
