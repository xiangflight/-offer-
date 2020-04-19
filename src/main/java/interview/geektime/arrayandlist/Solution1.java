package interview.geektime.arrayandlist;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/18
 */

public class Solution1 {

    public ListNode reverseListIteratively(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverseHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;
    }

}
