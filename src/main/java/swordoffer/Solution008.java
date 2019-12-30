package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 *
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */

public class Solution008 {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        // 1
        if (pNode.right != null) {
            TreeLinkNode child = pNode.right;
            while (child.left != null) {
                child = child.left;
            }
            return child;
        }
        // 2
        if (pNode.next != null) {
            TreeLinkNode cur = pNode;
            TreeLinkNode parent = pNode.next;
            while (parent != null && cur == parent.right) {
                cur = parent;
                parent = parent.next;
            }
            return parent;
        }
        return null;
    }

    static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

}


