package com.xiangflight.cig;

import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 8:47 上午
 */

public class SortStackByStack {

    /**
     * 用一个栈实现另一个栈的排序
     *
     * @param stack 栈
     */
    public static void sortStackByStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            while (!helper.isEmpty() && helper.peek() < curr) {
                stack.push(helper.pop());
            }
            helper.push(curr);
        }
        while (!helper.isEmpty()) {
            stack.push(helper.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(6);
        stack.push(4);
        stack.push(5);
        stack.push(2);
        sortStackByStack(stack);
        System.out.println(stack);
    }
}
