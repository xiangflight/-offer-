package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 */

public class Solution100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int sum = 2 * n + 3 * n * (n - 1) / 2;
            System.out.println(sum);
        }
        sc.close();
    }

}
