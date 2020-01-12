package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/12
 */

public class Solution0154 {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                return minNumber(nums, lo, hi);
            }
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }

    public int minNumber(int[] nums, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            if (nums[i] > nums[i + 1]) {
                return nums[i + 1];
            }
        }
        return nums[lo];
    }

}
