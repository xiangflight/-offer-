package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 *
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */

public class Solution043 {

    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (int m = 1; m <= n; m *= 10) {
          int a = n / m, b = n % m;
          ones += (a + 8) / 10 * m + (a % 10 == 1? b + 1: 0);
        }
        return ones;
    }

    public static void main(String[] args) {
        int n = 1;
        int ans = new Solution043().NumberOf1Between1AndN_Solution(n);
        System.out.println(ans);
    }

}
