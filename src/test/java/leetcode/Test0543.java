package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/10
 */

class Test0543 {

    private final Solution0543 solution = new Solution0543();

    @Test
    @DisplayName("543 Diameter of Tree")
    void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.left = new TreeNode(-4);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(-7);
        assertEquals(solution.diameterOfBinaryTree(root), 4);
    }
}