package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class Solution0024 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = dummy;
        while (p.next != null && p.next.next != null) {
            ListNode first = p.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            p.next = second;
            p = first;
        }
        return dummy.next;
    }

}