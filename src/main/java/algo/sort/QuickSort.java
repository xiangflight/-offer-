package algo.sort;

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

    @Override
    public void sortAscend(int[] arr, int n) {
        quickSort(arr, 0, n - 1);
    }

    private void quickSort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        // 获取分区点
        int q = partition(arr, p, r);
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

}
