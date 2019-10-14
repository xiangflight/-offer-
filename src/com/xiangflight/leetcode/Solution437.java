package com.xiangflight.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 8:18 上午
 *
 * 任意一个节点开始，可以使用前序遍历的思想。
 */

public class Solution437 {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int left = pathSum(root.left, sum);
        int right = pathSum(root.right, sum);
        return dfs(root, sum) + left + right;
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int count = (root.val == sum) ? 1 : 0;
        int left = dfs(root.left, sum - root.val);
        int right = dfs(root.right, sum - root.val);
        return count + left + right;
    }

    int res = 0;

    public int pathSum2(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        res = 0;
        List<Integer> tmp = new ArrayList<>();
        pathSum(root, sum, tmp);
        return res;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> tmp) {
        if (root == null) {
            return;
        }
        tmp.add(root.val);
        int cur = 0;
        // 反向求和
        for (int i = tmp.size() - 1; i >= 0; i--) {
            cur += tmp.get(i);
            if (sum == cur) {
                res++;
            }
        }
        pathSum(root.left, sum, tmp);
        pathSum(root.right, sum, tmp);
        tmp.remove(tmp.size() - 1);
    }

}
