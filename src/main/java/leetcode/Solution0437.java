package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0437 {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    /**
     * 以 root 为根节点的树中找一个 path sums up to sum
     *
     * @param root root
     * @param sum  sum
     * @return amount
     */
    private int findPath(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int res = 0;
        if (root.val == sum) {
            res += 1;
            // cannot return directly
        }
        res += findPath(root.left, sum - root.val);
        res += findPath(root.right, sum - root.val);

        return res;
    }

}
