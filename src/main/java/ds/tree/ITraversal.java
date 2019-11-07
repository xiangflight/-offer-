package ds.tree;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/7
 */

public interface ITraversal {

    /**
     * 遍历到每个节点的操作
     *
     * @param root 树的节点
     */
    void visit(TreeNode root);

    /**
     * 前序遍历 递归
     *
     * @param root 树的根节点
     */
    void preOrderTraversal(TreeNode root);

    /**
     * 中序遍历 递归
     *
     * @param root 树的根节点
     */
    void inOrderTraversal(TreeNode root);

    /**
     * 后序遍历 递归
     *
     * @param root 树的根节点
     */
    void postOrderTraversal(TreeNode root);

    /**
     * 前序遍历 非递归
     *
     * @param root 树的根节点
     */
    void preOrderTraversalIterative(TreeNode root);

    /**
     * 中序遍历 非递归
     *
     * @param root 树的根节点
     */
    void inOrderTraversalIterative(TreeNode root);

    /**
     * 后序遍历 非递归
     *
     * @param root 树的根节点
     */
    void postOrderTraversalIterative(TreeNode root);

    /**
     * 层序遍历
     *
     * @param root 树的根节点
     */
    void levelOrderTraversal(TreeNode root);
}
