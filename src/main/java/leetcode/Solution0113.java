package leetcode;

import ds.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

public class Solution0113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        findAllPaths(root, new ArrayList<>(), sum, res);
        return res;
    }

    private void findAllPaths(TreeNode root, ArrayList<Integer> temp, int sum, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            res.add(new ArrayList<>(temp));
        } else {
            findAllPaths(root.left, temp, sum - root.val, res);
            findAllPaths(root.right, temp, sum - root.val, res);
        }
        temp.remove(temp.size() - 1);

    }

}
