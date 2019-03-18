package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-18 20:44
 *
 * 二叉树的深度
 *
 */

public class Solution42 {

    /**
     * 题目：输入一棵二叉树的根结点，求该树的高度。从根结点
     *      到叶结点依次经过的结点（含根、叶结点）形成树的
     *      一条路径，最长路径的长度为树的深度
     *
     * @param root 树的根结点
     * @return 树的深度
     */
    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
    }

}
