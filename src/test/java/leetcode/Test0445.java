package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 */

class Test0445 {

    private final Solution0445 solution = new Solution0445();

    @Test
    @DisplayName("445 Add Two Numbers II")
    void addTwoNumbers() {
        ListNode expected = ArrayUtil.toList(new int[] {7, 8, 0, 7});
        ListNode l1 = ArrayUtil.toList(new int[] {7, 2, 4, 3});
        ListNode l2 = ArrayUtil.toList(new int[] {5, 6, 4});
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}