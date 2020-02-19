package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        Solution.ListNode listNode1 = new Solution.ListNode(1);
        Solution.ListNode listNode2 = new Solution.ListNode(1);
        Solution.ListNode listNode3 = new Solution.ListNode(1);


        listNode1.next = listNode2;
        listNode2.next = listNode3;



        solution.deleteDuplicates(listNode1);
    }
}
