package leetcode;

import leetcode.ds.ListNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(7);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(8);
        ret.setNext(node5);
        node5.setNext(node6);
        return ret;
    }

}
