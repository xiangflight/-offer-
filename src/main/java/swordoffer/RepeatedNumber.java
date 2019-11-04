package swordoffer;

import utils.ArrayUtil;
import utils.Assert;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class RepeatedNumber {

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param nums 输入数组
     * @return 重复数字
     */
    int repeatedUsingHashtable(int[] nums) {
        Assert.checkNotEmpty(nums);
        // take mem as cache, so index of mem is [0..n-1]
        int[] mem = new int[nums.length];
        for (int n : nums) {
            if (mem[n] != 0) {
                return n;
            }
            mem[n]++;
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

    /**
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(1)
     *
     * @param nums 输入数组
     * @return 重复数字
     */
    int repeatedUsingSorting(int[] nums) {
        assert nums != null && nums.length != 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * <p>
     * in place operation
     *
     * @param nums 输入数组
     * @return 重复数字
     */
    int repeatedInPlace(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int accessIndex = Math.abs(nums[i]);
            if (nums[accessIndex] < 0) {
                // has visited
                return accessIndex;
            }
            // not visited
            nums[accessIndex] = - nums[accessIndex];
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param nums 输入数组
     * @return 重复数字
     */
    int repeatedInPlaceUsingSwap(int[] nums) {
        Assert.checkNotEmpty(nums);
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                ArrayUtil.swap(nums, i, nums[i]);
            }
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }
}
