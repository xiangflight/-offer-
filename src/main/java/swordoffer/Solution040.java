package swordoffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution040 {

    public static void main(String[] args) {
        int[] input = {4, 2, 3, 1, 2, 3};
        int k = 6;
        ArrayList<Integer> res = new Solution040().GetLeastNumbers_Solution(input, k);
        System.out.println(res);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0) {
            return res;
        }
        if (k > input.length || k <= 0) {
            return res;
        }
        findKthSmallest(input, k);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

    private void findKthSmallest(int[] input, int k) {
        int l = 0, r = input.length - 1;
        while (l <= r) {
            int p = partition(input, l, r);
            if (p + 1 == k) {
                break;
            }
            if (p + 1 < k) {
                l = p + 1;
            } else {
                r = p - 1;
            }
        }
    }

    private int partition(int[] input, int l, int r) {
        int pivot = input[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (input[j] < pivot) {
                swap(input, i, j);
                i++;
            }
        }
        swap(input, i, r);
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 用大顶堆实现，适合海量数据
     *
     * @param input 输入
     * @param k k
     * @return res
     */
    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0) {
            return res;
        }
        if (k > input.length || k <= 0) {
            return res;
        }
        PriorityQueue<Integer> maxHeap  = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num: input) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

}
