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

class Test0082 {

    private final Solution0082 solution = new Solution0082();

    @Test
    @DisplayName("82 Remove Duplicates from Sorted List II")
    void deleteDuplicates() {
        ListNode expected = ArrayUtil.toList(new int[] {1, 2, 5});
        ListNode input = ArrayUtil.toList(new int[] {1, 2, 3, 3, 4, 4, 5});
        assertEquals(expected, solution.deleteDuplicates(input));
    }
}