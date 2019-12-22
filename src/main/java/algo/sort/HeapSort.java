package algo.sort;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class HeapSort implements ISort {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 4, 5};
        new HeapSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void sortAscend(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        // 1. build heap
        buildHeap(arr);
        // 2. 排序
        int k = n - 1;
        while (k > 0) {
            // 将堆顶元素与最后一个元素交换位置
            swap(arr, 0, k);
            heapify(arr, --k, 0);
        }
    }

    /**
     * 将一个数组转化为一个堆
     * <p>
     * 从最后一个非叶子节点依次堆化到根节点
     *
     * @param arr 原始数组
     */
    private void buildHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, arr.length - 1, i);
        }
    }

    /**
     * 堆化操作
     *
     * @param arr 原始数组
     * @param n   最后堆元素下标
     * @param i   要堆化的数组元素下标
     */
    private void heapify(int[] arr, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i * 2 + 1 <= n && arr[i] < arr[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (i * 2 + 2 <= n && arr[maxPos] < arr[i * 2 + 2]) {
                maxPos = i * 2 + 2;
            }
            if (maxPos == i) {
                break;
            }
            swap(arr, i, maxPos);
            i = maxPos;
        }
    }
}
