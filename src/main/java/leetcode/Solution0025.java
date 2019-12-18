package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

public class Solution0025 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        int i = 0;
        while (head != null) {
            i++;
            if (i % k == 0) {
                temp = reverse(temp, head.next);
                head = temp.next;
            } else {
                head = head.next;
            }
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode begin, ListNode end) {
        ListNode curr = begin.next;
        ListNode res = curr;
        ListNode pre = begin;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        begin.next = pre;
        res.next = curr;
        return res;
    }

}
