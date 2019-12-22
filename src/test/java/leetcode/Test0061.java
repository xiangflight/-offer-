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

class Test0061 {

    private final Solution0061 solution = new Solution0061();

    @Test
    @DisplayName("61 Rotate List")
    void rotateRight() {
        ListNode input = ArrayUtil.toList(new int[]{0, 1, 2});
        int k = 4;
        ListNode expected = ArrayUtil.toList(new int[]{2, 0, 1});
        assertEquals(expected, solution.rotateRight(input, k));
    }
}