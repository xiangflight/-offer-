package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 */

public class Solution091 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n + 1][m + 1];
        for (int i = 0; i < m + 1; i++) {
            grid[0][i] = 1;
        }
        for (int j = 0; j < n + 1; j++) {
            grid[j][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
            }
        }
        System.out.println(grid[n][m]);
    }

}
