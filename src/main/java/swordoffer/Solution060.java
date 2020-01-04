package swordoffer;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 * <p>
 * 把 n 个骰子扔在地上，求点数和为 s 的概率。
 */

public class Solution060 {

    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        final int face = 6;
        final int pointNum = face * n;
        // dp[i][j] 表示 前 i 个骰子产生点数 j 的次数
        long[][] dp = new long[n + 1][pointNum + 1];

        for (int i = 1; i <= face; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= pointNum; j++) {
                for (int k = 1; k <= face && k <= j; k++) {
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        final double totalNumber = Math.pow(6, n);
        List<Map.Entry<Integer, Double>> res = new ArrayList<>();
        for (int i = n; i <= pointNum; i++) {
            res.add(new AbstractMap.SimpleEntry<>(i, dp[n][i] / totalNumber));
        }
        return res;
    }

}
