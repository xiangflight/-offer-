package leetcode;

import leetcode.ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/22
 */

public class Solution236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pList = new ArrayList<>();
        List<TreeNode> qList = new ArrayList<>();
        List<TreeNode> tmp = new ArrayList<>();
        findNode(p, root, tmp, pList);
        findNode(q, root, tmp, qList);
        int i = 0;
        while (i < pList.size() && i < qList.size() && pList.get(i) == qList.get(i)) {
            i++;
        }
        if (i >= pList.size()) {
            return pList.get(i - 1);
        }
        if (i >= qList.size()) {
            return qList.get(i - 1);
        }
        return pList.get(i - 1);
    }

    private void findNode(TreeNode p, TreeNode root, List<TreeNode> tmp, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        tmp.add(root);
        if (root.val == p.val) {
            list.addAll(tmp);
            return;
        }
        findNode(p, root.left, tmp, list);
        findNode(p, root.right, tmp, list);
        tmp.remove(tmp.size() - 1);
    }

    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestorRecursive(root.left, p, q);
        TreeNode right = lowestCommonAncestorRecursive(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left: right;
    }
}
