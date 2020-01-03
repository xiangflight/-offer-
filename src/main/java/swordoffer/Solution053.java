package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 统计一个数字在排序数组中出现的次数。
 *
 * Input:
 * nums = 1, 2, 3, 3, 3, 3, 4, 6
 * K = 3
 *
 * Output:
 * 4
 */

public class Solution053 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 6};
        int k = 3;
        int res = new Solution053().GetNumberOfK(arr, k);
        System.out.println(res);
    }

    public int GetNumberOfK(int [] array , int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int first = findFirstPlace(array, k);
        if (first == -1) {
            return 0;
        }
        int last = findLastPlace(array, k);
        return last - first + 1;
    }

    private int findLastPlace(int[] array, int k) {
        int lo = 0, hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (array[mid] < k) {
                lo = mid + 1;
            } else if (array[mid] > k) {
                hi = mid - 1;
            } else {
                if ((mid == array.length - 1) || (array[mid + 1] != k)) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    private int findFirstPlace(int[] array, int k) {
        int lo = 0, hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >>> 1);
            if (array[mid] > k) {
                hi = mid - 1;
            } else if (array[mid] < k) {
                lo = mid + 1;
            } else {
                if ((mid == 0) || (array[mid - 1] != k)) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

}
