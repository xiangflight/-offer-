package leetcode.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/8
 */

public class Solution0053 {

    /**
     * 1. 明确状态
     * 2. 定义dp数组的含义
     * 3. 明确选择并择优
     * 4. 明确 base case
     *
     * @param nums nums
     * @return 最大和
     */
    public int maxSubArray(int[] nums) {
        // dp[i] = x 表示以 i 结尾的连续子数组最大和
        int[] dp = new int[nums.length];
        // base case
        dp[0] = nums[0];
        // 状态就是最大和
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int res = Integer.MIN_VALUE;
        for (int value : dp) {
            res = Math.max(res, value);
        }
        return res;
    }

    public static void main(String[] args) {
        int i = new Solution0053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(i);
    }

}
