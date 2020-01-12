package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/12
 */

class Test0129 {

    private final Solution0129 solution = new Solution0129();

    @Test
    @DisplayName("129 Sum Root to Leaf Numbers")
    void sumNumbers() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int expected = 25;
        assertEquals(expected, solution.sumNumbers(root));
    }
}