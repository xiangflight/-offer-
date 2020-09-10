package labuladong.ch3;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/10
 */

public class Prefix {

    int subarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> preSum= new HashMap<>();
        preSum.put(0, 1);

        int ans = 0, sum0_i = 0;
        for (int i = 0; i < n; i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;
            if (preSum.containsKey(sum0_j)) {
                ans += preSum.get(sum0_i);
            }
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }

        return ans;
    }

}
