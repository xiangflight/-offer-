package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 *
 * 题目描述
 * 题目说明
 *
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 *
 * 样例输入
 * 5
 *
 * 样例输出
 *
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 *
 */

public class Solution035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                arr[i][0] = 1 + (1 + i) * i / 2;
                for (int j = 1; j < n - i; j++) {
                    arr[i][j] = arr[i][0] + (2 + i + 2 + i + j - 1) * j / 2;
                }
            }
            for (int[] row: arr) {
                for (int val: row) {
                    if (val != 0) {
                        System.out.print(val + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }

}
