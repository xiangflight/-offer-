package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0129 {

    private int res = 0;
    private int temp = 0;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumRoot(root);
        return res;
    }

    private void sumRoot(TreeNode root) {
        if (root == null) {
            return;
        }
        temp = temp * 10 + root.val;

        if (root.left == null && root.right == null) {
            res += temp;
        }
        if (root.left != null) {
            sumRoot(root.left);
        }
        if (root.right != null) {
            sumRoot(root.right);
        }

        temp /= 10;
    }
}
