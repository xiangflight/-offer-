package leetcode;

import dsa.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Solution0002 {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p == null) ? 0 : p.val;
            int y = (q == null) ? 0 : q.val;
            int sum = x + y + carry;
            tmp.next = new ListNode(sum % 10);
            carry = sum / 10;
            tmp = tmp.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry != 0) {
            tmp.next = new ListNode(1);
        }
        return dummy.next;
    }

}
