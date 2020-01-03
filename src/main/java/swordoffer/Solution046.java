package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 给定一个数字，按照如下规则翻译成字符串：1 翻译成“a”，2 翻译成“b”... 26 翻译成“z”。
 * 一个数字有多种翻译可能，例如 12258 一共有 5 种，分别是 abbeh，lbeh，aveh，abyh，lyh。
 * 实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 * <p>
 * https://www.youtube.com/watch?v=YcJTyrG3bZs
 * //todo unique path 系列
 */

public class Solution046 {

    public static void main(String[] args) {
        String input = "12258";
        int i = new Solution046().numDecodings(input);
        System.out.println(i);
    }

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int one = Integer.parseInt(s.substring(i - 1, i));
            int two = Integer.parseInt(s.substring(i - 2, i));
            System.out.println("one = " + one + " two = " + two);
            if (one >= 1 && one <= 9) {
                dp[i] += dp[i - 1];
            }
            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
            System.out.println("dp[" + i + "] = " + dp[i]);
        }
        return dp[n];
    }
}
