package algo.sort;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 * <p>
 * 快速排序
 * 原地排序算法
 * 空间复杂度：O(1)
 * 不稳定的排序算法
 * <p>
 * 时间复杂度：
 * 最好：O(nlogn) 分区平衡
 * 最坏：O(n^2) 分区极其不平衡
 * 平均：O(nlogn)
 */

public class QuickSort implements ISort {

    public static void main(String[] args) {
        int[] arr = {1, 23, 2, 32, 2, 45, 3, 2, 2, 32, 3, 323, 2, 3, 2, 32};
        new QuickSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void sortAscend(int[] arr, int n) {
        quickSort(arr, 0, n - 1);
    }

    private void quickSort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        // 获取分区点
        int q = partition2Ways(arr, p, r);
        quickSort(arr, p, q - 1);
        quickSort(arr, q + 1, r);
    }

    private int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    private int partition2Ways(int[] arr, int lo, int hi) {
        int i = lo, j = hi + 1;
        int pivot = arr[lo];
        while (true) {
            while (arr[++i] < pivot) {
                if (i == hi) {
                    break;
                }
            }
            while (pivot < arr[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            ArrayUtil.swap(arr, i, j);
        }
        ArrayUtil.swap(arr, lo, j);
        return j;
    }

}
