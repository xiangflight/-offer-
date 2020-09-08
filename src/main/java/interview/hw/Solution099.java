package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class Solution099 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = count(n);
            System.out.println(res);
        }
        sc.close();
    }

    static int count(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (meet(i)) {
                res++;
            }
        }
        return res;
    }

    static boolean meet(int n) {
        String v = String.valueOf(n);
        String v2 = String.valueOf(n * n);
        return v2.substring(v2.length() - v.length()).equals(v);
    }

}
