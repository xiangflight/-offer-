package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 * <p>
 * 递归 -> 记忆化搜索 -> 动态规划
 * <p>
 * see also {@link leetcode.Solution0343#integerBreak(int)}
 */

public class Solution014 {

    public static void main(String[] args) {
        int target = 3;
        System.out.println(new Solution014().cutRope(target));
    }

    public int cutRope(int target) {
        int[] memo = new int[target + 1];
        if (target == 1) {
            return 1;
        }
        memo[1] = 1;
        for (int j = 2; j <= target; j++) {
            for (int i = 1; i < j; i++) {
                memo[j] = Math.max(memo[j], Math.max(i * (j - i), i * memo[j - i]));
            }
        }
        return memo[target];
    }

}
