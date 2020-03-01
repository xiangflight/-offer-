package swordoffer;

import utils.ArrayUtil;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 */

public class Solution003 {

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    duplication[0] = nums[i];
                    return true;
                }
                ArrayUtil.swap(nums, i, nums[i]);
            }
        }
        return false;
    }

}
