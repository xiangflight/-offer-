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

class Test0086 {

    private final Solution0086 solution = new Solution0086();

    @Test
    @DisplayName("86 Partition List")
    void partition() {
        ListNode expected = ArrayUtil.toList(new int[]{1, 2, 2, 4, 3, 5});
        ListNode input = ArrayUtil.toList(new int[]{1, 4, 3, 2, 5, 2});
        int x = 3;
        assertEquals(expected, solution.partition(input, x));
    }
}