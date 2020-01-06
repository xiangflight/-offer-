package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 *
 * 存在溢出的风险
 */

public class Solution081 {

    /**
     * f(n) 代表登上 n 级台阶有多少种走法
     *
     * @param n n 级台阶
     * @return 走法
     */
    public int f(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return f(n - 1) + f(n - 2) + f(n - 3);
    }

    public int f1(int n) {
        return f1(n, new int[n + 1]);
    }

    private int f1(int i,  int[] memo) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 4;
        }
        if (memo[i] == 0) {
            memo[i] = f1(i - 1, memo) + f1(i - 2, memo) + f1(i - 3, memo);
        }
        return memo[i];
    }

    public int f2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        for (int i = 4; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
        }
        return memo[n];
    }

    public int f3(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        int a = 1;
        int b = 2;
        int c = 4;
        int ans = 0;
        for (int i = 4; i <= n; i++) {
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = new Solution081().f3(4);
        System.out.println(ans);
    }

}
