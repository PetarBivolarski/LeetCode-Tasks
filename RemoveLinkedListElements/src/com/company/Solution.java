package com.company;

class Solution {

    // Fake head help us avoid edge case when head is the one to be removed
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode current = head;
        ListNode prev = fakeHead;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        return fakeHead.next;
    }

//    public ListNode removeElements(ListNode head, int val) {
//        ListNode current = head;
//        ListNode next = null;
//        ListNode previous = null;
//        ListNode newHead = head;
//        while (current != null) {
//            if (head.val == val) {
//                head = head.next;
//                current = current.next;
//                if (head == null) {
//                    newHead = null;
//                } else {
//                    newHead = head;
//                }
//            } else if (current.val == val) {
//                previous.next = next;
//                current = next;
//                if (current != null) {
//                    next = current.next;
//                }
//            } else {
//                previous = current;
//                current = current.next;
//                if (current != null) {
//                    next = current.next;
//                }
//            }
//        }
//        return newHead;
//    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}