package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 8:46 下午
 */

public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
