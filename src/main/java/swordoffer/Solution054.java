package swordoffer;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */

public class Solution054 {

    private TreeNode res;
    private int cnt = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        inOrder(pRoot, k);
        return res;
    }

    private void inOrder(TreeNode pRoot, int k) {
        if (pRoot == null || cnt >= k) {
            return;
        }
        inOrder(pRoot.left, k);
        cnt++;
        if (cnt == k) {
            res = pRoot;
        }
        inOrder(pRoot.right, k);
    }

}
