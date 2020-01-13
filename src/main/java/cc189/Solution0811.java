package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

public class Solution0811 {

    public static void main(String[] args) {
        int i = new Solution0811().makeChange(25);
        System.out.println(i);
    }

    int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        int[][] memo = new int[n+1][denoms.length];
        return makeChange(n, denoms, 0, memo);
    }

    private int makeChange(int amount, int[] denoms, int index, int[][] memo) {
        if (memo[amount][index] > 0) {
            return memo[amount][index];
        }
        if (index >= denoms.length - 1) {
            return 1;
        }
        int denomAmount = denoms[index];
        int ways = 0;
        for (int i = 0; i * denomAmount <= amount; i++) {
            int amountRemaining = amount - i * denomAmount;
            ways += makeChange(amountRemaining, denoms, index + 1, memo);
        }
        memo[amount][index] = ways;
        return ways;
    }

}
