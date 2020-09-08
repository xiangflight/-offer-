package labuladong.ch2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class MonotonicQueue {

    Deque<Integer> queue = new ArrayDeque<>();

    void push(int n) {
        while (!queue.isEmpty() && queue.peekLast() < n) {
            queue.pollLast();
        }
        queue.addLast(n);
    }

    void pop(int n) {
        if (!queue.isEmpty() && queue.peekFirst() == n) {
            queue.pollFirst();
        }
    }

    int max() {
        if (!queue.isEmpty()) {
            return queue.peekFirst();
        }
        return -1;
    }

    List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();

        MonotonicQueue window = new MonotonicQueue();

        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                window.push(nums[i]);
            } else {
                window.push(nums[i]);
                res.add(window.max());
                window.pop(nums[i - k + 1]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> list = new MonotonicQueue().maxSlidingWindow(nums, k);
        System.out.println(list);
    }


}
