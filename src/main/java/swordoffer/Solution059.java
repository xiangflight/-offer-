package swordoffer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 * <p>
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * <p>
 * 例如，如果输入数组 {2, 3, 4, 2, 6, 2, 5, 1} 及滑动窗口的大小 3，
 * 那么一共存在 6 个滑动窗口，他们的最大值分别为 {4, 4, 6, 6, 6, 5}。
 */

public class Solution059 {

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 2, 6, 2, 5, 1};
        int size = 3;
        ArrayList<Integer> integers = new Solution059().maxInWindows(num, size);
        System.out.println(integers);
    }

    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (size > num.length || size < 1) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++) {
            maxHeap.add(num[i]);
        }
        res.add(maxHeap.peek());
        for (int i = 0, j = i + size; j < num.length; i++, j++) {
            maxHeap.remove(num[i]);
            maxHeap.add(num[j]);
            res.add(maxHeap.peek());
        }
        return res;
    }

}
