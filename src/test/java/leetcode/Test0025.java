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

class Test0025 {

    private final Solution0025 solution = new Solution0025();

    @Test
    @DisplayName("25 Reverse Nodes in k-Group")
    void reverseKGroup() {
        ListNode expected = ArrayUtil.toList(new int[] {3, 2, 1, 4, 5});
        ListNode input = ArrayUtil.toList(new int[] {1, 2, 3, 4, 5});
        int k = 3;
        assertEquals(expected, solution.reverseKGroup(input, 3));
    }
}