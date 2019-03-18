package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-18 20:45
 *
 * 平衡二叉树
 *
 */

public class Solution43 {

    private boolean isBalanced = true;

    /**
     * 题目：输入一棵二叉树的根结点，判断该树是不是平衡
     *      二叉树。左右子树相差不超过1就是平衡二叉树。
     *
     * @param root 树的根结点
     * @return 是否是平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }

    /**
     * 采用后序遍历的思路，不需要重复访问同一个结点
     *
     * @param root 结点
     * @return 结点的深度
     */
    private int height(TreeNode root) {
        if (root == null || !isBalanced) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(left, right);
    }

}
