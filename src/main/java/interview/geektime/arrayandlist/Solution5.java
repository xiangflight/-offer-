package interview.geektime.arrayandlist;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 *
 * Coding more
 */

public class Solution5 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        int i = 0;
        ListNode curr = head;
        while (curr != null) {
            i++;
            if (i % k == 0) {
                temp = reverse(temp, curr.next);
                curr = temp.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode begin, ListNode end) {
        ListNode pre = begin, curr = begin.next;
        ListNode tail = curr;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        begin.next = pre;
        tail.next = curr;
        return tail;
    }


}
