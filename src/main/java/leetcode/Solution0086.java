package leetcode;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

public class Solution0086 {

    public ListNode partition(ListNode head, int x) {
        ListNode preHalf = new ListNode(-1);
        ListNode postHalf = new ListNode(-1);
        ListNode preTemp = preHalf;
        ListNode postTemp = postHalf;
        ListNode temp = head;
        while (temp != null) {
            if (temp.val < x) {
                preTemp.next = temp;
                preTemp = temp;
            } else {
                postTemp.next = temp;
                postTemp = temp;
            }
            temp = temp.next;
        }
        preTemp.next = postHalf.next;
        postTemp.next = null;
        return preHalf.next;
    }

}
