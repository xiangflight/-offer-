package coding_interviews.swordoffer;

import java.util.BitSet;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-15 17:54
 *
 * 第一个只出现一次的字符
 *
 */

public class Solution38 {

    /**
     * 题目：在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，
     *      则输出它的位置
     *
     * @param str 字符串
     * @return 第一个只出现一次字符的索引
     */
    public int firstNotRepeatingChar1(String str) {
        if (str == null) {
            throw new RuntimeException("String should not be null");
        }
        // 使用整型数组代替Map
        int[] cnt = new int[256];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i)]++;
        }
        for (int j = 0; j < str.length(); j++) {
            if (cnt[str.charAt(j)] == 1) {
                return j;
            }
        }
        return -1;
    }

    /**
     * 采用bitmap的思路做
     *
     * @param str 字符串
     * @return 第一个只出现一次的字符的索引
     */
    public int firstNotRepeatingChar2(String str) {
        BitSet bs1 = new BitSet(256);
        BitSet bs2 = new BitSet(256);
        for (char c: str.toCharArray()) {
            // 一次没出现过，在bs1中标记下
            if (!bs1.get(c) && !bs2.get(c)) {
                bs1.set(c);
            } else if (bs1.get(c) && !bs2.get(c)) {
                // 出现过1次，在bs2中标记下
                bs2.set(c);
            }
        }
        // 上面循环结束后，分为3种情况：
        // bs1.get(c) == true，出现一次
        // bs2.get(c) == true，出现两次或以上
        // bs1.get(c) == false, bs2.get(c) == false，则出现0次
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (bs1.get(c) && !bs2.get(c)) {
                return i;
            }
        }
        return - 1;
    }

}
