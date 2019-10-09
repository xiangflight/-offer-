package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/8 7:58 上午
 *
 * maximum product subarray
 *
 *     与最大子数组和的最大的不同就是要维护一个最小值，因为存在负数，所以会出现最小值变最大值的情况
 *
 */

public class Solution152 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("nums should not be null or empty");
        }
        int curMin = 1;
        int curMax = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num < 0) {
                int temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            curMax = Math.max(num, curMax * num);
            curMin = Math.min(num, curMin * num);
            maxProduct = Math.max(maxProduct, curMax);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 3, -4};
        int ans = new Solution152().maxProduct(nums1);
        System.out.println(ans);
    }

}
