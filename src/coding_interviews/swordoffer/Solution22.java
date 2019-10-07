package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 17:51
 *
 * 二叉树的镜像
 *
 */

public class Solution22 {

    /**
     * 题目：请完成一个函数，输入一个二叉树，该函数输出它的
     *      镜像。例如：
     *      8                8
     *     / \              / \
     *    6  10     ->    10  6
     *   / \ / \         / \  / \
     *  5  7 9 11       11 9 7  5
     *
     *  思路：类似前序遍历
     *
     * @param root 二叉树的根结点
     */
    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        swap(root);
        mirror(root.left);
        mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
