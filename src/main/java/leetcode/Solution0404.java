package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0404 {

    int res = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        getSum(root);
        return res;
    }

    private void getSum(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.left.left == null && root.left.right == null) {
                res += root.left.val;
            }
            getSum(root.left);
            getSum(root.right);
        }
    }
}
