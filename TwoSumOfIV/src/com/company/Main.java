package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        Solution.TreeNode treeNode1 = new Solution.TreeNode(5);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(3);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(6);
        Solution.TreeNode treeNode4 = new Solution.TreeNode(2);
        Solution.TreeNode treeNode5 = new Solution.TreeNode(4);
        Solution.TreeNode treeNode6 = new Solution.TreeNode(2);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(solution.findTarget(treeNode1,28));
    }
}
