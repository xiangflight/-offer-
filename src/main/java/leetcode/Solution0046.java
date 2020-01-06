package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/13
 */

public class Solution0046 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        if (nums.length == 0) {
            return res;
        }
        generatePermutation(nums, 0, new ArrayList<>(), res, used);
        return res;
    }

    public void generatePermutation(int[] nums, int pos, List<Integer> tempList, List<List<Integer>> res, boolean[] used) {
        if (pos == nums.length) {
            res.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                tempList.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, pos + 1, tempList, res, used);
                tempList.remove(tempList.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> permute = new Solution0046().permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }
}
