package swordoffer;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution036 {

    private TreeNode pre = null;
    private TreeNode head = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }

    private void inOrder(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        inOrder(pRootOfTree.left);
        pRootOfTree.left = pre;
        if (pre != null) {
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree;
        if (head == null) {
            head = pRootOfTree;
        }
        inOrder(pRootOfTree.right);
    }
}
