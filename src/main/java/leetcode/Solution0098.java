package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0098 {

    TreeNode pre = null;

    public boolean isValidBST(TreeNode root) {
        return isBSTUtil(root);
    }

    private boolean isBSTUtil(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isBSTUtil(root.left)) {
            return false;
        }
        if (pre != null && root.val <= pre.val) {
            return false;
        }
        pre = root;
        return isBSTUtil(root.right);
    }

    public boolean isValidBST1(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer lower, Integer upper) {
        if (root == null) {
            return true;
        }
        int val = root.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        if (!helper(root.left, lower, val)) {
            return false;
        }
        return helper(root.right, val, upper);
    }

}
