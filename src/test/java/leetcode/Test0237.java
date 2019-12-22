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

class Test0237 {

    private final Solution0237 solution = new Solution0237();

    @Test
    @DisplayName("237 Delete Node in a Linked List")
    void deleteNode() {
        ListNode input = ArrayUtil.toList(new int[]{4, 5, 1, 9});
        ListNode expected = ArrayUtil.toList(new int[]{4, 1, 9});
        solution.deleteNode(input);
        assertEquals(expected, input);
    }
}