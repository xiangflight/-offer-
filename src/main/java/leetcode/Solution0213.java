package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/23
 */

public class Solution0213 {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, n - 1), rob(nums, 1, n));
    }

    private int rob(int[] nums, int start, int end) {
        int preMax = 0;
        int curMax = 0;
        for (int i = start; i < end; i++) {
            int tempMax = curMax;
            curMax = Math.max(curMax, preMax + nums[i]);
            preMax = tempMax;
        }
        return curMax;
    }

}
