package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 17:12
 *
 * 树的子结构
 *
 */

public class Solution21 {

    /**
     * 题目：输入两棵二叉树A和B，判断B是不是A的子结构
     *
     * @param root1 二叉树A
     * @param root2 二叉树B
     * @return 二叉树B是否是A的子结构
     */
    public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        // 若指向同一棵树，则直接返回
        if (root1 == root2) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return isSubTreeWithSameRoot(root1, root2)
                || hasSubtree(root1.left, root2)
                || hasSubtree(root1.right, root2);
    }

    private boolean isSubTreeWithSameRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        // 为什么？此时，root2 != null 而 root1 == null，所以返回false
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return isSubTreeWithSameRoot(root1.left, root2.left)
                && isSubTreeWithSameRoot(root1.right, root2.right);
    }
}
