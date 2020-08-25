package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 */

public class Solution015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = countOf1(num);
        System.out.println(count);
    }

    private static int countOf1(int num) {
        int result = 0;
        while (num != 0) {
            num &= (num - 1);
            result++;
        }
        return result;
    }

}
