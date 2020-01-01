package swordoffer;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution022 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        if (k < 0) {
            throw new IllegalArgumentException("invalid k");
        }
        ListNode fast = head;
        while (fast != null && k-- > 0) {
            fast = fast.next;
        }
        if (k > 0) {
            return null;
        }
        ListNode slow = head;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
