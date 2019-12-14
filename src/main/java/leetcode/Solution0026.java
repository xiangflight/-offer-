package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0026 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int last = nums[0];
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last) {
                nums[++j] = nums[i];
                last = nums[i];
            }
        }
        return j + 1;
    }

    public int removeDuplicatesBetter(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            // note the index {index - k}
            if (nums[i] != nums[index - k]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }

}
