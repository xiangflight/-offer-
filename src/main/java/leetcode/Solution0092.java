package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class Solution0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        // because if m is 1, the head will be changed
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // reverse dis nodes
        int dis = n - m;
        // find the node before first node
        ListNode preJoint = dummy;
        while (m-- > 1) {
            preJoint = preJoint.next;
        }
        ListNode postJoint = preJoint.next;
        // reverse linked list
        ListNode pre = null;
        ListNode curr = postJoint;
        ListNode next = null;
        while (dis-- >= 0) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        preJoint.next = pre;
        postJoint.next = curr;
        if (m == 1) {
            return pre;
        }
        return dummy.next;
    }


}
