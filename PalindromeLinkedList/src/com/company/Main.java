package com.company;

public class Main {


    public static void main(String[] args) {
        Solution.ListNode listNode1 = new Solution.ListNode(1);
        Solution.ListNode listNode2 = new Solution.ListNode(0);
        Solution.ListNode listNode3 = new Solution.ListNode(0);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        print(listNode1);

    }

    public static void print(Solution.ListNode listNode) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(listNode));
    }
}