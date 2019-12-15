package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0015 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int hi = nums.length - 1;
            int sum = -nums[i];
            while (low < hi) {
                if (nums[low] + nums[hi] == sum) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[hi]));
                    while (low < hi && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < hi && nums[hi] == nums[hi - 1]) {
                        hi--;
                    }
                    low++;
                    hi--;
                } else if (nums[low] + nums[hi] > sum) {
                    hi--;
                } else {
                    low++;
                }
            }
        }

        return res;
    }

}
