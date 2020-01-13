package cc189;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/8
 */

public class Solution0804 {

    public static void main(String[] args) {
        Solution0804 solution = new Solution0804();

        ArrayList<Integer> set = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> subsets = solution.getSubsets(set, 0);
        System.out.println(subsets);
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = solution.subsets(nums);
        System.out.println(ans);
        ArrayList<ArrayList<Integer>> allSubsets = solution.getSubsets(set);
        System.out.println(allSubsets);

    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        return subsets(nums, 0);
    }

    private List<List<Integer>> subsets(int[] nums, int index) {
        List<List<Integer>> allSubsets;
        if (index == nums.length) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        }
        allSubsets = subsets(nums, index + 1);
        int item = nums[index];
        List<List<Integer>> moreSubsets = new ArrayList<>();
        allSubsets.forEach(subset -> {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(item);
            moreSubsets.add(newSubset);
        });
        allSubsets.addAll(moreSubsets);
        return allSubsets;
    }

    List<List<Integer>> getSubsets(List<Integer> set, int index) {
        List<List<Integer>> allSubsets;
        if (set.size() == index) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        }
        allSubsets = getSubsets(set, index + 1);
        int item = set.get(index);
        List<List<Integer>> moreSubsets = new ArrayList<>();
        for (List<Integer> subset: allSubsets) {
            ArrayList<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(item);
            moreSubsets.add(newSubset);
        }
        allSubsets.addAll(moreSubsets);
        return allSubsets;
    }

    ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<>();
        int max = 1 << set.size();
        for (int k = 0; k < max; k++) {
            ArrayList<Integer> subset = convertIntToSet(k, set);
            allSubsets.add(subset);
        }
        return allSubsets;
    }

    private ArrayList<Integer> convertIntToSet(int x, ArrayList<Integer> set) {
        ArrayList<Integer> subset = new ArrayList<>();
        int index = 0;
        for (int k = x; k > 0; k >>= 1) {
            if ((k & 1) == 1) {
                subset.add(set.get(index));
            }
            index++;
        }
        return subset;
    }

}
