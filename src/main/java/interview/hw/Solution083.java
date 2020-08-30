package interview.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/30
 */

public class Solution083 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = reader.readLine()) != null) {
            String[] params = input.split(" ");
            int m = Integer.parseInt(params[0]);
            int n = Integer.parseInt(params[1]);
            if ((m >= 0 && m <= 9) && (n >= 0 && n <= 9)) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            m = Math.min(m, 9);
            n = Math.min(n, 9);
            String[] ex = reader.readLine().split(" ");
            int ex1x = Integer.parseInt(ex[0]);
            int ex1y = Integer.parseInt(ex[1]);
            int ex2x = Integer.parseInt(ex[2]);
            int ex2y = Integer.parseInt(ex[3]);
            if (ex1x >= 0 && ex1x < m && ex1y >= 0 && ex1y < n
                    && ex2x >= 0 && ex2x < m && ex2y >= 0 && ex2y < n) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            int insertRow = Integer.parseInt(reader.readLine());
            if (insertRow >= 0 && insertRow < m && (m + 1) <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            int insertCol = Integer.parseInt(reader.readLine());
            if (insertCol >= 0 && insertCol < n && (n + 1) <= 9) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            String[] ob = reader.readLine().split(" ");
            int obx = Integer.parseInt(ob[0]);
            int oby = Integer.parseInt(ob[1]);
            if (obx >= 0 && obx < m && oby >= 0 && oby < n) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }

}
