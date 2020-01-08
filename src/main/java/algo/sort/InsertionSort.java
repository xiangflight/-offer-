package algo.sort;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/22
 * <p>
 * 插入排序
 * 原地排序
 * 基于 比较 和 移动 两个操作原子
 * 空间复杂度：O(1)
 * 稳定的排序算法
 * <p>
 * 时间复杂度：
 * 最好：数组本来有序，需要O(n)
 * 最坏：数组本来逆序，需要O(n^2)
 * 平均：移动的次数等于逆序度
 */

public class InsertionSort implements ISort {

    @Override
    public void sortAscend(int[] arr, int n) {
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}
