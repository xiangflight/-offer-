package swordoffer;

import ds.tree.TreeNode;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class LowestCommonAncestor {

    public static void main(String[] args) {
        CommonTreeNode root = new CommonTreeNode(2, 1);
        root.children[0] = new CommonTreeNode(0, 2);
        root.children[1] = new CommonTreeNode(0, 3);
        ArrayList<CommonTreeNode> path1 = new ArrayList<>();
        getNodePath(root, root.children[0], new ArrayList<>(), path1);
        System.out.println(path1);
    }

    public static void getNodePath(CommonTreeNode root, CommonTreeNode p, ArrayList<CommonTreeNode> tempList, ArrayList<CommonTreeNode> path) {
        if (root == p) {
            tempList.add(p);
            path.addAll(new ArrayList<>(tempList));
            return;
        }
        tempList.add(root);
        for (CommonTreeNode node: root.children) {
            getNodePath(node, p, tempList, path);
        }
        tempList.remove(tempList.size() - 1);
    }

    public static class CommonTreeNode {
        int val;
        CommonTreeNode[] children;

        public CommonTreeNode(int n, int val) {
            children = new CommonTreeNode[n];
            this.val = val;
        }

        @Override
        public String toString() {
            return "CommonTreeNode{" +
                    "val=" + val +
                    '}';
        }
    }


}
