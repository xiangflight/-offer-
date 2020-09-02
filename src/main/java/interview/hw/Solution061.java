package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/2
 */

public class Solution061 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = count(m, n);
            System.out.println(count);
        }
        sc.close();
    }

    private static int count(int m, int n) {
        if (n == 1 || m == 0) {
            return 1;
        }
        if (n > m) {
            return count(m, m);
        }
        return count(m, n - 1) + count(m - n, n);
    }

}
