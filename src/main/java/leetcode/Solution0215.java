package leetcode;

import utils.ArrayUtil;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0215 {

    public int findKthLargest(int[] nums, int k) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int p = partition(nums, l, r);
            if (p + 1 == k) {
                break;
            } else if (k > p + 1) {
                l = p + 1;
            } else {
                r = p - 1;
            }
        }
        return nums[k - 1];
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (nums[j] > pivot) {
                ArrayUtil.swap(nums, i, j);
                i++;
            }
        }
        ArrayUtil.swap(nums, i, r);
        return i;
    }


}
