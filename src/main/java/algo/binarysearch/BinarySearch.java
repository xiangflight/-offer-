package algo.binarysearch;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/26
 */

public class BinarySearch {

    /**
     * 无重复元素的二分查找
     *
     * @param arr 数组
     * @param target 要查找的数
     * @return 值的索引
     */
    public int bSearchImpl1(int[] arr, int target) {
        return binarySearch(arr, arr.length, target);
    }

    /**
     * 无重复元素的二分查找
     *
     * @param arr 数组
     * @param target 要查找的数
     * @return 值的索引
     */
    public int bSearchImpl2(int[] arr, int target) {
        return binarySearchInternal(arr, 0, arr.length - 1, target);
    }

    /**
     * 二分查找的非递归实现
     *
     * @param arr    数组
     * @param n      数组长度
     * @param target 要查找的值
     * @return 值的索引
     */
    private int binarySearch(int[] arr, int n, int target) {
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                hi = mid - 1;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找的递归实现
     *
     * @param arr    数组
     * @param lo     lo 位
     * @param hi     hi 位
     * @param target 要查找的值
     * @return 值的索引
     */
    private int binarySearchInternal(int[] arr, int lo, int hi, int target) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] > target) {
            return binarySearchInternal(arr, lo, mid - 1, target);
        } else if (arr[mid] < target) {
            return binarySearchInternal(arr, mid + 1, hi, target);
        } else {
            return mid;
        }
    }

}
