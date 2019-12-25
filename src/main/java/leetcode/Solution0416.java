package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/24
 */

public class Solution0416 {

    // memo[i][c] 表示使用索引为[0..i]的这些元素，能否完全填充一个容量为C的背包
    // -1: 未计算 0: 不可以填充 1: 可以填充
    private int[][] memo;

    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        memo = new int[nums.length][sum / 2 + 1];
        return tryPartition(nums, nums.length - 1, sum / 2);
    }

    /**
     * 在 nums[0...index]中尝试寻找能否填充 sum
     *
     * @param nums  数组 nums
     * @param index index
     * @param sum   sum
     */
    private boolean tryPartition(int[] nums, int index, int sum) {
        if (sum == 0) {
            return true;
        }
        if (sum < 0 || index < 0) {
            return false;
        }
        if (memo[index][sum] != -1) {
            return memo[index][sum] == 1;
        }
        memo[index][sum] = (tryPartition(nums, index - 1, sum) || tryPartition(nums, index - 1, sum - nums[index])) ? 1: 0;
        return memo[index][sum] == 1;
    }

    public boolean canPartitionDp(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int n = nums.length;
        int c = sum / 2;
        boolean[] memo = new boolean[c + 1];
        for (int i = 0; i <= c; i++) {
            memo[i] = (nums[0] == i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = c; j >= nums[i]; j--) {
                memo[j] = memo[j] || memo[j - nums[i]];
            }
            if (memo[c]) {
                return true;
            }
        }
        return memo[c];
    }

}
