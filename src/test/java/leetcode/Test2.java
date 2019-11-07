package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Test2 {

    private final Solution0002 solution = new Solution0002();

    @Test
    @DisplayName("2 Add Two Numbers")
    void testSolution2() {
        int[] first = {2, 4, 5};
        int[] second = {5, 6, 4};
        int[] third = {7, 0, 0, 1};
        ListNode l1 = ArrayUtil.toList(first);
        ListNode l2 = ArrayUtil.toList(second);
        ListNode ans = ArrayUtil.toList(third);
        assertEquals(ans, solution.addTwoNumbers(l1, l2));
    }

}
