package algo.sort;

import utils.Assert;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/22
 */

public interface ISort {

    /**
     * 对数组排序
     *
     * @param arr 数组
     */
    default void sort(int[] arr) {
        Assert.checkNotEmpty(arr);
        sortAscend(arr, arr.length);
    }
    /**
     * 对长度为 n 的数组进行排序
     *
     * @param arr 数组
     * @param n 数组长度
     */
    void sortAscend(int[] arr, int n);

    /**
     * 交换数组中 i 和 j 位置上元素值
     *
     * @param arr 数组
     * @param i 位置 i
     * @param j 位置 j
     */
    default void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印数组
     *
     * @param arr 数组
     */
    default void print(int[] arr) {
        Arrays.stream(arr).forEach(val -> System.out.print(val + " "));
        System.out.println();
    }

}
