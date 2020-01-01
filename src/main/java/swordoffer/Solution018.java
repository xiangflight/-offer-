package swordoffer;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution018 {

    public ListNode deleteNode(ListNode head, ListNode toDelete) {
        if (head == null || toDelete == null) {
            return null;
        }
        if (toDelete.next != null) {
            ListNode next = toDelete.next;
            toDelete.val = next.val;
            toDelete.next = next.next;
        } else {
            if (head == toDelete) {
                return null;
            } else {
                ListNode cur = head;
                while (cur.next != toDelete) {
                    cur = cur.next;
                }
                cur.next = null;
            }
        }
        return head;
    }

}
