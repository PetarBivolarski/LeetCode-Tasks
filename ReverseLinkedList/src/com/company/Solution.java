package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // Iterative solution: O(N) time and 0(1) space
    /*  public ListNode reverseList(ListNode head) {
          ListNode prev = null;
          ListNode curr = head;
          ListNode next = null;
          while (curr != null) {
              next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = next;
          }
          return prev;
      }*/
    // Recursive solution: O(N) time and 0(N) space
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reversedListHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversedListHead;
    }
}