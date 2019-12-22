package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

class Test0226 {

    private final Solution0226 solution = new Solution0226();

    @Test
    @DisplayName("226 Invert Binary Tree")
    void invertTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        // -----------------------------
        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);
        expected.left.left = new TreeNode(9);
        expected.left.right = new TreeNode(6);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        assertEquals(expected, solution.invertTree(root));
    }
}