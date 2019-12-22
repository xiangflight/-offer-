package ds.heap;

import utils.ArrayUtil;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class MinHeap {

    /**
     * 加入新的元素
     *
     * @param arr 底层数组
     * @param i   加入元素的索引
     */
    void minHeapFixup(int[] arr, int i) {
        for (int j = (i - 1) / 2; (j >= 0 && i != 0) && arr[i] > arr[j]; i = j, j = (i - 1) / 2) {
            ArrayUtil.swap(arr, i, j);
        }
    }


}
