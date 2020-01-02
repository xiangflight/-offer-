package swordoffer;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 * <p>
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */

public class Solution039 {

    public static void main(String[] args) {
        int[] arr = {1};
        int i = new Solution039().MoreThanHalfNum_Solution(arr);
        System.out.println(i);
    }

    /**
     * Time Complexity: O(nlogn)
     *
     * @param array array
     * @return res
     */
    public int MoreThanHalfNum_Solution2(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int res = array[array.length / 2];
        int cnt = 0;
        for (int num : array) {
            if (num == res) {
                cnt++;
            }
        }
        return cnt > array.length / 2 ? res : 0;
    }

    // 需要修改输入数组
    public int MoreThanHalfNum_Solution1(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        // ----------------------
        if (array.length == 1) {
            return array[0];
        }
        // ----------------------
        int res = findKthLargest(array, array.length >>> 1);
        int cnt = 0;
        for (int num : array) {
            if (num == res) {
                cnt++;
            }
        }
        return cnt > array.length / 2 ? res : 0;
    }

    /**
     * Boyer-Moore Majority Vote Algorithm
     *
     * @param array array
     * @return res
     */
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int majority = array[0];
        int cnt = 1;
        for (int i = 1; i < array.length; i++) {
            if (cnt == 0) {
                majority = array[i];
                cnt = 1;
            }
            cnt = (array[i] == majority) ? cnt + 1: cnt - 1;
        }
        cnt = 0;
        for (int num : array) {
            if (num == majority) {
                cnt++;
            }
        }
        return cnt > array.length / 2 ? majority : 0;
    }

    public int findKthLargest(int[] num, int k) {
        int l = 0, r = num.length - 1;
        while (l <= r) {
            int p = partition(num, l, r);
            if (p + 1 == k) {
                break;
            }
            if (p + 1 < k) {
                l = p + 1;
            } else {
                r = p - 1;
            }
        }
        return num[k - 1];
    }

    private int partition(int[] num, int l, int r) {
        int pivot = num[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (num[j] > pivot) {
                ArrayUtil.swap(num, i, j);
                i++;
            }
        }
        ArrayUtil.swap(num, i, r);
        return i;
    }

}
