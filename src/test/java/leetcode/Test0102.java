package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 */

class Test0102 {

    private final Solution0102 solution = new Solution0102();

    @Test
    @DisplayName("102 Binary Tree Level Order Traversal")
    void levelOrder() {
        List<List<Integer>> expected = Arrays.asList(Collections.singletonList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertEquals(expected, solution.levelOrder(root));
        assertEquals(expected, solution.levelOrderBackTrack(root));
    }
}