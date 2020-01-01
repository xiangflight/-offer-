package swordoffer;

import ds.linkedlist.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 * <p>
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
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

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;
        ListNode pre = dummy;
        ListNode cur = pHead;
        while (cur != null) {
            while (cur.next != null && cur.next.val == cur.val) {
                cur = cur.next;
            }
            if (pre.next == cur) {
                pre = pre.next;
            } else {
                pre.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode deleteDuplication2(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode next = pHead.next;
        if (pHead.val == next.val) {
            while (next != null && pHead.val == next.val) {
                next = next.next;
            }
            return deleteDuplication2(next);
        } else {
            pHead.next = deleteDuplication2(pHead.next);
            return pHead;
        }
    }

}
