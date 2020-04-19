package interview.geektime.stackandqueue;

import java.util.PriorityQueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 * <p>
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

public class KthLargest {

    final PriorityQueue<Integer> minHeap;
    final int size;

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>(k);
        this.size = k;
        for (int i: nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (minHeap.size() < size) {
            minHeap.offer(val);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }

}

