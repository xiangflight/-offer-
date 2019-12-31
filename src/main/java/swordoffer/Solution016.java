package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/31
 */

public class Solution016 {

    public double Power(double base, int exponent) {
        if (equals(base, 0.0)) {
            if (exponent < 0) {
                throw new IllegalArgumentException("invalid input");
            } else {
                return 0.0;
            }
        }
        if (exponent == 0) {
            return 1.0;
        }
        boolean sign = exponent < 0;
        if (exponent < 0) {
            exponent = -exponent;
        }
        double result = power(base, exponent);
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

    private double power2(double base, int exponent) {
        double result = 1.0;
        double current = base;
        for (int i = exponent; i > 0; i >>>= 1) {
            if ((i & 1) == 1) {
                result = result * current;
            }
            current *= current;
        }
        return result;
    }

    public static void main(String[] args) {
        double v = new Solution016().power2(2, 4);
        System.out.println(v);
    }

    private boolean equals(double a, double b) {
        return Math.abs(a - b) < 0.000001;
    }

}
