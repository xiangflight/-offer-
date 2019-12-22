package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

class Test0257 {

    private final Solution0257 solution = new Solution0257();

    @Test
    @DisplayName("257 Binary Tree Paths")
    void binaryTreePaths() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        List<String> expected = Arrays.asList("1->2->5", "1->3");
        assertEquals(expected, solution.binaryTreePaths(root));
    }
}