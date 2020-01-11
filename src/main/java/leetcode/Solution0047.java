package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0047 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        findAllPermutations(nums, 0, used, new ArrayList<>(), ans);
        return ans;
    }

    private void findAllPermutations(int[] nums, int index, boolean[] used, ArrayList<Integer> temp, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            findAllPermutations(nums, index + 1, used, temp, ans);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }


}
