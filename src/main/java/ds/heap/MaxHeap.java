package ds.heap;

import utils.ArrayUtil;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 * <p>
 * 二叉堆的基本操作：
 * 加入新的元素
 * 删除元素
 * 堆化数组
 *
 * 堆化的过程是顺着节点所在路径比较交换的，所以堆化的时间复杂度跟树的高度成正比，也就是 O(logn)
 */

public class MaxHeap {

    private int[] arr;
    private int n;
    private int count;

    public MaxHeap(int capacity) {
        arr = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    /**
     * 插入一个元素
     *
     * @param data data
     */
    public void insert(int data) {
        if (count >= n) {
            return;
        }
        ++count;
        arr[count] = data;
        int i = count;
        while (i / 2 > 0 && arr[i] > arr[i / 2]) {
            ArrayUtil.swap(arr, i, i / 2);
            i /= 2;
        }
    }

    public void removeMax() {
        if (count == 0) {
            return;
        }
        arr[1] = arr[count];
        --count;
        heapify(arr, count, 1);
    }

    private void heapify(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && arr[i] < arr[i * 2]) {
                maxPos = i * 2;
            }
            if (i *2 + 1 <= n && arr[maxPos] < arr[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (maxPos == i) {
                break;
            }
            ArrayUtil.swap(arr, i, maxPos);
            i = maxPos;
        }
    }

    public void buildHeap(int[] a, int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(arr, n, i);
        }
    }

    public void sort(int[] a, int n) {
        buildHeap(a, n);
        int k = n;
        while (k > 1) {
            ArrayUtil.swap(a, 1, k);
            --k;
            heapify(arr, k, 1);
        }
    }

}
