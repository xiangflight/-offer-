package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0209 {

    /**
     * brute force
     * @param s s
     * @param nums 输入数组
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        int ret = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int sum = 0;
                for (int start = i; start <= j; start++) {
                    sum += nums[start];
                }
                if (sum >= s) {
                    ret = Math.min(ret, j - i + 1);
                }
            }
        }
        return ret == nums.length + 1 ? 0: ret;
    }

    public int minSubArrayLenPerf(int s, int[] nums) {
        int ret = nums.length + 1;
        // nums[l...r] is a sliding window
        int l = 0, r = -1;
        int sum = 0;
        while (l < nums.length) {
            if (r + 1 < nums.length && sum < s) {
                sum += nums[++r];
            } else {
                sum -= nums[l++];
            }
            if (sum >= s) {
                ret = Math.min(ret, r - l + 1);
            }
        }
        return nums.length + 1 == ret ? 0: ret;
    }

}
