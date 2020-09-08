package algo.sort;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/22
 * <p>
 * 冒泡排序：
 * 原地排序
 * 基于 比较 和 交换 两个操作原子
 * 空间复杂度：O(1)
 * 稳定的排序算法
 * <p>
 * 时间复杂度：
 * 最好：数组如果本来是有序，需要进行 1 次冒泡操作，花费 O(n)
 * 最坏：数组如果本来是倒序，需要进行 n 次冒泡操作，花费 O(n^2)
 * 平均：用有序度和逆序度评估
 */

public class BubbleSort implements ISort {

    @Override
    public void sortAscend(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}