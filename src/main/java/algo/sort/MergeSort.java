package algo.sort;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 * <p>
 * 归并排序
 * 非原地排序算法
 * 空间复杂度：O(n)
 * 稳定的排序算法
 * <p>
 * 时间复杂度：
 * 最好、最坏、平均时间复杂度都是：O(nlogn)
 */

public class MergeSort implements ISort {

    private int[] aux;

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 23, 4, 5, 3, 21, 1};
        new MergeSort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void sortAscend(int[] arr, int n) {
        aux = new int[n];
        mergeSort(arr, 0, n - 1);
    }

    private void mergeSort(int[] arr, int p, int r) {
        // 终止条件
        if (p >= r) {
            return;
        }
        int q = p + (r - p) / 2;
        mergeSort(arr, p, q);
        mergeSort(arr, q + 1, r);
        merge(arr, p, q, r);
    }

    /**
     * 将 arr[p...q] 和 arr[q+1...r] 合并成 arr[p...r]
     *
     * @param arr 数组
     * @param p   p
     * @param q   q
     * @param r   r
     */
    private void merge(int[] arr, int p, int q, int r) {
        int i = p, j = q + 1;
        for (int k = p; k <= r; k++) {
            aux[k] = arr[k];
        }
        for (int k = p; k <= r; k++) {
            if (i > q) {
                arr[k] = aux[j++];
            } else if (j > r) {
                arr[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

}
