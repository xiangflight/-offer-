package labuladong.ch2;

import ds.tree.TreeNode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Codec {

    static final String SEP = ",";
    static final String NULL = "#";

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sb.toString();
    }

    void traverse(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL).append(SEP);
            return;
        }
        sb.append(root.val).append(SEP);
        traverse(root.left, sb);
        traverse(root.right, sb);
    }

    public TreeNode deserialize(String data) {
        return null;
    }

}
