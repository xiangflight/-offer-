package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for (int k = 0; k < length - 3; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            int curMin = nums[k] + nums[k + 1] + nums[k + 2] + nums[k + 3];
            if (curMin > target) {
                break;
            }
            int curMax = nums[k] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (curMax < target) {
                continue;
            }
            for (int i = k + 1; i < length - 2; i++) {
                if (i > k + 1 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1;
                int h = length - 1;
                int min = nums[k] + nums[i] + nums[j] + nums[j + 1];
                if (min > target) {
                    continue;
                }
                int max = nums[k] + nums[i] + nums[h] + nums[h - 1];
                if (max < target) {
                    continue;
                }
                while (j < h) {
                    int sum = nums[k] + nums[i] + nums[j] + nums[h];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[k], nums[i], nums[j], nums[h]));
                        while (j < h && nums[j] == nums[j + 1]) {
                            j++;
                        }
                        while (j < h && nums[h] == nums[h - 1]) {
                            h--;
                        }
                        j++;
                        h--;
                    } else if (sum > target) {
                        h--;
                    } else {
                        j++;
                    }
                }

            }

        }
        return res;
    }

}
