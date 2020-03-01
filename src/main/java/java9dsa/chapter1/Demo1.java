package java9dsa.chapter1;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/20
 */

public class Demo1 {

    public static long computeRemainderCorrect(long base, long power, long divisor) {
        long baseRaisedToPower = 1;
        for (long i = 1; i <= power; i++) {
            baseRaisedToPower *= base;
            baseRaisedToPower %= divisor;
        }
        return baseRaisedToPower;
    }

    public static long computeRemainderUsingEBS(long base, long power, long divisor) {
        long baseRaisedToPower = 1;
        long powerBitsReversed = 0;
        int numBits = 0;
        while (power > 0) {
            powerBitsReversed <<= 1;
            powerBitsReversed += power & 1;
            power >>>= 1;
            numBits++;
        }
        while (numBits-- > 0) {
            if ((powerBitsReversed & 1) != 0) {
                baseRaisedToPower *= baseRaisedToPower * base;
            } else {
                baseRaisedToPower *= baseRaisedToPower;
            }
            baseRaisedToPower %= divisor;
            powerBitsReversed >>>= 1;
        }
        return baseRaisedToPower;
    }


    private static long power(long base, long power) {
        if (base == 1 || power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }
        long half = power(base, power >>> 1);
        return (power & 0x1) == 0 ? half * half : half * half * base;
    }

    public static void main(String[] args) {
        System.out.println(computeRemainderUsingEBS(2, 2, 7));

    }

}
