package swordoffer;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class Solution021 {

    public void reOrderArray(int [] array, Function<Integer, Boolean> func) {
        if (array == null || array.length == 0) {
            return;
        }
        int i = 0, j = array.length - 1;
        while (i < j) {
            while (i < j && !func.apply(i)) {
                i++;
            }
            while (i < j && func.apply(j)) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
            }
            i++;
            j--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 2, 1, 3, 1, 6, 3, 2};
//        new Solution021().reOrderArray(array, Solution021::isEven);
        System.out.println(Arrays.toString(array));
        new Solution021().reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public void reOrderArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (isEven(array[j]) && !isEven(array[j+1])) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

}
