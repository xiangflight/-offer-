package leetcode;

import leetcode.ds.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Test2 {

    private final Solution2 solution = new Solution2();

    @Test
    void testSolution2() {
        ListNode l1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        l1.setNext(node1);
        node1.setNext(node2);

        ListNode l2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);
        l2.setNext(node3);
        node3.setNext(node4);

        ListNode ret = new ListNode(7);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(8);
        ret.setNext(node5);
        node5.setNext(node6);

        assertEquals(ret, solution.addTwoNumbers(l1, l2));
    }

}
