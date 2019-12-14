package leetcode;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0075 {

    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public void sortColorsCountSort(int[] nums) {
        int[] buckets = new int[3];
        // 存放 0,1,2 三个元素的频率
        for (int num: nums) {
            assert num >= 0 && num <= 2;
            buckets[num]++;
        }
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            while (buckets[i]-- > 0) {
                nums[index++] = i;
            }
        }
    }

    /**
     * 使用三路快排
     *
     * @param nums 输入数组
     */
    public void sortColorsPerf(int[] nums) {
        int zero = -1;
        int two = nums.length;
        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                ArrayUtil.swap(nums, i, two);
            } else {
                ++zero;
                ArrayUtil.swap(nums, zero, i);
                i++;
            }
        }
    }
}
