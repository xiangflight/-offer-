package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0080 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 2;
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - k]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
