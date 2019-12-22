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

class Test0148 {

    private final Solution0148 solution = new Solution0148();

    @Test
    @DisplayName("148 Sort List")
    void sortList() {
        ListNode expected = ArrayUtil.toList(new int[]{1, 2, 3, 4});
        ListNode input = ArrayUtil.toList(new int[]{4, 2, 1, 3});
        assertEquals(expected, solution.sortList(input));
    }
}