package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/1
 * <p>
 * 用队列实现栈
 * <p>
 * difficulty: 简单
 * expect:     10 分钟
 * <p>
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class Solution0225 {

    class MyStack {

        private Queue<Integer> pushQueue;
        private Queue<Integer> helperQueue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            pushQueue = new LinkedList<>();
            helperQueue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            reset();
            pushQueue.offer(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            reset();
            while (pushQueue.size() != 1) {
                helperQueue.offer(pushQueue.poll());
            }
            return pushQueue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            reset();
            while (pushQueue.size() != 1) {
                helperQueue.offer(pushQueue.poll());
            }
            return pushQueue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return pushQueue.isEmpty() && helperQueue.isEmpty();
        }

        /**
         * 始终保持队形，然而也可以交换两者的作用
         */
        private void reset() {
            while (!pushQueue.isEmpty()) {
                helperQueue.offer(pushQueue.poll());
            }
            Queue<Integer> temp = pushQueue;
            pushQueue = helperQueue;
            helperQueue = temp;
        }
    }

}
