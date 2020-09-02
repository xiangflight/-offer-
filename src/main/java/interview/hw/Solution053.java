package interview.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 */

public class Solution053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int firstEven = getFirstEven(n);
            System.out.println(firstEven);
        }
    }

    private static int getFirstEven(int n) {
        int[][] dp = new int[n + 1][2 * n];
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][1] = 1;
            for (int j = 2; j <= 2 * i - 1; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j - 2] + dp[i - 1][j];
            }
        }
        for (int[] arr: dp) {
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 1; i <= n; i++) {
            if (dp[n][i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

}
