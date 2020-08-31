package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/31
 *
 * 题目描述
 * 根据输入的日期，计算是这一年的第几天。。
 *
 * 详细描述：
 *
 * 输入某年某月某日，判断这一天是这一年的第几天？。
 *
 * 测试用例有多组，注意循环输入
 *
 * 输入描述：
 *
 * 输入多行，每行空格分割，分别是年，月，日
 *
 * 输出描述：
 *
 * 成功:返回outDay输出计算后的第几天; 失败:返回-1
 *
 * 输入：
 *
 * 2012 12 31
 *
 * 输出：
 *
 * 366
 *
 *
 */

public class Solution073 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String date = sc.nextLine();
            int result = numOfDays(date);
            System.out.println(result);
        }
        sc.close();
    }

    private static int numOfDays(String date) {
        String[] s = date.split(" ");
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        int[] monthOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            monthOfDays[1] = 29;
        }
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += monthOfDays[i];
        }
        return days + day;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
