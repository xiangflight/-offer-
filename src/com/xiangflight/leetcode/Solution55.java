package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 12:41 下午
 */

public class Solution55 {

    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            // following statement is key
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }

    public boolean canJump1(int[] nums) {
        if (nums == null) {
            return false;
        }
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && nums[j] + j >= i) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[nums.length - 1];
    }

    /**
     * excellent solution
     *
     * @param nums over 100% users
     * @return jump to last index
     */
    public boolean canJump2(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

}
