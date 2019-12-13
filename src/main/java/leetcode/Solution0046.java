package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/13
 */

public class Solution0046 {

    public static void main(String[] args) {
        List<List<Integer>> res = new Solution0046().permute(new int[]{1, 2, 3});
        System.out.println(res);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] nums, int pos) {
        if (pos == nums.length) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int num : nums) {
                if (tempList.contains(num)) {
                    continue;
                }
                tempList.add(num);
                backtrack(res, tempList, nums, pos + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
