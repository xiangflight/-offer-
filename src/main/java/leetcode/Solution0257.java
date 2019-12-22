package leetcode;

import ds.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }
        List<String> leftPaths = binaryTreePaths(root.left);
        for (String leftPath : leftPaths) {
            res.add(root.val + "->" + leftPath);
        }
        List<String> rightPaths = binaryTreePaths(root.right);
        for (String rightPath : rightPaths) {
            res.add(root.val + "->" + rightPath);
        }
        return res;
    }

}
