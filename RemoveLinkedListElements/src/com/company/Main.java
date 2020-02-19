package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Solution solution = new Solution();
        Solution.ListNode listNode1 = new Solution.ListNode(1);
       Solution.ListNode listNode2 = new Solution.ListNode(2);
        Solution.ListNode listNode3 = new Solution.ListNode(2);
        Solution.ListNode listNode4 = new Solution.ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
  /*       Solution.ListNode listNode5 = new Solution.ListNode(4);
        Solution.ListNode listNode6 = new Solution.ListNode(5);
        Solution.ListNode listNode7 = new Solution.ListNode(6);


        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;*/

        solution.removeElements(listNode1, 2);

    }
}
