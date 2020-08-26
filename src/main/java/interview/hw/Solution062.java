package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 */

public class Solution062 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int count = 0;
            while (num != 0) {
                num &= (num - 1);
                count++;
            }
            System.out.println(count);
        }
        sc.close();
    }

}
