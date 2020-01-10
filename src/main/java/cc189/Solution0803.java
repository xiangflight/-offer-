package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class Solution0803 {

    public static void main(String[] args) {
        Solution0803 solution = new Solution0803();
        int[] arr = {-10, -5, 2, 2, 2, 3, 4, 7, 9, 12, 13};
        System.out.println(solution.magicIndex(arr));
        System.out.println(solution.magicIndex2(arr));
        System.out.println(solution.magicFast(arr));
        System.out.println(solution.magicFast2(arr));
    }

    /**
     * arr[i] == i
     *
     * @param arr 输入数组
     * @return magic index
     */
    public int magicIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int magicIndex2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + ((hi - lo) >>> 1);
            if (arr[mid] == mid) {
                return mid;
            } else if (arr[mid] > mid) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    public int magicFast(int[] array) {
        return magicFast(array, 0, array.length - 1);
    }

    private int magicFast(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == mid) {
            return mid;
        } else if (array[mid] > mid) {
            return magicFast(array, start, mid - 1);
        } else {
            return magicFast(array, mid + 1, end);
        }
    }

    public int magicFast2(int[] array) {
        return magicFast2(array, 0, array.length - 1);
    }

    private int magicFast2(int[] array, int start, int end) {
        if (end < start) {
            return -1;
        }
        int midIndex = (start + end) / 2;
        int midValue = array[midIndex];
        if (midValue == midIndex) {
            return midIndex;
        }
        /* search left */
        int leftEnd = Math.min(midIndex - 1, midValue);
        int left = magicFast2(array, start, leftEnd);
        if (left >= 0) {
            return left;
        }
        /* search right */
        int rightStart = Math.max(midIndex + 1, midValue);
        int right = magicFast2(array, rightStart, end);
        return right;
    }

}
