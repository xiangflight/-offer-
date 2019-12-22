package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

class Test0024 {

    private final Solution0024 solution = new Solution0024();

    @Test
    @DisplayName("24 Swap Nodes in Pairs")
    void swapPairs() {
        ListNode expected = ArrayUtil.toList(new int[]{2, 1, 4, 3});
        ListNode input = ArrayUtil.toList(new int[]{1, 2, 3, 4});
        assertEquals(expected, solution.swapPairs(input));
    }
}