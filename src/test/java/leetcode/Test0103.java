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
 * @date 2019/12/26
 */

class Test0103 {

    private final Solution0103 solution = new Solution0103();

    @Test
    @DisplayName("103 Binary Tree Zigzag Level Order Traversal")
    void zigzagLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = Arrays.asList(Collections.singletonList(3), Arrays.asList(20, 9), Arrays.asList(15, 7));
        assertEquals(expected, solution.zigzagLevelOrder(root));
    }
}