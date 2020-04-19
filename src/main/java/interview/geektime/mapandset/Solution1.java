package interview.geektime.mapandset;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 */

public class Solution1 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if (sum < 0) {
                    lo++;
                } else if (sum > 0) {
                    hi--;
                } else {
                    res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                    while (lo < hi && nums[lo] == nums[lo + 1]) {
                        lo++;
                    }

                    while (lo < hi && nums[hi] == nums[hi - 1]) {
                        hi--;
                    }

                    lo++;
                    hi--;
                }
            }
        }
        return res;
    }

}
