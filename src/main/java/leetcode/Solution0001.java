package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Solution0001 {

    /**
     * find the two numbers, so their sum equals to target
     *
     * @param nums input array
     * @param target target value
     * @return indexes of two numbers
     */
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (memo.containsKey(complement)) {
                return new int[]{memo.get(complement), i};
            }
            memo.put(nums[i], i);
        }
        return new int[0];
    }

}
