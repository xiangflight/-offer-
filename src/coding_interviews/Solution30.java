package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-12 11:05
 *
 * 二叉搜索树与双向链表
 *
 */

public class Solution30 {

    private TreeNode pre;
    private TreeNode head;

    /**
     * 题目：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     *      要求不能创建任何新的结点，只能调整树中结点指针的指向
     *
     * @param root 二叉搜索树的根结点
     * @return 转换后的
     */
    public TreeNode convert(TreeNode root) {
        inOrder(root);
        return head;
    }

    /**
     * 中序遍历
     *
     * @param root 传入树的根结点
     */
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        root.left = pre;
        if (pre != null) {
            pre.right = root;
        }
        // 处理当前root
        pre = root;
        // 二叉搜索树中最小的值
        if (head == null) {
            head = root;
        }
        inOrder(root.right);
    }

}
