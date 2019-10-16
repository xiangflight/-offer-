package com.xiangflight.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/16 8:15 上午
 */

public class Solution90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> tmp = new ArrayList<>();
        getAns(nums, 0, tmp, res);
        return res;
    }

    private void getAns(int[] nums, int start, List<Integer> tmp, List<List<Integer>> res) {
        res.add(new ArrayList<>(tmp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            tmp.add(nums[i]);
            getAns(nums, i + 1, tmp, res);
            tmp.remove(tmp.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> res = new Solution90().subsetsWithDup(nums);
        System.out.println(res);
    }



}
