package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

public class Solution0031 {

    public void nextPermutation(int[] nums) {
         if (nums == null || nums.length == 0 || nums.length == 1) {
             return;
         }
         int i = nums.length - 1;
         while (i >= 1 && nums[i] <= nums[i - 1]) {
             i--;
         }
         if (i == 0) {
             reverse(nums, 0, nums.length - 1);
             return;
         }
         // 前面的值
         int candidate = i - 1;
         int j;
         for (j = nums.length - 1; j > candidate; j--) {
             if (nums[j] > nums[candidate]) {
                 break;
             }
         }
         swap(nums, candidate, j);
         reverse(nums, i, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}
