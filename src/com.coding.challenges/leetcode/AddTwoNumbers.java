package com.coding.challenges.leetcode;

import com.coding.challenges.util.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            //initial sum
            int sum = carry;
            //use number from first list
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            //use number from second list
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            //when sum > 9
            carry = sum / 10;
            sum = sum % 10;

            l3.next = new ListNode(sum);
            l3 = l3.next;
        }
        if (carry == 1) {
            l3.next = new ListNode(1);
        }

        return result.next;
    }
}
