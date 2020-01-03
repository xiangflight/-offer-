package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 丑数
 * <p>
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * <p>
 * dp[1] = 2, i2 = 1, i3 = 0, i5 = 0
 * dp[2] = 3, i2 = 1, i3 = 1, i5 = 0
 * dp[3] = 4, i2 = 2, i3 = 1, i5 = 0
 * dp[4] = 5, i2 = 2, i3 = 1, i5 = 1
 * dp[5] = 6, i2 = 3, i3 = 2, i5 = 1
 * dp[6] = 8, i2 = 4, i3 = 2, i5 = 1
 * dp[7] = 9, i2 = 4, i3 = 3, i5 = 1
 * dp[8] = 10, i2 = 5, i3 = 3, i5 = 2
 * dp[9] = 12, i2 = 6, i3 = 4, i5 = 2
 * dp[10] = 15, i2 = 6, i3 = 5, i5 = 3
 */

public class Solution049 {

    public static void main(String[] args) {
        int ans = new Solution049().GetUglyNumber_Solution(11);
        System.out.println(ans);
    }

    public int GetUglyNumber_Solution(int index) {
        if (index <= 6) {
            return index;
        }
        int[] dp = new int[index];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int j = 1; j < index; j++) {
            int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
            dp[j] = min3(next2, next3, next5);
            if (dp[j] == next2) {
                i2++;
            }
            if (dp[j] == next3) {
                i3++;
            }
            if (dp[j] == next5) {
                i5++;
            }
        }
        return dp[index - 1];
    }

    public int min3(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

//    if (N <= 6)
//            return N;
//    int i2 = 0, i3 = 0, i5 = 0;
//    int[] dp = new int[N];
//    dp[0] = 1;
//    for (int i = 1; i < N; i++) {
//        int next2 = dp[i2] * 2, next3 = dp[i3] * 3, next5 = dp[i5] * 5;
//        dp[i] = Math.min(next2, Math.min(next3, next5));
//        if (dp[i] == next2)
//            i2++;
//        if (dp[i] == next3)
//            i3++;
//        if (dp[i] == next5)
//            i5++;
//    }
//    return dp[N - 1];
}
