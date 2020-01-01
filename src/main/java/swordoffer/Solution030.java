package swordoffer;

import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution030 {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void push(int node) {
        stack.push(node);
        if (helper.isEmpty()) {
            helper.push(node);
        } else {
            helper.push(Math.min(node, helper.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
        if (!helper.isEmpty()) {
            helper.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new RuntimeException("stack is empty");
    }

    public int min() {
        if (!helper.isEmpty()) {
            return helper.peek();
        }
        throw new RuntimeException("stack is empty");
    }

}
