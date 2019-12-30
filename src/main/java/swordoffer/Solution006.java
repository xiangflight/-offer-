package swordoffer;

import ds.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution006 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();
        if (listNode == null) {
            return res;
        }
        printListFromTailToHead(listNode, res);
        return res;
    }

    private void printListFromTailToHead(ListNode listNode, ArrayList<Integer> res) {
        if (listNode == null) {
            return;
        }
        if (listNode.next != null) {
            printListFromTailToHead(listNode.next, res);
        }
        res.add(listNode.val);
    }

    public ArrayList<Integer> printListFromTailToHeadIteratively(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ListNode p = listNode;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

}
