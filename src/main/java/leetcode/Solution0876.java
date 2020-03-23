package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/23
 */

public class Solution0876 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
