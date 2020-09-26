package interview.hw;

import utils.ArrayUtil;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/12
 */

public class QuickSort {

    void quickSort(int[] arr, int n) {
        sort(arr, 0, n - 1);
    }

    private void sort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = partition(arr, p, r);
        sort(arr, p, q - 1);
        sort(arr, q + 1, r);
    }

    private int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] < pivot) {
                ArrayUtil.swap(arr, i, j);
                i++;
            }
        }
        ArrayUtil.swap(arr, i, r);
        return i;
    }

}
