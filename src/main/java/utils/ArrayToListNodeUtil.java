package utils;

import leetcode.ds.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/22
 */

public class ArrayToListNodeUtil {

    public static ListNode toList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        for (int val : arr) {
            tmp.next = new ListNode(val);
            tmp = tmp.next;
        }
        return dummy.next;
    }

}
