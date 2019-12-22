package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 */

class Test0144 {

    private final Solution0144 solution = new Solution0144();

    @Test
    @DisplayName("144 Binary Tree Preorder Traversal")
    void preorderTraversal() {
        TreeNode root = new TreeNode(1);
        TreeNode rightChild = new TreeNode(2);
        root.right = rightChild;
        rightChild.left = new TreeNode(3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, solution.preorderTraversal(root));
        assertEquals(expected, solution.preorderTraversalUsingStack(root));
        assertEquals(expected, solution.preorderTraversalUsingExplicitStack(root));
    }
}