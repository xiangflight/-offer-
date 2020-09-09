package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class Solution055 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            solution(n);
        }
        sc.close();
    }

    static void solution(int n) {
        int res = 0;

        for (int i = 7; i <= n; i++) {
            if ((i % 7 == 0) || contains7(i)) {
                res++;
            }
        }

        System.out.println(res);
    }

    static boolean contains7(int n) {
        while (n != 0) {
            if (n % 10 == 7) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

}
