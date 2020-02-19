package com.company;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // We need fast != null when the number of nodes is even
        // --> as fast would be null there
        // We need fast.next != null when the number of nodes i uneven
        // --> as fast would hit the last item, but it is effectively the last, so next is null
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}