package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 数字以 0123456789101112131415... 的格式序列化到一个字符串中，求这个字符串的第 index 位。
 */

public class Solution044 {

    public int getDigitAtIndex(int index) {
        if (index < 0) {
            return -1;
        }
        int digit = 1;
        while (true) {
            // 9
            int amount = getAmountOfPlace(digit);
            // 9 * 1 = 9
            int totalAmount = amount * digit;
            // index < 9
            if (index < totalAmount) {
                return getDigitAtIndex(index, digit);
            }
            index -= totalAmount;
            digit++;
        }
    }

    private int getDigitAtIndex(int index, int digit) {
        // 5  9
        int beginNum = getBeginNumberOfPlace(digit);
        int shiftNum = index / digit;
        String number = (beginNum + shiftNum) + "";
        int count = index % digit;
        return number.charAt(count) - '0';
    }

    /**
     * digit 位数的数量
     */
    private int getAmountOfPlace(int digit) {
        if (digit == -1) {
            return 10;
        }
        return (int) (Math.pow(10, digit - 1) * 9);
    }

    /**
     * 在 digit 位数组成的字符串中，第 index 个数
     *
     */
    private int getBeginNumberOfPlace(int digit) {
        if (digit == 1) {
            return 0;
        }
        return (int) Math.pow(10, digit - 1);
    }

}
