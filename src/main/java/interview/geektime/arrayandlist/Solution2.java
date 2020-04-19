package interview.geektime.arrayandlist;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/18
 */

public class Solution2 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next != null && temp.next.next != null) {
            ListNode first = temp.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            temp.next = second;
            temp = first;
        }
        return dummy.next;
    }

}
