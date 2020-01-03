package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。
 * ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * <p>
 * intuitive: 每10个数, 有一个个位是1, 每100个数, 有10个十位是1, 每1000个数, 有100个百位是1.  做一个循环, 每次计算单个位上1得总个数(个位,十位, 百位). 
 * <p>
 * 例子:
 * <p>
 * 以算百位上1为例子:   假设百位上是0, 1, 和 >=2 三种情况:
 * <p>
 *     case 1: n=3141092, a= 31410, b=92. 计算百位上1的个数应该为 3141 *100 次.
 *     case 2: n=3141192, a= 31411, b=92. 计算百位上1的个数应该为 3141 *100 + (92+1) 次.
 *     case 3: n=3141592, a= 31415, b=92. 计算百位上1的个数应该为 (3141+1) *100 次.
 * <p>
 * 原文链接：https://blog.csdn.net/xudli/article/details/46798619
 */

public class Solution043 {

    public static void main(String[] args) {
        int n = 1;
        int ans = new Solution043().NumberOf1Between1AndN_Solution(n);
        System.out.println(ans);
    }

    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (int m = 1; m <= n; m *= 10) {
            int a = n / m, b = n % m;
            ones += (a + 8) / 10 * m + (a % 10 == 1 ? b + 1 : 0);
        }
        return ones;
    }

}
