package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/31
 */

public class Solution050 {

    public double myPow(double x, int n) {
        if (equals(x, 0.0) && n <= 0) {
            throw new IllegalArgumentException("invalid input");
        }
        if (0 == n) {
            return 1.0;
        }
        boolean sign = n < 0;
        if (n < 0) {
            n = -n;
        }
        double result = power(x, n);
        return sign ? 1.0 / result: result;
    }

    private double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = power(base, exponent >>> 1);
        result *= result;
        if ((exponent & 1) == 1) {
            result *= base;
        }
        return result;
    }

    private boolean equals(double a, double b) {
        return Math.abs(a - b) < 0.000001;
    }

}
