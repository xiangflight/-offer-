package utils;

import leetcode.ds.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/22
 */

public class ArrayUtil {

    public static ListNode toList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;
        for (int val : arr) {
            tmp.next = new ListNode(val);
            tmp = tmp.next;
        }
        return dummy.next;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
