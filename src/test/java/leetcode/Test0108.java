package leetcode;

import ds.tree.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/13
 */

class Test0108 {

    private final Solution0108 solution = new Solution0108();

    @Test
    @DisplayName("108 Convert Sorted Array to Binary Search Tree")
    void sortedArrayToBST() {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode expected = new TreeNode(0);
        expected.left = new TreeNode(-3);
        expected.right = new TreeNode(9);
        expected.left.left = new TreeNode(-10);
        expected.right.left = new TreeNode(5);
        assertEquals(expected, solution.sortedArrayToBST(nums));
    }
}