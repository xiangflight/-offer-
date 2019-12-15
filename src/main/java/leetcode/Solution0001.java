package leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Solution0001 {

    int[] twoSumPreferMemory(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    int[] twoSumPreferPerformance(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>(1000);
        for (int i = 0; i < nums.length; i++) {
            if (store.containsKey(target - nums[i])) {
                return new int[]{store.get(target - nums[i]), i};
            }
            store.put(nums[i], i);
        }
        return new int[2];
    }

}
