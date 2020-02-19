package com.company;


class Solution {
     static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow;
        ListNode last = null;
        ListNode nextValue = null;
        ListNode current = middle;
        while (current != null) {
            nextValue = current.next;
            current.next = last;
            last = current;
            current = nextValue;
        }
        ListNode headValueOfReversedSecondHalf = last;
        while (headValueOfReversedSecondHalf != null) {
            if (head.val != headValueOfReversedSecondHalf.val) {
                return false;
            }
            headValueOfReversedSecondHalf = headValueOfReversedSecondHalf.next;
            head = head.next;
        }
        return true;
    }
}