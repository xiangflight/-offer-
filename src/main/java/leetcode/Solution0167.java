package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0167 {

    public int[] twoSum(int[] numbers, int target) {
        int p = 0, q = numbers.length - 1;
        while (p < q) {
            int sum = numbers[p] + numbers[q];
            if (sum == target) {
                return new int[]{p + 1, q + 1};
            }
            if (sum > target) {
                q--;
            } else {
                p++;
            }
        }
        return new int[0];
    }

    public int[] twoSumUsingBinarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int p = binarySearch(numbers, i + 1, numbers.length - 1, target - numbers[i]);
            if (p != -1) {
                return new int[]{i + 1, p + 1};
            }
        }
        return new int[2];
    }

    private int binarySearch(int[] arr, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

}
