package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public boolean lemonadeChange(int[] bills) {
        Queue<Integer> queue = new LinkedList<>();
        int fiveBill = 0;
        int tenBill = 0;
        for (int i = 0; i < bills.length; i++) {
            queue.offer(bills[i]);
            if (queue.peek() == 5) {
                fiveBill++;
                queue.poll();
            } else if (queue.peek() == 10) {
                if (fiveBill > 0) {
                    fiveBill--;
                    tenBill++;
                } else {
                    return false;
                }
                queue.poll();
            } else {
                if (fiveBill > 0 && tenBill > 0) {
                    fiveBill--;
                    tenBill--;
                } else if (fiveBill > 2) {
                    fiveBill = fiveBill - 3;
                } else {
                    return false;
                }
                queue.poll();
            }
        }
        return true;
    }
}