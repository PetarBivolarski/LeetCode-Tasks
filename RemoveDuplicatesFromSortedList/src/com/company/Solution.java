package com.company;


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode next;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                next = current.next;
                current.next = next.next;
            } else {
                current = current.next;
            }
        }
        return head;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
