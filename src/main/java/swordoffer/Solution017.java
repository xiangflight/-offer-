package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/31
 */

public class Solution017 {

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] num = new char[n];
        print1ToMaxOfNDigits(num, 0, n);
    }

    private void print1ToMaxOfNDigits(char[] num, int index, int n) {
        if (index == n) {
            print(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            num[index] = (char) (i + '0');
            print1ToMaxOfNDigits(num, index + 1, n);
        }
    }

    private void print(char[] num) {
        int index = 0;
        while (index < num.length && num[index] == '0') {
            index++;
        }
        if (index == num.length) {
            return;
        }
        while (index < num.length) {
            System.out.print(num[index]);
            index++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Solution017().print1ToMaxOfNDigits(2);
    }

}
