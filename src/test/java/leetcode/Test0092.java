package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

class Test0092 {

    private final Solution0092 solution = new Solution0092();

    @Test
    @DisplayName("92 Reverse Linked List II")
    void reverseBetween() {
        int m = 2, n = 4;
        ListNode input = ArrayUtil.toList(new int[] {1, 2, 3, 4, 5});
        ListNode expected = ArrayUtil.toList(new int[] {1, 4, 3, 2, 5});
        assertEquals(expected, solution.reverseBetween(input, m, n));
    }
}