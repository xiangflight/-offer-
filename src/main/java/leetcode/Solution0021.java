package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class Solution0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode p = l1, q = l2;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                temp.next = p;
                p = p.next;
            } else {
                temp.next = q;
                q = q.next;
            }
            temp = temp.next;
        }
        if (p != null) {
            temp.next = p;
        }
        if (q != null) {
            temp.next = q;
        }
        return dummy.next;
    }

}
