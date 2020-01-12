package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodesRecursive(root);
    }

    private int countNodesRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }

}
