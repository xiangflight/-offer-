package swordoffer;

import ds.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution034 {

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return res;
        }
        findPath(root, target, new ArrayList<>());
        return res;
    }

    private void findPath(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(path));
        } else {
            findPath(root.left, target, path);
            findPath(root.right, target, path);
        }
        path.remove(path.size() - 1);
    }

    /**
     * path sum I
     *
     * @param root root
     * @param sum sum
     * @return true if has a path sums up to sum
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    /**
     * path sum II
     *
     * @param root root
     * @param sum sum
     * @return true if has path sums up to sum
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        findPathSum(root, sum, new ArrayList<>(), res);
        return res;
    }

    private void findPathSum(TreeNode node, int sum, ArrayList<Integer> path, List<List<Integer>> res) {
        if (node == null) {
            return;
        }
        path.add(node.val);
        if (node.left == null && node.right == null && sum == node.val) {
            res.add(new ArrayList<>(path));
        } else {
            findPathSum(node.left, sum - node.val, path, res);
            findPathSum(node.right, sum - node.val, path, res);
        }
        path.remove(path.size() - 1);
    }

    /**
     * path sum III
     *
     * @param root root
     * @param sum sum
     * @return true if has path sums up to sum
     */
    public int pathSumIII(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int left = pathSumIII(root.left, sum);
        int right = pathSumIII(root.right, sum);
        return findPathIII(root, sum) + left + right;
    }

    private int findPathIII(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = (sum == root.val) ? 1: 0;
        int left = findPathIII(root.left, sum - root.val);
        int right = findPathIII(root.right, sum - root.val);
        return count + left + right;
    }


}
