package coding_interviews.swordoffer;

import java.util.Stack;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 09:15
 *
 * 包含min函数的栈
 *
 */

public class Solution24 {

    /*
     * 题目：定义栈的数据结构，请在该类型中实现一个能够能到栈的最小元素
     *      的min函数。在该栈中，调用min、push及pop的时间复杂度都是O(1)。
     */

    /**
     * 用两个栈模拟，一个栈存压入的值，一个栈存当前栈中的最小值
     *
     * 同时维护这两个栈
     */
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.isEmpty() || node < minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        if (!dataStack.isEmpty()) {
            return dataStack.peek();
        }
        throw new RuntimeException("current stack is empty");
    }

    public int min() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("current stack is empty");
    }
}
