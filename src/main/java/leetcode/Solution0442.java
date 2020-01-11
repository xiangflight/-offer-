package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/11
 */

public class Solution0442 {

    /**
     * 时间复杂度太大，O(n^2)
     *
     * @param nums 数组
     * @return 重复的数字
     */
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    res.add(nums[i]);
                }
            }
        }
        return res;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param nums 数组
     * @return 重复数字列表
     */
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                res.add(num);
            }
            set.add(num);
        }
        return res;
    }

    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(1)
     *
     * @param nums 数组
     * @return 重复数字列表
     */
    public List<Integer> findDuplicates3(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length <= 1) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                res.add(nums[i]);
            }
        }
        return res;
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * @param nums 数组
     * @return 重复数字列表
     */
    public List<Integer> findDuplicates4(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                res.add(index);
            }
            nums[index - 1] = - nums[index - 1];
        }
        return res;
    }

}
