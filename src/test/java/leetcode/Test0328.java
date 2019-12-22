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

class Test0328 {

    private final Solution0328 solution = new Solution0328();

    @Test
    @DisplayName("328 Odd Even Linked List")
    void oddEvenList() {
        ListNode expected = ArrayUtil.toList(new int[]{1, 3, 5, 2, 4});
        ListNode input = ArrayUtil.toList(new int[]{1, 2, 3, 4, 5});
        assertEquals(expected, solution.oddEvenList(input));
    }
}