package swordoffer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/7
 */

public class MaxQueue {

    /**
     * 所有元素都入队的队列
     */
    private Queue<Integer> dataQueue;
    /**
     * 最大值队列，其中队头元素最大
     */
    private Deque<Integer> maximumQueue;

    public MaxQueue() {
        dataQueue = new ArrayDeque<>();
        maximumQueue = new ArrayDeque<>();
    }

    public void push_back(int value) {
        dataQueue.offer(value);
        while (!maximumQueue.isEmpty() && value > maximumQueue.peekLast()) {
            maximumQueue.pollLast();
        }
        maximumQueue.offer(value);
    }

    public int pop_front() {
        int front = dataQueue.isEmpty() ? -1: dataQueue.poll();
        if (!maximumQueue.isEmpty() && maximumQueue.peek() == front) {
            maximumQueue.poll();
        }
        return front;
    }

    public int max_value() {
        return maximumQueue.isEmpty() ? -1: maximumQueue.peek();
    }

}
