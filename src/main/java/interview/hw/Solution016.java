package interview.hw;

import java.util.Scanner;

public class Solution016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int n = sc.nextInt();
        if (n <= 0 || money <= 0) {
            System.out.println(0);
        }
        Good[] goods = new Good[n + 1];
        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            goods[i] = new Good(v, p, q);

            if (q > 0) {
                if (goods[q].a1 == 0) {
                    goods[q].setA1(i);
                } else {
                    goods[q].setA2(i);
                }
            }
        }

        int[][] dp = new int[n + 1][money + 1];
        for (int i = 1; i <= n; i++) {
            int v = goods[i].v, vp = goods[i].p * v;
            int v1 = 0, vp1 = 0;
            if (goods[i].a1 != 0) {
                v1 = v + goods[goods[i].a1].v;
                vp1 = vp + goods[goods[i].a1].v * goods[goods[i].a1].p;
            }
            int v2 = 0, vp2 = 0;
            if (goods[i].a2 != 0) {
                v2 = v + goods[goods[i].a2].v;
                vp2 = vp + goods[goods[i].a2].v * goods[goods[i].a2].p;
            }
            int v12 = 0, vp12 = 0;
            if (goods[i].a1 != 0 && goods[i].a2 != 0) {
                v12 = v + goods[goods[i].a1].v + goods[goods[i].a2].v;
                vp12 = vp + goods[goods[i].a1].v * goods[goods[i].a1].p + goods[goods[i].a2].v * goods[goods[i].a2].p;
            }

            for (int j = 1; j <= money; j++) {
                dp[i][j] = dp[i - 1][j];
                if (goods[i].q == 0) {
                    if (j >= v && v != 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v] + vp);
                    }
                    if (j >= v1 && v1 != 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v1] + vp1);
                    }
                    if (j >= v2 && v2 != 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v2] + vp2);
                    }
                    if (j >= v12 && v12 != 0) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - v12] + vp12);
                    }
                }
            }

        }
        System.out.println(dp[n][money]);
    }

}

class Good {
    int v;
    int p;
    int q;

    int a1 = 0;
    int a2 = 0;

    public Good(int v, int p, int q) {
        this.v = v;
        this.p = p;
        this.q = q;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

}