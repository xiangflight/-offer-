package algo.binarysearch;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/27
 */

class BinarySearchVariant {

    /**
     * 在有序数组中找到第一个匹配的值
     *
     * @param arr    数组
     * @param target 目标值
     * @return 值的索引
     */
    int findFirstMatchValue(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (target < arr[mid]) {
                hi = mid - 1;
            } else if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                if ((mid == 0) || (arr[mid - 1] != target)) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 在有序数组中找到最后一个匹配的值
     *
     * @param arr    数组
     * @param target 目标值
     * @return 值的索引
     */
    int findLastMatchValue(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (target > arr[mid]) {
                lo = mid + 1;
            } else if (target < arr[mid]) {
                hi = mid - 1;
            } else {
                if ((mid == arr.length - 1) || (arr[mid + 1] != target)) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    /**
     * 找到第一个大于等于给定值的元素
     *
     * @param arr    数组
     * @param target 目标值
     * @return 值的索引
     */
    int findFirstLargerOrEqual(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (target > arr[mid]) {
                lo = mid + 1;
            } else {
                if ((mid == 0) || (arr[mid - 1] < target)) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 找到最后一个小于等于给定值的元素
     *
     * @param arr    数组
     * @param target 目标值
     * @return 值的索引
     */
    int findLastLessOrEqual(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >> 1);
            if (target < arr[mid]) {
                hi = mid - 1;
            } else {
                if ((mid == arr.length - 1) || (arr[mid + 1] > target)) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

}
