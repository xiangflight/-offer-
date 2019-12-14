package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0283 {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int len = nums.length;
        if (len == 0) {
            return;
        }
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        while (j < len) {
            nums[j++] = 0;
        }
    }

}
