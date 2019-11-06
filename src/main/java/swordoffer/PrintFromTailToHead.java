package swordoffer;

import dsa.ListNode;
import utils.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */

class PrintFromTailToHead {

    List<Integer> printFromTailToHead(ListNode head) {
        Assert.checkNotNull(head);
        List<Integer> res = new ArrayList<>();
        recursivePrint(head, res);
        return res;
    }

    private void recursivePrint(ListNode node, List<Integer> res) {
        if (node.next != null) {
            recursivePrint(node.next, res);
        }
       res.add(node.val);
    }

    List<Integer> printFromTailToHeadUsingStack(ListNode head) {
        Assert.checkNotNull(head);
        List<Integer> res = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();
        ListNode tmp = head;
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop().val);
        }
        return res;
    }
}
