package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 * <p>
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 * <p>
 * 快速选择 或者 使用 最大堆
 * <p>
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 */

public class Solution0040 {

    /**
     * 大顶堆
     *
     * @param arr 数组
     * @param k   k
     * @return res
     */
    public int[] getLeastNumbersMaxHeap(int[] arr, int k) {
        if (k <= 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);
        for (int val : arr) {
            if (maxHeap.size() < k) {
                maxHeap.offer(val);
            } else if (val < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(val);
            }
        }
        int[] res = new int[maxHeap.size()];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
        }
        return res;
    }

    /**
     * 快速选择
     *
     * @param arr 数组
     * @param k   k
     * @return res
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length <= k) {
            return arr;
        }
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int p = partition(arr, l, r);
            if (p == k - 1) {
                break;
            }
            if (p > k - 1) {
                r = p - 1;
            } else {
                l = p + 1;
            }
        }
        return Arrays.copyOf(arr, k);
    }

    /**
     *  4、5、1、6、2、7、3
     */
    private int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, hi);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

}
