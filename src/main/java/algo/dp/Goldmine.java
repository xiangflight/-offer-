package algo.dp;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class Goldmine {

    public static void main(String[] args) {
        int c = 10;
        int[] p = {3, 4, 3, 5, 5};
        int[] g = {200, 300, 350, 400, 500};
        System.out.println(getBestGoldMining(c, p, g));
    }

    /**
     * 获得金矿最优收益
     *
     * @param w 工人数量
     * @param n 可选金矿数量
     * @param p 金矿开采需要的工人数量
     * @param g 金矿储量
     * @return 最优收益
     */
    public static int getBestGoldMining(int w, int n, int[] p, int[] g) {
        // 金矿数为 0 或工人数为 0 的情况
        if (w == 0 || n == 0) {
            return 0;
        }
        // 工人数量不够挖掘当前金矿
        if (w < p[n - 1]) {
            return getBestGoldMining(w, n - 1, p, g);
        }
        return Math.max(getBestGoldMining(w, n - 1, p, g), g[n - 1] + getBestGoldMining(w - p[n - 1], n - 1, p, g));
    }

    public static int getBestGoldMining(int w, int[] p, int[] g) {
        int[][] memo = new int[g.length + 1][w + 1];
        for (int i = 1; i <= g.length; i++) {
            for (int j = 1; j <= w; j++) {
                if (j < p[i - 1]) {
                    memo[i][j] = memo[i - 1][j];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], g[i - 1] + memo[i - 1][j - p[i - 1]]);
                }
            }
        }
        return memo[g.length][w];
    }

}
