package com.xiangflight.leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/12 7:07 下午
 */

public class Solution112 {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

}
