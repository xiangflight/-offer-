package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0016 {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int hi = nums.length - 1;
            while (low < hi) {
                int sum = nums[i] + nums[low] + nums[hi];
                if (Math.abs(target - sum) < Math.abs(target - res)) {
                    res = sum;
                }
                if (sum > target) {
                    hi--;
                } else if (sum < target) {
                    low++;
                } else {
                    return res;
                }
            }
        }
        return res;
    }

}
