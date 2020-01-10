package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0078 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new Solution0078().subsets(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return ans;
        }
        findAllSubsets(nums, 0, new ArrayList<>(), ans);
        return ans;
     }

    private void findAllSubsets(int[] nums, int index, ArrayList<Integer> subset, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(subset));
        for (int j = index; j < nums.length; j++) {
            subset.add(nums[j]);
            findAllSubsets(nums, j + 1, subset, ans);
            subset.remove(subset.size() - 1);
        }
    }


}
