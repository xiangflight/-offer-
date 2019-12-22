package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

class Test0206 {

    private final Solution0206 solution = new Solution0206();

    @Test
    @DisplayName("206 Reverse Linked List")
    void reverseList() {
        ListNode expected = ArrayUtil.toList(new int[]{5, 4, 3, 2, 1});
        ListNode input = ArrayUtil.toList(new int[]{1, 2, 3, 4, 5});
        assertEquals(expected, solution.reverseList(input));
    }
}