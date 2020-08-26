package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 *
 * 题目描述
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 输入：9
 *
 * 输出：34
 *
 * 1 1 2 3 5 8 13 21 34
 */

public class Solution037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int months = sc.nextInt();
            int result = fibonacci(months);
            System.out.println(result);
        }
        sc.close();
    }

    private static int fibonacci(int months) {
        if (months == 1 || months == 2) {
            return 1;
        }
        int prePre = 1;
        int pre = 1;
        int result = 0;
        for (int i = 2; i < months; i++) {
            result = prePre + pre;
            prePre = pre;
            pre = result;
        }
        return result;
    }

}
