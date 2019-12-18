package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class Solution0083 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null) {
            if (fast.val != slow.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }

}
