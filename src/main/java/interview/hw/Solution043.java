package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 */

public class Solution043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String[] strs = str.split(" ");
            int m = Integer.parseInt(strs[0]);
            int n = Integer.parseInt(strs[1]);
            int[][] grid = new int[m][n];
            for (int i = 0; i < m; i++) {
                String row = br.readLine();
                String[] cols = row.split(" ");
                for (int j = 0; j < n; j++) {
                    grid[i][j] = Integer.parseInt(cols[j]);
                }
            }
            // process
            int i = 0, j = 0;
            for (int k = 0; k < m + n - 1; k++) {
                if (grid[i][j] == 0) {
                    System.out.println("(" + i + "," + j + ")");
                }
                if (j == n - 1 || grid[i][j + 1] == 1) {
                    i++;
                    continue;
                }
                if (i == m - 1 || grid[i + 1][j] == 1) {
                    j++;
                    continue;
                }
                if ((i == m - 1) && (j == n - 1)) {
                    break;
                }
            }
        }
    }

}
