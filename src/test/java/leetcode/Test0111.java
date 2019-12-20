package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

class Test0111 {

    private final Solution0111 solution = new Solution0111();

    @Test
    @DisplayName("111 Minimum Depth of Binary Tree")
    void minDepth() {
        int expected = 2;
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(expected, solution.minDepth(root));
        assertEquals(expected, solution.minDepthBFS(root));
    }
}