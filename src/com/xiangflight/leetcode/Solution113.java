package com.xiangflight.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 9:09 上午
 *
 * 回溯 backtracking
 *
 */

public class Solution113 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        dfs(root, sum, tmp, res);
        return res;
    }

    private void dfs(TreeNode root, int sum, List<Integer> tmp, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        tmp.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList<>(tmp));
        }
        dfs(root.left, sum - root.val, tmp, res);
        dfs(root.right, sum - root.val, tmp, res);
        tmp.remove(tmp.size() - 1);
    }

}
