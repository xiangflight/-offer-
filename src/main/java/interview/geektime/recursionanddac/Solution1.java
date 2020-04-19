package interview.geektime.recursionanddac;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 */

public class Solution1 {

    public double myPow(double x, int n) {
        if (n == 0 && x < 0.0000001) {
            throw new IllegalArgumentException("x and n should not be 0 both");
        }
        if (n == 0) {
            return 1.0;
        }
        double result = power(x, n > 0 ? n : -n);
        return n < 0 ? 1.0 / result : result;
    }

    private double power(double x, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return x;
        }
        double result = power(x, i / 2);
        result *= result;
        if ((i % 2) != 0) {
            result *= x;
        }
        return result;
    }

    public double myPowerII(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double power = 1.0;
        while (N > 0) {
            if ((N & 1) != 0) {
                power *= x;
            }
            x *= x;
            N >>= 1;
        }
        return power;
    }

    public static void main(String[] args) {
        double v = new Solution1().myPowerII(2, -4);
        System.out.println(v);
    }

}
