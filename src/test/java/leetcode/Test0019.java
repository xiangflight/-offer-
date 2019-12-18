package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

class Test0019 {

    private final Solution0019 solution = new Solution0019();

    @Test
    @DisplayName("19 Remove Nth Node From End of List")
    void removeNthFromEnd() {
        ListNode expected = ArrayUtil.toList(new int[] {1, 2, 3, 5});
        ListNode input = ArrayUtil.toList(new int[] {1, 2, 3, 4, 5});
        int n = 2;
        assertEquals(expected, solution.removeNthFromEnd(input, n));
    }
}