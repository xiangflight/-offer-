package swordoffer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/4
 */

public class QueueWithMax {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 6, 2, 5, 1};
        QueueWithMax maxQueue = new QueueWithMax();
        for (int value : arr) {
            maxQueue.enqueue(value);
            System.out.println(maxQueue.max());
        }
    }

    public static class InternalData {
        int number;
        int index;

        public InternalData(int number, int index) {
            this.number = number;
            this.index = index;
        }
    }

    Deque<InternalData> data;
    Deque<InternalData> maximums;
    int currentIndex;

    public QueueWithMax() {
        currentIndex = 0;
        data = new ArrayDeque<>();
        maximums = new ArrayDeque<>();
    }

    public void enqueue(int number) {
        while (!maximums.isEmpty() && number >= maximums.peek().number) {
            maximums.poll();
        }
        InternalData internalData = new InternalData(number, currentIndex);
        data.offer(internalData);
        maximums.offer(internalData);
        ++currentIndex;
    }

    public void dequeue() {
        if (maximums.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (maximums.peek().index == data.peek().index) {
            maximums.poll();
        }
        data.poll();
    }

    public int max() {
        if (maximums.isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return maximums.peek().number;
    }
}
