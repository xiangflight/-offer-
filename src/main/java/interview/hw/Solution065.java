package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/11
 */

public class Solution065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        while ((str1 = br.readLine()) != null) {
            String str2 = br.readLine();
            solution(str1, str2);
        }
    }

    static void solution(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        findMaxCommonString(str1, str2);
    }

    static void findMaxCommonString(String str1, String str2) {
        int m = str1.length(), n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;
        int start = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        start = i - maxLen;
                    }
                }
            }
        }
        String result = str1.substring(start, start + maxLen);
        System.out.println(result);
    }

}
