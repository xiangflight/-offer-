package leetcode;

import ds.linkedlist.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ArrayUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/23
 */

class Test0876 {

    private final Solution0876 solution = new Solution0876();

    @Test
    @DisplayName("876 Middle Of the Linked List")
    void middleNode() {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ArrayUtil.toList(arr);
        assertEquals(head.next.next, solution.middleNode(head));
        arr = new int[] {1, 2, 3, 4, 5, 6};
        ListNode another = ArrayUtil.toList(arr);
        assertEquals(head.next.next.next, solution.middleNode(another));
    }
}