package labuladong.ch4;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/11
 */

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = 0;

        res += n;

        for (int i = 0; i < n; i++) {
            res += (i - nums[i]);
        }

        return res;
    }

}
