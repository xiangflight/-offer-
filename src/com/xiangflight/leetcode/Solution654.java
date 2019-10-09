package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/9 8:50 下午
 */

public class Solution654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int len = nums.length;
        return constructMaximumBinaryTreeRecursive(nums, 0, len - 1);
    }

    private TreeNode constructMaximumBinaryTreeRecursive(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int[] max = maxValue(nums, start, end);
        TreeNode root = new TreeNode(max[0]);
        root.left = constructMaximumBinaryTreeRecursive(nums, start, max[1] - 1);
        root.right = constructMaximumBinaryTreeRecursive(nums, max[1] + 1, end);
        return root;
    }

    private int[] maxValue(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return new int[] {max, index};
    }

}
