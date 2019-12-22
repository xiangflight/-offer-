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

class Test0203 {

    private final Solution0203 solution = new Solution0203();

    @Test
    @DisplayName("203 Remove Linked List Elements")
    void removeElements() {
        ListNode expected = ArrayUtil.toList(new int[]{1, 2, 3, 4, 5});
        ListNode input = ArrayUtil.toList(new int[]{1, 2, 6, 3, 4, 5, 6});
        int val = 6;
        assertEquals(expected, solution.removeElements(input, val));
    }
}