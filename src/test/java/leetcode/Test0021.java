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

class Test0021 {

    private final Solution0021 solution = new Solution0021();

    @Test
    @DisplayName("21 Merge Two Sorted List")
    void mergeTwoLists() {
        ListNode expected = ArrayUtil.toList(new int[] {1, 1, 2, 3, 4, 4});
        ListNode l1 = ArrayUtil.toList(new int[] {1, 2, 4});
        ListNode l2 = ArrayUtil.toList(new int[] {1, 3, 4});
        assertEquals(expected, solution.mergeTwoLists(l1, l2));
    }
}