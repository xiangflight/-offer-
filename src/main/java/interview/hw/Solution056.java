package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/1
 */

public class Solution056 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 2; i <= n; i++) {
                if (isPerfectNum(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    private static boolean isPerfectNum(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum + 1 == n;
    }

}
