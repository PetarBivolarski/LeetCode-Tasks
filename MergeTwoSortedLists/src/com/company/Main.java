package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.ListNode listNode1 = solution.new ListNode(1);
        Solution.ListNode listNode2 = solution.new ListNode(2);
        Solution.ListNode listNode3 = solution.new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        Solution.ListNode listNode4 = solution.new ListNode(1);
        Solution.ListNode listNode5 = solution.new ListNode(3);
        Solution.ListNode listNode6 = solution.new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        solution.mergeTwoLists(listNode1, listNode4);

        // write your code here
    }
}
