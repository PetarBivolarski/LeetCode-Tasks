package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        Solution.TreeNode treeNode1 = new Solution.TreeNode(10);
        Solution.TreeNode treeNode2 = new Solution.TreeNode(5);
        Solution.TreeNode treeNode3 = new Solution.TreeNode(15);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println(solution.rangeSumBST(treeNode1,7,15));
    }
}
