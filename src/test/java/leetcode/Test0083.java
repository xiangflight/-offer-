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

class Test0083 {

    private final Solution0083 solution = new Solution0083();

    @Test
    @DisplayName("83 Remove Duplicates from Sorted List")
    void deleteDuplicates() {
        ListNode expected = ArrayUtil.toList(new int[]{1, 2});
        ListNode input = ArrayUtil.toList(new int[]{1, 1, 2});
        assertEquals(expected, solution.deleteDuplicates(input));
    }
}