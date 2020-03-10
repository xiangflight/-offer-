package leetcode;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/10
 *
 * 二叉树的直径
 *
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 *
 * 直径 = 左子树的最大深度 + 右子树的最大深度
 *
 * [4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
 *
 *   9 -7
 *  /  / \
 * 6  -6 -6
 * /\ /   \
 *0 6 5   9
 * / \    \
 *-1 -4   -2
 */

public class Solution0543 {

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currentDiameter = depth(root.left) + depth(root.right);
        return max(currentDiameter, diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    public int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

}
