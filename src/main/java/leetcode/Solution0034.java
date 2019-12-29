package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution0034 {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        int firstPosition = findFirstPosition(nums, 0, nums.length - 1, target);
        int lastPosition = findLastPosition(nums, 0, nums.length - 1, target);
        return new int[] {firstPosition, lastPosition};
    }

    private int findLastPosition(int[] nums, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                if ((mid == nums.length - 1) || (nums[mid + 1] != target)) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    private int findFirstPosition(int[] nums, int lo, int hi, int target) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > target) {
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                if ((mid == 0) || (nums[mid - 1] != target)) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

}
