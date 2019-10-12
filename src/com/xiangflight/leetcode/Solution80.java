package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 9:43 上午
 * <p>
 * Remove Duplicates from Sorted Array II
 */

public class Solution80 {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int ans1 = new Solution80().removeDuplicates(nums1);
        System.out.println(ans1);
    }

    /**
     * S: remove duplicates from sorted array, appear at most twice
     * A: return the length of output array
     * E: num = [1,1,1,2,2,3] -> [1,1,2,2,3] 5  [0,0,1,1,1,1,2,3,3] -> [0,0,1,1,2,3,3] 7
     * T: nums[i] != nums[i-2]
     * C: Coding
     * C: Complexity O(n)
     * T: Tests
     *
     * @param nums 输入数组
     * @return 输出数组的长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        if (len < 3) {
            return len;
        }
        int newIndex = 2;
        for (int i = 2; i < len; i++) {
            if (nums[i] != nums[newIndex - 2]) {
                nums[newIndex++] = nums[i];
            }
        }
        return newIndex;
    }

}
